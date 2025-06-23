// Generated from com/scopelang/Scope.g4 by ANTLR 4.10.1
package com.scopelang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScopeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AssemblyBlock=2, LeftParen=3, RightParen=4, LeftBracket=5, RightBracket=6, 
		LeftBrace=7, RightBrace=8, Assign=9, Pow=10, Mul=11, Div=12, Add=13, Sub=14, 
		Mod=15, Not=16, PowAssign=17, MulAssign=18, DivAssign=19, AddAssign=20, 
		SubAssign=21, ModAssign=22, Equals=23, NotEquals=24, GreaterThan=25, LessThan=26, 
		GreaterThanEqual=27, LessThanEqual=28, And=29, Or=30, Cast=31, Where=32, 
		Range=33, Resolve=34, Access=35, FuncKeyword=36, ImportKeyword=37, ReturnKeyword=38, 
		BreakpointKeyword=39, IfKeyword=40, ElseKeyword=41, WhileKeyword=42, ForKeyword=43, 
		StepKeyword=44, NamespaceKeyword=45, UsingKeyword=46, BreakKeyword=47, 
		ContinueKeyword=48, IsKeyword=49, ConstKeyword=50, ObjectKeyword=51, NewKeyword=52, 
		VoidType=53, IntType=54, StrType=55, BoolType=56, DecType=57, IntegerLiteral=58, 
		DecimalLiteral=59, StringLiteral=60, BooleanLiteral=61, Identifier=62, 
		EndLine=63, Whitespace=64, LineComment=65, BlockComment=66, DocComment=67;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_codeblock = 2, RULE_topStatements = 3, 
		RULE_outerStatments = 4, RULE_innerStatement = 5, RULE_outerStatement = 6, 
		RULE_topStatement = 7, RULE_parameter = 8, RULE_parameters = 9, RULE_arguments = 10, 
		RULE_invoke = 11, RULE_declare = 12, RULE_assign = 13, RULE_opAssign = 14, 
		RULE_return = 15, RULE_breakpoint = 16, RULE_if = 17, RULE_else = 18, 
		RULE_while = 19, RULE_for = 20, RULE_break = 21, RULE_continue = 22, RULE_assembly = 23, 
		RULE_function = 24, RULE_const = 25, RULE_object = 26, RULE_namespace = 27, 
		RULE_using = 28, RULE_objectField = 29, RULE_expr = 30, RULE_atom = 31, 
		RULE_literals = 32, RULE_arrayInit = 33, RULE_objectInit = 34, RULE_fullIdent = 35, 
		RULE_primitiveType = 36, RULE_typeName = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "codeblock", "topStatements", "outerStatments", "innerStatement", 
			"outerStatement", "topStatement", "parameter", "parameters", "arguments", 
			"invoke", "declare", "assign", "opAssign", "return", "breakpoint", "if", 
			"else", "while", "for", "break", "continue", "assembly", "function", 
			"const", "object", "namespace", "using", "objectField", "expr", "atom", 
			"literals", "arrayInit", "objectInit", "fullIdent", "primitiveType", 
			"typeName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", "'^'", 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'!'", "'^='", "'*='", "'/='", "'+='", 
			"'-='", "'%='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&'", 
			"'|'", "'->'", "':'", "'..'", "'::'", "'.'", "'func'", "'import'", "'ret'", 
			"'breakpoint'", "'if'", "'else'", "'while'", "'for'", "'step'", "'namespace'", 
			"'using'", "'break'", "'continue'", "'is'", "'const'", "'object'", "'new'", 
			"'void'", "'int'", "'str'", "'bool'", "'dec'", null, null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AssemblyBlock", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Assign", "Pow", "Mul", "Div", 
			"Add", "Sub", "Mod", "Not", "PowAssign", "MulAssign", "DivAssign", "AddAssign", 
			"SubAssign", "ModAssign", "Equals", "NotEquals", "GreaterThan", "LessThan", 
			"GreaterThanEqual", "LessThanEqual", "And", "Or", "Cast", "Where", "Range", 
			"Resolve", "Access", "FuncKeyword", "ImportKeyword", "ReturnKeyword", 
			"BreakpointKeyword", "IfKeyword", "ElseKeyword", "WhileKeyword", "ForKeyword", 
			"StepKeyword", "NamespaceKeyword", "UsingKeyword", "BreakKeyword", "ContinueKeyword", 
			"IsKeyword", "ConstKeyword", "ObjectKeyword", "NewKeyword", "VoidType", 
			"IntType", "StrType", "BoolType", "DecType", "IntegerLiteral", "DecimalLiteral", 
			"StringLiteral", "BooleanLiteral", "Identifier", "EndLine", "Whitespace", 
			"LineComment", "BlockComment", "DocComment"
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
	public String getGrammarFileName() { return "Scope.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScopeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TopStatementsContext topStatements() {
			return getRuleContext(TopStatementsContext.class,0);
		}
		public OuterStatmentsContext outerStatments() {
			return getRuleContext(OuterStatmentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ScopeParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			topStatements();
			setState(77);
			outerStatments();
			setState(78);
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

	public static class CodeContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AssemblyBlock) | (1L << LeftBrace) | (1L << ReturnKeyword) | (1L << BreakpointKeyword) | (1L << IfKeyword) | (1L << WhileKeyword) | (1L << ForKeyword) | (1L << BreakKeyword) | (1L << ContinueKeyword) | (1L << VoidType) | (1L << IntType) | (1L << StrType) | (1L << BoolType) | (1L << DecType) | (1L << Identifier))) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AssemblyBlock:
				case ReturnKeyword:
				case BreakpointKeyword:
				case IfKeyword:
				case WhileKeyword:
				case ForKeyword:
				case BreakKeyword:
				case ContinueKeyword:
				case VoidType:
				case IntType:
				case StrType:
				case BoolType:
				case DecType:
				case Identifier:
					{
					setState(80);
					innerStatement();
					}
					break;
				case LeftBrace:
					{
					setState(81);
					codeblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
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

	public static class CodeblockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(ScopeParser.LeftBrace, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(ScopeParser.RightBrace, 0); }
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitCodeblock(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_codeblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LeftBrace);
			setState(88);
			code();
			setState(89);
			match(RightBrace);
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

	public static class TopStatementsContext extends ParserRuleContext {
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public TopStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterTopStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitTopStatements(this);
		}
	}

	public final TopStatementsContext topStatements() throws RecognitionException {
		TopStatementsContext _localctx = new TopStatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ImportKeyword) | (1L << NamespaceKeyword) | (1L << UsingKeyword))) != 0)) {
				{
				{
				setState(91);
				topStatement();
				}
				}
				setState(96);
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

	public static class OuterStatmentsContext extends ParserRuleContext {
		public List<OuterStatementContext> outerStatement() {
			return getRuleContexts(OuterStatementContext.class);
		}
		public OuterStatementContext outerStatement(int i) {
			return getRuleContext(OuterStatementContext.class,i);
		}
		public OuterStatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerStatments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterOuterStatments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitOuterStatments(this);
		}
	}

	public final OuterStatmentsContext outerStatments() throws RecognitionException {
		OuterStatmentsContext _localctx = new OuterStatmentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outerStatments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FuncKeyword) | (1L << ConstKeyword) | (1L << ObjectKeyword))) != 0)) {
				{
				{
				setState(97);
				outerStatement();
				}
				}
				setState(102);
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

	public static class InnerStatementContext extends ParserRuleContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OpAssignContext opAssign() {
			return getRuleContext(OpAssignContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public BreakpointContext breakpoint() {
			return getRuleContext(BreakpointContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public ContinueContext continue_() {
			return getRuleContext(ContinueContext.class,0);
		}
		public AssemblyContext assembly() {
			return getRuleContext(AssemblyContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitInnerStatement(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_innerStatement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				invoke();
				setState(104);
				match(EndLine);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				declare();
				setState(107);
				match(EndLine);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				assign();
				setState(110);
				match(EndLine);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				opAssign();
				setState(113);
				match(EndLine);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				return_();
				setState(116);
				match(EndLine);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				breakpoint();
				setState(119);
				match(EndLine);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				if_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				while_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				for_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				break_();
				setState(125);
				match(EndLine);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(127);
				continue_();
				setState(128);
				match(EndLine);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				assembly();
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

	public static class OuterStatementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public OuterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterOuterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitOuterStatement(this);
		}
	}

	public final OuterStatementContext outerStatement() throws RecognitionException {
		OuterStatementContext _localctx = new OuterStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outerStatement);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FuncKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				function();
				}
				break;
			case ConstKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				const_();
				}
				break;
			case ObjectKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				object();
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

	public static class TopStatementContext extends ParserRuleContext {
		public TerminalNode ImportKeyword() { return getToken(ScopeParser.ImportKeyword, 0); }
		public TerminalNode StringLiteral() { return getToken(ScopeParser.StringLiteral, 0); }
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitTopStatement(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topStatement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ImportKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ImportKeyword);
				setState(139);
				match(StringLiteral);
				setState(140);
				match(EndLine);
				}
				break;
			case NamespaceKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				namespace();
				}
				break;
			case UsingKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				using();
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			typeName(0);
			setState(146);
			match(Identifier);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VoidType) | (1L << IntType) | (1L << StrType) | (1L << BoolType) | (1L << DecType) | (1L << Identifier))) != 0)) {
				{
				setState(148);
				parameter();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(149);
					match(T__0);
					setState(150);
					parameter();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Sub) | (1L << Not) | (1L << NewKeyword) | (1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(158);
				expr(0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(159);
					match(T__0);
					setState(160);
					expr(0);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class InvokeContext extends ParserRuleContext {
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitInvoke(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_invoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			fullIdent();
			setState(169);
			match(LeftParen);
			setState(170);
			arguments();
			setState(171);
			match(RightParen);
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

	public static class DeclareContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ScopeParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			typeName(0);
			setState(174);
			match(Identifier);
			setState(175);
			match(Assign);
			setState(176);
			expr(0);
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ScopeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ScopeParser.Identifier, i);
		}
		public TerminalNode Assign() { return getToken(ScopeParser.Assign, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(ScopeParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(ScopeParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(ScopeParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(ScopeParser.RightBracket, i);
		}
		public TerminalNode Access() { return getToken(ScopeParser.Access, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(Identifier);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBracket) {
					{
					{
					setState(179);
					match(LeftBracket);
					setState(180);
					expr(0);
					setState(181);
					match(RightBracket);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(Assign);
				setState(189);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(Identifier);
				setState(191);
				match(Access);
				setState(192);
				match(Identifier);
				setState(193);
				match(Assign);
				setState(194);
				expr(0);
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

	public static class OpAssignContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode PowAssign() { return getToken(ScopeParser.PowAssign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MulAssign() { return getToken(ScopeParser.MulAssign, 0); }
		public TerminalNode DivAssign() { return getToken(ScopeParser.DivAssign, 0); }
		public TerminalNode AddAssign() { return getToken(ScopeParser.AddAssign, 0); }
		public TerminalNode SubAssign() { return getToken(ScopeParser.SubAssign, 0); }
		public TerminalNode ModAssign() { return getToken(ScopeParser.ModAssign, 0); }
		public OpAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterOpAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitOpAssign(this);
		}
	}

	public final OpAssignContext opAssign() throws RecognitionException {
		OpAssignContext _localctx = new OpAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opAssign);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(Identifier);
				setState(198);
				match(PowAssign);
				setState(199);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(Identifier);
				setState(201);
				match(MulAssign);
				setState(202);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(Identifier);
				setState(204);
				match(DivAssign);
				setState(205);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(Identifier);
				setState(207);
				match(AddAssign);
				setState(208);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(Identifier);
				setState(210);
				match(SubAssign);
				setState(211);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(Identifier);
				setState(213);
				match(ModAssign);
				setState(214);
				expr(0);
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

	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode ReturnKeyword() { return getToken(ScopeParser.ReturnKeyword, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ReturnKeyword);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Sub) | (1L << Not) | (1L << NewKeyword) | (1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(218);
				expr(0);
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

	public static class BreakpointContext extends ParserRuleContext {
		public TerminalNode BreakpointKeyword() { return getToken(ScopeParser.BreakpointKeyword, 0); }
		public BreakpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterBreakpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitBreakpoint(this);
		}
	}

	public final BreakpointContext breakpoint() throws RecognitionException {
		BreakpointContext _localctx = new BreakpointContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_breakpoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(BreakpointKeyword);
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IfKeyword() { return getToken(ScopeParser.IfKeyword, 0); }
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IfKeyword);
			setState(224);
			match(LeftParen);
			setState(225);
			expr(0);
			setState(226);
			match(RightParen);
			setState(227);
			codeblock();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ElseKeyword) {
				{
				setState(228);
				else_();
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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ElseKeyword() { return getToken(ScopeParser.ElseKeyword, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ElseKeyword);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IfKeyword:
				{
				setState(232);
				if_();
				}
				break;
			case LeftBrace:
				{
				setState(233);
				codeblock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WhileKeyword() { return getToken(ScopeParser.WhileKeyword, 0); }
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(WhileKeyword);
			setState(237);
			match(LeftParen);
			setState(238);
			expr(0);
			setState(239);
			match(RightParen);
			setState(240);
			codeblock();
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode ForKeyword() { return getToken(ScopeParser.ForKeyword, 0); }
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode Where() { return getToken(ScopeParser.Where, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Range() { return getToken(ScopeParser.Range, 0); }
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode StepKeyword() { return getToken(ScopeParser.StepKeyword, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ForKeyword);
			setState(243);
			match(LeftParen);
			setState(244);
			typeName(0);
			setState(245);
			match(Identifier);
			setState(246);
			match(Where);
			setState(247);
			expr(0);
			setState(248);
			match(Range);
			setState(249);
			expr(0);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StepKeyword) {
				{
				setState(250);
				match(StepKeyword);
				setState(251);
				expr(0);
				}
			}

			setState(254);
			match(RightParen);
			setState(255);
			codeblock();
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

	public static class BreakContext extends ParserRuleContext {
		public List<TerminalNode> BreakKeyword() { return getTokens(ScopeParser.BreakKeyword); }
		public TerminalNode BreakKeyword(int i) {
			return getToken(ScopeParser.BreakKeyword, i);
		}
		public TerminalNode ContinueKeyword() { return getToken(ScopeParser.ContinueKeyword, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitBreak(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				match(BreakKeyword);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BreakKeyword );
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ContinueKeyword) {
				{
				setState(262);
				match(ContinueKeyword);
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

	public static class ContinueContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(ScopeParser.ContinueKeyword, 0); }
		public ContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitContinue(this);
		}
	}

	public final ContinueContext continue_() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ContinueKeyword);
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

	public static class AssemblyContext extends ParserRuleContext {
		public TerminalNode AssemblyBlock() { return getToken(ScopeParser.AssemblyBlock, 0); }
		public AssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitAssembly(this);
		}
	}

	public final AssemblyContext assembly() throws RecognitionException {
		AssemblyContext _localctx = new AssemblyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(AssemblyBlock);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FuncKeyword() { return getToken(ScopeParser.FuncKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(FuncKeyword);
			setState(270);
			typeName(0);
			setState(271);
			match(Identifier);
			setState(272);
			match(LeftParen);
			setState(273);
			parameters();
			setState(274);
			match(RightParen);
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(275);
				codeblock();
				}
				break;
			case EndLine:
				{
				setState(276);
				match(EndLine);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstContext extends ParserRuleContext {
		public TerminalNode ConstKeyword() { return getToken(ScopeParser.ConstKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ScopeParser.Assign, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitConst(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ConstKeyword);
			setState(280);
			typeName(0);
			setState(281);
			match(Identifier);
			setState(282);
			match(Assign);
			setState(283);
			literals();
			setState(284);
			match(EndLine);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode ObjectKeyword() { return getToken(ScopeParser.ObjectKeyword, 0); }
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode LeftBrace() { return getToken(ScopeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(ScopeParser.RightBrace, 0); }
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ObjectKeyword);
			setState(287);
			match(Identifier);
			setState(288);
			match(LeftBrace);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VoidType) | (1L << IntType) | (1L << StrType) | (1L << BoolType) | (1L << DecType) | (1L << Identifier))) != 0)) {
				{
				{
				setState(289);
				objectField();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(RightBrace);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NamespaceKeyword() { return getToken(ScopeParser.NamespaceKeyword, 0); }
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(NamespaceKeyword);
			setState(298);
			fullIdent();
			setState(299);
			match(EndLine);
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

	public static class UsingContext extends ParserRuleContext {
		public TerminalNode UsingKeyword() { return getToken(ScopeParser.UsingKeyword, 0); }
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitUsing(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(UsingKeyword);
			setState(302);
			fullIdent();
			setState(303);
			match(EndLine);
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

	public static class ObjectFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ScopeParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(ScopeParser.EndLine, 0); }
		public ObjectFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitObjectField(this);
		}
	}

	public final ObjectFieldContext objectField() throws RecognitionException {
		ObjectFieldContext _localctx = new ObjectFieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			typeName(0);
			setState(306);
			match(Identifier);
			setState(307);
			match(Assign);
			setState(308);
			expr(0);
			setState(309);
			match(EndLine);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Not() { return getToken(ScopeParser.Not, 0); }
		public TerminalNode Sub() { return getToken(ScopeParser.Sub, 0); }
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode Pow() { return getToken(ScopeParser.Pow, 0); }
		public TerminalNode Mul() { return getToken(ScopeParser.Mul, 0); }
		public TerminalNode Div() { return getToken(ScopeParser.Div, 0); }
		public TerminalNode Mod() { return getToken(ScopeParser.Mod, 0); }
		public TerminalNode Add() { return getToken(ScopeParser.Add, 0); }
		public TerminalNode Equals() { return getToken(ScopeParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(ScopeParser.NotEquals, 0); }
		public TerminalNode GreaterThan() { return getToken(ScopeParser.GreaterThan, 0); }
		public TerminalNode LessThan() { return getToken(ScopeParser.LessThan, 0); }
		public TerminalNode GreaterThanEqual() { return getToken(ScopeParser.GreaterThanEqual, 0); }
		public TerminalNode LessThanEqual() { return getToken(ScopeParser.LessThanEqual, 0); }
		public TerminalNode IsKeyword() { return getToken(ScopeParser.IsKeyword, 0); }
		public TerminalNode And() { return getToken(ScopeParser.And, 0); }
		public TerminalNode Or() { return getToken(ScopeParser.Or, 0); }
		public TerminalNode Access() { return getToken(ScopeParser.Access, 0); }
		public TerminalNode Identifier() { return getToken(ScopeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(ScopeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(ScopeParser.RightBracket, 0); }
		public TerminalNode Cast() { return getToken(ScopeParser.Cast, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitExpr(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==Sub || _la==Not) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				expr(11);
				}
				break;
			case 2:
				{
				setState(314);
				match(LeftParen);
				setState(315);
				expr(0);
				setState(316);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(318);
				arrayInit();
				}
				break;
			case 4:
				{
				setState(319);
				objectInit();
				}
				break;
			case 5:
				{
				setState(320);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(324);
						match(Pow);
						setState(325);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(327);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(328);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(330);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(333);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << GreaterThan) | (1L << LessThan) | (1L << GreaterThanEqual) | (1L << LessThanEqual) | (1L << IsKeyword))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(336);
						_la = _input.LA(1);
						if ( !(_la==And || _la==Or) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(339);
						match(Access);
						setState(340);
						match(Identifier);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(342);
						match(LeftBracket);
						setState(343);
						expr(0);
						setState(344);
						match(RightBracket);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(347);
						match(Cast);
						setState(348);
						typeName(0);
						}
						break;
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				literals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				fullIdent();
				setState(356);
				match(LeftParen);
				setState(357);
				arguments();
				setState(358);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				fullIdent();
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

	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ScopeParser.IntegerLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(ScopeParser.DecimalLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ScopeParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ScopeParser.BooleanLiteral, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitLiterals(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral))) != 0)) ) {
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

	public static class ArrayInitContext extends ParserRuleContext {
		public TerminalNode NewKeyword() { return getToken(ScopeParser.NewKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(ScopeParser.LeftBrace, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(ScopeParser.RightBrace, 0); }
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitArrayInit(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(NewKeyword);
			setState(366);
			typeName(0);
			setState(367);
			match(LeftBrace);
			setState(368);
			arguments();
			setState(369);
			match(RightBrace);
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

	public static class ObjectInitContext extends ParserRuleContext {
		public TerminalNode NewKeyword() { return getToken(ScopeParser.NewKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(ScopeParser.LeftParen, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(ScopeParser.RightParen, 0); }
		public ObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitObjectInit(this);
		}
	}

	public final ObjectInitContext objectInit() throws RecognitionException {
		ObjectInitContext _localctx = new ObjectInitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_objectInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(NewKeyword);
			setState(372);
			typeName(0);
			setState(373);
			match(LeftParen);
			setState(374);
			arguments();
			setState(375);
			match(RightParen);
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

	public static class FullIdentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ScopeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ScopeParser.Identifier, i);
		}
		public List<TerminalNode> Resolve() { return getTokens(ScopeParser.Resolve); }
		public TerminalNode Resolve(int i) {
			return getToken(ScopeParser.Resolve, i);
		}
		public FullIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterFullIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitFullIdent(this);
		}
	}

	public final FullIdentContext fullIdent() throws RecognitionException {
		FullIdentContext _localctx = new FullIdentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fullIdent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Identifier);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					match(Resolve);
					setState(379);
					match(Identifier);
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode VoidType() { return getToken(ScopeParser.VoidType, 0); }
		public TerminalNode StrType() { return getToken(ScopeParser.StrType, 0); }
		public TerminalNode IntType() { return getToken(ScopeParser.IntType, 0); }
		public TerminalNode BoolType() { return getToken(ScopeParser.BoolType, 0); }
		public TerminalNode DecType() { return getToken(ScopeParser.DecType, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VoidType) | (1L << IntType) | (1L << StrType) | (1L << BoolType) | (1L << DecType))) != 0)) ) {
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

	public static class TypeNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FullIdentContext fullIdent() {
			return getRuleContext(FullIdentContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(ScopeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(ScopeParser.RightBracket, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScopeListener ) ((ScopeListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VoidType:
			case IntType:
			case StrType:
			case BoolType:
			case DecType:
				{
				setState(388);
				primitiveType();
				}
				break;
			case Identifier:
				{
				setState(389);
				fullIdent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(392);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(393);
					match(LeftBracket);
					setState(394);
					match(RightBracket);
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 37:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u0191\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001S\b\u0001\n\u0001\f\u0001"+
		"V\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003]\b\u0003\n\u0003\f\u0003`\t\u0003\u0001\u0004\u0005\u0004"+
		"c\b\u0004\n\u0004\f\u0004f\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0084\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0089\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0090\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u0098\b\t\n\t\f\t\u009b\t\t\u0003\t\u009d\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n\u0003\n\u00a7"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00b8\b\r\n\r\f\r\u00bb\t\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00c4\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d8\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00dc\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00e6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00eb"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fd"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u0103"+
		"\b\u0015\u000b\u0015\f\u0015\u0104\u0001\u0015\u0003\u0015\u0108\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0116\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0123\b\u001a\n\u001a\f\u001a\u0126\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0142\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u015e\b\u001e\n\u001e\f\u001e\u0161\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u016a\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0005#\u017d\b#\n#\f#\u0180\t#\u0001$\u0001$\u0001%\u0001%\u0001%\u0003"+
		"%\u0187\b%\u0001%\u0001%\u0001%\u0005%\u018c\b%\n%\f%\u018f\t%\u0001%"+
		"\u0000\u0002<J&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0007\u0002"+
		"\u0000\u000e\u000e\u0010\u0010\u0002\u0000\u000b\f\u000f\u000f\u0001\u0000"+
		"\r\u000e\u0002\u0000\u0017\u001c11\u0001\u0000\u001d\u001e\u0001\u0000"+
		":=\u0001\u000059\u01a1\u0000L\u0001\u0000\u0000\u0000\u0002T\u0001\u0000"+
		"\u0000\u0000\u0004W\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000"+
		"\bd\u0001\u0000\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000\f\u0088\u0001"+
		"\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u0091\u0001"+
		"\u0000\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u00a6\u0001"+
		"\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00ad\u0001"+
		"\u0000\u0000\u0000\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00d7\u0001"+
		"\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000"+
		"\u0000\u0000\"\u00df\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000"+
		"\u0000&\u00ec\u0001\u0000\u0000\u0000(\u00f2\u0001\u0000\u0000\u0000*"+
		"\u0102\u0001\u0000\u0000\u0000,\u0109\u0001\u0000\u0000\u0000.\u010b\u0001"+
		"\u0000\u0000\u00000\u010d\u0001\u0000\u0000\u00002\u0117\u0001\u0000\u0000"+
		"\u00004\u011e\u0001\u0000\u0000\u00006\u0129\u0001\u0000\u0000\u00008"+
		"\u012d\u0001\u0000\u0000\u0000:\u0131\u0001\u0000\u0000\u0000<\u0141\u0001"+
		"\u0000\u0000\u0000>\u0169\u0001\u0000\u0000\u0000@\u016b\u0001\u0000\u0000"+
		"\u0000B\u016d\u0001\u0000\u0000\u0000D\u0173\u0001\u0000\u0000\u0000F"+
		"\u0179\u0001\u0000\u0000\u0000H\u0181\u0001\u0000\u0000\u0000J\u0186\u0001"+
		"\u0000\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0003\b\u0004\u0000NO\u0005"+
		"\u0000\u0000\u0001O\u0001\u0001\u0000\u0000\u0000PS\u0003\n\u0005\u0000"+
		"QS\u0003\u0004\u0002\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WX\u0005\u0007\u0000\u0000XY\u0003\u0002\u0001\u0000YZ\u0005\b\u0000\u0000"+
		"Z\u0005\u0001\u0000\u0000\u0000[]\u0003\u000e\u0007\u0000\\[\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_\u0007\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ac\u0003\f\u0006\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\t\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0003\u0016\u000b\u0000hi\u0005"+
		"?\u0000\u0000i\u0084\u0001\u0000\u0000\u0000jk\u0003\u0018\f\u0000kl\u0005"+
		"?\u0000\u0000l\u0084\u0001\u0000\u0000\u0000mn\u0003\u001a\r\u0000no\u0005"+
		"?\u0000\u0000o\u0084\u0001\u0000\u0000\u0000pq\u0003\u001c\u000e\u0000"+
		"qr\u0005?\u0000\u0000r\u0084\u0001\u0000\u0000\u0000st\u0003\u001e\u000f"+
		"\u0000tu\u0005?\u0000\u0000u\u0084\u0001\u0000\u0000\u0000vw\u0003 \u0010"+
		"\u0000wx\u0005?\u0000\u0000x\u0084\u0001\u0000\u0000\u0000y\u0084\u0003"+
		"\"\u0011\u0000z\u0084\u0003&\u0013\u0000{\u0084\u0003(\u0014\u0000|}\u0003"+
		"*\u0015\u0000}~\u0005?\u0000\u0000~\u0084\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0003,\u0016\u0000\u0080\u0081\u0005?\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0003.\u0017\u0000\u0083g\u0001\u0000\u0000"+
		"\u0000\u0083j\u0001\u0000\u0000\u0000\u0083m\u0001\u0000\u0000\u0000\u0083"+
		"p\u0001\u0000\u0000\u0000\u0083s\u0001\u0000\u0000\u0000\u0083v\u0001"+
		"\u0000\u0000\u0000\u0083y\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000"+
		"\u0000\u0083{\u0001\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083"+
		"\u007f\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u000b\u0001\u0000\u0000\u0000\u0085\u0089\u00030\u0018\u0000\u0086\u0089"+
		"\u00032\u0019\u0000\u0087\u0089\u00034\u001a\u0000\u0088\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\r\u0001\u0000\u0000\u0000\u008a\u008b\u0005%\u0000"+
		"\u0000\u008b\u008c\u0005<\u0000\u0000\u008c\u0090\u0005?\u0000\u0000\u008d"+
		"\u0090\u00036\u001b\u0000\u008e\u0090\u00038\u001c\u0000\u008f\u008a\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0092\u0003"+
		"J%\u0000\u0092\u0093\u0005>\u0000\u0000\u0093\u0011\u0001\u0000\u0000"+
		"\u0000\u0094\u0099\u0003\u0010\b\u0000\u0095\u0096\u0005\u0001\u0000\u0000"+
		"\u0096\u0098\u0003\u0010\b\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e"+
		"\u00a3\u0003<\u001e\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a2"+
		"\u0003<\u001e\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003"+
		"F#\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0003\u0014\n"+
		"\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u0017\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0003J%\u0000\u00ae\u00af\u0005>\u0000\u0000\u00af"+
		"\u00b0\u0005\t\u0000\u0000\u00b0\u00b1\u0003<\u001e\u0000\u00b1\u0019"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b9\u0005>\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0005\u0000\u0000\u00b4\u00b5\u0003<\u001e\u0000\u00b5\u00b6\u0005\u0006"+
		"\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\t\u0000"+
		"\u0000\u00bd\u00c4\u0003<\u001e\u0000\u00be\u00bf\u0005>\u0000\u0000\u00bf"+
		"\u00c0\u0005#\u0000\u0000\u00c0\u00c1\u0005>\u0000\u0000\u00c1\u00c2\u0005"+
		"\t\u0000\u0000\u00c2\u00c4\u0003<\u001e\u0000\u00c3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c4\u001b\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005>\u0000\u0000\u00c6\u00c7\u0005\u0011\u0000"+
		"\u0000\u00c7\u00d8\u0003<\u001e\u0000\u00c8\u00c9\u0005>\u0000\u0000\u00c9"+
		"\u00ca\u0005\u0012\u0000\u0000\u00ca\u00d8\u0003<\u001e\u0000\u00cb\u00cc"+
		"\u0005>\u0000\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00d8\u0003"+
		"<\u001e\u0000\u00ce\u00cf\u0005>\u0000\u0000\u00cf\u00d0\u0005\u0014\u0000"+
		"\u0000\u00d0\u00d8\u0003<\u001e\u0000\u00d1\u00d2\u0005>\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0015\u0000\u0000\u00d3\u00d8\u0003<\u001e\u0000\u00d4\u00d5"+
		"\u0005>\u0000\u0000\u00d5\u00d6\u0005\u0016\u0000\u0000\u00d6\u00d8\u0003"+
		"<\u001e\u0000\u00d7\u00c5\u0001\u0000\u0000\u0000\u00d7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00d7\u00cb\u0001\u0000\u0000\u0000\u00d7\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d8\u001d\u0001\u0000\u0000\u0000\u00d9\u00db\u0005&\u0000"+
		"\u0000\u00da\u00dc\u0003<\u001e\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u001f\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\'\u0000\u0000\u00de!\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005(\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e2"+
		"\u0003<\u001e\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e5\u0003"+
		"\u0004\u0002\u0000\u00e4\u00e6\u0003$\u0012\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6#\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ea\u0005)\u0000\u0000\u00e8\u00eb\u0003\"\u0011\u0000"+
		"\u00e9\u00eb\u0003\u0004\u0002\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb%\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005*\u0000\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef"+
		"\u0003<\u001e\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u00f1\u0003"+
		"\u0004\u0002\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005+"+
		"\u0000\u0000\u00f3\u00f4\u0005\u0003\u0000\u0000\u00f4\u00f5\u0003J%\u0000"+
		"\u00f5\u00f6\u0005>\u0000\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8"+
		"\u0003<\u001e\u0000\u00f8\u00f9\u0005!\u0000\u0000\u00f9\u00fc\u0003<"+
		"\u001e\u0000\u00fa\u00fb\u0005,\u0000\u0000\u00fb\u00fd\u0003<\u001e\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0004\u0000\u0000"+
		"\u00ff\u0100\u0003\u0004\u0002\u0000\u0100)\u0001\u0000\u0000\u0000\u0101"+
		"\u0103\u0005/\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u00050\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108+\u0001\u0000\u0000\u0000\u0109\u010a\u00050\u0000"+
		"\u0000\u010a-\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0002\u0000\u0000"+
		"\u010c/\u0001\u0000\u0000\u0000\u010d\u010e\u0005$\u0000\u0000\u010e\u010f"+
		"\u0003J%\u0000\u010f\u0110\u0005>\u0000\u0000\u0110\u0111\u0005\u0003"+
		"\u0000\u0000\u0111\u0112\u0003\u0012\t\u0000\u0112\u0115\u0005\u0004\u0000"+
		"\u0000\u0113\u0116\u0003\u0004\u0002\u0000\u0114\u0116\u0005?\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u01161\u0001\u0000\u0000\u0000\u0117\u0118\u00052\u0000\u0000\u0118\u0119"+
		"\u0003J%\u0000\u0119\u011a\u0005>\u0000\u0000\u011a\u011b\u0005\t\u0000"+
		"\u0000\u011b\u011c\u0003@ \u0000\u011c\u011d\u0005?\u0000\u0000\u011d"+
		"3\u0001\u0000\u0000\u0000\u011e\u011f\u00053\u0000\u0000\u011f\u0120\u0005"+
		">\u0000\u0000\u0120\u0124\u0005\u0007\u0000\u0000\u0121\u0123\u0003:\u001d"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005\b\u0000\u0000\u01285\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005-\u0000\u0000\u012a\u012b\u0003F#\u0000\u012b\u012c"+
		"\u0005?\u0000\u0000\u012c7\u0001\u0000\u0000\u0000\u012d\u012e\u0005."+
		"\u0000\u0000\u012e\u012f\u0003F#\u0000\u012f\u0130\u0005?\u0000\u0000"+
		"\u01309\u0001\u0000\u0000\u0000\u0131\u0132\u0003J%\u0000\u0132\u0133"+
		"\u0005>\u0000\u0000\u0133\u0134\u0005\t\u0000\u0000\u0134\u0135\u0003"+
		"<\u001e\u0000\u0135\u0136\u0005?\u0000\u0000\u0136;\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0006\u001e\uffff\uffff\u0000\u0138\u0139\u0007\u0000"+
		"\u0000\u0000\u0139\u0142\u0003<\u001e\u000b\u013a\u013b\u0005\u0003\u0000"+
		"\u0000\u013b\u013c\u0003<\u001e\u0000\u013c\u013d\u0005\u0004\u0000\u0000"+
		"\u013d\u0142\u0001\u0000\u0000\u0000\u013e\u0142\u0003B!\u0000\u013f\u0142"+
		"\u0003D\"\u0000\u0140\u0142\u0003>\u001f\u0000\u0141\u0137\u0001\u0000"+
		"\u0000\u0000\u0141\u013a\u0001\u0000\u0000\u0000\u0141\u013e\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u015f\u0001\u0000\u0000\u0000\u0143\u0144\n\n\u0000"+
		"\u0000\u0144\u0145\u0005\n\u0000\u0000\u0145\u015e\u0003<\u001e\u000b"+
		"\u0146\u0147\n\t\u0000\u0000\u0147\u0148\u0007\u0001\u0000\u0000\u0148"+
		"\u015e\u0003<\u001e\n\u0149\u014a\n\b\u0000\u0000\u014a\u014b\u0007\u0002"+
		"\u0000\u0000\u014b\u015e\u0003<\u001e\t\u014c\u014d\n\u0006\u0000\u0000"+
		"\u014d\u014e\u0007\u0003\u0000\u0000\u014e\u015e\u0003<\u001e\u0007\u014f"+
		"\u0150\n\u0005\u0000\u0000\u0150\u0151\u0007\u0004\u0000\u0000\u0151\u015e"+
		"\u0003<\u001e\u0006\u0152\u0153\n\r\u0000\u0000\u0153\u0154\u0005#\u0000"+
		"\u0000\u0154\u015e\u0005>\u0000\u0000\u0155\u0156\n\f\u0000\u0000\u0156"+
		"\u0157\u0005\u0005\u0000\u0000\u0157\u0158\u0003<\u001e\u0000\u0158\u0159"+
		"\u0005\u0006\u0000\u0000\u0159\u015e\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\n\u0007\u0000\u0000\u015b\u015c\u0005\u001f\u0000\u0000\u015c\u015e\u0003"+
		"J%\u0000\u015d\u0143\u0001\u0000\u0000\u0000\u015d\u0146\u0001\u0000\u0000"+
		"\u0000\u015d\u0149\u0001\u0000\u0000\u0000\u015d\u014c\u0001\u0000\u0000"+
		"\u0000\u015d\u014f\u0001\u0000\u0000\u0000\u015d\u0152\u0001\u0000\u0000"+
		"\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000"+
		"\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160=\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u016a\u0003@ \u0000\u0163\u0164"+
		"\u0003F#\u0000\u0164\u0165\u0005\u0003\u0000\u0000\u0165\u0166\u0003\u0014"+
		"\n\u0000\u0166\u0167\u0005\u0004\u0000\u0000\u0167\u016a\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0003F#\u0000\u0169\u0162\u0001\u0000\u0000\u0000\u0169"+
		"\u0163\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"?\u0001\u0000\u0000\u0000\u016b\u016c\u0007\u0005\u0000\u0000\u016cA\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u00054\u0000\u0000\u016e\u016f\u0003J%"+
		"\u0000\u016f\u0170\u0005\u0007\u0000\u0000\u0170\u0171\u0003\u0014\n\u0000"+
		"\u0171\u0172\u0005\b\u0000\u0000\u0172C\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u00054\u0000\u0000\u0174\u0175\u0003J%\u0000\u0175\u0176\u0005"+
		"\u0003\u0000\u0000\u0176\u0177\u0003\u0014\n\u0000\u0177\u0178\u0005\u0004"+
		"\u0000\u0000\u0178E\u0001\u0000\u0000\u0000\u0179\u017e\u0005>\u0000\u0000"+
		"\u017a\u017b\u0005\"\u0000\u0000\u017b\u017d\u0005>\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"G\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0007\u0006\u0000\u0000\u0182I\u0001\u0000\u0000\u0000\u0183\u0184\u0006"+
		"%\uffff\uffff\u0000\u0184\u0187\u0003H$\u0000\u0185\u0187\u0003F#\u0000"+
		"\u0186\u0183\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u018d\u0001\u0000\u0000\u0000\u0188\u0189\n\u0003\u0000\u0000\u0189"+
		"\u018a\u0005\u0005\u0000\u0000\u018a\u018c\u0005\u0006\u0000\u0000\u018b"+
		"\u0188\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"K\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u001dRT"+
		"^d\u0083\u0088\u008f\u0099\u009c\u00a3\u00a6\u00b9\u00c3\u00d7\u00db\u00e5"+
		"\u00ea\u00fc\u0104\u0107\u0115\u0124\u0141\u015d\u015f\u0169\u017e\u0186"+
		"\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}