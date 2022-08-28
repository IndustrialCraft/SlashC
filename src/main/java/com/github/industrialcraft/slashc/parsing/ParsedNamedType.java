package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;

public class ParsedNamedType {
    public final ParsedType type;
    public final ParsedData<String> name;
    public ParsedNamedType(ParsedType type, ParsedData<String> name) {
        this.type = type;
        this.name = name;
    }
    public ParsedNamedType(slashParser.Method_paramContext methodParamContext) {
        this.type = new ParsedType(methodParamContext.type());
        this.name = ParsedData.fromTerminal(methodParamContext.ID());
    }
    public TypedNamedType toTyped(TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        return new TypedNamedType(type.toTyped(typeStorage, importList, compilationOutput), name);
    }
}
