package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;

public abstract class ParsedLiteral {
    ParsedData data;
    public ParsedLiteral(ParsedData data) {
        this.data = data;
    }
    public static ParsedLiteral fromParsed(slashParser.LiteralContext literalContext, CompilationOutput compilationOutput){
        ParsedData parsedData = ParsedData.fromParserRuleContent(literalContext);
        try {
            if (literalContext instanceof slashParser.IntLiteralContext intLiteralContext) {
                return new ParsedIntLiteral(parsedData, Integer.parseInt(intLiteralContext.getText()));
            }
            if (literalContext instanceof slashParser.FloatLiteralContext floatLiteralContext) {
                return new ParsedFloatLiteral(parsedData, Double.parseDouble(floatLiteralContext.getText()));
            }
            if (literalContext instanceof slashParser.StringLiteralContext stringLiteralContext) {
                return new ParsedStringLiteral(parsedData, stringLiteralContext.getText());
            }
        } catch (Exception e){
            compilationOutput.addError(parsedData, "Error parsing literal: " + e.getMessage());
        }
        return null;
    }
    public static class ParsedIntLiteral extends ParsedLiteral {
        public final long value;
        public ParsedIntLiteral(ParsedData parsedData, long value) {
            super(parsedData);
            this.value = value;
        }
    }
    public static class ParsedFloatLiteral extends ParsedLiteral{
        public final double value;
        public ParsedFloatLiteral(ParsedData parsedData, double value) {
            super(parsedData);
            this.value = value;
        }
    }
    public static class ParsedStringLiteral extends ParsedLiteral{
        public final String value;
        public ParsedStringLiteral(ParsedData parsedData, String value) {
            super(parsedData);
            this.value = value;
        }
    }
}
