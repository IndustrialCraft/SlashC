package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.parsing.ParsedAttribute;
import com.github.industrialcraft.slashc.parsing.ParsedMethod;
import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;
import com.github.industrialcraft.slashc.typingClassMembers.TypedAttribute;
import com.github.industrialcraft.slashc.typingClassMembers.TypedMethod;
import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;

import java.util.ArrayList;

public class ClassDataType extends DataType{
    public final ArrayList<TypedAttribute> attributes;
    public final ArrayList<TypedMethod> methods;
    public final ParsedSourceFile parsedSourceFile;
    public ClassDataType(ParsedSourceFile sourceFile) {
        super(sourceFile.packageName.data, sourceFile.className.data);
        this.attributes = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.parsedSourceFile = sourceFile;
    }
    public void typeMembers(TypeStorage typeStorage, CompilationOutput compilationOutput){
        for(ParsedAttribute attribute : parsedSourceFile.attributes){
            this.attributes.add(new TypedAttribute(attribute, typeStorage, parsedSourceFile.importList, compilationOutput));
        }
        for(ParsedMethod method : parsedSourceFile.methods){
            this.methods.add(new TypedMethod(method, typeStorage, parsedSourceFile.importList, compilationOutput));
        }
    }
    public void compile(TypeStorage typeStorage, CompilationOutput compilationOutput){
        for(TypedMethod method : this.methods){
            method.compile(typeStorage, parsedSourceFile.importList, compilationOutput);
        }
    }
}
