package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;

import java.util.List;

public interface ITypedNamedTypeProvider {
    List<TypedNamedType> getNamedTypes();
    ITypedNamedTypeProvider getNamedTypesParent();
    default TypedNamedType resolveTypeFromName(String name){
        for(TypedNamedType typedNamedType : getNamedTypes()){
            if(typedNamedType.name.data.equals(name))
                return typedNamedType;
        }
        if(getNamedTypesParent() != null)
            return getNamedTypesParent().resolveTypeFromName(name);
        return null;
    }
}
