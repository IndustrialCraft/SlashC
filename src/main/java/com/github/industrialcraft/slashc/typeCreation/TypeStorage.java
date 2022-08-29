package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;

import java.util.ArrayList;

public class TypeStorage {
    public static final BoolPrimitiveType BOOL_PRIMITIVE = new BoolPrimitiveType();
    public static final IntPrimitiveType INT_PRIMITIVE = new IntPrimitiveType();
    public static final VoidType VOID_PRIMITIVE = new VoidType();

    private final ArrayList<DataType> types;
    public TypeStorage() {
        this.types = new ArrayList<>();
        this.add(BOOL_PRIMITIVE);
        this.add(VOID_PRIMITIVE);
        this.add(INT_PRIMITIVE);
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
