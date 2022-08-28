package com.github.industrialcraft.slashc.typeCreation;

import com.github.industrialcraft.slashc.parsing.ParsedData;
import com.github.industrialcraft.slashc.util.CompilationOutput;

import java.util.ArrayList;

public class ImportList {
    public final ArrayList<String> imports;
    public ImportList() {
        this.imports = new ArrayList<>();
    }
    public boolean addImport(ParsedData<String> newImport, CompilationOutput compilationOutput){
        if(newImport.data.isBlank())
            return false;
        String[] split = newImport.data.split("\\.");
        String last = split[split.length-1];
        for(String import_ : imports){
            String[] split2 = import_.split("\\.");
            String last2 = split2[split2.length-1];
            if(last.equals(last2)){
                compilationOutput.addError(newImport, "Import ambiguity: " + newImport.data + " clashes with " + import_);
                return false;
            }
        }
        imports.add(newImport.data);
        return true;
    }
    public String resolve(String type){
        for(String import_ : imports){
            String[] split = import_.split("\\.");
            String last = split[split.length-1];
            if(last.equals(type))
                return import_;
        }
        return type;
    }
}
