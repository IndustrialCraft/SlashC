package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;

import java.util.List;

public abstract class ParsedExpression {
    public final ParsedData parsedData;
    public ParsedExpression(ParsedData parsedData) {
        this.parsedData = parsedData;
    }
    public static ParsedExpression fromParsed(slashParser.ExprContext exprContext, CompilationOutput compilationOutput){
        ParsedData parsedData = ParsedData.fromParserRuleContent(exprContext);
        if(exprContext instanceof slashParser.LiteralExprContext literalExprContext){
            return new ParsedLiteralExpression(parsedData, ParsedLiteral.fromParsed(literalExprContext.literal(), compilationOutput));
        }
        if(exprContext instanceof slashParser.IdExprContext idExprContext){
            return new ParsedIDExpression(parsedData, idExprContext.getText());
        }
        if(exprContext instanceof slashParser.EncapsulateExprContext encapsulateExprContext){
            return fromParsed(encapsulateExprContext.expr(), compilationOutput);
        }
        if(exprContext instanceof slashParser.CallExprContext callExprContext){
            List<slashParser.ExprContext> exprs = callExprContext.expr();
            ParsedExpression[] parameters = new ParsedExpression[exprs.size()-(callExprContext.DOT()!=null?1:0)];
            for(int i = (callExprContext.DOT()!=null?1:0);i < exprs.size();i++){
                parameters[i-(callExprContext.DOT()!=null?1:0)] = fromParsed(exprs.get(i), compilationOutput);
            }
            return new ParsedCallExpression(parsedData, callExprContext.DOT()!=null?ParsedExpression.fromParsed(exprs.get(0), compilationOutput):null, callExprContext.ID().getText(), parameters);
        }
        return null;
    }
    public static class ParsedLiteralExpression extends ParsedExpression{
        public final ParsedLiteral parsedLiteral;
        public ParsedLiteralExpression(ParsedData parsedData, ParsedLiteral parsedLiteral) {
            super(parsedData);
            this.parsedLiteral = parsedLiteral;
        }
    }
    public static class ParsedIDExpression extends ParsedExpression{
        public final String id;
        public ParsedIDExpression(ParsedData parsedData, String id) {
            super(parsedData);
            this.id = id;
        }
    }
    public static class ParsedCallExpression extends ParsedExpression{
        public final ParsedExpression expression;
        public final String methodName;
        public final ParsedExpression[] parameters;
        public ParsedCallExpression(ParsedData parsedData, ParsedExpression expression, String methodName, ParsedExpression[] parameters) {
            super(parsedData);
            this.expression = expression;
            this.methodName = methodName;
            this.parameters = parameters;
        }
    }
}
