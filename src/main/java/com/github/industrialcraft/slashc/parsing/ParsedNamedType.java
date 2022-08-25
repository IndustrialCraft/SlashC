package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;

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
}
