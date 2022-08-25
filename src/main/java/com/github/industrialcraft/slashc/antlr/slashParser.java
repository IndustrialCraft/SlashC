// Generated from /home/mmm/Plocha/IndustrialCraft/SlashC/src/main/antlr/slash.g4 by ANTLR 4.10.1
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
		IMPORT=17, AUTO=18, STATIC=19, PUBLIC=20, PROTECTED=21, PRIVATE=22, RANGE=23, 
		ARROW=24, CAST=25, DYN_CAST=26, LPAREN=27, RPAREN=28, LBRACK=29, RBRACK=30, 
		LBRACE=31, RBRACE=32, CMP_LESS=33, CMP_LESS_EQ=34, CMP_GREA=35, CMP_GREA_EQ=36, 
		LSHIFT=37, RSHIFT=38, EQUALS=39, SAME=40, NOT_EQUALS=41, NOT_SAME=42, 
		PLUS=43, DPLUS=44, MINUS=45, DMINUS=46, MUL=47, DIV=48, MOD=49, AND=50, 
		OR=51, DAND=52, DOR=53, XOR=54, NOT=55, TILDE=56, DOT=57, HASH=58, QMARK=59, 
		DCOLON=60, COLON=61, SEMI=62, COMMA=63, ASSIGN=64, MUL_ASSIGN=65, DIV_ASSIGN=66, 
		MOD_ASSIGN=67, PLUS_ASSIGN=68, MINUS_ASSIGN=69, LSHIFT_ASSIGN=70, RSHIFT_ASSIGN=71, 
		AND_ASSIGN=72, OR_ASSIGN=73, XOR_ASSIGN=74, ID=75;
	public static final int
		RULE_source_file = 0, RULE_class_member = 1, RULE_class_attribute = 2, 
		RULE_class_method = 3, RULE_method_param = 4, RULE_code_frame = 5, RULE_instruction = 6, 
		RULE_expr = 7, RULE_literal = 8, RULE_type = 9, RULE_visibility = 10, 
		RULE_package_statement = 11, RULE_import_statement = 12, RULE_dot_id = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_file", "class_member", "class_attribute", "class_method", "method_param", 
			"code_frame", "instruction", "expr", "literal", "type", "visibility", 
			"package_statement", "import_statement", "dot_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'class'", "'package'", 
			"'loop'", "'while'", "'for'", "'if'", "'else'", "'break'", "'continue'", 
			"'import '", "'auto'", "'static'", "'public'", "'protected'", "'private'", 
			"'..'", "'->'", "'=>'", "'=?>'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'=='", "'==='", "'!='", 
			"'!=='", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", 
			"'&&'", "'||'", "'^'", "'!'", "'~'", "'.'", "'#'", "'?'", "'::'", "':'", 
			"';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
			"'>>='", "'&='", "'|='", "'^='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "NL", "FLOAT", "INT", "STRING", 
			"CLASS", "PACKAGE", "LOOP", "WHILE", "FOR", "IF", "ELSE", "BREAK", "CONTINUE", 
			"IMPORT", "AUTO", "STATIC", "PUBLIC", "PROTECTED", "PRIVATE", "RANGE", 
			"ARROW", "CAST", "DYN_CAST", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"LBRACE", "RBRACE", "CMP_LESS", "CMP_LESS_EQ", "CMP_GREA", "CMP_GREA_EQ", 
			"LSHIFT", "RSHIFT", "EQUALS", "SAME", "NOT_EQUALS", "NOT_SAME", "PLUS", 
			"DPLUS", "MINUS", "DMINUS", "MUL", "DIV", "MOD", "AND", "OR", "DAND", 
			"DOR", "XOR", "NOT", "TILDE", "DOT", "HASH", "QMARK", "DCOLON", "COLON", 
			"SEMI", "COMMA", "ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
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
			setState(28);
			package_statement();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(29);
				import_statement();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(CLASS);
			setState(36);
			match(ID);
			setState(37);
			match(LBRACE);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (STATIC - 18)) | (1L << (PUBLIC - 18)) | (1L << (PROTECTED - 18)) | (1L << (PRIVATE - 18)) | (1L << (ID - 18)))) != 0)) {
				{
				{
				setState(38);
				class_member();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				class_attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(50);
				visibility();
				}
			}

			setState(53);
			type();
			setState(54);
			match(ID);
			setState(55);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(57);
				visibility();
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(60);
				match(STATIC);
				}
			}

			setState(63);
			type();
			setState(64);
			match(ID);
			setState(65);
			match(LPAREN);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO || _la==ID) {
				{
				setState(66);
				method_param();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(67);
					match(COMMA);
					setState(68);
					method_param();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(RPAREN);
			setState(77);
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
			setState(79);
			type();
			setState(80);
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
			setState(82);
			match(LBRACE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << IF) | (1L << LPAREN) | (1L << LBRACE))) != 0) || _la==ID) {
				{
				{
				setState(83);
				instruction();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case STRING:
			case LPAREN:
			case ID:
				_localctx = new ExpressionInstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				expr(0);
				setState(92);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfInstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(IF);
				setState(95);
				match(LPAREN);
				setState(96);
				expr(0);
				setState(97);
				match(RPAREN);
				setState(98);
				instruction();
				}
				break;
			case LBRACE:
				_localctx = new CodeFrameInstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				code_frame();
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
	public static class CallExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(slashParser.DOT, 0); }
		public TerminalNode ID() { return getToken(slashParser.ID, 0); }
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new EncapsulateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				match(LPAREN);
				setState(105);
				expr(0);
				setState(106);
				match(RPAREN);
				}
				break;
			case FLOAT:
			case INT:
			case STRING:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				literal();
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(112);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(113);
					match(DOT);
					setState(114);
					match(ID);
					setState(115);
					match(LPAREN);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << LPAREN))) != 0) || _la==ID) {
						{
						setState(116);
						expr(0);
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(117);
							match(COMMA);
							setState(118);
							expr(0);
							}
							}
							setState(123);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(126);
					match(RPAREN);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(STRING);
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
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(137);
				dot_id();
				}
				break;
			case AUTO:
				{
				setState(138);
				match(AUTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QMARK) {
				{
				setState(141);
				match(QMARK);
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(144);
				match(HASH);
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
		enterRule(_localctx, 20, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 22, RULE_package_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(PACKAGE);
			setState(150);
			dot_id();
			setState(151);
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
		enterRule(_localctx, 24, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IMPORT);
			setState(154);
			dot_id();
			setState(155);
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
		enterRule(_localctx, 26, RULE_dot_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(158);
				match(DOT);
				setState(159);
				match(ID);
				}
				}
				setState(164);
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
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001K\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002\u0003"+
		"\u00024\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"F\b\u0003\n\u0003\f\u0003I\t\u0003\u0003\u0003K\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006f\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007o\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007x\b"+
		"\u0007\n\u0007\f\u0007{\t\u0007\u0003\u0007}\b\u0007\u0001\u0007\u0005"+
		"\u0007\u0080\b\u0007\n\u0007\f\u0007\u0083\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001\t\u0003\t"+
		"\u008f\b\t\u0001\t\u0003\t\u0092\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00a1\b\r\n\r\f\r\u00a4\t\r\u0001\r\u0000\u0001"+
		"\u000e\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0001\u0001\u0000\u0014\u0016\u00ad\u0000\u001c\u0001"+
		"\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000"+
		"\u0000\u0006:\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nR\u0001"+
		"\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000"+
		"\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000"+
		"\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000"+
		"\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u009d\u0001\u0000\u0000"+
		"\u0000\u001c \u0003\u0016\u000b\u0000\u001d\u001f\u0003\u0018\f\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 "+
		"\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\b\u0000\u0000$%\u0005"+
		"K\u0000\u0000%)\u0005\u001f\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005 \u0000\u0000-\u0001\u0001\u0000\u0000\u0000.1\u0003\u0004"+
		"\u0002\u0000/1\u0003\u0006\u0003\u00000.\u0001\u0000\u0000\u00000/\u0001"+
		"\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000024\u0003\u0014\n\u0000"+
		"32\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000056\u0003\u0012\t\u000067\u0005K\u0000\u000078\u0005>\u0000\u0000"+
		"8\u0005\u0001\u0000\u0000\u00009;\u0003\u0014\n\u0000:9\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<>\u0005\u0013"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0003\u0012\t\u0000@A\u0005K\u0000\u0000AJ\u0005"+
		"\u001b\u0000\u0000BG\u0003\b\u0004\u0000CD\u0005?\u0000\u0000DF\u0003"+
		"\b\u0004\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u001c\u0000\u0000MN\u0003\n\u0005"+
		"\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0003\u0012\t\u0000PQ\u0005K\u0000"+
		"\u0000Q\t\u0001\u0000\u0000\u0000RV\u0005\u001f\u0000\u0000SU\u0003\f"+
		"\u0006\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005 \u0000\u0000Z\u000b\u0001\u0000\u0000"+
		"\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005>\u0000\u0000]f\u0001\u0000"+
		"\u0000\u0000^_\u0005\r\u0000\u0000_`\u0005\u001b\u0000\u0000`a\u0003\u000e"+
		"\u0007\u0000ab\u0005\u001c\u0000\u0000bc\u0003\f\u0006\u0000cf\u0001\u0000"+
		"\u0000\u0000df\u0003\n\u0005\u0000e[\u0001\u0000\u0000\u0000e^\u0001\u0000"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0006"+
		"\u0007\uffff\uffff\u0000hi\u0005\u001b\u0000\u0000ij\u0003\u000e\u0007"+
		"\u0000jk\u0005\u001c\u0000\u0000ko\u0001\u0000\u0000\u0000lo\u0003\u0010"+
		"\b\u0000mo\u0005K\u0000\u0000ng\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0081\u0001\u0000\u0000\u0000"+
		"pq\n\u0001\u0000\u0000qr\u00059\u0000\u0000rs\u0005K\u0000\u0000s|\u0005"+
		"\u001b\u0000\u0000ty\u0003\u000e\u0007\u0000uv\u0005?\u0000\u0000vx\u0003"+
		"\u000e\u0007\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0005\u001c\u0000\u0000"+
		"\u007fp\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u000f\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0005\u0006\u0000\u0000\u0085\u0088\u0005\u0005\u0000\u0000\u0086"+
		"\u0088\u0005\u0007\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0011\u0001\u0000\u0000\u0000\u0089\u008c\u0003\u001a\r\u0000\u008a\u008c"+
		"\u0005\u0012\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0005;\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0092\u0005"+
		":\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000"+
		"\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0005\t\u0000"+
		"\u0000\u0096\u0097\u0003\u001a\r\u0000\u0097\u0098\u0005>\u0000\u0000"+
		"\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0011\u0000\u0000"+
		"\u009a\u009b\u0003\u001a\r\u0000\u009b\u009c\u0005>\u0000\u0000\u009c"+
		"\u0019\u0001\u0000\u0000\u0000\u009d\u00a2\u0005K\u0000\u0000\u009e\u009f"+
		"\u00059\u0000\u0000\u009f\u00a1\u0005K\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u001b\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u0013 )03:=GJVeny|\u0081"+
		"\u0087\u008b\u008e\u0091\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}