package com.github.industrialcraft.slashc;

import com.github.industrialcraft.slashc.antlr.slashLexer;
import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.parsing.ParsedSourceFile;
import com.github.industrialcraft.slashc.util.CompilationOutput;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;

public class SlashCMain {
    public static void main(String[] args) throws Exception {
        CharStream stream = CharStreams.fromFileName("main.sl");
        slashLexer lexer  = new slashLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        slashParser parser = new slashParser(tokenStream);
        var tree = parser.source_file();
        CompilationOutput compilationOutput = new CompilationOutput(new File("main.sl"));
        ParsedSourceFile sourceFile = new ParsedSourceFile(tree, compilationOutput);
        compilationOutput.print();
        System.out.println(sourceFile);


        //show AST in console
        System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //new TupleTest(1, 2f, "ahoj");
        //Files.write(Path.of("test.class"), TupleGenerator.create("tuple", "tuple", Type.BOOLEAN_TYPE, Type.getType(String.class), Type.INT_TYPE));
    }
}
