package com.github.industrialcraft.slashc.parsing;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParsedData<T> {
    public final T data;
    public final int line;
    public final int charLine;
    public final int length;
    public ParsedData(T data, int line, int charLine, int length) {
        this.data = data;
        this.line = line;
        this.charLine = charLine;
        this.length = length;
    }
    public <U> ParsedData copy(U newData){
        return new ParsedData<U>(newData, line, charLine, length);
    }
    public static <T> ParsedData<T> fromSymbol(T data, Token symbol){
        int length = symbol.getStopIndex()-symbol.getStartIndex();
        return new ParsedData<>(data, symbol.getLine(), symbol.getCharPositionInLine(), length);
    }
    public static ParsedData<String> fromTerminal(TerminalNode terminalNode){
        int length = terminalNode.getSymbol().getStopIndex()-terminalNode.getSymbol().getStartIndex();
        return new ParsedData<>(terminalNode.getText(), terminalNode.getSymbol().getLine(), terminalNode.getSymbol().getCharPositionInLine(), length);
    }
    public static ParsedData<String> fromParserRuleContent(ParserRuleContext parserRuleContext){
        int length = parserRuleContext.getStop().getStopIndex()-parserRuleContext.getStart().getStartIndex();
        return new ParsedData<>(parserRuleContext.getText(), parserRuleContext.getStart().getLine(), parserRuleContext.getStart().getCharPositionInLine(), length);
    }
}
