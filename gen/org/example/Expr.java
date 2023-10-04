// Generated from C:/Users/Joseph/IdeaProjects/practiceParcialCompilers/src/main/java/org/example/Expr.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Expr extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, LEFT=2, RIGHT=3, LEFTBRACE=4, RIGHTBRACE=5, RETURN=6, INTNUMBER=7, 
		SEMICOLON=8, COMA=9, PLUS=10, MINUS=11, EQUAL=12, MULT=13, DIV=14, VOID=15, 
		INT=16, CHAR=17, FLOAT=18, STRING=19;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_endbody = 2, RULE_params = 3, 
		RULE_param = 4, RULE_statement = 5, RULE_staments = 6, RULE_operatation = 7, 
		RULE_numbersOperation = 8, RULE_operationToken = 9, RULE_typesfunction = 10, 
		RULE_typesparam = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "endbody", "params", "param", "statement", "staments", 
			"operatation", "numbersOperation", "operationToken", "typesfunction", 
			"typesparam"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "LEFT", "RIGHT", "LEFTBRACE", "RIGHTBRACE", "RETURN", "INTNUMBER", 
			"SEMICOLON", "COMA", "PLUS", "MINUS", "EQUAL", "MULT", "DIV", "VOID", 
			"INT", "CHAR", "FLOAT", "STRING"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Expr(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Expr.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			function();
			setState(25);
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
	public static class FunctionContext extends ParserRuleContext {
		public TypesfunctionContext typesfunction() {
			return getRuleContext(TypesfunctionContext.class,0);
		}
		public TerminalNode ID() { return getToken(Expr.ID, 0); }
		public TerminalNode LEFT() { return getToken(Expr.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(Expr.RIGHT, 0); }
		public TerminalNode LEFTBRACE() { return getToken(Expr.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(Expr.RIGHTBRACE, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<StamentsContext> staments() {
			return getRuleContexts(StamentsContext.class);
		}
		public StamentsContext staments(int i) {
			return getRuleContext(StamentsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			typesfunction();
			setState(28);
			match(ID);
			setState(29);
			match(LEFT);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) {
				{
				{
				setState(30);
				params();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(RIGHT);
			setState(37);
			match(LEFTBRACE);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 983234L) != 0)) {
				{
				{
				setState(38);
				staments();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(RIGHTBRACE);
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
	public static class EndbodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Expr.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Expr.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(Expr.ID, 0); }
		public TerminalNode INTNUMBER() { return getToken(Expr.INTNUMBER, 0); }
		public EndbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEndbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEndbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEndbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndbodyContext endbody() throws RecognitionException {
		EndbodyContext _localctx = new EndbodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(RETURN);
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INTNUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Expr.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Expr.COMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			param();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(51);
				match(COMA);
				setState(52);
				param();
				}
				}
				setState(57);
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
		public TypesparamContext typesparam() {
			return getRuleContext(TypesparamContext.class,0);
		}
		public TerminalNode ID() { return getToken(Expr.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			typesparam();
			setState(59);
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
	public static class StatementContext extends ParserRuleContext {
		public TypesparamContext typesparam() {
			return getRuleContext(TypesparamContext.class,0);
		}
		public TerminalNode ID() { return getToken(Expr.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(Expr.SEMICOLON, 0); }
		public EndbodyContext endbody() {
			return getRuleContext(EndbodyContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				typesparam();
				setState(62);
				match(ID);
				setState(63);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				endbody();
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
	public static class StamentsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public OperatationContext operatation() {
			return getRuleContext(OperatationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Expr.SEMICOLON, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode INTNUMBER() { return getToken(Expr.INTNUMBER, 0); }
		public TerminalNode ID() { return getToken(Expr.ID, 0); }
		public NumbersOperationContext numbersOperation() {
			return getRuleContext(NumbersOperationContext.class,0);
		}
		public StamentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStaments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStaments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStaments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StamentsContext staments() throws RecognitionException {
		StamentsContext _localctx = new StamentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_staments);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case CHAR:
				case FLOAT:
				case STRING:
					{
					setState(69);
					param();
					}
					break;
				case INTNUMBER:
					{
					setState(70);
					match(INTNUMBER);
					}
					break;
				case ID:
					{
					setState(71);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74);
				operatation();
				setState(75);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(ID);
				setState(78);
				numbersOperation();
				setState(79);
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
	public static class OperatationContext extends ParserRuleContext {
		public OperationTokenContext operationToken() {
			return getRuleContext(OperationTokenContext.class,0);
		}
		public TerminalNode ID() { return getToken(Expr.ID, 0); }
		public TerminalNode INTNUMBER() { return getToken(Expr.INTNUMBER, 0); }
		public OperatationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperatation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperatation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOperatation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatationContext operatation() throws RecognitionException {
		OperatationContext _localctx = new OperatationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operatation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			operationToken();
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INTNUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class NumbersOperationContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(Expr.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Expr.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Expr.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Expr.MINUS, i);
		}
		public TerminalNode EQUAL() { return getToken(Expr.EQUAL, 0); }
		public TerminalNode INTNUMBER() { return getToken(Expr.INTNUMBER, 0); }
		public TerminalNode MULT() { return getToken(Expr.MULT, 0); }
		public TerminalNode DIV() { return getToken(Expr.DIV, 0); }
		public NumbersOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbersOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumbersOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumbersOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNumbersOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbersOperationContext numbersOperation() throws RecognitionException {
		NumbersOperationContext _localctx = new NumbersOperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numbersOperation);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(PLUS);
				setState(87);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(MINUS);
				setState(89);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				match(EQUAL);
				setState(92);
				match(INTNUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				match(EQUAL);
				setState(95);
				match(INTNUMBER);
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
	public static class OperationTokenContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Expr.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Expr.MINUS, 0); }
		public TerminalNode MULT() { return getToken(Expr.MULT, 0); }
		public TerminalNode DIV() { return getToken(Expr.DIV, 0); }
		public TerminalNode EQUAL() { return getToken(Expr.EQUAL, 0); }
		public OperationTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperationToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperationToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOperationToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationTokenContext operationToken() throws RecognitionException {
		OperationTokenContext _localctx = new OperationTokenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operationToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TypesfunctionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(Expr.VOID, 0); }
		public TypesparamContext typesparam() {
			return getRuleContext(TypesparamContext.class,0);
		}
		public TypesfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypesfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypesfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypesfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesfunctionContext typesfunction() throws RecognitionException {
		TypesfunctionContext _localctx = new TypesfunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typesfunction);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(VOID);
				}
				break;
			case INT:
			case CHAR:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				typesparam();
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
	public static class TypesparamContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Expr.INT, 0); }
		public TerminalNode CHAR() { return getToken(Expr.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(Expr.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(Expr.STRING, 0); }
		public TypesparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypesparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypesparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypesparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesparamContext typesparam() throws RecognitionException {
		TypesparamContext _localctx = new TypesparamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typesparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006I\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006R\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\ba\b"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\ng\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0000\u0005\u0002\u0000\u0001\u0001\u0007\u0007\u0001\u0000"+
		"\n\u000b\u0001\u0000\r\u000e\u0001\u0000\n\u000e\u0001\u0000\u0010\u0013"+
		"j\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000"+
		"\u0004.\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b:\u0001"+
		"\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000"+
		"\u000eS\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012b"+
		"\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016h\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0000"+
		"\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0014"+
		"\n\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d!\u0005\u0002\u0000"+
		"\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0003\u0000\u0000%)\u0005\u0004\u0000\u0000&(\u0003\f\u0006\u0000\'&"+
		"\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0005\u0000\u0000-\u0003\u0001\u0000\u0000\u0000"+
		"./\u0005\u0006\u0000\u0000/0\u0007\u0000\u0000\u000001\u0005\b\u0000\u0000"+
		"1\u0005\u0001\u0000\u0000\u000027\u0003\b\u0004\u000034\u0005\t\u0000"+
		"\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0007\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003\u0016\u000b\u0000"+
		";<\u0005\u0001\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0003\u0016\u000b"+
		"\u0000>?\u0005\u0001\u0000\u0000?@\u0005\b\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000AC\u0003\u0004\u0002\u0000B=\u0001\u0000\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DR\u0003\n\u0005\u0000EI\u0003"+
		"\b\u0004\u0000FI\u0005\u0007\u0000\u0000GI\u0005\u0001\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JK\u0003\u000e\u0007\u0000KL\u0005\b\u0000\u0000"+
		"LR\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0003\u0010\b\u0000"+
		"OP\u0005\b\u0000\u0000PR\u0001\u0000\u0000\u0000QD\u0001\u0000\u0000\u0000"+
		"QH\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000R\r\u0001\u0000\u0000"+
		"\u0000ST\u0003\u0012\t\u0000TU\u0007\u0000\u0000\u0000U\u000f\u0001\u0000"+
		"\u0000\u0000VW\u0005\n\u0000\u0000Wa\u0005\n\u0000\u0000XY\u0005\u000b"+
		"\u0000\u0000Ya\u0005\u000b\u0000\u0000Z[\u0007\u0001\u0000\u0000[\\\u0005"+
		"\f\u0000\u0000\\a\u0005\u0007\u0000\u0000]^\u0007\u0002\u0000\u0000^_"+
		"\u0005\f\u0000\u0000_a\u0005\u0007\u0000\u0000`V\u0001\u0000\u0000\u0000"+
		"`X\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000"+
		"\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0007\u0003\u0000\u0000c\u0013"+
		"\u0001\u0000\u0000\u0000dg\u0005\u000f\u0000\u0000eg\u0003\u0016\u000b"+
		"\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0015\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0004\u0000\u0000i\u0017\u0001\u0000\u0000"+
		"\u0000\b!)7BHQ`f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}