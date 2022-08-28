package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.antlr.slashParser;

public enum EBiOperation {
    PLUS,
    MINUS,
    MUL,
    DIV,
    MOD,
    CMP_GREA,
    CMP_GREA_EQ,
    CMP_LESS,
    CMP_LESS_EQ,
    EQUALS,
    NOT_EQUALS,
    SAME,
    NOT_SAME,
    LSHIFT,
    RSHIFT,
    AND,
    OR,
    DAND,
    DOR,
    XOR;
    public static EBiOperation fromParsedOr(slashParser.BiOperationContext biOperationContext, EBiOperation orElse){
        if(biOperationContext == null)
            return orElse;
        if(biOperationContext.PLUS() != null)
            return PLUS;
        if(biOperationContext.MINUS() != null)
            return MINUS;
        if(biOperationContext.MUL() != null)
            return MUL;
        if(biOperationContext.DIV() != null)
            return DIV;
        if(biOperationContext.MOD() != null)
            return MOD;
        if(biOperationContext.CMP_GREA() != null)
            return CMP_GREA;
        if(biOperationContext.CMP_LESS() != null)
            return CMP_LESS;
        if(biOperationContext.CMP_GREA_EQ() != null)
            return CMP_GREA_EQ;
        if(biOperationContext.CMP_LESS_EQ() != null)
            return CMP_LESS_EQ;
        if(biOperationContext.EQUALS() != null)
            return EQUALS;
        if(biOperationContext.NOT_EQUALS() != null)
            return NOT_EQUALS;
        if(biOperationContext.SAME() != null)
            return SAME;
        if(biOperationContext.NOT_SAME() != null)
            return NOT_SAME;
        if(biOperationContext.LSHIFT() != null)
            return LSHIFT;
        if(biOperationContext.RSHIFT() != null)
            return RSHIFT;
        if(biOperationContext.AND() != null)
            return AND;
        if(biOperationContext.OR() != null)
            return OR;
        if(biOperationContext.DAND() != null)
            return DAND;
        if(biOperationContext.DOR() != null)
            return DOR;
        if(biOperationContext.XOR() != null)
            return XOR;
        return orElse;
    }
}
