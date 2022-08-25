package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.parsing.ParsedData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CompilationOutput {
    private final List<String> output;
    private File file;
    private boolean failed;
    public CompilationOutput(File file){
        this.output = new ArrayList<>();
        this.file = file;
        this.failed = false;
    }
    public void addError(ParsedData parsedData, String message){
        this.failed = true;
        output.add("[E]" + message + "-" + parsedData.line + ":" + parsedData.charLine + "\n");//todo: show preview
    }
    public void addWarning(ParsedData parsedData, String message){
        output.add("[W]" + message + "-" + parsedData.line + ":" + parsedData.charLine + "\n");//todo: show preview
    }
    public void print(){
        if(this.failed){
            System.out.println("Compilation of " + file.getName().replace(".sl","") + " failed");
            for(String out : output){
                System.out.println(out);
            }
        }
    }
}
