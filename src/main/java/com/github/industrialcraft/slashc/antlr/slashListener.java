// Generated from /home/mmm/Desktop/IndustrialCraft/SlashC/src/main/antlr/slash.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by the {@code whileInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhileInst(slashParser.WhileInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhileInst(slashParser.WhileInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLoopInst(slashParser.LoopInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLoopInst(slashParser.LoopInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterForInst(slashParser.ForInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitForInst(slashParser.ForInstContext ctx);
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
	 * Enter a parse tree produced by the {@code variableInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVariableInst(slashParser.VariableInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVariableInst(slashParser.VariableInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterReturnInst(slashParser.ReturnInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitReturnInst(slashParser.ReturnInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orElseExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrElseExpr(slashParser.OrElseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orElseExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrElseExpr(slashParser.OrElseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(slashParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(slashParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleOperationExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingleOperationExpr(slashParser.SingleOperationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleOperationExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingleOperationExpr(slashParser.SingleOperationExprContext ctx);
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
	 * Enter a parse tree produced by the {@code nullCheckExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullCheckExpr(slashParser.NullCheckExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullCheckExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullCheckExpr(slashParser.NullCheckExprContext ctx);
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
	 * Enter a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpr(slashParser.RangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpr(slashParser.RangeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpr(slashParser.AccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpr(slashParser.AccessExprContext ctx);
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
	 * Enter a parse tree produced by the {@code biOperationExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBiOperationExpr(slashParser.BiOperationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code biOperationExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBiOperationExpr(slashParser.BiOperationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessArrExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccessArrExpr(slashParser.AccessArrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessArrExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccessArrExpr(slashParser.AccessArrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#biOperation}.
	 * @param ctx the parse tree
	 */
	void enterBiOperation(slashParser.BiOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#biOperation}.
	 * @param ctx the parse tree
	 */
	void exitBiOperation(slashParser.BiOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link slashParser#singleOperation}.
	 * @param ctx the parse tree
	 */
	void enterSingleOperation(slashParser.SingleOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link slashParser#singleOperation}.
	 * @param ctx the parse tree
	 */
	void exitSingleOperation(slashParser.SingleOperationContext ctx);
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