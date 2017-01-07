package hu.bme.aut.protokit.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.aut.protokit.services.ProtokitDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtokitDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'protocol'", "'datatype'", "'{'", "'}'", "':'", "'int'", "'('", "')'", "'string'", "'binary'", "'bitfield'", "'list'", "'length'", "','", "'count'", "'formatter'", "'transient'", "'*'"
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

    	public void setGrammarAccess(ProtokitDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProtocolModel"
    // InternalProtokitDSL.g:53:1: entryRuleProtocolModel : ruleProtocolModel EOF ;
    public final void entryRuleProtocolModel() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:54:1: ( ruleProtocolModel EOF )
            // InternalProtokitDSL.g:55:1: ruleProtocolModel EOF
            {
             before(grammarAccess.getProtocolModelRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocolModel();

            state._fsp--;

             after(grammarAccess.getProtocolModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocolModel"


    // $ANTLR start "ruleProtocolModel"
    // InternalProtokitDSL.g:62:1: ruleProtocolModel : ( ( ( rule__ProtocolModel__DatatypesAssignment ) ) ( ( rule__ProtocolModel__DatatypesAssignment )* ) ) ;
    public final void ruleProtocolModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:66:2: ( ( ( ( rule__ProtocolModel__DatatypesAssignment ) ) ( ( rule__ProtocolModel__DatatypesAssignment )* ) ) )
            // InternalProtokitDSL.g:67:2: ( ( ( rule__ProtocolModel__DatatypesAssignment ) ) ( ( rule__ProtocolModel__DatatypesAssignment )* ) )
            {
            // InternalProtokitDSL.g:67:2: ( ( ( rule__ProtocolModel__DatatypesAssignment ) ) ( ( rule__ProtocolModel__DatatypesAssignment )* ) )
            // InternalProtokitDSL.g:68:3: ( ( rule__ProtocolModel__DatatypesAssignment ) ) ( ( rule__ProtocolModel__DatatypesAssignment )* )
            {
            // InternalProtokitDSL.g:68:3: ( ( rule__ProtocolModel__DatatypesAssignment ) )
            // InternalProtokitDSL.g:69:4: ( rule__ProtocolModel__DatatypesAssignment )
            {
             before(grammarAccess.getProtocolModelAccess().getDatatypesAssignment()); 
            // InternalProtokitDSL.g:70:4: ( rule__ProtocolModel__DatatypesAssignment )
            // InternalProtokitDSL.g:70:5: rule__ProtocolModel__DatatypesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ProtocolModel__DatatypesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProtocolModelAccess().getDatatypesAssignment()); 

            }

            // InternalProtokitDSL.g:73:3: ( ( rule__ProtocolModel__DatatypesAssignment )* )
            // InternalProtokitDSL.g:74:4: ( rule__ProtocolModel__DatatypesAssignment )*
            {
             before(grammarAccess.getProtocolModelAccess().getDatatypesAssignment()); 
            // InternalProtokitDSL.g:75:4: ( rule__ProtocolModel__DatatypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProtokitDSL.g:75:5: rule__ProtocolModel__DatatypesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ProtocolModel__DatatypesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProtocolModelAccess().getDatatypesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocolModel"


    // $ANTLR start "entryRuleDataType"
    // InternalProtokitDSL.g:85:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:86:1: ( ruleDataType EOF )
            // InternalProtokitDSL.g:87:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalProtokitDSL.g:94:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:98:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalProtokitDSL.g:99:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalProtokitDSL.g:99:2: ( ( rule__DataType__Group__0 ) )
            // InternalProtokitDSL.g:100:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalProtokitDSL.g:101:3: ( rule__DataType__Group__0 )
            // InternalProtokitDSL.g:101:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalProtokitDSL.g:110:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:111:1: ( ruleVariableDefinition EOF )
            // InternalProtokitDSL.g:112:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalProtokitDSL.g:119:1: ruleVariableDefinition : ( ( rule__VariableDefinition__Alternatives ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:123:2: ( ( ( rule__VariableDefinition__Alternatives ) ) )
            // InternalProtokitDSL.g:124:2: ( ( rule__VariableDefinition__Alternatives ) )
            {
            // InternalProtokitDSL.g:124:2: ( ( rule__VariableDefinition__Alternatives ) )
            // InternalProtokitDSL.g:125:3: ( rule__VariableDefinition__Alternatives )
            {
             before(grammarAccess.getVariableDefinitionAccess().getAlternatives()); 
            // InternalProtokitDSL.g:126:3: ( rule__VariableDefinition__Alternatives )
            // InternalProtokitDSL.g:126:4: rule__VariableDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleIntegerField"
    // InternalProtokitDSL.g:135:1: entryRuleIntegerField : ruleIntegerField EOF ;
    public final void entryRuleIntegerField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:136:1: ( ruleIntegerField EOF )
            // InternalProtokitDSL.g:137:1: ruleIntegerField EOF
            {
             before(grammarAccess.getIntegerFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerField();

            state._fsp--;

             after(grammarAccess.getIntegerFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerField"


    // $ANTLR start "ruleIntegerField"
    // InternalProtokitDSL.g:144:1: ruleIntegerField : ( ( rule__IntegerField__Group__0 ) ) ;
    public final void ruleIntegerField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:148:2: ( ( ( rule__IntegerField__Group__0 ) ) )
            // InternalProtokitDSL.g:149:2: ( ( rule__IntegerField__Group__0 ) )
            {
            // InternalProtokitDSL.g:149:2: ( ( rule__IntegerField__Group__0 ) )
            // InternalProtokitDSL.g:150:3: ( rule__IntegerField__Group__0 )
            {
             before(grammarAccess.getIntegerFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:151:3: ( rule__IntegerField__Group__0 )
            // InternalProtokitDSL.g:151:4: rule__IntegerField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerField"


    // $ANTLR start "entryRuleStringField"
    // InternalProtokitDSL.g:160:1: entryRuleStringField : ruleStringField EOF ;
    public final void entryRuleStringField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:161:1: ( ruleStringField EOF )
            // InternalProtokitDSL.g:162:1: ruleStringField EOF
            {
             before(grammarAccess.getStringFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleStringField();

            state._fsp--;

             after(grammarAccess.getStringFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringField"


    // $ANTLR start "ruleStringField"
    // InternalProtokitDSL.g:169:1: ruleStringField : ( ( rule__StringField__Group__0 ) ) ;
    public final void ruleStringField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:173:2: ( ( ( rule__StringField__Group__0 ) ) )
            // InternalProtokitDSL.g:174:2: ( ( rule__StringField__Group__0 ) )
            {
            // InternalProtokitDSL.g:174:2: ( ( rule__StringField__Group__0 ) )
            // InternalProtokitDSL.g:175:3: ( rule__StringField__Group__0 )
            {
             before(grammarAccess.getStringFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:176:3: ( rule__StringField__Group__0 )
            // InternalProtokitDSL.g:176:4: rule__StringField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringField"


    // $ANTLR start "entryRuleBinaryField"
    // InternalProtokitDSL.g:185:1: entryRuleBinaryField : ruleBinaryField EOF ;
    public final void entryRuleBinaryField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:186:1: ( ruleBinaryField EOF )
            // InternalProtokitDSL.g:187:1: ruleBinaryField EOF
            {
             before(grammarAccess.getBinaryFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryField();

            state._fsp--;

             after(grammarAccess.getBinaryFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryField"


    // $ANTLR start "ruleBinaryField"
    // InternalProtokitDSL.g:194:1: ruleBinaryField : ( ( rule__BinaryField__Group__0 ) ) ;
    public final void ruleBinaryField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:198:2: ( ( ( rule__BinaryField__Group__0 ) ) )
            // InternalProtokitDSL.g:199:2: ( ( rule__BinaryField__Group__0 ) )
            {
            // InternalProtokitDSL.g:199:2: ( ( rule__BinaryField__Group__0 ) )
            // InternalProtokitDSL.g:200:3: ( rule__BinaryField__Group__0 )
            {
             before(grammarAccess.getBinaryFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:201:3: ( rule__BinaryField__Group__0 )
            // InternalProtokitDSL.g:201:4: rule__BinaryField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryField"


    // $ANTLR start "entryRuleBitField"
    // InternalProtokitDSL.g:210:1: entryRuleBitField : ruleBitField EOF ;
    public final void entryRuleBitField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:211:1: ( ruleBitField EOF )
            // InternalProtokitDSL.g:212:1: ruleBitField EOF
            {
             before(grammarAccess.getBitFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleBitField();

            state._fsp--;

             after(grammarAccess.getBitFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBitField"


    // $ANTLR start "ruleBitField"
    // InternalProtokitDSL.g:219:1: ruleBitField : ( ( rule__BitField__Group__0 ) ) ;
    public final void ruleBitField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:223:2: ( ( ( rule__BitField__Group__0 ) ) )
            // InternalProtokitDSL.g:224:2: ( ( rule__BitField__Group__0 ) )
            {
            // InternalProtokitDSL.g:224:2: ( ( rule__BitField__Group__0 ) )
            // InternalProtokitDSL.g:225:3: ( rule__BitField__Group__0 )
            {
             before(grammarAccess.getBitFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:226:3: ( rule__BitField__Group__0 )
            // InternalProtokitDSL.g:226:4: rule__BitField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BitField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBitFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBitField"


    // $ANTLR start "entryRuleBitfieldComponent"
    // InternalProtokitDSL.g:235:1: entryRuleBitfieldComponent : ruleBitfieldComponent EOF ;
    public final void entryRuleBitfieldComponent() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:236:1: ( ruleBitfieldComponent EOF )
            // InternalProtokitDSL.g:237:1: ruleBitfieldComponent EOF
            {
             before(grammarAccess.getBitfieldComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleBitfieldComponent();

            state._fsp--;

             after(grammarAccess.getBitfieldComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBitfieldComponent"


    // $ANTLR start "ruleBitfieldComponent"
    // InternalProtokitDSL.g:244:1: ruleBitfieldComponent : ( ( rule__BitfieldComponent__Group__0 ) ) ;
    public final void ruleBitfieldComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:248:2: ( ( ( rule__BitfieldComponent__Group__0 ) ) )
            // InternalProtokitDSL.g:249:2: ( ( rule__BitfieldComponent__Group__0 ) )
            {
            // InternalProtokitDSL.g:249:2: ( ( rule__BitfieldComponent__Group__0 ) )
            // InternalProtokitDSL.g:250:3: ( rule__BitfieldComponent__Group__0 )
            {
             before(grammarAccess.getBitfieldComponentAccess().getGroup()); 
            // InternalProtokitDSL.g:251:3: ( rule__BitfieldComponent__Group__0 )
            // InternalProtokitDSL.g:251:4: rule__BitfieldComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BitfieldComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBitfieldComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBitfieldComponent"


    // $ANTLR start "entryRuleListField"
    // InternalProtokitDSL.g:260:1: entryRuleListField : ruleListField EOF ;
    public final void entryRuleListField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:261:1: ( ruleListField EOF )
            // InternalProtokitDSL.g:262:1: ruleListField EOF
            {
             before(grammarAccess.getListFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleListField();

            state._fsp--;

             after(grammarAccess.getListFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListField"


    // $ANTLR start "ruleListField"
    // InternalProtokitDSL.g:269:1: ruleListField : ( ( rule__ListField__Group__0 ) ) ;
    public final void ruleListField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:273:2: ( ( ( rule__ListField__Group__0 ) ) )
            // InternalProtokitDSL.g:274:2: ( ( rule__ListField__Group__0 ) )
            {
            // InternalProtokitDSL.g:274:2: ( ( rule__ListField__Group__0 ) )
            // InternalProtokitDSL.g:275:3: ( rule__ListField__Group__0 )
            {
             before(grammarAccess.getListFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:276:3: ( rule__ListField__Group__0 )
            // InternalProtokitDSL.g:276:4: rule__ListField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListField"


    // $ANTLR start "entryRuleLengthField"
    // InternalProtokitDSL.g:285:1: entryRuleLengthField : ruleLengthField EOF ;
    public final void entryRuleLengthField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:286:1: ( ruleLengthField EOF )
            // InternalProtokitDSL.g:287:1: ruleLengthField EOF
            {
             before(grammarAccess.getLengthFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleLengthField();

            state._fsp--;

             after(grammarAccess.getLengthFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLengthField"


    // $ANTLR start "ruleLengthField"
    // InternalProtokitDSL.g:294:1: ruleLengthField : ( ( rule__LengthField__Group__0 ) ) ;
    public final void ruleLengthField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:298:2: ( ( ( rule__LengthField__Group__0 ) ) )
            // InternalProtokitDSL.g:299:2: ( ( rule__LengthField__Group__0 ) )
            {
            // InternalProtokitDSL.g:299:2: ( ( rule__LengthField__Group__0 ) )
            // InternalProtokitDSL.g:300:3: ( rule__LengthField__Group__0 )
            {
             before(grammarAccess.getLengthFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:301:3: ( rule__LengthField__Group__0 )
            // InternalProtokitDSL.g:301:4: rule__LengthField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LengthField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLengthFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLengthField"


    // $ANTLR start "entryRuleCountField"
    // InternalProtokitDSL.g:310:1: entryRuleCountField : ruleCountField EOF ;
    public final void entryRuleCountField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:311:1: ( ruleCountField EOF )
            // InternalProtokitDSL.g:312:1: ruleCountField EOF
            {
             before(grammarAccess.getCountFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleCountField();

            state._fsp--;

             after(grammarAccess.getCountFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountField"


    // $ANTLR start "ruleCountField"
    // InternalProtokitDSL.g:319:1: ruleCountField : ( ( rule__CountField__Group__0 ) ) ;
    public final void ruleCountField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:323:2: ( ( ( rule__CountField__Group__0 ) ) )
            // InternalProtokitDSL.g:324:2: ( ( rule__CountField__Group__0 ) )
            {
            // InternalProtokitDSL.g:324:2: ( ( rule__CountField__Group__0 ) )
            // InternalProtokitDSL.g:325:3: ( rule__CountField__Group__0 )
            {
             before(grammarAccess.getCountFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:326:3: ( rule__CountField__Group__0 )
            // InternalProtokitDSL.g:326:4: rule__CountField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountField"


    // $ANTLR start "entryRuleDataTypeField"
    // InternalProtokitDSL.g:335:1: entryRuleDataTypeField : ruleDataTypeField EOF ;
    public final void entryRuleDataTypeField() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:336:1: ( ruleDataTypeField EOF )
            // InternalProtokitDSL.g:337:1: ruleDataTypeField EOF
            {
             before(grammarAccess.getDataTypeFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeField();

            state._fsp--;

             after(grammarAccess.getDataTypeFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeField"


    // $ANTLR start "ruleDataTypeField"
    // InternalProtokitDSL.g:344:1: ruleDataTypeField : ( ( rule__DataTypeField__Group__0 ) ) ;
    public final void ruleDataTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:348:2: ( ( ( rule__DataTypeField__Group__0 ) ) )
            // InternalProtokitDSL.g:349:2: ( ( rule__DataTypeField__Group__0 ) )
            {
            // InternalProtokitDSL.g:349:2: ( ( rule__DataTypeField__Group__0 ) )
            // InternalProtokitDSL.g:350:3: ( rule__DataTypeField__Group__0 )
            {
             before(grammarAccess.getDataTypeFieldAccess().getGroup()); 
            // InternalProtokitDSL.g:351:3: ( rule__DataTypeField__Group__0 )
            // InternalProtokitDSL.g:351:4: rule__DataTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeField"


    // $ANTLR start "entryRuleFormatter"
    // InternalProtokitDSL.g:360:1: entryRuleFormatter : ruleFormatter EOF ;
    public final void entryRuleFormatter() throws RecognitionException {
        try {
            // InternalProtokitDSL.g:361:1: ( ruleFormatter EOF )
            // InternalProtokitDSL.g:362:1: ruleFormatter EOF
            {
             before(grammarAccess.getFormatterRule()); 
            pushFollow(FOLLOW_1);
            ruleFormatter();

            state._fsp--;

             after(grammarAccess.getFormatterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormatter"


    // $ANTLR start "ruleFormatter"
    // InternalProtokitDSL.g:369:1: ruleFormatter : ( ( rule__Formatter__Group__0 ) ) ;
    public final void ruleFormatter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:373:2: ( ( ( rule__Formatter__Group__0 ) ) )
            // InternalProtokitDSL.g:374:2: ( ( rule__Formatter__Group__0 ) )
            {
            // InternalProtokitDSL.g:374:2: ( ( rule__Formatter__Group__0 ) )
            // InternalProtokitDSL.g:375:3: ( rule__Formatter__Group__0 )
            {
             before(grammarAccess.getFormatterAccess().getGroup()); 
            // InternalProtokitDSL.g:376:3: ( rule__Formatter__Group__0 )
            // InternalProtokitDSL.g:376:4: rule__Formatter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormatterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatter"


    // $ANTLR start "rule__DataType__Alternatives_0"
    // InternalProtokitDSL.g:384:1: rule__DataType__Alternatives_0 : ( ( 'protocol' ) | ( 'datatype' ) );
    public final void rule__DataType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:388:1: ( ( 'protocol' ) | ( 'datatype' ) )
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
                    // InternalProtokitDSL.g:389:2: ( 'protocol' )
                    {
                    // InternalProtokitDSL.g:389:2: ( 'protocol' )
                    // InternalProtokitDSL.g:390:3: 'protocol'
                    {
                     before(grammarAccess.getDataTypeAccess().getProtocolKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getProtocolKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:395:2: ( 'datatype' )
                    {
                    // InternalProtokitDSL.g:395:2: ( 'datatype' )
                    // InternalProtokitDSL.g:396:3: 'datatype'
                    {
                     before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives_0"


    // $ANTLR start "rule__VariableDefinition__Alternatives"
    // InternalProtokitDSL.g:405:1: rule__VariableDefinition__Alternatives : ( ( ruleIntegerField ) | ( ruleStringField ) | ( ruleBinaryField ) | ( ruleBitField ) | ( ruleListField ) | ( ruleLengthField ) | ( ruleCountField ) | ( ruleDataTypeField ) );
    public final void rule__VariableDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:409:1: ( ( ruleIntegerField ) | ( ruleStringField ) | ( ruleBinaryField ) | ( ruleBitField ) | ( ruleListField ) | ( ruleLengthField ) | ( ruleCountField ) | ( ruleDataTypeField ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalProtokitDSL.g:410:2: ( ruleIntegerField )
                    {
                    // InternalProtokitDSL.g:410:2: ( ruleIntegerField )
                    // InternalProtokitDSL.g:411:3: ruleIntegerField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getIntegerFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getIntegerFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:416:2: ( ruleStringField )
                    {
                    // InternalProtokitDSL.g:416:2: ( ruleStringField )
                    // InternalProtokitDSL.g:417:3: ruleStringField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getStringFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getStringFieldParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProtokitDSL.g:422:2: ( ruleBinaryField )
                    {
                    // InternalProtokitDSL.g:422:2: ( ruleBinaryField )
                    // InternalProtokitDSL.g:423:3: ruleBinaryField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getBinaryFieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getBinaryFieldParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProtokitDSL.g:428:2: ( ruleBitField )
                    {
                    // InternalProtokitDSL.g:428:2: ( ruleBitField )
                    // InternalProtokitDSL.g:429:3: ruleBitField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getBitFieldParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBitField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getBitFieldParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProtokitDSL.g:434:2: ( ruleListField )
                    {
                    // InternalProtokitDSL.g:434:2: ( ruleListField )
                    // InternalProtokitDSL.g:435:3: ruleListField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getListFieldParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getListFieldParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProtokitDSL.g:440:2: ( ruleLengthField )
                    {
                    // InternalProtokitDSL.g:440:2: ( ruleLengthField )
                    // InternalProtokitDSL.g:441:3: ruleLengthField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getLengthFieldParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLengthField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getLengthFieldParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProtokitDSL.g:446:2: ( ruleCountField )
                    {
                    // InternalProtokitDSL.g:446:2: ( ruleCountField )
                    // InternalProtokitDSL.g:447:3: ruleCountField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getCountFieldParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCountField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getCountFieldParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProtokitDSL.g:452:2: ( ruleDataTypeField )
                    {
                    // InternalProtokitDSL.g:452:2: ( ruleDataTypeField )
                    // InternalProtokitDSL.g:453:3: ruleDataTypeField
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getDataTypeFieldParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDataTypeField();

                    state._fsp--;

                     after(grammarAccess.getVariableDefinitionAccess().getDataTypeFieldParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Alternatives"


    // $ANTLR start "rule__StringField__Alternatives_5"
    // InternalProtokitDSL.g:462:1: rule__StringField__Alternatives_5 : ( ( ( rule__StringField__Group_5_0__0 ) ) | ( ( rule__StringField__Group_5_1__0 ) ) );
    public final void rule__StringField__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:466:1: ( ( ( rule__StringField__Group_5_0__0 ) ) | ( ( rule__StringField__Group_5_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18||LA4_1==28) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_INT) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProtokitDSL.g:467:2: ( ( rule__StringField__Group_5_0__0 ) )
                    {
                    // InternalProtokitDSL.g:467:2: ( ( rule__StringField__Group_5_0__0 ) )
                    // InternalProtokitDSL.g:468:3: ( rule__StringField__Group_5_0__0 )
                    {
                     before(grammarAccess.getStringFieldAccess().getGroup_5_0()); 
                    // InternalProtokitDSL.g:469:3: ( rule__StringField__Group_5_0__0 )
                    // InternalProtokitDSL.g:469:4: rule__StringField__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringField__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringFieldAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:473:2: ( ( rule__StringField__Group_5_1__0 ) )
                    {
                    // InternalProtokitDSL.g:473:2: ( ( rule__StringField__Group_5_1__0 ) )
                    // InternalProtokitDSL.g:474:3: ( rule__StringField__Group_5_1__0 )
                    {
                     before(grammarAccess.getStringFieldAccess().getGroup_5_1()); 
                    // InternalProtokitDSL.g:475:3: ( rule__StringField__Group_5_1__0 )
                    // InternalProtokitDSL.g:475:4: rule__StringField__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringField__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringFieldAccess().getGroup_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Alternatives_5"


    // $ANTLR start "rule__BinaryField__Alternatives_5"
    // InternalProtokitDSL.g:483:1: rule__BinaryField__Alternatives_5 : ( ( ( rule__BinaryField__Group_5_0__0 ) ) | ( ( rule__BinaryField__Group_5_1__0 ) ) );
    public final void rule__BinaryField__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:487:1: ( ( ( rule__BinaryField__Group_5_0__0 ) ) | ( ( rule__BinaryField__Group_5_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_INT) ) {
                    alt5=1;
                }
                else if ( (LA5_1==18||LA5_1==28) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProtokitDSL.g:488:2: ( ( rule__BinaryField__Group_5_0__0 ) )
                    {
                    // InternalProtokitDSL.g:488:2: ( ( rule__BinaryField__Group_5_0__0 ) )
                    // InternalProtokitDSL.g:489:3: ( rule__BinaryField__Group_5_0__0 )
                    {
                     before(grammarAccess.getBinaryFieldAccess().getGroup_5_0()); 
                    // InternalProtokitDSL.g:490:3: ( rule__BinaryField__Group_5_0__0 )
                    // InternalProtokitDSL.g:490:4: rule__BinaryField__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryField__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryFieldAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProtokitDSL.g:494:2: ( ( rule__BinaryField__Group_5_1__0 ) )
                    {
                    // InternalProtokitDSL.g:494:2: ( ( rule__BinaryField__Group_5_1__0 ) )
                    // InternalProtokitDSL.g:495:3: ( rule__BinaryField__Group_5_1__0 )
                    {
                     before(grammarAccess.getBinaryFieldAccess().getGroup_5_1()); 
                    // InternalProtokitDSL.g:496:3: ( rule__BinaryField__Group_5_1__0 )
                    // InternalProtokitDSL.g:496:4: rule__BinaryField__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryField__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryFieldAccess().getGroup_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Alternatives_5"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalProtokitDSL.g:504:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:508:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalProtokitDSL.g:509:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalProtokitDSL.g:516:1: rule__DataType__Group__0__Impl : ( ( rule__DataType__Alternatives_0 ) ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:520:1: ( ( ( rule__DataType__Alternatives_0 ) ) )
            // InternalProtokitDSL.g:521:1: ( ( rule__DataType__Alternatives_0 ) )
            {
            // InternalProtokitDSL.g:521:1: ( ( rule__DataType__Alternatives_0 ) )
            // InternalProtokitDSL.g:522:2: ( rule__DataType__Alternatives_0 )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives_0()); 
            // InternalProtokitDSL.g:523:2: ( rule__DataType__Alternatives_0 )
            // InternalProtokitDSL.g:523:3: rule__DataType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalProtokitDSL.g:531:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:535:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalProtokitDSL.g:536:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalProtokitDSL.g:543:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:547:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalProtokitDSL.g:548:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalProtokitDSL.g:548:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalProtokitDSL.g:549:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalProtokitDSL.g:550:2: ( rule__DataType__NameAssignment_1 )
            // InternalProtokitDSL.g:550:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // InternalProtokitDSL.g:558:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:562:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // InternalProtokitDSL.g:563:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // InternalProtokitDSL.g:570:1: rule__DataType__Group__2__Impl : ( '{' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:574:1: ( ( '{' ) )
            // InternalProtokitDSL.g:575:1: ( '{' )
            {
            // InternalProtokitDSL.g:575:1: ( '{' )
            // InternalProtokitDSL.g:576:2: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // InternalProtokitDSL.g:585:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:589:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // InternalProtokitDSL.g:590:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // InternalProtokitDSL.g:597:1: rule__DataType__Group__3__Impl : ( ( ( rule__DataType__FieldsAssignment_3 ) ) ( ( rule__DataType__FieldsAssignment_3 )* ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:601:1: ( ( ( ( rule__DataType__FieldsAssignment_3 ) ) ( ( rule__DataType__FieldsAssignment_3 )* ) ) )
            // InternalProtokitDSL.g:602:1: ( ( ( rule__DataType__FieldsAssignment_3 ) ) ( ( rule__DataType__FieldsAssignment_3 )* ) )
            {
            // InternalProtokitDSL.g:602:1: ( ( ( rule__DataType__FieldsAssignment_3 ) ) ( ( rule__DataType__FieldsAssignment_3 )* ) )
            // InternalProtokitDSL.g:603:2: ( ( rule__DataType__FieldsAssignment_3 ) ) ( ( rule__DataType__FieldsAssignment_3 )* )
            {
            // InternalProtokitDSL.g:603:2: ( ( rule__DataType__FieldsAssignment_3 ) )
            // InternalProtokitDSL.g:604:3: ( rule__DataType__FieldsAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getFieldsAssignment_3()); 
            // InternalProtokitDSL.g:605:3: ( rule__DataType__FieldsAssignment_3 )
            // InternalProtokitDSL.g:605:4: rule__DataType__FieldsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__DataType__FieldsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getFieldsAssignment_3()); 

            }

            // InternalProtokitDSL.g:608:2: ( ( rule__DataType__FieldsAssignment_3 )* )
            // InternalProtokitDSL.g:609:3: ( rule__DataType__FieldsAssignment_3 )*
            {
             before(grammarAccess.getDataTypeAccess().getFieldsAssignment_3()); 
            // InternalProtokitDSL.g:610:3: ( rule__DataType__FieldsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=27 && LA6_0<=28)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProtokitDSL.g:610:4: rule__DataType__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DataType__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getFieldsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__4"
    // InternalProtokitDSL.g:619:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:623:1: ( rule__DataType__Group__4__Impl )
            // InternalProtokitDSL.g:624:2: rule__DataType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__4"


    // $ANTLR start "rule__DataType__Group__4__Impl"
    // InternalProtokitDSL.g:630:1: rule__DataType__Group__4__Impl : ( '}' ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:634:1: ( ( '}' ) )
            // InternalProtokitDSL.g:635:1: ( '}' )
            {
            // InternalProtokitDSL.g:635:1: ( '}' )
            // InternalProtokitDSL.g:636:2: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__4__Impl"


    // $ANTLR start "rule__IntegerField__Group__0"
    // InternalProtokitDSL.g:646:1: rule__IntegerField__Group__0 : rule__IntegerField__Group__0__Impl rule__IntegerField__Group__1 ;
    public final void rule__IntegerField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:650:1: ( rule__IntegerField__Group__0__Impl rule__IntegerField__Group__1 )
            // InternalProtokitDSL.g:651:2: rule__IntegerField__Group__0__Impl rule__IntegerField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IntegerField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__0"


    // $ANTLR start "rule__IntegerField__Group__0__Impl"
    // InternalProtokitDSL.g:658:1: rule__IntegerField__Group__0__Impl : ( ( rule__IntegerField__TransientFieldAssignment_0 )? ) ;
    public final void rule__IntegerField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:662:1: ( ( ( rule__IntegerField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:663:1: ( ( rule__IntegerField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:663:1: ( ( rule__IntegerField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:664:2: ( rule__IntegerField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getIntegerFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:665:2: ( rule__IntegerField__TransientFieldAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProtokitDSL.g:665:3: rule__IntegerField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__0__Impl"


    // $ANTLR start "rule__IntegerField__Group__1"
    // InternalProtokitDSL.g:673:1: rule__IntegerField__Group__1 : rule__IntegerField__Group__1__Impl rule__IntegerField__Group__2 ;
    public final void rule__IntegerField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:677:1: ( rule__IntegerField__Group__1__Impl rule__IntegerField__Group__2 )
            // InternalProtokitDSL.g:678:2: rule__IntegerField__Group__1__Impl rule__IntegerField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IntegerField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__1"


    // $ANTLR start "rule__IntegerField__Group__1__Impl"
    // InternalProtokitDSL.g:685:1: rule__IntegerField__Group__1__Impl : ( ( rule__IntegerField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__IntegerField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:689:1: ( ( ( rule__IntegerField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:690:1: ( ( rule__IntegerField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:690:1: ( ( rule__IntegerField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:691:2: ( rule__IntegerField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getIntegerFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:692:2: ( rule__IntegerField__IdentityFieldAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProtokitDSL.g:692:3: rule__IntegerField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__1__Impl"


    // $ANTLR start "rule__IntegerField__Group__2"
    // InternalProtokitDSL.g:700:1: rule__IntegerField__Group__2 : rule__IntegerField__Group__2__Impl rule__IntegerField__Group__3 ;
    public final void rule__IntegerField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:704:1: ( rule__IntegerField__Group__2__Impl rule__IntegerField__Group__3 )
            // InternalProtokitDSL.g:705:2: rule__IntegerField__Group__2__Impl rule__IntegerField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__IntegerField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__2"


    // $ANTLR start "rule__IntegerField__Group__2__Impl"
    // InternalProtokitDSL.g:712:1: rule__IntegerField__Group__2__Impl : ( ( rule__IntegerField__NameAssignment_2 ) ) ;
    public final void rule__IntegerField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:716:1: ( ( ( rule__IntegerField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:717:1: ( ( rule__IntegerField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:717:1: ( ( rule__IntegerField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:718:2: ( rule__IntegerField__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:719:2: ( rule__IntegerField__NameAssignment_2 )
            // InternalProtokitDSL.g:719:3: rule__IntegerField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__2__Impl"


    // $ANTLR start "rule__IntegerField__Group__3"
    // InternalProtokitDSL.g:727:1: rule__IntegerField__Group__3 : rule__IntegerField__Group__3__Impl rule__IntegerField__Group__4 ;
    public final void rule__IntegerField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:731:1: ( rule__IntegerField__Group__3__Impl rule__IntegerField__Group__4 )
            // InternalProtokitDSL.g:732:2: rule__IntegerField__Group__3__Impl rule__IntegerField__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__IntegerField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__3"


    // $ANTLR start "rule__IntegerField__Group__3__Impl"
    // InternalProtokitDSL.g:739:1: rule__IntegerField__Group__3__Impl : ( ':' ) ;
    public final void rule__IntegerField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:743:1: ( ( ':' ) )
            // InternalProtokitDSL.g:744:1: ( ':' )
            {
            // InternalProtokitDSL.g:744:1: ( ':' )
            // InternalProtokitDSL.g:745:2: ':'
            {
             before(grammarAccess.getIntegerFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__3__Impl"


    // $ANTLR start "rule__IntegerField__Group__4"
    // InternalProtokitDSL.g:754:1: rule__IntegerField__Group__4 : rule__IntegerField__Group__4__Impl rule__IntegerField__Group__5 ;
    public final void rule__IntegerField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:758:1: ( rule__IntegerField__Group__4__Impl rule__IntegerField__Group__5 )
            // InternalProtokitDSL.g:759:2: rule__IntegerField__Group__4__Impl rule__IntegerField__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__IntegerField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__4"


    // $ANTLR start "rule__IntegerField__Group__4__Impl"
    // InternalProtokitDSL.g:766:1: rule__IntegerField__Group__4__Impl : ( 'int' ) ;
    public final void rule__IntegerField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:770:1: ( ( 'int' ) )
            // InternalProtokitDSL.g:771:1: ( 'int' )
            {
            // InternalProtokitDSL.g:771:1: ( 'int' )
            // InternalProtokitDSL.g:772:2: 'int'
            {
             before(grammarAccess.getIntegerFieldAccess().getIntKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getIntKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__4__Impl"


    // $ANTLR start "rule__IntegerField__Group__5"
    // InternalProtokitDSL.g:781:1: rule__IntegerField__Group__5 : rule__IntegerField__Group__5__Impl ;
    public final void rule__IntegerField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:785:1: ( rule__IntegerField__Group__5__Impl )
            // InternalProtokitDSL.g:786:2: rule__IntegerField__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerField__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__5"


    // $ANTLR start "rule__IntegerField__Group__5__Impl"
    // InternalProtokitDSL.g:792:1: rule__IntegerField__Group__5__Impl : ( ( rule__IntegerField__Group_5__0 )? ) ;
    public final void rule__IntegerField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:796:1: ( ( ( rule__IntegerField__Group_5__0 )? ) )
            // InternalProtokitDSL.g:797:1: ( ( rule__IntegerField__Group_5__0 )? )
            {
            // InternalProtokitDSL.g:797:1: ( ( rule__IntegerField__Group_5__0 )? )
            // InternalProtokitDSL.g:798:2: ( rule__IntegerField__Group_5__0 )?
            {
             before(grammarAccess.getIntegerFieldAccess().getGroup_5()); 
            // InternalProtokitDSL.g:799:2: ( rule__IntegerField__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProtokitDSL.g:799:3: rule__IntegerField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerField__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group__5__Impl"


    // $ANTLR start "rule__IntegerField__Group_5__0"
    // InternalProtokitDSL.g:808:1: rule__IntegerField__Group_5__0 : rule__IntegerField__Group_5__0__Impl rule__IntegerField__Group_5__1 ;
    public final void rule__IntegerField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:812:1: ( rule__IntegerField__Group_5__0__Impl rule__IntegerField__Group_5__1 )
            // InternalProtokitDSL.g:813:2: rule__IntegerField__Group_5__0__Impl rule__IntegerField__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__IntegerField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group_5__0"


    // $ANTLR start "rule__IntegerField__Group_5__0__Impl"
    // InternalProtokitDSL.g:820:1: rule__IntegerField__Group_5__0__Impl : ( '(' ) ;
    public final void rule__IntegerField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:824:1: ( ( '(' ) )
            // InternalProtokitDSL.g:825:1: ( '(' )
            {
            // InternalProtokitDSL.g:825:1: ( '(' )
            // InternalProtokitDSL.g:826:2: '('
            {
             before(grammarAccess.getIntegerFieldAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerField__Group_5__1"
    // InternalProtokitDSL.g:835:1: rule__IntegerField__Group_5__1 : rule__IntegerField__Group_5__1__Impl rule__IntegerField__Group_5__2 ;
    public final void rule__IntegerField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:839:1: ( rule__IntegerField__Group_5__1__Impl rule__IntegerField__Group_5__2 )
            // InternalProtokitDSL.g:840:2: rule__IntegerField__Group_5__1__Impl rule__IntegerField__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__IntegerField__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerField__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group_5__1"


    // $ANTLR start "rule__IntegerField__Group_5__1__Impl"
    // InternalProtokitDSL.g:847:1: rule__IntegerField__Group_5__1__Impl : ( ( rule__IntegerField__ByteLenAssignment_5_1 ) ) ;
    public final void rule__IntegerField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:851:1: ( ( ( rule__IntegerField__ByteLenAssignment_5_1 ) ) )
            // InternalProtokitDSL.g:852:1: ( ( rule__IntegerField__ByteLenAssignment_5_1 ) )
            {
            // InternalProtokitDSL.g:852:1: ( ( rule__IntegerField__ByteLenAssignment_5_1 ) )
            // InternalProtokitDSL.g:853:2: ( rule__IntegerField__ByteLenAssignment_5_1 )
            {
             before(grammarAccess.getIntegerFieldAccess().getByteLenAssignment_5_1()); 
            // InternalProtokitDSL.g:854:2: ( rule__IntegerField__ByteLenAssignment_5_1 )
            // InternalProtokitDSL.g:854:3: rule__IntegerField__ByteLenAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerField__ByteLenAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFieldAccess().getByteLenAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerField__Group_5__2"
    // InternalProtokitDSL.g:862:1: rule__IntegerField__Group_5__2 : rule__IntegerField__Group_5__2__Impl ;
    public final void rule__IntegerField__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:866:1: ( rule__IntegerField__Group_5__2__Impl )
            // InternalProtokitDSL.g:867:2: rule__IntegerField__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerField__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group_5__2"


    // $ANTLR start "rule__IntegerField__Group_5__2__Impl"
    // InternalProtokitDSL.g:873:1: rule__IntegerField__Group_5__2__Impl : ( ')' ) ;
    public final void rule__IntegerField__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:877:1: ( ( ')' ) )
            // InternalProtokitDSL.g:878:1: ( ')' )
            {
            // InternalProtokitDSL.g:878:1: ( ')' )
            // InternalProtokitDSL.g:879:2: ')'
            {
             before(grammarAccess.getIntegerFieldAccess().getRightParenthesisKeyword_5_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__Group_5__2__Impl"


    // $ANTLR start "rule__StringField__Group__0"
    // InternalProtokitDSL.g:889:1: rule__StringField__Group__0 : rule__StringField__Group__0__Impl rule__StringField__Group__1 ;
    public final void rule__StringField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:893:1: ( rule__StringField__Group__0__Impl rule__StringField__Group__1 )
            // InternalProtokitDSL.g:894:2: rule__StringField__Group__0__Impl rule__StringField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StringField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__0"


    // $ANTLR start "rule__StringField__Group__0__Impl"
    // InternalProtokitDSL.g:901:1: rule__StringField__Group__0__Impl : ( ( rule__StringField__TransientFieldAssignment_0 )? ) ;
    public final void rule__StringField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:905:1: ( ( ( rule__StringField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:906:1: ( ( rule__StringField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:906:1: ( ( rule__StringField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:907:2: ( rule__StringField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getStringFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:908:2: ( rule__StringField__TransientFieldAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProtokitDSL.g:908:3: rule__StringField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__0__Impl"


    // $ANTLR start "rule__StringField__Group__1"
    // InternalProtokitDSL.g:916:1: rule__StringField__Group__1 : rule__StringField__Group__1__Impl rule__StringField__Group__2 ;
    public final void rule__StringField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:920:1: ( rule__StringField__Group__1__Impl rule__StringField__Group__2 )
            // InternalProtokitDSL.g:921:2: rule__StringField__Group__1__Impl rule__StringField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StringField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__1"


    // $ANTLR start "rule__StringField__Group__1__Impl"
    // InternalProtokitDSL.g:928:1: rule__StringField__Group__1__Impl : ( ( rule__StringField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__StringField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:932:1: ( ( ( rule__StringField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:933:1: ( ( rule__StringField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:933:1: ( ( rule__StringField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:934:2: ( rule__StringField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getStringFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:935:2: ( rule__StringField__IdentityFieldAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProtokitDSL.g:935:3: rule__StringField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__1__Impl"


    // $ANTLR start "rule__StringField__Group__2"
    // InternalProtokitDSL.g:943:1: rule__StringField__Group__2 : rule__StringField__Group__2__Impl rule__StringField__Group__3 ;
    public final void rule__StringField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:947:1: ( rule__StringField__Group__2__Impl rule__StringField__Group__3 )
            // InternalProtokitDSL.g:948:2: rule__StringField__Group__2__Impl rule__StringField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__StringField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__2"


    // $ANTLR start "rule__StringField__Group__2__Impl"
    // InternalProtokitDSL.g:955:1: rule__StringField__Group__2__Impl : ( ( rule__StringField__NameAssignment_2 ) ) ;
    public final void rule__StringField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:959:1: ( ( ( rule__StringField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:960:1: ( ( rule__StringField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:960:1: ( ( rule__StringField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:961:2: ( rule__StringField__NameAssignment_2 )
            {
             before(grammarAccess.getStringFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:962:2: ( rule__StringField__NameAssignment_2 )
            // InternalProtokitDSL.g:962:3: rule__StringField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__2__Impl"


    // $ANTLR start "rule__StringField__Group__3"
    // InternalProtokitDSL.g:970:1: rule__StringField__Group__3 : rule__StringField__Group__3__Impl rule__StringField__Group__4 ;
    public final void rule__StringField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:974:1: ( rule__StringField__Group__3__Impl rule__StringField__Group__4 )
            // InternalProtokitDSL.g:975:2: rule__StringField__Group__3__Impl rule__StringField__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__StringField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__3"


    // $ANTLR start "rule__StringField__Group__3__Impl"
    // InternalProtokitDSL.g:982:1: rule__StringField__Group__3__Impl : ( ':' ) ;
    public final void rule__StringField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:986:1: ( ( ':' ) )
            // InternalProtokitDSL.g:987:1: ( ':' )
            {
            // InternalProtokitDSL.g:987:1: ( ':' )
            // InternalProtokitDSL.g:988:2: ':'
            {
             before(grammarAccess.getStringFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__3__Impl"


    // $ANTLR start "rule__StringField__Group__4"
    // InternalProtokitDSL.g:997:1: rule__StringField__Group__4 : rule__StringField__Group__4__Impl rule__StringField__Group__5 ;
    public final void rule__StringField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1001:1: ( rule__StringField__Group__4__Impl rule__StringField__Group__5 )
            // InternalProtokitDSL.g:1002:2: rule__StringField__Group__4__Impl rule__StringField__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__StringField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__4"


    // $ANTLR start "rule__StringField__Group__4__Impl"
    // InternalProtokitDSL.g:1009:1: rule__StringField__Group__4__Impl : ( 'string' ) ;
    public final void rule__StringField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1013:1: ( ( 'string' ) )
            // InternalProtokitDSL.g:1014:1: ( 'string' )
            {
            // InternalProtokitDSL.g:1014:1: ( 'string' )
            // InternalProtokitDSL.g:1015:2: 'string'
            {
             before(grammarAccess.getStringFieldAccess().getStringKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getStringKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__4__Impl"


    // $ANTLR start "rule__StringField__Group__5"
    // InternalProtokitDSL.g:1024:1: rule__StringField__Group__5 : rule__StringField__Group__5__Impl ;
    public final void rule__StringField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1028:1: ( rule__StringField__Group__5__Impl )
            // InternalProtokitDSL.g:1029:2: rule__StringField__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringField__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__5"


    // $ANTLR start "rule__StringField__Group__5__Impl"
    // InternalProtokitDSL.g:1035:1: rule__StringField__Group__5__Impl : ( ( rule__StringField__Alternatives_5 )? ) ;
    public final void rule__StringField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1039:1: ( ( ( rule__StringField__Alternatives_5 )? ) )
            // InternalProtokitDSL.g:1040:1: ( ( rule__StringField__Alternatives_5 )? )
            {
            // InternalProtokitDSL.g:1040:1: ( ( rule__StringField__Alternatives_5 )? )
            // InternalProtokitDSL.g:1041:2: ( rule__StringField__Alternatives_5 )?
            {
             before(grammarAccess.getStringFieldAccess().getAlternatives_5()); 
            // InternalProtokitDSL.g:1042:2: ( rule__StringField__Alternatives_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProtokitDSL.g:1042:3: rule__StringField__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringField__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringFieldAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group__5__Impl"


    // $ANTLR start "rule__StringField__Group_5_0__0"
    // InternalProtokitDSL.g:1051:1: rule__StringField__Group_5_0__0 : rule__StringField__Group_5_0__0__Impl rule__StringField__Group_5_0__1 ;
    public final void rule__StringField__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1055:1: ( rule__StringField__Group_5_0__0__Impl rule__StringField__Group_5_0__1 )
            // InternalProtokitDSL.g:1056:2: rule__StringField__Group_5_0__0__Impl rule__StringField__Group_5_0__1
            {
            pushFollow(FOLLOW_12);
            rule__StringField__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_0__0"


    // $ANTLR start "rule__StringField__Group_5_0__0__Impl"
    // InternalProtokitDSL.g:1063:1: rule__StringField__Group_5_0__0__Impl : ( '(' ) ;
    public final void rule__StringField__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1067:1: ( ( '(' ) )
            // InternalProtokitDSL.g:1068:1: ( '(' )
            {
            // InternalProtokitDSL.g:1068:1: ( '(' )
            // InternalProtokitDSL.g:1069:2: '('
            {
             before(grammarAccess.getStringFieldAccess().getLeftParenthesisKeyword_5_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getLeftParenthesisKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_0__0__Impl"


    // $ANTLR start "rule__StringField__Group_5_0__1"
    // InternalProtokitDSL.g:1078:1: rule__StringField__Group_5_0__1 : rule__StringField__Group_5_0__1__Impl rule__StringField__Group_5_0__2 ;
    public final void rule__StringField__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1082:1: ( rule__StringField__Group_5_0__1__Impl rule__StringField__Group_5_0__2 )
            // InternalProtokitDSL.g:1083:2: rule__StringField__Group_5_0__1__Impl rule__StringField__Group_5_0__2
            {
            pushFollow(FOLLOW_13);
            rule__StringField__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_0__1"


    // $ANTLR start "rule__StringField__Group_5_0__1__Impl"
    // InternalProtokitDSL.g:1090:1: rule__StringField__Group_5_0__1__Impl : ( ( rule__StringField__ByteLenAssignment_5_0_1 ) ) ;
    public final void rule__StringField__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1094:1: ( ( ( rule__StringField__ByteLenAssignment_5_0_1 ) ) )
            // InternalProtokitDSL.g:1095:1: ( ( rule__StringField__ByteLenAssignment_5_0_1 ) )
            {
            // InternalProtokitDSL.g:1095:1: ( ( rule__StringField__ByteLenAssignment_5_0_1 ) )
            // InternalProtokitDSL.g:1096:2: ( rule__StringField__ByteLenAssignment_5_0_1 )
            {
             before(grammarAccess.getStringFieldAccess().getByteLenAssignment_5_0_1()); 
            // InternalProtokitDSL.g:1097:2: ( rule__StringField__ByteLenAssignment_5_0_1 )
            // InternalProtokitDSL.g:1097:3: rule__StringField__ByteLenAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__StringField__ByteLenAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStringFieldAccess().getByteLenAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_0__1__Impl"


    // $ANTLR start "rule__StringField__Group_5_0__2"
    // InternalProtokitDSL.g:1105:1: rule__StringField__Group_5_0__2 : rule__StringField__Group_5_0__2__Impl ;
    public final void rule__StringField__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1109:1: ( rule__StringField__Group_5_0__2__Impl )
            // InternalProtokitDSL.g:1110:2: rule__StringField__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_0__2"


    // $ANTLR start "rule__StringField__Group_5_0__2__Impl"
    // InternalProtokitDSL.g:1116:1: rule__StringField__Group_5_0__2__Impl : ( ')' ) ;
    public final void rule__StringField__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1120:1: ( ( ')' ) )
            // InternalProtokitDSL.g:1121:1: ( ')' )
            {
            // InternalProtokitDSL.g:1121:1: ( ')' )
            // InternalProtokitDSL.g:1122:2: ')'
            {
             before(grammarAccess.getStringFieldAccess().getRightParenthesisKeyword_5_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getRightParenthesisKeyword_5_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_0__2__Impl"


    // $ANTLR start "rule__StringField__Group_5_1__0"
    // InternalProtokitDSL.g:1132:1: rule__StringField__Group_5_1__0 : rule__StringField__Group_5_1__0__Impl rule__StringField__Group_5_1__1 ;
    public final void rule__StringField__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1136:1: ( rule__StringField__Group_5_1__0__Impl rule__StringField__Group_5_1__1 )
            // InternalProtokitDSL.g:1137:2: rule__StringField__Group_5_1__0__Impl rule__StringField__Group_5_1__1
            {
            pushFollow(FOLLOW_15);
            rule__StringField__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__0"


    // $ANTLR start "rule__StringField__Group_5_1__0__Impl"
    // InternalProtokitDSL.g:1144:1: rule__StringField__Group_5_1__0__Impl : ( '(' ) ;
    public final void rule__StringField__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1148:1: ( ( '(' ) )
            // InternalProtokitDSL.g:1149:1: ( '(' )
            {
            // InternalProtokitDSL.g:1149:1: ( '(' )
            // InternalProtokitDSL.g:1150:2: '('
            {
             before(grammarAccess.getStringFieldAccess().getLeftParenthesisKeyword_5_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getLeftParenthesisKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__0__Impl"


    // $ANTLR start "rule__StringField__Group_5_1__1"
    // InternalProtokitDSL.g:1159:1: rule__StringField__Group_5_1__1 : rule__StringField__Group_5_1__1__Impl rule__StringField__Group_5_1__2 ;
    public final void rule__StringField__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1163:1: ( rule__StringField__Group_5_1__1__Impl rule__StringField__Group_5_1__2 )
            // InternalProtokitDSL.g:1164:2: rule__StringField__Group_5_1__1__Impl rule__StringField__Group_5_1__2
            {
            pushFollow(FOLLOW_15);
            rule__StringField__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__1"


    // $ANTLR start "rule__StringField__Group_5_1__1__Impl"
    // InternalProtokitDSL.g:1171:1: rule__StringField__Group_5_1__1__Impl : ( ( rule__StringField__UnboundedAssignment_5_1_1 )? ) ;
    public final void rule__StringField__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1175:1: ( ( ( rule__StringField__UnboundedAssignment_5_1_1 )? ) )
            // InternalProtokitDSL.g:1176:1: ( ( rule__StringField__UnboundedAssignment_5_1_1 )? )
            {
            // InternalProtokitDSL.g:1176:1: ( ( rule__StringField__UnboundedAssignment_5_1_1 )? )
            // InternalProtokitDSL.g:1177:2: ( rule__StringField__UnboundedAssignment_5_1_1 )?
            {
             before(grammarAccess.getStringFieldAccess().getUnboundedAssignment_5_1_1()); 
            // InternalProtokitDSL.g:1178:2: ( rule__StringField__UnboundedAssignment_5_1_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProtokitDSL.g:1178:3: rule__StringField__UnboundedAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringField__UnboundedAssignment_5_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringFieldAccess().getUnboundedAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__1__Impl"


    // $ANTLR start "rule__StringField__Group_5_1__2"
    // InternalProtokitDSL.g:1186:1: rule__StringField__Group_5_1__2 : rule__StringField__Group_5_1__2__Impl rule__StringField__Group_5_1__3 ;
    public final void rule__StringField__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1190:1: ( rule__StringField__Group_5_1__2__Impl rule__StringField__Group_5_1__3 )
            // InternalProtokitDSL.g:1191:2: rule__StringField__Group_5_1__2__Impl rule__StringField__Group_5_1__3
            {
            pushFollow(FOLLOW_16);
            rule__StringField__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__2"


    // $ANTLR start "rule__StringField__Group_5_1__2__Impl"
    // InternalProtokitDSL.g:1198:1: rule__StringField__Group_5_1__2__Impl : ( ')' ) ;
    public final void rule__StringField__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1202:1: ( ( ')' ) )
            // InternalProtokitDSL.g:1203:1: ( ')' )
            {
            // InternalProtokitDSL.g:1203:1: ( ')' )
            // InternalProtokitDSL.g:1204:2: ')'
            {
             before(grammarAccess.getStringFieldAccess().getRightParenthesisKeyword_5_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getRightParenthesisKeyword_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__2__Impl"


    // $ANTLR start "rule__StringField__Group_5_1__3"
    // InternalProtokitDSL.g:1213:1: rule__StringField__Group_5_1__3 : rule__StringField__Group_5_1__3__Impl ;
    public final void rule__StringField__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1217:1: ( rule__StringField__Group_5_1__3__Impl )
            // InternalProtokitDSL.g:1218:2: rule__StringField__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringField__Group_5_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__3"


    // $ANTLR start "rule__StringField__Group_5_1__3__Impl"
    // InternalProtokitDSL.g:1224:1: rule__StringField__Group_5_1__3__Impl : ( ( rule__StringField__FormatterAssignment_5_1_3 ) ) ;
    public final void rule__StringField__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1228:1: ( ( ( rule__StringField__FormatterAssignment_5_1_3 ) ) )
            // InternalProtokitDSL.g:1229:1: ( ( rule__StringField__FormatterAssignment_5_1_3 ) )
            {
            // InternalProtokitDSL.g:1229:1: ( ( rule__StringField__FormatterAssignment_5_1_3 ) )
            // InternalProtokitDSL.g:1230:2: ( rule__StringField__FormatterAssignment_5_1_3 )
            {
             before(grammarAccess.getStringFieldAccess().getFormatterAssignment_5_1_3()); 
            // InternalProtokitDSL.g:1231:2: ( rule__StringField__FormatterAssignment_5_1_3 )
            // InternalProtokitDSL.g:1231:3: rule__StringField__FormatterAssignment_5_1_3
            {
            pushFollow(FOLLOW_2);
            rule__StringField__FormatterAssignment_5_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStringFieldAccess().getFormatterAssignment_5_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__Group_5_1__3__Impl"


    // $ANTLR start "rule__BinaryField__Group__0"
    // InternalProtokitDSL.g:1240:1: rule__BinaryField__Group__0 : rule__BinaryField__Group__0__Impl rule__BinaryField__Group__1 ;
    public final void rule__BinaryField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1244:1: ( rule__BinaryField__Group__0__Impl rule__BinaryField__Group__1 )
            // InternalProtokitDSL.g:1245:2: rule__BinaryField__Group__0__Impl rule__BinaryField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BinaryField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__0"


    // $ANTLR start "rule__BinaryField__Group__0__Impl"
    // InternalProtokitDSL.g:1252:1: rule__BinaryField__Group__0__Impl : ( ( rule__BinaryField__TransientFieldAssignment_0 )? ) ;
    public final void rule__BinaryField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1256:1: ( ( ( rule__BinaryField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:1257:1: ( ( rule__BinaryField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:1257:1: ( ( rule__BinaryField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:1258:2: ( rule__BinaryField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getBinaryFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:1259:2: ( rule__BinaryField__TransientFieldAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProtokitDSL.g:1259:3: rule__BinaryField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__0__Impl"


    // $ANTLR start "rule__BinaryField__Group__1"
    // InternalProtokitDSL.g:1267:1: rule__BinaryField__Group__1 : rule__BinaryField__Group__1__Impl rule__BinaryField__Group__2 ;
    public final void rule__BinaryField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1271:1: ( rule__BinaryField__Group__1__Impl rule__BinaryField__Group__2 )
            // InternalProtokitDSL.g:1272:2: rule__BinaryField__Group__1__Impl rule__BinaryField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BinaryField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__1"


    // $ANTLR start "rule__BinaryField__Group__1__Impl"
    // InternalProtokitDSL.g:1279:1: rule__BinaryField__Group__1__Impl : ( ( rule__BinaryField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__BinaryField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1283:1: ( ( ( rule__BinaryField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:1284:1: ( ( rule__BinaryField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:1284:1: ( ( rule__BinaryField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:1285:2: ( rule__BinaryField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getBinaryFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:1286:2: ( rule__BinaryField__IdentityFieldAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProtokitDSL.g:1286:3: rule__BinaryField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__1__Impl"


    // $ANTLR start "rule__BinaryField__Group__2"
    // InternalProtokitDSL.g:1294:1: rule__BinaryField__Group__2 : rule__BinaryField__Group__2__Impl rule__BinaryField__Group__3 ;
    public final void rule__BinaryField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1298:1: ( rule__BinaryField__Group__2__Impl rule__BinaryField__Group__3 )
            // InternalProtokitDSL.g:1299:2: rule__BinaryField__Group__2__Impl rule__BinaryField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BinaryField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__2"


    // $ANTLR start "rule__BinaryField__Group__2__Impl"
    // InternalProtokitDSL.g:1306:1: rule__BinaryField__Group__2__Impl : ( ( rule__BinaryField__NameAssignment_2 ) ) ;
    public final void rule__BinaryField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1310:1: ( ( ( rule__BinaryField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:1311:1: ( ( rule__BinaryField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:1311:1: ( ( rule__BinaryField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:1312:2: ( rule__BinaryField__NameAssignment_2 )
            {
             before(grammarAccess.getBinaryFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:1313:2: ( rule__BinaryField__NameAssignment_2 )
            // InternalProtokitDSL.g:1313:3: rule__BinaryField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__2__Impl"


    // $ANTLR start "rule__BinaryField__Group__3"
    // InternalProtokitDSL.g:1321:1: rule__BinaryField__Group__3 : rule__BinaryField__Group__3__Impl rule__BinaryField__Group__4 ;
    public final void rule__BinaryField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1325:1: ( rule__BinaryField__Group__3__Impl rule__BinaryField__Group__4 )
            // InternalProtokitDSL.g:1326:2: rule__BinaryField__Group__3__Impl rule__BinaryField__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__BinaryField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__3"


    // $ANTLR start "rule__BinaryField__Group__3__Impl"
    // InternalProtokitDSL.g:1333:1: rule__BinaryField__Group__3__Impl : ( ':' ) ;
    public final void rule__BinaryField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1337:1: ( ( ':' ) )
            // InternalProtokitDSL.g:1338:1: ( ':' )
            {
            // InternalProtokitDSL.g:1338:1: ( ':' )
            // InternalProtokitDSL.g:1339:2: ':'
            {
             before(grammarAccess.getBinaryFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__3__Impl"


    // $ANTLR start "rule__BinaryField__Group__4"
    // InternalProtokitDSL.g:1348:1: rule__BinaryField__Group__4 : rule__BinaryField__Group__4__Impl rule__BinaryField__Group__5 ;
    public final void rule__BinaryField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1352:1: ( rule__BinaryField__Group__4__Impl rule__BinaryField__Group__5 )
            // InternalProtokitDSL.g:1353:2: rule__BinaryField__Group__4__Impl rule__BinaryField__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__BinaryField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__4"


    // $ANTLR start "rule__BinaryField__Group__4__Impl"
    // InternalProtokitDSL.g:1360:1: rule__BinaryField__Group__4__Impl : ( 'binary' ) ;
    public final void rule__BinaryField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1364:1: ( ( 'binary' ) )
            // InternalProtokitDSL.g:1365:1: ( 'binary' )
            {
            // InternalProtokitDSL.g:1365:1: ( 'binary' )
            // InternalProtokitDSL.g:1366:2: 'binary'
            {
             before(grammarAccess.getBinaryFieldAccess().getBinaryKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getBinaryKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__4__Impl"


    // $ANTLR start "rule__BinaryField__Group__5"
    // InternalProtokitDSL.g:1375:1: rule__BinaryField__Group__5 : rule__BinaryField__Group__5__Impl ;
    public final void rule__BinaryField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1379:1: ( rule__BinaryField__Group__5__Impl )
            // InternalProtokitDSL.g:1380:2: rule__BinaryField__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__5"


    // $ANTLR start "rule__BinaryField__Group__5__Impl"
    // InternalProtokitDSL.g:1386:1: rule__BinaryField__Group__5__Impl : ( ( rule__BinaryField__Alternatives_5 ) ) ;
    public final void rule__BinaryField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1390:1: ( ( ( rule__BinaryField__Alternatives_5 ) ) )
            // InternalProtokitDSL.g:1391:1: ( ( rule__BinaryField__Alternatives_5 ) )
            {
            // InternalProtokitDSL.g:1391:1: ( ( rule__BinaryField__Alternatives_5 ) )
            // InternalProtokitDSL.g:1392:2: ( rule__BinaryField__Alternatives_5 )
            {
             before(grammarAccess.getBinaryFieldAccess().getAlternatives_5()); 
            // InternalProtokitDSL.g:1393:2: ( rule__BinaryField__Alternatives_5 )
            // InternalProtokitDSL.g:1393:3: rule__BinaryField__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryFieldAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group__5__Impl"


    // $ANTLR start "rule__BinaryField__Group_5_0__0"
    // InternalProtokitDSL.g:1402:1: rule__BinaryField__Group_5_0__0 : rule__BinaryField__Group_5_0__0__Impl rule__BinaryField__Group_5_0__1 ;
    public final void rule__BinaryField__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1406:1: ( rule__BinaryField__Group_5_0__0__Impl rule__BinaryField__Group_5_0__1 )
            // InternalProtokitDSL.g:1407:2: rule__BinaryField__Group_5_0__0__Impl rule__BinaryField__Group_5_0__1
            {
            pushFollow(FOLLOW_12);
            rule__BinaryField__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_0__0"


    // $ANTLR start "rule__BinaryField__Group_5_0__0__Impl"
    // InternalProtokitDSL.g:1414:1: rule__BinaryField__Group_5_0__0__Impl : ( '(' ) ;
    public final void rule__BinaryField__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1418:1: ( ( '(' ) )
            // InternalProtokitDSL.g:1419:1: ( '(' )
            {
            // InternalProtokitDSL.g:1419:1: ( '(' )
            // InternalProtokitDSL.g:1420:2: '('
            {
             before(grammarAccess.getBinaryFieldAccess().getLeftParenthesisKeyword_5_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getLeftParenthesisKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_0__0__Impl"


    // $ANTLR start "rule__BinaryField__Group_5_0__1"
    // InternalProtokitDSL.g:1429:1: rule__BinaryField__Group_5_0__1 : rule__BinaryField__Group_5_0__1__Impl rule__BinaryField__Group_5_0__2 ;
    public final void rule__BinaryField__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1433:1: ( rule__BinaryField__Group_5_0__1__Impl rule__BinaryField__Group_5_0__2 )
            // InternalProtokitDSL.g:1434:2: rule__BinaryField__Group_5_0__1__Impl rule__BinaryField__Group_5_0__2
            {
            pushFollow(FOLLOW_13);
            rule__BinaryField__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group_5_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_0__1"


    // $ANTLR start "rule__BinaryField__Group_5_0__1__Impl"
    // InternalProtokitDSL.g:1441:1: rule__BinaryField__Group_5_0__1__Impl : ( ( rule__BinaryField__ByteLenAssignment_5_0_1 ) ) ;
    public final void rule__BinaryField__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1445:1: ( ( ( rule__BinaryField__ByteLenAssignment_5_0_1 ) ) )
            // InternalProtokitDSL.g:1446:1: ( ( rule__BinaryField__ByteLenAssignment_5_0_1 ) )
            {
            // InternalProtokitDSL.g:1446:1: ( ( rule__BinaryField__ByteLenAssignment_5_0_1 ) )
            // InternalProtokitDSL.g:1447:2: ( rule__BinaryField__ByteLenAssignment_5_0_1 )
            {
             before(grammarAccess.getBinaryFieldAccess().getByteLenAssignment_5_0_1()); 
            // InternalProtokitDSL.g:1448:2: ( rule__BinaryField__ByteLenAssignment_5_0_1 )
            // InternalProtokitDSL.g:1448:3: rule__BinaryField__ByteLenAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__ByteLenAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryFieldAccess().getByteLenAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_0__1__Impl"


    // $ANTLR start "rule__BinaryField__Group_5_0__2"
    // InternalProtokitDSL.g:1456:1: rule__BinaryField__Group_5_0__2 : rule__BinaryField__Group_5_0__2__Impl ;
    public final void rule__BinaryField__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1460:1: ( rule__BinaryField__Group_5_0__2__Impl )
            // InternalProtokitDSL.g:1461:2: rule__BinaryField__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__Group_5_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_0__2"


    // $ANTLR start "rule__BinaryField__Group_5_0__2__Impl"
    // InternalProtokitDSL.g:1467:1: rule__BinaryField__Group_5_0__2__Impl : ( ')' ) ;
    public final void rule__BinaryField__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1471:1: ( ( ')' ) )
            // InternalProtokitDSL.g:1472:1: ( ')' )
            {
            // InternalProtokitDSL.g:1472:1: ( ')' )
            // InternalProtokitDSL.g:1473:2: ')'
            {
             before(grammarAccess.getBinaryFieldAccess().getRightParenthesisKeyword_5_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getRightParenthesisKeyword_5_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_0__2__Impl"


    // $ANTLR start "rule__BinaryField__Group_5_1__0"
    // InternalProtokitDSL.g:1483:1: rule__BinaryField__Group_5_1__0 : rule__BinaryField__Group_5_1__0__Impl rule__BinaryField__Group_5_1__1 ;
    public final void rule__BinaryField__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1487:1: ( rule__BinaryField__Group_5_1__0__Impl rule__BinaryField__Group_5_1__1 )
            // InternalProtokitDSL.g:1488:2: rule__BinaryField__Group_5_1__0__Impl rule__BinaryField__Group_5_1__1
            {
            pushFollow(FOLLOW_15);
            rule__BinaryField__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_1__0"


    // $ANTLR start "rule__BinaryField__Group_5_1__0__Impl"
    // InternalProtokitDSL.g:1495:1: rule__BinaryField__Group_5_1__0__Impl : ( '(' ) ;
    public final void rule__BinaryField__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1499:1: ( ( '(' ) )
            // InternalProtokitDSL.g:1500:1: ( '(' )
            {
            // InternalProtokitDSL.g:1500:1: ( '(' )
            // InternalProtokitDSL.g:1501:2: '('
            {
             before(grammarAccess.getBinaryFieldAccess().getLeftParenthesisKeyword_5_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getLeftParenthesisKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_1__0__Impl"


    // $ANTLR start "rule__BinaryField__Group_5_1__1"
    // InternalProtokitDSL.g:1510:1: rule__BinaryField__Group_5_1__1 : rule__BinaryField__Group_5_1__1__Impl rule__BinaryField__Group_5_1__2 ;
    public final void rule__BinaryField__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1514:1: ( rule__BinaryField__Group_5_1__1__Impl rule__BinaryField__Group_5_1__2 )
            // InternalProtokitDSL.g:1515:2: rule__BinaryField__Group_5_1__1__Impl rule__BinaryField__Group_5_1__2
            {
            pushFollow(FOLLOW_15);
            rule__BinaryField__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryField__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_1__1"


    // $ANTLR start "rule__BinaryField__Group_5_1__1__Impl"
    // InternalProtokitDSL.g:1522:1: rule__BinaryField__Group_5_1__1__Impl : ( ( rule__BinaryField__UnboundedAssignment_5_1_1 )? ) ;
    public final void rule__BinaryField__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1526:1: ( ( ( rule__BinaryField__UnboundedAssignment_5_1_1 )? ) )
            // InternalProtokitDSL.g:1527:1: ( ( rule__BinaryField__UnboundedAssignment_5_1_1 )? )
            {
            // InternalProtokitDSL.g:1527:1: ( ( rule__BinaryField__UnboundedAssignment_5_1_1 )? )
            // InternalProtokitDSL.g:1528:2: ( rule__BinaryField__UnboundedAssignment_5_1_1 )?
            {
             before(grammarAccess.getBinaryFieldAccess().getUnboundedAssignment_5_1_1()); 
            // InternalProtokitDSL.g:1529:2: ( rule__BinaryField__UnboundedAssignment_5_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProtokitDSL.g:1529:3: rule__BinaryField__UnboundedAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryField__UnboundedAssignment_5_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryFieldAccess().getUnboundedAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_1__1__Impl"


    // $ANTLR start "rule__BinaryField__Group_5_1__2"
    // InternalProtokitDSL.g:1537:1: rule__BinaryField__Group_5_1__2 : rule__BinaryField__Group_5_1__2__Impl ;
    public final void rule__BinaryField__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1541:1: ( rule__BinaryField__Group_5_1__2__Impl )
            // InternalProtokitDSL.g:1542:2: rule__BinaryField__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryField__Group_5_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_1__2"


    // $ANTLR start "rule__BinaryField__Group_5_1__2__Impl"
    // InternalProtokitDSL.g:1548:1: rule__BinaryField__Group_5_1__2__Impl : ( ')' ) ;
    public final void rule__BinaryField__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1552:1: ( ( ')' ) )
            // InternalProtokitDSL.g:1553:1: ( ')' )
            {
            // InternalProtokitDSL.g:1553:1: ( ')' )
            // InternalProtokitDSL.g:1554:2: ')'
            {
             before(grammarAccess.getBinaryFieldAccess().getRightParenthesisKeyword_5_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getRightParenthesisKeyword_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__Group_5_1__2__Impl"


    // $ANTLR start "rule__BitField__Group__0"
    // InternalProtokitDSL.g:1564:1: rule__BitField__Group__0 : rule__BitField__Group__0__Impl rule__BitField__Group__1 ;
    public final void rule__BitField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1568:1: ( rule__BitField__Group__0__Impl rule__BitField__Group__1 )
            // InternalProtokitDSL.g:1569:2: rule__BitField__Group__0__Impl rule__BitField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BitField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__0"


    // $ANTLR start "rule__BitField__Group__0__Impl"
    // InternalProtokitDSL.g:1576:1: rule__BitField__Group__0__Impl : ( ( rule__BitField__TransientFieldAssignment_0 )? ) ;
    public final void rule__BitField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1580:1: ( ( ( rule__BitField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:1581:1: ( ( rule__BitField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:1581:1: ( ( rule__BitField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:1582:2: ( rule__BitField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getBitFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:1583:2: ( rule__BitField__TransientFieldAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProtokitDSL.g:1583:3: rule__BitField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BitField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBitFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__0__Impl"


    // $ANTLR start "rule__BitField__Group__1"
    // InternalProtokitDSL.g:1591:1: rule__BitField__Group__1 : rule__BitField__Group__1__Impl rule__BitField__Group__2 ;
    public final void rule__BitField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1595:1: ( rule__BitField__Group__1__Impl rule__BitField__Group__2 )
            // InternalProtokitDSL.g:1596:2: rule__BitField__Group__1__Impl rule__BitField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BitField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__1"


    // $ANTLR start "rule__BitField__Group__1__Impl"
    // InternalProtokitDSL.g:1603:1: rule__BitField__Group__1__Impl : ( ( rule__BitField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__BitField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1607:1: ( ( ( rule__BitField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:1608:1: ( ( rule__BitField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:1608:1: ( ( rule__BitField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:1609:2: ( rule__BitField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getBitFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:1610:2: ( rule__BitField__IdentityFieldAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProtokitDSL.g:1610:3: rule__BitField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BitField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBitFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__1__Impl"


    // $ANTLR start "rule__BitField__Group__2"
    // InternalProtokitDSL.g:1618:1: rule__BitField__Group__2 : rule__BitField__Group__2__Impl rule__BitField__Group__3 ;
    public final void rule__BitField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1622:1: ( rule__BitField__Group__2__Impl rule__BitField__Group__3 )
            // InternalProtokitDSL.g:1623:2: rule__BitField__Group__2__Impl rule__BitField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BitField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__2"


    // $ANTLR start "rule__BitField__Group__2__Impl"
    // InternalProtokitDSL.g:1630:1: rule__BitField__Group__2__Impl : ( ( rule__BitField__NameAssignment_2 ) ) ;
    public final void rule__BitField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1634:1: ( ( ( rule__BitField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:1635:1: ( ( rule__BitField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:1635:1: ( ( rule__BitField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:1636:2: ( rule__BitField__NameAssignment_2 )
            {
             before(grammarAccess.getBitFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:1637:2: ( rule__BitField__NameAssignment_2 )
            // InternalProtokitDSL.g:1637:3: rule__BitField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BitField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBitFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__2__Impl"


    // $ANTLR start "rule__BitField__Group__3"
    // InternalProtokitDSL.g:1645:1: rule__BitField__Group__3 : rule__BitField__Group__3__Impl rule__BitField__Group__4 ;
    public final void rule__BitField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1649:1: ( rule__BitField__Group__3__Impl rule__BitField__Group__4 )
            // InternalProtokitDSL.g:1650:2: rule__BitField__Group__3__Impl rule__BitField__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__BitField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__3"


    // $ANTLR start "rule__BitField__Group__3__Impl"
    // InternalProtokitDSL.g:1657:1: rule__BitField__Group__3__Impl : ( ':' ) ;
    public final void rule__BitField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1661:1: ( ( ':' ) )
            // InternalProtokitDSL.g:1662:1: ( ':' )
            {
            // InternalProtokitDSL.g:1662:1: ( ':' )
            // InternalProtokitDSL.g:1663:2: ':'
            {
             before(grammarAccess.getBitFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__3__Impl"


    // $ANTLR start "rule__BitField__Group__4"
    // InternalProtokitDSL.g:1672:1: rule__BitField__Group__4 : rule__BitField__Group__4__Impl rule__BitField__Group__5 ;
    public final void rule__BitField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1676:1: ( rule__BitField__Group__4__Impl rule__BitField__Group__5 )
            // InternalProtokitDSL.g:1677:2: rule__BitField__Group__4__Impl rule__BitField__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__BitField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__4"


    // $ANTLR start "rule__BitField__Group__4__Impl"
    // InternalProtokitDSL.g:1684:1: rule__BitField__Group__4__Impl : ( 'bitfield' ) ;
    public final void rule__BitField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1688:1: ( ( 'bitfield' ) )
            // InternalProtokitDSL.g:1689:1: ( 'bitfield' )
            {
            // InternalProtokitDSL.g:1689:1: ( 'bitfield' )
            // InternalProtokitDSL.g:1690:2: 'bitfield'
            {
             before(grammarAccess.getBitFieldAccess().getBitfieldKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getBitfieldKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__4__Impl"


    // $ANTLR start "rule__BitField__Group__5"
    // InternalProtokitDSL.g:1699:1: rule__BitField__Group__5 : rule__BitField__Group__5__Impl rule__BitField__Group__6 ;
    public final void rule__BitField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1703:1: ( rule__BitField__Group__5__Impl rule__BitField__Group__6 )
            // InternalProtokitDSL.g:1704:2: rule__BitField__Group__5__Impl rule__BitField__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__BitField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__5"


    // $ANTLR start "rule__BitField__Group__5__Impl"
    // InternalProtokitDSL.g:1711:1: rule__BitField__Group__5__Impl : ( '{' ) ;
    public final void rule__BitField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1715:1: ( ( '{' ) )
            // InternalProtokitDSL.g:1716:1: ( '{' )
            {
            // InternalProtokitDSL.g:1716:1: ( '{' )
            // InternalProtokitDSL.g:1717:2: '{'
            {
             before(grammarAccess.getBitFieldAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__5__Impl"


    // $ANTLR start "rule__BitField__Group__6"
    // InternalProtokitDSL.g:1726:1: rule__BitField__Group__6 : rule__BitField__Group__6__Impl rule__BitField__Group__7 ;
    public final void rule__BitField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1730:1: ( rule__BitField__Group__6__Impl rule__BitField__Group__7 )
            // InternalProtokitDSL.g:1731:2: rule__BitField__Group__6__Impl rule__BitField__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__BitField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__6"


    // $ANTLR start "rule__BitField__Group__6__Impl"
    // InternalProtokitDSL.g:1738:1: rule__BitField__Group__6__Impl : ( ( ( rule__BitField__ComponentsAssignment_6 ) ) ( ( rule__BitField__ComponentsAssignment_6 )* ) ) ;
    public final void rule__BitField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1742:1: ( ( ( ( rule__BitField__ComponentsAssignment_6 ) ) ( ( rule__BitField__ComponentsAssignment_6 )* ) ) )
            // InternalProtokitDSL.g:1743:1: ( ( ( rule__BitField__ComponentsAssignment_6 ) ) ( ( rule__BitField__ComponentsAssignment_6 )* ) )
            {
            // InternalProtokitDSL.g:1743:1: ( ( ( rule__BitField__ComponentsAssignment_6 ) ) ( ( rule__BitField__ComponentsAssignment_6 )* ) )
            // InternalProtokitDSL.g:1744:2: ( ( rule__BitField__ComponentsAssignment_6 ) ) ( ( rule__BitField__ComponentsAssignment_6 )* )
            {
            // InternalProtokitDSL.g:1744:2: ( ( rule__BitField__ComponentsAssignment_6 ) )
            // InternalProtokitDSL.g:1745:3: ( rule__BitField__ComponentsAssignment_6 )
            {
             before(grammarAccess.getBitFieldAccess().getComponentsAssignment_6()); 
            // InternalProtokitDSL.g:1746:3: ( rule__BitField__ComponentsAssignment_6 )
            // InternalProtokitDSL.g:1746:4: rule__BitField__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_19);
            rule__BitField__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBitFieldAccess().getComponentsAssignment_6()); 

            }

            // InternalProtokitDSL.g:1749:2: ( ( rule__BitField__ComponentsAssignment_6 )* )
            // InternalProtokitDSL.g:1750:3: ( rule__BitField__ComponentsAssignment_6 )*
            {
             before(grammarAccess.getBitFieldAccess().getComponentsAssignment_6()); 
            // InternalProtokitDSL.g:1751:3: ( rule__BitField__ComponentsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalProtokitDSL.g:1751:4: rule__BitField__ComponentsAssignment_6
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BitField__ComponentsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBitFieldAccess().getComponentsAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__6__Impl"


    // $ANTLR start "rule__BitField__Group__7"
    // InternalProtokitDSL.g:1760:1: rule__BitField__Group__7 : rule__BitField__Group__7__Impl ;
    public final void rule__BitField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1764:1: ( rule__BitField__Group__7__Impl )
            // InternalProtokitDSL.g:1765:2: rule__BitField__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BitField__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__7"


    // $ANTLR start "rule__BitField__Group__7__Impl"
    // InternalProtokitDSL.g:1771:1: rule__BitField__Group__7__Impl : ( '}' ) ;
    public final void rule__BitField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1775:1: ( ( '}' ) )
            // InternalProtokitDSL.g:1776:1: ( '}' )
            {
            // InternalProtokitDSL.g:1776:1: ( '}' )
            // InternalProtokitDSL.g:1777:2: '}'
            {
             before(grammarAccess.getBitFieldAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__Group__7__Impl"


    // $ANTLR start "rule__BitfieldComponent__Group__0"
    // InternalProtokitDSL.g:1787:1: rule__BitfieldComponent__Group__0 : rule__BitfieldComponent__Group__0__Impl rule__BitfieldComponent__Group__1 ;
    public final void rule__BitfieldComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1791:1: ( rule__BitfieldComponent__Group__0__Impl rule__BitfieldComponent__Group__1 )
            // InternalProtokitDSL.g:1792:2: rule__BitfieldComponent__Group__0__Impl rule__BitfieldComponent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BitfieldComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitfieldComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__Group__0"


    // $ANTLR start "rule__BitfieldComponent__Group__0__Impl"
    // InternalProtokitDSL.g:1799:1: rule__BitfieldComponent__Group__0__Impl : ( ( rule__BitfieldComponent__NameAssignment_0 ) ) ;
    public final void rule__BitfieldComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1803:1: ( ( ( rule__BitfieldComponent__NameAssignment_0 ) ) )
            // InternalProtokitDSL.g:1804:1: ( ( rule__BitfieldComponent__NameAssignment_0 ) )
            {
            // InternalProtokitDSL.g:1804:1: ( ( rule__BitfieldComponent__NameAssignment_0 ) )
            // InternalProtokitDSL.g:1805:2: ( rule__BitfieldComponent__NameAssignment_0 )
            {
             before(grammarAccess.getBitfieldComponentAccess().getNameAssignment_0()); 
            // InternalProtokitDSL.g:1806:2: ( rule__BitfieldComponent__NameAssignment_0 )
            // InternalProtokitDSL.g:1806:3: rule__BitfieldComponent__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BitfieldComponent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBitfieldComponentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__Group__0__Impl"


    // $ANTLR start "rule__BitfieldComponent__Group__1"
    // InternalProtokitDSL.g:1814:1: rule__BitfieldComponent__Group__1 : rule__BitfieldComponent__Group__1__Impl rule__BitfieldComponent__Group__2 ;
    public final void rule__BitfieldComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1818:1: ( rule__BitfieldComponent__Group__1__Impl rule__BitfieldComponent__Group__2 )
            // InternalProtokitDSL.g:1819:2: rule__BitfieldComponent__Group__1__Impl rule__BitfieldComponent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BitfieldComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitfieldComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__Group__1"


    // $ANTLR start "rule__BitfieldComponent__Group__1__Impl"
    // InternalProtokitDSL.g:1826:1: rule__BitfieldComponent__Group__1__Impl : ( ':' ) ;
    public final void rule__BitfieldComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1830:1: ( ( ':' ) )
            // InternalProtokitDSL.g:1831:1: ( ':' )
            {
            // InternalProtokitDSL.g:1831:1: ( ':' )
            // InternalProtokitDSL.g:1832:2: ':'
            {
             before(grammarAccess.getBitfieldComponentAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBitfieldComponentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__Group__1__Impl"


    // $ANTLR start "rule__BitfieldComponent__Group__2"
    // InternalProtokitDSL.g:1841:1: rule__BitfieldComponent__Group__2 : rule__BitfieldComponent__Group__2__Impl ;
    public final void rule__BitfieldComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1845:1: ( rule__BitfieldComponent__Group__2__Impl )
            // InternalProtokitDSL.g:1846:2: rule__BitfieldComponent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BitfieldComponent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__Group__2"


    // $ANTLR start "rule__BitfieldComponent__Group__2__Impl"
    // InternalProtokitDSL.g:1852:1: rule__BitfieldComponent__Group__2__Impl : ( ( rule__BitfieldComponent__BitLenAssignment_2 ) ) ;
    public final void rule__BitfieldComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1856:1: ( ( ( rule__BitfieldComponent__BitLenAssignment_2 ) ) )
            // InternalProtokitDSL.g:1857:1: ( ( rule__BitfieldComponent__BitLenAssignment_2 ) )
            {
            // InternalProtokitDSL.g:1857:1: ( ( rule__BitfieldComponent__BitLenAssignment_2 ) )
            // InternalProtokitDSL.g:1858:2: ( rule__BitfieldComponent__BitLenAssignment_2 )
            {
             before(grammarAccess.getBitfieldComponentAccess().getBitLenAssignment_2()); 
            // InternalProtokitDSL.g:1859:2: ( rule__BitfieldComponent__BitLenAssignment_2 )
            // InternalProtokitDSL.g:1859:3: rule__BitfieldComponent__BitLenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BitfieldComponent__BitLenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBitfieldComponentAccess().getBitLenAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__Group__2__Impl"


    // $ANTLR start "rule__ListField__Group__0"
    // InternalProtokitDSL.g:1868:1: rule__ListField__Group__0 : rule__ListField__Group__0__Impl rule__ListField__Group__1 ;
    public final void rule__ListField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1872:1: ( rule__ListField__Group__0__Impl rule__ListField__Group__1 )
            // InternalProtokitDSL.g:1873:2: rule__ListField__Group__0__Impl rule__ListField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ListField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__0"


    // $ANTLR start "rule__ListField__Group__0__Impl"
    // InternalProtokitDSL.g:1880:1: rule__ListField__Group__0__Impl : ( ( rule__ListField__TransientFieldAssignment_0 )? ) ;
    public final void rule__ListField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1884:1: ( ( ( rule__ListField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:1885:1: ( ( rule__ListField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:1885:1: ( ( rule__ListField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:1886:2: ( rule__ListField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getListFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:1887:2: ( rule__ListField__TransientFieldAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProtokitDSL.g:1887:3: rule__ListField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__0__Impl"


    // $ANTLR start "rule__ListField__Group__1"
    // InternalProtokitDSL.g:1895:1: rule__ListField__Group__1 : rule__ListField__Group__1__Impl rule__ListField__Group__2 ;
    public final void rule__ListField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1899:1: ( rule__ListField__Group__1__Impl rule__ListField__Group__2 )
            // InternalProtokitDSL.g:1900:2: rule__ListField__Group__1__Impl rule__ListField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ListField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__1"


    // $ANTLR start "rule__ListField__Group__1__Impl"
    // InternalProtokitDSL.g:1907:1: rule__ListField__Group__1__Impl : ( ( rule__ListField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__ListField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1911:1: ( ( ( rule__ListField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:1912:1: ( ( rule__ListField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:1912:1: ( ( rule__ListField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:1913:2: ( rule__ListField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getListFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:1914:2: ( rule__ListField__IdentityFieldAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProtokitDSL.g:1914:3: rule__ListField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__1__Impl"


    // $ANTLR start "rule__ListField__Group__2"
    // InternalProtokitDSL.g:1922:1: rule__ListField__Group__2 : rule__ListField__Group__2__Impl rule__ListField__Group__3 ;
    public final void rule__ListField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1926:1: ( rule__ListField__Group__2__Impl rule__ListField__Group__3 )
            // InternalProtokitDSL.g:1927:2: rule__ListField__Group__2__Impl rule__ListField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ListField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__2"


    // $ANTLR start "rule__ListField__Group__2__Impl"
    // InternalProtokitDSL.g:1934:1: rule__ListField__Group__2__Impl : ( ( rule__ListField__NameAssignment_2 ) ) ;
    public final void rule__ListField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1938:1: ( ( ( rule__ListField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:1939:1: ( ( rule__ListField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:1939:1: ( ( rule__ListField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:1940:2: ( rule__ListField__NameAssignment_2 )
            {
             before(grammarAccess.getListFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:1941:2: ( rule__ListField__NameAssignment_2 )
            // InternalProtokitDSL.g:1941:3: rule__ListField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__2__Impl"


    // $ANTLR start "rule__ListField__Group__3"
    // InternalProtokitDSL.g:1949:1: rule__ListField__Group__3 : rule__ListField__Group__3__Impl rule__ListField__Group__4 ;
    public final void rule__ListField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1953:1: ( rule__ListField__Group__3__Impl rule__ListField__Group__4 )
            // InternalProtokitDSL.g:1954:2: rule__ListField__Group__3__Impl rule__ListField__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ListField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__3"


    // $ANTLR start "rule__ListField__Group__3__Impl"
    // InternalProtokitDSL.g:1961:1: rule__ListField__Group__3__Impl : ( ':' ) ;
    public final void rule__ListField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1965:1: ( ( ':' ) )
            // InternalProtokitDSL.g:1966:1: ( ':' )
            {
            // InternalProtokitDSL.g:1966:1: ( ':' )
            // InternalProtokitDSL.g:1967:2: ':'
            {
             before(grammarAccess.getListFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__3__Impl"


    // $ANTLR start "rule__ListField__Group__4"
    // InternalProtokitDSL.g:1976:1: rule__ListField__Group__4 : rule__ListField__Group__4__Impl rule__ListField__Group__5 ;
    public final void rule__ListField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1980:1: ( rule__ListField__Group__4__Impl rule__ListField__Group__5 )
            // InternalProtokitDSL.g:1981:2: rule__ListField__Group__4__Impl rule__ListField__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ListField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__4"


    // $ANTLR start "rule__ListField__Group__4__Impl"
    // InternalProtokitDSL.g:1988:1: rule__ListField__Group__4__Impl : ( 'list' ) ;
    public final void rule__ListField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:1992:1: ( ( 'list' ) )
            // InternalProtokitDSL.g:1993:1: ( 'list' )
            {
            // InternalProtokitDSL.g:1993:1: ( 'list' )
            // InternalProtokitDSL.g:1994:2: 'list'
            {
             before(grammarAccess.getListFieldAccess().getListKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getListKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__4__Impl"


    // $ANTLR start "rule__ListField__Group__5"
    // InternalProtokitDSL.g:2003:1: rule__ListField__Group__5 : rule__ListField__Group__5__Impl rule__ListField__Group__6 ;
    public final void rule__ListField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2007:1: ( rule__ListField__Group__5__Impl rule__ListField__Group__6 )
            // InternalProtokitDSL.g:2008:2: rule__ListField__Group__5__Impl rule__ListField__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__ListField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__5"


    // $ANTLR start "rule__ListField__Group__5__Impl"
    // InternalProtokitDSL.g:2015:1: rule__ListField__Group__5__Impl : ( '(' ) ;
    public final void rule__ListField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2019:1: ( ( '(' ) )
            // InternalProtokitDSL.g:2020:1: ( '(' )
            {
            // InternalProtokitDSL.g:2020:1: ( '(' )
            // InternalProtokitDSL.g:2021:2: '('
            {
             before(grammarAccess.getListFieldAccess().getLeftParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__5__Impl"


    // $ANTLR start "rule__ListField__Group__6"
    // InternalProtokitDSL.g:2030:1: rule__ListField__Group__6 : rule__ListField__Group__6__Impl rule__ListField__Group__7 ;
    public final void rule__ListField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2034:1: ( rule__ListField__Group__6__Impl rule__ListField__Group__7 )
            // InternalProtokitDSL.g:2035:2: rule__ListField__Group__6__Impl rule__ListField__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ListField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__6"


    // $ANTLR start "rule__ListField__Group__6__Impl"
    // InternalProtokitDSL.g:2042:1: rule__ListField__Group__6__Impl : ( ( rule__ListField__ElementTypeAssignment_6 ) ) ;
    public final void rule__ListField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2046:1: ( ( ( rule__ListField__ElementTypeAssignment_6 ) ) )
            // InternalProtokitDSL.g:2047:1: ( ( rule__ListField__ElementTypeAssignment_6 ) )
            {
            // InternalProtokitDSL.g:2047:1: ( ( rule__ListField__ElementTypeAssignment_6 ) )
            // InternalProtokitDSL.g:2048:2: ( rule__ListField__ElementTypeAssignment_6 )
            {
             before(grammarAccess.getListFieldAccess().getElementTypeAssignment_6()); 
            // InternalProtokitDSL.g:2049:2: ( rule__ListField__ElementTypeAssignment_6 )
            // InternalProtokitDSL.g:2049:3: rule__ListField__ElementTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ListField__ElementTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getListFieldAccess().getElementTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__6__Impl"


    // $ANTLR start "rule__ListField__Group__7"
    // InternalProtokitDSL.g:2057:1: rule__ListField__Group__7 : rule__ListField__Group__7__Impl ;
    public final void rule__ListField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2061:1: ( rule__ListField__Group__7__Impl )
            // InternalProtokitDSL.g:2062:2: rule__ListField__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListField__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__7"


    // $ANTLR start "rule__ListField__Group__7__Impl"
    // InternalProtokitDSL.g:2068:1: rule__ListField__Group__7__Impl : ( ')' ) ;
    public final void rule__ListField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2072:1: ( ( ')' ) )
            // InternalProtokitDSL.g:2073:1: ( ')' )
            {
            // InternalProtokitDSL.g:2073:1: ( ')' )
            // InternalProtokitDSL.g:2074:2: ')'
            {
             before(grammarAccess.getListFieldAccess().getRightParenthesisKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__Group__7__Impl"


    // $ANTLR start "rule__LengthField__Group__0"
    // InternalProtokitDSL.g:2084:1: rule__LengthField__Group__0 : rule__LengthField__Group__0__Impl rule__LengthField__Group__1 ;
    public final void rule__LengthField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2088:1: ( rule__LengthField__Group__0__Impl rule__LengthField__Group__1 )
            // InternalProtokitDSL.g:2089:2: rule__LengthField__Group__0__Impl rule__LengthField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LengthField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__0"


    // $ANTLR start "rule__LengthField__Group__0__Impl"
    // InternalProtokitDSL.g:2096:1: rule__LengthField__Group__0__Impl : ( ( rule__LengthField__TransientFieldAssignment_0 )? ) ;
    public final void rule__LengthField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2100:1: ( ( ( rule__LengthField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:2101:1: ( ( rule__LengthField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:2101:1: ( ( rule__LengthField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:2102:2: ( rule__LengthField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getLengthFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:2103:2: ( rule__LengthField__TransientFieldAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProtokitDSL.g:2103:3: rule__LengthField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LengthField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLengthFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__0__Impl"


    // $ANTLR start "rule__LengthField__Group__1"
    // InternalProtokitDSL.g:2111:1: rule__LengthField__Group__1 : rule__LengthField__Group__1__Impl rule__LengthField__Group__2 ;
    public final void rule__LengthField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2115:1: ( rule__LengthField__Group__1__Impl rule__LengthField__Group__2 )
            // InternalProtokitDSL.g:2116:2: rule__LengthField__Group__1__Impl rule__LengthField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__LengthField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__1"


    // $ANTLR start "rule__LengthField__Group__1__Impl"
    // InternalProtokitDSL.g:2123:1: rule__LengthField__Group__1__Impl : ( ( rule__LengthField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__LengthField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2127:1: ( ( ( rule__LengthField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:2128:1: ( ( rule__LengthField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:2128:1: ( ( rule__LengthField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:2129:2: ( rule__LengthField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getLengthFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:2130:2: ( rule__LengthField__IdentityFieldAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProtokitDSL.g:2130:3: rule__LengthField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LengthField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLengthFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__1__Impl"


    // $ANTLR start "rule__LengthField__Group__2"
    // InternalProtokitDSL.g:2138:1: rule__LengthField__Group__2 : rule__LengthField__Group__2__Impl rule__LengthField__Group__3 ;
    public final void rule__LengthField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2142:1: ( rule__LengthField__Group__2__Impl rule__LengthField__Group__3 )
            // InternalProtokitDSL.g:2143:2: rule__LengthField__Group__2__Impl rule__LengthField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__LengthField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__2"


    // $ANTLR start "rule__LengthField__Group__2__Impl"
    // InternalProtokitDSL.g:2150:1: rule__LengthField__Group__2__Impl : ( ( rule__LengthField__NameAssignment_2 ) ) ;
    public final void rule__LengthField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2154:1: ( ( ( rule__LengthField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:2155:1: ( ( rule__LengthField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:2155:1: ( ( rule__LengthField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:2156:2: ( rule__LengthField__NameAssignment_2 )
            {
             before(grammarAccess.getLengthFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:2157:2: ( rule__LengthField__NameAssignment_2 )
            // InternalProtokitDSL.g:2157:3: rule__LengthField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LengthField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLengthFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__2__Impl"


    // $ANTLR start "rule__LengthField__Group__3"
    // InternalProtokitDSL.g:2165:1: rule__LengthField__Group__3 : rule__LengthField__Group__3__Impl rule__LengthField__Group__4 ;
    public final void rule__LengthField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2169:1: ( rule__LengthField__Group__3__Impl rule__LengthField__Group__4 )
            // InternalProtokitDSL.g:2170:2: rule__LengthField__Group__3__Impl rule__LengthField__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LengthField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__3"


    // $ANTLR start "rule__LengthField__Group__3__Impl"
    // InternalProtokitDSL.g:2177:1: rule__LengthField__Group__3__Impl : ( ':' ) ;
    public final void rule__LengthField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2181:1: ( ( ':' ) )
            // InternalProtokitDSL.g:2182:1: ( ':' )
            {
            // InternalProtokitDSL.g:2182:1: ( ':' )
            // InternalProtokitDSL.g:2183:2: ':'
            {
             before(grammarAccess.getLengthFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__3__Impl"


    // $ANTLR start "rule__LengthField__Group__4"
    // InternalProtokitDSL.g:2192:1: rule__LengthField__Group__4 : rule__LengthField__Group__4__Impl rule__LengthField__Group__5 ;
    public final void rule__LengthField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2196:1: ( rule__LengthField__Group__4__Impl rule__LengthField__Group__5 )
            // InternalProtokitDSL.g:2197:2: rule__LengthField__Group__4__Impl rule__LengthField__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__LengthField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__4"


    // $ANTLR start "rule__LengthField__Group__4__Impl"
    // InternalProtokitDSL.g:2204:1: rule__LengthField__Group__4__Impl : ( 'length' ) ;
    public final void rule__LengthField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2208:1: ( ( 'length' ) )
            // InternalProtokitDSL.g:2209:1: ( 'length' )
            {
            // InternalProtokitDSL.g:2209:1: ( 'length' )
            // InternalProtokitDSL.g:2210:2: 'length'
            {
             before(grammarAccess.getLengthFieldAccess().getLengthKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getLengthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__4__Impl"


    // $ANTLR start "rule__LengthField__Group__5"
    // InternalProtokitDSL.g:2219:1: rule__LengthField__Group__5 : rule__LengthField__Group__5__Impl rule__LengthField__Group__6 ;
    public final void rule__LengthField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2223:1: ( rule__LengthField__Group__5__Impl rule__LengthField__Group__6 )
            // InternalProtokitDSL.g:2224:2: rule__LengthField__Group__5__Impl rule__LengthField__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__LengthField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__5"


    // $ANTLR start "rule__LengthField__Group__5__Impl"
    // InternalProtokitDSL.g:2231:1: rule__LengthField__Group__5__Impl : ( '(' ) ;
    public final void rule__LengthField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2235:1: ( ( '(' ) )
            // InternalProtokitDSL.g:2236:1: ( '(' )
            {
            // InternalProtokitDSL.g:2236:1: ( '(' )
            // InternalProtokitDSL.g:2237:2: '('
            {
             before(grammarAccess.getLengthFieldAccess().getLeftParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__5__Impl"


    // $ANTLR start "rule__LengthField__Group__6"
    // InternalProtokitDSL.g:2246:1: rule__LengthField__Group__6 : rule__LengthField__Group__6__Impl rule__LengthField__Group__7 ;
    public final void rule__LengthField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2250:1: ( rule__LengthField__Group__6__Impl rule__LengthField__Group__7 )
            // InternalProtokitDSL.g:2251:2: rule__LengthField__Group__6__Impl rule__LengthField__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__LengthField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__6"


    // $ANTLR start "rule__LengthField__Group__6__Impl"
    // InternalProtokitDSL.g:2258:1: rule__LengthField__Group__6__Impl : ( ( rule__LengthField__ByteLenAssignment_6 ) ) ;
    public final void rule__LengthField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2262:1: ( ( ( rule__LengthField__ByteLenAssignment_6 ) ) )
            // InternalProtokitDSL.g:2263:1: ( ( rule__LengthField__ByteLenAssignment_6 ) )
            {
            // InternalProtokitDSL.g:2263:1: ( ( rule__LengthField__ByteLenAssignment_6 ) )
            // InternalProtokitDSL.g:2264:2: ( rule__LengthField__ByteLenAssignment_6 )
            {
             before(grammarAccess.getLengthFieldAccess().getByteLenAssignment_6()); 
            // InternalProtokitDSL.g:2265:2: ( rule__LengthField__ByteLenAssignment_6 )
            // InternalProtokitDSL.g:2265:3: rule__LengthField__ByteLenAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LengthField__ByteLenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLengthFieldAccess().getByteLenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__6__Impl"


    // $ANTLR start "rule__LengthField__Group__7"
    // InternalProtokitDSL.g:2273:1: rule__LengthField__Group__7 : rule__LengthField__Group__7__Impl rule__LengthField__Group__8 ;
    public final void rule__LengthField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2277:1: ( rule__LengthField__Group__7__Impl rule__LengthField__Group__8 )
            // InternalProtokitDSL.g:2278:2: rule__LengthField__Group__7__Impl rule__LengthField__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__LengthField__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__7"


    // $ANTLR start "rule__LengthField__Group__7__Impl"
    // InternalProtokitDSL.g:2285:1: rule__LengthField__Group__7__Impl : ( ',' ) ;
    public final void rule__LengthField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2289:1: ( ( ',' ) )
            // InternalProtokitDSL.g:2290:1: ( ',' )
            {
            // InternalProtokitDSL.g:2290:1: ( ',' )
            // InternalProtokitDSL.g:2291:2: ','
            {
             before(grammarAccess.getLengthFieldAccess().getCommaKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__7__Impl"


    // $ANTLR start "rule__LengthField__Group__8"
    // InternalProtokitDSL.g:2300:1: rule__LengthField__Group__8 : rule__LengthField__Group__8__Impl rule__LengthField__Group__9 ;
    public final void rule__LengthField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2304:1: ( rule__LengthField__Group__8__Impl rule__LengthField__Group__9 )
            // InternalProtokitDSL.g:2305:2: rule__LengthField__Group__8__Impl rule__LengthField__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__LengthField__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthField__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__8"


    // $ANTLR start "rule__LengthField__Group__8__Impl"
    // InternalProtokitDSL.g:2312:1: rule__LengthField__Group__8__Impl : ( ( rule__LengthField__RefAssignment_8 ) ) ;
    public final void rule__LengthField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2316:1: ( ( ( rule__LengthField__RefAssignment_8 ) ) )
            // InternalProtokitDSL.g:2317:1: ( ( rule__LengthField__RefAssignment_8 ) )
            {
            // InternalProtokitDSL.g:2317:1: ( ( rule__LengthField__RefAssignment_8 ) )
            // InternalProtokitDSL.g:2318:2: ( rule__LengthField__RefAssignment_8 )
            {
             before(grammarAccess.getLengthFieldAccess().getRefAssignment_8()); 
            // InternalProtokitDSL.g:2319:2: ( rule__LengthField__RefAssignment_8 )
            // InternalProtokitDSL.g:2319:3: rule__LengthField__RefAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__LengthField__RefAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLengthFieldAccess().getRefAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__8__Impl"


    // $ANTLR start "rule__LengthField__Group__9"
    // InternalProtokitDSL.g:2327:1: rule__LengthField__Group__9 : rule__LengthField__Group__9__Impl ;
    public final void rule__LengthField__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2331:1: ( rule__LengthField__Group__9__Impl )
            // InternalProtokitDSL.g:2332:2: rule__LengthField__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LengthField__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__9"


    // $ANTLR start "rule__LengthField__Group__9__Impl"
    // InternalProtokitDSL.g:2338:1: rule__LengthField__Group__9__Impl : ( ')' ) ;
    public final void rule__LengthField__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2342:1: ( ( ')' ) )
            // InternalProtokitDSL.g:2343:1: ( ')' )
            {
            // InternalProtokitDSL.g:2343:1: ( ')' )
            // InternalProtokitDSL.g:2344:2: ')'
            {
             before(grammarAccess.getLengthFieldAccess().getRightParenthesisKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__Group__9__Impl"


    // $ANTLR start "rule__CountField__Group__0"
    // InternalProtokitDSL.g:2354:1: rule__CountField__Group__0 : rule__CountField__Group__0__Impl rule__CountField__Group__1 ;
    public final void rule__CountField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2358:1: ( rule__CountField__Group__0__Impl rule__CountField__Group__1 )
            // InternalProtokitDSL.g:2359:2: rule__CountField__Group__0__Impl rule__CountField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CountField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__0"


    // $ANTLR start "rule__CountField__Group__0__Impl"
    // InternalProtokitDSL.g:2366:1: rule__CountField__Group__0__Impl : ( ( rule__CountField__TransientFieldAssignment_0 )? ) ;
    public final void rule__CountField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2370:1: ( ( ( rule__CountField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:2371:1: ( ( rule__CountField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:2371:1: ( ( rule__CountField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:2372:2: ( rule__CountField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getCountFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:2373:2: ( rule__CountField__TransientFieldAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProtokitDSL.g:2373:3: rule__CountField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__0__Impl"


    // $ANTLR start "rule__CountField__Group__1"
    // InternalProtokitDSL.g:2381:1: rule__CountField__Group__1 : rule__CountField__Group__1__Impl rule__CountField__Group__2 ;
    public final void rule__CountField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2385:1: ( rule__CountField__Group__1__Impl rule__CountField__Group__2 )
            // InternalProtokitDSL.g:2386:2: rule__CountField__Group__1__Impl rule__CountField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CountField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__1"


    // $ANTLR start "rule__CountField__Group__1__Impl"
    // InternalProtokitDSL.g:2393:1: rule__CountField__Group__1__Impl : ( ( rule__CountField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__CountField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2397:1: ( ( ( rule__CountField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:2398:1: ( ( rule__CountField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:2398:1: ( ( rule__CountField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:2399:2: ( rule__CountField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getCountFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:2400:2: ( rule__CountField__IdentityFieldAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProtokitDSL.g:2400:3: rule__CountField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__1__Impl"


    // $ANTLR start "rule__CountField__Group__2"
    // InternalProtokitDSL.g:2408:1: rule__CountField__Group__2 : rule__CountField__Group__2__Impl rule__CountField__Group__3 ;
    public final void rule__CountField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2412:1: ( rule__CountField__Group__2__Impl rule__CountField__Group__3 )
            // InternalProtokitDSL.g:2413:2: rule__CountField__Group__2__Impl rule__CountField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CountField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__2"


    // $ANTLR start "rule__CountField__Group__2__Impl"
    // InternalProtokitDSL.g:2420:1: rule__CountField__Group__2__Impl : ( ( rule__CountField__NameAssignment_2 ) ) ;
    public final void rule__CountField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2424:1: ( ( ( rule__CountField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:2425:1: ( ( rule__CountField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:2425:1: ( ( rule__CountField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:2426:2: ( rule__CountField__NameAssignment_2 )
            {
             before(grammarAccess.getCountFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:2427:2: ( rule__CountField__NameAssignment_2 )
            // InternalProtokitDSL.g:2427:3: rule__CountField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CountField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__2__Impl"


    // $ANTLR start "rule__CountField__Group__3"
    // InternalProtokitDSL.g:2435:1: rule__CountField__Group__3 : rule__CountField__Group__3__Impl rule__CountField__Group__4 ;
    public final void rule__CountField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2439:1: ( rule__CountField__Group__3__Impl rule__CountField__Group__4 )
            // InternalProtokitDSL.g:2440:2: rule__CountField__Group__3__Impl rule__CountField__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__CountField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__3"


    // $ANTLR start "rule__CountField__Group__3__Impl"
    // InternalProtokitDSL.g:2447:1: rule__CountField__Group__3__Impl : ( ':' ) ;
    public final void rule__CountField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2451:1: ( ( ':' ) )
            // InternalProtokitDSL.g:2452:1: ( ':' )
            {
            // InternalProtokitDSL.g:2452:1: ( ':' )
            // InternalProtokitDSL.g:2453:2: ':'
            {
             before(grammarAccess.getCountFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__3__Impl"


    // $ANTLR start "rule__CountField__Group__4"
    // InternalProtokitDSL.g:2462:1: rule__CountField__Group__4 : rule__CountField__Group__4__Impl rule__CountField__Group__5 ;
    public final void rule__CountField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2466:1: ( rule__CountField__Group__4__Impl rule__CountField__Group__5 )
            // InternalProtokitDSL.g:2467:2: rule__CountField__Group__4__Impl rule__CountField__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__CountField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__4"


    // $ANTLR start "rule__CountField__Group__4__Impl"
    // InternalProtokitDSL.g:2474:1: rule__CountField__Group__4__Impl : ( 'count' ) ;
    public final void rule__CountField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2478:1: ( ( 'count' ) )
            // InternalProtokitDSL.g:2479:1: ( 'count' )
            {
            // InternalProtokitDSL.g:2479:1: ( 'count' )
            // InternalProtokitDSL.g:2480:2: 'count'
            {
             before(grammarAccess.getCountFieldAccess().getCountKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getCountKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__4__Impl"


    // $ANTLR start "rule__CountField__Group__5"
    // InternalProtokitDSL.g:2489:1: rule__CountField__Group__5 : rule__CountField__Group__5__Impl rule__CountField__Group__6 ;
    public final void rule__CountField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2493:1: ( rule__CountField__Group__5__Impl rule__CountField__Group__6 )
            // InternalProtokitDSL.g:2494:2: rule__CountField__Group__5__Impl rule__CountField__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CountField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__5"


    // $ANTLR start "rule__CountField__Group__5__Impl"
    // InternalProtokitDSL.g:2501:1: rule__CountField__Group__5__Impl : ( '(' ) ;
    public final void rule__CountField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2505:1: ( ( '(' ) )
            // InternalProtokitDSL.g:2506:1: ( '(' )
            {
            // InternalProtokitDSL.g:2506:1: ( '(' )
            // InternalProtokitDSL.g:2507:2: '('
            {
             before(grammarAccess.getCountFieldAccess().getLeftParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__5__Impl"


    // $ANTLR start "rule__CountField__Group__6"
    // InternalProtokitDSL.g:2516:1: rule__CountField__Group__6 : rule__CountField__Group__6__Impl rule__CountField__Group__7 ;
    public final void rule__CountField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2520:1: ( rule__CountField__Group__6__Impl rule__CountField__Group__7 )
            // InternalProtokitDSL.g:2521:2: rule__CountField__Group__6__Impl rule__CountField__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__CountField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__6"


    // $ANTLR start "rule__CountField__Group__6__Impl"
    // InternalProtokitDSL.g:2528:1: rule__CountField__Group__6__Impl : ( ( rule__CountField__ByteLenAssignment_6 ) ) ;
    public final void rule__CountField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2532:1: ( ( ( rule__CountField__ByteLenAssignment_6 ) ) )
            // InternalProtokitDSL.g:2533:1: ( ( rule__CountField__ByteLenAssignment_6 ) )
            {
            // InternalProtokitDSL.g:2533:1: ( ( rule__CountField__ByteLenAssignment_6 ) )
            // InternalProtokitDSL.g:2534:2: ( rule__CountField__ByteLenAssignment_6 )
            {
             before(grammarAccess.getCountFieldAccess().getByteLenAssignment_6()); 
            // InternalProtokitDSL.g:2535:2: ( rule__CountField__ByteLenAssignment_6 )
            // InternalProtokitDSL.g:2535:3: rule__CountField__ByteLenAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CountField__ByteLenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCountFieldAccess().getByteLenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__6__Impl"


    // $ANTLR start "rule__CountField__Group__7"
    // InternalProtokitDSL.g:2543:1: rule__CountField__Group__7 : rule__CountField__Group__7__Impl rule__CountField__Group__8 ;
    public final void rule__CountField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2547:1: ( rule__CountField__Group__7__Impl rule__CountField__Group__8 )
            // InternalProtokitDSL.g:2548:2: rule__CountField__Group__7__Impl rule__CountField__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__CountField__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__7"


    // $ANTLR start "rule__CountField__Group__7__Impl"
    // InternalProtokitDSL.g:2555:1: rule__CountField__Group__7__Impl : ( ',' ) ;
    public final void rule__CountField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2559:1: ( ( ',' ) )
            // InternalProtokitDSL.g:2560:1: ( ',' )
            {
            // InternalProtokitDSL.g:2560:1: ( ',' )
            // InternalProtokitDSL.g:2561:2: ','
            {
             before(grammarAccess.getCountFieldAccess().getCommaKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__7__Impl"


    // $ANTLR start "rule__CountField__Group__8"
    // InternalProtokitDSL.g:2570:1: rule__CountField__Group__8 : rule__CountField__Group__8__Impl rule__CountField__Group__9 ;
    public final void rule__CountField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2574:1: ( rule__CountField__Group__8__Impl rule__CountField__Group__9 )
            // InternalProtokitDSL.g:2575:2: rule__CountField__Group__8__Impl rule__CountField__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__CountField__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountField__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__8"


    // $ANTLR start "rule__CountField__Group__8__Impl"
    // InternalProtokitDSL.g:2582:1: rule__CountField__Group__8__Impl : ( ( rule__CountField__RefAssignment_8 ) ) ;
    public final void rule__CountField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2586:1: ( ( ( rule__CountField__RefAssignment_8 ) ) )
            // InternalProtokitDSL.g:2587:1: ( ( rule__CountField__RefAssignment_8 ) )
            {
            // InternalProtokitDSL.g:2587:1: ( ( rule__CountField__RefAssignment_8 ) )
            // InternalProtokitDSL.g:2588:2: ( rule__CountField__RefAssignment_8 )
            {
             before(grammarAccess.getCountFieldAccess().getRefAssignment_8()); 
            // InternalProtokitDSL.g:2589:2: ( rule__CountField__RefAssignment_8 )
            // InternalProtokitDSL.g:2589:3: rule__CountField__RefAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CountField__RefAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCountFieldAccess().getRefAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__8__Impl"


    // $ANTLR start "rule__CountField__Group__9"
    // InternalProtokitDSL.g:2597:1: rule__CountField__Group__9 : rule__CountField__Group__9__Impl ;
    public final void rule__CountField__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2601:1: ( rule__CountField__Group__9__Impl )
            // InternalProtokitDSL.g:2602:2: rule__CountField__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountField__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__9"


    // $ANTLR start "rule__CountField__Group__9__Impl"
    // InternalProtokitDSL.g:2608:1: rule__CountField__Group__9__Impl : ( ')' ) ;
    public final void rule__CountField__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2612:1: ( ( ')' ) )
            // InternalProtokitDSL.g:2613:1: ( ')' )
            {
            // InternalProtokitDSL.g:2613:1: ( ')' )
            // InternalProtokitDSL.g:2614:2: ')'
            {
             before(grammarAccess.getCountFieldAccess().getRightParenthesisKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__Group__9__Impl"


    // $ANTLR start "rule__DataTypeField__Group__0"
    // InternalProtokitDSL.g:2624:1: rule__DataTypeField__Group__0 : rule__DataTypeField__Group__0__Impl rule__DataTypeField__Group__1 ;
    public final void rule__DataTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2628:1: ( rule__DataTypeField__Group__0__Impl rule__DataTypeField__Group__1 )
            // InternalProtokitDSL.g:2629:2: rule__DataTypeField__Group__0__Impl rule__DataTypeField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataTypeField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__0"


    // $ANTLR start "rule__DataTypeField__Group__0__Impl"
    // InternalProtokitDSL.g:2636:1: rule__DataTypeField__Group__0__Impl : ( ( rule__DataTypeField__TransientFieldAssignment_0 )? ) ;
    public final void rule__DataTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2640:1: ( ( ( rule__DataTypeField__TransientFieldAssignment_0 )? ) )
            // InternalProtokitDSL.g:2641:1: ( ( rule__DataTypeField__TransientFieldAssignment_0 )? )
            {
            // InternalProtokitDSL.g:2641:1: ( ( rule__DataTypeField__TransientFieldAssignment_0 )? )
            // InternalProtokitDSL.g:2642:2: ( rule__DataTypeField__TransientFieldAssignment_0 )?
            {
             before(grammarAccess.getDataTypeFieldAccess().getTransientFieldAssignment_0()); 
            // InternalProtokitDSL.g:2643:2: ( rule__DataTypeField__TransientFieldAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProtokitDSL.g:2643:3: rule__DataTypeField__TransientFieldAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataTypeField__TransientFieldAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeFieldAccess().getTransientFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__0__Impl"


    // $ANTLR start "rule__DataTypeField__Group__1"
    // InternalProtokitDSL.g:2651:1: rule__DataTypeField__Group__1 : rule__DataTypeField__Group__1__Impl rule__DataTypeField__Group__2 ;
    public final void rule__DataTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2655:1: ( rule__DataTypeField__Group__1__Impl rule__DataTypeField__Group__2 )
            // InternalProtokitDSL.g:2656:2: rule__DataTypeField__Group__1__Impl rule__DataTypeField__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DataTypeField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__1"


    // $ANTLR start "rule__DataTypeField__Group__1__Impl"
    // InternalProtokitDSL.g:2663:1: rule__DataTypeField__Group__1__Impl : ( ( rule__DataTypeField__IdentityFieldAssignment_1 )? ) ;
    public final void rule__DataTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2667:1: ( ( ( rule__DataTypeField__IdentityFieldAssignment_1 )? ) )
            // InternalProtokitDSL.g:2668:1: ( ( rule__DataTypeField__IdentityFieldAssignment_1 )? )
            {
            // InternalProtokitDSL.g:2668:1: ( ( rule__DataTypeField__IdentityFieldAssignment_1 )? )
            // InternalProtokitDSL.g:2669:2: ( rule__DataTypeField__IdentityFieldAssignment_1 )?
            {
             before(grammarAccess.getDataTypeFieldAccess().getIdentityFieldAssignment_1()); 
            // InternalProtokitDSL.g:2670:2: ( rule__DataTypeField__IdentityFieldAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProtokitDSL.g:2670:3: rule__DataTypeField__IdentityFieldAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataTypeField__IdentityFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeFieldAccess().getIdentityFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__1__Impl"


    // $ANTLR start "rule__DataTypeField__Group__2"
    // InternalProtokitDSL.g:2678:1: rule__DataTypeField__Group__2 : rule__DataTypeField__Group__2__Impl rule__DataTypeField__Group__3 ;
    public final void rule__DataTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2682:1: ( rule__DataTypeField__Group__2__Impl rule__DataTypeField__Group__3 )
            // InternalProtokitDSL.g:2683:2: rule__DataTypeField__Group__2__Impl rule__DataTypeField__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DataTypeField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__2"


    // $ANTLR start "rule__DataTypeField__Group__2__Impl"
    // InternalProtokitDSL.g:2690:1: rule__DataTypeField__Group__2__Impl : ( ( rule__DataTypeField__NameAssignment_2 ) ) ;
    public final void rule__DataTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2694:1: ( ( ( rule__DataTypeField__NameAssignment_2 ) ) )
            // InternalProtokitDSL.g:2695:1: ( ( rule__DataTypeField__NameAssignment_2 ) )
            {
            // InternalProtokitDSL.g:2695:1: ( ( rule__DataTypeField__NameAssignment_2 ) )
            // InternalProtokitDSL.g:2696:2: ( rule__DataTypeField__NameAssignment_2 )
            {
             before(grammarAccess.getDataTypeFieldAccess().getNameAssignment_2()); 
            // InternalProtokitDSL.g:2697:2: ( rule__DataTypeField__NameAssignment_2 )
            // InternalProtokitDSL.g:2697:3: rule__DataTypeField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__2__Impl"


    // $ANTLR start "rule__DataTypeField__Group__3"
    // InternalProtokitDSL.g:2705:1: rule__DataTypeField__Group__3 : rule__DataTypeField__Group__3__Impl rule__DataTypeField__Group__4 ;
    public final void rule__DataTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2709:1: ( rule__DataTypeField__Group__3__Impl rule__DataTypeField__Group__4 )
            // InternalProtokitDSL.g:2710:2: rule__DataTypeField__Group__3__Impl rule__DataTypeField__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DataTypeField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__3"


    // $ANTLR start "rule__DataTypeField__Group__3__Impl"
    // InternalProtokitDSL.g:2717:1: rule__DataTypeField__Group__3__Impl : ( ':' ) ;
    public final void rule__DataTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2721:1: ( ( ':' ) )
            // InternalProtokitDSL.g:2722:1: ( ':' )
            {
            // InternalProtokitDSL.g:2722:1: ( ':' )
            // InternalProtokitDSL.g:2723:2: ':'
            {
             before(grammarAccess.getDataTypeFieldAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataTypeFieldAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__3__Impl"


    // $ANTLR start "rule__DataTypeField__Group__4"
    // InternalProtokitDSL.g:2732:1: rule__DataTypeField__Group__4 : rule__DataTypeField__Group__4__Impl ;
    public final void rule__DataTypeField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2736:1: ( rule__DataTypeField__Group__4__Impl )
            // InternalProtokitDSL.g:2737:2: rule__DataTypeField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeField__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__4"


    // $ANTLR start "rule__DataTypeField__Group__4__Impl"
    // InternalProtokitDSL.g:2743:1: rule__DataTypeField__Group__4__Impl : ( ( rule__DataTypeField__DatatypeAssignment_4 ) ) ;
    public final void rule__DataTypeField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2747:1: ( ( ( rule__DataTypeField__DatatypeAssignment_4 ) ) )
            // InternalProtokitDSL.g:2748:1: ( ( rule__DataTypeField__DatatypeAssignment_4 ) )
            {
            // InternalProtokitDSL.g:2748:1: ( ( rule__DataTypeField__DatatypeAssignment_4 ) )
            // InternalProtokitDSL.g:2749:2: ( rule__DataTypeField__DatatypeAssignment_4 )
            {
             before(grammarAccess.getDataTypeFieldAccess().getDatatypeAssignment_4()); 
            // InternalProtokitDSL.g:2750:2: ( rule__DataTypeField__DatatypeAssignment_4 )
            // InternalProtokitDSL.g:2750:3: rule__DataTypeField__DatatypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeField__DatatypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeFieldAccess().getDatatypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__Group__4__Impl"


    // $ANTLR start "rule__Formatter__Group__0"
    // InternalProtokitDSL.g:2759:1: rule__Formatter__Group__0 : rule__Formatter__Group__0__Impl rule__Formatter__Group__1 ;
    public final void rule__Formatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2763:1: ( rule__Formatter__Group__0__Impl rule__Formatter__Group__1 )
            // InternalProtokitDSL.g:2764:2: rule__Formatter__Group__0__Impl rule__Formatter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Formatter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__0"


    // $ANTLR start "rule__Formatter__Group__0__Impl"
    // InternalProtokitDSL.g:2771:1: rule__Formatter__Group__0__Impl : ( 'formatter' ) ;
    public final void rule__Formatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2775:1: ( ( 'formatter' ) )
            // InternalProtokitDSL.g:2776:1: ( 'formatter' )
            {
            // InternalProtokitDSL.g:2776:1: ( 'formatter' )
            // InternalProtokitDSL.g:2777:2: 'formatter'
            {
             before(grammarAccess.getFormatterAccess().getFormatterKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getFormatterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__0__Impl"


    // $ANTLR start "rule__Formatter__Group__1"
    // InternalProtokitDSL.g:2786:1: rule__Formatter__Group__1 : rule__Formatter__Group__1__Impl ;
    public final void rule__Formatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2790:1: ( rule__Formatter__Group__1__Impl )
            // InternalProtokitDSL.g:2791:2: rule__Formatter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__1"


    // $ANTLR start "rule__Formatter__Group__1__Impl"
    // InternalProtokitDSL.g:2797:1: rule__Formatter__Group__1__Impl : ( ( rule__Formatter__NameAssignment_1 ) ) ;
    public final void rule__Formatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2801:1: ( ( ( rule__Formatter__NameAssignment_1 ) ) )
            // InternalProtokitDSL.g:2802:1: ( ( rule__Formatter__NameAssignment_1 ) )
            {
            // InternalProtokitDSL.g:2802:1: ( ( rule__Formatter__NameAssignment_1 ) )
            // InternalProtokitDSL.g:2803:2: ( rule__Formatter__NameAssignment_1 )
            {
             before(grammarAccess.getFormatterAccess().getNameAssignment_1()); 
            // InternalProtokitDSL.g:2804:2: ( rule__Formatter__NameAssignment_1 )
            // InternalProtokitDSL.g:2804:3: rule__Formatter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormatterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__1__Impl"


    // $ANTLR start "rule__ProtocolModel__DatatypesAssignment"
    // InternalProtokitDSL.g:2813:1: rule__ProtocolModel__DatatypesAssignment : ( ruleDataType ) ;
    public final void rule__ProtocolModel__DatatypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2817:1: ( ( ruleDataType ) )
            // InternalProtokitDSL.g:2818:2: ( ruleDataType )
            {
            // InternalProtokitDSL.g:2818:2: ( ruleDataType )
            // InternalProtokitDSL.g:2819:3: ruleDataType
            {
             before(grammarAccess.getProtocolModelAccess().getDatatypesDataTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getProtocolModelAccess().getDatatypesDataTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolModel__DatatypesAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalProtokitDSL.g:2828:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2832:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:2833:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:2833:2: ( RULE_ID )
            // InternalProtokitDSL.g:2834:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DataType__FieldsAssignment_3"
    // InternalProtokitDSL.g:2843:1: rule__DataType__FieldsAssignment_3 : ( ruleVariableDefinition ) ;
    public final void rule__DataType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2847:1: ( ( ruleVariableDefinition ) )
            // InternalProtokitDSL.g:2848:2: ( ruleVariableDefinition )
            {
            // InternalProtokitDSL.g:2848:2: ( ruleVariableDefinition )
            // InternalProtokitDSL.g:2849:3: ruleVariableDefinition
            {
             before(grammarAccess.getDataTypeAccess().getFieldsVariableDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getFieldsVariableDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__FieldsAssignment_3"


    // $ANTLR start "rule__IntegerField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:2858:1: rule__IntegerField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__IntegerField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2862:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:2863:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:2863:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:2864:3: ( 'transient' )
            {
             before(grammarAccess.getIntegerFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:2865:3: ( 'transient' )
            // InternalProtokitDSL.g:2866:4: 'transient'
            {
             before(grammarAccess.getIntegerFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getIntegerFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__TransientFieldAssignment_0"


    // $ANTLR start "rule__IntegerField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:2877:1: rule__IntegerField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__IntegerField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2881:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:2882:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:2882:2: ( ( '*' ) )
            // InternalProtokitDSL.g:2883:3: ( '*' )
            {
             before(grammarAccess.getIntegerFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:2884:3: ( '*' )
            // InternalProtokitDSL.g:2885:4: '*'
            {
             before(grammarAccess.getIntegerFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getIntegerFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__IntegerField__NameAssignment_2"
    // InternalProtokitDSL.g:2896:1: rule__IntegerField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2900:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:2901:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:2901:2: ( RULE_ID )
            // InternalProtokitDSL.g:2902:3: RULE_ID
            {
             before(grammarAccess.getIntegerFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__NameAssignment_2"


    // $ANTLR start "rule__IntegerField__ByteLenAssignment_5_1"
    // InternalProtokitDSL.g:2911:1: rule__IntegerField__ByteLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerField__ByteLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2915:1: ( ( RULE_INT ) )
            // InternalProtokitDSL.g:2916:2: ( RULE_INT )
            {
            // InternalProtokitDSL.g:2916:2: ( RULE_INT )
            // InternalProtokitDSL.g:2917:3: RULE_INT
            {
             before(grammarAccess.getIntegerFieldAccess().getByteLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerFieldAccess().getByteLenINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerField__ByteLenAssignment_5_1"


    // $ANTLR start "rule__StringField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:2926:1: rule__StringField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__StringField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2930:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:2931:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:2931:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:2932:3: ( 'transient' )
            {
             before(grammarAccess.getStringFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:2933:3: ( 'transient' )
            // InternalProtokitDSL.g:2934:4: 'transient'
            {
             before(grammarAccess.getStringFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getStringFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__TransientFieldAssignment_0"


    // $ANTLR start "rule__StringField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:2945:1: rule__StringField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__StringField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2949:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:2950:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:2950:2: ( ( '*' ) )
            // InternalProtokitDSL.g:2951:3: ( '*' )
            {
             before(grammarAccess.getStringFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:2952:3: ( '*' )
            // InternalProtokitDSL.g:2953:4: '*'
            {
             before(grammarAccess.getStringFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getStringFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__StringField__NameAssignment_2"
    // InternalProtokitDSL.g:2964:1: rule__StringField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2968:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:2969:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:2969:2: ( RULE_ID )
            // InternalProtokitDSL.g:2970:3: RULE_ID
            {
             before(grammarAccess.getStringFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__NameAssignment_2"


    // $ANTLR start "rule__StringField__ByteLenAssignment_5_0_1"
    // InternalProtokitDSL.g:2979:1: rule__StringField__ByteLenAssignment_5_0_1 : ( RULE_INT ) ;
    public final void rule__StringField__ByteLenAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2983:1: ( ( RULE_INT ) )
            // InternalProtokitDSL.g:2984:2: ( RULE_INT )
            {
            // InternalProtokitDSL.g:2984:2: ( RULE_INT )
            // InternalProtokitDSL.g:2985:3: RULE_INT
            {
             before(grammarAccess.getStringFieldAccess().getByteLenINTTerminalRuleCall_5_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getByteLenINTTerminalRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__ByteLenAssignment_5_0_1"


    // $ANTLR start "rule__StringField__UnboundedAssignment_5_1_1"
    // InternalProtokitDSL.g:2994:1: rule__StringField__UnboundedAssignment_5_1_1 : ( ( '*' ) ) ;
    public final void rule__StringField__UnboundedAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:2998:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:2999:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:2999:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3000:3: ( '*' )
            {
             before(grammarAccess.getStringFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 
            // InternalProtokitDSL.g:3001:3: ( '*' )
            // InternalProtokitDSL.g:3002:4: '*'
            {
             before(grammarAccess.getStringFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStringFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 

            }

             after(grammarAccess.getStringFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__UnboundedAssignment_5_1_1"


    // $ANTLR start "rule__StringField__FormatterAssignment_5_1_3"
    // InternalProtokitDSL.g:3013:1: rule__StringField__FormatterAssignment_5_1_3 : ( ruleFormatter ) ;
    public final void rule__StringField__FormatterAssignment_5_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3017:1: ( ( ruleFormatter ) )
            // InternalProtokitDSL.g:3018:2: ( ruleFormatter )
            {
            // InternalProtokitDSL.g:3018:2: ( ruleFormatter )
            // InternalProtokitDSL.g:3019:3: ruleFormatter
            {
             before(grammarAccess.getStringFieldAccess().getFormatterFormatterParserRuleCall_5_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFormatter();

            state._fsp--;

             after(grammarAccess.getStringFieldAccess().getFormatterFormatterParserRuleCall_5_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringField__FormatterAssignment_5_1_3"


    // $ANTLR start "rule__BinaryField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:3028:1: rule__BinaryField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__BinaryField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3032:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:3033:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:3033:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:3034:3: ( 'transient' )
            {
             before(grammarAccess.getBinaryFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:3035:3: ( 'transient' )
            // InternalProtokitDSL.g:3036:4: 'transient'
            {
             before(grammarAccess.getBinaryFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getBinaryFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__TransientFieldAssignment_0"


    // $ANTLR start "rule__BinaryField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:3047:1: rule__BinaryField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__BinaryField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3051:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3052:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3052:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3053:3: ( '*' )
            {
             before(grammarAccess.getBinaryFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:3054:3: ( '*' )
            // InternalProtokitDSL.g:3055:4: '*'
            {
             before(grammarAccess.getBinaryFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getBinaryFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__BinaryField__NameAssignment_2"
    // InternalProtokitDSL.g:3066:1: rule__BinaryField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BinaryField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3070:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3071:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3071:2: ( RULE_ID )
            // InternalProtokitDSL.g:3072:3: RULE_ID
            {
             before(grammarAccess.getBinaryFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__NameAssignment_2"


    // $ANTLR start "rule__BinaryField__ByteLenAssignment_5_0_1"
    // InternalProtokitDSL.g:3081:1: rule__BinaryField__ByteLenAssignment_5_0_1 : ( RULE_INT ) ;
    public final void rule__BinaryField__ByteLenAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3085:1: ( ( RULE_INT ) )
            // InternalProtokitDSL.g:3086:2: ( RULE_INT )
            {
            // InternalProtokitDSL.g:3086:2: ( RULE_INT )
            // InternalProtokitDSL.g:3087:3: RULE_INT
            {
             before(grammarAccess.getBinaryFieldAccess().getByteLenINTTerminalRuleCall_5_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getByteLenINTTerminalRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__ByteLenAssignment_5_0_1"


    // $ANTLR start "rule__BinaryField__UnboundedAssignment_5_1_1"
    // InternalProtokitDSL.g:3096:1: rule__BinaryField__UnboundedAssignment_5_1_1 : ( ( '*' ) ) ;
    public final void rule__BinaryField__UnboundedAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3100:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3101:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3101:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3102:3: ( '*' )
            {
             before(grammarAccess.getBinaryFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 
            // InternalProtokitDSL.g:3103:3: ( '*' )
            // InternalProtokitDSL.g:3104:4: '*'
            {
             before(grammarAccess.getBinaryFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBinaryFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 

            }

             after(grammarAccess.getBinaryFieldAccess().getUnboundedAsteriskKeyword_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryField__UnboundedAssignment_5_1_1"


    // $ANTLR start "rule__BitField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:3115:1: rule__BitField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__BitField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3119:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:3120:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:3120:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:3121:3: ( 'transient' )
            {
             before(grammarAccess.getBitFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:3122:3: ( 'transient' )
            // InternalProtokitDSL.g:3123:4: 'transient'
            {
             before(grammarAccess.getBitFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getBitFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__TransientFieldAssignment_0"


    // $ANTLR start "rule__BitField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:3134:1: rule__BitField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__BitField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3138:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3139:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3139:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3140:3: ( '*' )
            {
             before(grammarAccess.getBitFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:3141:3: ( '*' )
            // InternalProtokitDSL.g:3142:4: '*'
            {
             before(grammarAccess.getBitFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getBitFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__BitField__NameAssignment_2"
    // InternalProtokitDSL.g:3153:1: rule__BitField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BitField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3157:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3158:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3158:2: ( RULE_ID )
            // InternalProtokitDSL.g:3159:3: RULE_ID
            {
             before(grammarAccess.getBitFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBitFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__NameAssignment_2"


    // $ANTLR start "rule__BitField__ComponentsAssignment_6"
    // InternalProtokitDSL.g:3168:1: rule__BitField__ComponentsAssignment_6 : ( ruleBitfieldComponent ) ;
    public final void rule__BitField__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3172:1: ( ( ruleBitfieldComponent ) )
            // InternalProtokitDSL.g:3173:2: ( ruleBitfieldComponent )
            {
            // InternalProtokitDSL.g:3173:2: ( ruleBitfieldComponent )
            // InternalProtokitDSL.g:3174:3: ruleBitfieldComponent
            {
             before(grammarAccess.getBitFieldAccess().getComponentsBitfieldComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBitfieldComponent();

            state._fsp--;

             after(grammarAccess.getBitFieldAccess().getComponentsBitfieldComponentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitField__ComponentsAssignment_6"


    // $ANTLR start "rule__BitfieldComponent__NameAssignment_0"
    // InternalProtokitDSL.g:3183:1: rule__BitfieldComponent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BitfieldComponent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3187:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3188:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3188:2: ( RULE_ID )
            // InternalProtokitDSL.g:3189:3: RULE_ID
            {
             before(grammarAccess.getBitfieldComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBitfieldComponentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__NameAssignment_0"


    // $ANTLR start "rule__BitfieldComponent__BitLenAssignment_2"
    // InternalProtokitDSL.g:3198:1: rule__BitfieldComponent__BitLenAssignment_2 : ( RULE_INT ) ;
    public final void rule__BitfieldComponent__BitLenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3202:1: ( ( RULE_INT ) )
            // InternalProtokitDSL.g:3203:2: ( RULE_INT )
            {
            // InternalProtokitDSL.g:3203:2: ( RULE_INT )
            // InternalProtokitDSL.g:3204:3: RULE_INT
            {
             before(grammarAccess.getBitfieldComponentAccess().getBitLenINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBitfieldComponentAccess().getBitLenINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitfieldComponent__BitLenAssignment_2"


    // $ANTLR start "rule__ListField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:3213:1: rule__ListField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__ListField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3217:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:3218:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:3218:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:3219:3: ( 'transient' )
            {
             before(grammarAccess.getListFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:3220:3: ( 'transient' )
            // InternalProtokitDSL.g:3221:4: 'transient'
            {
             before(grammarAccess.getListFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getListFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__TransientFieldAssignment_0"


    // $ANTLR start "rule__ListField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:3232:1: rule__ListField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__ListField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3236:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3237:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3237:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3238:3: ( '*' )
            {
             before(grammarAccess.getListFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:3239:3: ( '*' )
            // InternalProtokitDSL.g:3240:4: '*'
            {
             before(grammarAccess.getListFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getListFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__ListField__NameAssignment_2"
    // InternalProtokitDSL.g:3251:1: rule__ListField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ListField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3255:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3256:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3256:2: ( RULE_ID )
            // InternalProtokitDSL.g:3257:3: RULE_ID
            {
             before(grammarAccess.getListFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__NameAssignment_2"


    // $ANTLR start "rule__ListField__ElementTypeAssignment_6"
    // InternalProtokitDSL.g:3266:1: rule__ListField__ElementTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ListField__ElementTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3270:1: ( ( ( RULE_ID ) ) )
            // InternalProtokitDSL.g:3271:2: ( ( RULE_ID ) )
            {
            // InternalProtokitDSL.g:3271:2: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3272:3: ( RULE_ID )
            {
             before(grammarAccess.getListFieldAccess().getElementTypeDataTypeCrossReference_6_0()); 
            // InternalProtokitDSL.g:3273:3: ( RULE_ID )
            // InternalProtokitDSL.g:3274:4: RULE_ID
            {
             before(grammarAccess.getListFieldAccess().getElementTypeDataTypeIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListFieldAccess().getElementTypeDataTypeIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getListFieldAccess().getElementTypeDataTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListField__ElementTypeAssignment_6"


    // $ANTLR start "rule__LengthField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:3285:1: rule__LengthField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__LengthField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3289:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:3290:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:3290:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:3291:3: ( 'transient' )
            {
             before(grammarAccess.getLengthFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:3292:3: ( 'transient' )
            // InternalProtokitDSL.g:3293:4: 'transient'
            {
             before(grammarAccess.getLengthFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getLengthFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__TransientFieldAssignment_0"


    // $ANTLR start "rule__LengthField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:3304:1: rule__LengthField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__LengthField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3308:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3309:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3309:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3310:3: ( '*' )
            {
             before(grammarAccess.getLengthFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:3311:3: ( '*' )
            // InternalProtokitDSL.g:3312:4: '*'
            {
             before(grammarAccess.getLengthFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getLengthFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__LengthField__NameAssignment_2"
    // InternalProtokitDSL.g:3323:1: rule__LengthField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LengthField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3327:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3328:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3328:2: ( RULE_ID )
            // InternalProtokitDSL.g:3329:3: RULE_ID
            {
             before(grammarAccess.getLengthFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__NameAssignment_2"


    // $ANTLR start "rule__LengthField__ByteLenAssignment_6"
    // InternalProtokitDSL.g:3338:1: rule__LengthField__ByteLenAssignment_6 : ( RULE_INT ) ;
    public final void rule__LengthField__ByteLenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3342:1: ( ( RULE_INT ) )
            // InternalProtokitDSL.g:3343:2: ( RULE_INT )
            {
            // InternalProtokitDSL.g:3343:2: ( RULE_INT )
            // InternalProtokitDSL.g:3344:3: RULE_INT
            {
             before(grammarAccess.getLengthFieldAccess().getByteLenINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getByteLenINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__ByteLenAssignment_6"


    // $ANTLR start "rule__LengthField__RefAssignment_8"
    // InternalProtokitDSL.g:3353:1: rule__LengthField__RefAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__LengthField__RefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3357:1: ( ( ( RULE_ID ) ) )
            // InternalProtokitDSL.g:3358:2: ( ( RULE_ID ) )
            {
            // InternalProtokitDSL.g:3358:2: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3359:3: ( RULE_ID )
            {
             before(grammarAccess.getLengthFieldAccess().getRefBinaryFieldCrossReference_8_0()); 
            // InternalProtokitDSL.g:3360:3: ( RULE_ID )
            // InternalProtokitDSL.g:3361:4: RULE_ID
            {
             before(grammarAccess.getLengthFieldAccess().getRefBinaryFieldIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLengthFieldAccess().getRefBinaryFieldIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLengthFieldAccess().getRefBinaryFieldCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthField__RefAssignment_8"


    // $ANTLR start "rule__CountField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:3372:1: rule__CountField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__CountField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3376:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:3377:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:3377:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:3378:3: ( 'transient' )
            {
             before(grammarAccess.getCountFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:3379:3: ( 'transient' )
            // InternalProtokitDSL.g:3380:4: 'transient'
            {
             before(grammarAccess.getCountFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getCountFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__TransientFieldAssignment_0"


    // $ANTLR start "rule__CountField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:3391:1: rule__CountField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__CountField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3395:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3396:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3396:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3397:3: ( '*' )
            {
             before(grammarAccess.getCountFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:3398:3: ( '*' )
            // InternalProtokitDSL.g:3399:4: '*'
            {
             before(grammarAccess.getCountFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getCountFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__CountField__NameAssignment_2"
    // InternalProtokitDSL.g:3410:1: rule__CountField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CountField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3414:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3415:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3415:2: ( RULE_ID )
            // InternalProtokitDSL.g:3416:3: RULE_ID
            {
             before(grammarAccess.getCountFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__NameAssignment_2"


    // $ANTLR start "rule__CountField__ByteLenAssignment_6"
    // InternalProtokitDSL.g:3425:1: rule__CountField__ByteLenAssignment_6 : ( RULE_INT ) ;
    public final void rule__CountField__ByteLenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3429:1: ( ( RULE_INT ) )
            // InternalProtokitDSL.g:3430:2: ( RULE_INT )
            {
            // InternalProtokitDSL.g:3430:2: ( RULE_INT )
            // InternalProtokitDSL.g:3431:3: RULE_INT
            {
             before(grammarAccess.getCountFieldAccess().getByteLenINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getByteLenINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__ByteLenAssignment_6"


    // $ANTLR start "rule__CountField__RefAssignment_8"
    // InternalProtokitDSL.g:3440:1: rule__CountField__RefAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__CountField__RefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3444:1: ( ( ( RULE_ID ) ) )
            // InternalProtokitDSL.g:3445:2: ( ( RULE_ID ) )
            {
            // InternalProtokitDSL.g:3445:2: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3446:3: ( RULE_ID )
            {
             before(grammarAccess.getCountFieldAccess().getRefListFieldCrossReference_8_0()); 
            // InternalProtokitDSL.g:3447:3: ( RULE_ID )
            // InternalProtokitDSL.g:3448:4: RULE_ID
            {
             before(grammarAccess.getCountFieldAccess().getRefListFieldIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountFieldAccess().getRefListFieldIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCountFieldAccess().getRefListFieldCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountField__RefAssignment_8"


    // $ANTLR start "rule__DataTypeField__TransientFieldAssignment_0"
    // InternalProtokitDSL.g:3459:1: rule__DataTypeField__TransientFieldAssignment_0 : ( ( 'transient' ) ) ;
    public final void rule__DataTypeField__TransientFieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3463:1: ( ( ( 'transient' ) ) )
            // InternalProtokitDSL.g:3464:2: ( ( 'transient' ) )
            {
            // InternalProtokitDSL.g:3464:2: ( ( 'transient' ) )
            // InternalProtokitDSL.g:3465:3: ( 'transient' )
            {
             before(grammarAccess.getDataTypeFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            // InternalProtokitDSL.g:3466:3: ( 'transient' )
            // InternalProtokitDSL.g:3467:4: 'transient'
            {
             before(grammarAccess.getDataTypeFieldAccess().getTransientFieldTransientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataTypeFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }

             after(grammarAccess.getDataTypeFieldAccess().getTransientFieldTransientKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__TransientFieldAssignment_0"


    // $ANTLR start "rule__DataTypeField__IdentityFieldAssignment_1"
    // InternalProtokitDSL.g:3478:1: rule__DataTypeField__IdentityFieldAssignment_1 : ( ( '*' ) ) ;
    public final void rule__DataTypeField__IdentityFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3482:1: ( ( ( '*' ) ) )
            // InternalProtokitDSL.g:3483:2: ( ( '*' ) )
            {
            // InternalProtokitDSL.g:3483:2: ( ( '*' ) )
            // InternalProtokitDSL.g:3484:3: ( '*' )
            {
             before(grammarAccess.getDataTypeFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            // InternalProtokitDSL.g:3485:3: ( '*' )
            // InternalProtokitDSL.g:3486:4: '*'
            {
             before(grammarAccess.getDataTypeFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDataTypeFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getDataTypeFieldAccess().getIdentityFieldAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__IdentityFieldAssignment_1"


    // $ANTLR start "rule__DataTypeField__NameAssignment_2"
    // InternalProtokitDSL.g:3497:1: rule__DataTypeField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataTypeField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3501:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3502:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3502:2: ( RULE_ID )
            // InternalProtokitDSL.g:3503:3: RULE_ID
            {
             before(grammarAccess.getDataTypeFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__NameAssignment_2"


    // $ANTLR start "rule__DataTypeField__DatatypeAssignment_4"
    // InternalProtokitDSL.g:3512:1: rule__DataTypeField__DatatypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DataTypeField__DatatypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3516:1: ( ( ( RULE_ID ) ) )
            // InternalProtokitDSL.g:3517:2: ( ( RULE_ID ) )
            {
            // InternalProtokitDSL.g:3517:2: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3518:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeFieldAccess().getDatatypeDataTypeCrossReference_4_0()); 
            // InternalProtokitDSL.g:3519:3: ( RULE_ID )
            // InternalProtokitDSL.g:3520:4: RULE_ID
            {
             before(grammarAccess.getDataTypeFieldAccess().getDatatypeDataTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeFieldAccess().getDatatypeDataTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDataTypeFieldAccess().getDatatypeDataTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeField__DatatypeAssignment_4"


    // $ANTLR start "rule__Formatter__NameAssignment_1"
    // InternalProtokitDSL.g:3531:1: rule__Formatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Formatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProtokitDSL.g:3535:1: ( ( RULE_ID ) )
            // InternalProtokitDSL.g:3536:2: ( RULE_ID )
            {
            // InternalProtokitDSL.g:3536:2: ( RULE_ID )
            // InternalProtokitDSL.g:3537:3: RULE_ID
            {
             before(grammarAccess.getFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__NameAssignment_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\3\4\1\17\1\4\10\uffff";
    static final String dfa_3s = "\2\34\1\4\1\17\1\31\10\uffff";
    static final String dfa_4s = "\5\uffff\1\3\1\1\1\4\1\7\1\2\1\5\1\10\1\6";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\26\uffff\1\1\1\2",
            "\1\3\27\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\13\13\uffff\1\6\2\uffff\1\11\1\5\1\7\1\12\1\14\1\uffff\1\10",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "405:1: rule__VariableDefinition__Alternatives : ( ( ruleIntegerField ) | ( ruleStringField ) | ( ruleBinaryField ) | ( ruleBitField ) | ( ruleListField ) | ( ruleLengthField ) | ( ruleCountField ) | ( ruleDataTypeField ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});

}