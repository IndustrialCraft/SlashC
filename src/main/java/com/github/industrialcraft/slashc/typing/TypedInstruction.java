package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.parsing.ParsedInstruction;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

public class TypedInstruction {
    public static TypedInstruction fromParsed(ITypedNamedTypeProvider typedNameProvider, ParsedInstruction instruction, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        if(instruction instanceof ParsedInstruction.ParsedCodeBlockInstruction codeBlockInstruction){
            return new TypedCodeBlockInstruction(new TypedCodeBlock(typedNameProvider, codeBlockInstruction.codeBlock, typeStorage, importList, compilationOutput));
        }
        return null;
    }
    public static class TypedCodeBlockInstruction extends TypedInstruction{
        public final TypedCodeBlock codeBlock;
        public TypedCodeBlockInstruction(TypedCodeBlock codeBlock) {
            this.codeBlock = codeBlock;
        }
    }
}
