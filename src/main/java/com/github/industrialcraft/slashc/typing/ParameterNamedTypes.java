package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ParameterNamedTypes implements ITypedNamedTypeProvider {
    private final List<TypedNamedType> types;
    public ParameterNamedTypes(List<TypedNamedType> types) {
        this.types = Collections.unmodifiableList(types);
    }
    @Override
    public List<TypedNamedType> getNamedTypes() {
        return types;
    }
    @Override
    public ITypedNamedTypeProvider getNamedTypesParent() {
        return null;
    }
}
