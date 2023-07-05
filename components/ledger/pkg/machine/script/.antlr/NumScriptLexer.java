// Generated from /home/phlimy/Projects/Contrib/stack/components/ledger/pkg/machine/script/NumScript.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NEWLINE=7, WHITESPACE=8, 
		MULTILINE_COMMENT=9, LINE_COMMENT=10, VARS=11, META=12, SET_TX_META=13, 
		SET_ACCOUNT_META=14, PRINT=15, FAIL=16, SEND=17, SOURCE=18, FROM=19, MAX=20, 
		DESTINATION=21, TO=22, ALLOCATE=23, OP_ADD=24, OP_SUB=25, LPAREN=26, RPAREN=27, 
		LBRACK=28, RBRACK=29, LBRACE=30, RBRACE=31, EQ=32, NEQ=33, LT=34, LTE=35, 
		GT=36, GTE=37, OP_AND=38, OP_OR=39, OP_NOT=40, TY_ACCOUNT=41, TY_ASSET=42, 
		TY_NUMBER=43, TY_MONETARY=44, TY_PORTION=45, TY_STRING=46, TY_BOOL=47, 
		STRING=48, PORTION=49, REMAINING=50, KEPT=51, BALANCE=52, SAVE=53, NUMBER=54, 
		PERCENT=55, VARIABLE_NAME=56, ACCOUNT=57, ASSET=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NEWLINE", "WHITESPACE", 
			"MULTILINE_COMMENT", "LINE_COMMENT", "VARS", "META", "SET_TX_META", "SET_ACCOUNT_META", 
			"PRINT", "FAIL", "SEND", "SOURCE", "FROM", "MAX", "DESTINATION", "TO", 
			"ALLOCATE", "OP_ADD", "OP_SUB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"LBRACE", "RBRACE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "OP_AND", 
			"OP_OR", "OP_NOT", "TY_ACCOUNT", "TY_ASSET", "TY_NUMBER", "TY_MONETARY", 
			"TY_PORTION", "TY_STRING", "TY_BOOL", "STRING", "PORTION", "REMAINING", 
			"KEPT", "BALANCE", "SAVE", "NUMBER", "PERCENT", "VARIABLE_NAME", "ACCOUNT", 
			"ASSET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'?'", "':'", "'allowing overdraft up to'", "'allowing unbounded overdraft'", 
			"','", null, null, null, null, "'vars'", "'meta'", "'set_tx_meta'", "'set_account_meta'", 
			"'print'", "'fail'", "'send'", "'source'", "'from'", "'max'", "'destination'", 
			"'to'", "'allocate'", "'+'", "'-'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'!'", 
			"'account'", "'asset'", "'number'", "'monetary'", "'portion'", "'string'", 
			"'bool'", null, null, "'remaining'", "'kept'", "'balance'", "'save'", 
			null, "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NEWLINE", "WHITESPACE", "MULTILINE_COMMENT", 
			"LINE_COMMENT", "VARS", "META", "SET_TX_META", "SET_ACCOUNT_META", "PRINT", 
			"FAIL", "SEND", "SOURCE", "FROM", "MAX", "DESTINATION", "TO", "ALLOCATE", 
			"OP_ADD", "OP_SUB", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "OP_AND", "OP_OR", "OP_NOT", 
			"TY_ACCOUNT", "TY_ASSET", "TY_NUMBER", "TY_MONETARY", "TY_PORTION", "TY_STRING", 
			"TY_BOOL", "STRING", "PORTION", "REMAINING", "KEPT", "BALANCE", "SAVE", 
			"NUMBER", "PERCENT", "VARIABLE_NAME", "ACCOUNT", "ASSET"
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


	public NumScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NumScript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\b\u00b7\n\b\r\b\16\b\u00b8\3\t\6\t\u00bc"+
		"\n\t\r\t\16\t\u00bd\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c7\n\n\f\n\16\n"+
		"\u00ca\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00d5\n\13\f"+
		"\13\16\13\u00d8\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&"+
		"\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0198"+
		"\n\61\f\61\16\61\u019b\13\61\3\61\3\61\3\62\6\62\u01a0\n\62\r\62\16\62"+
		"\u01a1\3\62\5\62\u01a5\n\62\3\62\3\62\5\62\u01a9\n\62\3\62\6\62\u01ac"+
		"\n\62\r\62\16\62\u01ad\3\62\6\62\u01b1\n\62\r\62\16\62\u01b2\3\62\3\62"+
		"\6\62\u01b7\n\62\r\62\16\62\u01b8\5\62\u01bb\n\62\3\62\5\62\u01be\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\6\67\u01dd\n\67\r\67\16\67\u01de\38\38\39\39\69\u01e5\n9\r9\169"+
		"\u01e6\39\79\u01ea\n9\f9\169\u01ed\139\3:\3:\6:\u01f1\n:\r:\16:\u01f2"+
		"\3:\7:\u01f6\n:\f:\16:\u01f9\13:\3;\6;\u01fc\n;\r;\16;\u01fd\4\u00c8\u00d6"+
		"\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<\3\2\f\4\2\f\f\17\17\4\2\13\13\"\"\b\2\"\"//\62;C\\aac|\3\2"+
		"\62;\3\2\"\"\4\2aac|\5\2\62;aac|\5\2C\\aac|\6\2\62<C\\aac|\4\2\61;C\\"+
		"\2\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y"+
		"\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\u0096\3\2\2\2\r\u00b3\3\2\2\2\17\u00b6"+
		"\3\2\2\2\21\u00bb\3\2\2\2\23\u00c1\3\2\2\2\25\u00d0\3\2\2\2\27\u00dd\3"+
		"\2\2\2\31\u00e2\3\2\2\2\33\u00e7\3\2\2\2\35\u00f3\3\2\2\2\37\u0104\3\2"+
		"\2\2!\u010a\3\2\2\2#\u010f\3\2\2\2%\u0114\3\2\2\2\'\u011b\3\2\2\2)\u0120"+
		"\3\2\2\2+\u0124\3\2\2\2-\u0130\3\2\2\2/\u0133\3\2\2\2\61\u013c\3\2\2\2"+
		"\63\u013e\3\2\2\2\65\u0140\3\2\2\2\67\u0142\3\2\2\29\u0144\3\2\2\2;\u0146"+
		"\3\2\2\2=\u0148\3\2\2\2?\u014a\3\2\2\2A\u014c\3\2\2\2C\u014e\3\2\2\2E"+
		"\u0151\3\2\2\2G\u0153\3\2\2\2I\u0156\3\2\2\2K\u0158\3\2\2\2M\u015b\3\2"+
		"\2\2O\u015e\3\2\2\2Q\u0161\3\2\2\2S\u0163\3\2\2\2U\u016b\3\2\2\2W\u0171"+
		"\3\2\2\2Y\u0178\3\2\2\2[\u0181\3\2\2\2]\u0189\3\2\2\2_\u0190\3\2\2\2a"+
		"\u0195\3\2\2\2c\u01bd\3\2\2\2e\u01bf\3\2\2\2g\u01c9\3\2\2\2i\u01ce\3\2"+
		"\2\2k\u01d6\3\2\2\2m\u01dc\3\2\2\2o\u01e0\3\2\2\2q\u01e2\3\2\2\2s\u01ee"+
		"\3\2\2\2u\u01fb\3\2\2\2wx\7,\2\2x\4\3\2\2\2yz\7A\2\2z\6\3\2\2\2{|\7<\2"+
		"\2|\b\3\2\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2"+
		"\u0081\u0082\7y\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7i\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7q\2\2\u0087\u0088\7x\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a\u008b\7f\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7c\2\2\u008d\u008e\7h\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7\"\2\2\u0090\u0091\7w\2\2\u0091\u0092\7r\2\2\u0092\u0093\7\"\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7q\2\2\u0095\n\3\2\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7n\2\2\u0099\u009a\7q\2\2\u009a\u009b\7y\2\2"+
		"\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7i\2\2\u009e\u009f"+
		"\7\"\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7d\2\2\u00a2"+
		"\u00a3\7q\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2"+
		"\u00a6\u00a7\7g\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7h\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4\16\3\2\2"+
		"\2\u00b5\u00b7\t\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\20\3\2\2\2\u00ba\u00bc\t\3\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\t\2\2\u00c0\22\3\2\2\2\u00c1\u00c2"+
		"\7\61\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c7\5\23\n\2"+
		"\u00c5\u00c7\13\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cf\b\n\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2"+
		"\7\61\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5\17\b\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\b\13\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7x\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7u\2\2\u00e1\30\3\2\2\2\u00e2\u00e3"+
		"\7o\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\32\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7a\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7z\2\2\u00ed\u00ee\7a\2\2"+
		"\u00ee\u00ef\7o\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2\34\3\2\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7e\2\2\u00f9"+
		"\u00fa\7e\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7p\2\2"+
		"\u00fd\u00fe\7v\2\2\u00fe\u00ff\7a\2\2\u00ff\u0100\7o\2\2\u0100\u0101"+
		"\7g\2\2\u0101\u0102\7v\2\2\u0102\u0103\7c\2\2\u0103\36\3\2\2\2\u0104\u0105"+
		"\7r\2\2\u0105\u0106\7t\2\2\u0106\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7v\2\2\u0109 \3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7k\2\2\u010d\u010e\7n\2\2\u010e\"\3\2\2\2\u010f\u0110\7u\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7p\2\2\u0112\u0113\7f\2\2\u0113$\3\2\2\2\u0114"+
		"\u0115\7u\2\2\u0115\u0116\7q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7e\2\2\u0119\u011a\7g\2\2\u011a&\3\2\2\2\u011b\u011c\7h\2"+
		"\2\u011c\u011d\7t\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011f(\3\2"+
		"\2\2\u0120\u0121\7o\2\2\u0121\u0122\7c\2\2\u0122\u0123\7z\2\2\u0123*\3"+
		"\2\2\2\u0124\u0125\7f\2\2\u0125\u0126\7g\2\2\u0126\u0127\7u\2\2\u0127"+
		"\u0128\7v\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b\7c\2\2"+
		"\u012b\u012c\7v\2\2\u012c\u012d\7k\2\2\u012d\u012e\7q\2\2\u012e\u012f"+
		"\7p\2\2\u012f,\3\2\2\2\u0130\u0131\7v\2\2\u0131\u0132\7q\2\2\u0132.\3"+
		"\2\2\2\u0133\u0134\7c\2\2\u0134\u0135\7n\2\2\u0135\u0136\7n\2\2\u0136"+
		"\u0137\7q\2\2\u0137\u0138\7e\2\2\u0138\u0139\7c\2\2\u0139\u013a\7v\2\2"+
		"\u013a\u013b\7g\2\2\u013b\60\3\2\2\2\u013c\u013d\7-\2\2\u013d\62\3\2\2"+
		"\2\u013e\u013f\7/\2\2\u013f\64\3\2\2\2\u0140\u0141\7*\2\2\u0141\66\3\2"+
		"\2\2\u0142\u0143\7+\2\2\u01438\3\2\2\2\u0144\u0145\7]\2\2\u0145:\3\2\2"+
		"\2\u0146\u0147\7_\2\2\u0147<\3\2\2\2\u0148\u0149\7}\2\2\u0149>\3\2\2\2"+
		"\u014a\u014b\7\177\2\2\u014b@\3\2\2\2\u014c\u014d\7?\2\2\u014dB\3\2\2"+
		"\2\u014e\u014f\7#\2\2\u014f\u0150\7?\2\2\u0150D\3\2\2\2\u0151\u0152\7"+
		">\2\2\u0152F\3\2\2\2\u0153\u0154\7>\2\2\u0154\u0155\7?\2\2\u0155H\3\2"+
		"\2\2\u0156\u0157\7@\2\2\u0157J\3\2\2\2\u0158\u0159\7@\2\2\u0159\u015a"+
		"\7?\2\2\u015aL\3\2\2\2\u015b\u015c\7(\2\2\u015c\u015d\7(\2\2\u015dN\3"+
		"\2\2\2\u015e\u015f\7~\2\2\u015f\u0160\7~\2\2\u0160P\3\2\2\2\u0161\u0162"+
		"\7#\2\2\u0162R\3\2\2\2\u0163\u0164\7c\2\2\u0164\u0165\7e\2\2\u0165\u0166"+
		"\7e\2\2\u0166\u0167\7q\2\2\u0167\u0168\7w\2\2\u0168\u0169\7p\2\2\u0169"+
		"\u016a\7v\2\2\u016aT\3\2\2\2\u016b\u016c\7c\2\2\u016c\u016d\7u\2\2\u016d"+
		"\u016e\7u\2\2\u016e\u016f\7g\2\2\u016f\u0170\7v\2\2\u0170V\3\2\2\2\u0171"+
		"\u0172\7p\2\2\u0172\u0173\7w\2\2\u0173\u0174\7o\2\2\u0174\u0175\7d\2\2"+
		"\u0175\u0176\7g\2\2\u0176\u0177\7t\2\2\u0177X\3\2\2\2\u0178\u0179\7o\2"+
		"\2\u0179\u017a\7q\2\2\u017a\u017b\7p\2\2\u017b\u017c\7g\2\2\u017c\u017d"+
		"\7v\2\2\u017d\u017e\7c\2\2\u017e\u017f\7t\2\2\u017f\u0180\7{\2\2\u0180"+
		"Z\3\2\2\2\u0181\u0182\7r\2\2\u0182\u0183\7q\2\2\u0183\u0184\7t\2\2\u0184"+
		"\u0185\7v\2\2\u0185\u0186\7k\2\2\u0186\u0187\7q\2\2\u0187\u0188\7p\2\2"+
		"\u0188\\\3\2\2\2\u0189\u018a\7u\2\2\u018a\u018b\7v\2\2\u018b\u018c\7t"+
		"\2\2\u018c\u018d\7k\2\2\u018d\u018e\7p\2\2\u018e\u018f\7i\2\2\u018f^\3"+
		"\2\2\2\u0190\u0191\7d\2\2\u0191\u0192\7q\2\2\u0192\u0193\7q\2\2\u0193"+
		"\u0194\7n\2\2\u0194`\3\2\2\2\u0195\u0199\7$\2\2\u0196\u0198\t\4\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7$\2\2\u019d"+
		"b\3\2\2\2\u019e\u01a0\t\5\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2"+
		"\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5"+
		"\t\6\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\7\61\2\2\u01a7\u01a9\t\6\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\t\5\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01be\3\2"+
		"\2\2\u01af\u01b1\t\5\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01ba\3\2\2\2\u01b4\u01b6\7\60"+
		"\2\2\u01b5\u01b7\t\5\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b4\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\7\'\2\2\u01bd"+
		"\u019f\3\2\2\2\u01bd\u01b0\3\2\2\2\u01bed\3\2\2\2\u01bf\u01c0\7t\2\2\u01c0"+
		"\u01c1\7g\2\2\u01c1\u01c2\7o\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7k\2\2"+
		"\u01c4\u01c5\7p\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8"+
		"\7i\2\2\u01c8f\3\2\2\2\u01c9\u01ca\7m\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc"+
		"\7r\2\2\u01cc\u01cd\7v\2\2\u01cdh\3\2\2\2\u01ce\u01cf\7d\2\2\u01cf\u01d0"+
		"\7c\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3\7p\2\2\u01d3"+
		"\u01d4\7e\2\2\u01d4\u01d5\7g\2\2\u01d5j\3\2\2\2\u01d6\u01d7\7u\2\2\u01d7"+
		"\u01d8\7c\2\2\u01d8\u01d9\7x\2\2\u01d9\u01da\7g\2\2\u01dal\3\2\2\2\u01db"+
		"\u01dd\t\5\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01dfn\3\2\2\2\u01e0\u01e1\7\'\2\2\u01e1p\3\2"+
		"\2\2\u01e2\u01e4\7&\2\2\u01e3\u01e5\t\7\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\3\2"+
		"\2\2\u01e8\u01ea\t\b\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecr\3\2\2\2\u01ed\u01eb\3\2\2\2"+
		"\u01ee\u01f0\7B\2\2\u01ef\u01f1\t\t\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f7\3\2\2\2\u01f4"+
		"\u01f6\t\n\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8t\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc"+
		"\t\13\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2"+
		"\u01fd\u01fe\3\2\2\2\u01fev\3\2\2\2\27\2\u00b8\u00bd\u00c6\u00c8\u00d6"+
		"\u0199\u01a1\u01a4\u01a8\u01ad\u01b2\u01b8\u01ba\u01bd\u01de\u01e6\u01eb"+
		"\u01f2\u01f7\u01fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}