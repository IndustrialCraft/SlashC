package com.github.industrialcraft.slashc.typingClassMembers;

import com.github.industrialcraft.slashc.parsing.ParsedCodeBlock;
import com.github.industrialcraft.slashc.parsing.ParsedData;
import com.github.industrialcraft.slashc.parsing.ParsedMethod;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typeCreation.TypedType;
import com.github.industrialcraft.slashc.typing.ParameterNamedTypes;
import com.github.industrialcraft.slashc.typing.TypedCodeBlock;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EVisibility;

import java.util.List;
import java.util.stream.Collectors;

public class TypedMethod {
    public final EVisibility visibility;
    public final TypedType returnType;
    public final ParsedData<String> name;
    public final List<TypedNamedType> parameterList;
    public final ParameterNamedTypes parameterNamedTypes;
    public final ParsedCodeBlock parsedCodeBlock;
    public TypedCodeBlock typedCodeBlock;
    public TypedMethod(EVisibility visibility, TypedType returnType, ParsedData<String> name, List<TypedNamedType> parameterList, ParsedCodeBlock parsedCodeBlock) {
        this.visibility = visibility;
        this.returnType = returnType;
        this.name = name;
        this.parameterList = parameterList;
        this.parameterNamedTypes = new ParameterNamedTypes(parameterList);
        this.parsedCodeBlock = parsedCodeBlock;
        this.typedCodeBlock = null;
    }
    public TypedMethod(ParsedMethod method, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        this.visibility = method.visibility;
        this.returnType = method.returnType.toTyped(typeStorage, importList, compilationOutput);
        this.name = method.name;
        this.parameterList = method.parameters.stream().map(parsedNamedType -> parsedNamedType.toTyped(typeStorage, importList, compilationOutput)).collect(Collectors.toList());
        this.parameterNamedTypes = new ParameterNamedTypes(parameterList);
        this.parsedCodeBlock = method.codeBlock;
        this.typedCodeBlock = null;
    }
    public void compile(TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        this.typedCodeBlock = new TypedCodeBlock(parameterNamedTypes, parsedCodeBlock, typeStorage, importList, compilationOutput);
    }
}
