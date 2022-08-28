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
        if(instructionContext instanceof slashParser.WhileInstContext whileInstContext){
            return new ParsedWhileInstruction(parsedData, ParsedExpression.fromParsed(whileInstContext.expr(), compilationOutput), fromParsed(whileInstContext.instruction(), compilationOutput));
        }
        if(instructionContext instanceof slashParser.LoopInstContext loopInstContext){
            return new ParsedLoopInstruction(parsedData, ParsedInstruction.fromParsed(loopInstContext.instruction(), compilationOutput));
        }
        if(instructionContext instanceof slashParser.ForInstContext forInstContext){
            //todo:type check
            return new ParsedForInstruction(parsedData, new ParsedType(forInstContext.type()), ParsedData.fromTerminal(forInstContext.ID()), ParsedExpression.fromParsed(forInstContext.expr(), compilationOutput), fromParsed(forInstContext.instruction(), compilationOutput));
        }
        if(instructionContext instanceof slashParser.ReturnInstContext returnInstContext){
            return new ParsedReturnInstruction(parsedData, returnInstContext.expr()!=null?ParsedExpression.fromParsed(returnInstContext.expr(), compilationOutput):null);
        }
        if(instructionContext instanceof slashParser.VariableInstContext variableInstContext){
            ParsedType type = variableInstContext.type()!=null?new ParsedType(variableInstContext.type()):null;
            ParsedExpression expression = variableInstContext.expr()!=null?ParsedExpression.fromParsed(variableInstContext.expr(), compilationOutput):null;
            if(type == null && expression == null){
                compilationOutput.addError(parsedData, "must at least define or assign");
                return null;
            }
            return new ParsedVariableInstruction(parsedData, new ParsedType(variableInstContext.type()), ParsedData.fromTerminal(variableInstContext.ID()), ParsedExpression.fromParsed(variableInstContext.expr(), compilationOutput));
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
    public static class ParsedWhileInstruction extends ParsedInstruction{
        public final ParsedExpression condition;
        public final ParsedInstruction instruction;
        public ParsedWhileInstruction(ParsedData parsedData, ParsedExpression condition, ParsedInstruction instruction) {
            super(parsedData);
            this.condition = condition;
            this.instruction = instruction;
        }
    }
    public static class ParsedLoopInstruction extends ParsedInstruction{
        public final ParsedInstruction instruction;
        public ParsedLoopInstruction(ParsedData parsedData, ParsedInstruction instruction) {
            super(parsedData);
            this.instruction = instruction;
        }
    }
    public static class ParsedForInstruction extends ParsedInstruction{
        public final ParsedType type;
        public final ParsedData<String> varName;
        public final ParsedExpression expression;
        public final ParsedInstruction instruction;
        public ParsedForInstruction(ParsedData parsedData, ParsedType type, ParsedData<String> varName, ParsedExpression expression, ParsedInstruction instruction) {
            super(parsedData);
            this.type = type;
            this.varName = varName;
            this.expression = expression;
            this.instruction = instruction;
        }
    }
    public static class ParsedReturnInstruction extends ParsedInstruction{
        public final ParsedExpression expression;//nullable
        public ParsedReturnInstruction(ParsedData parsedData, ParsedExpression expression) {
            super(parsedData);
            this.expression = expression;
        }
    }
    public static class ParsedVariableInstruction extends ParsedInstruction{
        public final ParsedType type;//nullable
        public final ParsedData<String> id;
        public final ParsedExpression expression;//nullable
        public ParsedVariableInstruction(ParsedData parsedData, ParsedType type, ParsedData<String> id, ParsedExpression expression) {
            super(parsedData);
            this.type = type;
            this.id = id;
            this.expression = expression;
        }
    }
}
