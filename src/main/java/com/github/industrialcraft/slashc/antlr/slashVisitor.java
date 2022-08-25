// Generated from /home/mmm/Desktop/IndustrialCraft/SlashC/src/main/antlr/slash.g4 by ANTLR 4.10.1
package com.github.industrialcraft.slashc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link slashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface slashVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link slashParser#source_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_file(slashParser.Source_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#class_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_content(slashParser.Class_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#package_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_statement(slashParser.Package_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(slashParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#dcol_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcol_id(slashParser.Dcol_idContext ctx);
}