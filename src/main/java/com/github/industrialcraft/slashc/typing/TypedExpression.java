package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.parsing.ParsedExpression;
import com.github.industrialcraft.slashc.typeCreation.DataType;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

public class TypedExpression {
    public final DataType returnType;
    public TypedExpression(DataType returnType) {
        this.returnType = returnType;
    }
    public static TypedExpression fromParsed(ParsedExpression parsedExpression, ITypedNamedTypeProvider varProvider, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){

    }
}
