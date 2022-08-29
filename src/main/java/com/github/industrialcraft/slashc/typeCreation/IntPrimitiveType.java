package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.util.EBiOperation;

public class IntPrimitiveType extends DataType{
    public IntPrimitiveType() {
        super(null, "int");
    }

    @Override
    public DataType getForBiOperation(EBiOperation operation, DataType type) {
        if(type != this)
            return null;
        if(operation==EBiOperation.EQUALS||operation==EBiOperation.NOT_EQUALS||operation==EBiOperation.SAME||operation==EBiOperation.NOT_SAME||operation==EBiOperation.CMP_GREA||operation==EBiOperation.CMP_GREA_EQ||operation==EBiOperation.CMP_LESS_EQ||operation==EBiOperation.CMP_LESS)
            return TypeStorage.BOOL_PRIMITIVE;
        if(operation==EBiOperation.PLUS||operation==EBiOperation.MINUS||operation==EBiOperation.MUL||operation==EBiOperation.DIV||operation==EBiOperation.MOD)
            return this;
        return null;
    }
}
