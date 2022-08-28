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
		IMPORT=17, AUTO=18, STATIC=19, RETURN=20, TRUE=21, FALSE=22, PUBLIC=23, 
		PROTECTED=24, PRIVATE=25, RANGE=26, ARROW=27, CAST=28, DYN_CAST=29, LPAREN=30, 
		RPAREN=31, LBRACK=32, RBRACK=33, LBRACE=34, RBRACE=35, CMP_LESS=36, CMP_LESS_EQ=37, 
		CMP_GREA=38, CMP_GREA_EQ=39, LSHIFT=40, RSHIFT=41, EQUALS=42, SAME=43, 
		NOT_EQUALS=44, NOT_SAME=45, PLUS=46, DPLUS=47, MINUS=48, DMINUS=49, MUL=50, 
		DIV=51, MOD=52, AND=53, OR=54, DAND=55, DOR=56, XOR=57, NOT=58, TILDE=59, 
		DOT=60, HASH=61, QMARK=62, DCOLON=63, COLON=64, SEMI=65, COMMA=66, ASSIGN=67, 
		MUL_ASSIGN=68, DIV_ASSIGN=69, MOD_ASSIGN=70, PLUS_ASSIGN=71, MINUS_ASSIGN=72, 
		LSHIFT_ASSIGN=73, RSHIFT_ASSIGN=74, AND_ASSIGN=75, OR_ASSIGN=76, XOR_ASSIGN=77, 
		ID=78;
	public static final int
		RULE_source_file = 0, RULE_class_member = 1, RULE_class_attribute = 2, 
		RULE_class_method = 3, RULE_method_param = 4, RULE_code_frame = 5, RULE_instruction = 6, 
		RULE_expr = 7, RULE_biOperation = 8, RULE_singleOperation = 9, RULE_literal = 10, 
		RULE_type = 11, RULE_visibility = 12, RULE_package_statement = 13, RULE_import_statement = 14, 
		RULE_dot_id = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_file", "class_member", "class_attribute", "class_method", "method_param", 
			"code_frame", "instruction", "expr", "biOperation", "singleOperation", 
			"literal", "type", "visibility", "package_statement", "import_statement", 
			"dot_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'class'", "'package'", 
			"'loop'", "'while'", "'for'", "'if'", "'else'", "'break'", "'continue'", 
			"'import'", "'auto'", "'static'", "'return'", "'true'", "'false'", "'public'", 
			"'protected'", "'private'", "'..'", "'->'", "'=>'", "'=?>'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", 
			"'=='", "'==='", "'!='", "'!=='", "'+'", "'++'", "'-'", "'--'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'.'", 
			"'#'", "'?'", "'::'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'<<='", "'>>='", "'&='", "'|='", "'^='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "NL", "FLOAT", "INT", "STRING", 
			"CLASS", "PACKAGE", "LOOP", "WHILE", "FOR", "IF", "ELSE", "BREAK", "CONTINUE", 
			"IMPORT", "AUTO", "STATIC", "RETURN", "TRUE", "FALSE", "PUBLIC", "PROTECTED", 
			"PRIVATE", "RANGE", "ARROW", "CAST", "DYN_CAST", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "CMP_LESS", "CMP_LESS_EQ", "CMP_GREA", 
			"CMP_GREA_EQ", "LSHIFT", "RSHIFT", "EQUALS", "SAME", "NOT_EQUALS", "NOT_SAME", 
			"PLUS", "DPLUS", "MINUS", "DMINUS", "MUL", "DIV", "MOD", "AND", "OR", 
			"DAND", "DOR", "XOR", "NOT", "TILDE", "DOT", "HASH", "QMARK", "DCOLON", 
			"COLON", "SEMI", "COMMA", "ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "ID"
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
		public TerminalNode RBRACE() { return getToken(slashParser.RBRACE, 0); }
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
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
			setState(32);
			package_statement();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(33);
				import_statement();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(CLASS);
			setState(40);
			match(ID);
			setState(41);
			match(LBRACE);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (STATIC - 18)) | (1L << (PUBLIC - 18)) | (1L << (PROTECTED - 18)) | (1L << (PRIVATE - 18)) | (1L << (ID - 18)))) != 0)) {
				{
				{
				setState(42);
				class_member();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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

	public static class Class_memberContext extends ParserRuleContext {
		public Class_attributeContext class_attribute() {
			return getRuleContext(Class_attributeContext.class,0);
		}
		public Class_methodContext class_method() {
			return getRuleContext(Class_methodContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterClass_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitClass_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_member);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				class_attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				class_method();
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

	public static class Class_attributeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(slashParser.SEMI, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public Class_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterClass_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitClass_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitClass_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_attributeContext class_attribute() throws RecognitionException {
		Class_attributeContext _localctx = new Class_attributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(54);
				visibility();
				}
			}

			setState(57);
			type();
			setState(58);
			match(ID);
			setState(59);
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

	public static class Class_methodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public Code_frameContext code_frame() {
			return getRuleContext(Code_frameContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(slashParser.STATIC, 0); }
		public List<Method_paramContext> method_param() {
			return getRuleContexts(Method_paramContext.class);
		}
		public Method_paramContext method_param(int i) {
			return getRuleContext(Method_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(slashParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(slashParser.COMMA, i);
		}
		public Class_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterClass_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitClass_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitClass_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_methodContext class_method() throws RecognitionException {
		Class_methodContext _localctx = new Class_methodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(61);
				visibility();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(64);
				match(STATIC);
				}
			}

			setState(67);
			type();
			setState(68);
			match(ID);
			setState(69);
			match(LPAREN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO || _la==ID) {
				{
				setState(70);
				method_param();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(71);
					match(COMMA);
					setState(72);
					method_param();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(80);
			match(RPAREN);
			setState(81);
			code_frame();
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

	public static class Method_paramContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public Method_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterMethod_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitMethod_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitMethod_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_paramContext method_param() throws RecognitionException {
		Method_paramContext _localctx = new Method_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
			setState(84);
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

	public static class Code_frameContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(slashParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(slashParser.RBRACE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Code_frameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_frame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterCode_frame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitCode_frame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitCode_frame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_frameContext code_frame() throws RecognitionException {
		Code_frameContext _localctx = new Code_frameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code_frame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << LOOP) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << AUTO) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << MINUS) | (1L << NOT) | (1L << TILDE))) != 0) || _la==ID) {
				{
				{
				setState(87);
				instruction();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableInstContext extends InstructionContext {
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(slashParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(slashParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterVariableInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitVariableInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitVariableInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInstContext extends InstructionContext {
		public TerminalNode FOR() { return getToken(slashParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public TerminalNode COLON() { return getToken(slashParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ForInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterForInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitForInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitForInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileInstContext extends InstructionContext {
		public TerminalNode WHILE() { return getToken(slashParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public WhileInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterWhileInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitWhileInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitWhileInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopInstContext extends InstructionContext {
		public TerminalNode LOOP() { return getToken(slashParser.LOOP, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LoopInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterLoopInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitLoopInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitLoopInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnInstContext extends InstructionContext {
		public TerminalNode RETURN() { return getToken(slashParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(slashParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterReturnInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitReturnInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitReturnInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeFrameInstContext extends InstructionContext {
		public Code_frameContext code_frame() {
			return getRuleContext(Code_frameContext.class,0);
		}
		public CodeFrameInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterCodeFrameInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitCodeFrameInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitCodeFrameInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionInstContext extends InstructionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(slashParser.SEMI, 0); }
		public ExpressionInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterExpressionInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitExpressionInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitExpressionInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfInstContext extends InstructionContext {
		public TerminalNode IF() { return getToken(slashParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public IfInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterIfInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitIfInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitIfInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ExpressionInstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				expr(0);
				setState(96);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new IfInstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(IF);
				setState(99);
				match(LPAREN);
				setState(100);
				expr(0);
				setState(101);
				match(RPAREN);
				setState(102);
				instruction();
				}
				break;
			case 3:
				_localctx = new WhileInstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(WHILE);
				setState(105);
				match(LPAREN);
				setState(106);
				expr(0);
				setState(107);
				match(RPAREN);
				setState(108);
				instruction();
				}
				break;
			case 4:
				_localctx = new LoopInstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(LOOP);
				setState(111);
				instruction();
				}
				break;
			case 5:
				_localctx = new ForInstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(FOR);
				setState(113);
				match(LPAREN);
				setState(114);
				type();
				setState(115);
				match(ID);
				setState(116);
				match(COLON);
				setState(117);
				expr(0);
				setState(118);
				match(RPAREN);
				setState(119);
				instruction();
				}
				break;
			case 6:
				_localctx = new CodeFrameInstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				code_frame();
				}
				break;
			case 7:
				_localctx = new VariableInstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(122);
					type();
					}
					break;
				}
				setState(125);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(126);
					match(ASSIGN);
					setState(127);
					expr(0);
					}
				}

				setState(130);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ReturnInstContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(RETURN);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << TILDE))) != 0) || _la==ID) {
					{
					setState(132);
					expr(0);
					}
				}

				setState(135);
				match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrElseExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QMARK() { return getToken(slashParser.QMARK, 0); }
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public OrElseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterOrElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitOrElseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitOrElseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CAST() { return getToken(slashParser.CAST, 0); }
		public TerminalNode DYN_CAST() { return getToken(slashParser.DYN_CAST, 0); }
		public CastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleOperationExprContext extends ExprContext {
		public SingleOperationContext singleOperation() {
			return getRuleContext(SingleOperationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleOperationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterSingleOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitSingleOperationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitSingleOperationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCheckExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(slashParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public NullCheckExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterNullCheckExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitNullCheckExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitNullCheckExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(slashParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(slashParser.COMMA, i);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(slashParser.RANGE, 0); }
		public RangeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitRangeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(slashParser.DOT, 0); }
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public TerminalNode QMARK() { return getToken(slashParser.QMARK, 0); }
		public AccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EncapsulateExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(slashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(slashParser.RPAREN, 0); }
		public EncapsulateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterEncapsulateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitEncapsulateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitEncapsulateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BiOperationExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiOperationContext biOperation() {
			return getRuleContext(BiOperationContext.class,0);
		}
		public BiOperationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterBiOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitBiOperationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitBiOperationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccessArrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(slashParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(slashParser.RBRACK, 0); }
		public TerminalNode QMARK() { return getToken(slashParser.QMARK, 0); }
		public AccessArrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterAccessArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitAccessArrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitAccessArrExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case STRING:
			case TRUE:
			case FALSE:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				literal();
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(ID);
				}
				break;
			case LPAREN:
				{
				_localctx = new EncapsulateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(LPAREN);
				setState(142);
				expr(0);
				setState(143);
				match(RPAREN);
				}
				break;
			case MINUS:
			case NOT:
			case TILDE:
				{
				_localctx = new SingleOperationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				singleOperation();
				setState(146);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new RangeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(RANGE);
						setState(152);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new BiOperationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(154);
						biOperation();
						setState(155);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new CastExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(158);
						_la = _input.LA(1);
						if ( !(_la==CAST || _la==DYN_CAST) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						type();
						}
						break;
					case 4:
						{
						_localctx = new AccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						match(DOT);
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QMARK) {
							{
							setState(162);
							match(QMARK);
							}
						}

						setState(165);
						match(ID);
						}
						break;
					case 5:
						{
						_localctx = new AccessArrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(167);
						match(LBRACK);
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QMARK) {
							{
							setState(168);
							match(QMARK);
							}
						}

						setState(171);
						expr(0);
						setState(172);
						match(RBRACK);
						}
						break;
					case 6:
						{
						_localctx = new CallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(175);
						match(LPAREN);
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << TILDE))) != 0) || _la==ID) {
							{
							setState(176);
							expr(0);
							setState(181);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(177);
								match(COMMA);
								setState(178);
								expr(0);
								}
								}
								setState(183);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(186);
						match(RPAREN);
						}
						break;
					case 7:
						{
						_localctx = new OrElseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(188);
						match(QMARK);
						setState(189);
						match(LPAREN);
						setState(190);
						expr(0);
						setState(191);
						match(RPAREN);
						}
						break;
					case 8:
						{
						_localctx = new NullCheckExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						match(NOT);
						setState(199);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(195);
							match(LPAREN);
							setState(196);
							expr(0);
							setState(197);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class BiOperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(slashParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(slashParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(slashParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(slashParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(slashParser.MOD, 0); }
		public TerminalNode CMP_GREA() { return getToken(slashParser.CMP_GREA, 0); }
		public TerminalNode CMP_GREA_EQ() { return getToken(slashParser.CMP_GREA_EQ, 0); }
		public TerminalNode CMP_LESS() { return getToken(slashParser.CMP_LESS, 0); }
		public TerminalNode CMP_LESS_EQ() { return getToken(slashParser.CMP_LESS_EQ, 0); }
		public TerminalNode EQUALS() { return getToken(slashParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(slashParser.NOT_EQUALS, 0); }
		public TerminalNode SAME() { return getToken(slashParser.SAME, 0); }
		public TerminalNode NOT_SAME() { return getToken(slashParser.NOT_SAME, 0); }
		public TerminalNode LSHIFT() { return getToken(slashParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(slashParser.RSHIFT, 0); }
		public TerminalNode AND() { return getToken(slashParser.AND, 0); }
		public TerminalNode OR() { return getToken(slashParser.OR, 0); }
		public TerminalNode DAND() { return getToken(slashParser.DAND, 0); }
		public TerminalNode DOR() { return getToken(slashParser.DOR, 0); }
		public TerminalNode XOR() { return getToken(slashParser.XOR, 0); }
		public BiOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterBiOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitBiOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitBiOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BiOperationContext biOperation() throws RecognitionException {
		BiOperationContext _localctx = new BiOperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_biOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CMP_LESS) | (1L << CMP_LESS_EQ) | (1L << CMP_GREA) | (1L << CMP_GREA_EQ) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << EQUALS) | (1L << SAME) | (1L << NOT_EQUALS) | (1L << NOT_SAME) | (1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << AND) | (1L << OR) | (1L << DAND) | (1L << DOR) | (1L << XOR))) != 0)) ) {
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

	public static class SingleOperationContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(slashParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(slashParser.NOT, 0); }
		public TerminalNode TILDE() { return getToken(slashParser.TILDE, 0); }
		public SingleOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterSingleOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitSingleOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitSingleOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleOperationContext singleOperation() throws RecognitionException {
		SingleOperationContext _localctx = new SingleOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << TILDE))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(slashParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode INT() { return getToken(slashParser.INT, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends LiteralContext {
		public TerminalNode FLOAT() { return getToken(slashParser.FLOAT, 0); }
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLiteralsContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(slashParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(slashParser.FALSE, 0); }
		public BoolLiteralsContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterBoolLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitBoolLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitBoolLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolLiteralsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public Dot_idContext dot_id() {
			return getRuleContext(Dot_idContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(slashParser.AUTO, 0); }
		public TerminalNode QMARK() { return getToken(slashParser.QMARK, 0); }
		public TerminalNode HASH() { return getToken(slashParser.HASH, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(216);
				dot_id();
				}
				break;
			case AUTO:
				{
				setState(217);
				match(AUTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(220);
				match(QMARK);
				}
				break;
			}
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(223);
				match(HASH);
				}
				break;
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(slashParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(slashParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(slashParser.PROTECTED, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) ) {
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

	public static class Package_statementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(slashParser.PACKAGE, 0); }
		public Dot_idContext dot_id() {
			return getRuleContext(Dot_idContext.class,0);
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
		enterRule(_localctx, 26, RULE_package_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PACKAGE);
			setState(229);
			dot_id();
			setState(230);
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
		public Dot_idContext dot_id() {
			return getRuleContext(Dot_idContext.class,0);
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
		enterRule(_localctx, 28, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(IMPORT);
			setState(233);
			dot_id();
			setState(234);
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

	public static class Dot_idContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(slashParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(slashParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(slashParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(slashParser.DOT, i);
		}
		public Dot_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).enterDot_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slashListener ) ((slashListener)listener).exitDot_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slashVisitor ) return ((slashVisitor<? extends T>)visitor).visitDot_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_idContext dot_id() throws RecognitionException {
		Dot_idContext _localctx = new Dot_idContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dot_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(DOT);
					setState(238);
					match(ID);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001N\u00f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000,\b\u0000"+
		"\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u00015\b\u0001\u0001\u0002\u0003\u00028\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003?\b\u0003\u0001"+
		"\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003M\t"+
		"\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005Y\b"+
		"\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0081\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0086\b\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0095\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a4\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00aa\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00b4\b\u0007\n\u0007\f\u0007\u00b7\t\u0007\u0003\u0007\u00b9\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00c8\b\u0007\u0005\u0007\u00ca\b\u0007\n\u0007"+
		"\f\u0007\u00cd\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00d7\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00db\b\u000b\u0001\u000b\u0003\u000b\u00de\b\u000b\u0001\u000b\u0003"+
		"\u000b\u00e1\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00f0\b\u000f\n\u000f\f\u000f\u00f3\t\u000f\u0001\u000f"+
		"\u0000\u0001\u000e\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0005\u0001\u0000\u001c\u001d"+
		"\u0003\u0000$.0029\u0002\u000000:;\u0001\u0000\u0015\u0016\u0001\u0000"+
		"\u0017\u0019\u010e\u0000 \u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000"+
		"\u0000\u00047\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\b"+
		"S\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000"+
		"\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00ce\u0001\u0000"+
		"\u0000\u0000\u0012\u00d0\u0001\u0000\u0000\u0000\u0014\u00d6\u0001\u0000"+
		"\u0000\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00e2\u0001\u0000"+
		"\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00e8\u0001\u0000"+
		"\u0000\u0000\u001e\u00ec\u0001\u0000\u0000\u0000 $\u0003\u001a\r\u0000"+
		"!#\u0003\u001c\u000e\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\b\u0000\u0000()\u0005"+
		"N\u0000\u0000)-\u0005\"\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u000001\u0005#\u0000\u00001\u0001\u0001\u0000\u0000\u000025\u0003\u0004"+
		"\u0002\u000035\u0003\u0006\u0003\u000042\u0001\u0000\u0000\u000043\u0001"+
		"\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u000068\u0003\u0018\f\u0000"+
		"76\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0003\u0016\u000b\u0000:;\u0005N\u0000\u0000;<\u0005A\u0000\u0000"+
		"<\u0005\u0001\u0000\u0000\u0000=?\u0003\u0018\f\u0000>=\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@B\u0005\u0013"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0003\u0016\u000b\u0000DE\u0005N\u0000\u0000EN\u0005"+
		"\u001e\u0000\u0000FK\u0003\b\u0004\u0000GH\u0005B\u0000\u0000HJ\u0003"+
		"\b\u0004\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u001f\u0000\u0000QR\u0003\n\u0005"+
		"\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0003\u0016\u000b\u0000TU\u0005"+
		"N\u0000\u0000U\t\u0001\u0000\u0000\u0000VZ\u0005\"\u0000\u0000WY\u0003"+
		"\f\u0006\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX"+
		"\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005#\u0000\u0000^\u000b\u0001\u0000"+
		"\u0000\u0000_`\u0003\u000e\u0007\u0000`a\u0005A\u0000\u0000a\u0089\u0001"+
		"\u0000\u0000\u0000bc\u0005\r\u0000\u0000cd\u0005\u001e\u0000\u0000de\u0003"+
		"\u000e\u0007\u0000ef\u0005\u001f\u0000\u0000fg\u0003\f\u0006\u0000g\u0089"+
		"\u0001\u0000\u0000\u0000hi\u0005\u000b\u0000\u0000ij\u0005\u001e\u0000"+
		"\u0000jk\u0003\u000e\u0007\u0000kl\u0005\u001f\u0000\u0000lm\u0003\f\u0006"+
		"\u0000m\u0089\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o\u0089\u0003"+
		"\f\u0006\u0000pq\u0005\f\u0000\u0000qr\u0005\u001e\u0000\u0000rs\u0003"+
		"\u0016\u000b\u0000st\u0005N\u0000\u0000tu\u0005@\u0000\u0000uv\u0003\u000e"+
		"\u0007\u0000vw\u0005\u001f\u0000\u0000wx\u0003\f\u0006\u0000x\u0089\u0001"+
		"\u0000\u0000\u0000y\u0089\u0003\n\u0005\u0000z|\u0003\u0016\u000b\u0000"+
		"{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0080\u0005N\u0000\u0000~\u007f\u0005C\u0000\u0000\u007f\u0081"+
		"\u0003\u000e\u0007\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0089\u0005"+
		"A\u0000\u0000\u0083\u0085\u0005\u0014\u0000\u0000\u0084\u0086\u0003\u000e"+
		"\u0007\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0005A\u0000"+
		"\u0000\u0088_\u0001\u0000\u0000\u0000\u0088b\u0001\u0000\u0000\u0000\u0088"+
		"h\u0001\u0000\u0000\u0000\u0088n\u0001\u0000\u0000\u0000\u0088p\u0001"+
		"\u0000\u0000\u0000\u0088y\u0001\u0000\u0000\u0000\u0088{\u0001\u0000\u0000"+
		"\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0089\r\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0006\u0007\uffff\uffff\u0000\u008b\u0095\u0003\u0014\n\u0000"+
		"\u008c\u0095\u0005N\u0000\u0000\u008d\u008e\u0005\u001e\u0000\u0000\u008e"+
		"\u008f\u0003\u000e\u0007\u0000\u008f\u0090\u0005\u001f\u0000\u0000\u0090"+
		"\u0095\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0012\t\u0000\u0092\u0093"+
		"\u0003\u000e\u0007\u0001\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008a"+
		"\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0094\u008d"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u00cb"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\n\u0003\u0000\u0000\u0097\u0098\u0005"+
		"\u001a\u0000\u0000\u0098\u00ca\u0003\u000e\u0007\u0004\u0099\u009a\n\u0002"+
		"\u0000\u0000\u009a\u009b\u0003\u0010\b\u0000\u009b\u009c\u0003\u000e\u0007"+
		"\u0003\u009c\u00ca\u0001\u0000\u0000\u0000\u009d\u009e\n\f\u0000\u0000"+
		"\u009e\u009f\u0007\u0000\u0000\u0000\u009f\u00ca\u0003\u0016\u000b\u0000"+
		"\u00a0\u00a1\n\t\u0000\u0000\u00a1\u00a3\u0005<\u0000\u0000\u00a2\u00a4"+
		"\u0005>\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00ca\u0005"+
		"N\u0000\u0000\u00a6\u00a7\n\b\u0000\u0000\u00a7\u00a9\u0005 \u0000\u0000"+
		"\u00a8\u00aa\u0005>\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0003\u000e\u0007\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\n\u0007\u0000\u0000\u00af\u00b8\u0005"+
		"\u001e\u0000\u0000\u00b0\u00b5\u0003\u000e\u0007\u0000\u00b1\u00b2\u0005"+
		"B\u0000\u0000\u00b2\u00b4\u0003\u000e\u0007\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00ca\u0005\u001f\u0000\u0000\u00bb\u00bc\n\u0006\u0000"+
		"\u0000\u00bc\u00bd\u0005>\u0000\u0000\u00bd\u00be\u0005\u001e\u0000\u0000"+
		"\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000"+
		"\u00c0\u00ca\u0001\u0000\u0000\u0000\u00c1\u00c2\n\u0005\u0000\u0000\u00c2"+
		"\u00c7\u0005:\u0000\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000\u00c4\u00c5"+
		"\u0003\u000e\u0007\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u0096"+
		"\u0001\u0000\u0000\u0000\u00c9\u0099\u0001\u0000\u0000\u0000\u00c9\u009d"+
		"\u0001\u0000\u0000\u0000\u00c9\u00a0\u0001\u0000\u0000\u0000\u00c9\u00a6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ae\u0001\u0000\u0000\u0000\u00c9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00ca\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u000f\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf\u0011"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007\u0002\u0000\u0000\u00d1\u0013"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d7\u0005\u0006\u0000\u0000\u00d3\u00d7"+
		"\u0005\u0005\u0000\u0000\u00d4\u00d7\u0005\u0007\u0000\u0000\u00d5\u00d7"+
		"\u0007\u0003\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u0015\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0003\u001e\u000f\u0000\u00d9\u00db\u0005\u0012\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00de\u0005>\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00e1\u0005=\u0000\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u0017\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0007\u0004\u0000\u0000\u00e3\u0019\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e6\u0003\u001e\u000f"+
		"\u0000\u00e6\u00e7\u0005A\u0000\u0000\u00e7\u001b\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\u0011\u0000\u0000\u00e9\u00ea\u0003\u001e\u000f\u0000"+
		"\u00ea\u00eb\u0005A\u0000\u0000\u00eb\u001d\u0001\u0000\u0000\u0000\u00ec"+
		"\u00f1\u0005N\u0000\u0000\u00ed\u00ee\u0005<\u0000\u0000\u00ee\u00f0\u0005"+
		"N\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u001f\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u001a$-47>AKNZ{\u0080\u0085\u0088\u0094\u00a3\u00a9\u00b5"+
		"\u00b8\u00c7\u00c9\u00cb\u00d6\u00da\u00dd\u00e0\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}