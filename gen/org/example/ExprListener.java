// Generated from C:/Users/Joseph/IdeaProjects/practiceParcialCompilers/src/main/java/org/example/Expr.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Expr}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Expr#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Expr.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Expr.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Expr.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Expr.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#endbody}.
	 * @param ctx the parse tree
	 */
	void enterEndbody(Expr.EndbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#endbody}.
	 * @param ctx the parse tree
	 */
	void exitEndbody(Expr.EndbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Expr.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Expr.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Expr.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Expr.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Expr.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Expr.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#staments}.
	 * @param ctx the parse tree
	 */
	void enterStaments(Expr.StamentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#staments}.
	 * @param ctx the parse tree
	 */
	void exitStaments(Expr.StamentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#operatation}.
	 * @param ctx the parse tree
	 */
	void enterOperatation(Expr.OperatationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#operatation}.
	 * @param ctx the parse tree
	 */
	void exitOperatation(Expr.OperatationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#numbersOperation}.
	 * @param ctx the parse tree
	 */
	void enterNumbersOperation(Expr.NumbersOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#numbersOperation}.
	 * @param ctx the parse tree
	 */
	void exitNumbersOperation(Expr.NumbersOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#operationToken}.
	 * @param ctx the parse tree
	 */
	void enterOperationToken(Expr.OperationTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#operationToken}.
	 * @param ctx the parse tree
	 */
	void exitOperationToken(Expr.OperationTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#typesfunction}.
	 * @param ctx the parse tree
	 */
	void enterTypesfunction(Expr.TypesfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#typesfunction}.
	 * @param ctx the parse tree
	 */
	void exitTypesfunction(Expr.TypesfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#typesparam}.
	 * @param ctx the parse tree
	 */
	void enterTypesparam(Expr.TypesparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#typesparam}.
	 * @param ctx the parse tree
	 */
	void exitTypesparam(Expr.TypesparamContext ctx);
}