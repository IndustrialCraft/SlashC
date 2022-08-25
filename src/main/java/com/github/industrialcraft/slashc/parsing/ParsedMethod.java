package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EVisibility;

import java.util.List;
import java.util.stream.Collectors;

public class ParsedMethod {
    public final EVisibility visibility;
    public final ParsedType returnType;
    public final ParsedData<String> name;
    public final List<ParsedNamedType> parameters;
    public final ParsedCodeBlock codeBlock;
    public ParsedMethod(slashParser.Class_methodContext methodContext, CompilationOutput compilationOutput, EVisibility defaultVisibility){
        this.visibility = EVisibility.fromParsedOr(methodContext.visibility(), defaultVisibility);
        this.returnType = new ParsedType(methodContext.type());
        this.name = ParsedData.fromTerminal(methodContext.ID());
        this.parameters = methodContext.method_param().stream().map(method_paramContext -> new ParsedNamedType(method_paramContext)).collect(Collectors.toList());
        this.codeBlock = new ParsedCodeBlock(methodContext.code_frame(), compilationOutput);
    }
}
