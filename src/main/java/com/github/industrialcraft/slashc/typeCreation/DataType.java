package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.util.EBiOperation;

public abstract class DataType {
    public final String packageName;
    public final String name;
    public DataType(String packageName, String name) {
        this.packageName = packageName;
        this.name = name;
    }
    public DataType getForBiOperation(EBiOperation operation, DataType type){
        return null;
    }
}
