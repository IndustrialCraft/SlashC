package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.parsing.ParsedData;
import com.github.industrialcraft.slashc.parsing.ParsedInstruction;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typeCreation.TypedType;
import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

import java.util.Arrays;
import java.util.List;

public class TypedInstruction {
    public static TypedInstruction fromParsed(ITypedNamedTypeProvider typedNameProvider, ParsedInstruction instruction, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        if(instruction instanceof ParsedInstruction.ParsedCodeBlockInstruction codeBlockInstruction){
            return new TypedCodeBlockInstruction(new TypedCodeBlock(typedNameProvider, codeBlockInstruction.codeBlock, typeStorage, importList, compilationOutput));
        }
        if(instruction instanceof ParsedInstruction.ParsedExprInstruction exprInstruction){
            return new TypedExpressionInstruction(TypedExpression.fromParsed(exprInstruction.expression, typedNameProvider, typeStorage, importList, compilationOutput));
        }
        if(instruction instanceof ParsedInstruction.ParsedVariableInstruction typedVariableInstruction){
            //todo: make readable
            TypedType type = null;
            if(typedVariableInstruction.type != null)
                type = typedVariableInstruction.type.toTyped(typeStorage, importList, compilationOutput);
            TypedExpression expression = null;
            if(typedVariableInstruction.expression != null)
                expression = TypedExpression.fromParsed(typedVariableInstruction.expression, typedNameProvider, typeStorage, importList, compilationOutput);
            if(type==null&&expression==null){
                compilationOutput.addError(typedVariableInstruction.parsedData, "variable instruction must at least declare or assign");
                return null;
            }
            TypedNamedType namedType = null;
            if(type!=null)
                namedType = new TypedNamedType(type, typedVariableInstruction.id);
            else
                namedType = typedNameProvider.resolveTypeFromName(typedVariableInstruction.id.data);
            if(namedType == null){
                compilationOutput.addError(typedVariableInstruction.parsedData, "Couldnt find id " + typedVariableInstruction.id.data + " in scope");
                return null;
            }
            if(expression != null && namedType.type.type.data != expression.returnType){
                compilationOutput.addError(typedVariableInstruction.parsedData, "Type " + expression.returnType.name + " cannot be assigned to type " + namedType.type.type.data.name);
                return null;
            }
            return new TypedVariableInstruction(namedType, type!=null, expression);
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
        if(instruction instanceof ParsedInstruction.ParsedForInstruction forInstruction){
            return new TypedForInstruction(forInstruction.type.toTyped(typeStorage, importList, compilationOutput), forInstruction.varName, TypedExpression.fromParsed(forInstruction.expression, typedNameProvider, typeStorage, importList, compilationOutput), TypedInstruction.fromParsed(typedNameProvider, forInstruction.instruction, typeStorage, importList, compilationOutput), typedNameProvider);
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
        public final TypedNamedType namedType;
        public final boolean declaring;
        public final TypedExpression expression;//nullable
        public TypedVariableInstruction(TypedNamedType namedType, boolean declaring, TypedExpression expression) {
            this.namedType = namedType;
            this.declaring = declaring;
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
    public static class TypedForInstruction extends TypedInstruction implements ITypedNamedTypeProvider{
        public final TypedType type;
        public final ParsedData<String> name;
        public final TypedExpression expression;
        public final TypedInstruction instruction;
        private final ITypedNamedTypeProvider parentNamedTypeProvider;
        private final List<TypedNamedType> innerType;
        public TypedForInstruction(TypedType type, ParsedData<String> name, TypedExpression expression, TypedInstruction instruction, ITypedNamedTypeProvider parentNamedTypeProvider) {
            this.type = type;
            this.name = name;
            this.expression = expression;
            this.instruction = instruction;
            this.parentNamedTypeProvider = parentNamedTypeProvider;
            this.innerType = Arrays.asList(new TypedNamedType(type, name));
        }
        @Override
        public List<TypedNamedType> getNamedTypes() {
            return this.innerType;
        }
        @Override
        public ITypedNamedTypeProvider getNamedTypesParent() {
            return this.parentNamedTypeProvider;
        }
    }
}
