package ru.iaie.reflex.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ru.iaie.reflex.services.ReflexGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReflexParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TACT", "RULE_INT", "RULE_REG_SIZE", "RULE_VOID_C_TYPE", "RULE_FLOAT_C_TYPE", "RULE_DOUBLE_C_TYPE", "RULE_SHORT_C_TYPE", "RULE_INT_C_TYPE", "RULE_LONG_C_TYPE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'{'", "'}'", "'proc'", "'state'", "'('", "','", "')'", "';'", "'const'", "'enum'", "'='", "'expr'", "'input'", "'output'", "'signed'", "'unsigned'"
    };
    public static final int RULE_STRING=14;
    public static final int RULE_REG_SIZE=7;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_FLOAT_C_TYPE=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_VOID_C_TYPE=8;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_DOUBLE_C_TYPE=10;
    public static final int RULE_TACT=5;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_INT_C_TYPE=12;
    public static final int RULE_SHORT_C_TYPE=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_LONG_C_TYPE=13;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReflexParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReflexParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReflexParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReflex.g"; }



     	private ReflexGrammarAccess grammarAccess;

        public InternalReflexParser(TokenStream input, ReflexGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected ReflexGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalReflex.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalReflex.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalReflex.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalReflex.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ticks_3_0= RULE_TACT ) )? ( (lv_consts_4_0= ruleConst ) )* ( (lv_enums_5_0= ruleEnum ) )* ( (lv_functions_6_0= ruleFunction ) )* ( (lv_registers_7_0= ruleRegister ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_ticks_3_0=null;
        Token otherlv_9=null;
        EObject lv_consts_4_0 = null;

        EObject lv_enums_5_0 = null;

        EObject lv_functions_6_0 = null;

        EObject lv_registers_7_0 = null;

        EObject lv_processes_8_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:78:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ticks_3_0= RULE_TACT ) )? ( (lv_consts_4_0= ruleConst ) )* ( (lv_enums_5_0= ruleEnum ) )* ( (lv_functions_6_0= ruleFunction ) )* ( (lv_registers_7_0= ruleRegister ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= '}' ) )
            // InternalReflex.g:79:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ticks_3_0= RULE_TACT ) )? ( (lv_consts_4_0= ruleConst ) )* ( (lv_enums_5_0= ruleEnum ) )* ( (lv_functions_6_0= ruleFunction ) )* ( (lv_registers_7_0= ruleRegister ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= '}' )
            {
            // InternalReflex.g:79:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ticks_3_0= RULE_TACT ) )? ( (lv_consts_4_0= ruleConst ) )* ( (lv_enums_5_0= ruleEnum ) )* ( (lv_functions_6_0= ruleFunction ) )* ( (lv_registers_7_0= ruleRegister ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= '}' )
            // InternalReflex.g:80:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ticks_3_0= RULE_TACT ) )? ( (lv_consts_4_0= ruleConst ) )* ( (lv_enums_5_0= ruleEnum ) )* ( (lv_functions_6_0= ruleFunction ) )* ( (lv_registers_7_0= ruleRegister ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalReflex.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflex.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflex.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalReflex.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalReflex.g:106:3: ( (lv_ticks_3_0= RULE_TACT ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_TACT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalReflex.g:107:4: (lv_ticks_3_0= RULE_TACT )
                    {
                    // InternalReflex.g:107:4: (lv_ticks_3_0= RULE_TACT )
                    // InternalReflex.g:108:5: lv_ticks_3_0= RULE_TACT
                    {
                    lv_ticks_3_0=(Token)match(input,RULE_TACT,FOLLOW_6); 

                    					newLeafNode(lv_ticks_3_0, grammarAccess.getProgramAccess().getTicksTactTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProgramRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"ticks",
                    						true,
                    						"ru.iaie.reflex.Reflex.Tact");
                    				

                    }


                    }
                    break;

            }

            // InternalReflex.g:124:3: ( (lv_consts_4_0= ruleConst ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReflex.g:125:4: (lv_consts_4_0= ruleConst )
            	    {
            	    // InternalReflex.g:125:4: (lv_consts_4_0= ruleConst )
            	    // InternalReflex.g:126:5: lv_consts_4_0= ruleConst
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getConstsConstParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_consts_4_0=ruleConst();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"consts",
            	    						lv_consts_4_0,
            	    						"ru.iaie.reflex.Reflex.Const");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalReflex.g:143:3: ( (lv_enums_5_0= ruleEnum ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReflex.g:144:4: (lv_enums_5_0= ruleEnum )
            	    {
            	    // InternalReflex.g:144:4: (lv_enums_5_0= ruleEnum )
            	    // InternalReflex.g:145:5: lv_enums_5_0= ruleEnum
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getEnumsEnumParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_enums_5_0=ruleEnum();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"enums",
            	    						lv_enums_5_0,
            	    						"ru.iaie.reflex.Reflex.Enum");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalReflex.g:162:3: ( (lv_functions_6_0= ruleFunction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_VOID_C_TYPE && LA4_0<=RULE_LONG_C_TYPE)||(LA4_0>=34 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalReflex.g:163:4: (lv_functions_6_0= ruleFunction )
            	    {
            	    // InternalReflex.g:163:4: (lv_functions_6_0= ruleFunction )
            	    // InternalReflex.g:164:5: lv_functions_6_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_functions_6_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_6_0,
            	    						"ru.iaie.reflex.Reflex.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalReflex.g:181:3: ( (lv_registers_7_0= ruleRegister ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=32 && LA5_0<=33)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReflex.g:182:4: (lv_registers_7_0= ruleRegister )
            	    {
            	    // InternalReflex.g:182:4: (lv_registers_7_0= ruleRegister )
            	    // InternalReflex.g:183:5: lv_registers_7_0= ruleRegister
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getRegistersRegisterParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_registers_7_0=ruleRegister();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"registers",
            	    						lv_registers_7_0,
            	    						"ru.iaie.reflex.Reflex.Register");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalReflex.g:200:3: ( (lv_processes_8_0= ruleProcess ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReflex.g:201:4: (lv_processes_8_0= ruleProcess )
            	    {
            	    // InternalReflex.g:201:4: (lv_processes_8_0= ruleProcess )
            	    // InternalReflex.g:202:5: lv_processes_8_0= ruleProcess
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getProcessesProcessParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_processes_8_0=ruleProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processes",
            	    						lv_processes_8_0,
            	    						"ru.iaie.reflex.Reflex.Process");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProcess"
    // InternalReflex.g:227:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalReflex.g:227:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalReflex.g:228:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalReflex.g:234:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_states_3_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:240:2: ( (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '}' ) )
            // InternalReflex.g:241:2: (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '}' )
            {
            // InternalReflex.g:241:2: (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '}' )
            // InternalReflex.g:242:3: otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleState ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcKeyword_0());
            		
            // InternalReflex.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflex.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflex.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalReflex.g:248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalReflex.g:268:3: ( (lv_states_3_0= ruleState ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReflex.g:269:4: (lv_states_3_0= ruleState )
            	    {
            	    // InternalReflex.g:269:4: (lv_states_3_0= ruleState )
            	    // InternalReflex.g:270:5: lv_states_3_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getStatesStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_3_0,
            	    						"ru.iaie.reflex.Reflex.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleState"
    // InternalReflex.g:295:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReflex.g:295:46: (iv_ruleState= ruleState EOF )
            // InternalReflex.g:296:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReflex.g:302:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalReflex.g:308:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalReflex.g:309:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalReflex.g:309:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalReflex.g:310:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalReflex.g:314:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflex.g:315:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflex.g:315:4: (lv_name_1_0= RULE_ID )
            // InternalReflex.g:316:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFunction"
    // InternalReflex.g:344:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalReflex.g:344:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalReflex.g:345:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalReflex.g:351:1: ruleFunction returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleCType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argTypes_3_0= ruleCType ) ) (otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) ) )* otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_returnType_0_0 = null;

        EObject lv_argTypes_3_0 = null;

        EObject lv_argTypes_5_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:357:2: ( ( ( (lv_returnType_0_0= ruleCType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argTypes_3_0= ruleCType ) ) (otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) ) )* otherlv_6= ')' otherlv_7= ';' ) )
            // InternalReflex.g:358:2: ( ( (lv_returnType_0_0= ruleCType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argTypes_3_0= ruleCType ) ) (otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) ) )* otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalReflex.g:358:2: ( ( (lv_returnType_0_0= ruleCType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argTypes_3_0= ruleCType ) ) (otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) ) )* otherlv_6= ')' otherlv_7= ';' )
            // InternalReflex.g:359:3: ( (lv_returnType_0_0= ruleCType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argTypes_3_0= ruleCType ) ) (otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) ) )* otherlv_6= ')' otherlv_7= ';'
            {
            // InternalReflex.g:359:3: ( (lv_returnType_0_0= ruleCType ) )
            // InternalReflex.g:360:4: (lv_returnType_0_0= ruleCType )
            {
            // InternalReflex.g:360:4: (lv_returnType_0_0= ruleCType )
            // InternalReflex.g:361:5: lv_returnType_0_0= ruleCType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeCTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_returnType_0_0=ruleCType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"ru.iaie.reflex.Reflex.CType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReflex.g:378:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflex.g:379:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflex.g:379:4: (lv_name_1_0= RULE_ID )
            // InternalReflex.g:380:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalReflex.g:400:3: ( (lv_argTypes_3_0= ruleCType ) )
            // InternalReflex.g:401:4: (lv_argTypes_3_0= ruleCType )
            {
            // InternalReflex.g:401:4: (lv_argTypes_3_0= ruleCType )
            // InternalReflex.g:402:5: lv_argTypes_3_0= ruleCType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getArgTypesCTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_argTypes_3_0=ruleCType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					add(
            						current,
            						"argTypes",
            						lv_argTypes_3_0,
            						"ru.iaie.reflex.Reflex.CType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReflex.g:419:3: (otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReflex.g:420:4: otherlv_4= ',' ( (lv_argTypes_5_0= ruleCType ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalReflex.g:424:4: ( (lv_argTypes_5_0= ruleCType ) )
            	    // InternalReflex.g:425:5: (lv_argTypes_5_0= ruleCType )
            	    {
            	    // InternalReflex.g:425:5: (lv_argTypes_5_0= ruleCType )
            	    // InternalReflex.g:426:6: lv_argTypes_5_0= ruleCType
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionAccess().getArgTypesCTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_argTypes_5_0=ruleCType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"argTypes",
            	    							lv_argTypes_5_0,
            	    							"ru.iaie.reflex.Reflex.CType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleRegister"
    // InternalReflex.g:456:1: entryRuleRegister returns [EObject current=null] : iv_ruleRegister= ruleRegister EOF ;
    public final EObject entryRuleRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegister = null;


        try {
            // InternalReflex.g:456:49: (iv_ruleRegister= ruleRegister EOF )
            // InternalReflex.g:457:2: iv_ruleRegister= ruleRegister EOF
            {
             newCompositeNode(grammarAccess.getRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegister=ruleRegister();

            state._fsp--;

             current =iv_ruleRegister; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegister"


    // $ANTLR start "ruleRegister"
    // InternalReflex.g:463:1: ruleRegister returns [EObject current=null] : ( ( (lv_type_0_0= ruleRegisterType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INT ) ) ( (lv_addr2_3_0= RULE_INT ) ) ( (lv_regSize_4_0= RULE_REG_SIZE ) ) ) ;
    public final EObject ruleRegister() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_addr1_2_0=null;
        Token lv_addr2_3_0=null;
        Token lv_regSize_4_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:469:2: ( ( ( (lv_type_0_0= ruleRegisterType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INT ) ) ( (lv_addr2_3_0= RULE_INT ) ) ( (lv_regSize_4_0= RULE_REG_SIZE ) ) ) )
            // InternalReflex.g:470:2: ( ( (lv_type_0_0= ruleRegisterType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INT ) ) ( (lv_addr2_3_0= RULE_INT ) ) ( (lv_regSize_4_0= RULE_REG_SIZE ) ) )
            {
            // InternalReflex.g:470:2: ( ( (lv_type_0_0= ruleRegisterType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INT ) ) ( (lv_addr2_3_0= RULE_INT ) ) ( (lv_regSize_4_0= RULE_REG_SIZE ) ) )
            // InternalReflex.g:471:3: ( (lv_type_0_0= ruleRegisterType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INT ) ) ( (lv_addr2_3_0= RULE_INT ) ) ( (lv_regSize_4_0= RULE_REG_SIZE ) )
            {
            // InternalReflex.g:471:3: ( (lv_type_0_0= ruleRegisterType ) )
            // InternalReflex.g:472:4: (lv_type_0_0= ruleRegisterType )
            {
            // InternalReflex.g:472:4: (lv_type_0_0= ruleRegisterType )
            // InternalReflex.g:473:5: lv_type_0_0= ruleRegisterType
            {

            					newCompositeNode(grammarAccess.getRegisterAccess().getTypeRegisterTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleRegisterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegisterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"ru.iaie.reflex.Reflex.RegisterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReflex.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflex.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflex.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalReflex.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReflex.g:508:3: ( (lv_addr1_2_0= RULE_INT ) )
            // InternalReflex.g:509:4: (lv_addr1_2_0= RULE_INT )
            {
            // InternalReflex.g:509:4: (lv_addr1_2_0= RULE_INT )
            // InternalReflex.g:510:5: lv_addr1_2_0= RULE_INT
            {
            lv_addr1_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_addr1_2_0, grammarAccess.getRegisterAccess().getAddr1INTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"addr1",
            						lv_addr1_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalReflex.g:526:3: ( (lv_addr2_3_0= RULE_INT ) )
            // InternalReflex.g:527:4: (lv_addr2_3_0= RULE_INT )
            {
            // InternalReflex.g:527:4: (lv_addr2_3_0= RULE_INT )
            // InternalReflex.g:528:5: lv_addr2_3_0= RULE_INT
            {
            lv_addr2_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_addr2_3_0, grammarAccess.getRegisterAccess().getAddr2INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"addr2",
            						lv_addr2_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalReflex.g:544:3: ( (lv_regSize_4_0= RULE_REG_SIZE ) )
            // InternalReflex.g:545:4: (lv_regSize_4_0= RULE_REG_SIZE )
            {
            // InternalReflex.g:545:4: (lv_regSize_4_0= RULE_REG_SIZE )
            // InternalReflex.g:546:5: lv_regSize_4_0= RULE_REG_SIZE
            {
            lv_regSize_4_0=(Token)match(input,RULE_REG_SIZE,FOLLOW_2); 

            					newLeafNode(lv_regSize_4_0, grammarAccess.getRegisterAccess().getRegSizeREG_SIZETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"regSize",
            						lv_regSize_4_0,
            						"ru.iaie.reflex.Reflex.REG_SIZE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegister"


    // $ANTLR start "entryRuleConst"
    // InternalReflex.g:566:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalReflex.g:566:46: (iv_ruleConst= ruleConst EOF )
            // InternalReflex.g:567:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalReflex.g:573:1: ruleConst returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constId_1_0= RULE_ID ) ) ( (lv_constValue_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constId_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_constValue_2_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:579:2: ( (otherlv_0= 'const' ( (lv_constId_1_0= RULE_ID ) ) ( (lv_constValue_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalReflex.g:580:2: (otherlv_0= 'const' ( (lv_constId_1_0= RULE_ID ) ) ( (lv_constValue_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalReflex.g:580:2: (otherlv_0= 'const' ( (lv_constId_1_0= RULE_ID ) ) ( (lv_constValue_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalReflex.g:581:3: otherlv_0= 'const' ( (lv_constId_1_0= RULE_ID ) ) ( (lv_constValue_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstAccess().getConstKeyword_0());
            		
            // InternalReflex.g:585:3: ( (lv_constId_1_0= RULE_ID ) )
            // InternalReflex.g:586:4: (lv_constId_1_0= RULE_ID )
            {
            // InternalReflex.g:586:4: (lv_constId_1_0= RULE_ID )
            // InternalReflex.g:587:5: lv_constId_1_0= RULE_ID
            {
            lv_constId_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_constId_1_0, grammarAccess.getConstAccess().getConstIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstRule());
            					}
            					setWithLastConsumed(
            						current,
            						"constId",
            						lv_constId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReflex.g:603:3: ( (lv_constValue_2_0= ruleExpression ) )
            // InternalReflex.g:604:4: (lv_constValue_2_0= ruleExpression )
            {
            // InternalReflex.g:604:4: (lv_constValue_2_0= ruleExpression )
            // InternalReflex.g:605:5: lv_constValue_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConstAccess().getConstValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_constValue_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstRule());
            					}
            					set(
            						current,
            						"constValue",
            						lv_constValue_2_0,
            						"ru.iaie.reflex.Reflex.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleEnum"
    // InternalReflex.g:630:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalReflex.g:630:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalReflex.g:631:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalReflex.g:637:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_enumMembers_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_enumMembers_1_0 = null;

        EObject lv_enumMembers_3_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:643:2: ( (otherlv_0= 'enum' ( (lv_enumMembers_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) ) )* ) )
            // InternalReflex.g:644:2: (otherlv_0= 'enum' ( (lv_enumMembers_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) ) )* )
            {
            // InternalReflex.g:644:2: (otherlv_0= 'enum' ( (lv_enumMembers_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) ) )* )
            // InternalReflex.g:645:3: otherlv_0= 'enum' ( (lv_enumMembers_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalReflex.g:649:3: ( (lv_enumMembers_1_0= ruleEnumMember ) )
            // InternalReflex.g:650:4: (lv_enumMembers_1_0= ruleEnumMember )
            {
            // InternalReflex.g:650:4: (lv_enumMembers_1_0= ruleEnumMember )
            // InternalReflex.g:651:5: lv_enumMembers_1_0= ruleEnumMember
            {

            					newCompositeNode(grammarAccess.getEnumAccess().getEnumMembersEnumMemberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_enumMembers_1_0=ruleEnumMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRule());
            					}
            					add(
            						current,
            						"enumMembers",
            						lv_enumMembers_1_0,
            						"ru.iaie.reflex.Reflex.EnumMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReflex.g:668:3: (otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalReflex.g:669:4: otherlv_2= ',' ( (lv_enumMembers_3_0= ruleEnumMember ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalReflex.g:673:4: ( (lv_enumMembers_3_0= ruleEnumMember ) )
            	    // InternalReflex.g:674:5: (lv_enumMembers_3_0= ruleEnumMember )
            	    {
            	    // InternalReflex.g:674:5: (lv_enumMembers_3_0= ruleEnumMember )
            	    // InternalReflex.g:675:6: lv_enumMembers_3_0= ruleEnumMember
            	    {

            	    						newCompositeNode(grammarAccess.getEnumAccess().getEnumMembersEnumMemberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_enumMembers_3_0=ruleEnumMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enumMembers",
            	    							lv_enumMembers_3_0,
            	    							"ru.iaie.reflex.Reflex.EnumMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumMember"
    // InternalReflex.g:697:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // InternalReflex.g:697:51: (iv_ruleEnumMember= ruleEnumMember EOF )
            // InternalReflex.g:698:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             newCompositeNode(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // InternalReflex.g:704:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:710:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalReflex.g:711:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalReflex.g:711:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalReflex.g:712:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalReflex.g:712:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReflex.g:713:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReflex.g:713:4: (lv_name_0_0= RULE_ID )
            // InternalReflex.g:714:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1());
            		
            // InternalReflex.g:734:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalReflex.g:735:4: (lv_value_2_0= ruleExpression )
            {
            // InternalReflex.g:735:4: (lv_value_2_0= ruleExpression )
            // InternalReflex.g:736:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEnumMemberAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ru.iaie.reflex.Reflex.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleExpression"
    // InternalReflex.g:757:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalReflex.g:757:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalReflex.g:758:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalReflex.g:764:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'expr' ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReflex.g:770:2: (kw= 'expr' )
            // InternalReflex.g:771:2: kw= 'expr'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getExpressionAccess().getExprKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCType"
    // InternalReflex.g:779:1: entryRuleCType returns [EObject current=null] : iv_ruleCType= ruleCType EOF ;
    public final EObject entryRuleCType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCType = null;


        try {
            // InternalReflex.g:779:46: (iv_ruleCType= ruleCType EOF )
            // InternalReflex.g:780:2: iv_ruleCType= ruleCType EOF
            {
             newCompositeNode(grammarAccess.getCTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCType=ruleCType();

            state._fsp--;

             current =iv_ruleCType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCType"


    // $ANTLR start "ruleCType"
    // InternalReflex.g:786:1: ruleCType returns [EObject current=null] : ( ( () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE ) | ( () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE ) | ( () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE ) | ( () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE ) ) ) ;
    public final EObject ruleCType() throws RecognitionException {
        EObject current = null;

        Token this_VOID_C_TYPE_1=null;
        Token this_FLOAT_C_TYPE_3=null;
        Token this_DOUBLE_C_TYPE_5=null;
        Token this_SHORT_C_TYPE_8=null;
        Token this_INT_C_TYPE_9=null;
        Token this_LONG_C_TYPE_10=null;
        Enumerator lv_signSpec_7_0 = null;



        	enterRule();

        try {
            // InternalReflex.g:792:2: ( ( ( () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE ) | ( () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE ) | ( () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE ) | ( () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE ) ) ) )
            // InternalReflex.g:793:2: ( ( () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE ) | ( () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE ) | ( () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE ) | ( () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE ) ) )
            {
            // InternalReflex.g:793:2: ( ( () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE ) | ( () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE ) | ( () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE ) | ( () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_VOID_C_TYPE:
                {
                alt12=1;
                }
                break;
            case RULE_FLOAT_C_TYPE:
                {
                alt12=2;
                }
                break;
            case RULE_DOUBLE_C_TYPE:
                {
                alt12=3;
                }
                break;
            case RULE_SHORT_C_TYPE:
            case RULE_INT_C_TYPE:
            case RULE_LONG_C_TYPE:
            case 34:
            case 35:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalReflex.g:794:3: ( () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE )
                    {
                    // InternalReflex.g:794:3: ( () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE )
                    // InternalReflex.g:795:4: () this_VOID_C_TYPE_1= RULE_VOID_C_TYPE
                    {
                    // InternalReflex.g:795:4: ()
                    // InternalReflex.g:796:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCTypeAccess().getCTypeAction_0_0(),
                    						current);
                    				

                    }

                    this_VOID_C_TYPE_1=(Token)match(input,RULE_VOID_C_TYPE,FOLLOW_2); 

                    				newLeafNode(this_VOID_C_TYPE_1, grammarAccess.getCTypeAccess().getVOID_C_TYPETerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReflex.g:808:3: ( () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE )
                    {
                    // InternalReflex.g:808:3: ( () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE )
                    // InternalReflex.g:809:4: () this_FLOAT_C_TYPE_3= RULE_FLOAT_C_TYPE
                    {
                    // InternalReflex.g:809:4: ()
                    // InternalReflex.g:810:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCTypeAccess().getCTypeAction_1_0(),
                    						current);
                    				

                    }

                    this_FLOAT_C_TYPE_3=(Token)match(input,RULE_FLOAT_C_TYPE,FOLLOW_2); 

                    				newLeafNode(this_FLOAT_C_TYPE_3, grammarAccess.getCTypeAccess().getFLOAT_C_TYPETerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReflex.g:822:3: ( () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE )
                    {
                    // InternalReflex.g:822:3: ( () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE )
                    // InternalReflex.g:823:4: () this_DOUBLE_C_TYPE_5= RULE_DOUBLE_C_TYPE
                    {
                    // InternalReflex.g:823:4: ()
                    // InternalReflex.g:824:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCTypeAccess().getCTypeAction_2_0(),
                    						current);
                    				

                    }

                    this_DOUBLE_C_TYPE_5=(Token)match(input,RULE_DOUBLE_C_TYPE,FOLLOW_2); 

                    				newLeafNode(this_DOUBLE_C_TYPE_5, grammarAccess.getCTypeAccess().getDOUBLE_C_TYPETerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReflex.g:836:3: ( () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE ) )
                    {
                    // InternalReflex.g:836:3: ( () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE ) )
                    // InternalReflex.g:837:4: () ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )? (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE )
                    {
                    // InternalReflex.g:837:4: ()
                    // InternalReflex.g:838:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCTypeAccess().getCTypeAction_3_0(),
                    						current);
                    				

                    }

                    // InternalReflex.g:844:4: ( (lv_signSpec_7_0= ruleCTypeSignSpec ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalReflex.g:845:5: (lv_signSpec_7_0= ruleCTypeSignSpec )
                            {
                            // InternalReflex.g:845:5: (lv_signSpec_7_0= ruleCTypeSignSpec )
                            // InternalReflex.g:846:6: lv_signSpec_7_0= ruleCTypeSignSpec
                            {

                            						newCompositeNode(grammarAccess.getCTypeAccess().getSignSpecCTypeSignSpecEnumRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_22);
                            lv_signSpec_7_0=ruleCTypeSignSpec();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCTypeRule());
                            						}
                            						set(
                            							current,
                            							"signSpec",
                            							true,
                            							"ru.iaie.reflex.Reflex.CTypeSignSpec");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalReflex.g:863:4: (this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE | this_INT_C_TYPE_9= RULE_INT_C_TYPE | this_LONG_C_TYPE_10= RULE_LONG_C_TYPE )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case RULE_SHORT_C_TYPE:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_INT_C_TYPE:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_LONG_C_TYPE:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalReflex.g:864:5: this_SHORT_C_TYPE_8= RULE_SHORT_C_TYPE
                            {
                            this_SHORT_C_TYPE_8=(Token)match(input,RULE_SHORT_C_TYPE,FOLLOW_2); 

                            					newLeafNode(this_SHORT_C_TYPE_8, grammarAccess.getCTypeAccess().getSHORT_C_TYPETerminalRuleCall_3_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalReflex.g:869:5: this_INT_C_TYPE_9= RULE_INT_C_TYPE
                            {
                            this_INT_C_TYPE_9=(Token)match(input,RULE_INT_C_TYPE,FOLLOW_2); 

                            					newLeafNode(this_INT_C_TYPE_9, grammarAccess.getCTypeAccess().getINT_C_TYPETerminalRuleCall_3_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalReflex.g:874:5: this_LONG_C_TYPE_10= RULE_LONG_C_TYPE
                            {
                            this_LONG_C_TYPE_10=(Token)match(input,RULE_LONG_C_TYPE,FOLLOW_2); 

                            					newLeafNode(this_LONG_C_TYPE_10, grammarAccess.getCTypeAccess().getLONG_C_TYPETerminalRuleCall_3_2_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCType"


    // $ANTLR start "ruleRegisterType"
    // InternalReflex.g:884:1: ruleRegisterType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) ) ;
    public final Enumerator ruleRegisterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReflex.g:890:2: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) ) )
            // InternalReflex.g:891:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) )
            {
            // InternalReflex.g:891:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalReflex.g:892:3: (enumLiteral_0= 'input' )
                    {
                    // InternalReflex.g:892:3: (enumLiteral_0= 'input' )
                    // InternalReflex.g:893:4: enumLiteral_0= 'input'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getRegisterTypeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegisterTypeAccess().getINPUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReflex.g:900:3: (enumLiteral_1= 'output' )
                    {
                    // InternalReflex.g:900:3: (enumLiteral_1= 'output' )
                    // InternalReflex.g:901:4: enumLiteral_1= 'output'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRegisterTypeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegisterTypeAccess().getOUTPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegisterType"


    // $ANTLR start "ruleCTypeSignSpec"
    // InternalReflex.g:911:1: ruleCTypeSignSpec returns [Enumerator current=null] : ( (enumLiteral_0= 'signed' ) | (enumLiteral_1= 'unsigned' ) ) ;
    public final Enumerator ruleCTypeSignSpec() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReflex.g:917:2: ( ( (enumLiteral_0= 'signed' ) | (enumLiteral_1= 'unsigned' ) ) )
            // InternalReflex.g:918:2: ( (enumLiteral_0= 'signed' ) | (enumLiteral_1= 'unsigned' ) )
            {
            // InternalReflex.g:918:2: ( (enumLiteral_0= 'signed' ) | (enumLiteral_1= 'unsigned' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalReflex.g:919:3: (enumLiteral_0= 'signed' )
                    {
                    // InternalReflex.g:919:3: (enumLiteral_0= 'signed' )
                    // InternalReflex.g:920:4: enumLiteral_0= 'signed'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCTypeSignSpecAccess().getSIGNEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCTypeSignSpecAccess().getSIGNEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReflex.g:927:3: (enumLiteral_1= 'unsigned' )
                    {
                    // InternalReflex.g:927:3: (enumLiteral_1= 'unsigned' )
                    // InternalReflex.g:928:4: enumLiteral_1= 'unsigned'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCTypeSignSpecAccess().getUNSIGNEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCTypeSignSpecAccess().getUNSIGNEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCTypeSignSpec"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000F30603F20L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000F30603F00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000F20603F00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000F00603F00L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000300600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00003F00L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003800L});

}