// Generated from MiniCPP.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCPPParser}.
 */
public interface MiniCPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniCPPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniCPPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStmt(MiniCPPParser.IncludeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStmt(MiniCPPParser.IncludeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MiniCPPParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MiniCPPParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(MiniCPPParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(MiniCPPParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MiniCPPParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MiniCPPParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniCPPParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniCPPParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(MiniCPPParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(MiniCPPParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniCPPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniCPPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniCPPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniCPPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(MiniCPPParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(MiniCPPParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(MiniCPPParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(MiniCPPParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#destructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDecl(MiniCPPParser.DestructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#destructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDecl(MiniCPPParser.DestructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MiniCPPParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MiniCPPParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#controlStruct}.
	 * @param ctx the parse tree
	 */
	void enterControlStruct(MiniCPPParser.ControlStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#controlStruct}.
	 * @param ctx the parse tree
	 */
	void exitControlStruct(MiniCPPParser.ControlStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MiniCPPParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MiniCPPParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniCPPParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniCPPParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniCPPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniCPPParser.ExprContext ctx);
}