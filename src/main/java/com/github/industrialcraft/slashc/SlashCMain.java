package com.github.industrialcraft.slashc;

import com.github.industrialcraft.slashc.antlr.slashLexer;
import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;
import com.github.industrialcraft.slashc.util.ASTPrinter;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;

public class SlashCMain {
    public static void main(String[] args) throws Exception {
        Compiler compiler = new Compiler();
        compiler.addSource(new File("main.sl"));
        compiler.compile();
    }
}
