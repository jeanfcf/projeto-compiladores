// Generated from tableGen.g4 by ANTLR 4.9.2
package tablegen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tableGenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ATRIB=15, PV=16, TRUE=17, 
		VAR=18, NUM=19, STRING=20, APAR=21, FPAR=22, VIR=23, SPACES=24;
	public static final int
		RULE_start = 0, RULE_dec = 1, RULE_com = 2, RULE_columns = 3, RULE_rows = 4, 
		RULE_title = 5, RULE_header = 6, RULE_footer = 7, RULE_labels = 8, RULE_content = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dec", "com", "columns", "rows", "title", "header", "footer", 
			"labels", "content"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'table'", "':'", "'{'", "'}'", "'show'", "'columns'", "'rows'", 
			"'title'", "'header'", "'footer'", "'labels'", "'['", "']'", "'contentFooter'", 
			"'='", "';'", "'true'", null, null, null, "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ATRIB", "PV", "TRUE", "VAR", "NUM", "STRING", "APAR", 
			"FPAR", "VIR", "SPACES"
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
	public String getGrammarFileName() { return "tableGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tableGenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tableGenParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				dec();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(26);
				com();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(tableGenParser.VAR, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public TerminalNode PV() { return getToken(tableGenParser.PV, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			match(VAR);
			setState(37);
			match(T__2);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(38);
				header();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(41);
				labels();
				}
			}

			setState(44);
			columns();
			setState(45);
			rows();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(46);
				footer();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(49);
				content();
				}
			}

			setState(52);
			match(T__3);
			setState(53);
			match(PV);
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

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowContext extends ComContext {
		public TerminalNode APAR() { return getToken(tableGenParser.APAR, 0); }
		public TerminalNode VAR() { return getToken(tableGenParser.VAR, 0); }
		public TerminalNode FPAR() { return getToken(tableGenParser.FPAR, 0); }
		public TerminalNode PV() { return getToken(tableGenParser.PV, 0); }
		public ShowContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitShow(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_com);
		try {
			_localctx = new ShowContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			match(APAR);
			setState(57);
			match(VAR);
			setState(58);
			match(FPAR);
			setState(59);
			match(PV);
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

	public static class ColumnsContext extends ParserRuleContext {
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
	 
		public ColumnsContext() { }
		public void copyFrom(ColumnsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColunaContext extends ColumnsContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public TerminalNode NUM() { return getToken(tableGenParser.NUM, 0); }
		public TerminalNode VIR() { return getToken(tableGenParser.VIR, 0); }
		public ColunaContext(ColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterColuna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitColuna(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columns);
		int _la;
		try {
			_localctx = new ColunaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
			setState(62);
			match(ATRIB);
			setState(63);
			match(NUM);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(64);
				match(VIR);
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

	public static class RowsContext extends ParserRuleContext {
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
	 
		public RowsContext() { }
		public void copyFrom(RowsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LinhaContext extends RowsContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public TerminalNode NUM() { return getToken(tableGenParser.NUM, 0); }
		public TerminalNode VIR() { return getToken(tableGenParser.VIR, 0); }
		public LinhaContext(RowsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitLinha(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rows);
		int _la;
		try {
			_localctx = new LinhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			match(ATRIB);
			setState(69);
			match(NUM);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(70);
				match(VIR);
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

	public static class TitleContext extends ParserRuleContext {
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	 
		public TitleContext() { }
		public void copyFrom(TitleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TitContext extends TitleContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public TerminalNode STRING() { return getToken(tableGenParser.STRING, 0); }
		public TerminalNode VIR() { return getToken(tableGenParser.VIR, 0); }
		public TitContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterTit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitTit(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_title);
		int _la;
		try {
			_localctx = new TitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__7);
			setState(74);
			match(ATRIB);
			setState(75);
			match(STRING);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(76);
				match(VIR);
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

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	 
		public HeaderContext() { }
		public void copyFrom(HeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeadContext extends HeaderContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public TerminalNode TRUE() { return getToken(tableGenParser.TRUE, 0); }
		public TerminalNode VIR() { return getToken(tableGenParser.VIR, 0); }
		public HeadContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitHead(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header);
		int _la;
		try {
			_localctx = new HeadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__8);
			setState(80);
			match(ATRIB);
			setState(81);
			match(TRUE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(82);
				match(VIR);
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

	public static class FooterContext extends ParserRuleContext {
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
	 
		public FooterContext() { }
		public void copyFrom(FooterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FootContext extends FooterContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public TerminalNode TRUE() { return getToken(tableGenParser.TRUE, 0); }
		public TerminalNode VIR() { return getToken(tableGenParser.VIR, 0); }
		public FootContext(FooterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterFoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitFoot(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_footer);
		int _la;
		try {
			_localctx = new FootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__9);
			setState(86);
			match(ATRIB);
			setState(87);
			match(TRUE);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(88);
				match(VIR);
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

	public static class LabelsContext extends ParserRuleContext {
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
	 
		public LabelsContext() { }
		public void copyFrom(LabelsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LabContext extends LabelsContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public List<TerminalNode> STRING() { return getTokens(tableGenParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tableGenParser.STRING, i);
		}
		public List<TerminalNode> VIR() { return getTokens(tableGenParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(tableGenParser.VIR, i);
		}
		public LabContext(LabelsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterLab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitLab(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		LabelsContext _localctx = new LabelsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_labels);
		int _la;
		try {
			_localctx = new LabContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__10);
			setState(92);
			match(ATRIB);
			setState(93);
			match(T__11);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(94);
				match(STRING);
				setState(95);
				match(VIR);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__12);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(102);
				match(VIR);
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

	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConContext extends ContentContext {
		public TerminalNode ATRIB() { return getToken(tableGenParser.ATRIB, 0); }
		public List<TerminalNode> STRING() { return getTokens(tableGenParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tableGenParser.STRING, i);
		}
		public List<TerminalNode> VIR() { return getTokens(tableGenParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(tableGenParser.VIR, i);
		}
		public ConContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).enterCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tableGenListener ) ((tableGenListener)listener).exitCon(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_content);
		int _la;
		try {
			_localctx = new ConContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__13);
			setState(106);
			match(ATRIB);
			setState(107);
			match(T__11);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(108);
				match(STRING);
				setState(109);
				match(VIR);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__12);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIR) {
				{
				setState(116);
				match(VIR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\5\3-\n\3\3\3\3\3\3\3\5\3\62\n\3\3\3\5"+
		"\3\65\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5D\n\5"+
		"\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\5\b"+
		"V\n\b\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\7\nc\n\n\f\n\16\n"+
		"f\13\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\7\13q\n\13\f\13\16\13"+
		"t\13\13\3\13\3\13\5\13x\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2"+
		"~\2\31\3\2\2\2\4$\3\2\2\2\69\3\2\2\2\b?\3\2\2\2\nE\3\2\2\2\fK\3\2\2\2"+
		"\16Q\3\2\2\2\20W\3\2\2\2\22]\3\2\2\2\24k\3\2\2\2\26\30\5\4\3\2\27\26\3"+
		"\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3"+
		"\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2"+
		"\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$%\7\3\2\2%&\7\4\2\2&\'"+
		"\7\24\2\2\')\7\5\2\2(*\5\16\b\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\22\n"+
		"\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\b\5\2/\61\5\n\6\2\60\62\5\20\t\2"+
		"\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\65\5\24\13\2\64\63\3\2\2"+
		"\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\6\2\2\678\7\22\2\28\5\3\2\2\29"+
		":\7\7\2\2:;\7\27\2\2;<\7\24\2\2<=\7\30\2\2=>\7\22\2\2>\7\3\2\2\2?@\7\b"+
		"\2\2@A\7\21\2\2AC\7\25\2\2BD\7\31\2\2CB\3\2\2\2CD\3\2\2\2D\t\3\2\2\2E"+
		"F\7\t\2\2FG\7\21\2\2GI\7\25\2\2HJ\7\31\2\2IH\3\2\2\2IJ\3\2\2\2J\13\3\2"+
		"\2\2KL\7\n\2\2LM\7\21\2\2MO\7\26\2\2NP\7\31\2\2ON\3\2\2\2OP\3\2\2\2P\r"+
		"\3\2\2\2QR\7\13\2\2RS\7\21\2\2SU\7\23\2\2TV\7\31\2\2UT\3\2\2\2UV\3\2\2"+
		"\2V\17\3\2\2\2WX\7\f\2\2XY\7\21\2\2Y[\7\23\2\2Z\\\7\31\2\2[Z\3\2\2\2["+
		"\\\3\2\2\2\\\21\3\2\2\2]^\7\r\2\2^_\7\21\2\2_d\7\16\2\2`a\7\26\2\2ac\7"+
		"\31\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi"+
		"\7\17\2\2hj\7\31\2\2ih\3\2\2\2ij\3\2\2\2j\23\3\2\2\2kl\7\20\2\2lm\7\21"+
		"\2\2mr\7\16\2\2no\7\26\2\2oq\7\31\2\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs"+
		"\3\2\2\2su\3\2\2\2tr\3\2\2\2uw\7\17\2\2vx\7\31\2\2wv\3\2\2\2wx\3\2\2\2"+
		"x\25\3\2\2\2\21\31\37),\61\64CIOU[dirw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}