// $ANTLR 3.5.1 D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g 2025-01-29 21:15:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BOOLKEY=6;
	public static final int COMMENT=7;
	public static final int DIV=8;
	public static final int ELSE=9;
	public static final int ELSEIF=10;
	public static final int END_OF_LINE=11;
	public static final int EQUAL=12;
	public static final int ERROR_FLOAT=13;
	public static final int ERROR_ID=14;
	public static final int ERROR_INT=15;
	public static final int ERROR_OP=16;
	public static final int ESC_SEQ=17;
	public static final int EXPONENT=18;
	public static final int FALSE=19;
	public static final int FLOAT=20;
	public static final int FLOATKEY=21;
	public static final int FOR=22;
	public static final int FUN=23;
	public static final int GE=24;
	public static final int GREATER=25;
	public static final int HEX_DIGIT=26;
	public static final int ID=27;
	public static final int IF=28;
	public static final int IN=29;
	public static final int INT=30;
	public static final int INTKEY=31;
	public static final int LE=32;
	public static final int LOWER=33;
	public static final int LSB=34;
	public static final int MAIN=35;
	public static final int MUL=36;
	public static final int NOT=37;
	public static final int NOTEQUAL=38;
	public static final int OCTAL_ESC=39;
	public static final int ON=40;
	public static final int OR=41;
	public static final int OTHER_ERRORS=42;
	public static final int PCLOSE=43;
	public static final int POPEN=44;
	public static final int PRINT=45;
	public static final int REM=46;
	public static final int RETURN=47;
	public static final int RSB=48;
	public static final int SEMICOLON=49;
	public static final int STRING=50;
	public static final int SUB=51;
	public static final int SUM=52;
	public static final int TRUE=53;
	public static final int UNICODE_ESC=54;
	public static final int VOID=55;
	public static final int WHERE=56;
	public static final int WHILE=57;
	public static final int WS=58;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammerLexer() {} 
	public GrammerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g"; }

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:2:7: ( ',' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:2:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:3:7: ( ':' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:3:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:4:7: ( '{' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:4:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:5:7: ( '}' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:5:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "ERROR_INT"
	public final void mERROR_INT() throws RecognitionException {
		try {
			int _type = ERROR_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:152:2: ( ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+ | '0' ( '0' )+ ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+ )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			else if ( (LA4_0=='0') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:152:4: ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:152:103: ( '0' .. '9' )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:153:4: '0' ( '0' )+ ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+
					{
					match('0'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:153:8: ( '0' )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0=='0') ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:153:9: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:153:114: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_INT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:5: ( ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? | '0' | '0' ( '0' )+ ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= '1' && LA22_0 <= '9')) ) {
				alt22=1;
			}
			else if ( (LA22_0=='0') ) {
				int LA22_2 = input.LA(2);
				if ( (LA22_2=='0') ) {
					alt22=3;
				}

				else {
					alt22=2;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:8: ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )?
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:19: ( '0' .. '9' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:31: ( '0' .. '9' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:43: ( '0' .. '9' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:55: ( '0' .. '9' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:67: ( '0' .. '9' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:79: ( '0' .. '9' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:91: ( '0' .. '9' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:156:103: ( '0' .. '9' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:157:5: '0'
					{
					match('0'); 
					}
					break;
				case 3 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:4: '0' ( '0' )+ ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )?
					{
					match('0'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:8: ( '0' )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0=='0') ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:9: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:26: ( '0' .. '9' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:38: ( '0' .. '9' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:50: ( '0' .. '9' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:62: ( '0' .. '9' )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:74: ( '0' .. '9' )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:86: ( '0' .. '9' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:98: ( '0' .. '9' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:158:110: ( '0' .. '9' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "ERROR_FLOAT"
	public final void mERROR_FLOAT() throws RecognitionException {
		try {
			int _type = ERROR_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:162:2: ( ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( '0' )* | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )+ )
			int alt30=2;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:162:4: ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( '0' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:162:103: ( '0' .. '9' )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					match('.'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:162:119: ( '0' .. '9' )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:162:131: ( '0' )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0=='0') ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:162:132: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:163:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )+
					{
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:163:4: ( '0' .. '9' )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					match('.'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:163:20: ( '0' .. '9' )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop27;
						}
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:163:32: ( '.' ( '0' .. '9' )* )+
					int cnt29=0;
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0=='.') ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:163:33: '.' ( '0' .. '9' )*
							{
							match('.'); 
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:163:36: ( '0' .. '9' )*
							loop28:
							while (true) {
								int alt28=2;
								int LA28_0 = input.LA(1);
								if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
									alt28=1;
								}

								switch (alt28) {
								case 1 :
									// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop28;
								}
							}

							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_FLOAT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:5: ( ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? '.' ( '0' .. '9' )+ ( '0' )* | '0.' ( '0' .. '9' )+ ( '0' )* | '.' ( '0' .. '9' )+ ( '0' )* | '0' ( '0' )+ ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? '.' ( '0' .. '9' )+ ( '0' )* )
			int alt56=4;
			switch ( input.LA(1) ) {
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt56=1;
				}
				break;
			case '0':
				{
				int LA56_2 = input.LA(2);
				if ( (LA56_2=='.') ) {
					alt56=2;
				}
				else if ( (LA56_2=='0') ) {
					alt56=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '.':
				{
				alt56=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:10: ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? '.' ( '0' .. '9' )+ ( '0' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:21: ( '0' .. '9' )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:33: ( '0' .. '9' )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( ((LA32_0 >= '0' && LA32_0 <= '9')) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:45: ( '0' .. '9' )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( ((LA33_0 >= '0' && LA33_0 <= '9')) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:57: ( '0' .. '9' )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:69: ( '0' .. '9' )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:81: ( '0' .. '9' )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( ((LA36_0 >= '0' && LA36_0 <= '9')) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:93: ( '0' .. '9' )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( ((LA37_0 >= '0' && LA37_0 <= '9')) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:105: ( '0' .. '9' )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					match('.'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:121: ( '0' .. '9' )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( ((LA39_0 >= '0' && LA39_0 <= '9')) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:133: ( '0' )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0=='0') ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:167:134: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop40;
						}
					}

					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:168:9: '0.' ( '0' .. '9' )+ ( '0' )*
					{
					match("0."); 

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:168:14: ( '0' .. '9' )+
					int cnt41=0;
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( ((LA41_0 >= '0' && LA41_0 <= '9')) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt41 >= 1 ) break loop41;
							EarlyExitException eee = new EarlyExitException(41, input);
							throw eee;
						}
						cnt41++;
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:168:26: ( '0' )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0=='0') ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:168:27: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop42;
						}
					}

					}
					break;
				case 3 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:169:9: '.' ( '0' .. '9' )+ ( '0' )*
					{
					match('.'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:169:13: ( '0' .. '9' )+
					int cnt43=0;
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( ((LA43_0 >= '0' && LA43_0 <= '9')) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							EarlyExitException eee = new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:169:24: ( '0' )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0=='0') ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:169:25: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop44;
						}
					}

					}
					break;
				case 4 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:8: '0' ( '0' )+ ( '1' .. '9' ) ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? ( '0' .. '9' )? '.' ( '0' .. '9' )+ ( '0' )*
					{
					match('0'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:12: ( '0' )+
					int cnt45=0;
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0=='0') ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:13: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt45 >= 1 ) break loop45;
							EarlyExitException eee = new EarlyExitException(45, input);
							throw eee;
						}
						cnt45++;
					}

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:30: ( '0' .. '9' )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( ((LA46_0 >= '0' && LA46_0 <= '9')) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:42: ( '0' .. '9' )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( ((LA47_0 >= '0' && LA47_0 <= '9')) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:54: ( '0' .. '9' )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( ((LA48_0 >= '0' && LA48_0 <= '9')) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:66: ( '0' .. '9' )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( ((LA49_0 >= '0' && LA49_0 <= '9')) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:78: ( '0' .. '9' )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( ((LA50_0 >= '0' && LA50_0 <= '9')) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:90: ( '0' .. '9' )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( ((LA51_0 >= '0' && LA51_0 <= '9')) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:102: ( '0' .. '9' )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( ((LA52_0 >= '0' && LA52_0 <= '9')) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:114: ( '0' .. '9' )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( ((LA53_0 >= '0' && LA53_0 <= '9')) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					match('.'); 
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:130: ( '0' .. '9' )+
					int cnt54=0;
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( ((LA54_0 >= '0' && LA54_0 <= '9')) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt54 >= 1 ) break loop54;
							EarlyExitException eee = new EarlyExitException(54, input);
							throw eee;
						}
						cnt54++;
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:142: ( '0' )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0=='0') ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:170:143: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop55;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:173:6: ( 'void' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:173:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:176:6: ( 'main' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:176:8: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "INTKEY"
	public final void mINTKEY() throws RecognitionException {
		try {
			int _type = INTKEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:179:9: ( 'int' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:179:11: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTKEY"

	// $ANTLR start "FLOATKEY"
	public final void mFLOATKEY() throws RecognitionException {
		try {
			int _type = FLOATKEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:182:9: ( 'float' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:182:11: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATKEY"

	// $ANTLR start "BOOLKEY"
	public final void mBOOLKEY() throws RecognitionException {
		try {
			int _type = BOOLKEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:185:9: ( 'bool' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:185:11: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLKEY"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:188:6: ( 'fun' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:188:8: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:191:7: ( 'True' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:191:9: 'True'
			{
			match("True"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:194:8: ( 'False' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:194:10: 'False'
			{
			match("False"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:197:8: ( 'print' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:197:10: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:200:8: ( 'return' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:200:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:203:4: ( 'if' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:203:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:206:6: ( 'else' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:206:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ELSEIF"
	public final void mELSEIF() throws RecognitionException {
		try {
			int _type = ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:209:8: ( 'elseif' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:209:10: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:212:7: ( 'while' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:212:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:215:4: ( 'on' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:215:6: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:218:7: ( 'where' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:218:9: 'where'
			{
			match("where"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:221:5: ( 'for' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:221:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:224:5: ( 'and' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:224:7: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:227:4: ( 'or' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:227:6: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:230:5: ( 'not' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:230:7: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:233:4: ( 'in' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:233:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "ERROR_OP"
	public final void mERROR_OP() throws RecognitionException {
		try {
			int _type = ERROR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:236:9: ( ( '+' | '-' | '*' | '/' | '%' ) ( '+' | '-' | '*' | '/' | '%' )+ )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:236:11: ( '+' | '-' | '*' | '/' | '%' ) ( '+' | '-' | '*' | '/' | '%' )+
			{
			if ( input.LA(1)=='%'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:236:33: ( '+' | '-' | '*' | '/' | '%' )+
			int cnt57=0;
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0=='%'||(LA57_0 >= '*' && LA57_0 <= '+')||LA57_0=='-'||LA57_0=='/') ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
					{
					if ( input.LA(1)=='%'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					EarlyExitException eee = new EarlyExitException(57, input);
					throw eee;
				}
				cnt57++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_OP"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:239:5: ( '+' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:239:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:242:5: ( '-' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:242:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:245:5: ( '*' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:245:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:248:5: ( '/' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:248:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "REM"
	public final void mREM() throws RecognitionException {
		try {
			int _type = REM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:251:5: ( '%' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:251:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REM"

	// $ANTLR start "POPEN"
	public final void mPOPEN() throws RecognitionException {
		try {
			int _type = POPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:254:8: ( '(' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:254:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POPEN"

	// $ANTLR start "PCLOSE"
	public final void mPCLOSE() throws RecognitionException {
		try {
			int _type = PCLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:257:9: ( ')' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:257:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PCLOSE"

	// $ANTLR start "LSB"
	public final void mLSB() throws RecognitionException {
		try {
			int _type = LSB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:260:5: ( '[' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:260:7: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSB"

	// $ANTLR start "RSB"
	public final void mRSB() throws RecognitionException {
		try {
			int _type = RSB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:263:5: ( ']' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:263:7: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSB"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:266:8: ( '=' ( ' ' )* '=' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:266:10: '=' ( ' ' )* '='
			{
			match('='); 
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:266:14: ( ' ' )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==' ') ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:266:15: ' '
					{
					match(' '); 
					}
					break;

				default :
					break loop58;
				}
			}

			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:269:9: ( '!=' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:269:11: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:272:4: ( '<=' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:272:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:275:4: ( '>=' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:275:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			int _type = LOWER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:278:7: ( '<' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:278:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:281:9: ( '>' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:281:11: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:285:2: ( ';' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:285:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "ERROR_ID"
	public final void mERROR_ID() throws RecognitionException {
		try {
			int _type = ERROR_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:288:9: ( ( 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:288:11: ( 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:288:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= '0' && LA59_0 <= '9')||(LA59_0 >= 'A' && LA59_0 <= 'Z')||LA59_0=='_'||(LA59_0 >= 'a' && LA59_0 <= 'z')) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop59;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_ID"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:291:5: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:291:7: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:291:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( ((LA60_0 >= '0' && LA60_0 <= '9')||(LA60_0 >= 'A' && LA60_0 <= 'Z')||LA60_0=='_'||(LA60_0 >= 'a' && LA60_0 <= 'z')) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop60;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:294:5: ( ( ' ' | '\\t' | '\\r' ) )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:294:9: ( ' ' | '\\t' | '\\r' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "END_OF_LINE"
	public final void mEND_OF_LINE() throws RecognitionException {
		try {
			int _type = END_OF_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:301:2: ( '\\n' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:301:4: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_OF_LINE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:305:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0=='/') ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1=='/') ) {
					alt64=1;
				}
				else if ( (LA64_1=='*') ) {
					alt64=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:305:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:305:14: (~ ( '\\n' | '\\r' ) )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( ((LA61_0 >= '\u0000' && LA61_0 <= '\t')||(LA61_0 >= '\u000B' && LA61_0 <= '\f')||(LA61_0 >= '\u000E' && LA61_0 <= '\uFFFF')) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop61;
						}
					}

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:305:28: ( '\\r' )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0=='\r') ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:305:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:306:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:306:14: ( options {greedy=false; } : . )*
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0=='*') ) {
							int LA63_1 = input.LA(2);
							if ( (LA63_1=='/') ) {
								alt63=2;
							}
							else if ( ((LA63_1 >= '\u0000' && LA63_1 <= '.')||(LA63_1 >= '0' && LA63_1 <= '\uFFFF')) ) {
								alt63=1;
							}

						}
						else if ( ((LA63_0 >= '\u0000' && LA63_0 <= ')')||(LA63_0 >= '+' && LA63_0 <= '\uFFFF')) ) {
							alt63=1;
						}

						switch (alt63) {
						case 1 :
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:306:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop63;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:310:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:310:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:310:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop65:
			while (true) {
				int alt65=3;
				int LA65_0 = input.LA(1);
				if ( (LA65_0=='\\') ) {
					alt65=1;
				}
				else if ( ((LA65_0 >= '\u0000' && LA65_0 <= '!')||(LA65_0 >= '#' && LA65_0 <= '[')||(LA65_0 >= ']' && LA65_0 <= '\uFFFF')) ) {
					alt65=2;
				}

				switch (alt65) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:310:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:310:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop65;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:315:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:315:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:315:22: ( '+' | '-' )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0=='+'||LA66_0=='-') ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:315:33: ( '0' .. '9' )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= '0' && LA67_0 <= '9')) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt67 >= 1 ) break loop67;
					EarlyExitException eee = new EarlyExitException(67, input);
					throw eee;
				}
				cnt67++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:318:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:322:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt68=3;
			int LA68_0 = input.LA(1);
			if ( (LA68_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt68=1;
					}
					break;
				case 'u':
					{
					alt68=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt68=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:322:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:323:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:324:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:329:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt69=3;
			int LA69_0 = input.LA(1);
			if ( (LA69_0=='\\') ) {
				int LA69_1 = input.LA(2);
				if ( ((LA69_1 >= '0' && LA69_1 <= '3')) ) {
					int LA69_2 = input.LA(3);
					if ( ((LA69_2 >= '0' && LA69_2 <= '7')) ) {
						int LA69_4 = input.LA(4);
						if ( ((LA69_4 >= '0' && LA69_4 <= '7')) ) {
							alt69=1;
						}

						else {
							alt69=2;
						}

					}

					else {
						alt69=3;
					}

				}
				else if ( ((LA69_1 >= '4' && LA69_1 <= '7')) ) {
					int LA69_3 = input.LA(3);
					if ( ((LA69_3 >= '0' && LA69_3 <= '7')) ) {
						alt69=2;
					}

					else {
						alt69=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:329:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:330:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:331:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:336:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:336:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:338:8: ( '=' ( ' ' )* )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:338:10: '=' ( ' ' )*
			{
			match('='); 
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:338:13: ( ' ' )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==' ') ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:338:14: ' '
					{
					match(' '); 
					}
					break;

				default :
					break loop70;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "OTHER_ERRORS"
	public final void mOTHER_ERRORS() throws RecognitionException {
		try {
			int _type = OTHER_ERRORS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:341:15: ( . )
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:341:17: .
			{
			matchAny(); 
			 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER_ERRORS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:8: ( T__59 | T__60 | T__61 | T__62 | ERROR_INT | INT | ERROR_FLOAT | FLOAT | VOID | MAIN | INTKEY | FLOATKEY | BOOLKEY | FUN | TRUE | FALSE | PRINT | RETURN | IF | ELSE | ELSEIF | WHILE | ON | WHERE | FOR | AND | OR | NOT | IN | ERROR_OP | SUM | SUB | MUL | DIV | REM | POPEN | PCLOSE | LSB | RSB | EQUAL | NOTEQUAL | LE | GE | LOWER | GREATER | SEMICOLON | ERROR_ID | ID | WS | END_OF_LINE | COMMENT | STRING | ASSIGN | OTHER_ERRORS )
		int alt71=54;
		alt71 = dfa71.predict(input);
		switch (alt71) {
			case 1 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:10: T__59
				{
				mT__59(); 

				}
				break;
			case 2 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:16: T__60
				{
				mT__60(); 

				}
				break;
			case 3 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:22: T__61
				{
				mT__61(); 

				}
				break;
			case 4 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:28: T__62
				{
				mT__62(); 

				}
				break;
			case 5 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:34: ERROR_INT
				{
				mERROR_INT(); 

				}
				break;
			case 6 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:44: INT
				{
				mINT(); 

				}
				break;
			case 7 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:48: ERROR_FLOAT
				{
				mERROR_FLOAT(); 

				}
				break;
			case 8 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:60: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:66: VOID
				{
				mVOID(); 

				}
				break;
			case 10 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:71: MAIN
				{
				mMAIN(); 

				}
				break;
			case 11 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:76: INTKEY
				{
				mINTKEY(); 

				}
				break;
			case 12 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:83: FLOATKEY
				{
				mFLOATKEY(); 

				}
				break;
			case 13 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:92: BOOLKEY
				{
				mBOOLKEY(); 

				}
				break;
			case 14 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:100: FUN
				{
				mFUN(); 

				}
				break;
			case 15 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:104: TRUE
				{
				mTRUE(); 

				}
				break;
			case 16 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:109: FALSE
				{
				mFALSE(); 

				}
				break;
			case 17 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:115: PRINT
				{
				mPRINT(); 

				}
				break;
			case 18 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:121: RETURN
				{
				mRETURN(); 

				}
				break;
			case 19 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:128: IF
				{
				mIF(); 

				}
				break;
			case 20 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:131: ELSE
				{
				mELSE(); 

				}
				break;
			case 21 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:136: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 22 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:143: WHILE
				{
				mWHILE(); 

				}
				break;
			case 23 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:149: ON
				{
				mON(); 

				}
				break;
			case 24 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:152: WHERE
				{
				mWHERE(); 

				}
				break;
			case 25 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:158: FOR
				{
				mFOR(); 

				}
				break;
			case 26 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:162: AND
				{
				mAND(); 

				}
				break;
			case 27 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:166: OR
				{
				mOR(); 

				}
				break;
			case 28 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:169: NOT
				{
				mNOT(); 

				}
				break;
			case 29 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:173: IN
				{
				mIN(); 

				}
				break;
			case 30 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:176: ERROR_OP
				{
				mERROR_OP(); 

				}
				break;
			case 31 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:185: SUM
				{
				mSUM(); 

				}
				break;
			case 32 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:189: SUB
				{
				mSUB(); 

				}
				break;
			case 33 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:193: MUL
				{
				mMUL(); 

				}
				break;
			case 34 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:197: DIV
				{
				mDIV(); 

				}
				break;
			case 35 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:201: REM
				{
				mREM(); 

				}
				break;
			case 36 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:205: POPEN
				{
				mPOPEN(); 

				}
				break;
			case 37 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:211: PCLOSE
				{
				mPCLOSE(); 

				}
				break;
			case 38 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:218: LSB
				{
				mLSB(); 

				}
				break;
			case 39 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:222: RSB
				{
				mRSB(); 

				}
				break;
			case 40 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:226: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 41 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:232: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 42 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:241: LE
				{
				mLE(); 

				}
				break;
			case 43 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:244: GE
				{
				mGE(); 

				}
				break;
			case 44 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:247: LOWER
				{
				mLOWER(); 

				}
				break;
			case 45 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:253: GREATER
				{
				mGREATER(); 

				}
				break;
			case 46 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:261: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 47 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:271: ERROR_ID
				{
				mERROR_ID(); 

				}
				break;
			case 48 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:280: ID
				{
				mID(); 

				}
				break;
			case 49 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:283: WS
				{
				mWS(); 

				}
				break;
			case 50 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:286: END_OF_LINE
				{
				mEND_OF_LINE(); 

				}
				break;
			case 51 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:298: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 52 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:306: STRING
				{
				mSTRING(); 

				}
				break;
			case 53 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:313: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 54 :
				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:1:320: OTHER_ERRORS
				{
				mOTHER_ERRORS(); 

				}
				break;

		}
	}


	protected DFA30 dfa30 = new DFA30(this);
	protected DFA71 dfa71 = new DFA71(this);
	static final String DFA30_eotS =
		"\15\uffff\2\17\1\uffff";
	static final String DFA30_eofS =
		"\20\uffff";
	static final String DFA30_minS =
		"\1\60\1\56\1\uffff\14\56\1\uffff";
	static final String DFA30_maxS =
		"\2\71\1\uffff\14\71\1\uffff";
	static final String DFA30_acceptS =
		"\2\uffff\1\2\14\uffff\1\1";
	static final String DFA30_specialS =
		"\20\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\2\11\1",
			"\1\2\1\uffff\12\3",
			"",
			"\1\2\1\uffff\12\4",
			"\1\2\1\uffff\12\5",
			"\1\2\1\uffff\12\6",
			"\1\2\1\uffff\12\7",
			"\1\2\1\uffff\12\10",
			"\1\2\1\uffff\12\11",
			"\1\2\1\uffff\12\12",
			"\1\2\1\uffff\12\13",
			"\1\14\1\uffff\12\13",
			"\1\2\1\uffff\12\15",
			"\1\2\1\uffff\1\16\11\15",
			"\1\2\1\uffff\1\16\11\15",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "161:1: ERROR_FLOAT : ( ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( '0' )* | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )+ );";
		}
	}

	static final String DFA71_eotS =
		"\5\uffff\2\57\1\51\5\67\2\61\7\67\1\112\1\113\1\114\1\117\1\120\4\uffff"+
		"\1\127\1\51\1\132\1\134\5\uffff\1\51\5\uffff\1\57\4\uffff\2\61\1\uffff"+
		"\1\67\1\uffff\1\67\1\151\1\152\4\67\2\61\4\67\1\166\1\167\2\67\4\uffff"+
		"\2\111\6\uffff\1\127\13\uffff\1\57\1\65\1\uffff\1\65\1\57\2\67\1\u0085"+
		"\2\uffff\1\67\1\u0087\1\u0088\1\67\2\61\5\67\2\uffff\1\u0091\1\u0092\1"+
		"\111\1\uffff\2\111\1\57\2\65\1\57\1\uffff\1\u0097\1\u0098\1\uffff\1\67"+
		"\2\uffff\1\u009a\1\u009b\1\61\2\67\1\u00a0\2\67\2\uffff\1\111\2\57\1\65"+
		"\2\uffff\1\u00a6\2\uffff\1\u00a7\1\u00a8\2\67\1\uffff\1\u00ab\1\u00ac"+
		"\2\57\1\65\3\uffff\1\u00af\1\u00b0\2\uffff\2\57\2\uffff\4\57\1\u00b7\1"+
		"\57\1\uffff\1\57\1\u00b7";
	static final String DFA71_eofS =
		"\u00ba\uffff";
	static final String DFA71_minS =
		"\1\0\4\uffff\2\56\1\60\1\157\1\141\1\146\1\154\1\157\1\162\1\141\1\162"+
		"\1\145\1\154\1\150\2\156\1\157\5\45\4\uffff\1\40\3\75\5\uffff\1\0\5\uffff"+
		"\1\56\1\uffff\1\56\1\uffff\3\56\1\uffff\1\151\1\uffff\1\151\2\60\1\157"+
		"\1\156\1\162\1\157\1\165\1\154\1\151\1\164\1\163\1\145\2\60\1\144\1\164"+
		"\4\uffff\2\0\6\uffff\1\40\13\uffff\2\56\1\uffff\2\56\1\144\1\156\1\60"+
		"\2\uffff\1\141\2\60\1\154\1\145\1\163\1\156\1\165\1\145\1\154\1\162\2"+
		"\uffff\2\60\1\0\1\uffff\2\0\5\56\2\60\1\uffff\1\164\2\uffff\2\60\1\145"+
		"\1\164\1\162\1\60\2\145\2\uffff\1\0\3\56\2\uffff\1\60\2\uffff\2\60\1\156"+
		"\1\146\1\uffff\2\60\3\56\3\uffff\2\60\2\uffff\2\56\2\uffff\6\56\1\uffff"+
		"\2\56";
	static final String DFA71_maxS =
		"\1\uffff\4\uffff\2\172\1\71\1\157\1\141\1\156\1\165\1\157\1\162\1\141"+
		"\1\162\1\145\1\154\1\150\1\162\1\156\1\157\5\57\4\uffff\4\75\5\uffff\1"+
		"\uffff\5\uffff\1\172\1\uffff\1\71\1\uffff\3\71\1\uffff\1\151\1\uffff\1"+
		"\151\2\172\1\157\1\156\1\162\1\157\1\165\1\154\1\151\1\164\1\163\1\151"+
		"\2\172\1\144\1\164\4\uffff\2\uffff\6\uffff\1\75\13\uffff\1\172\1\71\1"+
		"\uffff\1\71\1\172\1\144\1\156\1\172\2\uffff\1\141\2\172\1\154\1\145\1"+
		"\163\1\156\1\165\1\145\1\154\1\162\2\uffff\2\172\1\uffff\1\uffff\2\uffff"+
		"\1\172\2\71\1\172\1\71\2\172\1\uffff\1\164\2\uffff\2\172\1\145\1\164\1"+
		"\162\1\172\2\145\2\uffff\1\uffff\2\172\1\71\2\uffff\1\172\2\uffff\2\172"+
		"\1\156\1\146\1\uffff\4\172\1\71\3\uffff\2\172\2\uffff\2\172\2\uffff\6"+
		"\172\1\uffff\2\172";
	static final String DFA71_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\26\uffff\1\44\1\45\1\46\1\47\4\uffff\1\56\1\57"+
		"\1\60\1\61\1\62\1\uffff\1\66\1\1\1\2\1\3\1\4\1\uffff\1\6\1\uffff\1\57"+
		"\3\uffff\1\10\1\uffff\1\60\21\uffff\1\36\1\37\1\40\1\41\2\uffff\1\42\1"+
		"\43\1\44\1\45\1\46\1\47\1\uffff\1\50\1\65\1\51\1\52\1\54\1\53\1\55\1\56"+
		"\1\61\1\62\1\64\2\uffff\1\7\5\uffff\1\35\1\23\13\uffff\1\27\1\33\3\uffff"+
		"\1\63\11\uffff\1\13\1\uffff\1\16\1\31\10\uffff\1\32\1\34\4\uffff\1\11"+
		"\1\12\1\uffff\1\15\1\17\4\uffff\1\24\5\uffff\1\14\1\20\1\21\2\uffff\1"+
		"\26\1\30\2\uffff\1\22\1\25\6\uffff\1\5\2\uffff";
	static final String DFA71_specialS =
		"\1\2\47\uffff\1\3\44\uffff\1\6\1\1\53\uffff\1\5\1\uffff\1\0\1\7\25\uffff"+
		"\1\4\46\uffff}>";
	static final String[] DFA71_transitionS = {
			"\11\51\1\46\1\47\2\51\1\46\22\51\1\46\1\40\1\50\2\51\1\32\2\51\1\33\1"+
			"\34\1\30\1\26\1\1\1\27\1\7\1\31\1\6\11\5\1\2\1\43\1\41\1\37\1\42\2\51"+
			"\5\44\1\16\15\44\1\15\6\44\1\35\1\51\1\36\1\51\1\45\1\51\1\24\1\14\2"+
			"\45\1\21\1\13\2\45\1\12\3\45\1\11\1\25\1\23\1\17\1\45\1\20\3\45\1\10"+
			"\1\22\3\45\1\3\1\51\1\4\uff82\51",
			"",
			"",
			"",
			"",
			"\1\60\1\uffff\12\56\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\62\1\uffff\1\63\11\64\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\65",
			"\1\66",
			"\1\70",
			"\1\72\7\uffff\1\71",
			"\1\73\2\uffff\1\75\5\uffff\1\74",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105\3\uffff\1\106",
			"\1\107",
			"\1\110",
			"\1\111\4\uffff\2\111\1\uffff\1\111\1\uffff\1\111",
			"\1\111\4\uffff\2\111\1\uffff\1\111\1\uffff\1\111",
			"\1\111\4\uffff\2\111\1\uffff\1\111\1\uffff\1\111",
			"\1\111\4\uffff\1\116\1\111\1\uffff\1\111\1\uffff\1\115",
			"\1\111\4\uffff\2\111\1\uffff\1\111\1\uffff\1\111",
			"",
			"",
			"",
			"",
			"\1\125\34\uffff\1\126",
			"\1\130",
			"\1\131",
			"\1\133",
			"",
			"",
			"",
			"",
			"",
			"\0\140",
			"",
			"",
			"",
			"",
			"",
			"\1\60\1\uffff\12\141\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\143\1\uffff\12\142",
			"",
			"\1\143\1\uffff\12\144",
			"\1\143\1\uffff\1\63\11\145",
			"\1\143\1\uffff\12\64",
			"",
			"\1\146",
			"",
			"\1\147",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\150\6\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\165\3\uffff\1\164",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\170",
			"\1\171",
			"",
			"",
			"",
			"",
			"\45\173\1\172\4\173\2\172\1\173\1\172\1\173\1\172\uffd0\173",
			"\45\173\1\175\4\173\1\174\1\175\1\173\1\175\1\173\1\175\uffd0\173",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\125\34\uffff\1\126",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\60\1\uffff\12\176\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\1\177\11\142",
			"",
			"\1\143\1\uffff\1\u0080\11\144",
			"\1\u0082\1\uffff\12\u0081\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0083",
			"\1\u0084",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0086",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\45\173\1\172\4\173\2\172\1\173\1\172\1\173\1\172\uffd0\173",
			"",
			"\45\173\1\175\4\173\1\174\1\175\1\173\1\175\1\173\1\u0093\uffd0\173",
			"\45\173\1\175\4\173\1\174\1\175\1\173\1\175\1\173\1\175\uffd0\173",
			"\1\60\1\uffff\12\u0094\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\1\177\11\142",
			"\1\143\1\uffff\1\u0080\11\144",
			"\1\u0082\1\uffff\12\u0095\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\12\u0096",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0099",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\10\67\1\u009f\21\67",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"",
			"\45\173\1\175\4\173\1\174\1\175\1\173\1\175\1\173\1\175\uffd0\173",
			"\1\60\1\uffff\12\u00a3\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0082\1\uffff\12\u00a4\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\1\u00a5\11\u0096",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00a9",
			"\1\u00aa",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\60\1\uffff\12\u00ad\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0082\1\uffff\12\u00ae\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\1\u00a5\11\u0096",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\60\1\uffff\12\u00b1\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0082\1\uffff\12\u00b2\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"\1\60\1\uffff\12\u00b3\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0082\1\uffff\12\u00b4\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\60\1\uffff\12\u00b5\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0082\1\uffff\12\u00b6\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\12\u00b5\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0082\1\uffff\12\u00b8\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u0082\1\uffff\12\u00b9\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143\1\uffff\12\u00b9\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61"
	};

	static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
	static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
	static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
	static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
	static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
	static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
	static final short[][] DFA71_transition;

	static {
		int numStates = DFA71_transitionS.length;
		DFA71_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
		}
	}

	protected class DFA71 extends DFA {

		public DFA71(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 71;
			this.eot = DFA71_eot;
			this.eof = DFA71_eof;
			this.min = DFA71_min;
			this.max = DFA71_max;
			this.accept = DFA71_accept;
			this.special = DFA71_special;
			this.transition = DFA71_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__59 | T__60 | T__61 | T__62 | ERROR_INT | INT | ERROR_FLOAT | FLOAT | VOID | MAIN | INTKEY | FLOATKEY | BOOLKEY | FUN | TRUE | FALSE | PRINT | RETURN | IF | ELSE | ELSEIF | WHILE | ON | WHERE | FOR | AND | OR | NOT | IN | ERROR_OP | SUM | SUB | MUL | DIV | REM | POPEN | PCLOSE | LSB | RSB | EQUAL | NOTEQUAL | LE | GE | LOWER | GREATER | SEMICOLON | ERROR_ID | ID | WS | END_OF_LINE | COMMENT | STRING | ASSIGN | OTHER_ERRORS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA71_124 = input.LA(1);
						s = -1;
						if ( (LA71_124=='/') ) {s = 147;}
						else if ( (LA71_124=='*') ) {s = 124;}
						else if ( (LA71_124=='%'||LA71_124=='+'||LA71_124=='-') ) {s = 125;}
						else if ( ((LA71_124 >= '\u0000' && LA71_124 <= '$')||(LA71_124 >= '&' && LA71_124 <= ')')||LA71_124==','||LA71_124=='.'||(LA71_124 >= '0' && LA71_124 <= '\uFFFF')) ) {s = 123;}
						else s = 73;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA71_78 = input.LA(1);
						s = -1;
						if ( (LA71_78=='*') ) {s = 124;}
						else if ( (LA71_78=='%'||LA71_78=='+'||LA71_78=='-'||LA71_78=='/') ) {s = 125;}
						else if ( ((LA71_78 >= '\u0000' && LA71_78 <= '$')||(LA71_78 >= '&' && LA71_78 <= ')')||LA71_78==','||LA71_78=='.'||(LA71_78 >= '0' && LA71_78 <= '\uFFFF')) ) {s = 123;}
						else s = 73;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA71_0 = input.LA(1);
						s = -1;
						if ( (LA71_0==',') ) {s = 1;}
						else if ( (LA71_0==':') ) {s = 2;}
						else if ( (LA71_0=='{') ) {s = 3;}
						else if ( (LA71_0=='}') ) {s = 4;}
						else if ( ((LA71_0 >= '1' && LA71_0 <= '9')) ) {s = 5;}
						else if ( (LA71_0=='0') ) {s = 6;}
						else if ( (LA71_0=='.') ) {s = 7;}
						else if ( (LA71_0=='v') ) {s = 8;}
						else if ( (LA71_0=='m') ) {s = 9;}
						else if ( (LA71_0=='i') ) {s = 10;}
						else if ( (LA71_0=='f') ) {s = 11;}
						else if ( (LA71_0=='b') ) {s = 12;}
						else if ( (LA71_0=='T') ) {s = 13;}
						else if ( (LA71_0=='F') ) {s = 14;}
						else if ( (LA71_0=='p') ) {s = 15;}
						else if ( (LA71_0=='r') ) {s = 16;}
						else if ( (LA71_0=='e') ) {s = 17;}
						else if ( (LA71_0=='w') ) {s = 18;}
						else if ( (LA71_0=='o') ) {s = 19;}
						else if ( (LA71_0=='a') ) {s = 20;}
						else if ( (LA71_0=='n') ) {s = 21;}
						else if ( (LA71_0=='+') ) {s = 22;}
						else if ( (LA71_0=='-') ) {s = 23;}
						else if ( (LA71_0=='*') ) {s = 24;}
						else if ( (LA71_0=='/') ) {s = 25;}
						else if ( (LA71_0=='%') ) {s = 26;}
						else if ( (LA71_0=='(') ) {s = 27;}
						else if ( (LA71_0==')') ) {s = 28;}
						else if ( (LA71_0=='[') ) {s = 29;}
						else if ( (LA71_0==']') ) {s = 30;}
						else if ( (LA71_0=='=') ) {s = 31;}
						else if ( (LA71_0=='!') ) {s = 32;}
						else if ( (LA71_0=='<') ) {s = 33;}
						else if ( (LA71_0=='>') ) {s = 34;}
						else if ( (LA71_0==';') ) {s = 35;}
						else if ( ((LA71_0 >= 'A' && LA71_0 <= 'E')||(LA71_0 >= 'G' && LA71_0 <= 'S')||(LA71_0 >= 'U' && LA71_0 <= 'Z')) ) {s = 36;}
						else if ( (LA71_0=='_'||(LA71_0 >= 'c' && LA71_0 <= 'd')||(LA71_0 >= 'g' && LA71_0 <= 'h')||(LA71_0 >= 'j' && LA71_0 <= 'l')||LA71_0=='q'||(LA71_0 >= 's' && LA71_0 <= 'u')||(LA71_0 >= 'x' && LA71_0 <= 'z')) ) {s = 37;}
						else if ( (LA71_0=='\t'||LA71_0=='\r'||LA71_0==' ') ) {s = 38;}
						else if ( (LA71_0=='\n') ) {s = 39;}
						else if ( (LA71_0=='\"') ) {s = 40;}
						else if ( ((LA71_0 >= '\u0000' && LA71_0 <= '\b')||(LA71_0 >= '\u000B' && LA71_0 <= '\f')||(LA71_0 >= '\u000E' && LA71_0 <= '\u001F')||(LA71_0 >= '#' && LA71_0 <= '$')||(LA71_0 >= '&' && LA71_0 <= '\'')||(LA71_0 >= '?' && LA71_0 <= '@')||LA71_0=='\\'||LA71_0=='^'||LA71_0=='`'||LA71_0=='|'||(LA71_0 >= '~' && LA71_0 <= '\uFFFF')) ) {s = 41;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA71_40 = input.LA(1);
						s = -1;
						if ( ((LA71_40 >= '\u0000' && LA71_40 <= '\uFFFF')) ) {s = 96;}
						else s = 41;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA71_147 = input.LA(1);
						s = -1;
						if ( (LA71_147=='*') ) {s = 124;}
						else if ( (LA71_147=='%'||LA71_147=='+'||LA71_147=='-'||LA71_147=='/') ) {s = 125;}
						else if ( ((LA71_147 >= '\u0000' && LA71_147 <= '$')||(LA71_147 >= '&' && LA71_147 <= ')')||LA71_147==','||LA71_147=='.'||(LA71_147 >= '0' && LA71_147 <= '\uFFFF')) ) {s = 123;}
						else s = 73;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA71_122 = input.LA(1);
						s = -1;
						if ( ((LA71_122 >= '\u0000' && LA71_122 <= '$')||(LA71_122 >= '&' && LA71_122 <= ')')||LA71_122==','||LA71_122=='.'||(LA71_122 >= '0' && LA71_122 <= '\uFFFF')) ) {s = 123;}
						else if ( (LA71_122=='%'||(LA71_122 >= '*' && LA71_122 <= '+')||LA71_122=='-'||LA71_122=='/') ) {s = 122;}
						else s = 73;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA71_77 = input.LA(1);
						s = -1;
						if ( (LA71_77=='%'||(LA71_77 >= '*' && LA71_77 <= '+')||LA71_77=='-'||LA71_77=='/') ) {s = 122;}
						else if ( ((LA71_77 >= '\u0000' && LA71_77 <= '$')||(LA71_77 >= '&' && LA71_77 <= ')')||LA71_77==','||LA71_77=='.'||(LA71_77 >= '0' && LA71_77 <= '\uFFFF')) ) {s = 123;}
						else s = 73;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA71_125 = input.LA(1);
						s = -1;
						if ( (LA71_125=='*') ) {s = 124;}
						else if ( (LA71_125=='%'||LA71_125=='+'||LA71_125=='-'||LA71_125=='/') ) {s = 125;}
						else if ( ((LA71_125 >= '\u0000' && LA71_125 <= '$')||(LA71_125 >= '&' && LA71_125 <= ')')||LA71_125==','||LA71_125=='.'||(LA71_125 >= '0' && LA71_125 <= '\uFFFF')) ) {s = 123;}
						else s = 73;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 71, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
