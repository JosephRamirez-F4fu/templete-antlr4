// Generated from C:/Users/Joseph/IdeaProjects/practiceParcialCompilers/src/main/java/org/example/Expr.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Expr}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Expr#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Expr.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Expr.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#endbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndbody(Expr.EndbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Expr.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Expr.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Expr.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#staments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaments(Expr.StamentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#operatation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatation(Expr.OperatationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#numbersOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbersOperation(Expr.NumbersOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#operationToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationToken(Expr.OperationTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#typesfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesfunction(Expr.TypesfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#typesparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesparam(Expr.TypesparamContext ctx);
}