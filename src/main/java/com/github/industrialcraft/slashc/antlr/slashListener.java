// Generated from /home/mmm/Plocha/IndustrialCraft/SlashC/src/main/antlr/slash.g4 by ANTLR 4.10.1
package com.github.industrialcraft.slashc.antlr;
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
	 * Enter a parse tree produced by {@link slashParser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(slashParser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(slashParser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#class_attribute}.
	 * @param ctx the parse tree
	 */
	void enterClass_attribute(slashParser.Class_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#class_attribute}.
	 * @param ctx the parse tree
	 */
	void exitClass_attribute(slashParser.Class_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#class_method}.
	 * @param ctx the parse tree
	 */
	void enterClass_method(slashParser.Class_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#class_method}.
	 * @param ctx the parse tree
	 */
	void exitClass_method(slashParser.Class_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#method_param}.
	 * @param ctx the parse tree
	 */
	void enterMethod_param(slashParser.Method_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#method_param}.
	 * @param ctx the parse tree
	 */
	void exitMethod_param(slashParser.Method_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#code_frame}.
	 * @param ctx the parse tree
	 */
	void enterCode_frame(slashParser.Code_frameContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#code_frame}.
	 * @param ctx the parse tree
	 */
	void exitCode_frame(slashParser.Code_frameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInst(slashParser.ExpressionInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInst(slashParser.ExpressionInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfInst(slashParser.IfInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfInst(slashParser.IfInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeFrameInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCodeFrameInst(slashParser.CodeFrameInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeFrameInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCodeFrameInst(slashParser.CodeFrameInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(slashParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(slashParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(slashParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(slashParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code encapsulateExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulateExpr(slashParser.EncapsulateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code encapsulateExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulateExpr(slashParser.EncapsulateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(slashParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(slashParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(slashParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(slashParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(slashParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(slashParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(slashParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(slashParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(slashParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(slashParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(slashParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(slashParser.VisibilityContext ctx);
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
	 * Enter a parse tree produced by {@link slashParser#dot_id}.
	 * @param ctx the parse tree
	 */
	void enterDot_id(slashParser.Dot_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#dot_id}.
	 * @param ctx the parse tree
	 */
	void exitDot_id(slashParser.Dot_idContext ctx);
}