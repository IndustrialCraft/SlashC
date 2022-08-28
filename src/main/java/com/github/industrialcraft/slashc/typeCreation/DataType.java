package com.github.industrialcraft.slashc.typeCreation;

public abstract class DataType {
    public final String packageName;
    public final String name;
    public DataType(String packageName, String name) {
        this.packageName = packageName;
        this.name = name;
    }
}
