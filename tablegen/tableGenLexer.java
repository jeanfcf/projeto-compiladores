// Generated from tableGen.g4 by ANTLR 4.9.2
package tablegen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tableGenLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ATRIB=15, PV=16, TRUE=17, 
		VAR=18, NUM=19, STRING=20, APAR=21, FPAR=22, VIR=23, SPACES=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ATRIB", "PV", "TRUE", "VAR", 
			"NUM", "STRING", "APAR", "FPAR", "VIR", "SPACES"
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


	public tableGenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tableGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u0089\n\23\r\23\16\23\u008a\3\24\5"+
		"\24\u008e\n\24\3\24\6\24\u0091\n\24\r\24\16\24\u0092\3\25\3\25\3\25\3"+
		"\25\7\25\u0099\n\25\f\25\16\25\u009c\13\25\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\3\2\6\3\2c|\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\2\u00ad\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\3\63\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2"+
		"\2\rD\3\2\2\2\17L\3\2\2\2\21Q\3\2\2\2\23W\3\2\2\2\25^\3\2\2\2\27e\3\2"+
		"\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0082"+
		"\3\2\2\2%\u0088\3\2\2\2\'\u008d\3\2\2\2)\u0094\3\2\2\2+\u009f\3\2\2\2"+
		"-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\64\7v\2\2\64\65\7c"+
		"\2\2\65\66\7d\2\2\66\67\7n\2\2\678\7g\2\28\4\3\2\2\29:\7<\2\2:\6\3\2\2"+
		"\2;<\7}\2\2<\b\3\2\2\2=>\7\177\2\2>\n\3\2\2\2?@\7u\2\2@A\7j\2\2AB\7q\2"+
		"\2BC\7y\2\2C\f\3\2\2\2DE\7e\2\2EF\7q\2\2FG\7n\2\2GH\7w\2\2HI\7o\2\2IJ"+
		"\7p\2\2JK\7u\2\2K\16\3\2\2\2LM\7t\2\2MN\7q\2\2NO\7y\2\2OP\7u\2\2P\20\3"+
		"\2\2\2QR\7v\2\2RS\7k\2\2ST\7v\2\2TU\7n\2\2UV\7g\2\2V\22\3\2\2\2WX\7j\2"+
		"\2XY\7g\2\2YZ\7c\2\2Z[\7f\2\2[\\\7g\2\2\\]\7t\2\2]\24\3\2\2\2^_\7h\2\2"+
		"_`\7q\2\2`a\7q\2\2ab\7v\2\2bc\7g\2\2cd\7t\2\2d\26\3\2\2\2ef\7n\2\2fg\7"+
		"c\2\2gh\7d\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2k\30\3\2\2\2lm\7]\2\2m\32\3\2"+
		"\2\2no\7_\2\2o\34\3\2\2\2pq\7e\2\2qr\7q\2\2rs\7p\2\2st\7v\2\2tu\7g\2\2"+
		"uv\7p\2\2vw\7v\2\2wx\7H\2\2xy\7q\2\2yz\7q\2\2z{\7v\2\2{|\7g\2\2|}\7t\2"+
		"\2}\36\3\2\2\2~\177\7?\2\2\177 \3\2\2\2\u0080\u0081\7=\2\2\u0081\"\3\2"+
		"\2\2\u0082\u0083\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7w\2\2\u0085\u0086"+
		"\7g\2\2\u0086$\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b&\3\2\2\2\u008c"+
		"\u008e\7/\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093(\3\2\2\2\u0094\u009a\7$\2\2\u0095"+
		"\u0099\n\4\2\2\u0096\u0097\7^\2\2\u0097\u0099\7$\2\2\u0098\u0095\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e"+
		"*\3\2\2\2\u009f\u00a0\7*\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2."+
		"\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\t\5\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\b\31\2\2\u00a8\62\3\2\2\2\b\2\u008a\u008d\u0092"+
		"\u0098\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}