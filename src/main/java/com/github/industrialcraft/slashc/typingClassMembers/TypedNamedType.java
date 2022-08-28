package com.github.industrialcraft.slashc.typingClassMembers;

import com.github.industrialcraft.slashc.parsing.ParsedData;
import com.github.industrialcraft.slashc.typeCreation.TypedType;

public class TypedNamedType {
    public final TypedType type;
    public final ParsedData<String> name;
    public TypedNamedType(TypedType type, ParsedData<String> name) {
        this.type = type;
        this.name = name;
    }
}
