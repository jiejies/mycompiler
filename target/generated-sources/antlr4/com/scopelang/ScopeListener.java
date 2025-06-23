// Generated from com/scopelang/Scope.g4 by ANTLR 4.10.1
package com.scopelang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScopeParser}.
 */
public interface ScopeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScopeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ScopeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ScopeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ScopeParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ScopeParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(ScopeParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(ScopeParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#topStatements}.
	 * @param ctx the parse tree
	 */
	void enterTopStatements(ScopeParser.TopStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#topStatements}.
	 * @param ctx the parse tree
	 */
	void exitTopStatements(ScopeParser.TopStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#outerStatments}.
	 * @param ctx the parse tree
	 */
	void enterOuterStatments(ScopeParser.OuterStatmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#outerStatments}.
	 * @param ctx the parse tree
	 */
	void exitOuterStatments(ScopeParser.OuterStatmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#innerStatement}.
	 * @param ctx the parse tree
	 */
	void enterInnerStatement(ScopeParser.InnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#innerStatement}.
	 * @param ctx the parse tree
	 */
	void exitInnerStatement(ScopeParser.InnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#outerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOuterStatement(ScopeParser.OuterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#outerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOuterStatement(ScopeParser.OuterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopStatement(ScopeParser.TopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopStatement(ScopeParser.TopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ScopeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ScopeParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ScopeParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ScopeParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ScopeParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ScopeParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(ScopeParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(ScopeParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(ScopeParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(ScopeParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ScopeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ScopeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#opAssign}.
	 * @param ctx the parse tree
	 */
	void enterOpAssign(ScopeParser.OpAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#opAssign}.
	 * @param ctx the parse tree
	 */
	void exitOpAssign(ScopeParser.OpAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ScopeParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ScopeParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#breakpoint}.
	 * @param ctx the parse tree
	 */
	void enterBreakpoint(ScopeParser.BreakpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#breakpoint}.
	 * @param ctx the parse tree
	 */
	void exitBreakpoint(ScopeParser.BreakpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(ScopeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(ScopeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(ScopeParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(ScopeParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ScopeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ScopeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(ScopeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(ScopeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(ScopeParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(ScopeParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(ScopeParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(ScopeParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#assembly}.
	 * @param ctx the parse tree
	 */
	void enterAssembly(ScopeParser.AssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#assembly}.
	 * @param ctx the parse tree
	 */
	void exitAssembly(ScopeParser.AssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ScopeParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ScopeParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(ScopeParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(ScopeParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ScopeParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ScopeParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(ScopeParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(ScopeParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#using}.
	 * @param ctx the parse tree
	 */
	void enterUsing(ScopeParser.UsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#using}.
	 * @param ctx the parse tree
	 */
	void exitUsing(ScopeParser.UsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#objectField}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(ScopeParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#objectField}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(ScopeParser.ObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ScopeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ScopeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ScopeParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ScopeParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(ScopeParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(ScopeParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(ScopeParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(ScopeParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void enterObjectInit(ScopeParser.ObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#objectInit}.
	 * @param ctx the parse tree
	 */
	void exitObjectInit(ScopeParser.ObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#fullIdent}.
	 * @param ctx the parse tree
	 */
	void enterFullIdent(ScopeParser.FullIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#fullIdent}.
	 * @param ctx the parse tree
	 */
	void exitFullIdent(ScopeParser.FullIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ScopeParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ScopeParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScopeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ScopeParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScopeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ScopeParser.TypeNameContext ctx);
}