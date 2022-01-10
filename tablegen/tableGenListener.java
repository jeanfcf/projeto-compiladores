// Generated from tableGen.g4 by ANTLR 4.9.2
package tablegen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tableGenParser}.
 */
public interface tableGenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tableGenParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(tableGenParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link tableGenParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(tableGenParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link tableGenParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(tableGenParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link tableGenParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(tableGenParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Show}
	 * labeled alternative in {@link tableGenParser#com}.
	 * @param ctx the parse tree
	 */
	void enterShow(tableGenParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Show}
	 * labeled alternative in {@link tableGenParser#com}.
	 * @param ctx the parse tree
	 */
	void exitShow(tableGenParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Coluna}
	 * labeled alternative in {@link tableGenParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColuna(tableGenParser.ColunaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Coluna}
	 * labeled alternative in {@link tableGenParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColuna(tableGenParser.ColunaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Linha}
	 * labeled alternative in {@link tableGenParser#rows}.
	 * @param ctx the parse tree
	 */
	void enterLinha(tableGenParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Linha}
	 * labeled alternative in {@link tableGenParser#rows}.
	 * @param ctx the parse tree
	 */
	void exitLinha(tableGenParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tit}
	 * labeled alternative in {@link tableGenParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTit(tableGenParser.TitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tit}
	 * labeled alternative in {@link tableGenParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTit(tableGenParser.TitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Head}
	 * labeled alternative in {@link tableGenParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHead(tableGenParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Head}
	 * labeled alternative in {@link tableGenParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHead(tableGenParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Foot}
	 * labeled alternative in {@link tableGenParser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFoot(tableGenParser.FootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Foot}
	 * labeled alternative in {@link tableGenParser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFoot(tableGenParser.FootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lab}
	 * labeled alternative in {@link tableGenParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLab(tableGenParser.LabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lab}
	 * labeled alternative in {@link tableGenParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLab(tableGenParser.LabContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Con}
	 * labeled alternative in {@link tableGenParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCon(tableGenParser.ConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Con}
	 * labeled alternative in {@link tableGenParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCon(tableGenParser.ConContext ctx);
}