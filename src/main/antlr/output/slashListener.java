// Generated from slash.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link slashParser}.
 */
public interface slashListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link slashParser#source_file}.
	 * @param ctx the parse tree
	 */
	void enterSource_file(slashParser.Source_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#source_file}.
	 * @param ctx the parse tree
	 */
	void exitSource_file(slashParser.Source_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#class_content}.
	 * @param ctx the parse tree
	 */
	void enterClass_content(slashParser.Class_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#class_content}.
	 * @param ctx the parse tree
	 */
	void exitClass_content(slashParser.Class_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#package_statement}.
	 * @param ctx the parse tree
	 */
	void enterPackage_statement(slashParser.Package_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#package_statement}.
	 * @param ctx the parse tree
	 */
	void exitPackage_statement(slashParser.Package_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(slashParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(slashParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#dcol_id}.
	 * @param ctx the parse tree
	 */
	void enterDcol_id(slashParser.Dcol_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#dcol_id}.
	 * @param ctx the parse tree
	 */
	void exitDcol_id(slashParser.Dcol_idContext ctx);
}