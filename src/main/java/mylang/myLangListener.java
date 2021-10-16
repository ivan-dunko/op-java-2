// Generated from C:/Programs/ANTLR_tutorial/2\myLang.g4 by ANTLR 4.9.1
package mylang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myLangParser}.
 */
public interface myLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myLangParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(myLangParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(myLangParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(myLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(myLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(myLangParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(myLangParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#stringDef}.
	 * @param ctx the parse tree
	 */
	void enterStringDef(myLangParser.StringDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#stringDef}.
	 * @param ctx the parse tree
	 */
	void exitStringDef(myLangParser.StringDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#intDef}.
	 * @param ctx the parse tree
	 */
	void enterIntDef(myLangParser.IntDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#intDef}.
	 * @param ctx the parse tree
	 */
	void exitIntDef(myLangParser.IntDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#intAssign}.
	 * @param ctx the parse tree
	 */
	void enterIntAssign(myLangParser.IntAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#intAssign}.
	 * @param ctx the parse tree
	 */
	void exitIntAssign(myLangParser.IntAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#stringAssign}.
	 * @param ctx the parse tree
	 */
	void enterStringAssign(myLangParser.StringAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#stringAssign}.
	 * @param ctx the parse tree
	 */
	void exitStringAssign(myLangParser.StringAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#intVal}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(myLangParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#intVal}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(myLangParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#stringVal}.
	 * @param ctx the parse tree
	 */
	void enterStringVal(myLangParser.StringValContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#stringVal}.
	 * @param ctx the parse tree
	 */
	void exitStringVal(myLangParser.StringValContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#moreInt}.
	 * @param ctx the parse tree
	 */
	void enterMoreInt(myLangParser.MoreIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#moreInt}.
	 * @param ctx the parse tree
	 */
	void exitMoreInt(myLangParser.MoreIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#moreString}.
	 * @param ctx the parse tree
	 */
	void enterMoreString(myLangParser.MoreStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#moreString}.
	 * @param ctx the parse tree
	 */
	void exitMoreString(myLangParser.MoreStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(myLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(myLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(myLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(myLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(myLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(myLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#gotoOp}.
	 * @param ctx the parse tree
	 */
	void enterGotoOp(myLangParser.GotoOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#gotoOp}.
	 * @param ctx the parse tree
	 */
	void exitGotoOp(myLangParser.GotoOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(myLangParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(myLangParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(myLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(myLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(myLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(myLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(myLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(myLangParser.ProgramContext ctx);
}