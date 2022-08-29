package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.util.EBiOperation;

public class BoolPrimitiveType extends DataType{
    public BoolPrimitiveType() {
        super(null, "bool");
    }

    @Override
    public DataType getForBiOperation(EBiOperation operation, DataType type) {
        if(type != this)
            return null;
        if(operation==EBiOperation.DOR || operation==EBiOperation.DAND||operation==EBiOperation.XOR||operation==EBiOperation.SAME||operation==EBiOperation.NOT_SAME||operation==EBiOperation.EQUALS||operation==EBiOperation.NOT_EQUALS)
            return this;
        return null;
    }
}
