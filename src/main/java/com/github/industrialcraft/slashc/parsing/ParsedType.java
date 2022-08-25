package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;

public class ParsedType {
    public final ParsedData<String> type;
    public final ParsedData nullable;
    public final ParsedData modifiable;
    public ParsedType(slashParser.TypeContext typeContext) {
        this.type = typeContext.AUTO()!=null?ParsedData.fromSymbol(null, typeContext.AUTO().getSymbol()):ParsedData.fromParserRuleContent(typeContext.dot_id());
        this.nullable = typeContext.QMARK()!=null?ParsedData.fromSymbol(null, typeContext.QMARK().getSymbol()):null;
        this.modifiable = typeContext.HASH()!=null?ParsedData.fromSymbol(null, typeContext.HASH().getSymbol()):null;
    }
}
