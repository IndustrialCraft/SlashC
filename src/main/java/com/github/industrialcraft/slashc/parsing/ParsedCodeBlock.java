package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;

import java.util.List;
import java.util.stream.Collectors;

public class ParsedCodeBlock {
    public final ParsedData parsedData;
    public final List<ParsedInstruction> instructions;
    public ParsedCodeBlock(slashParser.Code_frameContext frameContext, CompilationOutput compilationOutput) {
        this.parsedData = ParsedData.fromParserRuleContent(frameContext);
        this.instructions = frameContext.instruction().stream().map(instructionContext -> ParsedInstruction.fromParsed(instructionContext, compilationOutput)).collect(Collectors.toList());
    }
}
