package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;

import java.util.ArrayList;

public class TypeStorage {
    private final ArrayList<DataType> types;
    public TypeStorage() {
        this.types = new ArrayList<>();
    }
    public DataType getType(String type, ImportList importList){
        String full = importList.resolve(type);
        for(DataType type_ : types){
            if(((type_.packageName!=null?(type_.packageName+"."):"")+type_.name).equals(full))
                return type_;
        }
        return null;
    }
    public ClassDataType addSource(ParsedSourceFile sourceFile){
        ClassDataType classDataType = new ClassDataType(sourceFile);
        types.add(classDataType);
        return classDataType;
    }
    public void add(DataType dataType){
        types.add(dataType);
    }
}
