// Generated from slash.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class slashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, FLOAT=4, INT=5, ID=6, STRING=7, CLASS=8, 
		PACKAGE=9, LOOP=10, WHILE=11, FOR=12, IF=13, ELSE=14, BREAK=15, CONTINUE=16, 
		IMPORT=17, AUTO=18, RANGE=19, ARROW=20, CAST=21, DYN_CAST=22, LPAREN=23, 
		RPAREN=24, LBRACK=25, RBRACK=26, LBRACE=27, RBRACE=28, CMP_LESS=29, CMP_LESS_EQ=30, 
		CMP_GREA=31, CMP_GREA_EQ=32, LSHIFT=33, RSHIFT=34, EQUALS=35, SAME=36, 
		NOT_EQUALS=37, NOT_SAME=38, PLUS=39, DPLUS=40, MINUS=41, DMINUS=42, MUL=43, 
		DIV=44, MOD=45, AND=46, OR=47, DAND=48, DOR=49, XOR=50, NOT=51, TILDE=52, 
		QMARK=53, DCOLON=54, COLON=55, SEMI=56, COMMA=57, ASSIGN=58, MUL_ASSIGN=59, 
		DIV_ASSIGN=60, MOD_ASSIGN=61, PLUS_ASSIGN=62, MINUS_ASSIGN=63, LSHIFT_ASSIGN=64, 
		RSHIFT_ASSIGN=65, AND_ASSIGN=66, OR_ASSIGN=67, XOR_ASSIGN=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "LINE_COMMENT", "WS", "FLOAT", "INT", "ID", "STRING", "ESC", 
			"UNICODE", "HEX", "CLASS", "PACKAGE", "LOOP", "WHILE", "FOR", "IF", "ELSE", 
			"BREAK", "CONTINUE", "IMPORT", "AUTO", "RANGE", "ARROW", "CAST", "DYN_CAST", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "CMP_LESS", 
			"CMP_LESS_EQ", "CMP_GREA", "CMP_GREA_EQ", "LSHIFT", "RSHIFT", "EQUALS", 
			"SAME", "NOT_EQUALS", "NOT_SAME", "PLUS", "DPLUS", "MINUS", "DMINUS", 
			"MUL", "DIV", "MOD", "AND", "OR", "DAND", "DOR", "XOR", "NOT", "TILDE", 
			"QMARK", "DCOLON", "COLON", "SEMI", "COMMA", "ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'class'", "'package'", 
			"'loop'", "'while'", "'for'", "'if'", "'else'", "'break'", "'continue'", 
			"'import '", "'auto'", "'..'", "'->'", "'=>'", "'=?>'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", 
			"'=='", "'==='", "'!='", "'!=='", "'+'", "'++'", "'-'", "'--'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", 
			"'::'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'|='", "'^='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "FLOAT", "INT", "ID", "STRING", 
			"CLASS", "PACKAGE", "LOOP", "WHILE", "FOR", "IF", "ELSE", "BREAK", "CONTINUE", 
			"IMPORT", "AUTO", "RANGE", "ARROW", "CAST", "DYN_CAST", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "CMP_LESS", "CMP_LESS_EQ", "CMP_GREA", 
			"CMP_GREA_EQ", "LSHIFT", "RSHIFT", "EQUALS", "SAME", "NOT_EQUALS", "NOT_SAME", 
			"PLUS", "DPLUS", "MINUS", "DMINUS", "MUL", "DIV", "MOD", "AND", "OR", 
			"DAND", "DOR", "XOR", "NOT", "TILDE", "QMARK", "DCOLON", "COLON", "SEMI", 
			"COMMA", "ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN"
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


	public slashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "slash.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\7\2\u0096\n\2\f\2\16\2\u0099\13\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3\u00a4\n\3\f\3\16\3\u00a7\13\3\3\3\3\3\3\3\3\3\3\4\6\4"+
		"\u00ae\n\4\r\4\16\4\u00af\3\4\3\4\3\5\5\5\u00b5\n\5\3\5\3\5\3\5\5\5\u00ba"+
		"\n\5\3\6\3\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6\5\6\u00c4\n\6\3\7\6"+
		"\7\u00c7\n\7\r\7\16\7\u00c8\3\7\7\7\u00cc\n\7\f\7\16\7\u00cf\13\7\3\b"+
		"\3\b\3\b\7\b\u00d4\n\b\f\b\16\b\u00d7\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00de"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*"+
		"\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3"+
		"B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3"+
		"\u0097\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\n\31\13\33\f"+
		"\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329"+
		"\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63"+
		"k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@\u0085A\u0087B\u0089C\u008b"+
		"D\u008dE\u008fF\3\2\13\3\2\f\f\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\2\u01b4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u009f"+
		"\3\2\2\2\7\u00ad\3\2\2\2\t\u00b4\3\2\2\2\13\u00c3\3\2\2\2\r\u00c6\3\2"+
		"\2\2\17\u00d0\3\2\2\2\21\u00da\3\2\2\2\23\u00df\3\2\2\2\25\u00e5\3\2\2"+
		"\2\27\u00e7\3\2\2\2\31\u00ed\3\2\2\2\33\u00f5\3\2\2\2\35\u00fa\3\2\2\2"+
		"\37\u0100\3\2\2\2!\u0104\3\2\2\2#\u0107\3\2\2\2%\u010c\3\2\2\2\'\u0112"+
		"\3\2\2\2)\u011b\3\2\2\2+\u0123\3\2\2\2-\u0128\3\2\2\2/\u012b\3\2\2\2\61"+
		"\u012e\3\2\2\2\63\u0131\3\2\2\2\65\u0135\3\2\2\2\67\u0137\3\2\2\29\u0139"+
		"\3\2\2\2;\u013b\3\2\2\2=\u013d\3\2\2\2?\u013f\3\2\2\2A\u0141\3\2\2\2C"+
		"\u0143\3\2\2\2E\u0146\3\2\2\2G\u0148\3\2\2\2I\u014b\3\2\2\2K\u014e\3\2"+
		"\2\2M\u0151\3\2\2\2O\u0154\3\2\2\2Q\u0158\3\2\2\2S\u015b\3\2\2\2U\u015f"+
		"\3\2\2\2W\u0161\3\2\2\2Y\u0164\3\2\2\2[\u0166\3\2\2\2]\u0169\3\2\2\2_"+
		"\u016b\3\2\2\2a\u016d\3\2\2\2c\u016f\3\2\2\2e\u0171\3\2\2\2g\u0173\3\2"+
		"\2\2i\u0176\3\2\2\2k\u0179\3\2\2\2m\u017b\3\2\2\2o\u017d\3\2\2\2q\u017f"+
		"\3\2\2\2s\u0181\3\2\2\2u\u0184\3\2\2\2w\u0186\3\2\2\2y\u0188\3\2\2\2{"+
		"\u018a\3\2\2\2}\u018c\3\2\2\2\177\u018f\3\2\2\2\u0081\u0192\3\2\2\2\u0083"+
		"\u0195\3\2\2\2\u0085\u0198\3\2\2\2\u0087\u019b\3\2\2\2\u0089\u019f\3\2"+
		"\2\2\u008b\u01a3\3\2\2\2\u008d\u01a6\3\2\2\2\u008f\u01a9\3\2\2\2\u0091"+
		"\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7,"+
		"\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\2\2\2\u009e"+
		"\4\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a5\3\2\2"+
		"\2\u00a2\u00a4\n\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\3\2\2\u00ab\6\3\2\2\2"+
		"\u00ac\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\4\2\2\u00b2"+
		"\b\3\2\2\2\u00b3\u00b5\7/\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5\13\6\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba"+
		"\5\13\6\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\n\3\2\2\2\u00bb"+
		"\u00c4\7\62\2\2\u00bc\u00c0\t\4\2\2\u00bd\u00bf\t\5\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2"+
		"\2\2\u00c4\f\3\2\2\2\u00c5\u00c7\t\6\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca"+
		"\u00cc\t\7\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\16\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d5"+
		"\7$\2\2\u00d1\u00d4\5\21\t\2\u00d2\u00d4\n\b\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9"+
		"\20\3\2\2\2\u00da\u00dd\7^\2\2\u00db\u00de\t\t\2\2\u00dc\u00de\5\23\n"+
		"\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\22\3\2\2\2\u00df\u00e0"+
		"\7w\2\2\u00e0\u00e1\5\25\13\2\u00e1\u00e2\5\25\13\2\u00e2\u00e3\5\25\13"+
		"\2\u00e3\u00e4\5\25\13\2\u00e4\24\3\2\2\2\u00e5\u00e6\t\n\2\2\u00e6\26"+
		"\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7u\2\2\u00eb\u00ec\7u\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7r\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7m\2\2\u00f1\u00f2\7c\2\2"+
		"\u00f2\u00f3\7i\2\2\u00f3\u00f4\7g\2\2\u00f4\32\3\2\2\2\u00f5\u00f6\7"+
		"n\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7r\2\2\u00f9\34"+
		"\3\2\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff\36\3\2\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103 \3\2\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7h\2\2\u0106\"\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7n\2\2\u0109"+
		"\u010a\7u\2\2\u010a\u010b\7g\2\2\u010b$\3\2\2\2\u010c\u010d\7d\2\2\u010d"+
		"\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7c\2\2\u0110\u0111\7m\2\2"+
		"\u0111&\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7q\2\2\u0114\u0115\7p\2"+
		"\2\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7w\2\2\u0119\u011a\7g\2\2\u011a(\3\2\2\2\u011b\u011c\7k\2\2\u011c\u011d"+
		"\7o\2\2\u011d\u011e\7r\2\2\u011e\u011f\7q\2\2\u011f\u0120\7t\2\2\u0120"+
		"\u0121\7v\2\2\u0121\u0122\7\"\2\2\u0122*\3\2\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7w\2\2\u0125\u0126\7v\2\2\u0126\u0127\7q\2\2\u0127,\3\2\2\2\u0128"+
		"\u0129\7\60\2\2\u0129\u012a\7\60\2\2\u012a.\3\2\2\2\u012b\u012c\7/\2\2"+
		"\u012c\u012d\7@\2\2\u012d\60\3\2\2\2\u012e\u012f\7?\2\2\u012f\u0130\7"+
		"@\2\2\u0130\62\3\2\2\2\u0131\u0132\7?\2\2\u0132\u0133\7A\2\2\u0133\u0134"+
		"\7@\2\2\u0134\64\3\2\2\2\u0135\u0136\7*\2\2\u0136\66\3\2\2\2\u0137\u0138"+
		"\7+\2\2\u01388\3\2\2\2\u0139\u013a\7]\2\2\u013a:\3\2\2\2\u013b\u013c\7"+
		"_\2\2\u013c<\3\2\2\2\u013d\u013e\7}\2\2\u013e>\3\2\2\2\u013f\u0140\7\177"+
		"\2\2\u0140@\3\2\2\2\u0141\u0142\7>\2\2\u0142B\3\2\2\2\u0143\u0144\7>\2"+
		"\2\u0144\u0145\7?\2\2\u0145D\3\2\2\2\u0146\u0147\7@\2\2\u0147F\3\2\2\2"+
		"\u0148\u0149\7@\2\2\u0149\u014a\7?\2\2\u014aH\3\2\2\2\u014b\u014c\7>\2"+
		"\2\u014c\u014d\7>\2\2\u014dJ\3\2\2\2\u014e\u014f\7@\2\2\u014f\u0150\7"+
		"@\2\2\u0150L\3\2\2\2\u0151\u0152\7?\2\2\u0152\u0153\7?\2\2\u0153N\3\2"+
		"\2\2\u0154\u0155\7?\2\2\u0155\u0156\7?\2\2\u0156\u0157\7?\2\2\u0157P\3"+
		"\2\2\2\u0158\u0159\7#\2\2\u0159\u015a\7?\2\2\u015aR\3\2\2\2\u015b\u015c"+
		"\7#\2\2\u015c\u015d\7?\2\2\u015d\u015e\7?\2\2\u015eT\3\2\2\2\u015f\u0160"+
		"\7-\2\2\u0160V\3\2\2\2\u0161\u0162\7-\2\2\u0162\u0163\7-\2\2\u0163X\3"+
		"\2\2\2\u0164\u0165\7/\2\2\u0165Z\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0168"+
		"\7/\2\2\u0168\\\3\2\2\2\u0169\u016a\7,\2\2\u016a^\3\2\2\2\u016b\u016c"+
		"\7\61\2\2\u016c`\3\2\2\2\u016d\u016e\7\'\2\2\u016eb\3\2\2\2\u016f\u0170"+
		"\7(\2\2\u0170d\3\2\2\2\u0171\u0172\7~\2\2\u0172f\3\2\2\2\u0173\u0174\7"+
		"(\2\2\u0174\u0175\7(\2\2\u0175h\3\2\2\2\u0176\u0177\7~\2\2\u0177\u0178"+
		"\7~\2\2\u0178j\3\2\2\2\u0179\u017a\7`\2\2\u017al\3\2\2\2\u017b\u017c\7"+
		"#\2\2\u017cn\3\2\2\2\u017d\u017e\7\u0080\2\2\u017ep\3\2\2\2\u017f\u0180"+
		"\7A\2\2\u0180r\3\2\2\2\u0181\u0182\7<\2\2\u0182\u0183\7<\2\2\u0183t\3"+
		"\2\2\2\u0184\u0185\7<\2\2\u0185v\3\2\2\2\u0186\u0187\7=\2\2\u0187x\3\2"+
		"\2\2\u0188\u0189\7.\2\2\u0189z\3\2\2\2\u018a\u018b\7?\2\2\u018b|\3\2\2"+
		"\2\u018c\u018d\7,\2\2\u018d\u018e\7?\2\2\u018e~\3\2\2\2\u018f\u0190\7"+
		"\61\2\2\u0190\u0191\7?\2\2\u0191\u0080\3\2\2\2\u0192\u0193\7\'\2\2\u0193"+
		"\u0194\7?\2\2\u0194\u0082\3\2\2\2\u0195\u0196\7-\2\2\u0196\u0197\7?\2"+
		"\2\u0197\u0084\3\2\2\2\u0198\u0199\7/\2\2\u0199\u019a\7?\2\2\u019a\u0086"+
		"\3\2\2\2\u019b\u019c\7>\2\2\u019c\u019d\7>\2\2\u019d\u019e\7?\2\2\u019e"+
		"\u0088\3\2\2\2\u019f\u01a0\7@\2\2\u01a0\u01a1\7@\2\2\u01a1\u01a2\7?\2"+
		"\2\u01a2\u008a\3\2\2\2\u01a3\u01a4\7(\2\2\u01a4\u01a5\7?\2\2\u01a5\u008c"+
		"\3\2\2\2\u01a6\u01a7\7~\2\2\u01a7\u01a8\7?\2\2\u01a8\u008e\3\2\2\2\u01a9"+
		"\u01aa\7`\2\2\u01aa\u01ab\7?\2\2\u01ab\u0090\3\2\2\2\17\2\u0097\u00a5"+
		"\u00af\u00b4\u00b9\u00c0\u00c3\u00c8\u00cd\u00d3\u00d5\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}