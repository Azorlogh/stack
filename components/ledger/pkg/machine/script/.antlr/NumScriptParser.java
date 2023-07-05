// Generated from /home/phlimy/Projects/Contrib/stack/components/ledger/pkg/machine/script/NumScript.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumScriptParser extends Parser {
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
	public static final int
		RULE_monetary = 0, RULE_monetaryAll = 1, RULE_literal = 2, RULE_variable = 3, 
		RULE_expression = 4, RULE_allotmentPortion = 5, RULE_destinationInOrder = 6, 
		RULE_destinationAllotment = 7, RULE_keptOrDestination = 8, RULE_destination = 9, 
		RULE_sourceAccountOverdraft = 10, RULE_sourceAccount = 11, RULE_sourceInOrder = 12, 
		RULE_sourceMaxed = 13, RULE_source = 14, RULE_sourceAllotment = 15, RULE_valueAwareSource = 16, 
		RULE_statement = 17, RULE_type_ = 18, RULE_origin = 19, RULE_varDecl = 20, 
		RULE_varListDecl = 21, RULE_script = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"monetary", "monetaryAll", "literal", "variable", "expression", "allotmentPortion", 
			"destinationInOrder", "destinationAllotment", "keptOrDestination", "destination", 
			"sourceAccountOverdraft", "sourceAccount", "sourceInOrder", "sourceMaxed", 
			"source", "sourceAllotment", "valueAwareSource", "statement", "type_", 
			"origin", "varDecl", "varListDecl", "script"
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

	@Override
	public String getGrammarFileName() { return "NumScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NumScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MonetaryContext extends ParserRuleContext {
		public ExpressionContext asset;
		public ExpressionContext amt;
		public TerminalNode LBRACK() { return getToken(NumScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(NumScriptParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MonetaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monetary; }
	}

	public final MonetaryContext monetary() throws RecognitionException {
		MonetaryContext _localctx = new MonetaryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_monetary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(LBRACK);
			setState(47);
			((MonetaryContext)_localctx).asset = expression(0);
			setState(48);
			((MonetaryContext)_localctx).amt = expression(0);
			setState(49);
			match(RBRACK);
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

	public static class MonetaryAllContext extends ParserRuleContext {
		public ExpressionContext asset;
		public TerminalNode LBRACK() { return getToken(NumScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(NumScriptParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MonetaryAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monetaryAll; }
	}

	public final MonetaryAllContext monetaryAll() throws RecognitionException {
		MonetaryAllContext _localctx = new MonetaryAllContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_monetaryAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LBRACK);
			setState(52);
			((MonetaryAllContext)_localctx).asset = expression(0);
			setState(53);
			match(T__0);
			setState(54);
			match(RBRACK);
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
	public static class LitPortionContext extends LiteralContext {
		public TerminalNode PORTION() { return getToken(NumScriptParser.PORTION, 0); }
		public LitPortionContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class LitStringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(NumScriptParser.STRING, 0); }
		public LitStringContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class LitAccountContext extends LiteralContext {
		public TerminalNode ACCOUNT() { return getToken(NumScriptParser.ACCOUNT, 0); }
		public LitAccountContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class LitAssetContext extends LiteralContext {
		public TerminalNode ASSET() { return getToken(NumScriptParser.ASSET, 0); }
		public LitAssetContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class LitNumberContext extends LiteralContext {
		public TerminalNode NUMBER() { return getToken(NumScriptParser.NUMBER, 0); }
		public LitNumberContext(LiteralContext ctx) { copyFrom(ctx); }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				_localctx = new LitAccountContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(ACCOUNT);
				}
				break;
			case ASSET:
				_localctx = new LitAssetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(ASSET);
				}
				break;
			case NUMBER:
				_localctx = new LitNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new LitStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(STRING);
				}
				break;
			case PORTION:
				_localctx = new LitPortionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(PORTION);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(NumScriptParser.VARIABLE_NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(VARIABLE_NAME);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAddSubContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_ADD() { return getToken(NumScriptParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(NumScriptParser.OP_SUB, 0); }
		public ExprAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTernaryContext extends ExpressionContext {
		public ExpressionContext cond;
		public ExpressionContext ifTrue;
		public ExpressionContext ifFalse;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprTernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprArithmeticConditionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(NumScriptParser.EQ, 0); }
		public TerminalNode LT() { return getToken(NumScriptParser.LT, 0); }
		public TerminalNode LTE() { return getToken(NumScriptParser.LTE, 0); }
		public TerminalNode GT() { return getToken(NumScriptParser.GT, 0); }
		public TerminalNode GTE() { return getToken(NumScriptParser.GTE, 0); }
		public ExprArithmeticConditionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolConditionContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_NOT() { return getToken(NumScriptParser.OP_NOT, 0); }
		public TerminalNode OP_AND() { return getToken(NumScriptParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(NumScriptParser.OP_OR, 0); }
		public ExprBoolConditionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLiteralContext extends ExpressionContext {
		public LiteralContext lit;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVariableContext extends ExpressionContext {
		public VariableContext var_;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMonetaryNewContext extends ExpressionContext {
		public MonetaryContext mon;
		public MonetaryContext monetary() {
			return getRuleContext(MonetaryContext.class,0);
		}
		public ExprMonetaryNewContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case PORTION:
			case NUMBER:
			case ACCOUNT:
			case ASSET:
				{
				_localctx = new ExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				((ExprLiteralContext)_localctx).lit = literal();
				}
				break;
			case VARIABLE_NAME:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				((ExprVariableContext)_localctx).var_ = variable();
				}
				break;
			case LBRACK:
				{
				_localctx = new ExprMonetaryNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				((ExprMonetaryNewContext)_localctx).mon = monetary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(72);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						((ExprAddSubContext)_localctx).rhs = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprArithmeticConditionContext(new ExpressionContext(_parentctx, _parentState));
						((ExprArithmeticConditionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(75);
						((ExprArithmeticConditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
							((ExprArithmeticConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						((ExprArithmeticConditionContext)_localctx).rhs = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprBoolConditionContext(new ExpressionContext(_parentctx, _parentState));
						((ExprBoolConditionContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(78);
						((ExprBoolConditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_AND) | (1L << OP_OR) | (1L << OP_NOT))) != 0)) ) {
							((ExprBoolConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						((ExprBoolConditionContext)_localctx).rhs = expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprTernaryContext(new ExpressionContext(_parentctx, _parentState));
						((ExprTernaryContext)_localctx).cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(81);
						match(T__1);
						setState(82);
						((ExprTernaryContext)_localctx).ifTrue = expression(0);
						setState(83);
						match(T__2);
						setState(84);
						((ExprTernaryContext)_localctx).ifFalse = expression(2);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class AllotmentPortionContext extends ParserRuleContext {
		public AllotmentPortionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allotmentPortion; }
	 
		public AllotmentPortionContext() { }
		public void copyFrom(AllotmentPortionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllotmentPortionRemainingContext extends AllotmentPortionContext {
		public TerminalNode REMAINING() { return getToken(NumScriptParser.REMAINING, 0); }
		public AllotmentPortionRemainingContext(AllotmentPortionContext ctx) { copyFrom(ctx); }
	}
	public static class AllotmentPortionVarContext extends AllotmentPortionContext {
		public VariableContext por;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AllotmentPortionVarContext(AllotmentPortionContext ctx) { copyFrom(ctx); }
	}
	public static class AllotmentPortionConstContext extends AllotmentPortionContext {
		public TerminalNode PORTION() { return getToken(NumScriptParser.PORTION, 0); }
		public AllotmentPortionConstContext(AllotmentPortionContext ctx) { copyFrom(ctx); }
	}

	public final AllotmentPortionContext allotmentPortion() throws RecognitionException {
		AllotmentPortionContext _localctx = new AllotmentPortionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_allotmentPortion);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PORTION:
				_localctx = new AllotmentPortionConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(PORTION);
				}
				break;
			case VARIABLE_NAME:
				_localctx = new AllotmentPortionVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((AllotmentPortionVarContext)_localctx).por = variable();
				}
				break;
			case REMAINING:
				_localctx = new AllotmentPortionRemainingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(REMAINING);
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

	public static class DestinationInOrderContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> amounts = new ArrayList<ExpressionContext>();
		public KeptOrDestinationContext keptOrDestination;
		public List<KeptOrDestinationContext> dests = new ArrayList<KeptOrDestinationContext>();
		public KeptOrDestinationContext remainingDest;
		public TerminalNode LBRACE() { return getToken(NumScriptParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode REMAINING() { return getToken(NumScriptParser.REMAINING, 0); }
		public TerminalNode RBRACE() { return getToken(NumScriptParser.RBRACE, 0); }
		public List<KeptOrDestinationContext> keptOrDestination() {
			return getRuleContexts(KeptOrDestinationContext.class);
		}
		public KeptOrDestinationContext keptOrDestination(int i) {
			return getRuleContext(KeptOrDestinationContext.class,i);
		}
		public List<TerminalNode> MAX() { return getTokens(NumScriptParser.MAX); }
		public TerminalNode MAX(int i) {
			return getToken(NumScriptParser.MAX, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DestinationInOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationInOrder; }
	}

	public final DestinationInOrderContext destinationInOrder() throws RecognitionException {
		DestinationInOrderContext _localctx = new DestinationInOrderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_destinationInOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LBRACE);
			setState(97);
			match(NEWLINE);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				match(MAX);
				setState(99);
				((DestinationInOrderContext)_localctx).expression = expression(0);
				((DestinationInOrderContext)_localctx).amounts.add(((DestinationInOrderContext)_localctx).expression);
				setState(100);
				((DestinationInOrderContext)_localctx).keptOrDestination = keptOrDestination();
				((DestinationInOrderContext)_localctx).dests.add(((DestinationInOrderContext)_localctx).keptOrDestination);
				setState(101);
				match(NEWLINE);
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAX );
			setState(107);
			match(REMAINING);
			setState(108);
			((DestinationInOrderContext)_localctx).remainingDest = keptOrDestination();
			setState(109);
			match(NEWLINE);
			setState(110);
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

	public static class DestinationAllotmentContext extends ParserRuleContext {
		public AllotmentPortionContext allotmentPortion;
		public List<AllotmentPortionContext> portions = new ArrayList<AllotmentPortionContext>();
		public KeptOrDestinationContext keptOrDestination;
		public List<KeptOrDestinationContext> dests = new ArrayList<KeptOrDestinationContext>();
		public TerminalNode LBRACE() { return getToken(NumScriptParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode RBRACE() { return getToken(NumScriptParser.RBRACE, 0); }
		public List<AllotmentPortionContext> allotmentPortion() {
			return getRuleContexts(AllotmentPortionContext.class);
		}
		public AllotmentPortionContext allotmentPortion(int i) {
			return getRuleContext(AllotmentPortionContext.class,i);
		}
		public List<KeptOrDestinationContext> keptOrDestination() {
			return getRuleContexts(KeptOrDestinationContext.class);
		}
		public KeptOrDestinationContext keptOrDestination(int i) {
			return getRuleContext(KeptOrDestinationContext.class,i);
		}
		public DestinationAllotmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationAllotment; }
	}

	public final DestinationAllotmentContext destinationAllotment() throws RecognitionException {
		DestinationAllotmentContext _localctx = new DestinationAllotmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_destinationAllotment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LBRACE);
			setState(113);
			match(NEWLINE);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				((DestinationAllotmentContext)_localctx).allotmentPortion = allotmentPortion();
				((DestinationAllotmentContext)_localctx).portions.add(((DestinationAllotmentContext)_localctx).allotmentPortion);
				setState(115);
				((DestinationAllotmentContext)_localctx).keptOrDestination = keptOrDestination();
				((DestinationAllotmentContext)_localctx).dests.add(((DestinationAllotmentContext)_localctx).keptOrDestination);
				setState(116);
				match(NEWLINE);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PORTION) | (1L << REMAINING) | (1L << VARIABLE_NAME))) != 0) );
			setState(122);
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

	public static class KeptOrDestinationContext extends ParserRuleContext {
		public KeptOrDestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keptOrDestination; }
	 
		public KeptOrDestinationContext() { }
		public void copyFrom(KeptOrDestinationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsKeptContext extends KeptOrDestinationContext {
		public TerminalNode KEPT() { return getToken(NumScriptParser.KEPT, 0); }
		public IsKeptContext(KeptOrDestinationContext ctx) { copyFrom(ctx); }
	}
	public static class IsDestinationContext extends KeptOrDestinationContext {
		public TerminalNode TO() { return getToken(NumScriptParser.TO, 0); }
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public IsDestinationContext(KeptOrDestinationContext ctx) { copyFrom(ctx); }
	}

	public final KeptOrDestinationContext keptOrDestination() throws RecognitionException {
		KeptOrDestinationContext _localctx = new KeptOrDestinationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keptOrDestination);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
				_localctx = new IsDestinationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(TO);
				setState(125);
				destination();
				}
				break;
			case KEPT:
				_localctx = new IsKeptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(KEPT);
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

	public static class DestinationContext extends ParserRuleContext {
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
	 
		public DestinationContext() { }
		public void copyFrom(DestinationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DestAccountContext extends DestinationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DestAccountContext(DestinationContext ctx) { copyFrom(ctx); }
	}
	public static class DestAllotmentContext extends DestinationContext {
		public DestinationAllotmentContext destinationAllotment() {
			return getRuleContext(DestinationAllotmentContext.class,0);
		}
		public DestAllotmentContext(DestinationContext ctx) { copyFrom(ctx); }
	}
	public static class DestInOrderContext extends DestinationContext {
		public DestinationInOrderContext destinationInOrder() {
			return getRuleContext(DestinationInOrderContext.class,0);
		}
		public DestInOrderContext(DestinationContext ctx) { copyFrom(ctx); }
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_destination);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DestAccountContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				expression(0);
				}
				break;
			case 2:
				_localctx = new DestInOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				destinationInOrder();
				}
				break;
			case 3:
				_localctx = new DestAllotmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				destinationAllotment();
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

	public static class SourceAccountOverdraftContext extends ParserRuleContext {
		public SourceAccountOverdraftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAccountOverdraft; }
	 
		public SourceAccountOverdraftContext() { }
		public void copyFrom(SourceAccountOverdraftContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SrcAccountOverdraftSpecificContext extends SourceAccountOverdraftContext {
		public ExpressionContext specific;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SrcAccountOverdraftSpecificContext(SourceAccountOverdraftContext ctx) { copyFrom(ctx); }
	}
	public static class SrcAccountOverdraftUnboundedContext extends SourceAccountOverdraftContext {
		public SrcAccountOverdraftUnboundedContext(SourceAccountOverdraftContext ctx) { copyFrom(ctx); }
	}

	public final SourceAccountOverdraftContext sourceAccountOverdraft() throws RecognitionException {
		SourceAccountOverdraftContext _localctx = new SourceAccountOverdraftContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sourceAccountOverdraft);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new SrcAccountOverdraftSpecificContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__3);
				setState(135);
				((SrcAccountOverdraftSpecificContext)_localctx).specific = expression(0);
				}
				break;
			case T__4:
				_localctx = new SrcAccountOverdraftUnboundedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__4);
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

	public static class SourceAccountContext extends ParserRuleContext {
		public ExpressionContext account;
		public SourceAccountOverdraftContext overdraft;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SourceAccountOverdraftContext sourceAccountOverdraft() {
			return getRuleContext(SourceAccountOverdraftContext.class,0);
		}
		public SourceAccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAccount; }
	}

	public final SourceAccountContext sourceAccount() throws RecognitionException {
		SourceAccountContext _localctx = new SourceAccountContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sourceAccount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((SourceAccountContext)_localctx).account = expression(0);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(140);
				((SourceAccountContext)_localctx).overdraft = sourceAccountOverdraft();
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

	public static class SourceInOrderContext extends ParserRuleContext {
		public SourceContext source;
		public List<SourceContext> sources = new ArrayList<SourceContext>();
		public TerminalNode LBRACE() { return getToken(NumScriptParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode RBRACE() { return getToken(NumScriptParser.RBRACE, 0); }
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public SourceInOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceInOrder; }
	}

	public final SourceInOrderContext sourceInOrder() throws RecognitionException {
		SourceInOrderContext _localctx = new SourceInOrderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sourceInOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LBRACE);
			setState(144);
			match(NEWLINE);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				((SourceInOrderContext)_localctx).source = source();
				((SourceInOrderContext)_localctx).sources.add(((SourceInOrderContext)_localctx).source);
				setState(146);
				match(NEWLINE);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << LBRACK) | (1L << LBRACE) | (1L << STRING) | (1L << PORTION) | (1L << NUMBER) | (1L << VARIABLE_NAME) | (1L << ACCOUNT) | (1L << ASSET))) != 0) );
			setState(152);
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

	public static class SourceMaxedContext extends ParserRuleContext {
		public ExpressionContext max;
		public SourceContext src;
		public TerminalNode MAX() { return getToken(NumScriptParser.MAX, 0); }
		public TerminalNode FROM() { return getToken(NumScriptParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public SourceMaxedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceMaxed; }
	}

	public final SourceMaxedContext sourceMaxed() throws RecognitionException {
		SourceMaxedContext _localctx = new SourceMaxedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sourceMaxed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(MAX);
			setState(155);
			((SourceMaxedContext)_localctx).max = expression(0);
			setState(156);
			match(FROM);
			setState(157);
			((SourceMaxedContext)_localctx).src = source();
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

	public static class SourceContext extends ParserRuleContext {
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	 
		public SourceContext() { }
		public void copyFrom(SourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SrcAccountContext extends SourceContext {
		public SourceAccountContext sourceAccount() {
			return getRuleContext(SourceAccountContext.class,0);
		}
		public SrcAccountContext(SourceContext ctx) { copyFrom(ctx); }
	}
	public static class SrcMaxedContext extends SourceContext {
		public SourceMaxedContext sourceMaxed() {
			return getRuleContext(SourceMaxedContext.class,0);
		}
		public SrcMaxedContext(SourceContext ctx) { copyFrom(ctx); }
	}
	public static class SrcInOrderContext extends SourceContext {
		public SourceInOrderContext sourceInOrder() {
			return getRuleContext(SourceInOrderContext.class,0);
		}
		public SrcInOrderContext(SourceContext ctx) { copyFrom(ctx); }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_source);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case STRING:
			case PORTION:
			case NUMBER:
			case VARIABLE_NAME:
			case ACCOUNT:
			case ASSET:
				_localctx = new SrcAccountContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				sourceAccount();
				}
				break;
			case MAX:
				_localctx = new SrcMaxedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				sourceMaxed();
				}
				break;
			case LBRACE:
				_localctx = new SrcInOrderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				sourceInOrder();
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

	public static class SourceAllotmentContext extends ParserRuleContext {
		public AllotmentPortionContext allotmentPortion;
		public List<AllotmentPortionContext> portions = new ArrayList<AllotmentPortionContext>();
		public SourceContext source;
		public List<SourceContext> sources = new ArrayList<SourceContext>();
		public TerminalNode LBRACE() { return getToken(NumScriptParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode RBRACE() { return getToken(NumScriptParser.RBRACE, 0); }
		public List<TerminalNode> FROM() { return getTokens(NumScriptParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(NumScriptParser.FROM, i);
		}
		public List<AllotmentPortionContext> allotmentPortion() {
			return getRuleContexts(AllotmentPortionContext.class);
		}
		public AllotmentPortionContext allotmentPortion(int i) {
			return getRuleContext(AllotmentPortionContext.class,i);
		}
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public SourceAllotmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAllotment; }
	}

	public final SourceAllotmentContext sourceAllotment() throws RecognitionException {
		SourceAllotmentContext _localctx = new SourceAllotmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sourceAllotment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LBRACE);
			setState(165);
			match(NEWLINE);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				((SourceAllotmentContext)_localctx).allotmentPortion = allotmentPortion();
				((SourceAllotmentContext)_localctx).portions.add(((SourceAllotmentContext)_localctx).allotmentPortion);
				setState(167);
				match(FROM);
				setState(168);
				((SourceAllotmentContext)_localctx).source = source();
				((SourceAllotmentContext)_localctx).sources.add(((SourceAllotmentContext)_localctx).source);
				setState(169);
				match(NEWLINE);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PORTION) | (1L << REMAINING) | (1L << VARIABLE_NAME))) != 0) );
			setState(175);
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

	public static class ValueAwareSourceContext extends ParserRuleContext {
		public ValueAwareSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAwareSource; }
	 
		public ValueAwareSourceContext() { }
		public void copyFrom(ValueAwareSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SrcContext extends ValueAwareSourceContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public SrcContext(ValueAwareSourceContext ctx) { copyFrom(ctx); }
	}
	public static class SrcAllotmentContext extends ValueAwareSourceContext {
		public SourceAllotmentContext sourceAllotment() {
			return getRuleContext(SourceAllotmentContext.class,0);
		}
		public SrcAllotmentContext(ValueAwareSourceContext ctx) { copyFrom(ctx); }
	}

	public final ValueAwareSourceContext valueAwareSource() throws RecognitionException {
		ValueAwareSourceContext _localctx = new ValueAwareSourceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valueAwareSource);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SrcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				source();
				}
				break;
			case 2:
				_localctx = new SrcAllotmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				sourceAllotment();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExpressionContext expr;
		public TerminalNode PRINT() { return getToken(NumScriptParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SendAllContext extends StatementContext {
		public MonetaryAllContext monAll;
		public SourceContext src;
		public DestinationContext dest;
		public TerminalNode SEND() { return getToken(NumScriptParser.SEND, 0); }
		public TerminalNode LPAREN() { return getToken(NumScriptParser.LPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode RPAREN() { return getToken(NumScriptParser.RPAREN, 0); }
		public MonetaryAllContext monetaryAll() {
			return getRuleContext(MonetaryAllContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(NumScriptParser.SOURCE, 0); }
		public List<TerminalNode> EQ() { return getTokens(NumScriptParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(NumScriptParser.EQ, i);
		}
		public TerminalNode DESTINATION() { return getToken(NumScriptParser.DESTINATION, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public SendAllContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SaveFromAccountContext extends StatementContext {
		public ExpressionContext mon;
		public MonetaryAllContext monAll;
		public ExpressionContext acc;
		public TerminalNode SAVE() { return getToken(NumScriptParser.SAVE, 0); }
		public TerminalNode FROM() { return getToken(NumScriptParser.FROM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MonetaryAllContext monetaryAll() {
			return getRuleContext(MonetaryAllContext.class,0);
		}
		public SaveFromAccountContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetTxMetaContext extends StatementContext {
		public Token key;
		public ExpressionContext value;
		public TerminalNode SET_TX_META() { return getToken(NumScriptParser.SET_TX_META, 0); }
		public TerminalNode LPAREN() { return getToken(NumScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NumScriptParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(NumScriptParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetTxMetaContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetAccountMetaContext extends StatementContext {
		public ExpressionContext acc;
		public Token key;
		public ExpressionContext value;
		public TerminalNode SET_ACCOUNT_META() { return getToken(NumScriptParser.SET_ACCOUNT_META, 0); }
		public TerminalNode LPAREN() { return getToken(NumScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NumScriptParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(NumScriptParser.STRING, 0); }
		public SetAccountMetaContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class FailContext extends StatementContext {
		public TerminalNode FAIL() { return getToken(NumScriptParser.FAIL, 0); }
		public FailContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SendContext extends StatementContext {
		public ExpressionContext mon;
		public ValueAwareSourceContext src;
		public DestinationContext dest;
		public TerminalNode SEND() { return getToken(NumScriptParser.SEND, 0); }
		public TerminalNode LPAREN() { return getToken(NumScriptParser.LPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode RPAREN() { return getToken(NumScriptParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(NumScriptParser.SOURCE, 0); }
		public List<TerminalNode> EQ() { return getTokens(NumScriptParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(NumScriptParser.EQ, i);
		}
		public TerminalNode DESTINATION() { return getToken(NumScriptParser.DESTINATION, 0); }
		public ValueAwareSourceContext valueAwareSource() {
			return getRuleContext(ValueAwareSourceContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public SendContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(PRINT);
				setState(182);
				((PrintContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new SaveFromAccountContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(SAVE);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(184);
					((SaveFromAccountContext)_localctx).mon = expression(0);
					}
					break;
				case 2:
					{
					setState(185);
					((SaveFromAccountContext)_localctx).monAll = monetaryAll();
					}
					break;
				}
				setState(188);
				match(FROM);
				setState(189);
				((SaveFromAccountContext)_localctx).acc = expression(0);
				}
				break;
			case 3:
				_localctx = new SetTxMetaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(SET_TX_META);
				setState(192);
				match(LPAREN);
				setState(193);
				((SetTxMetaContext)_localctx).key = match(STRING);
				setState(194);
				match(T__5);
				setState(195);
				((SetTxMetaContext)_localctx).value = expression(0);
				setState(196);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new SetAccountMetaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(SET_ACCOUNT_META);
				setState(199);
				match(LPAREN);
				setState(200);
				((SetAccountMetaContext)_localctx).acc = expression(0);
				setState(201);
				match(T__5);
				setState(202);
				((SetAccountMetaContext)_localctx).key = match(STRING);
				setState(203);
				match(T__5);
				setState(204);
				((SetAccountMetaContext)_localctx).value = expression(0);
				setState(205);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new FailContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				match(FAIL);
				}
				break;
			case 6:
				_localctx = new SendContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(SEND);
				setState(209);
				((SendContext)_localctx).mon = expression(0);
				setState(210);
				match(LPAREN);
				setState(211);
				match(NEWLINE);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOURCE:
					{
					setState(212);
					match(SOURCE);
					setState(213);
					match(EQ);
					setState(214);
					((SendContext)_localctx).src = valueAwareSource();
					setState(215);
					match(NEWLINE);
					setState(216);
					match(DESTINATION);
					setState(217);
					match(EQ);
					setState(218);
					((SendContext)_localctx).dest = destination();
					}
					break;
				case DESTINATION:
					{
					setState(220);
					match(DESTINATION);
					setState(221);
					match(EQ);
					setState(222);
					((SendContext)_localctx).dest = destination();
					setState(223);
					match(NEWLINE);
					setState(224);
					match(SOURCE);
					setState(225);
					match(EQ);
					setState(226);
					((SendContext)_localctx).src = valueAwareSource();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230);
				match(NEWLINE);
				setState(231);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new SendAllContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				match(SEND);
				setState(234);
				((SendAllContext)_localctx).monAll = monetaryAll();
				setState(235);
				match(LPAREN);
				setState(236);
				match(NEWLINE);
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOURCE:
					{
					setState(237);
					match(SOURCE);
					setState(238);
					match(EQ);
					setState(239);
					((SendAllContext)_localctx).src = source();
					setState(240);
					match(NEWLINE);
					setState(241);
					match(DESTINATION);
					setState(242);
					match(EQ);
					setState(243);
					((SendAllContext)_localctx).dest = destination();
					}
					break;
				case DESTINATION:
					{
					setState(245);
					match(DESTINATION);
					setState(246);
					match(EQ);
					setState(247);
					((SendAllContext)_localctx).dest = destination();
					setState(248);
					match(NEWLINE);
					setState(249);
					match(SOURCE);
					setState(250);
					match(EQ);
					setState(251);
					((SendAllContext)_localctx).src = source();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				match(NEWLINE);
				setState(256);
				match(RPAREN);
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

	public static class Type_Context extends ParserRuleContext {
		public TerminalNode TY_ACCOUNT() { return getToken(NumScriptParser.TY_ACCOUNT, 0); }
		public TerminalNode TY_ASSET() { return getToken(NumScriptParser.TY_ASSET, 0); }
		public TerminalNode TY_NUMBER() { return getToken(NumScriptParser.TY_NUMBER, 0); }
		public TerminalNode TY_STRING() { return getToken(NumScriptParser.TY_STRING, 0); }
		public TerminalNode TY_MONETARY() { return getToken(NumScriptParser.TY_MONETARY, 0); }
		public TerminalNode TY_PORTION() { return getToken(NumScriptParser.TY_PORTION, 0); }
		public TerminalNode TY_BOOL() { return getToken(NumScriptParser.TY_BOOL, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TY_ACCOUNT) | (1L << TY_ASSET) | (1L << TY_NUMBER) | (1L << TY_MONETARY) | (1L << TY_PORTION) | (1L << TY_STRING) | (1L << TY_BOOL))) != 0)) ) {
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

	public static class OriginContext extends ParserRuleContext {
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
	 
		public OriginContext() { }
		public void copyFrom(OriginContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OriginAccountBalanceContext extends OriginContext {
		public ExpressionContext account;
		public ExpressionContext asset;
		public TerminalNode BALANCE() { return getToken(NumScriptParser.BALANCE, 0); }
		public TerminalNode LPAREN() { return getToken(NumScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NumScriptParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OriginAccountBalanceContext(OriginContext ctx) { copyFrom(ctx); }
	}
	public static class OriginAccountMetaContext extends OriginContext {
		public ExpressionContext account;
		public Token key;
		public TerminalNode META() { return getToken(NumScriptParser.META, 0); }
		public TerminalNode LPAREN() { return getToken(NumScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NumScriptParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(NumScriptParser.STRING, 0); }
		public OriginAccountMetaContext(OriginContext ctx) { copyFrom(ctx); }
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_origin);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case META:
				_localctx = new OriginAccountMetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(META);
				setState(263);
				match(LPAREN);
				setState(264);
				((OriginAccountMetaContext)_localctx).account = expression(0);
				setState(265);
				match(T__5);
				setState(266);
				((OriginAccountMetaContext)_localctx).key = match(STRING);
				setState(267);
				match(RPAREN);
				}
				break;
			case BALANCE:
				_localctx = new OriginAccountBalanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(BALANCE);
				setState(270);
				match(LPAREN);
				setState(271);
				((OriginAccountBalanceContext)_localctx).account = expression(0);
				setState(272);
				match(T__5);
				setState(273);
				((OriginAccountBalanceContext)_localctx).asset = expression(0);
				setState(274);
				match(RPAREN);
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

	public static class VarDeclContext extends ParserRuleContext {
		public Type_Context ty;
		public VariableContext name;
		public OriginContext orig;
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(NumScriptParser.EQ, 0); }
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((VarDeclContext)_localctx).ty = type_();
			setState(279);
			((VarDeclContext)_localctx).name = variable();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(280);
				match(EQ);
				setState(281);
				((VarDeclContext)_localctx).orig = origin();
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

	public static class VarListDeclContext extends ParserRuleContext {
		public VarDeclContext varDecl;
		public List<VarDeclContext> v = new ArrayList<VarDeclContext>();
		public TerminalNode VARS() { return getToken(NumScriptParser.VARS, 0); }
		public TerminalNode LBRACE() { return getToken(NumScriptParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public TerminalNode RBRACE() { return getToken(NumScriptParser.RBRACE, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public VarListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varListDecl; }
	}

	public final VarListDeclContext varListDecl() throws RecognitionException {
		VarListDeclContext _localctx = new VarListDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varListDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(VARS);
			setState(285);
			match(LBRACE);
			setState(286);
			match(NEWLINE);
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				((VarListDeclContext)_localctx).varDecl = varDecl();
				((VarListDeclContext)_localctx).v.add(((VarListDeclContext)_localctx).varDecl);
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(288);
					match(NEWLINE);
					}
					}
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TY_ACCOUNT) | (1L << TY_ASSET) | (1L << TY_NUMBER) | (1L << TY_MONETARY) | (1L << TY_PORTION) | (1L << TY_STRING) | (1L << TY_BOOL))) != 0) );
			setState(297);
			match(RBRACE);
			setState(298);
			match(NEWLINE);
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

	public static class ScriptContext extends ParserRuleContext {
		public VarListDeclContext vars;
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode EOF() { return getToken(NumScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(NumScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NumScriptParser.NEWLINE, i);
		}
		public VarListDeclContext varListDecl() {
			return getRuleContext(VarListDeclContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(300);
				match(NEWLINE);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARS) {
				{
				setState(306);
				((ScriptContext)_localctx).vars = varListDecl();
				}
			}

			setState(309);
			((ScriptContext)_localctx).statement = statement();
			((ScriptContext)_localctx).stmts.add(((ScriptContext)_localctx).statement);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					match(NEWLINE);
					setState(311);
					((ScriptContext)_localctx).statement = statement();
					((ScriptContext)_localctx).stmts.add(((ScriptContext)_localctx).statement);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(317);
				match(NEWLINE);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0148\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\6\bj\n\b\r\b\16\bk\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\6\ty\n\t\r\t\16\tz\3\t\3\t\3\n\3\n\3\n\5\n\u0082\n\n\3\13"+
		"\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\5\r\u0090"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\6\16\u0097\n\16\r\16\16\16\u0098\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\6\21\u00ae\n\21\r\21\16\21\u00af\3\21\3\21\3"+
		"\22\3\22\5\22\u00b6\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e7\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0100\n\23\3\23\3\23"+
		"\3\23\5\23\u0105\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u011d\n\26\3\27\3\27\3\27\3\27\3\27\6\27\u0124\n\27\r\27\16\27\u0125"+
		"\6\27\u0128\n\27\r\27\16\27\u0129\3\27\3\27\3\27\3\30\7\30\u0130\n\30"+
		"\f\30\16\30\u0133\13\30\3\30\5\30\u0136\n\30\3\30\3\30\3\30\7\30\u013b"+
		"\n\30\f\30\16\30\u013e\13\30\3\30\7\30\u0141\n\30\f\30\16\30\u0144\13"+
		"\30\3\30\3\30\3\30\2\3\n\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\2\6\3\2\32\33\4\2\"\"$\'\3\2(*\3\2+\61\2\u0159\2\60\3\2\2\2\4\65"+
		"\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nG\3\2\2\2\f`\3\2\2\2\16b\3\2\2\2\20r\3"+
		"\2\2\2\22\u0081\3\2\2\2\24\u0086\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2"+
		"\2\2\32\u0091\3\2\2\2\34\u009c\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2"+
		"\"\u00b5\3\2\2\2$\u0104\3\2\2\2&\u0106\3\2\2\2(\u0116\3\2\2\2*\u0118\3"+
		"\2\2\2,\u011e\3\2\2\2.\u0131\3\2\2\2\60\61\7\36\2\2\61\62\5\n\6\2\62\63"+
		"\5\n\6\2\63\64\7\37\2\2\64\3\3\2\2\2\65\66\7\36\2\2\66\67\5\n\6\2\678"+
		"\7\3\2\289\7\37\2\29\5\3\2\2\2:@\7;\2\2;@\7<\2\2<@\78\2\2=@\7\62\2\2>"+
		"@\7\63\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2"+
		"\2AB\7:\2\2B\t\3\2\2\2CD\b\6\1\2DH\5\6\4\2EH\5\b\5\2FH\5\2\2\2GC\3\2\2"+
		"\2GE\3\2\2\2GF\3\2\2\2HZ\3\2\2\2IJ\f\t\2\2JK\t\2\2\2KY\5\n\6\nLM\f\b\2"+
		"\2MN\t\3\2\2NY\5\n\6\tOP\f\7\2\2PQ\t\4\2\2QY\5\n\6\bRS\f\3\2\2ST\7\4\2"+
		"\2TU\5\n\6\2UV\7\5\2\2VW\5\n\6\4WY\3\2\2\2XI\3\2\2\2XL\3\2\2\2XO\3\2\2"+
		"\2XR\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]a\7"+
		"\63\2\2^a\5\b\5\2_a\7\64\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2"+
		"bc\7 \2\2ci\7\t\2\2de\7\26\2\2ef\5\n\6\2fg\5\22\n\2gh\7\t\2\2hj\3\2\2"+
		"\2id\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\64\2\2no\5\22"+
		"\n\2op\7\t\2\2pq\7!\2\2q\17\3\2\2\2rs\7 \2\2sx\7\t\2\2tu\5\f\7\2uv\5\22"+
		"\n\2vw\7\t\2\2wy\3\2\2\2xt\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2"+
		"\2\2|}\7!\2\2}\21\3\2\2\2~\177\7\30\2\2\177\u0082\5\24\13\2\u0080\u0082"+
		"\7\65\2\2\u0081~\3\2\2\2\u0081\u0080\3\2\2\2\u0082\23\3\2\2\2\u0083\u0087"+
		"\5\n\6\2\u0084\u0087\5\16\b\2\u0085\u0087\5\20\t\2\u0086\u0083\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089"+
		"\7\6\2\2\u0089\u008c\5\n\6\2\u008a\u008c\7\7\2\2\u008b\u0088\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u008f\5\n\6\2\u008e\u0090\5\26\f"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\31\3\2\2\2\u0091\u0092"+
		"\7 \2\2\u0092\u0096\7\t\2\2\u0093\u0094\5\36\20\2\u0094\u0095\7\t\2\2"+
		"\u0095\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7!\2\2\u009b"+
		"\33\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009e\5\n\6\2\u009e\u009f\7\25"+
		"\2\2\u009f\u00a0\5\36\20\2\u00a0\35\3\2\2\2\u00a1\u00a5\5\30\r\2\u00a2"+
		"\u00a5\5\34\17\2\u00a3\u00a5\5\32\16\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7 \2\2\u00a7"+
		"\u00ad\7\t\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\5"+
		"\36\20\2\u00ab\u00ac\7\t\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\7!\2\2\u00b2!\3\2\2\2\u00b3\u00b6\5\36\20\2\u00b4\u00b6"+
		"\5 \21\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6#\3\2\2\2\u00b7"+
		"\u00b8\7\21\2\2\u00b8\u0105\5\n\6\2\u00b9\u00bc\7\67\2\2\u00ba\u00bd\5"+
		"\n\6\2\u00bb\u00bd\5\4\3\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\5\n\6\2\u00c0\u0105\3"+
		"\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c4\7\62\2\2"+
		"\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\7\35\2\2\u00c7\u0105"+
		"\3\2\2\2\u00c8\u00c9\7\20\2\2\u00c9\u00ca\7\34\2\2\u00ca\u00cb\5\n\6\2"+
		"\u00cb\u00cc\7\b\2\2\u00cc\u00cd\7\62\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf"+
		"\5\n\6\2\u00cf\u00d0\7\35\2\2\u00d0\u0105\3\2\2\2\u00d1\u0105\7\22\2\2"+
		"\u00d2\u00d3\7\23\2\2\u00d3\u00d4\5\n\6\2\u00d4\u00d5\7\34\2\2\u00d5\u00e6"+
		"\7\t\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5\"\22\2"+
		"\u00d9\u00da\7\t\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd"+
		"\5\24\13\2\u00dd\u00e7\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e0\7\"\2"+
		"\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\7\24\2\2\u00e3"+
		"\u00e4\7\"\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00e7\3\2\2\2\u00e6\u00d6\3"+
		"\2\2\2\u00e6\u00de\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\t\2\2\u00e9"+
		"\u00ea\7\35\2\2\u00ea\u0105\3\2\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\5"+
		"\4\3\2\u00ed\u00ee\7\34\2\2\u00ee\u00ff\7\t\2\2\u00ef\u00f0\7\24\2\2\u00f0"+
		"\u00f1\7\"\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\7"+
		"\27\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\5\24\13\2\u00f6\u0100\3\2\2\2"+
		"\u00f7\u00f8\7\27\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\5\24\13\2\u00fa"+
		"\u00fb\7\t\2\2\u00fb\u00fc\7\24\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\5"+
		"\36\20\2\u00fe\u0100\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f7\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\7\t\2\2\u0102\u0103\7\35\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u00b7\3\2\2\2\u0104\u00b9\3\2\2\2\u0104\u00c1\3\2\2\2\u0104"+
		"\u00c8\3\2\2\2\u0104\u00d1\3\2\2\2\u0104\u00d2\3\2\2\2\u0104\u00eb\3\2"+
		"\2\2\u0105%\3\2\2\2\u0106\u0107\t\5\2\2\u0107\'\3\2\2\2\u0108\u0109\7"+
		"\16\2\2\u0109\u010a\7\34\2\2\u010a\u010b\5\n\6\2\u010b\u010c\7\b\2\2\u010c"+
		"\u010d\7\62\2\2\u010d\u010e\7\35\2\2\u010e\u0117\3\2\2\2\u010f\u0110\7"+
		"\66\2\2\u0110\u0111\7\34\2\2\u0111\u0112\5\n\6\2\u0112\u0113\7\b\2\2\u0113"+
		"\u0114\5\n\6\2\u0114\u0115\7\35\2\2\u0115\u0117\3\2\2\2\u0116\u0108\3"+
		"\2\2\2\u0116\u010f\3\2\2\2\u0117)\3\2\2\2\u0118\u0119\5&\24\2\u0119\u011c"+
		"\5\b\5\2\u011a\u011b\7\"\2\2\u011b\u011d\5(\25\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u011f\7\r\2\2\u011f\u0120\7 \2\2\u0120"+
		"\u0127\7\t\2\2\u0121\u0123\5*\26\2\u0122\u0124\7\t\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7!\2\2\u012c"+
		"\u012d\7\t\2\2\u012d-\3\2\2\2\u012e\u0130\7\t\2\2\u012f\u012e\3\2\2\2"+
		"\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\5,\27\2\u0135\u0134\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013c\5$\23\2\u0138\u0139\7\t"+
		"\2\2\u0139\u013b\5$\23\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0141\7\t\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7\2\2\3\u0146/\3\2\2\2\35?GXZ`kz\u0081\u0086\u008b\u008f"+
		"\u0098\u00a4\u00af\u00b5\u00bc\u00e6\u00ff\u0104\u0116\u011c\u0125\u0129"+
		"\u0131\u0135\u013c\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}