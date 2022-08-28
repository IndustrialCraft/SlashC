package com.github.industrialcraft.slashc.util;

import com.github.industrialcraft.slashc.parsing.ParsedData;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompilationOutput {
    private final List<String> output;
    private File file;
    private boolean failed;
    private List<String> lines;
    public CompilationOutput(File file){
        this.output = new ArrayList<>();
        this.file = file;
        this.failed = false;
        this.lines = null;
    }
    public void addError(ParsedData parsedData, String message){
        ensureFileLoaded();
        this.failed = true;
        output.add(ConsoleColors.RED + "[E]" + message + ConsoleColors.CYAN + "-" + parsedData.line + ":" + parsedData.charLine + ConsoleColors.RESET);//todo: show preview
        output.add(showPreview(parsedData));
    }
    public void addWarning(ParsedData parsedData, String message){
        ensureFileLoaded();
        output.add(ConsoleColors.YELLOW + "[W]" + message + ConsoleColors.CYAN + "-" + parsedData.line + ":" + parsedData.charLine + ConsoleColors.RESET);//todo: show preview
        output.add(showPreview(parsedData));
    }
    public void print(){
        if(this.failed){
            System.out.println("Compilation of " + ConsoleColors.WHITE_BOLD + file.getName().replace(".sl","") + ConsoleColors.RESET + " failed");
            for(String out : output){
                System.out.println(out);
            }
        }
    }
    public boolean isFailed() {
        return failed;
    }

    private void ensureFileLoaded(){
        if(this.lines != null)
            return;
        try {
            this.lines = Files.lines(file.toPath()).collect(Collectors.toList());
        } catch (IOException e) {}//shouldnt happen
    }
    private String showPreview(ParsedData parsedData){
        String output = "";
        output = output + printLinePart(parsedData.line-2);
        output = output + highlight(printLinePart(parsedData.line-1), parsedData);
        output = output + printLinePart(parsedData.line);
        return output;
    }
    private String printLinePart(int line){
        if(line < 0 || line >= lines.size())
            return "";
        String text = lines.get(line);
        if(text != null)
            return text + "\n";
        return "";
    }
    private String highlight(String input, ParsedData parsedData){
        return input.substring(0, parsedData.charLine) + ConsoleColors.WHITE_UNDERLINED + input.substring(parsedData.charLine, parsedData.charLine+parsedData.length+1)+ConsoleColors.RESET+input.substring(parsedData.charLine+parsedData.length+1);
    }
}
