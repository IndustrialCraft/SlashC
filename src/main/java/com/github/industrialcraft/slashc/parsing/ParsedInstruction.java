package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;

public abstract class ParsedInstruction {
    public final ParsedData parsedData;
    public ParsedInstruction(ParsedData parsedData) {
        this.parsedData = parsedData;
    }
    public static ParsedInstruction fromParsed(slashParser.InstructionContext instructionContext, CompilationOutput compilationOutput){
        ParsedData parsedData = ParsedData.fromParserRuleContent(instructionContext);
        if(instructionContext instanceof slashParser.ExpressionInstContext expressionInstContext){
            return new ParsedExprInstruction(parsedData, ParsedExpression.fromParsed(expressionInstContext.expr(), compilationOutput));
        }
        if(instructionContext instanceof slashParser.CodeFrameInstContext codeFrameInstContext){
            return new ParsedCodeBlockInstruction(parsedData, new ParsedCodeBlock(codeFrameInstContext.code_frame(), compilationOutput));
        }
        if(instructionContext instanceof slashParser.IfInstContext ifInstContext){
            return new ParsedIfInstruction(parsedData, ParsedExpression.fromParsed(ifInstContext.expr(), compilationOutput), fromParsed(ifInstContext.instruction(), compilationOutput));
        }
        return null;
    }
    public static class ParsedExprInstruction extends ParsedInstruction{
        public final ParsedExpression expression;
        public ParsedExprInstruction(ParsedData parsedData, ParsedExpression expression) {
            super(parsedData);
            this.expression = expression;
        }
    }
    public static class ParsedCodeBlockInstruction extends ParsedInstruction{
        public final ParsedCodeBlock codeBlock;
        public ParsedCodeBlockInstruction(ParsedData parsedData, ParsedCodeBlock codeBlock) {
            super(parsedData);
            this.codeBlock = codeBlock;
        }
    }
    public static class ParsedIfInstruction extends ParsedInstruction{
        public final ParsedExpression condition;
        public final ParsedInstruction instruction;
        public ParsedIfInstruction(ParsedData parsedData, ParsedExpression condition, ParsedInstruction instruction) {
            super(parsedData);
            this.condition = condition;
            this.instruction = instruction;
        }
    }
}
