package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EVisibility;

public class ParsedAttribute {
    public final EVisibility visibility;
    public final ParsedType type;
    public final ParsedData<String> name;
    public ParsedAttribute(slashParser.Class_attributeContext attributeContext, EVisibility defaultVisibility, CompilationOutput compilationOutput) {
        this.visibility = EVisibility.fromParsedOr(attributeContext.visibility(), defaultVisibility);
        this.type = new ParsedType(attributeContext.type());
        this.name = ParsedData.fromTerminal(attributeContext.ID());
        if(type.isAuto()){
            compilationOutput.addError(type.type, "attribute cannot have auto type");
        }
    }
}
