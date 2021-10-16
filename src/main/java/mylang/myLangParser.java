// Generated from C:/Programs/ANTLR_tutorial/2\myLang.g4 by ANTLR 4.9.1
package mylang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Int=12, String=13, Print=14, Goto=15, Not=16, WS=17, 
		NL=18, Number=19, VarName=20, Hash=21, StringValue=22;
	public static final int
		RULE_label = 0, RULE_type = 1, RULE_varDec = 2, RULE_stringDef = 3, RULE_intDef = 4, 
		RULE_intAssign = 5, RULE_stringAssign = 6, RULE_intVal = 7, RULE_stringVal = 8, 
		RULE_moreInt = 9, RULE_moreString = 10, RULE_condition = 11, RULE_ifStatement = 12, 
		RULE_print = 13, RULE_gotoOp = 14, RULE_inc = 15, RULE_loop = 16, RULE_block = 17, 
		RULE_program = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"label", "type", "varDec", "stringDef", "intDef", "intAssign", "stringAssign", 
			"intVal", "stringVal", "moreInt", "moreString", "condition", "ifStatement", 
			"print", "gotoOp", "inc", "loop", "block", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'>'", "'('", "')'", "'if'", "'++'", "'while'", "'{'", 
			"'}'", "'main'", "'int'", "'string'", "'print'", "'goto'", "'not'", null, 
			"'\n'", null, null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Int", "String", "Print", "Goto", "Not", "WS", "NL", "Number", "VarName", 
			"Hash", "StringValue"
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
	public String getGrammarFileName() { return "myLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(myLangParser.Hash, 0); }
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Hash);
			setState(39);
			match(VarName);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(40);
				match(WS);
				}
			}

			setState(43);
			match(T__0);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(44);
				match(WS);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(myLangParser.Int, 0); }
		public TerminalNode String() { return getToken(myLangParser.String, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==String) ) {
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

	public static class VarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			type();
			setState(50);
			match(WS);
			setState(51);
			match(VarName);
			setState(52);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(53);
				match(WS);
				}
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

	public static class StringDefContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(myLangParser.String, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public List<TerminalNode> VarName() { return getTokens(myLangParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(myLangParser.VarName, i);
		}
		public TerminalNode StringValue() { return getToken(myLangParser.StringValue, 0); }
		public StringDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterStringDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitStringDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitStringDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDefContext stringDef() throws RecognitionException {
		StringDefContext _localctx = new StringDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stringDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(String);
			setState(57);
			match(WS);
			setState(58);
			match(VarName);
			setState(59);
			match(WS);
			setState(60);
			match(T__1);
			setState(61);
			match(WS);
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==VarName || _la==StringValue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(63);
				match(WS);
				}
			}

			setState(66);
			match(T__0);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(67);
				match(WS);
				}
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

	public static class IntDefContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(myLangParser.Int, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public List<TerminalNode> VarName() { return getTokens(myLangParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(myLangParser.VarName, i);
		}
		public TerminalNode Number() { return getToken(myLangParser.Number, 0); }
		public IntDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterIntDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitIntDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitIntDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDefContext intDef() throws RecognitionException {
		IntDefContext _localctx = new IntDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Int);
			setState(71);
			match(WS);
			setState(72);
			match(VarName);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(73);
				match(WS);
				}
			}

			setState(76);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(77);
				match(WS);
				}
			}

			setState(80);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==VarName) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81);
				match(WS);
				}
			}

			setState(84);
			match(T__0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85);
				match(WS);
				}
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

	public static class IntAssignContext extends ParserRuleContext {
		public List<TerminalNode> VarName() { return getTokens(myLangParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(myLangParser.VarName, i);
		}
		public TerminalNode Number() { return getToken(myLangParser.Number, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public IntAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterIntAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitIntAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitIntAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAssignContext intAssign() throws RecognitionException {
		IntAssignContext _localctx = new IntAssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VarName);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89);
				match(WS);
				}
			}

			setState(92);
			match(T__1);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93);
				match(WS);
				}
			}

			setState(96);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==VarName) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(97);
				match(WS);
				}
			}

			setState(100);
			match(T__0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(101);
				match(WS);
				}
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

	public static class StringAssignContext extends ParserRuleContext {
		public List<TerminalNode> VarName() { return getTokens(myLangParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(myLangParser.VarName, i);
		}
		public TerminalNode StringValue() { return getToken(myLangParser.StringValue, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public StringAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterStringAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitStringAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitStringAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAssignContext stringAssign() throws RecognitionException {
		StringAssignContext _localctx = new StringAssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VarName);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(105);
				match(WS);
				}
			}

			setState(108);
			match(T__1);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(109);
				match(WS);
				}
			}

			setState(112);
			_la = _input.LA(1);
			if ( !(_la==VarName || _la==StringValue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(113);
				match(WS);
				}
			}

			setState(116);
			match(T__0);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(117);
				match(WS);
				}
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

	public static class IntValContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public TerminalNode Number() { return getToken(myLangParser.Number, 0); }
		public IntValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValContext intVal() throws RecognitionException {
		IntValContext _localctx = new IntValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==VarName) ) {
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

	public static class StringValContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public TerminalNode StringValue() { return getToken(myLangParser.StringValue, 0); }
		public StringValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterStringVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitStringVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitStringVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValContext stringVal() throws RecognitionException {
		StringValContext _localctx = new StringValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==VarName || _la==StringValue) ) {
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

	public static class MoreIntContext extends ParserRuleContext {
		public List<IntValContext> intVal() {
			return getRuleContexts(IntValContext.class);
		}
		public IntValContext intVal(int i) {
			return getRuleContext(IntValContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public MoreIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterMoreInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitMoreInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitMoreInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreIntContext moreInt() throws RecognitionException {
		MoreIntContext _localctx = new MoreIntContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moreInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			intVal();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(125);
				match(WS);
				}
			}

			setState(128);
			match(T__2);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(129);
				match(WS);
				}
			}

			setState(132);
			intVal();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(133);
				match(WS);
				}
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

	public static class MoreStringContext extends ParserRuleContext {
		public List<StringValContext> stringVal() {
			return getRuleContexts(StringValContext.class);
		}
		public StringValContext stringVal(int i) {
			return getRuleContext(StringValContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public MoreStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterMoreString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitMoreString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitMoreString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreStringContext moreString() throws RecognitionException {
		MoreStringContext _localctx = new MoreStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moreString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			stringVal();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137);
				match(WS);
				}
			}

			setState(140);
			match(T__2);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(141);
				match(WS);
				}
			}

			setState(144);
			stringVal();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(145);
				match(WS);
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public MoreIntContext moreInt() {
			return getRuleContext(MoreIntContext.class,0);
		}
		public MoreStringContext moreString() {
			return getRuleContext(MoreStringContext.class,0);
		}
		public TerminalNode Not() { return getToken(myLangParser.Not, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Not) {
				{
				setState(148);
				match(Not);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(149);
					match(WS);
					}
				}

				}
			}

			setState(154);
			match(T__3);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(155);
				moreInt();
				}
				break;
			case 2:
				{
				setState(156);
				moreString();
				}
				break;
			}
			setState(159);
			match(T__4);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(160);
				match(WS);
				}
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__5);
			setState(164);
			match(WS);
			{
			setState(165);
			condition();
			}
			setState(166);
			block();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(167);
				match(WS);
				}
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(myLangParser.Print, 0); }
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public TerminalNode Number() { return getToken(myLangParser.Number, 0); }
		public TerminalNode StringValue() { return getToken(myLangParser.StringValue, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Print);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(171);
				match(WS);
				}
			}

			setState(174);
			match(T__3);
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << VarName) | (1L << StringValue))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(176);
				match(WS);
				}
			}

			setState(179);
			match(T__4);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(180);
				match(WS);
				}
			}

			setState(183);
			match(T__0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(184);
				match(WS);
				}
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

	public static class GotoOpContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(myLangParser.Goto, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public GotoOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterGotoOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitGotoOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitGotoOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoOpContext gotoOp() throws RecognitionException {
		GotoOpContext _localctx = new GotoOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gotoOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Goto);
			setState(188);
			match(WS);
			setState(189);
			match(VarName);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(190);
				match(WS);
				}
			}

			setState(193);
			match(T__0);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(194);
				match(WS);
				}
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(myLangParser.VarName, 0); }
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(VarName);
			setState(198);
			match(T__6);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(199);
				match(WS);
				}
			}

			setState(202);
			match(T__0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(203);
				match(WS);
				}
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

	public static class LoopContext extends ParserRuleContext {
		public MoreIntContext moreInt() {
			return getRuleContext(MoreIntContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public TerminalNode Not() { return getToken(myLangParser.Not, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__7);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(207);
				match(WS);
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Not) {
				{
				setState(210);
				match(Not);
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(213);
				match(WS);
				}
			}

			setState(216);
			match(T__3);
			setState(217);
			moreInt();
			setState(218);
			match(T__4);
			setState(219);
			block();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(220);
				match(WS);
				}
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(myLangParser.WS, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<GotoOpContext> gotoOp() {
			return getRuleContexts(GotoOpContext.class);
		}
		public GotoOpContext gotoOp(int i) {
			return getRuleContext(GotoOpContext.class,i);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public List<IntDefContext> intDef() {
			return getRuleContexts(IntDefContext.class);
		}
		public IntDefContext intDef(int i) {
			return getRuleContext(IntDefContext.class,i);
		}
		public List<StringDefContext> stringDef() {
			return getRuleContexts(StringDefContext.class);
		}
		public StringDefContext stringDef(int i) {
			return getRuleContext(StringDefContext.class,i);
		}
		public List<IntAssignContext> intAssign() {
			return getRuleContexts(IntAssignContext.class);
		}
		public IntAssignContext intAssign(int i) {
			return getRuleContext(IntAssignContext.class,i);
		}
		public List<StringAssignContext> stringAssign() {
			return getRuleContexts(StringAssignContext.class);
		}
		public StringAssignContext stringAssign(int i) {
			return getRuleContext(StringAssignContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<IncContext> inc() {
			return getRuleContexts(IncContext.class);
		}
		public IncContext inc(int i) {
			return getRuleContext(IncContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public TerminalNode EOF() { return getToken(myLangParser.EOF, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__8);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(224);
					match(WS);
					}
				}

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__5 - -1)) | (1L << (T__7 - -1)) | (1L << (T__8 - -1)) | (1L << (Int - -1)) | (1L << (String - -1)) | (1L << (Print - -1)) | (1L << (Goto - -1)) | (1L << (VarName - -1)) | (1L << (Hash - -1)))) != 0)) {
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(227);
						label();
						}
						break;
					case 2:
						{
						setState(228);
						gotoOp();
						}
						break;
					case 3:
						{
						setState(229);
						varDec();
						}
						break;
					case 4:
						{
						setState(230);
						intDef();
						}
						break;
					case 5:
						{
						setState(231);
						stringDef();
						}
						break;
					case 6:
						{
						setState(232);
						intAssign();
						}
						break;
					case 7:
						{
						setState(233);
						stringAssign();
						}
						break;
					case 8:
						{
						setState(234);
						ifStatement();
						}
						break;
					case 9:
						{
						setState(235);
						print();
						}
						break;
					case 10:
						{
						setState(236);
						block();
						}
						break;
					case 11:
						{
						setState(237);
						inc();
						}
						break;
					case 12:
						{
						setState(238);
						loop();
						}
						break;
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__9);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(myLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myLangParser.WS, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLangListener ) ((myLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myLangVisitor ) return ((myLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(248);
				match(WS);
				}
			}

			setState(251);
			match(T__10);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(252);
				match(WS);
				}
			}

			setState(255);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3"+
		"\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\5\6Q\n\6\3\6\3\6\5\6"+
		"U\n\6\3\6\3\6\5\6Y\n\6\3\7\3\7\5\7]\n\7\3\7\3\7\5\7a\n\7\3\7\3\7\5\7e"+
		"\n\7\3\7\3\7\5\7i\n\7\3\b\3\b\5\bm\n\b\3\b\3\b\5\bq\n\b\3\b\3\b\5\bu\n"+
		"\b\3\b\3\b\5\by\n\b\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u0081\n\13\3\13\3\13"+
		"\5\13\u0085\n\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\5\f\u008d\n\f\3\f\3"+
		"\f\5\f\u0091\n\f\3\f\3\f\5\f\u0095\n\f\3\r\3\r\5\r\u0099\n\r\5\r\u009b"+
		"\n\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00ab\n\16\3\17\3\17\5\17\u00af\n\17\3\17\3\17\3\17\5\17"+
		"\u00b4\n\17\3\17\3\17\5\17\u00b8\n\17\3\17\3\17\5\17\u00bc\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u00c2\n\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21\3\21"+
		"\5\21\u00cb\n\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\5\22\u00d3\n\22\3"+
		"\22\5\22\u00d6\n\22\3\22\5\22\u00d9\n\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00e0\n\22\3\23\3\23\5\23\u00e4\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3"+
		"\23\3\23\5\23\u00f9\n\23\3\24\5\24\u00fc\n\24\3\24\3\24\5\24\u0100\n\24"+
		"\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6"+
		"\3\2\16\17\4\2\26\26\30\30\3\2\25\26\4\2\25\26\30\30\2\u0128\2(\3\2\2"+
		"\2\4\61\3\2\2\2\6\63\3\2\2\2\b:\3\2\2\2\nH\3\2\2\2\fZ\3\2\2\2\16j\3\2"+
		"\2\2\20z\3\2\2\2\22|\3\2\2\2\24~\3\2\2\2\26\u008a\3\2\2\2\30\u009a\3\2"+
		"\2\2\32\u00a5\3\2\2\2\34\u00ac\3\2\2\2\36\u00bd\3\2\2\2 \u00c7\3\2\2\2"+
		"\"\u00d0\3\2\2\2$\u00f8\3\2\2\2&\u00fb\3\2\2\2()\7\27\2\2)+\7\26\2\2*"+
		",\7\23\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\3\2\2.\60\7\23\2\2/.\3\2"+
		"\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\t\2\2\2\62\5\3\2\2\2\63\64\5\4\3\2"+
		"\64\65\7\23\2\2\65\66\7\26\2\2\668\7\3\2\2\679\7\23\2\28\67\3\2\2\289"+
		"\3\2\2\29\7\3\2\2\2:;\7\17\2\2;<\7\23\2\2<=\7\26\2\2=>\7\23\2\2>?\7\4"+
		"\2\2?@\7\23\2\2@B\t\3\2\2AC\7\23\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7"+
		"\3\2\2EG\7\23\2\2FE\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HI\7\16\2\2IJ\7\23\2\2"+
		"JL\7\26\2\2KM\7\23\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7\4\2\2OQ\7\23"+
		"\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\t\4\2\2SU\7\23\2\2TS\3\2\2\2TU\3"+
		"\2\2\2UV\3\2\2\2VX\7\3\2\2WY\7\23\2\2XW\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2"+
		"Z\\\7\26\2\2[]\7\23\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\4\2\2_a\7"+
		"\23\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\t\4\2\2ce\7\23\2\2dc\3\2\2\2d"+
		"e\3\2\2\2ef\3\2\2\2fh\7\3\2\2gi\7\23\2\2hg\3\2\2\2hi\3\2\2\2i\r\3\2\2"+
		"\2jl\7\26\2\2km\7\23\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\4\2\2oq\7\23"+
		"\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\t\3\2\2su\7\23\2\2ts\3\2\2\2tu\3"+
		"\2\2\2uv\3\2\2\2vx\7\3\2\2wy\7\23\2\2xw\3\2\2\2xy\3\2\2\2y\17\3\2\2\2"+
		"z{\t\4\2\2{\21\3\2\2\2|}\t\3\2\2}\23\3\2\2\2~\u0080\5\20\t\2\177\u0081"+
		"\7\23\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\7\5\2\2\u0083\u0085\7\23\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\5\20\t\2\u0087\u0089\7\23\2\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a\u008c\5\22\n"+
		"\2\u008b\u008d\7\23\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\7\5\2\2\u008f\u0091\7\23\2\2\u0090\u008f\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\5\22\n\2\u0093"+
		"\u0095\7\23\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2"+
		"\2\u0096\u0098\7\22\2\2\u0097\u0099\7\23\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009f\7\6\2\2\u009d\u00a0\5\24\13\2\u009e"+
		"\u00a0\5\26\f\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a3\7\7\2\2\u00a2\u00a4\7\23\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\7\23\2"+
		"\2\u00a7\u00a8\5\30\r\2\u00a8\u00aa\5$\23\2\u00a9\u00ab\7\23\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ae\7\20\2"+
		"\2\u00ad\u00af\7\23\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\6\2\2\u00b1\u00b3\t\5\2\2\u00b2\u00b4\7\23"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\7\7\2\2\u00b6\u00b8\7\23\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\3\2\2\u00ba\u00bc\7\23\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\35\3\2\2\2\u00bd\u00be\7\21\2"+
		"\2\u00be\u00bf\7\23\2\2\u00bf\u00c1\7\26\2\2\u00c0\u00c2\7\23\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\7\3"+
		"\2\2\u00c4\u00c6\7\23\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\37\3\2\2\2\u00c7\u00c8\7\26\2\2\u00c8\u00ca\7\t\2\2\u00c9\u00cb\7\23"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\7\3\2\2\u00cd\u00cf\7\23\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf!\3\2\2\2\u00d0\u00d2\7\n\2\2\u00d1\u00d3\7\23\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\7\22\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9"+
		"\7\23\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\7\6\2\2\u00db\u00dc\5\24\13\2\u00dc\u00dd\7\7\2\2\u00dd\u00df"+
		"\5$\23\2\u00de\u00e0\7\23\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0#\3\2\2\2\u00e1\u00e3\7\13\2\2\u00e2\u00e4\7\23\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00f3\3\2\2\2\u00e5\u00f2\5\2\2\2\u00e6"+
		"\u00f2\5\36\20\2\u00e7\u00f2\5\6\4\2\u00e8\u00f2\5\n\6\2\u00e9\u00f2\5"+
		"\b\5\2\u00ea\u00f2\5\f\7\2\u00eb\u00f2\5\16\b\2\u00ec\u00f2\5\32\16\2"+
		"\u00ed\u00f2\5\34\17\2\u00ee\u00f2\5$\23\2\u00ef\u00f2\5 \21\2\u00f0\u00f2"+
		"\5\"\22\2\u00f1\u00e5\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00e7\3\2\2\2"+
		"\u00f1\u00e8\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00eb"+
		"\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f9\7\f\2\2\u00f7\u00f9\7\2\2\3\u00f8\u00e1\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9%\3\2\2\2\u00fa\u00fc\7\23\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7\r\2\2\u00fe\u0100\7\23\2\2"+
		"\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\5$\23\2\u0102\'\3\2\2\2\60+/8BFLPTX\\`dhlptx\u0080\u0084\u0088\u008c"+
		"\u0090\u0094\u0098\u009a\u009f\u00a3\u00aa\u00ae\u00b3\u00b7\u00bb\u00c1"+
		"\u00c5\u00ca\u00ce\u00d2\u00d5\u00d8\u00df\u00e3\u00f1\u00f3\u00f8\u00fb"+
		"\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}