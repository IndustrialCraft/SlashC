package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EVisibility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ParsedSourceFile {
    public final ParsedData<String> packageName;
    public final ParsedData<String> className;
    public final List<ParsedAttribute> attributes;
    public final List<ParsedMethod> methods;
    public final ImportList importList;
    public final File file;
    public ParsedSourceFile(File file, slashParser.Source_fileContext sourceFileContext, CompilationOutput compilationOutput) {
        this.file = file;
        this.packageName = ParsedData.fromParserRuleContent(sourceFileContext.package_statement().dot_id());
        this.importList = new ImportList();
        sourceFileContext.import_statement().stream().map(import_statementContext -> ParsedData.fromParserRuleContent(import_statementContext.dot_id())).forEach(stringParsedData -> importList.addImport(stringParsedData, compilationOutput));
        this.className = ParsedData.fromTerminal(sourceFileContext.ID());
        this.attributes = new ArrayList<>();
        this.methods = new ArrayList<>();
        for(slashParser.Class_memberContext memberContext : sourceFileContext.class_member()){
            if(memberContext.class_attribute() != null)
                this.attributes.add(new ParsedAttribute(memberContext.class_attribute(), EVisibility.PROTECTED, compilationOutput));
            if(memberContext.class_method() != null)
                this.methods.add(new ParsedMethod(memberContext.class_method(), compilationOutput, EVisibility.PUBLIC));
        }
    }
}
