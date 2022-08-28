package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.util.CompilationOutput;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ParsingErrorLogger extends BaseErrorListener {
    public final CompilationOutput compilationOutput;
    public ParsingErrorLogger(CompilationOutput compilationOutput) {
        this.compilationOutput = compilationOutput;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        compilationOutput.addError(ParsedData.fromSymbol(null, (Token)offendingSymbol), "Syntax error: " + msg);
    }
}
