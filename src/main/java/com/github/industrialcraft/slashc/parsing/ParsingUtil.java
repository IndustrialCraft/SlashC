package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;

import java.util.stream.Collectors;

public class ParsingUtil {
    public static String dotIdToString(slashParser.Dot_idContext dotIdContext){
        return dotIdContext.ID().stream().map(terminalNode -> terminalNode.getText()).collect(Collectors.joining("."));
    }
}
