// Generated from MiniCPP.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniCPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INCLUDE=4, IF=5, ELSE=6, FOR=7, WHILE=8, RETURN=9, 
		INT=10, FLOAT=11, DOUBLE=12, STR=13, VOID=14, ID=15, NUMBER=16, STRING_LITERAL=17, 
		LINE_COMMENT=18, BLOCK_COMMENT=19, WS=20, ASSIGN=21, PLUS_ASSIGN=22, MINUS_ASSIGN=23, 
		MULT_ASSIGN=24, DIV_ASSIGN=25, MOD_ASSIGN=26, PLUS=27, MINUS=28, STAR=29, 
		DIV=30, MOD=31, AND=32, OR=33, NOT=34, EQUAL=35, NOT_EQUAL=36, GREATER_EQUAL=37, 
		LESS_EQUAL=38, GREATER=39, LESS=40, INCREMENT=41, DECREMENT=42, SEMICOLON=43, 
		DOT=44, COMMA=45, LPAREN=46, RPAREN=47, LBRACE=48, RBRACE=49;
	public static final int
		RULE_program = 0, RULE_includeStmt = 1, RULE_varDecl = 2, RULE_funcDecl = 3, 
		RULE_paramList = 4, RULE_param = 5, RULE_structDecl = 6, RULE_statement = 7, 
		RULE_assignment = 8, RULE_constDecl = 9, RULE_constructorDecl = 10, RULE_destructorDecl = 11, 
		RULE_funcCall = 12, RULE_controlStruct = 13, RULE_returnStmt = 14, RULE_block = 15, 
		RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "includeStmt", "varDecl", "funcDecl", "paramList", "param", 
			"structDecl", "statement", "assignment", "constDecl", "constructorDecl", 
			"destructorDecl", "funcCall", "controlStruct", "returnStmt", "block", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'const'", "'~'", "'#include'", "'if'", "'else'", "'for'", 
			"'while'", "'return'", "'int'", "'float'", "'double'", "'string'", "'void'", 
			null, null, null, null, null, null, "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'=='", 
			"'!='", "'>='", "'<='", "'>'", "'<'", "'++'", "'--'", "';'", "'.'", "','", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INCLUDE", "IF", "ELSE", "FOR", "WHILE", "RETURN", 
			"INT", "FLOAT", "DOUBLE", "STR", "VOID", "ID", "NUMBER", "STRING_LITERAL", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "PLUS", "MINUS", "STAR", "DIV", 
			"MOD", "AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER_EQUAL", "LESS_EQUAL", 
			"GREATER", "LESS", "INCREMENT", "DECREMENT", "SEMICOLON", "DOT", "COMMA", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniCPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniCPPParser.EOF, 0); }
		public List<IncludeStmtContext> includeStmt() {
			return getRuleContexts(IncludeStmtContext.class);
		}
		public IncludeStmtContext includeStmt(int i) {
			return getRuleContext(IncludeStmtContext.class,i);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StructDeclContext> structDecl() {
			return getRuleContexts(StructDeclContext.class);
		}
		public StructDeclContext structDecl(int i) {
			return getRuleContext(StructDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744439734L) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					includeStmt();
					}
					break;
				case 2:
					{
					setState(35);
					funcDecl();
					}
					break;
				case 3:
					{
					setState(36);
					varDecl();
					}
					break;
				case 4:
					{
					setState(37);
					structDecl();
					}
					break;
				case 5:
					{
					setState(38);
					statement();
					}
					break;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStmtContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(MiniCPPParser.INCLUDE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MiniCPPParser.STRING_LITERAL, 0); }
		public IncludeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterIncludeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitIncludeStmt(this);
		}
	}

	public final IncludeStmtContext includeStmt() throws RecognitionException {
		IncludeStmtContext _localctx = new IncludeStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INCLUDE);
			setState(47);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniCPPParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(MiniCPPParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiniCPPParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MiniCPPParser.DOUBLE, 0); }
		public TerminalNode STR() { return getToken(MiniCPPParser.STR, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCPPParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(50);
				match(ID);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(51);
					match(ASSIGN);
					setState(52);
					expr(0);
					}
				}

				setState(55);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(57);
				match(ID);
				setState(58);
				match(ASSIGN);
				setState(59);
				funcCall();
				setState(60);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniCPPParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniCPPParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiniCPPParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MiniCPPParser.DOUBLE, 0); }
		public TerminalNode STR() { return getToken(MiniCPPParser.STR, 0); }
		public TerminalNode VOID() { return getToken(MiniCPPParser.VOID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitFuncDecl(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(ID);
			setState(66);
			match(LPAREN);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) {
				{
				setState(67);
				paramList();
				}
			}

			setState(70);
			match(RPAREN);
			setState(71);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniCPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniCPPParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			param();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(74);
				match(COMMA);
				setState(75);
				param();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode INT() { return getToken(MiniCPPParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiniCPPParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MiniCPPParser.DOUBLE, 0); }
		public TerminalNode STR() { return getToken(MiniCPPParser.STR, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MiniCPPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniCPPParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniCPPParser.SEMICOLON, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public List<ConstructorDeclContext> constructorDecl() {
			return getRuleContexts(ConstructorDeclContext.class);
		}
		public ConstructorDeclContext constructorDecl(int i) {
			return getRuleContext(ConstructorDeclContext.class,i);
		}
		public List<DestructorDeclContext> destructorDecl() {
			return getRuleContexts(DestructorDeclContext.class);
		}
		public DestructorDeclContext destructorDecl(int i) {
			return getRuleContext(DestructorDeclContext.class,i);
		}
		public List<StructDeclContext> structDecl() {
			return getRuleContexts(StructDeclContext.class);
		}
		public StructDeclContext structDecl(int i) {
			return getRuleContext(StructDeclContext.class,i);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitStructDecl(this);
		}
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			match(ID);
			setState(86);
			match(LBRACE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64522L) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(87);
					varDecl();
					}
					break;
				case 2:
					{
					setState(88);
					funcDecl();
					}
					break;
				case 3:
					{
					setState(89);
					constructorDecl();
					}
					break;
				case 4:
					{
					setState(90);
					destructorDecl();
					}
					break;
				case 5:
					{
					setState(91);
					structDecl();
					}
					break;
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(RBRACE);
			setState(98);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniCPPParser.SEMICOLON, 0); }
		public ControlStructContext controlStruct() {
			return getRuleContext(ControlStructContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IncludeStmtContext includeStmt() {
			return getRuleContext(IncludeStmtContext.class,0);
		}
		public StructDeclContext structDecl() {
			return getRuleContext(StructDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				funcDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				funcCall();
				setState(104);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				controlStruct();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				returnStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				includeStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				structDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				expr(0);
				setState(111);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				constDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCPPParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniCPPParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			setState(117);
			match(ASSIGN);
			setState(118);
			expr(0);
			setState(119);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCPPParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniCPPParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(MiniCPPParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiniCPPParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(MiniCPPParser.STR, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__1);
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11264L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			match(ID);
			setState(124);
			match(ASSIGN);
			setState(125);
			expr(0);
			setState(126);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniCPPParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitConstructorDecl(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(LPAREN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) {
				{
				setState(130);
				paramList();
				}
			}

			setState(133);
			match(RPAREN);
			setState(134);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructorDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniCPPParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DestructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterDestructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitDestructorDecl(this);
		}
	}

	public final DestructorDeclContext destructorDecl() throws RecognitionException {
		DestructorDeclContext _localctx = new DestructorDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_destructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__2);
			setState(137);
			match(ID);
			setState(138);
			match(LPAREN);
			setState(139);
			match(RPAREN);
			setState(140);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniCPPParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniCPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniCPPParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(LPAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744407040L) != 0)) {
				{
				setState(144);
				expr(0);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					expr(0);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlStructContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniCPPParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCPPParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniCPPParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniCPPParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(MiniCPPParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(MiniCPPParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniCPPParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniCPPParser.SEMICOLON, i);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ControlStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterControlStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitControlStruct(this);
		}
	}

	public final ControlStructContext controlStruct() throws RecognitionException {
		ControlStructContext _localctx = new ControlStructContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_controlStruct);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(IF);
				setState(157);
				match(LPAREN);
				setState(158);
				expr(0);
				setState(159);
				match(RPAREN);
				setState(160);
				block();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(161);
					match(ELSE);
					setState(162);
					block();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(WHILE);
				setState(166);
				match(LPAREN);
				setState(167);
				expr(0);
				setState(168);
				match(RPAREN);
				setState(169);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(FOR);
				setState(172);
				match(LPAREN);
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(173);
					varDecl();
					}
					break;
				case 2:
					{
					setState(174);
					assignment();
					}
					break;
				case 3:
					{
					setState(175);
					expr(0);
					}
					break;
				}
				setState(178);
				match(SEMICOLON);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744407040L) != 0)) {
					{
					setState(179);
					expr(0);
					}
				}

				setState(182);
				match(SEMICOLON);
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(183);
					assignment();
					}
					break;
				case 2:
					{
					setState(184);
					expr(0);
					}
					break;
				}
				setState(187);
				match(RPAREN);
				setState(188);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCPPParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniCPPParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(RETURN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744407040L) != 0)) {
				{
				setState(192);
				expr(0);
				}
			}

			setState(195);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniCPPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniCPPParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744439734L) != 0)) {
				{
				{
				setState(198);
				statement();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCPPParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MiniCPPParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MiniCPPParser.STRING_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCPPParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniCPPParser.RPAREN, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniCPPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniCPPParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(MiniCPPParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(MiniCPPParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniCPPParser.MOD, 0); }
		public TerminalNode GREATER() { return getToken(MiniCPPParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(MiniCPPParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(MiniCPPParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(MiniCPPParser.LESS_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(MiniCPPParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(MiniCPPParser.NOT_EQUAL, 0); }
		public TerminalNode AND() { return getToken(MiniCPPParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniCPPParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCPPListener ) ((MiniCPPListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(207);
				match(ID);
				}
				break;
			case 2:
				{
				setState(208);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(209);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				setState(210);
				match(LPAREN);
				setState(211);
				expr(0);
				setState(212);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(214);
				funcCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(218);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(221);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(224);
						match(AND);
						setState(225);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(227);
						match(OR);
						setState(228);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"E\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006]\b\u0006"+
		"\n\u0006\f\u0006`\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007s\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0094\b\f\n\f\f\f\u0097\t\f\u0003\f\u0099"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a4\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b1\b\r\u0001\r\u0001\r\u0003"+
		"\r\u00b5\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ba\b\r\u0001\r\u0001\r"+
		"\u0003\r\u00be\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00c2\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00c8\b\u000f\n"+
		"\u000f\f\u000f\u00cb\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00d8\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e6\b\u0010\n"+
		"\u0010\f\u0010\u00e9\t\u0010\u0001\u0010\u0000\u0001 \u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0005\u0001\u0000\n\r\u0001\u0000\n\u000e\u0002\u0000\n\u000b"+
		"\r\r\u0001\u0000\u001b\u001f\u0001\u0000#(\u0106\u0000)\u0001\u0000\u0000"+
		"\u0000\u0002.\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"@\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000"+
		"\u0000\fT\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"t\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014\u0080\u0001"+
		"\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u008e\u0001"+
		"\u0000\u0000\u0000\u001a\u00bd\u0001\u0000\u0000\u0000\u001c\u00bf\u0001"+
		"\u0000\u0000\u0000\u001e\u00c5\u0001\u0000\u0000\u0000 \u00d7\u0001\u0000"+
		"\u0000\u0000\"(\u0003\u0002\u0001\u0000#(\u0003\u0006\u0003\u0000$(\u0003"+
		"\u0004\u0002\u0000%(\u0003\f\u0006\u0000&(\u0003\u000e\u0007\u0000\'\""+
		"\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001"+
		"-\u0001\u0001\u0000\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005\u0011"+
		"\u0000\u00000\u0003\u0001\u0000\u0000\u000012\u0007\u0000\u0000\u0000"+
		"25\u0005\u000f\u0000\u000034\u0005\u0015\u0000\u000046\u0003 \u0010\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007?\u0005+\u0000\u000089\u0007\u0000\u0000\u00009:\u0005\u000f\u0000"+
		"\u0000:;\u0005\u0015\u0000\u0000;<\u0003\u0018\f\u0000<=\u0005+\u0000"+
		"\u0000=?\u0001\u0000\u0000\u0000>1\u0001\u0000\u0000\u0000>8\u0001\u0000"+
		"\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0007\u0001\u0000\u0000"+
		"AB\u0005\u000f\u0000\u0000BD\u0005.\u0000\u0000CE\u0003\b\u0004\u0000"+
		"DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0005/\u0000\u0000GH\u0003\u001e\u000f\u0000H\u0007\u0001\u0000"+
		"\u0000\u0000IN\u0003\n\u0005\u0000JK\u0005-\u0000\u0000KM\u0003\n\u0005"+
		"\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QR\u0007\u0000\u0000\u0000RS\u0005\u000f\u0000\u0000"+
		"S\u000b\u0001\u0000\u0000\u0000TU\u0005\u0001\u0000\u0000UV\u0005\u000f"+
		"\u0000\u0000V^\u00050\u0000\u0000W]\u0003\u0004\u0002\u0000X]\u0003\u0006"+
		"\u0003\u0000Y]\u0003\u0014\n\u0000Z]\u0003\u0016\u000b\u0000[]\u0003\f"+
		"\u0006\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y"+
		"\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005"+
		"1\u0000\u0000bc\u0005+\u0000\u0000c\r\u0001\u0000\u0000\u0000ds\u0003"+
		"\u0006\u0003\u0000es\u0003\u0004\u0002\u0000fs\u0003\u0010\b\u0000gh\u0003"+
		"\u0018\f\u0000hi\u0005+\u0000\u0000is\u0001\u0000\u0000\u0000js\u0003"+
		"\u001a\r\u0000ks\u0003\u001c\u000e\u0000ls\u0003\u0002\u0001\u0000ms\u0003"+
		"\f\u0006\u0000no\u0003 \u0010\u0000op\u0005+\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qs\u0003\u0012\t\u0000rd\u0001\u0000\u0000\u0000re\u0001\u0000"+
		"\u0000\u0000rf\u0001\u0000\u0000\u0000rg\u0001\u0000\u0000\u0000rj\u0001"+
		"\u0000\u0000\u0000rk\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000"+
		"rm\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000s\u000f\u0001\u0000\u0000\u0000tu\u0005\u000f\u0000\u0000uv\u0005"+
		"\u0015\u0000\u0000vw\u0003 \u0010\u0000wx\u0005+\u0000\u0000x\u0011\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000z{\u0007\u0002\u0000\u0000"+
		"{|\u0005\u000f\u0000\u0000|}\u0005\u0015\u0000\u0000}~\u0003 \u0010\u0000"+
		"~\u007f\u0005+\u0000\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u000f\u0000\u0000\u0081\u0083\u0005.\u0000\u0000\u0082\u0084\u0003"+
		"\b\u0004\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005/\u0000"+
		"\u0000\u0086\u0087\u0003\u001e\u000f\u0000\u0087\u0015\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008a\u0005\u000f\u0000"+
		"\u0000\u008a\u008b\u0005.\u0000\u0000\u008b\u008c\u0005/\u0000\u0000\u008c"+
		"\u008d\u0003\u001e\u000f\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\u000f\u0000\u0000\u008f\u0098\u0005.\u0000\u0000\u0090\u0095"+
		"\u0003 \u0010\u0000\u0091\u0092\u0005-\u0000\u0000\u0092\u0094\u0003 "+
		"\u0010\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005/\u0000"+
		"\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0005\u0000"+
		"\u0000\u009d\u009e\u0005.\u0000\u0000\u009e\u009f\u0003 \u0010\u0000\u009f"+
		"\u00a0\u0005/\u0000\u0000\u00a0\u00a3\u0003\u001e\u000f\u0000\u00a1\u00a2"+
		"\u0005\u0006\u0000\u0000\u00a2\u00a4\u0003\u001e\u000f\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00be"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\b\u0000\u0000\u00a6\u00a7\u0005"+
		".\u0000\u0000\u00a7\u00a8\u0003 \u0010\u0000\u00a8\u00a9\u0005/\u0000"+
		"\u0000\u00a9\u00aa\u0003\u001e\u000f\u0000\u00aa\u00be\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u00b0\u0005.\u0000\u0000"+
		"\u00ad\u00b1\u0003\u0004\u0002\u0000\u00ae\u00b1\u0003\u0010\b\u0000\u00af"+
		"\u00b1\u0003 \u0010\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0005+\u0000\u0000\u00b3\u00b5\u0003 \u0010\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0005+\u0000\u0000\u00b7\u00ba\u0003\u0010\b"+
		"\u0000\u00b8\u00ba\u0003 \u0010\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005/\u0000\u0000\u00bc"+
		"\u00be\u0003\u001e\u000f\u0000\u00bd\u009c\u0001\u0000\u0000\u0000\u00bd"+
		"\u00a5\u0001\u0000\u0000\u0000\u00bd\u00ab\u0001\u0000\u0000\u0000\u00be"+
		"\u001b\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\t\u0000\u0000\u00c0\u00c2"+
		"\u0003 \u0010\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"+\u0000\u0000\u00c4\u001d\u0001\u0000\u0000\u0000\u00c5\u00c9\u00050\u0000"+
		"\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u00051\u0000\u0000"+
		"\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006\u0010\uffff\uffff"+
		"\u0000\u00cf\u00d8\u0005\u000f\u0000\u0000\u00d0\u00d8\u0005\u0010\u0000"+
		"\u0000\u00d1\u00d8\u0005\u0011\u0000\u0000\u00d2\u00d3\u0005.\u0000\u0000"+
		"\u00d3\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0005/\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003\u0018\f\u0000\u00d7\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d0\u0001\u0000\u0000\u0000\u00d7\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00e7\u0001\u0000\u0000\u0000\u00d9\u00da\n\t"+
		"\u0000\u0000\u00da\u00db\u0007\u0003\u0000\u0000\u00db\u00e6\u0003 \u0010"+
		"\n\u00dc\u00dd\n\b\u0000\u0000\u00dd\u00de\u0007\u0004\u0000\u0000\u00de"+
		"\u00e6\u0003 \u0010\t\u00df\u00e0\n\u0007\u0000\u0000\u00e0\u00e1\u0005"+
		" \u0000\u0000\u00e1\u00e6\u0003 \u0010\b\u00e2\u00e3\n\u0006\u0000\u0000"+
		"\u00e3\u00e4\u0005!\u0000\u0000\u00e4\u00e6\u0003 \u0010\u0007\u00e5\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e5\u00dc\u0001\u0000\u0000\u0000\u00e5\u00df"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8!\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u0016\')5>DN\\^r\u0083\u0095\u0098\u00a3\u00b0\u00b4"+
		"\u00b9\u00bd\u00c1\u00c9\u00d7\u00e5\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}