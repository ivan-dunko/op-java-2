// Generated from C:/Programs/ANTLR_tutorial/2\myLang.g4 by ANTLR 4.9.1
package mylang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myLangParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(myLangParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(myLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(myLangParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#stringDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDef(myLangParser.StringDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#intDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDef(myLangParser.IntDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#intAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssign(myLangParser.IntAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#stringAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssign(myLangParser.StringAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#intVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(myLangParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#stringVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVal(myLangParser.StringValContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#moreInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreInt(myLangParser.MoreIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#moreString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreString(myLangParser.MoreStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(myLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(myLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(myLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#gotoOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoOp(myLangParser.GotoOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(myLangParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(myLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(myLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(myLangParser.ProgramContext ctx);
}