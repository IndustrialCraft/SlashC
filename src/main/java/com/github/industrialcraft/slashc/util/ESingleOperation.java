package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.antlr.slashParser;

public enum ESingleOperation {
    MINUS,
    NOT,
    TILDE;
    public static ESingleOperation fromParsedOrElse(slashParser.SingleOperationContext singleOperationContext, ESingleOperation orElse){
        if(singleOperationContext == null)
            return orElse;
        if(singleOperationContext.MINUS() != null)
            return MINUS;
        if(singleOperationContext.NOT() != null)
            return NOT;
        if(singleOperationContext.TILDE() != null)
            return TILDE;
        return orElse;
    }
}
