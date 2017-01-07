package hu.bme.aut.protokit.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.aut.protokit.services.ProtokitDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtokitDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'protocol'", "'datatype'", "'{'", "'}'", "'transient'", "'*'", "':'", "'int'", "'('", "')'", "'string'", "'binary'", "'bitfield'", "'list'", "'length'", "','", "'count'", "'formatter'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProtokitDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProtokitDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProtokitDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProtokitDSL.g"; }



     	private ProtokitDSLGrammarAccess grammarAccess;

        public InternalProtokitDSLParser(TokenStream input, ProtokitDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProtocolModel";
       	}

       	@Override
       	protected ProtokitDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProtocolModel"
    // InternalProtokitDSL.g:64:1: entryRuleProtocolModel returns [EObject current=null] : iv_ruleProtocolModel= ruleProtocolModel EOF ;
    public final EObject entryRuleProtocolModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolModel = null;


        try {
            // InternalProtokitDSL.g:64:54: (iv_ruleProtocolModel= ruleProtocolModel EOF )
            // InternalProtokitDSL.g:65:2: iv_ruleProtocolModel= ruleProtocolModel EOF
            {
             newCompositeNode(grammarAccess.getProtocolModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocolModel=ruleProtocolModel();

            state._fsp--;

             current =iv_ruleProtocolModel; 
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
    // $ANTLR end "entryRuleProtocolModel"


    // $ANTLR start "ruleProtocolModel"
    // InternalProtokitDSL.g:71:1: ruleProtocolModel returns [EObject current=null] : ( (lv_datatypes_0_0= ruleDataType ) )+ ;
    public final EObject ruleProtocolModel() throws RecognitionException {
        EObject current = null;

        EObject lv_datatypes_0_0 = null;



        	enterRule();

        try {
            // InternalProtokitDSL.g:77:2: ( ( (lv_datatypes_0_0= ruleDataType ) )+ )
            // InternalProtokitDSL.g:78:2: ( (lv_datatypes_0_0= ruleDataType ) )+
            {
            // InternalProtokitDSL.g:78:2: ( (lv_datatypes_0_0= ruleDataType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProtokitDSL.g:79:3: (lv_datatypes_0_0= ruleDataType )
            	    {
            	    // InternalProtokitDSL.g:79:3: (lv_datatypes_0_0= ruleDataType )
            	    // InternalProtokitDSL.g:80:4: lv_datatypes_0_0= ruleDataType
            	    {

            	    				newCompositeNode(grammarAccess.getProtocolModelAccess().getDatatypesDataTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_datatypes_0_0=ruleDataType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProtocolModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"datatypes",
            	    					lv_datatypes_0_0,
            	    					"hu.bme.aut.protokit.ProtokitDSL.DataType");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleProtocolModel"


    // $ANTLR start "entryRuleDataType"
    // InternalProtokitDSL.g:100:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalProtokitDSL.g:100:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalProtokitDSL.g:101:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalProtokitDSL.g:107:1: ruleDataType returns [EObject current=null] : ( (otherlv_0= 'protocol' | otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleVariableDefinition ) )+ otherlv_5= '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalProtokitDSL.g:113:2: ( ( (otherlv_0= 'protocol' | otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleVariableDefinition ) )+ otherlv_5= '}' ) )
            // InternalProtokitDSL.g:114:2: ( (otherlv_0= 'protocol' | otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleVariableDefinition ) )+ otherlv_5= '}' )
            {
            // InternalProtokitDSL.g:114:2: ( (otherlv_0= 'protocol' | otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleVariableDefinition ) )+ otherlv_5= '}' )
            // InternalProtokitDSL.g:115:3: (otherlv_0= 'protocol' | otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fields_4_0= ruleVariableDefinition ) )+ otherlv_5= '}'
            {
            // InternalProtokitDSL.g:115:3: (otherlv_0= 'protocol' | otherlv_1= 'datatype' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProtokitDSL.g:116:4: otherlv_0= 'protocol'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getProtocolKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:121:4: otherlv_1= 'datatype'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProtokitDSL.g:126:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:127:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:127:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:128:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProtokitDSL.g:148:3: ( (lv_fields_4_0= ruleVariableDefinition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProtokitDSL.g:149:4: (lv_fields_4_0= ruleVariableDefinition )
            	    {
            	    // InternalProtokitDSL.g:149:4: (lv_fields_4_0= ruleVariableDefinition )
            	    // InternalProtokitDSL.g:150:5: lv_fields_4_0= ruleVariableDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getDataTypeAccess().getFieldsVariableDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_fields_4_0=ruleVariableDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_4_0,
            	    						"hu.bme.aut.protokit.ProtokitDSL.VariableDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalProtokitDSL.g:175:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalProtokitDSL.g:175:59: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalProtokitDSL.g:176:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalProtokitDSL.g:182:1: ruleVariableDefinition returns [EObject current=null] : (this_IntegerField_0= ruleIntegerField | this_StringField_1= ruleStringField | this_BinaryField_2= ruleBinaryField | this_BitField_3= ruleBitField | this_ListField_4= ruleListField | this_LengthField_5= ruleLengthField | this_CountField_6= ruleCountField | this_DataTypeField_7= ruleDataTypeField ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerField_0 = null;

        EObject this_StringField_1 = null;

        EObject this_BinaryField_2 = null;

        EObject this_BitField_3 = null;

        EObject this_ListField_4 = null;

        EObject this_LengthField_5 = null;

        EObject this_CountField_6 = null;

        EObject this_DataTypeField_7 = null;



        	enterRule();

        try {
            // InternalProtokitDSL.g:188:2: ( (this_IntegerField_0= ruleIntegerField | this_StringField_1= ruleStringField | this_BinaryField_2= ruleBinaryField | this_BitField_3= ruleBitField | this_ListField_4= ruleListField | this_LengthField_5= ruleLengthField | this_CountField_6= ruleCountField | this_DataTypeField_7= ruleDataTypeField ) )
            // InternalProtokitDSL.g:189:2: (this_IntegerField_0= ruleIntegerField | this_StringField_1= ruleStringField | this_BinaryField_2= ruleBinaryField | this_BitField_3= ruleBitField | this_ListField_4= ruleListField | this_LengthField_5= ruleLengthField | this_CountField_6= ruleCountField | this_DataTypeField_7= ruleDataTypeField )
            {
            // InternalProtokitDSL.g:189:2: (this_IntegerField_0= ruleIntegerField | this_StringField_1= ruleStringField | this_BinaryField_2= ruleBinaryField | this_BitField_3= ruleBitField | this_ListField_4= ruleListField | this_LengthField_5= ruleLengthField | this_CountField_6= ruleCountField | this_DataTypeField_7= ruleDataTypeField )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalProtokitDSL.g:190:3: this_IntegerField_0= ruleIntegerField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getIntegerFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerField_0=ruleIntegerField();

                    state._fsp--;


                    			current = this_IntegerField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:199:3: this_StringField_1= ruleStringField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getStringFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringField_1=ruleStringField();

                    state._fsp--;


                    			current = this_StringField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProtokitDSL.g:208:3: this_BinaryField_2= ruleBinaryField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBinaryFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryField_2=ruleBinaryField();

                    state._fsp--;


                    			current = this_BinaryField_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProtokitDSL.g:217:3: this_BitField_3= ruleBitField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBitFieldParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BitField_3=ruleBitField();

                    state._fsp--;


                    			current = this_BitField_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProtokitDSL.g:226:3: this_ListField_4= ruleListField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getListFieldParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListField_4=ruleListField();

                    state._fsp--;


                    			current = this_ListField_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalProtokitDSL.g:235:3: this_LengthField_5= ruleLengthField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getLengthFieldParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LengthField_5=ruleLengthField();

                    state._fsp--;


                    			current = this_LengthField_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalProtokitDSL.g:244:3: this_CountField_6= ruleCountField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getCountFieldParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountField_6=ruleCountField();

                    state._fsp--;


                    			current = this_CountField_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalProtokitDSL.g:253:3: this_DataTypeField_7= ruleDataTypeField
                    {

                    			newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDataTypeFieldParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataTypeField_7=ruleDataTypeField();

                    state._fsp--;


                    			current = this_DataTypeField_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleIntegerField"
    // InternalProtokitDSL.g:265:1: entryRuleIntegerField returns [EObject current=null] : iv_ruleIntegerField= ruleIntegerField EOF ;
    public final EObject entryRuleIntegerField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerField = null;


        try {
            // InternalProtokitDSL.g:265:53: (iv_ruleIntegerField= ruleIntegerField EOF )
            // InternalProtokitDSL.g:266:2: iv_ruleIntegerField= ruleIntegerField EOF
            {
             newCompositeNode(grammarAccess.getIntegerFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerField=ruleIntegerField();

            state._fsp--;

             current =iv_ruleIntegerField; 
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
    // $ANTLR end "entryRuleIntegerField"


    // $ANTLR start "ruleIntegerField"
    // InternalProtokitDSL.g:272:1: ruleIntegerField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'int' (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )? ) ;
    public final EObject ruleIntegerField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_byteLen_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:278:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'int' (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )? ) )
            // InternalProtokitDSL.g:279:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'int' (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )? )
            {
            // InternalProtokitDSL.g:279:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'int' (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )? )
            // InternalProtokitDSL.g:280:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'int' (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )?
            {
            // InternalProtokitDSL.g:280:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProtokitDSL.g:281:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:281:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:282:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getIntegerFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:294:3: ( (lv_identityField_1_0= '*' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProtokitDSL.g:295:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:295:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:296:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getIntegerFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:308:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:309:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:309:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:310:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIntegerFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegerFieldAccess().getIntKeyword_4());
            		
            // InternalProtokitDSL.g:334:3: (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProtokitDSL.g:335:4: otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntegerFieldAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalProtokitDSL.g:339:4: ( (lv_byteLen_6_0= RULE_INT ) )
                    // InternalProtokitDSL.g:340:5: (lv_byteLen_6_0= RULE_INT )
                    {
                    // InternalProtokitDSL.g:340:5: (lv_byteLen_6_0= RULE_INT )
                    // InternalProtokitDSL.g:341:6: lv_byteLen_6_0= RULE_INT
                    {
                    lv_byteLen_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_byteLen_6_0, grammarAccess.getIntegerFieldAccess().getByteLenINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"byteLen",
                    							lv_byteLen_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getIntegerFieldAccess().getRightParenthesisKeyword_5_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleIntegerField"


    // $ANTLR start "entryRuleStringField"
    // InternalProtokitDSL.g:366:1: entryRuleStringField returns [EObject current=null] : iv_ruleStringField= ruleStringField EOF ;
    public final EObject entryRuleStringField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringField = null;


        try {
            // InternalProtokitDSL.g:366:52: (iv_ruleStringField= ruleStringField EOF )
            // InternalProtokitDSL.g:367:2: iv_ruleStringField= ruleStringField EOF
            {
             newCompositeNode(grammarAccess.getStringFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringField=ruleStringField();

            state._fsp--;

             current =iv_ruleStringField; 
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
    // $ANTLR end "entryRuleStringField"


    // $ANTLR start "ruleStringField"
    // InternalProtokitDSL.g:373:1: ruleStringField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'string' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) ) )? ) ;
    public final EObject ruleStringField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_byteLen_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_unbounded_9_0=null;
        Token otherlv_10=null;
        EObject lv_formatter_11_0 = null;



        	enterRule();

        try {
            // InternalProtokitDSL.g:379:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'string' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) ) )? ) )
            // InternalProtokitDSL.g:380:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'string' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) ) )? )
            {
            // InternalProtokitDSL.g:380:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'string' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) ) )? )
            // InternalProtokitDSL.g:381:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'string' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) ) )?
            {
            // InternalProtokitDSL.g:381:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProtokitDSL.g:382:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:382:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:383:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getStringFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:395:3: ( (lv_identityField_1_0= '*' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProtokitDSL.g:396:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:396:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:397:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getStringFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:409:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:410:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:410:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:411:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStringFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getStringFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getStringFieldAccess().getStringKeyword_4());
            		
            // InternalProtokitDSL.g:435:3: ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT) ) {
                    alt11=1;
                }
                else if ( (LA11_1==16||LA11_1==20) ) {
                    alt11=2;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalProtokitDSL.g:436:4: (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )
                    {
                    // InternalProtokitDSL.g:436:4: (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )
                    // InternalProtokitDSL.g:437:5: otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getStringFieldAccess().getLeftParenthesisKeyword_5_0_0());
                    				
                    // InternalProtokitDSL.g:441:5: ( (lv_byteLen_6_0= RULE_INT ) )
                    // InternalProtokitDSL.g:442:6: (lv_byteLen_6_0= RULE_INT )
                    {
                    // InternalProtokitDSL.g:442:6: (lv_byteLen_6_0= RULE_INT )
                    // InternalProtokitDSL.g:443:7: lv_byteLen_6_0= RULE_INT
                    {
                    lv_byteLen_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    							newLeafNode(lv_byteLen_6_0, grammarAccess.getStringFieldAccess().getByteLenINTTerminalRuleCall_5_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getStringFieldRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"byteLen",
                    								lv_byteLen_6_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getStringFieldAccess().getRightParenthesisKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:465:4: (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) )
                    {
                    // InternalProtokitDSL.g:465:4: (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) ) )
                    // InternalProtokitDSL.g:466:5: otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ( (lv_formatter_11_0= ruleFormatter ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_15); 

                    					newLeafNode(otherlv_8, grammarAccess.getStringFieldAccess().getLeftParenthesisKeyword_5_1_0());
                    				
                    // InternalProtokitDSL.g:470:5: ( (lv_unbounded_9_0= '*' ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==16) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalProtokitDSL.g:471:6: (lv_unbounded_9_0= '*' )
                            {
                            // InternalProtokitDSL.g:471:6: (lv_unbounded_9_0= '*' )
                            // InternalProtokitDSL.g:472:7: lv_unbounded_9_0= '*'
                            {
                            lv_unbounded_9_0=(Token)match(input,16,FOLLOW_13); 

                            							newLeafNode(lv_unbounded_9_0, grammarAccess.getStringFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStringFieldRule());
                            							}
                            							setWithLastConsumed(current, "unbounded", true, "*");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_16); 

                    					newLeafNode(otherlv_10, grammarAccess.getStringFieldAccess().getRightParenthesisKeyword_5_1_2());
                    				
                    // InternalProtokitDSL.g:488:5: ( (lv_formatter_11_0= ruleFormatter ) )
                    // InternalProtokitDSL.g:489:6: (lv_formatter_11_0= ruleFormatter )
                    {
                    // InternalProtokitDSL.g:489:6: (lv_formatter_11_0= ruleFormatter )
                    // InternalProtokitDSL.g:490:7: lv_formatter_11_0= ruleFormatter
                    {

                    							newCompositeNode(grammarAccess.getStringFieldAccess().getFormatterFormatterParserRuleCall_5_1_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_formatter_11_0=ruleFormatter();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStringFieldRule());
                    							}
                    							set(
                    								current,
                    								"formatter",
                    								lv_formatter_11_0,
                    								"hu.bme.aut.protokit.ProtokitDSL.Formatter");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleStringField"


    // $ANTLR start "entryRuleBinaryField"
    // InternalProtokitDSL.g:513:1: entryRuleBinaryField returns [EObject current=null] : iv_ruleBinaryField= ruleBinaryField EOF ;
    public final EObject entryRuleBinaryField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryField = null;


        try {
            // InternalProtokitDSL.g:513:52: (iv_ruleBinaryField= ruleBinaryField EOF )
            // InternalProtokitDSL.g:514:2: iv_ruleBinaryField= ruleBinaryField EOF
            {
             newCompositeNode(grammarAccess.getBinaryFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryField=ruleBinaryField();

            state._fsp--;

             current =iv_ruleBinaryField; 
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
    // $ANTLR end "entryRuleBinaryField"


    // $ANTLR start "ruleBinaryField"
    // InternalProtokitDSL.g:520:1: ruleBinaryField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'binary' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ) ) ) ;
    public final EObject ruleBinaryField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_byteLen_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_unbounded_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:526:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'binary' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ) ) ) )
            // InternalProtokitDSL.g:527:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'binary' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ) ) )
            {
            // InternalProtokitDSL.g:527:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'binary' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ) ) )
            // InternalProtokitDSL.g:528:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'binary' ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ) )
            {
            // InternalProtokitDSL.g:528:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProtokitDSL.g:529:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:529:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:530:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getBinaryFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:542:3: ( (lv_identityField_1_0= '*' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProtokitDSL.g:543:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:543:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:544:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getBinaryFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:556:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:557:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:557:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:558:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBinaryFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getBinaryFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryFieldAccess().getBinaryKeyword_4());
            		
            // InternalProtokitDSL.g:582:3: ( (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' ) | (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_INT) ) {
                    alt15=1;
                }
                else if ( (LA15_1==16||LA15_1==20) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalProtokitDSL.g:583:4: (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )
                    {
                    // InternalProtokitDSL.g:583:4: (otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')' )
                    // InternalProtokitDSL.g:584:5: otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getBinaryFieldAccess().getLeftParenthesisKeyword_5_0_0());
                    				
                    // InternalProtokitDSL.g:588:5: ( (lv_byteLen_6_0= RULE_INT ) )
                    // InternalProtokitDSL.g:589:6: (lv_byteLen_6_0= RULE_INT )
                    {
                    // InternalProtokitDSL.g:589:6: (lv_byteLen_6_0= RULE_INT )
                    // InternalProtokitDSL.g:590:7: lv_byteLen_6_0= RULE_INT
                    {
                    lv_byteLen_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    							newLeafNode(lv_byteLen_6_0, grammarAccess.getBinaryFieldAccess().getByteLenINTTerminalRuleCall_5_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBinaryFieldRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"byteLen",
                    								lv_byteLen_6_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getBinaryFieldAccess().getRightParenthesisKeyword_5_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:612:4: (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' )
                    {
                    // InternalProtokitDSL.g:612:4: (otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')' )
                    // InternalProtokitDSL.g:613:5: otherlv_8= '(' ( (lv_unbounded_9_0= '*' ) )? otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_15); 

                    					newLeafNode(otherlv_8, grammarAccess.getBinaryFieldAccess().getLeftParenthesisKeyword_5_1_0());
                    				
                    // InternalProtokitDSL.g:617:5: ( (lv_unbounded_9_0= '*' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==16) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalProtokitDSL.g:618:6: (lv_unbounded_9_0= '*' )
                            {
                            // InternalProtokitDSL.g:618:6: (lv_unbounded_9_0= '*' )
                            // InternalProtokitDSL.g:619:7: lv_unbounded_9_0= '*'
                            {
                            lv_unbounded_9_0=(Token)match(input,16,FOLLOW_13); 

                            							newLeafNode(lv_unbounded_9_0, grammarAccess.getBinaryFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBinaryFieldRule());
                            							}
                            							setWithLastConsumed(current, "unbounded", true, "*");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getBinaryFieldAccess().getRightParenthesisKeyword_5_1_2());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleBinaryField"


    // $ANTLR start "entryRuleBitField"
    // InternalProtokitDSL.g:641:1: entryRuleBitField returns [EObject current=null] : iv_ruleBitField= ruleBitField EOF ;
    public final EObject entryRuleBitField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitField = null;


        try {
            // InternalProtokitDSL.g:641:49: (iv_ruleBitField= ruleBitField EOF )
            // InternalProtokitDSL.g:642:2: iv_ruleBitField= ruleBitField EOF
            {
             newCompositeNode(grammarAccess.getBitFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitField=ruleBitField();

            state._fsp--;

             current =iv_ruleBitField; 
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
    // $ANTLR end "entryRuleBitField"


    // $ANTLR start "ruleBitField"
    // InternalProtokitDSL.g:648:1: ruleBitField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'bitfield' otherlv_5= '{' ( (lv_components_6_0= ruleBitfieldComponent ) )+ otherlv_7= '}' ) ;
    public final EObject ruleBitField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_components_6_0 = null;



        	enterRule();

        try {
            // InternalProtokitDSL.g:654:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'bitfield' otherlv_5= '{' ( (lv_components_6_0= ruleBitfieldComponent ) )+ otherlv_7= '}' ) )
            // InternalProtokitDSL.g:655:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'bitfield' otherlv_5= '{' ( (lv_components_6_0= ruleBitfieldComponent ) )+ otherlv_7= '}' )
            {
            // InternalProtokitDSL.g:655:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'bitfield' otherlv_5= '{' ( (lv_components_6_0= ruleBitfieldComponent ) )+ otherlv_7= '}' )
            // InternalProtokitDSL.g:656:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'bitfield' otherlv_5= '{' ( (lv_components_6_0= ruleBitfieldComponent ) )+ otherlv_7= '}'
            {
            // InternalProtokitDSL.g:656:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProtokitDSL.g:657:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:657:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:658:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getBitFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBitFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:670:3: ( (lv_identityField_1_0= '*' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProtokitDSL.g:671:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:671:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:672:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getBitFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBitFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:684:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:685:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:685:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:686:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBitFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBitFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getBitFieldAccess().getBitfieldKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getBitFieldAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalProtokitDSL.g:714:3: ( (lv_components_6_0= ruleBitfieldComponent ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProtokitDSL.g:715:4: (lv_components_6_0= ruleBitfieldComponent )
            	    {
            	    // InternalProtokitDSL.g:715:4: (lv_components_6_0= ruleBitfieldComponent )
            	    // InternalProtokitDSL.g:716:5: lv_components_6_0= ruleBitfieldComponent
            	    {

            	    					newCompositeNode(grammarAccess.getBitFieldAccess().getComponentsBitfieldComponentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_components_6_0=ruleBitfieldComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBitFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_6_0,
            	    						"hu.bme.aut.protokit.ProtokitDSL.BitfieldComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBitFieldAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBitField"


    // $ANTLR start "entryRuleBitfieldComponent"
    // InternalProtokitDSL.g:741:1: entryRuleBitfieldComponent returns [EObject current=null] : iv_ruleBitfieldComponent= ruleBitfieldComponent EOF ;
    public final EObject entryRuleBitfieldComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitfieldComponent = null;


        try {
            // InternalProtokitDSL.g:741:58: (iv_ruleBitfieldComponent= ruleBitfieldComponent EOF )
            // InternalProtokitDSL.g:742:2: iv_ruleBitfieldComponent= ruleBitfieldComponent EOF
            {
             newCompositeNode(grammarAccess.getBitfieldComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitfieldComponent=ruleBitfieldComponent();

            state._fsp--;

             current =iv_ruleBitfieldComponent; 
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
    // $ANTLR end "entryRuleBitfieldComponent"


    // $ANTLR start "ruleBitfieldComponent"
    // InternalProtokitDSL.g:748:1: ruleBitfieldComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_bitLen_2_0= RULE_INT ) ) ) ;
    public final EObject ruleBitfieldComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bitLen_2_0=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:754:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_bitLen_2_0= RULE_INT ) ) ) )
            // InternalProtokitDSL.g:755:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_bitLen_2_0= RULE_INT ) ) )
            {
            // InternalProtokitDSL.g:755:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_bitLen_2_0= RULE_INT ) ) )
            // InternalProtokitDSL.g:756:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_bitLen_2_0= RULE_INT ) )
            {
            // InternalProtokitDSL.g:756:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProtokitDSL.g:757:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProtokitDSL.g:757:4: (lv_name_0_0= RULE_ID )
            // InternalProtokitDSL.g:758:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBitfieldComponentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitfieldComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBitfieldComponentAccess().getColonKeyword_1());
            		
            // InternalProtokitDSL.g:778:3: ( (lv_bitLen_2_0= RULE_INT ) )
            // InternalProtokitDSL.g:779:4: (lv_bitLen_2_0= RULE_INT )
            {
            // InternalProtokitDSL.g:779:4: (lv_bitLen_2_0= RULE_INT )
            // InternalProtokitDSL.g:780:5: lv_bitLen_2_0= RULE_INT
            {
            lv_bitLen_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_bitLen_2_0, grammarAccess.getBitfieldComponentAccess().getBitLenINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitfieldComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bitLen",
            						lv_bitLen_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleBitfieldComponent"


    // $ANTLR start "entryRuleListField"
    // InternalProtokitDSL.g:800:1: entryRuleListField returns [EObject current=null] : iv_ruleListField= ruleListField EOF ;
    public final EObject entryRuleListField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListField = null;


        try {
            // InternalProtokitDSL.g:800:50: (iv_ruleListField= ruleListField EOF )
            // InternalProtokitDSL.g:801:2: iv_ruleListField= ruleListField EOF
            {
             newCompositeNode(grammarAccess.getListFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListField=ruleListField();

            state._fsp--;

             current =iv_ruleListField; 
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
    // $ANTLR end "entryRuleListField"


    // $ANTLR start "ruleListField"
    // InternalProtokitDSL.g:807:1: ruleListField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'list' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleListField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:813:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'list' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalProtokitDSL.g:814:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'list' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalProtokitDSL.g:814:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'list' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalProtokitDSL.g:815:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'list' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            // InternalProtokitDSL.g:815:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProtokitDSL.g:816:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:816:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:817:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getListFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:829:3: ( (lv_identityField_1_0= '*' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProtokitDSL.g:830:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:830:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:831:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getListFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:843:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:844:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:844:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:845:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getListFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getListFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getListFieldAccess().getListKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getListFieldAccess().getLeftParenthesisKeyword_5());
            		
            // InternalProtokitDSL.g:873:3: ( (otherlv_6= RULE_ID ) )
            // InternalProtokitDSL.g:874:4: (otherlv_6= RULE_ID )
            {
            // InternalProtokitDSL.g:874:4: (otherlv_6= RULE_ID )
            // InternalProtokitDSL.g:875:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListFieldRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getListFieldAccess().getElementTypeDataTypeCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getListFieldAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleListField"


    // $ANTLR start "entryRuleLengthField"
    // InternalProtokitDSL.g:894:1: entryRuleLengthField returns [EObject current=null] : iv_ruleLengthField= ruleLengthField EOF ;
    public final EObject entryRuleLengthField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthField = null;


        try {
            // InternalProtokitDSL.g:894:52: (iv_ruleLengthField= ruleLengthField EOF )
            // InternalProtokitDSL.g:895:2: iv_ruleLengthField= ruleLengthField EOF
            {
             newCompositeNode(grammarAccess.getLengthFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLengthField=ruleLengthField();

            state._fsp--;

             current =iv_ruleLengthField; 
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
    // $ANTLR end "entryRuleLengthField"


    // $ANTLR start "ruleLengthField"
    // InternalProtokitDSL.g:901:1: ruleLengthField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'length' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleLengthField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_byteLen_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:907:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'length' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalProtokitDSL.g:908:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'length' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalProtokitDSL.g:908:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'length' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalProtokitDSL.g:909:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'length' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            // InternalProtokitDSL.g:909:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProtokitDSL.g:910:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:910:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:911:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getLengthFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLengthFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:923:3: ( (lv_identityField_1_0= '*' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProtokitDSL.g:924:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:924:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:925:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getLengthFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLengthFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:937:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:938:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:938:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:939:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLengthFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLengthFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getLengthFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLengthFieldAccess().getLengthKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getLengthFieldAccess().getLeftParenthesisKeyword_5());
            		
            // InternalProtokitDSL.g:967:3: ( (lv_byteLen_6_0= RULE_INT ) )
            // InternalProtokitDSL.g:968:4: (lv_byteLen_6_0= RULE_INT )
            {
            // InternalProtokitDSL.g:968:4: (lv_byteLen_6_0= RULE_INT )
            // InternalProtokitDSL.g:969:5: lv_byteLen_6_0= RULE_INT
            {
            lv_byteLen_6_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_byteLen_6_0, grammarAccess.getLengthFieldAccess().getByteLenINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLengthFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"byteLen",
            						lv_byteLen_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getLengthFieldAccess().getCommaKeyword_7());
            		
            // InternalProtokitDSL.g:989:3: ( (otherlv_8= RULE_ID ) )
            // InternalProtokitDSL.g:990:4: (otherlv_8= RULE_ID )
            {
            // InternalProtokitDSL.g:990:4: (otherlv_8= RULE_ID )
            // InternalProtokitDSL.g:991:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLengthFieldRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_8, grammarAccess.getLengthFieldAccess().getRefBinaryFieldCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLengthFieldAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleLengthField"


    // $ANTLR start "entryRuleCountField"
    // InternalProtokitDSL.g:1010:1: entryRuleCountField returns [EObject current=null] : iv_ruleCountField= ruleCountField EOF ;
    public final EObject entryRuleCountField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountField = null;


        try {
            // InternalProtokitDSL.g:1010:51: (iv_ruleCountField= ruleCountField EOF )
            // InternalProtokitDSL.g:1011:2: iv_ruleCountField= ruleCountField EOF
            {
             newCompositeNode(grammarAccess.getCountFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountField=ruleCountField();

            state._fsp--;

             current =iv_ruleCountField; 
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
    // $ANTLR end "entryRuleCountField"


    // $ANTLR start "ruleCountField"
    // InternalProtokitDSL.g:1017:1: ruleCountField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'count' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleCountField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_byteLen_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:1023:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'count' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalProtokitDSL.g:1024:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'count' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalProtokitDSL.g:1024:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'count' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalProtokitDSL.g:1025:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'count' otherlv_5= '(' ( (lv_byteLen_6_0= RULE_INT ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            // InternalProtokitDSL.g:1025:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProtokitDSL.g:1026:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:1026:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:1027:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getCountFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCountFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:1039:3: ( (lv_identityField_1_0= '*' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProtokitDSL.g:1040:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:1040:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:1041:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getCountFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCountFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:1053:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:1054:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:1054:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:1055:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCountFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getCountFieldAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCountFieldAccess().getCountKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCountFieldAccess().getLeftParenthesisKeyword_5());
            		
            // InternalProtokitDSL.g:1083:3: ( (lv_byteLen_6_0= RULE_INT ) )
            // InternalProtokitDSL.g:1084:4: (lv_byteLen_6_0= RULE_INT )
            {
            // InternalProtokitDSL.g:1084:4: (lv_byteLen_6_0= RULE_INT )
            // InternalProtokitDSL.g:1085:5: lv_byteLen_6_0= RULE_INT
            {
            lv_byteLen_6_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_byteLen_6_0, grammarAccess.getCountFieldAccess().getByteLenINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"byteLen",
            						lv_byteLen_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCountFieldAccess().getCommaKeyword_7());
            		
            // InternalProtokitDSL.g:1105:3: ( (otherlv_8= RULE_ID ) )
            // InternalProtokitDSL.g:1106:4: (otherlv_8= RULE_ID )
            {
            // InternalProtokitDSL.g:1106:4: (otherlv_8= RULE_ID )
            // InternalProtokitDSL.g:1107:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountFieldRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_8, grammarAccess.getCountFieldAccess().getRefListFieldCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCountFieldAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleCountField"


    // $ANTLR start "entryRuleDataTypeField"
    // InternalProtokitDSL.g:1126:1: entryRuleDataTypeField returns [EObject current=null] : iv_ruleDataTypeField= ruleDataTypeField EOF ;
    public final EObject entryRuleDataTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeField = null;


        try {
            // InternalProtokitDSL.g:1126:54: (iv_ruleDataTypeField= ruleDataTypeField EOF )
            // InternalProtokitDSL.g:1127:2: iv_ruleDataTypeField= ruleDataTypeField EOF
            {
             newCompositeNode(grammarAccess.getDataTypeFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeField=ruleDataTypeField();

            state._fsp--;

             current =iv_ruleDataTypeField; 
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
    // $ANTLR end "entryRuleDataTypeField"


    // $ANTLR start "ruleDataTypeField"
    // InternalProtokitDSL.g:1133:1: ruleDataTypeField returns [EObject current=null] : ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_transientField_0_0=null;
        Token lv_identityField_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:1139:2: ( ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalProtokitDSL.g:1140:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalProtokitDSL.g:1140:2: ( ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalProtokitDSL.g:1141:3: ( (lv_transientField_0_0= 'transient' ) )? ( (lv_identityField_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            // InternalProtokitDSL.g:1141:3: ( (lv_transientField_0_0= 'transient' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProtokitDSL.g:1142:4: (lv_transientField_0_0= 'transient' )
                    {
                    // InternalProtokitDSL.g:1142:4: (lv_transientField_0_0= 'transient' )
                    // InternalProtokitDSL.g:1143:5: lv_transientField_0_0= 'transient'
                    {
                    lv_transientField_0_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_transientField_0_0, grammarAccess.getDataTypeFieldAccess().getTransientFieldTransientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeFieldRule());
                    					}
                    					setWithLastConsumed(current, "transientField", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:1155:3: ( (lv_identityField_1_0= '*' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProtokitDSL.g:1156:4: (lv_identityField_1_0= '*' )
                    {
                    // InternalProtokitDSL.g:1156:4: (lv_identityField_1_0= '*' )
                    // InternalProtokitDSL.g:1157:5: lv_identityField_1_0= '*'
                    {
                    lv_identityField_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_identityField_1_0, grammarAccess.getDataTypeFieldAccess().getIdentityFieldAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeFieldRule());
                    					}
                    					setWithLastConsumed(current, "identityField", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalProtokitDSL.g:1169:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProtokitDSL.g:1170:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProtokitDSL.g:1170:4: (lv_name_2_0= RULE_ID )
            // InternalProtokitDSL.g:1171:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataTypeFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeFieldAccess().getColonKeyword_3());
            		
            // InternalProtokitDSL.g:1191:3: ( (otherlv_4= RULE_ID ) )
            // InternalProtokitDSL.g:1192:4: (otherlv_4= RULE_ID )
            {
            // InternalProtokitDSL.g:1192:4: (otherlv_4= RULE_ID )
            // InternalProtokitDSL.g:1193:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeFieldRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getDataTypeFieldAccess().getDatatypeDataTypeCrossReference_4_0());
            				

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
    // $ANTLR end "ruleDataTypeField"


    // $ANTLR start "entryRuleFormatter"
    // InternalProtokitDSL.g:1208:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalProtokitDSL.g:1208:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalProtokitDSL.g:1209:2: iv_ruleFormatter= ruleFormatter EOF
            {
             newCompositeNode(grammarAccess.getFormatterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormatter=ruleFormatter();

            state._fsp--;

             current =iv_ruleFormatter; 
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
    // $ANTLR end "entryRuleFormatter"


    // $ANTLR start "ruleFormatter"
    // InternalProtokitDSL.g:1215:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFormatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalProtokitDSL.g:1221:2: ( (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalProtokitDSL.g:1222:2: (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalProtokitDSL.g:1222:2: (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalProtokitDSL.g:1223:3: otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getFormatterKeyword_0());
            		
            // InternalProtokitDSL.g:1227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProtokitDSL.g:1228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProtokitDSL.g:1228:4: (lv_name_1_0= RULE_ID )
            // InternalProtokitDSL.g:1229:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormatterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFormatter"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\3\4\1\21\1\4\10\uffff";
    static final String dfa_3s = "\2\20\1\4\1\21\1\33\10\uffff";
    static final String dfa_4s = "\5\uffff\1\5\1\2\1\4\1\6\1\1\1\3\1\7\1\10";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\12\uffff\1\1\1\2",
            "\1\3\13\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\14\15\uffff\1\11\2\uffff\1\6\1\12\1\7\1\5\1\10\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "189:2: (this_IntegerField_0= ruleIntegerField | this_StringField_1= ruleStringField | this_BinaryField_2= ruleBinaryField | this_BitField_3= ruleBitField | this_ListField_4= ruleListField | this_LengthField_5= ruleLengthField | this_CountField_6= ruleCountField | this_DataTypeField_7= ruleDataTypeField )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});

}