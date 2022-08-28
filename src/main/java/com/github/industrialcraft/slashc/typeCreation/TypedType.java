package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.parsing.ParsedData;

public class TypedType {
    public final ParsedData<DataType> type;
    public final ParsedData nullable;
    public final ParsedData mutable;
    public TypedType(ParsedData<DataType> type, ParsedData nullable, ParsedData mutable) {
        this.type = type;
        this.nullable = nullable;
        this.mutable = mutable;
    }
}
