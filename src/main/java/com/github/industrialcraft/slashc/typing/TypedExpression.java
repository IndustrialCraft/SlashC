package com.github.industrialcraft.slashc.typing;

import com.github.industrialcraft.slashc.parsing.ParsedExpression;
import com.github.industrialcraft.slashc.parsing.ParsedLiteral;
import com.github.industrialcraft.slashc.typeCreation.DataType;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typingClassMembers.TypedNamedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import com.github.industrialcraft.slashc.util.EBiOperation;
import com.github.industrialcraft.slashc.util.ITypedNamedTypeProvider;

public class TypedExpression {
    public final DataType returnType;
    public TypedExpression(DataType returnType) {
        this.returnType = returnType;
    }
    public static TypedExpression fromParsed(ParsedExpression parsedExpression, ITypedNamedTypeProvider varProvider, TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        if(parsedExpression instanceof ParsedExpression.ParsedLiteralExpression literalExpression){
            if(literalExpression.parsedLiteral instanceof ParsedLiteral.ParsedBoolLiteral){
                return new TypedLiteralExpression(TypeStorage.BOOL_PRIMITIVE, literalExpression.parsedLiteral);
            }
            if(literalExpression.parsedLiteral instanceof ParsedLiteral.ParsedIntLiteral){
                return new TypedLiteralExpression(TypeStorage.INT_PRIMITIVE, literalExpression.parsedLiteral);
            }
            throw new IllegalStateException("Unimplemented type");
        }
        if(parsedExpression instanceof ParsedExpression.ParsedIDExpression idExpression){
            TypedNamedType type = varProvider.resolveTypeFromName(idExpression.id);
            if(type == null){
                compilationOutput.addError(idExpression.parsedData, "Couldnt find id " + idExpression.id + " in scope");
                return null;
            }
            return new TypedIDExpression(type.type.type.data, type);
        }
        if(parsedExpression instanceof ParsedExpression.ParsedBiOperationExpression biOperationExpression){
            TypedExpression first = TypedExpression.fromParsed(biOperationExpression.first, varProvider, typeStorage, importList, compilationOutput);
            TypedExpression second = TypedExpression.fromParsed(biOperationExpression.second, varProvider, typeStorage, importList, compilationOutput);
            if(first==null||second==null)
                return null;
            DataType result = first.returnType.getForBiOperation(biOperationExpression.operation, second.returnType);
            if(result == null){
                compilationOutput.addError(biOperationExpression.parsedData, "Cannot use operator " + biOperationExpression.operation + " on " + first.returnType.name + "&" + second.returnType.name);
                return null;
            }
            return new TypedBiOperationExpression(result, first, second, biOperationExpression.operation);
        }
        return null;
    }
    public static class TypedLiteralExpression extends TypedExpression{
        public final ParsedLiteral value;
        public TypedLiteralExpression(DataType returnType, ParsedLiteral value) {
            super(returnType);
            this.value = value;
        }
    }
    public static class TypedIDExpression extends TypedExpression{
        public final TypedNamedType namedType;
        public TypedIDExpression(DataType returnType, TypedNamedType namedType) {
            super(returnType);
            this.namedType = namedType;
        }
    }
    public static class TypedBiOperationExpression extends TypedExpression{
        public final TypedExpression first;
        public final TypedExpression second;
        public final EBiOperation operation;
        public TypedBiOperationExpression(DataType returnType, TypedExpression first, TypedExpression second, EBiOperation operation) {
            super(returnType);
            this.first = first;
            this.second = second;
            this.operation = operation;
        }
    }
}
