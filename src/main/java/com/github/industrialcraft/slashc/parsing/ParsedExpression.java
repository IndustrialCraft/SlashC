package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EBiOperation;
import com.github.industrialcraft.slashc.util.ESingleOperation;

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
            ParsedExpression[] parameters = new ParsedExpression[exprs.size()-1];
            for(int i = 0;i < exprs.size()-1;i++){
                parameters[i] = fromParsed(exprs.get(i+1), compilationOutput);
            }
            return new ParsedCallExpression(parsedData, fromParsed(exprs.get(0), compilationOutput), parameters);
        }
        if(exprContext instanceof slashParser.AccessExprContext accessExprContext){
            return new ParsedAccessExpression(parsedData, fromParsed(accessExprContext.expr(), compilationOutput), accessExprContext.ID().getText(), accessExprContext.QMARK()!=null);
        }
        if(exprContext instanceof slashParser.AccessArrExprContext accessArrExprContext){
            return new ParsedArrayAccessExpression(parsedData, fromParsed(accessArrExprContext.expr(0), compilationOutput), fromParsed(accessArrExprContext.expr(1), compilationOutput), accessArrExprContext.QMARK()!=null);
        }
        if(exprContext instanceof slashParser.OrElseExprContext orElseExprContext){
            return new ParsedOrElseExpression(parsedData, fromParsed(orElseExprContext.expr(0), compilationOutput), fromParsed(orElseExprContext.expr(1), compilationOutput));
        }
        if(exprContext instanceof slashParser.NullCheckExprContext nullCheckExprContext){
            return new ParsedNullcheckExpression(parsedData, fromParsed(nullCheckExprContext.expr(0), compilationOutput), nullCheckExprContext.expr().size()>1?fromParsed(nullCheckExprContext.expr(1), compilationOutput):null);
        }
        if(exprContext instanceof slashParser.CastExprContext castExprContext){
            return new ParsedCastExpression(parsedData, fromParsed(castExprContext.expr(), compilationOutput), castExprContext.DYN_CAST()!=null, new ParsedType(castExprContext.type()));
        }
        if(exprContext instanceof slashParser.RangeExprContext rangeExprContext){
            return new ParsedRangeExpression(parsedData, fromParsed(rangeExprContext.expr(0), compilationOutput), fromParsed(rangeExprContext.expr(1), compilationOutput));
        }
        if(exprContext instanceof slashParser.BiOperationExprContext biOperationExprContext){
            return new ParsedBiOperationExpression(parsedData, fromParsed(biOperationExprContext.expr(0), compilationOutput), EBiOperation.fromParsedOr(biOperationExprContext.biOperation(), null), fromParsed(biOperationExprContext.expr(1), compilationOutput));
        }
        if(exprContext instanceof slashParser.SingleOperationExprContext singleOperationExprContext){
            return new ParsedSingleOperationExpression(parsedData, fromParsed(singleOperationExprContext.expr(), compilationOutput), ESingleOperation.fromParsedOrElse(singleOperationExprContext.singleOperation(), null));
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
    public static class ParsedAccessExpression extends ParsedExpression{
        public final ParsedExpression target;
        public final String field;
        public final boolean nullcheck;
        public ParsedAccessExpression(ParsedData parsedData, ParsedExpression target, String field, boolean nullcheck) {
            super(parsedData);
            this.target = target;
            this.field = field;
            this.nullcheck = nullcheck;
        }
    }
    public static class ParsedArrayAccessExpression extends ParsedExpression{
        public final ParsedExpression target;
        public final ParsedExpression at;
        public final boolean nullcheck;
        public ParsedArrayAccessExpression(ParsedData parsedData, ParsedExpression target, ParsedExpression at, boolean nullcheck) {
            super(parsedData);
            this.target = target;
            this.at = at;
            this.nullcheck = nullcheck;
        }
    }
    public static class ParsedOrElseExpression extends ParsedExpression{
        public final ParsedExpression target;
        public final ParsedExpression orElse;
        public ParsedOrElseExpression(ParsedData parsedData, ParsedExpression target, ParsedExpression orElse) {
            super(parsedData);
            this.target = target;
            this.orElse = orElse;
        }
    }
    public static class ParsedNullcheckExpression extends ParsedExpression{
        public final ParsedExpression target;
        public final ParsedExpression thrown;//nullable
        public ParsedNullcheckExpression(ParsedData parsedData, ParsedExpression target, ParsedExpression thrown) {
            super(parsedData);
            this.target = target;
            this.thrown = thrown;
        }
    }
    public static class ParsedCastExpression extends ParsedExpression{
        public final ParsedExpression target;
        public final boolean dynamic;
        public final ParsedType type;
        public ParsedCastExpression(ParsedData parsedData, ParsedExpression target, boolean dynamic, ParsedType type) {
            super(parsedData);
            this.target = target;
            this.dynamic = dynamic;
            this.type = type;
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
        public final ParsedExpression[] parameters;
        public ParsedCallExpression(ParsedData parsedData, ParsedExpression expression, ParsedExpression[] parameters) {
            super(parsedData);
            this.expression = expression;
            this.parameters = parameters;
        }
    }
    public static class ParsedRangeExpression extends ParsedExpression{
        public final ParsedExpression first;
        public final ParsedExpression second;
        public ParsedRangeExpression(ParsedData parsedData, ParsedExpression first, ParsedExpression second) {
            super(parsedData);
            this.first = first;
            this.second = second;
        }
    }
    public static class ParsedBiOperationExpression extends ParsedExpression{
        public final ParsedExpression first;
        public final EBiOperation operation;
        public final ParsedExpression second;
        public ParsedBiOperationExpression(ParsedData parsedData, ParsedExpression first, EBiOperation operation, ParsedExpression second) {
            super(parsedData);
            this.first = first;
            this.operation = operation;
            this.second = second;
        }
    }
    public static class ParsedSingleOperationExpression extends ParsedExpression{
        public final ParsedExpression expression;
        public final ESingleOperation operation;
        public ParsedSingleOperationExpression(ParsedData parsedData, ParsedExpression expression, ESingleOperation operation) {
            super(parsedData);
            this.expression = expression;
            this.operation = operation;
        }
    }
}
