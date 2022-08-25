package com.github.industrialcraft.slashc;

import com.github.industrialcraft.slashc.antlr.slashLexer;
import com.github.industrialcraft.slashc.antlr.slashParser;
import com.github.industrialcraft.slashc.codegen.TupleGenerator;
import com.github.industrialcraft.slashc.util.TupleTest;
import org.objectweb.asm.Type;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

public class SlashCMain {
    public static void main(String[] args) throws Exception {
        CharStream stream = new ANTLRInputStream("package mmm::ahoj;import lol::ahoj;import ahoj::lol;class AAA{}");
        slashLexer lexer  = new slashLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        slashParser parser = new slashParser(tokenStream);
        ParseTree tree = parser.source_file();

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
