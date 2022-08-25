package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.antlr.slashParser;

public enum EVisibility {
    PRIVATE,
    PROTECTED,
    PUBLIC;
    public static EVisibility fromParsedOr(slashParser.VisibilityContext visibilityContext, EVisibility other){
        if(visibilityContext == null)
            return other;
        if(visibilityContext.PRIVATE() != null)
            return PRIVATE;
        if(visibilityContext.PROTECTED() != null)
            return PROTECTED;
        if(visibilityContext.PUBLIC() != null)
            return PUBLIC;
        return other;
    }
}
