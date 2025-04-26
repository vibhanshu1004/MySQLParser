// Generated from com/example/java/parser/MyDB.g4 by ANTLR 4.13.1
package com.example.java.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyDBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IDENTIFIER=12, STRING=13, INT_TYPE=14, VARCHAR_TYPE=15, 
		BOOLEAN_TYPE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "IDENTIFIER", "STRING", "INT_TYPE", "VARCHAR_TYPE", 
			"BOOLEAN_TYPE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'TABLE'", "'('", "','", "')'", "';'", "'INSERT'", 
			"'INTO'", "'VALUES'", "'SELECT'", "'FROM'", null, null, "'INT'", "'VARCHAR'", 
			"'BOOLEAN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "STRING", "INT_TYPE", "VARCHAR_TYPE", "BOOLEAN_TYPE", "WS"
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


	public MyDBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyDB.g4"; }

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
		"\u0004\u0000\u0011\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bZ\b\u000b\n\u000b"+
		"\f\u000b]\t\u000b\u0001\f\u0001\f\u0005\fa\b\f\n\f\f\fd\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010}\b\u0010\u000b\u0010\f\u0010~\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001"+
		"\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\n\n\r\r"+
		"\'\'\u0003\u0000\t\n\r\r  \u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000"+
		"\u0000\u0003*\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u0007"+
		"2\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000b6\u0001\u0000"+
		"\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000"+
		"\u0011D\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000\u0015R"+
		"\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019^\u0001\u0000"+
		"\u0000\u0000\u001bg\u0001\u0000\u0000\u0000\u001dk\u0001\u0000\u0000\u0000"+
		"\u001fs\u0001\u0000\u0000\u0000!|\u0001\u0000\u0000\u0000#$\u0005C\u0000"+
		"\u0000$%\u0005R\u0000\u0000%&\u0005E\u0000\u0000&\'\u0005A\u0000\u0000"+
		"\'(\u0005T\u0000\u0000()\u0005E\u0000\u0000)\u0002\u0001\u0000\u0000\u0000"+
		"*+\u0005T\u0000\u0000+,\u0005A\u0000\u0000,-\u0005B\u0000\u0000-.\u0005"+
		"L\u0000\u0000./\u0005E\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005"+
		"(\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005,\u0000\u00003\b\u0001"+
		"\u0000\u0000\u000045\u0005)\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005"+
		";\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005I\u0000\u00009:\u0005"+
		"N\u0000\u0000:;\u0005S\u0000\u0000;<\u0005E\u0000\u0000<=\u0005R\u0000"+
		"\u0000=>\u0005T\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005I\u0000"+
		"\u0000@A\u0005N\u0000\u0000AB\u0005T\u0000\u0000BC\u0005O\u0000\u0000"+
		"C\u0010\u0001\u0000\u0000\u0000DE\u0005V\u0000\u0000EF\u0005A\u0000\u0000"+
		"FG\u0005L\u0000\u0000GH\u0005U\u0000\u0000HI\u0005E\u0000\u0000IJ\u0005"+
		"S\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KL\u0005S\u0000\u0000LM\u0005"+
		"E\u0000\u0000MN\u0005L\u0000\u0000NO\u0005E\u0000\u0000OP\u0005C\u0000"+
		"\u0000PQ\u0005T\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005F\u0000"+
		"\u0000ST\u0005R\u0000\u0000TU\u0005O\u0000\u0000UV\u0005M\u0000\u0000"+
		"V\u0016\u0001\u0000\u0000\u0000W[\u0007\u0000\u0000\u0000XZ\u0007\u0001"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0018\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^b\u0005\'\u0000\u0000_a\b\u0002\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005\'\u0000\u0000f\u001a\u0001\u0000\u0000\u0000"+
		"gh\u0005I\u0000\u0000hi\u0005N\u0000\u0000ij\u0005T\u0000\u0000j\u001c"+
		"\u0001\u0000\u0000\u0000kl\u0005V\u0000\u0000lm\u0005A\u0000\u0000mn\u0005"+
		"R\u0000\u0000no\u0005C\u0000\u0000op\u0005H\u0000\u0000pq\u0005A\u0000"+
		"\u0000qr\u0005R\u0000\u0000r\u001e\u0001\u0000\u0000\u0000st\u0005B\u0000"+
		"\u0000tu\u0005O\u0000\u0000uv\u0005O\u0000\u0000vw\u0005L\u0000\u0000"+
		"wx\u0005E\u0000\u0000xy\u0005A\u0000\u0000yz\u0005N\u0000\u0000z \u0001"+
		"\u0000\u0000\u0000{}\u0007\u0003\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0010"+
		"\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0004\u0000[b~\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}