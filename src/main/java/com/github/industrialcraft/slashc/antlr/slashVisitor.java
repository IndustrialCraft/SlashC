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
	 * Visit a parse tree produced by {@link slashParser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member(slashParser.Class_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#class_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_attribute(slashParser.Class_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#class_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method(slashParser.Class_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#method_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_param(slashParser.Method_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#code_frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_frame(slashParser.Code_frameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInst(slashParser.ExpressionInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInst(slashParser.IfInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInst(slashParser.WhileInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopInst(slashParser.LoopInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInst(slashParser.ForInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeFrameInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeFrameInst(slashParser.CodeFrameInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInst(slashParser.VariableInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnInst}
	 * labeled alternative in {@link slashParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInst(slashParser.ReturnInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orElseExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrElseExpr(slashParser.OrElseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(slashParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleOperationExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOperationExpr(slashParser.SingleOperationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(slashParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullCheckExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCheckExpr(slashParser.NullCheckExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(slashParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(slashParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessExpr(slashParser.AccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(slashParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encapsulateExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsulateExpr(slashParser.EncapsulateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code biOperationExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiOperationExpr(slashParser.BiOperationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessArrExpr}
	 * labeled alternative in {@link slashParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessArrExpr(slashParser.AccessArrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#biOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiOperation(slashParser.BiOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#singleOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOperation(slashParser.SingleOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(slashParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(slashParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(slashParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiterals}
	 * labeled alternative in {@link slashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiterals(slashParser.BoolLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(slashParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link slashParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(slashParser.VisibilityContext ctx);
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
	 * Visit a parse tree produced by {@link slashParser#dot_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_id(slashParser.Dot_idContext ctx);
}