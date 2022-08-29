package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.parsing.ParsedCodeBlock;
import com.github.industrialcraft.slashc.parsing.ParsedInstruction;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

import java.util.ArrayList;
import java.util.List;

public class TypedCodeBlock implements ITypedNamedTypeProvider {
    public final ITypedNamedTypeProvider parentVarProvider;
    public final List<TypedNamedType> vars;
    public final List<TypedInstruction> instructions;
    public TypedCodeBlock(ITypedNamedTypeProvider parentVarProvider, ParsedCodeBlock parsedCodeBlock, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput) {
        this.parentVarProvider = parentVarProvider;
        this.vars = new ArrayList<>();
        this.instructions = new ArrayList<>();
        for(ParsedInstruction parsedInstruction : parsedCodeBlock.instructions){
            TypedInstruction instruction = TypedInstruction.fromParsed(this, parsedInstruction, typeStorage, importList, compilationOutput);
            this.instructions.add(instruction);
            if(instruction instanceof TypedInstruction.TypedVariableInstruction variableInstruction){
                if(variableInstruction.declaring)
                    vars.add(variableInstruction.namedType);
            }
        }
    }
    @Override
    public List<TypedNamedType> getNamedTypes() {
        return vars;
    }
    @Override
    public ITypedNamedTypeProvider getNamedTypesParent() {
        return parentVarProvider;
    }
}
