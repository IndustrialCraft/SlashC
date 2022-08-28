package com.github.industrialcraft.slashc.typingClassMembers;

import com.github.industrialcraft.slashc.parsing.ParsedAttribute;
import com.github.industrialcraft.slashc.parsing.ParsedData;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typeCreation.TypedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EVisibility;

public class TypedAttribute {
    public final EVisibility visibility;
    public final TypedType type;
    public final ParsedData<String> name;
    public TypedAttribute(EVisibility visibility, TypedType type, ParsedData<String> name) {
        this.visibility = visibility;
        this.type = type;
        this.name = name;
    }
    public TypedAttribute(ParsedAttribute parsedAttribute, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        this.visibility = parsedAttribute.visibility;
        this.name = parsedAttribute.name;
        this.type = parsedAttribute.type.toTyped(typeStorage, importList, compilationOutput);
    }
}
