// $ANTLR 3.5.1 D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g 2025-01-29 21:15:00

import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GrammerParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOLKEY", "COMMENT", 
		"DIV", "ELSE", "ELSEIF", "END_OF_LINE", "EQUAL", "ERROR_FLOAT", "ERROR_ID", 
		"ERROR_INT", "ERROR_OP", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", "FLOATKEY", 
		"FOR", "FUN", "GE", "GREATER", "HEX_DIGIT", "ID", "IF", "IN", "INT", "INTKEY", 
		"LE", "LOWER", "LSB", "MAIN", "MUL", "NOT", "NOTEQUAL", "OCTAL_ESC", "ON", 
		"OR", "OTHER_ERRORS", "PCLOSE", "POPEN", "PRINT", "REM", "RETURN", "RSB", 
		"SEMICOLON", "STRING", "SUB", "SUM", "TRUE", "UNICODE_ESC", "VOID", "WHERE", 
		"WHILE", "WS", "','", "':'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred19_Grammer", "synpred7_Grammer", "synpred60_Grammer", 
		"exp", "program", "synpred24_Grammer", "synpred14_Grammer", "synpred45_Grammer", 
		"synpred67_Grammer", "synpred50_Grammer", "synpred38_Grammer", "synpred4_Grammer", 
		"synpred41_Grammer", "synpred13_Grammer", "synpred51_Grammer", "funcdec", 
		"synpred1_Grammer", "synpred66_Grammer", "synpred2_Grammer", "synpred34_Grammer", 
		"synpred25_Grammer", "synpred55_Grammer", "case1", "simpleExp", "synpred61_Grammer", 
		"synpred46_Grammer", "synpred5_Grammer", "synpred15_Grammer", "synpred43_Grammer", 
		"block", "stmtlist", "synpred40_Grammer", "synpred36_Grammer", "synpred6_Grammer", 
		"synpred37_Grammer", "explist", "synpred54_Grammer", "synpred59_Grammer", 
		"synpred68_Grammer", "synpred20_Grammer", "synpred23_Grammer", "operator", 
		"synpred47_Grammer", "synpred31_Grammer", "dec", "synpred53_Grammer", 
		"const1", "synpred10_Grammer", "synpred65_Grammer", "idlist", "synpred56_Grammer", 
		"synpred18_Grammer", "synpred27_Grammer", "synpred3_Grammer", "synpred62_Grammer", 
		"synpred33_Grammer", "synpred26_Grammer", "declist", "synpred22_Grammer", 
		"cases", "synpred58_Grammer", "start", "synpred16_Grammer", "synpred30_Grammer", 
		"paramdec", "vardec", "stmt", "iddec", "lvalue", "synpred28_Grammer", 
		"paramdecs", "synpred11_Grammer", "synpred8_Grammer", "synpred35_Grammer", 
		"synpred49_Grammer", "synpred32_Grammer", "synpred52_Grammer", "synpred57_Grammer", 
		"elseiflist", "relop", "synpred12_Grammer", "paramdecslist", "synpred17_Grammer", 
		"synpred21_Grammer", "synpred64_Grammer", "synpred39_Grammer", "synpred9_Grammer", 
		"synpred29_Grammer", "type", "synpred48_Grammer", "synpred42_Grammer", 
		"synpred63_Grammer", "synpred44_Grammer"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, true, false, false, false, false, 
		    true, true, false, true, false, true, true, true, true, true, true, 
		    false, true, true, true, true, true, true, true, false, false, false, 
		    true, true, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GrammerParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GrammerParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public GrammerParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return GrammerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g"; }


	public void print(String text){
	System.out.print(text + " ");
	}



	// $ANTLR start "start"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:18:1: start : program EOF ;
	public final void start() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:18:7: ( program EOF )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:18:9: program EOF
			{
			dbg.location(18,9);
			pushFollow(FOLLOW_program_in_start37);
			program();
			state._fsp--;
			if (state.failed) return;dbg.location(18,17);
			match(input,EOF,FOLLOW_EOF_in_start39); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(19, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "start"



	// $ANTLR start "program"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:21:1: program : declist MAIN POPEN PCLOSE block ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:22:5: ( declist MAIN POPEN PCLOSE block )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:22:7: declist MAIN POPEN PCLOSE block
			{
			dbg.location(22,7);
			pushFollow(FOLLOW_declist_in_program53);
			declist();
			state._fsp--;
			if (state.failed) return;dbg.location(22,15);
			match(input,MAIN,FOLLOW_MAIN_in_program55); if (state.failed) return;dbg.location(22,20);
			match(input,POPEN,FOLLOW_POPEN_in_program57); if (state.failed) return;dbg.location(22,26);
			match(input,PCLOSE,FOLLOW_PCLOSE_in_program59); if (state.failed) return;dbg.location(22,33);
			pushFollow(FOLLOW_block_in_program61);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "declist"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:25:1: declist : ( dec ( END_OF_LINE )* )* ;
	public final void declist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "declist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:26:5: ( ( dec ( END_OF_LINE )* )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:26:7: ( dec ( END_OF_LINE )* )*
			{
			dbg.location(26,7);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:26:7: ( dec ( END_OF_LINE )* )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==FUN||LA2_0==ID) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:26:8: dec ( END_OF_LINE )*
					{
					dbg.location(26,8);
					pushFollow(FOLLOW_dec_in_declist79);
					dec();
					state._fsp--;
					if (state.failed) return;dbg.location(26,12);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:26:12: ( END_OF_LINE )*
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==END_OF_LINE) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:26:12: END_OF_LINE
							{
							dbg.location(26,12);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_declist81); if (state.failed) return;
							}
							break;

						default :
							break loop1;
						}
					}
					} finally {dbg.exitSubRule(1);}

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declist"



	// $ANTLR start "dec"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:29:1: dec : ( vardec | funcdec );
	public final void dec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "dec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:30:5: ( vardec | funcdec )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			else if ( (LA3_0==FUN) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:30:7: vardec
					{
					dbg.location(30,7);
					pushFollow(FOLLOW_vardec_in_dec102);
					vardec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:31:7: funcdec
					{
					dbg.location(31,7);
					pushFollow(FOLLOW_funcdec_in_dec110);
					funcdec();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dec"



	// $ANTLR start "type"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:34:1: type : ( INTKEY | FLOATKEY | BOOLKEY );
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:35:5: ( INTKEY | FLOATKEY | BOOLKEY )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
			{
			dbg.location(35,5);
			if ( input.LA(1)==BOOLKEY||input.LA(1)==FLOATKEY||input.LA(1)==INTKEY ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(38, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "iddec"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:40:1: iddec : ID ( ( LSB exp RSB ) | ( ASSIGN exp ) )? ;
	public final void iddec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iddec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:5: ( ID ( ( LSB exp RSB ) | ( ASSIGN exp ) )? )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:7: ID ( ( LSB exp RSB ) | ( ASSIGN exp ) )?
			{
			dbg.location(41,7);
			match(input,ID,FOLLOW_ID_in_iddec160); if (state.failed) return;dbg.location(41,10);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:10: ( ( LSB exp RSB ) | ( ASSIGN exp ) )?
			int alt4=3;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==LSB) ) {
				alt4=1;
			}
			else if ( (LA4_0==ASSIGN) ) {
				alt4=2;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:11: ( LSB exp RSB )
					{
					dbg.location(41,11);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:11: ( LSB exp RSB )
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:12: LSB exp RSB
					{
					dbg.location(41,12);
					match(input,LSB,FOLLOW_LSB_in_iddec164); if (state.failed) return;dbg.location(41,16);
					pushFollow(FOLLOW_exp_in_iddec166);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(41,20);
					match(input,RSB,FOLLOW_RSB_in_iddec168); if (state.failed) return;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:27: ( ASSIGN exp )
					{
					dbg.location(41,27);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:27: ( ASSIGN exp )
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:41:28: ASSIGN exp
					{
					dbg.location(41,28);
					match(input,ASSIGN,FOLLOW_ASSIGN_in_iddec174); if (state.failed) return;dbg.location(41,35);
					pushFollow(FOLLOW_exp_in_iddec176);
					exp();
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iddec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iddec"



	// $ANTLR start "idlist"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:44:1: idlist : iddec ( ',' iddec )* ;
	public final void idlist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "idlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:45:5: ( iddec ( ',' iddec )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:45:7: iddec ( ',' iddec )*
			{
			dbg.location(45,7);
			pushFollow(FOLLOW_iddec_in_idlist196);
			iddec();
			state._fsp--;
			if (state.failed) return;dbg.location(45,13);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:45:13: ( ',' iddec )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==59) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:45:14: ',' iddec
					{
					dbg.location(45,14);
					match(input,59,FOLLOW_59_in_idlist199); if (state.failed) return;dbg.location(45,18);
					pushFollow(FOLLOW_iddec_in_idlist201);
					iddec();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "idlist"



	// $ANTLR start "vardec"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:48:1: vardec : idlist ':' type SEMICOLON ;
	public final void vardec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "vardec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:49:5: ( idlist ':' type SEMICOLON )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:49:7: idlist ':' type SEMICOLON
			{
			dbg.location(49,7);
			pushFollow(FOLLOW_idlist_in_vardec220);
			idlist();
			state._fsp--;
			if (state.failed) return;dbg.location(49,14);
			match(input,60,FOLLOW_60_in_vardec222); if (state.failed) return;dbg.location(49,18);
			pushFollow(FOLLOW_type_in_vardec224);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(49,23);
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_vardec226); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vardec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vardec"



	// $ANTLR start "funcdec"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:52:1: funcdec : FUN ( ( ID POPEN paramdecs PCLOSE ) | ( POPEN paramdecs PCLOSE ':' type ) ) block ( END_OF_LINE )* ;
	public final void funcdec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funcdec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:5: ( FUN ( ( ID POPEN paramdecs PCLOSE ) | ( POPEN paramdecs PCLOSE ':' type ) ) block ( END_OF_LINE )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:7: FUN ( ( ID POPEN paramdecs PCLOSE ) | ( POPEN paramdecs PCLOSE ':' type ) ) block ( END_OF_LINE )*
			{
			dbg.location(53,7);
			match(input,FUN,FOLLOW_FUN_in_funcdec243); if (state.failed) return;dbg.location(53,11);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:11: ( ( ID POPEN paramdecs PCLOSE ) | ( POPEN paramdecs PCLOSE ':' type ) )
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			else if ( (LA6_0==POPEN) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:12: ( ID POPEN paramdecs PCLOSE )
					{
					dbg.location(53,12);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:12: ( ID POPEN paramdecs PCLOSE )
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:13: ID POPEN paramdecs PCLOSE
					{
					dbg.location(53,13);
					match(input,ID,FOLLOW_ID_in_funcdec247); if (state.failed) return;dbg.location(53,16);
					match(input,POPEN,FOLLOW_POPEN_in_funcdec249); if (state.failed) return;dbg.location(53,22);
					pushFollow(FOLLOW_paramdecs_in_funcdec251);
					paramdecs();
					state._fsp--;
					if (state.failed) return;dbg.location(53,32);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_funcdec253); if (state.failed) return;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:42: ( POPEN paramdecs PCLOSE ':' type )
					{
					dbg.location(53,42);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:42: ( POPEN paramdecs PCLOSE ':' type )
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:43: POPEN paramdecs PCLOSE ':' type
					{
					dbg.location(53,43);
					match(input,POPEN,FOLLOW_POPEN_in_funcdec259); if (state.failed) return;dbg.location(53,49);
					pushFollow(FOLLOW_paramdecs_in_funcdec261);
					paramdecs();
					state._fsp--;
					if (state.failed) return;dbg.location(53,59);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_funcdec263); if (state.failed) return;dbg.location(53,66);
					match(input,60,FOLLOW_60_in_funcdec265); if (state.failed) return;dbg.location(53,70);
					pushFollow(FOLLOW_type_in_funcdec267);
					type();
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(53,77);
			pushFollow(FOLLOW_block_in_funcdec271);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(53,83);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:83: ( END_OF_LINE )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==END_OF_LINE) ) {
					int LA7_1 = input.LA(2);
					if ( (synpred10_Grammer()) ) {
						alt7=1;
					}

				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:83: END_OF_LINE
					{
					dbg.location(53,83);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_funcdec273); if (state.failed) return;
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcdec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funcdec"



	// $ANTLR start "paramdecs"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:56:1: paramdecs : ( paramdecslist )? ;
	public final void paramdecs() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramdecs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:57:5: ( ( paramdecslist )? )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:57:7: ( paramdecslist )?
			{
			dbg.location(57,7);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:57:7: ( paramdecslist )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:57:7: paramdecslist
					{
					dbg.location(57,7);
					pushFollow(FOLLOW_paramdecslist_in_paramdecs291);
					paramdecslist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramdecs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramdecs"



	// $ANTLR start "paramdecslist"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:60:1: paramdecslist : paramdec ( ',' paramdec )* ;
	public final void paramdecslist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramdecslist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:61:5: ( paramdec ( ',' paramdec )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:61:7: paramdec ( ',' paramdec )*
			{
			dbg.location(61,7);
			pushFollow(FOLLOW_paramdec_in_paramdecslist309);
			paramdec();
			state._fsp--;
			if (state.failed) return;dbg.location(61,16);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:61:16: ( ',' paramdec )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==59) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:61:17: ',' paramdec
					{
					dbg.location(61,17);
					match(input,59,FOLLOW_59_in_paramdecslist312); if (state.failed) return;dbg.location(61,21);
					pushFollow(FOLLOW_paramdec_in_paramdecslist314);
					paramdec();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramdecslist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramdecslist"



	// $ANTLR start "paramdec"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:64:1: paramdec : ID ( LSB RSB )? ':' type ;
	public final void paramdec() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramdec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:65:5: ( ID ( LSB RSB )? ':' type )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:65:7: ID ( LSB RSB )? ':' type
			{
			dbg.location(65,7);
			match(input,ID,FOLLOW_ID_in_paramdec333); if (state.failed) return;dbg.location(65,10);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:65:10: ( LSB RSB )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==LSB) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:65:11: LSB RSB
					{
					dbg.location(65,11);
					match(input,LSB,FOLLOW_LSB_in_paramdec336); if (state.failed) return;dbg.location(65,15);
					match(input,RSB,FOLLOW_RSB_in_paramdec338); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(65,21);
			match(input,60,FOLLOW_60_in_paramdec342); if (state.failed) return;dbg.location(65,25);
			pushFollow(FOLLOW_type_in_paramdec344);
			type();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(66, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramdec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramdec"



	// $ANTLR start "block"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:68:1: block : ( END_OF_LINE )* '{' ( END_OF_LINE )* ( stmtlist )? ( END_OF_LINE )* '}' ( END_OF_LINE )* ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:5: ( ( END_OF_LINE )* '{' ( END_OF_LINE )* ( stmtlist )? ( END_OF_LINE )* '}' ( END_OF_LINE )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:7: ( END_OF_LINE )* '{' ( END_OF_LINE )* ( stmtlist )? ( END_OF_LINE )* '}' ( END_OF_LINE )*
			{
			dbg.location(69,7);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:7: ( END_OF_LINE )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==END_OF_LINE) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:7: END_OF_LINE
					{
					dbg.location(69,7);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_block361); if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(69,20);
			match(input,61,FOLLOW_61_in_block364); if (state.failed) return;dbg.location(69,24);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:24: ( END_OF_LINE )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==END_OF_LINE) ) {
					int LA12_2 = input.LA(2);
					if ( (synpred15_Grammer()) ) {
						alt12=1;
					}

				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:24: END_OF_LINE
					{
					dbg.location(69,24);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_block366); if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(69,37);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:37: ( stmtlist )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
				case FALSE:
				case FLOAT:
				case FOR:
				case ID:
				case IF:
				case INT:
				case NOT:
				case ON:
				case POPEN:
				case PRINT:
				case RETURN:
				case SUB:
				case TRUE:
				case WHILE:
				case 61:
					{
					alt13=1;
					}
					break;
				case END_OF_LINE:
					{
					int LA13_2 = input.LA(2);
					if ( (synpred16_Grammer()) ) {
						alt13=1;
					}
					}
					break;
				case 62:
					{
					int LA13_3 = input.LA(2);
					if ( (synpred16_Grammer()) ) {
						alt13=1;
					}
					}
					break;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:37: stmtlist
					{
					dbg.location(69,37);
					pushFollow(FOLLOW_stmtlist_in_block369);
					stmtlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(69,47);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:47: ( END_OF_LINE )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==END_OF_LINE) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:47: END_OF_LINE
					{
					dbg.location(69,47);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_block372); if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(69,60);
			match(input,62,FOLLOW_62_in_block375); if (state.failed) return;dbg.location(69,64);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:64: ( END_OF_LINE )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==END_OF_LINE) ) {
					int LA15_2 = input.LA(2);
					if ( (synpred18_Grammer()) ) {
						alt15=1;
					}

				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:64: END_OF_LINE
					{
					dbg.location(69,64);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_block377); if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(70, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "stmtlist"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:72:1: stmtlist : ( stmt )* ;
	public final void stmtlist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stmtlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:73:5: ( ( stmt )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:73:7: ( stmt )*
			{
			dbg.location(73,7);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:73:7: ( stmt )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				try {
					isCyclicDecision = true;
					alt16 = dfa16.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:73:7: stmt
					{
					dbg.location(73,7);
					pushFollow(FOLLOW_stmt_in_stmtlist395);
					stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmtlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stmtlist"



	// $ANTLR start "stmt"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:76:1: stmt : ( RETURN exp SEMICOLON ( END_OF_LINE )* | exp SEMICOLON ( END_OF_LINE )* | block ( END_OF_LINE )* | vardec ( END_OF_LINE )* | WHILE POPEN exp PCLOSE stmt ( END_OF_LINE )* | ON POPEN exp PCLOSE '{' cases '}' SEMICOLON ( END_OF_LINE )* | FOR POPEN ( ( exp SEMICOLON exp SEMICOLON exp ) | ( ID IN ID ) ) PCLOSE stmt ( END_OF_LINE )* | IF POPEN exp PCLOSE stmt elseiflist ( ELSE stmt )? ( END_OF_LINE )* | PRINT POPEN ID PCLOSE SEMICOLON ( END_OF_LINE )* );
	public final void stmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:77:5: ( RETURN exp SEMICOLON ( END_OF_LINE )* | exp SEMICOLON ( END_OF_LINE )* | block ( END_OF_LINE )* | vardec ( END_OF_LINE )* | WHILE POPEN exp PCLOSE stmt ( END_OF_LINE )* | ON POPEN exp PCLOSE '{' cases '}' SEMICOLON ( END_OF_LINE )* | FOR POPEN ( ( exp SEMICOLON exp SEMICOLON exp ) | ( ID IN ID ) ) PCLOSE stmt ( END_OF_LINE )* | IF POPEN exp PCLOSE stmt elseiflist ( ELSE stmt )? ( END_OF_LINE )* | PRINT POPEN ID PCLOSE SEMICOLON ( END_OF_LINE )* )
			int alt28=9;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			switch ( input.LA(1) ) {
			case RETURN:
				{
				alt28=1;
				}
				break;
			case FALSE:
			case FLOAT:
			case INT:
			case NOT:
			case POPEN:
			case SUB:
			case TRUE:
				{
				alt28=2;
				}
				break;
			case ID:
				{
				int LA28_3 = input.LA(2);
				if ( (synpred23_Grammer()) ) {
					alt28=2;
				}
				else if ( (synpred27_Grammer()) ) {
					alt28=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case END_OF_LINE:
			case 61:
				{
				alt28=3;
				}
				break;
			case WHILE:
				{
				alt28=5;
				}
				break;
			case ON:
				{
				alt28=6;
				}
				break;
			case FOR:
				{
				alt28=7;
				}
				break;
			case IF:
				{
				alt28=8;
				}
				break;
			case PRINT:
				{
				alt28=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:77:7: RETURN exp SEMICOLON ( END_OF_LINE )*
					{
					dbg.location(77,7);
					match(input,RETURN,FOLLOW_RETURN_in_stmt413); if (state.failed) return;dbg.location(77,14);
					pushFollow(FOLLOW_exp_in_stmt415);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(77,18);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt417); if (state.failed) return;dbg.location(77,28);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:77:28: ( END_OF_LINE )*
					try { dbg.enterSubRule(17);

					loop17:
					while (true) {
						int alt17=2;
						try { dbg.enterDecision(17, decisionCanBacktrack[17]);

						int LA17_0 = input.LA(1);
						if ( (LA17_0==END_OF_LINE) ) {
							int LA17_1 = input.LA(2);
							if ( (synpred20_Grammer()) ) {
								alt17=1;
							}

						}

						} finally {dbg.exitDecision(17);}

						switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:77:28: END_OF_LINE
							{
							dbg.location(77,28);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt419); if (state.failed) return;
							}
							break;

						default :
							break loop17;
						}
					}
					} finally {dbg.exitSubRule(17);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:7: exp SEMICOLON ( END_OF_LINE )*
					{
					dbg.location(78,7);
					pushFollow(FOLLOW_exp_in_stmt428);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(78,11);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt430); if (state.failed) return;dbg.location(78,21);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:21: ( END_OF_LINE )*
					try { dbg.enterSubRule(18);

					loop18:
					while (true) {
						int alt18=2;
						try { dbg.enterDecision(18, decisionCanBacktrack[18]);

						int LA18_0 = input.LA(1);
						if ( (LA18_0==END_OF_LINE) ) {
							int LA18_1 = input.LA(2);
							if ( (synpred22_Grammer()) ) {
								alt18=1;
							}

						}

						} finally {dbg.exitDecision(18);}

						switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:21: END_OF_LINE
							{
							dbg.location(78,21);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt432); if (state.failed) return;
							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:79:7: block ( END_OF_LINE )*
					{
					dbg.location(79,7);
					pushFollow(FOLLOW_block_in_stmt441);
					block();
					state._fsp--;
					if (state.failed) return;dbg.location(79,13);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:79:13: ( END_OF_LINE )*
					try { dbg.enterSubRule(19);

					loop19:
					while (true) {
						int alt19=2;
						try { dbg.enterDecision(19, decisionCanBacktrack[19]);

						int LA19_0 = input.LA(1);
						if ( (LA19_0==END_OF_LINE) ) {
							int LA19_1 = input.LA(2);
							if ( (synpred24_Grammer()) ) {
								alt19=1;
							}

						}

						} finally {dbg.exitDecision(19);}

						switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:79:13: END_OF_LINE
							{
							dbg.location(79,13);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt443); if (state.failed) return;
							}
							break;

						default :
							break loop19;
						}
					}
					} finally {dbg.exitSubRule(19);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:7: vardec ( END_OF_LINE )*
					{
					dbg.location(80,7);
					pushFollow(FOLLOW_vardec_in_stmt452);
					vardec();
					state._fsp--;
					if (state.failed) return;dbg.location(80,14);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:14: ( END_OF_LINE )*
					try { dbg.enterSubRule(20);

					loop20:
					while (true) {
						int alt20=2;
						try { dbg.enterDecision(20, decisionCanBacktrack[20]);

						int LA20_0 = input.LA(1);
						if ( (LA20_0==END_OF_LINE) ) {
							int LA20_1 = input.LA(2);
							if ( (synpred26_Grammer()) ) {
								alt20=1;
							}

						}

						} finally {dbg.exitDecision(20);}

						switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:14: END_OF_LINE
							{
							dbg.location(80,14);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt454); if (state.failed) return;
							}
							break;

						default :
							break loop20;
						}
					}
					} finally {dbg.exitSubRule(20);}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:81:7: WHILE POPEN exp PCLOSE stmt ( END_OF_LINE )*
					{
					dbg.location(81,7);
					match(input,WHILE,FOLLOW_WHILE_in_stmt463); if (state.failed) return;dbg.location(81,13);
					match(input,POPEN,FOLLOW_POPEN_in_stmt465); if (state.failed) return;dbg.location(81,19);
					pushFollow(FOLLOW_exp_in_stmt467);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(81,23);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_stmt469); if (state.failed) return;dbg.location(81,30);
					pushFollow(FOLLOW_stmt_in_stmt471);
					stmt();
					state._fsp--;
					if (state.failed) return;dbg.location(81,35);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:81:35: ( END_OF_LINE )*
					try { dbg.enterSubRule(21);

					loop21:
					while (true) {
						int alt21=2;
						try { dbg.enterDecision(21, decisionCanBacktrack[21]);

						int LA21_0 = input.LA(1);
						if ( (LA21_0==END_OF_LINE) ) {
							int LA21_1 = input.LA(2);
							if ( (synpred28_Grammer()) ) {
								alt21=1;
							}

						}

						} finally {dbg.exitDecision(21);}

						switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:81:35: END_OF_LINE
							{
							dbg.location(81,35);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt473); if (state.failed) return;
							}
							break;

						default :
							break loop21;
						}
					}
					} finally {dbg.exitSubRule(21);}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:82:7: ON POPEN exp PCLOSE '{' cases '}' SEMICOLON ( END_OF_LINE )*
					{
					dbg.location(82,7);
					match(input,ON,FOLLOW_ON_in_stmt483); if (state.failed) return;dbg.location(82,10);
					match(input,POPEN,FOLLOW_POPEN_in_stmt485); if (state.failed) return;dbg.location(82,16);
					pushFollow(FOLLOW_exp_in_stmt487);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(82,20);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_stmt489); if (state.failed) return;dbg.location(82,27);
					match(input,61,FOLLOW_61_in_stmt491); if (state.failed) return;dbg.location(82,31);
					pushFollow(FOLLOW_cases_in_stmt493);
					cases();
					state._fsp--;
					if (state.failed) return;dbg.location(82,37);
					match(input,62,FOLLOW_62_in_stmt495); if (state.failed) return;dbg.location(82,41);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt497); if (state.failed) return;dbg.location(82,51);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:82:51: ( END_OF_LINE )*
					try { dbg.enterSubRule(22);

					loop22:
					while (true) {
						int alt22=2;
						try { dbg.enterDecision(22, decisionCanBacktrack[22]);

						int LA22_0 = input.LA(1);
						if ( (LA22_0==END_OF_LINE) ) {
							int LA22_1 = input.LA(2);
							if ( (synpred30_Grammer()) ) {
								alt22=1;
							}

						}

						} finally {dbg.exitDecision(22);}

						switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:82:51: END_OF_LINE
							{
							dbg.location(82,51);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt499); if (state.failed) return;
							}
							break;

						default :
							break loop22;
						}
					}
					} finally {dbg.exitSubRule(22);}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:7: FOR POPEN ( ( exp SEMICOLON exp SEMICOLON exp ) | ( ID IN ID ) ) PCLOSE stmt ( END_OF_LINE )*
					{
					dbg.location(83,7);
					match(input,FOR,FOLLOW_FOR_in_stmt508); if (state.failed) return;dbg.location(83,11);
					match(input,POPEN,FOLLOW_POPEN_in_stmt510); if (state.failed) return;dbg.location(83,17);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:17: ( ( exp SEMICOLON exp SEMICOLON exp ) | ( ID IN ID ) )
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= FALSE && LA23_0 <= FLOAT)||LA23_0==INT||LA23_0==NOT||LA23_0==POPEN||LA23_0==SUB||LA23_0==TRUE) ) {
						alt23=1;
					}
					else if ( (LA23_0==ID) ) {
						int LA23_2 = input.LA(2);
						if ( ((LA23_2 >= AND && LA23_2 <= ASSIGN)||LA23_2==DIV||(LA23_2 >= END_OF_LINE && LA23_2 <= EQUAL)||(LA23_2 >= GE && LA23_2 <= GREATER)||(LA23_2 >= LE && LA23_2 <= LSB)||LA23_2==MUL||LA23_2==NOTEQUAL||LA23_2==OR||LA23_2==POPEN||LA23_2==REM||LA23_2==SEMICOLON||(LA23_2 >= SUB && LA23_2 <= SUM)) ) {
							alt23=1;
						}
						else if ( (LA23_2==IN) ) {
							alt23=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 23, 2, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:18: ( exp SEMICOLON exp SEMICOLON exp )
							{
							dbg.location(83,18);
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:18: ( exp SEMICOLON exp SEMICOLON exp )
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:19: exp SEMICOLON exp SEMICOLON exp
							{
							dbg.location(83,19);
							pushFollow(FOLLOW_exp_in_stmt514);
							exp();
							state._fsp--;
							if (state.failed) return;dbg.location(83,23);
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt516); if (state.failed) return;dbg.location(83,33);
							pushFollow(FOLLOW_exp_in_stmt518);
							exp();
							state._fsp--;
							if (state.failed) return;dbg.location(83,37);
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt520); if (state.failed) return;dbg.location(83,47);
							pushFollow(FOLLOW_exp_in_stmt522);
							exp();
							state._fsp--;
							if (state.failed) return;
							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:54: ( ID IN ID )
							{
							dbg.location(83,54);
							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:54: ( ID IN ID )
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:55: ID IN ID
							{
							dbg.location(83,55);
							match(input,ID,FOLLOW_ID_in_stmt528); if (state.failed) return;dbg.location(83,58);
							match(input,IN,FOLLOW_IN_in_stmt530); if (state.failed) return;dbg.location(83,61);
							match(input,ID,FOLLOW_ID_in_stmt532); if (state.failed) return;
							}

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(83,66);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_stmt536); if (state.failed) return;dbg.location(83,73);
					pushFollow(FOLLOW_stmt_in_stmt538);
					stmt();
					state._fsp--;
					if (state.failed) return;dbg.location(83,78);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:78: ( END_OF_LINE )*
					try { dbg.enterSubRule(24);

					loop24:
					while (true) {
						int alt24=2;
						try { dbg.enterDecision(24, decisionCanBacktrack[24]);

						int LA24_0 = input.LA(1);
						if ( (LA24_0==END_OF_LINE) ) {
							int LA24_1 = input.LA(2);
							if ( (synpred33_Grammer()) ) {
								alt24=1;
							}

						}

						} finally {dbg.exitDecision(24);}

						switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:78: END_OF_LINE
							{
							dbg.location(83,78);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt540); if (state.failed) return;
							}
							break;

						default :
							break loop24;
						}
					}
					} finally {dbg.exitSubRule(24);}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:7: IF POPEN exp PCLOSE stmt elseiflist ( ELSE stmt )? ( END_OF_LINE )*
					{
					dbg.location(84,7);
					match(input,IF,FOLLOW_IF_in_stmt549); if (state.failed) return;dbg.location(84,10);
					match(input,POPEN,FOLLOW_POPEN_in_stmt551); if (state.failed) return;dbg.location(84,16);
					pushFollow(FOLLOW_exp_in_stmt553);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(84,20);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_stmt555); if (state.failed) return;dbg.location(84,27);
					pushFollow(FOLLOW_stmt_in_stmt557);
					stmt();
					state._fsp--;
					if (state.failed) return;dbg.location(84,32);
					pushFollow(FOLLOW_elseiflist_in_stmt559);
					elseiflist();
					state._fsp--;
					if (state.failed) return;dbg.location(84,43);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:43: ( ELSE stmt )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==ELSE) ) {
						int LA25_1 = input.LA(2);
						if ( (synpred35_Grammer()) ) {
							alt25=1;
						}
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:44: ELSE stmt
							{
							dbg.location(84,44);
							match(input,ELSE,FOLLOW_ELSE_in_stmt562); if (state.failed) return;dbg.location(84,49);
							pushFollow(FOLLOW_stmt_in_stmt564);
							stmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(84,56);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:56: ( END_OF_LINE )*
					try { dbg.enterSubRule(26);

					loop26:
					while (true) {
						int alt26=2;
						try { dbg.enterDecision(26, decisionCanBacktrack[26]);

						int LA26_0 = input.LA(1);
						if ( (LA26_0==END_OF_LINE) ) {
							int LA26_1 = input.LA(2);
							if ( (synpred36_Grammer()) ) {
								alt26=1;
							}

						}

						} finally {dbg.exitDecision(26);}

						switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:56: END_OF_LINE
							{
							dbg.location(84,56);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt568); if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}
					} finally {dbg.exitSubRule(26);}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:85:7: PRINT POPEN ID PCLOSE SEMICOLON ( END_OF_LINE )*
					{
					dbg.location(85,7);
					match(input,PRINT,FOLLOW_PRINT_in_stmt577); if (state.failed) return;dbg.location(85,13);
					match(input,POPEN,FOLLOW_POPEN_in_stmt579); if (state.failed) return;dbg.location(85,19);
					match(input,ID,FOLLOW_ID_in_stmt581); if (state.failed) return;dbg.location(85,22);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_stmt583); if (state.failed) return;dbg.location(85,29);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt585); if (state.failed) return;dbg.location(85,39);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:85:39: ( END_OF_LINE )*
					try { dbg.enterSubRule(27);

					loop27:
					while (true) {
						int alt27=2;
						try { dbg.enterDecision(27, decisionCanBacktrack[27]);

						int LA27_0 = input.LA(1);
						if ( (LA27_0==END_OF_LINE) ) {
							int LA27_1 = input.LA(2);
							if ( (synpred38_Grammer()) ) {
								alt27=1;
							}

						}

						} finally {dbg.exitDecision(27);}

						switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:85:39: END_OF_LINE
							{
							dbg.location(85,39);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_stmt587); if (state.failed) return;
							}
							break;

						default :
							break loop27;
						}
					}
					} finally {dbg.exitSubRule(27);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stmt"



	// $ANTLR start "elseiflist"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:88:1: elseiflist : ( ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )* )* ;
	public final void elseiflist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "elseiflist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:5: ( ( ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )* )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:7: ( ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )* )*
			{
			dbg.location(89,7);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:7: ( ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )* )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==ELSEIF) ) {
					int LA30_2 = input.LA(2);
					if ( (synpred40_Grammer()) ) {
						alt30=1;
					}

				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:8: ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )*
					{
					dbg.location(89,8);
					match(input,ELSEIF,FOLLOW_ELSEIF_in_elseiflist606); if (state.failed) return;dbg.location(89,15);
					match(input,POPEN,FOLLOW_POPEN_in_elseiflist608); if (state.failed) return;dbg.location(89,21);
					pushFollow(FOLLOW_exp_in_elseiflist610);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(89,25);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_elseiflist612); if (state.failed) return;dbg.location(89,32);
					pushFollow(FOLLOW_stmt_in_elseiflist614);
					stmt();
					state._fsp--;
					if (state.failed) return;dbg.location(89,37);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:37: ( END_OF_LINE )*
					try { dbg.enterSubRule(29);

					loop29:
					while (true) {
						int alt29=2;
						try { dbg.enterDecision(29, decisionCanBacktrack[29]);

						int LA29_0 = input.LA(1);
						if ( (LA29_0==END_OF_LINE) ) {
							int LA29_2 = input.LA(2);
							if ( (synpred39_Grammer()) ) {
								alt29=1;
							}

						}

						} finally {dbg.exitDecision(29);}

						switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:37: END_OF_LINE
							{
							dbg.location(89,37);
							match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_elseiflist616); if (state.failed) return;
							}
							break;

						default :
							break loop29;
						}
					}
					} finally {dbg.exitSubRule(29);}

					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(90, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "elseiflist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "elseiflist"



	// $ANTLR start "cases"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:92:1: cases : ( case1 )* ;
	public final void cases() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "cases");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:93:5: ( ( case1 )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:93:7: ( case1 )*
			{
			dbg.location(93,7);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:93:7: ( case1 )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==WHERE) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:93:7: case1
					{
					dbg.location(93,7);
					pushFollow(FOLLOW_case1_in_cases636);
					case1();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(94, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "cases");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "cases"



	// $ANTLR start "case1"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:96:1: case1 : WHERE const1 ':' stmtlist ( END_OF_LINE )* ;
	public final void case1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "case1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:97:5: ( WHERE const1 ':' stmtlist ( END_OF_LINE )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:97:7: WHERE const1 ':' stmtlist ( END_OF_LINE )*
			{
			dbg.location(97,7);
			match(input,WHERE,FOLLOW_WHERE_in_case1654); if (state.failed) return;dbg.location(97,13);
			pushFollow(FOLLOW_const1_in_case1656);
			const1();
			state._fsp--;
			if (state.failed) return;dbg.location(97,20);
			match(input,60,FOLLOW_60_in_case1658); if (state.failed) return;dbg.location(97,24);
			pushFollow(FOLLOW_stmtlist_in_case1660);
			stmtlist();
			state._fsp--;
			if (state.failed) return;dbg.location(97,33);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:97:33: ( END_OF_LINE )*
			try { dbg.enterSubRule(32);

			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==END_OF_LINE) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:97:33: END_OF_LINE
					{
					dbg.location(97,33);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_case1662); if (state.failed) return;
					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(98, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "case1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "case1"



	// $ANTLR start "exp"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:104:1: exp : simpleExp ( ( operator | relop | ASSIGN ) simpleExp )* ( END_OF_LINE )* ;
	public final void exp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:5: ( simpleExp ( ( operator | relop | ASSIGN ) simpleExp )* ( END_OF_LINE )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:7: simpleExp ( ( operator | relop | ASSIGN ) simpleExp )* ( END_OF_LINE )*
			{
			dbg.location(105,7);
			pushFollow(FOLLOW_simpleExp_in_exp684);
			simpleExp();
			state._fsp--;
			if (state.failed) return;dbg.location(105,17);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:17: ( ( operator | relop | ASSIGN ) simpleExp )*
			try { dbg.enterSubRule(34);

			loop34:
			while (true) {
				int alt34=2;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				switch ( input.LA(1) ) {
				case AND:
				case DIV:
				case MUL:
				case OR:
				case REM:
				case SUB:
				case SUM:
					{
					int LA34_2 = input.LA(2);
					if ( (synpred45_Grammer()) ) {
						alt34=1;
					}

					}
					break;
				case EQUAL:
				case GE:
				case GREATER:
				case LE:
				case LOWER:
				case NOTEQUAL:
					{
					int LA34_3 = input.LA(2);
					if ( (synpred45_Grammer()) ) {
						alt34=1;
					}

					}
					break;
				case ASSIGN:
					{
					int LA34_4 = input.LA(2);
					if ( (synpred45_Grammer()) ) {
						alt34=1;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:18: ( operator | relop | ASSIGN ) simpleExp
					{
					dbg.location(105,18);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:18: ( operator | relop | ASSIGN )
					int alt33=3;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

					switch ( input.LA(1) ) {
					case AND:
					case DIV:
					case MUL:
					case OR:
					case REM:
					case SUB:
					case SUM:
						{
						alt33=1;
						}
						break;
					case EQUAL:
					case GE:
					case GREATER:
					case LE:
					case LOWER:
					case NOTEQUAL:
						{
						alt33=2;
						}
						break;
					case ASSIGN:
						{
						alt33=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:19: operator
							{
							dbg.location(105,19);
							pushFollow(FOLLOW_operator_in_exp688);
							operator();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:30: relop
							{
							dbg.location(105,30);
							pushFollow(FOLLOW_relop_in_exp692);
							relop();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:38: ASSIGN
							{
							dbg.location(105,38);
							match(input,ASSIGN,FOLLOW_ASSIGN_in_exp696); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(33);}
					dbg.location(105,46);
					pushFollow(FOLLOW_simpleExp_in_exp699);
					simpleExp();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}
			dbg.location(105,58);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:58: ( END_OF_LINE )*
			try { dbg.enterSubRule(35);

			loop35:
			while (true) {
				int alt35=2;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

				int LA35_0 = input.LA(1);
				if ( (LA35_0==END_OF_LINE) ) {
					int LA35_2 = input.LA(2);
					if ( (synpred46_Grammer()) ) {
						alt35=1;
					}

				}

				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:58: END_OF_LINE
					{
					dbg.location(105,58);
					match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_exp703); if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(106, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exp"



	// $ANTLR start "simpleExp"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:108:1: simpleExp : ( const1 | lvalue | ID POPEN ( explist )? PCLOSE | POPEN exp PCLOSE | SUB exp | NOT exp );
	public final void simpleExp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "simpleExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:109:5: ( const1 | lvalue | ID POPEN ( explist )? PCLOSE | POPEN exp PCLOSE | SUB exp | NOT exp )
			int alt37=6;
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			switch ( input.LA(1) ) {
			case FALSE:
			case FLOAT:
			case INT:
			case TRUE:
				{
				alt37=1;
				}
				break;
			case ID:
				{
				int LA37_2 = input.LA(2);
				if ( (LA37_2==POPEN) ) {
					alt37=3;
				}
				else if ( (LA37_2==EOF||(LA37_2 >= AND && LA37_2 <= ASSIGN)||LA37_2==DIV||(LA37_2 >= END_OF_LINE && LA37_2 <= EQUAL)||(LA37_2 >= GE && LA37_2 <= GREATER)||(LA37_2 >= LE && LA37_2 <= LSB)||LA37_2==MUL||LA37_2==NOTEQUAL||LA37_2==OR||LA37_2==PCLOSE||LA37_2==REM||(LA37_2 >= RSB && LA37_2 <= SEMICOLON)||(LA37_2 >= SUB && LA37_2 <= SUM)||(LA37_2 >= 59 && LA37_2 <= 60)) ) {
					alt37=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case POPEN:
				{
				alt37=4;
				}
				break;
			case SUB:
				{
				alt37=5;
				}
				break;
			case NOT:
				{
				alt37=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:109:7: const1
					{
					dbg.location(109,7);
					pushFollow(FOLLOW_const1_in_simpleExp721);
					const1();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:110:7: lvalue
					{
					dbg.location(110,7);
					pushFollow(FOLLOW_lvalue_in_simpleExp729);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:111:7: ID POPEN ( explist )? PCLOSE
					{
					dbg.location(111,7);
					match(input,ID,FOLLOW_ID_in_simpleExp737); if (state.failed) return;dbg.location(111,10);
					match(input,POPEN,FOLLOW_POPEN_in_simpleExp739); if (state.failed) return;dbg.location(111,16);
					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:111:16: ( explist )?
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( ((LA36_0 >= FALSE && LA36_0 <= FLOAT)||LA36_0==ID||LA36_0==INT||LA36_0==NOT||LA36_0==POPEN||LA36_0==SUB||LA36_0==TRUE) ) {
						alt36=1;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:111:16: explist
							{
							dbg.location(111,16);
							pushFollow(FOLLOW_explist_in_simpleExp741);
							explist();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(36);}
					dbg.location(111,25);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_simpleExp744); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:112:7: POPEN exp PCLOSE
					{
					dbg.location(112,7);
					match(input,POPEN,FOLLOW_POPEN_in_simpleExp752); if (state.failed) return;dbg.location(112,13);
					pushFollow(FOLLOW_exp_in_simpleExp754);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(112,17);
					match(input,PCLOSE,FOLLOW_PCLOSE_in_simpleExp756); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:113:7: SUB exp
					{
					dbg.location(113,7);
					match(input,SUB,FOLLOW_SUB_in_simpleExp764); if (state.failed) return;dbg.location(113,11);
					pushFollow(FOLLOW_exp_in_simpleExp766);
					exp();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:114:7: NOT exp
					{
					dbg.location(114,7);
					match(input,NOT,FOLLOW_NOT_in_simpleExp774); if (state.failed) return;dbg.location(114,11);
					pushFollow(FOLLOW_exp_in_simpleExp776);
					exp();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(115, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "simpleExp"



	// $ANTLR start "operator"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:117:1: operator : ( AND | OR | SUM | SUB | MUL | DIV | REM );
	public final void operator() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:118:5: ( AND | OR | SUM | SUB | MUL | DIV | REM )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
			{
			dbg.location(118,5);
			if ( input.LA(1)==AND||input.LA(1)==DIV||input.LA(1)==MUL||input.LA(1)==OR||input.LA(1)==REM||(input.LA(1) >= SUB && input.LA(1) <= SUM) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(125, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "operator"



	// $ANTLR start "const1"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:127:1: const1 : ( INT | FLOAT | TRUE | FALSE );
	public final void const1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "const1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:128:5: ( INT | FLOAT | TRUE | FALSE )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
			{
			dbg.location(128,5);
			if ( (input.LA(1) >= FALSE && input.LA(1) <= FLOAT)||input.LA(1)==INT||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(132, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "const1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "const1"



	// $ANTLR start "relop"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:134:1: relop : ( GREATER | LOWER | NOTEQUAL | EQUAL | LE | GE );
	public final void relop() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "relop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:135:5: ( GREATER | LOWER | NOTEQUAL | EQUAL | LE | GE )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:
			{
			dbg.location(135,5);
			if ( input.LA(1)==EQUAL||(input.LA(1) >= GE && input.LA(1) <= GREATER)||(input.LA(1) >= LE && input.LA(1) <= LOWER)||input.LA(1)==NOTEQUAL ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(141, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "relop"



	// $ANTLR start "explist"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:143:1: explist : exp ( ',' exp )* ;
	public final void explist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "explist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:144:5: ( exp ( ',' exp )* )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:144:7: exp ( ',' exp )*
			{
			dbg.location(144,7);
			pushFollow(FOLLOW_exp_in_explist960);
			exp();
			state._fsp--;
			if (state.failed) return;dbg.location(144,11);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:144:11: ( ',' exp )*
			try { dbg.enterSubRule(38);

			loop38:
			while (true) {
				int alt38=2;
				try { dbg.enterDecision(38, decisionCanBacktrack[38]);

				int LA38_0 = input.LA(1);
				if ( (LA38_0==59) ) {
					alt38=1;
				}

				} finally {dbg.exitDecision(38);}

				switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:144:12: ',' exp
					{
					dbg.location(144,12);
					match(input,59,FOLLOW_59_in_explist963); if (state.failed) return;dbg.location(144,16);
					pushFollow(FOLLOW_exp_in_explist965);
					exp();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop38;
				}
			}
			} finally {dbg.exitSubRule(38);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(145, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "explist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "explist"



	// $ANTLR start "lvalue"
	// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:147:1: lvalue : ID ( LSB exp RSB )? ;
	public final void lvalue() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:148:5: ( ID ( LSB exp RSB )? )
			dbg.enterAlt(1);

			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:148:7: ID ( LSB exp RSB )?
			{
			dbg.location(148,7);
			match(input,ID,FOLLOW_ID_in_lvalue984); if (state.failed) return;dbg.location(148,10);
			// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:148:10: ( LSB exp RSB )?
			int alt39=2;
			try { dbg.enterSubRule(39);
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			int LA39_0 = input.LA(1);
			if ( (LA39_0==LSB) ) {
				alt39=1;
			}
			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:148:11: LSB exp RSB
					{
					dbg.location(148,11);
					match(input,LSB,FOLLOW_LSB_in_lvalue987); if (state.failed) return;dbg.location(148,15);
					pushFollow(FOLLOW_exp_in_lvalue989);
					exp();
					state._fsp--;
					if (state.failed) return;dbg.location(148,19);
					match(input,RSB,FOLLOW_RSB_in_lvalue991); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(39);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(149, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lvalue"

	// $ANTLR start synpred10_Grammer
	public final void synpred10_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:83: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:53:83: END_OF_LINE
		{
		dbg.location(53,83);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred10_Grammer273); if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_Grammer

	// $ANTLR start synpred15_Grammer
	public final void synpred15_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:24: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:24: END_OF_LINE
		{
		dbg.location(69,24);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred15_Grammer366); if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_Grammer

	// $ANTLR start synpred16_Grammer
	public final void synpred16_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:37: ( stmtlist )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:37: stmtlist
		{
		dbg.location(69,37);
		pushFollow(FOLLOW_stmtlist_in_synpred16_Grammer369);
		stmtlist();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred16_Grammer

	// $ANTLR start synpred18_Grammer
	public final void synpred18_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:64: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:69:64: END_OF_LINE
		{
		dbg.location(69,64);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred18_Grammer377); if (state.failed) return;
		}

	}
	// $ANTLR end synpred18_Grammer

	// $ANTLR start synpred20_Grammer
	public final void synpred20_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:77:28: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:77:28: END_OF_LINE
		{
		dbg.location(77,28);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred20_Grammer419); if (state.failed) return;
		}

	}
	// $ANTLR end synpred20_Grammer

	// $ANTLR start synpred22_Grammer
	public final void synpred22_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:21: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:21: END_OF_LINE
		{
		dbg.location(78,21);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred22_Grammer432); if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_Grammer

	// $ANTLR start synpred23_Grammer
	public final void synpred23_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:7: ( exp SEMICOLON ( END_OF_LINE )* )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:7: exp SEMICOLON ( END_OF_LINE )*
		{
		dbg.location(78,7);
		pushFollow(FOLLOW_exp_in_synpred23_Grammer428);
		exp();
		state._fsp--;
		if (state.failed) return;dbg.location(78,11);
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred23_Grammer430); if (state.failed) return;dbg.location(78,21);
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:21: ( END_OF_LINE )*
		try { dbg.enterSubRule(42);

		loop42:
		while (true) {
			int alt42=2;
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			int LA42_0 = input.LA(1);
			if ( (LA42_0==END_OF_LINE) ) {
				alt42=1;
			}

			} finally {dbg.exitDecision(42);}

			switch (alt42) {
			case 1 :
				dbg.enterAlt(1);

				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:78:21: END_OF_LINE
				{
				dbg.location(78,21);
				match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred23_Grammer432); if (state.failed) return;
				}
				break;

			default :
				break loop42;
			}
		}
		} finally {dbg.exitSubRule(42);}

		}

	}
	// $ANTLR end synpred23_Grammer

	// $ANTLR start synpred24_Grammer
	public final void synpred24_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:79:13: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:79:13: END_OF_LINE
		{
		dbg.location(79,13);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred24_Grammer443); if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_Grammer

	// $ANTLR start synpred26_Grammer
	public final void synpred26_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:14: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:14: END_OF_LINE
		{
		dbg.location(80,14);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred26_Grammer454); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_Grammer

	// $ANTLR start synpred27_Grammer
	public final void synpred27_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:7: ( vardec ( END_OF_LINE )* )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:7: vardec ( END_OF_LINE )*
		{
		dbg.location(80,7);
		pushFollow(FOLLOW_vardec_in_synpred27_Grammer452);
		vardec();
		state._fsp--;
		if (state.failed) return;dbg.location(80,14);
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:14: ( END_OF_LINE )*
		try { dbg.enterSubRule(44);

		loop44:
		while (true) {
			int alt44=2;
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==END_OF_LINE) ) {
				alt44=1;
			}

			} finally {dbg.exitDecision(44);}

			switch (alt44) {
			case 1 :
				dbg.enterAlt(1);

				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:80:14: END_OF_LINE
				{
				dbg.location(80,14);
				match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred27_Grammer454); if (state.failed) return;
				}
				break;

			default :
				break loop44;
			}
		}
		} finally {dbg.exitSubRule(44);}

		}

	}
	// $ANTLR end synpred27_Grammer

	// $ANTLR start synpred28_Grammer
	public final void synpred28_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:81:35: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:81:35: END_OF_LINE
		{
		dbg.location(81,35);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred28_Grammer473); if (state.failed) return;
		}

	}
	// $ANTLR end synpred28_Grammer

	// $ANTLR start synpred30_Grammer
	public final void synpred30_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:82:51: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:82:51: END_OF_LINE
		{
		dbg.location(82,51);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred30_Grammer499); if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_Grammer

	// $ANTLR start synpred33_Grammer
	public final void synpred33_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:78: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:83:78: END_OF_LINE
		{
		dbg.location(83,78);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred33_Grammer540); if (state.failed) return;
		}

	}
	// $ANTLR end synpred33_Grammer

	// $ANTLR start synpred35_Grammer
	public final void synpred35_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:44: ( ELSE stmt )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:44: ELSE stmt
		{
		dbg.location(84,44);
		match(input,ELSE,FOLLOW_ELSE_in_synpred35_Grammer562); if (state.failed) return;dbg.location(84,49);
		pushFollow(FOLLOW_stmt_in_synpred35_Grammer564);
		stmt();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred35_Grammer

	// $ANTLR start synpred36_Grammer
	public final void synpred36_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:56: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:84:56: END_OF_LINE
		{
		dbg.location(84,56);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred36_Grammer568); if (state.failed) return;
		}

	}
	// $ANTLR end synpred36_Grammer

	// $ANTLR start synpred38_Grammer
	public final void synpred38_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:85:39: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:85:39: END_OF_LINE
		{
		dbg.location(85,39);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred38_Grammer587); if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_Grammer

	// $ANTLR start synpred39_Grammer
	public final void synpred39_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:37: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:37: END_OF_LINE
		{
		dbg.location(89,37);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred39_Grammer616); if (state.failed) return;
		}

	}
	// $ANTLR end synpred39_Grammer

	// $ANTLR start synpred40_Grammer
	public final void synpred40_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:8: ( ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )* )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:8: ELSEIF POPEN exp PCLOSE stmt ( END_OF_LINE )*
		{
		dbg.location(89,8);
		match(input,ELSEIF,FOLLOW_ELSEIF_in_synpred40_Grammer606); if (state.failed) return;dbg.location(89,15);
		match(input,POPEN,FOLLOW_POPEN_in_synpred40_Grammer608); if (state.failed) return;dbg.location(89,21);
		pushFollow(FOLLOW_exp_in_synpred40_Grammer610);
		exp();
		state._fsp--;
		if (state.failed) return;dbg.location(89,25);
		match(input,PCLOSE,FOLLOW_PCLOSE_in_synpred40_Grammer612); if (state.failed) return;dbg.location(89,32);
		pushFollow(FOLLOW_stmt_in_synpred40_Grammer614);
		stmt();
		state._fsp--;
		if (state.failed) return;dbg.location(89,37);
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:37: ( END_OF_LINE )*
		try { dbg.enterSubRule(51);

		loop51:
		while (true) {
			int alt51=2;
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			int LA51_0 = input.LA(1);
			if ( (LA51_0==END_OF_LINE) ) {
				alt51=1;
			}

			} finally {dbg.exitDecision(51);}

			switch (alt51) {
			case 1 :
				dbg.enterAlt(1);

				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:89:37: END_OF_LINE
				{
				dbg.location(89,37);
				match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred40_Grammer616); if (state.failed) return;
				}
				break;

			default :
				break loop51;
			}
		}
		} finally {dbg.exitSubRule(51);}

		}

	}
	// $ANTLR end synpred40_Grammer

	// $ANTLR start synpred45_Grammer
	public final void synpred45_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:18: ( ( operator | relop | ASSIGN ) simpleExp )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:18: ( operator | relop | ASSIGN ) simpleExp
		{
		dbg.location(105,18);
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:18: ( operator | relop | ASSIGN )
		int alt52=3;
		try { dbg.enterSubRule(52);
		try { dbg.enterDecision(52, decisionCanBacktrack[52]);

		switch ( input.LA(1) ) {
		case AND:
		case DIV:
		case MUL:
		case OR:
		case REM:
		case SUB:
		case SUM:
			{
			alt52=1;
			}
			break;
		case EQUAL:
		case GE:
		case GREATER:
		case LE:
		case LOWER:
		case NOTEQUAL:
			{
			alt52=2;
			}
			break;
		case ASSIGN:
			{
			alt52=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 52, 0, input);
			dbg.recognitionException(nvae);
			throw nvae;
		}
		} finally {dbg.exitDecision(52);}

		switch (alt52) {
			case 1 :
				dbg.enterAlt(1);

				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:19: operator
				{
				dbg.location(105,19);
				pushFollow(FOLLOW_operator_in_synpred45_Grammer688);
				operator();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 2 :
				dbg.enterAlt(2);

				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:30: relop
				{
				dbg.location(105,30);
				pushFollow(FOLLOW_relop_in_synpred45_Grammer692);
				relop();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 3 :
				dbg.enterAlt(3);

				// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:38: ASSIGN
				{
				dbg.location(105,38);
				match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred45_Grammer696); if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(52);}
		dbg.location(105,46);
		pushFollow(FOLLOW_simpleExp_in_synpred45_Grammer699);
		simpleExp();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred45_Grammer

	// $ANTLR start synpred46_Grammer
	public final void synpred46_Grammer_fragment() throws RecognitionException {
		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:58: ( END_OF_LINE )
		dbg.enterAlt(1);

		// D:\\Mahta\\compiler\\phase 2\\40117733_40117573_40118813\\Grammer.g:105:58: END_OF_LINE
		{
		dbg.location(105,58);
		match(input,END_OF_LINE,FOLLOW_END_OF_LINE_in_synpred46_Grammer703); if (state.failed) return;
		}

	}
	// $ANTLR end synpred46_Grammer

	// Delegated rules

	public final boolean synpred16_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred16_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred30_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred30_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred23_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred39_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred39_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred46_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred45_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred26_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred22_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred27_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred18_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred28_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred28_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred35_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred36_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred36_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred20_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred33_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred40_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred10_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred38_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred15_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Grammer() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred24_Grammer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA16_eotS =
		"\4\uffff";
	static final String DFA16_eofS =
		"\2\2\2\uffff";
	static final String DFA16_minS =
		"\2\13\2\uffff";
	static final String DFA16_maxS =
		"\2\76\2\uffff";
	static final String DFA16_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA16_specialS =
		"\4\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1\7\uffff\2\3\1\uffff\1\3\4\uffff\2\3\1\uffff\1\3\6\uffff\1\3\2\uffff"+
			"\1\3\3\uffff\2\3\1\uffff\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\2\1\3"+
			"\3\uffff\1\3\1\2",
			"\1\1\54\uffff\1\2\4\uffff\1\3\1\2",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 73:7: ( stmt )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_program_in_start37 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declist_in_program53 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_MAIN_in_program55 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_program57 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_program59 = new BitSet(new long[]{0x2000000000000800L});
	public static final BitSet FOLLOW_block_in_program61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec_in_declist79 = new BitSet(new long[]{0x0000000008800802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_declist81 = new BitSet(new long[]{0x0000000008800802L});
	public static final BitSet FOLLOW_vardec_in_dec102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdec_in_dec110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_iddec160 = new BitSet(new long[]{0x0000000400000022L});
	public static final BitSet FOLLOW_LSB_in_iddec164 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_iddec166 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RSB_in_iddec168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_iddec174 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_iddec176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iddec_in_idlist196 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_idlist199 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_iddec_in_idlist201 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_idlist_in_vardec220 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_vardec222 = new BitSet(new long[]{0x0000000080200040L});
	public static final BitSet FOLLOW_type_in_vardec224 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_vardec226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_funcdec243 = new BitSet(new long[]{0x0000100008000000L});
	public static final BitSet FOLLOW_ID_in_funcdec247 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_funcdec249 = new BitSet(new long[]{0x0000080008000000L});
	public static final BitSet FOLLOW_paramdecs_in_funcdec251 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_funcdec253 = new BitSet(new long[]{0x2000000000000800L});
	public static final BitSet FOLLOW_POPEN_in_funcdec259 = new BitSet(new long[]{0x0000080008000000L});
	public static final BitSet FOLLOW_paramdecs_in_funcdec261 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_funcdec263 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_funcdec265 = new BitSet(new long[]{0x0000000080200040L});
	public static final BitSet FOLLOW_type_in_funcdec267 = new BitSet(new long[]{0x2000000000000800L});
	public static final BitSet FOLLOW_block_in_funcdec271 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_funcdec273 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_paramdecslist_in_paramdecs291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramdec_in_paramdecslist309 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_paramdecslist312 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_paramdec_in_paramdecslist314 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_ID_in_paramdec333 = new BitSet(new long[]{0x1000000400000000L});
	public static final BitSet FOLLOW_LSB_in_paramdec336 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RSB_in_paramdec338 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_paramdec342 = new BitSet(new long[]{0x0000000080200040L});
	public static final BitSet FOLLOW_type_in_paramdec344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_block361 = new BitSet(new long[]{0x2000000000000800L});
	public static final BitSet FOLLOW_61_in_block364 = new BitSet(new long[]{0x6228B12058580800L});
	public static final BitSet FOLLOW_END_OF_LINE_in_block366 = new BitSet(new long[]{0x6228B12058580800L});
	public static final BitSet FOLLOW_stmtlist_in_block369 = new BitSet(new long[]{0x4000000000000800L});
	public static final BitSet FOLLOW_END_OF_LINE_in_block372 = new BitSet(new long[]{0x4000000000000800L});
	public static final BitSet FOLLOW_62_in_block375 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_block377 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_stmt_in_stmtlist395 = new BitSet(new long[]{0x2228B12058580802L});
	public static final BitSet FOLLOW_RETURN_in_stmt413 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt415 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt417 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt419 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_exp_in_stmt428 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt430 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt432 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_block_in_stmt441 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt443 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_vardec_in_stmt452 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt454 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_WHILE_in_stmt463 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_stmt465 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt467 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_stmt469 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_stmt471 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt473 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ON_in_stmt483 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_stmt485 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt487 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_stmt489 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_stmt491 = new BitSet(new long[]{0x4100000000000000L});
	public static final BitSet FOLLOW_cases_in_stmt493 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_stmt495 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt497 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt499 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_FOR_in_stmt508 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_stmt510 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt514 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt516 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt518 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt520 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt522 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_stmt528 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IN_in_stmt530 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ID_in_stmt532 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_stmt536 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_stmt538 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt540 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_IF_in_stmt549 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_stmt551 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_stmt553 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_stmt555 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_stmt557 = new BitSet(new long[]{0x0000000000000E00L});
	public static final BitSet FOLLOW_elseiflist_in_stmt559 = new BitSet(new long[]{0x0000000000000A02L});
	public static final BitSet FOLLOW_ELSE_in_stmt562 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_stmt564 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt568 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_PRINT_in_stmt577 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_stmt579 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ID_in_stmt581 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_stmt583 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stmt585 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_stmt587 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ELSEIF_in_elseiflist606 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_elseiflist608 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_elseiflist610 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_elseiflist612 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_elseiflist614 = new BitSet(new long[]{0x0000000000000C02L});
	public static final BitSet FOLLOW_END_OF_LINE_in_elseiflist616 = new BitSet(new long[]{0x0000000000000C02L});
	public static final BitSet FOLLOW_case1_in_cases636 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_WHERE_in_case1654 = new BitSet(new long[]{0x0020000040180000L});
	public static final BitSet FOLLOW_const1_in_case1656 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_case1658 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmtlist_in_case1660 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_case1662 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_simpleExp_in_exp684 = new BitSet(new long[]{0x0018425303001932L});
	public static final BitSet FOLLOW_operator_in_exp688 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_relop_in_exp692 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_ASSIGN_in_exp696 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_simpleExp_in_exp699 = new BitSet(new long[]{0x0018425303001932L});
	public static final BitSet FOLLOW_END_OF_LINE_in_exp703 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_const1_in_simpleExp721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_simpleExp729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleExp737 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_simpleExp739 = new BitSet(new long[]{0x0028182048180000L});
	public static final BitSet FOLLOW_explist_in_simpleExp741 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_simpleExp744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POPEN_in_simpleExp752 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_simpleExp754 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_simpleExp756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_simpleExp764 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_simpleExp766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleExp774 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_simpleExp776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_explist960 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_explist963 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_explist965 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_ID_in_lvalue984 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_LSB_in_lvalue987 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_lvalue989 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RSB_in_lvalue991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred10_Grammer273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred15_Grammer366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmtlist_in_synpred16_Grammer369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred18_Grammer377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred20_Grammer419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred22_Grammer432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred23_Grammer428 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred23_Grammer430 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred23_Grammer432 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred24_Grammer443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred26_Grammer454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardec_in_synpred27_Grammer452 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred27_Grammer454 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred28_Grammer473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred30_Grammer499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred33_Grammer540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred35_Grammer562 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_synpred35_Grammer564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred36_Grammer568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred38_Grammer587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred39_Grammer616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSEIF_in_synpred40_Grammer606 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_POPEN_in_synpred40_Grammer608 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_exp_in_synpred40_Grammer610 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_PCLOSE_in_synpred40_Grammer612 = new BitSet(new long[]{0x2228B12058580800L});
	public static final BitSet FOLLOW_stmt_in_synpred40_Grammer614 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred40_Grammer616 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_operator_in_synpred45_Grammer688 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_relop_in_synpred45_Grammer692 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred45_Grammer696 = new BitSet(new long[]{0x0028102048180000L});
	public static final BitSet FOLLOW_simpleExp_in_synpred45_Grammer699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_OF_LINE_in_synpred46_Grammer703 = new BitSet(new long[]{0x0000000000000002L});
}
