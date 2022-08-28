package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.parsing.ParsedInstruction;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typeCreation.TypedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

public class TypedInstruction {
    public static TypedInstruction fromParsed(ITypedNamedTypeProvider typedNameProvider, ParsedInstruction instruction, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        if(instruction instanceof ParsedInstruction.ParsedCodeBlockInstruction codeBlockInstruction){
            return new TypedCodeBlockInstruction(new TypedCodeBlock(typedNameProvider, codeBlockInstruction.codeBlock, typeStorage, importList, compilationOutput));
        }
        if(instruction instanceof ParsedInstruction.ParsedExprInstruction exprInstruction){
            return new TypedExpressionInstruction(TypedExpression.fromParsed(exprInstruction.expression, typedNameProvider, typeStorage, importList, compilationOutput));
        }
        if(instruction instanceof ParsedInstruction.ParsedVariableInstruction typedVariableInstruction){
            TypedType type = null;
            if(typedVariableInstruction.type != null)
                type = typedVariableInstruction.type.toTyped(typeStorage, importList, compilationOutput);
            TypedExpression expression = null;
            if(typedVariableInstruction.expression != null)
                expression = TypedExpression.fromParsed(typedVariableInstruction.expression, typedNameProvider, typeStorage, importList, compilationOutput);
            return new TypedVariableInstruction(type, typedVariableInstruction.id, expression);
        }
        if(instruction instanceof ParsedInstruction.ParsedReturnInstruction returnInstruction){
            TypedExpression expression = null;
            if(returnInstruction.expression != null)
                expression = TypedExpression.fromParsed(returnInstruction.expression, typedNameProvider, typeStorage, importList, compilationOutput);
            return new TypedReturnInstruction(expression);
        }
        if(instruction instanceof ParsedInstruction.ParsedIfInstruction ifInstruction){
            return new TypedIfInstruction(TypedExpression.fromParsed(ifInstruction.condition, typedNameProvider, typeStorage, importList, compilationOutput), TypedInstruction.fromParsed(typedNameProvider, ifInstruction.instruction, typeStorage, importList, compilationOutput));
        }
        if(instruction instanceof ParsedInstruction.ParsedWhileInstruction whileInstruction){
            return new TypedWhileInstruction(TypedExpression.fromParsed(whileInstruction.condition, typedNameProvider, typeStorage, importList, compilationOutput), TypedInstruction.fromParsed(typedNameProvider, whileInstruction.instruction, typeStorage, importList, compilationOutput));
        }
        if(instruction instanceof ParsedInstruction.ParsedLoopInstruction loopInstruction){
            return new TypedLoopInstruction(TypedInstruction.fromParsed(typedNameProvider, loopInstruction.instruction, typeStorage, importList, compilationOutput));
        }
        return null;
    }
    public static class TypedCodeBlockInstruction extends TypedInstruction{
        public final TypedCodeBlock codeBlock;
        public TypedCodeBlockInstruction(TypedCodeBlock codeBlock) {
            this.codeBlock = codeBlock;
        }
    }
    public static class TypedExpressionInstruction extends TypedInstruction{
        public final TypedExpression expression;
        public TypedExpressionInstruction(TypedExpression expression) {
            this.expression = expression;
        }
    }
    public static class TypedVariableInstruction extends TypedInstruction{
        public final TypedType dataType;//nullable
        public final String name;
        public final TypedExpression expression;//nullable
        public TypedVariableInstruction(TypedType dataType, String name, TypedExpression expression) {
            this.dataType = dataType;
            this.name = name;
            this.expression = expression;
        }
    }
    public static class TypedReturnInstruction extends TypedInstruction{
        public final TypedExpression expression;//nullable
        public TypedReturnInstruction(TypedExpression expression) {
            this.expression = expression;
        }
    }
    public static class TypedIfInstruction extends TypedInstruction{
        public final TypedExpression condition;
        public final TypedInstruction instruction;
        public TypedIfInstruction(TypedExpression condition, TypedInstruction instruction) {
            this.condition = condition;
            this.instruction = instruction;
        }
    }
    public static class TypedWhileInstruction extends TypedInstruction{
        public final TypedExpression condition;
        public final TypedInstruction instruction;
        public TypedWhileInstruction(TypedExpression condition, TypedInstruction instruction) {
            this.condition = condition;
            this.instruction = instruction;
        }
    }
    public static class TypedLoopInstruction extends TypedInstruction{
        public final TypedInstruction instruction;
        public TypedLoopInstruction(TypedInstruction instruction) {
            this.instruction = instruction;
        }
    }
    public static class TypedForInstruction extends TypedInstruction{
        public final TypedType type;
        public final String name;
        public final TypedExpression expression;
        public final TypedInstruction instruction;
        public TypedForInstruction(TypedType type, String name, TypedExpression expression, TypedInstruction instruction) {
            this.type = type;
            this.name = name;
            this.expression = expression;
            this.instruction = instruction;
        }
    }
}
