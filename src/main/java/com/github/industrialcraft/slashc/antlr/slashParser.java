// Generated from /home/mmm/Desktop/IndustrialCraft/SlashC/src/main/antlr/slash.g4 by ANTLR 4.10.1
package com.github.industrialcraft.slashc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class slashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, NL=4, FLOAT=5, INT=6, STRING=7, CLASS=8, 
		PACKAGE=9, LOOP=10, WHILE=11, FOR=12, IF=13, ELSE=14, BREAK=15, CONTINUE=16, 
		IMPORT=17, AUTO=18, RANGE=19, ARROW=20, CAST=21, DYN_CAST=22, LPAREN=23, 
		RPAREN=24, LBRACK=25, RBRACK=26, LBRACE=27, RBRACE=28, CMP_LESS=29, CMP_LESS_EQ=30, 
		CMP_GREA=31, CMP_GREA_EQ=32, LSHIFT=33, RSHIFT=34, EQUALS=35, SAME=36, 
		NOT_EQUALS=37, NOT_SAME=38, PLUS=39, DPLUS=40, MINUS=41, DMINUS=42, MUL=43, 
		DIV=44, MOD=45, AND=46, OR=47, DAND=48, DOR=49, XOR=50, NOT=51, TILDE=52, 
		QMARK=53, DCOLON=54, COLON=55, SEMI=56, COMMA=57, ASSIGN=58, MUL_ASSIGN=59, 
		DIV_ASSIGN=60, MOD_ASSIGN=61, PLUS_ASSIGN=62, MINUS_ASSIGN=63, LSHIFT_ASSIGN=64, 
		RSHIFT_ASSIGN=65, AND_ASSIGN=66, OR_ASSIGN=67, XOR_ASSIGN=68, ID=69;
	public static final int
		RULE_source_file = 0, RULE_class_content = 1, RULE_package_statement = 2, 
		RULE_import_statement = 3, RULE_dcol_id = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_file", "class_content", "package_statement", "import_statement", 
			"dcol_id"
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
			null, "COMMENT", "LINE_COMMENT", "WS", "NL", "FLOAT", "INT", "STRING", 
			"CLASS", "PACKAGE", "LOOP", "WHILE", "FOR", "IF", "ELSE", "BREAK", "CONTINUE", 
			"IMPORT", "AUTO", "RANGE", "ARROW", "CAST", "DYN_CAST", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "CMP_LESS", "CMP_LESS_EQ", "CMP_GREA", 
			"CMP_GREA_EQ", "LSHIFT", "RSHIFT", "EQUALS", "SAME", "NOT_EQUALS", "NOT_SAME", 
			"PLUS", "DPLUS", "MINUS", "DMINUS", "MUL", "DIV", "MOD", "AND", "OR", 
			"DAND", "DOR", "XOR", "NOT", "TILDE", "QMARK", "DCOLON", "COLON", "SEMI", 
			"COMMA", "ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "ID"
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
	public String getGrammarFileName() { return "slash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public slashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Source_fileContext extends ParserRuleContext {
		public Package_statementContext package_statement() {
			return getRuleContext(Package_statementContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(slashParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(slashParser.LBRACE, 0); }
		public Class_contentContext class_content() {
			return getRuleContext(Class_contentContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(slashParser.RBRACE, 0); }
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public Source_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterSource_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitSource_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitSource_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_fileContext source_file() throws RecognitionException {
		Source_fileContext _localctx = new Source_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			package_statement();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(11);
				import_statement();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(CLASS);
			setState(18);
			match(ID);
			setState(19);
			match(LBRACE);
			setState(20);
			class_content();
			setState(21);
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

	public static class Class_contentContext extends ParserRuleContext {
		public Class_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterClass_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitClass_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitClass_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_contentContext class_content() throws RecognitionException {
		Class_contentContext _localctx = new Class_contentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Package_statementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(slashParser.PACKAGE, 0); }
		public Dcol_idContext dcol_id() {
			return getRuleContext(Dcol_idContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(slashParser.SEMI, 0); }
		public Package_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterPackage_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitPackage_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitPackage_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_statementContext package_statement() throws RecognitionException {
		Package_statementContext _localctx = new Package_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_package_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(PACKAGE);
			setState(26);
			dcol_id();
			setState(27);
			match(SEMI);
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

	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(slashParser.IMPORT, 0); }
		public Dcol_idContext dcol_id() {
			return getRuleContext(Dcol_idContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(slashParser.SEMI, 0); }
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IMPORT);
			setState(30);
			dcol_id();
			setState(31);
			match(SEMI);
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

	public static class Dcol_idContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(slashParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(slashParser.ID, i);
		}
		public List<TerminalNode> DCOLON() { return getTokens(slashParser.DCOLON); }
		public TerminalNode DCOLON(int i) {
			return getToken(slashParser.DCOLON, i);
		}
		public Dcol_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcol_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterDcol_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitDcol_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitDcol_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcol_idContext dcol_id() throws RecognitionException {
		Dcol_idContext _localctx = new Dcol_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcol_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DCOLON) {
				{
				{
				setState(34);
				match(DCOLON);
				setState(35);
				match(ID);
				}
				}
				setState(40);
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

	public static final String _serializedATN =
		"\u0004\u0001E*\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004%\b\u0004\n\u0004\f\u0004(\t\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000&\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000"+
		"\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b!\u0001\u0000\u0000"+
		"\u0000\n\u000e\u0003\u0004\u0002\u0000\u000b\r\u0003\u0006\u0003\u0000"+
		"\f\u000b\u0001\u0000\u0000\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e"+
		"\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011"+
		"\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0005\b\u0000\u0000\u0012\u0013\u0005E\u0000\u0000\u0013\u0014\u0005"+
		"\u001b\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005"+
		"\u001c\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\t\u0000\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u00058\u0000"+
		"\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0011\u0000"+
		"\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u00058\u0000\u0000 \u0007"+
		"\u0001\u0000\u0000\u0000!&\u0005E\u0000\u0000\"#\u00056\u0000\u0000#%"+
		"\u0005E\u0000\u0000$\"\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\t\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000\u0002\u000e&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}