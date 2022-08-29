package com.github.industrialcraft.slashc;

import com.github.industrialcraft.slashc.antlr.slashLexer;
import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;
import com.github.industrialcraft.slashc.parsing.ParsingErrorLogger;
import com.github.industrialcraft.slashc.typeCreation.BoolPrimitiveType;
import com.github.industrialcraft.slashc.typeCreation.ClassDataType;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typeCreation.VoidType;
import com.github.industrialcraft.slashc.util.ASTPrinter;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.*;
import java.util.ArrayList;

public class Compiler {
    private boolean didSourceParsingFail;
    private ArrayList<ParsedSourceFile> sourceFiles;
    public Compiler() {
        this.didSourceParsingFail = false;
        this.sourceFiles = new ArrayList<>();
    }
    public void addSource(File file) throws IOException {
        CompilationOutput compilationOutput = new CompilationOutput(file);
        CharStream stream = CharStreams.fromStream(new FileInputStream(file));
        slashLexer lexer  = new slashLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        slashParser parser = new slashParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParsingErrorLogger(compilationOutput));
        var tree = parser.source_file();
        if(compilationOutput.isFailed()){
            compilationOutput.print();
            this.didSourceParsingFail = true;
            return;
        }
        ParsedSourceFile sourceFile = new ParsedSourceFile(file, tree, compilationOutput);
        compilationOutput.print();
        if(compilationOutput.isFailed())
            this.didSourceParsingFail = true;
        this.sourceFiles.add(sourceFile);
    }
    public void compile(){
        if(didSourceParsingFail)
            return;
        TypeStorage typeStorage = new TypeStorage();
        ArrayList<ClassDataType> classes = new ArrayList<>();
        for(ParsedSourceFile sourceFile : sourceFiles){
            classes.add(typeStorage.addSource(sourceFile));
        }
        boolean didMemberCompilationFail = false;
        for(ClassDataType classDataType : classes){
            CompilationOutput compilationOutput = new CompilationOutput(classDataType.parsedSourceFile.file);
            classDataType.typeMembers(typeStorage, compilationOutput);
            compilationOutput.print();
            if(compilationOutput.isFailed())
                didMemberCompilationFail = true;
        }
        if(didMemberCompilationFail)
            return;
        boolean didCompilationFail = false;
        for(ClassDataType classDataType : classes){
            CompilationOutput compilationOutput = new CompilationOutput(classDataType.parsedSourceFile.file);
            classDataType.compile(typeStorage, compilationOutput);
            compilationOutput.print();
            if(compilationOutput.isFailed())
                didCompilationFail = true;
        }
        if(didCompilationFail)
            return;
        for(ClassDataType classDataType : classes){
            ASTPrinter.print(classDataType, classDataType.parsedSourceFile.file);
        }
    }
}
