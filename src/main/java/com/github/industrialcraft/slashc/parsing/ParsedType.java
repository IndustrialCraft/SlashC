package com.github.industrialcraft.slashc.parsing;

import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.typeCreation.DataType;
import com.github.industrialcraft.slashc.typeCreation.ImportList;
import com.github.industrialcraft.slashc.typeCreation.TypeStorage;
import com.github.industrialcraft.slashc.typeCreation.TypedType;
import com.github.industrialcraft.slashc.util.CompilationOutput;

public class ParsedType {
    public final ParsedData<String> type;
    public final ParsedData nullable;
    public final ParsedData modifiable;
    public ParsedType(slashParser.TypeContext typeContext) {
        this.type = typeContext.AUTO()!=null?ParsedData.fromSymbol(null, typeContext.AUTO().getSymbol()):ParsedData.fromParserRuleContent(typeContext.dot_id());
        this.nullable = typeContext.QMARK()!=null?ParsedData.fromSymbol(null, typeContext.QMARK().getSymbol()):null;
        this.modifiable = typeContext.HASH()!=null?ParsedData.fromSymbol(null, typeContext.HASH().getSymbol()):null;
    }
    public boolean isAuto(){
        return type.data == null;
    }
    public TypedType toTyped(TypeStorage typeStorage, ImportList importList, CompilationOutput compilationOutput){
        DataType dataType = typeStorage.getType(this.type.data, importList);
        if(dataType == null){
            compilationOutput.addError(type, "Couldn't resolve type " + type.data);
            return null;
        }
        return new TypedType(type.copy(dataType), nullable, modifiable);
    }
}
