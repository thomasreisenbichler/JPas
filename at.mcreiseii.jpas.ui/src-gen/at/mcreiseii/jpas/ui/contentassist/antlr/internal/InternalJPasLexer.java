package at.mcreiseii.jpas.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPasLexer extends Lexer {
    public static final int T__42=42;
    public static final int T__40=40;
    public static final int RULE_ID=12;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int RULE_RBRACE=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_SEMICOLON=10;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMA=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_COLON=9;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_DOT=6;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=4;
    public static final int RULE_LBRACE=7;
    public static final int RULE_ASSIGNSYM=11;
    public static final int RULE_WS=16;

    // delegates
    // delegators

    public InternalJPasLexer() {;} 
    public InternalJPasLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJPasLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:11:7: ( '*' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:12:7: ( '/' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:12:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:13:7: ( '+' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:14:7: ( '-' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:15:7: ( '==' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:15:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:16:7: ( '<' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:17:7: ( '<=' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:17:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:18:7: ( '>' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:19:7: ( '>=' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:19:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:20:7: ( '!=' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:20:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:21:7: ( 'string' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:21:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:22:7: ( 'boolean' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:22:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:23:7: ( 'integer' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:23:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:24:7: ( 'real' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:24:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:25:7: ( 'program' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:25:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:26:7: ( 'function' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:26:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:27:7: ( 'procedure' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:27:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:28:7: ( 'var' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:28:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:29:7: ( 'begin' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:29:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:30:7: ( 'end' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:30:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:31:7: ( 'if' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:31:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:32:7: ( 'then' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:32:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:33:7: ( 'else' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:33:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:34:7: ( 'while' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:34:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:35:7: ( 'do' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:35:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_ASSIGNSYM"
    public final void mRULE_ASSIGNSYM() throws RecognitionException {
        try {
            int _type = RULE_ASSIGNSYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3582:16: ( ':=' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3582:18: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGNSYM"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3584:10: ( '.' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3584:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3586:12: ( ':' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3586:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3588:16: ( ';' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3588:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3590:12: ( ',' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3590:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3592:13: ( '(' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3592:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3594:13: ( ')' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3594:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3596:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3596:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3596:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3596:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3596:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3598:10: ( ( '0' .. '9' )+ )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3598:12: ( '0' .. '9' )+
            {
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3598:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3598:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3600:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3602:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3602:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3602:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3602:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:41: ( '\\r' )? '\\n'
                    {
                    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3604:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3606:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3606:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3606:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3608:16: ( . )
            // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:3608:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_ASSIGNSYM | RULE_DOT | RULE_COLON | RULE_SEMICOLON | RULE_COMMA | RULE_LBRACE | RULE_RBRACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:160: RULE_ASSIGNSYM
                {
                mRULE_ASSIGNSYM(); 

                }
                break;
            case 27 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:175: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 28 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:184: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 29 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:195: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 30 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:210: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 31 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:221: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 32 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:233: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 33 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:253: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:262: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:274: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:290: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:306: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../at.mcreiseii.jpas.ui/src-gen/at/mcreiseii/jpas/ui/contentassist/antlr/internal/InternalJPas.g:1:314: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\44\2\uffff\1\40\1\51\1\53\1\40\13\56\1\75\5\uffff\1\40"+
        "\2\uffff\2\40\16\uffff\1\56\1\uffff\3\56\1\112\10\56\1\123\12\uffff"+
        "\4\56\1\uffff\3\56\1\134\1\135\3\56\1\uffff\4\56\1\145\3\56\2\uffff"+
        "\1\151\1\152\3\56\1\156\1\56\1\uffff\3\56\2\uffff\1\163\1\164\1"+
        "\56\1\uffff\4\56\2\uffff\1\172\1\173\1\174\2\56\3\uffff\1\56\1\u0080"+
        "\1\u0081\2\uffff";
    static final String DFA12_eofS =
        "\u0082\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\52\2\uffff\4\75\1\164\1\145\1\146\1\145\1\162\1\165"+
        "\1\141\1\154\2\150\1\157\1\75\5\uffff\1\101\2\uffff\2\0\16\uffff"+
        "\1\162\1\uffff\1\157\1\147\1\164\1\60\1\141\1\157\1\156\1\162\1"+
        "\144\1\163\1\145\1\151\1\60\12\uffff\1\151\1\154\1\151\1\145\1\uffff"+
        "\1\154\2\143\2\60\1\145\1\156\1\154\1\uffff\1\156\1\145\1\156\1"+
        "\147\1\60\1\162\1\145\1\164\2\uffff\2\60\1\145\1\147\1\141\1\60"+
        "\1\145\1\uffff\1\141\1\144\1\151\2\uffff\2\60\1\156\1\uffff\1\162"+
        "\1\155\1\165\1\157\2\uffff\3\60\1\162\1\156\3\uffff\1\145\2\60\2"+
        "\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\57\2\uffff\4\75\1\164\1\157\1\156\1\145\1\162"+
        "\1\165\1\141\1\156\2\150\1\157\1\75\5\uffff\1\172\2\uffff\2\uffff"+
        "\16\uffff\1\162\1\uffff\1\157\1\147\1\164\1\172\1\141\1\157\1\156"+
        "\1\162\1\144\1\163\1\145\1\151\1\172\12\uffff\1\151\1\154\1\151"+
        "\1\145\1\uffff\1\154\1\147\1\143\2\172\1\145\1\156\1\154\1\uffff"+
        "\1\156\1\145\1\156\1\147\1\172\1\162\1\145\1\164\2\uffff\2\172\1"+
        "\145\1\147\1\141\1\172\1\145\1\uffff\1\141\1\144\1\151\2\uffff\2"+
        "\172\1\156\1\uffff\1\162\1\155\1\165\1\157\2\uffff\3\172\1\162\1"+
        "\156\3\uffff\1\145\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\20\uffff\1\33\1\35\1\36\1\37\1\40\1"+
        "\uffff\1\41\1\42\2\uffff\1\46\1\47\1\1\1\44\1\45\1\2\1\3\1\4\1\5"+
        "\1\7\1\6\1\11\1\10\1\12\1\uffff\1\41\15\uffff\1\32\1\34\1\33\1\35"+
        "\1\36\1\37\1\40\1\42\1\43\1\46\4\uffff\1\25\10\uffff\1\31\10\uffff"+
        "\1\22\1\24\7\uffff\1\16\3\uffff\1\27\1\26\3\uffff\1\23\4\uffff\1"+
        "\30\1\13\5\uffff\1\14\1\15\1\17\3\uffff\1\20\1\21";
    static final String DFA12_specialS =
        "\1\2\34\uffff\1\0\1\1\143\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\10\1\35\4\40\1\36\1\30\1"+
            "\31\1\1\1\3\1\27\1\4\1\25\1\2\12\34\1\24\1\26\1\6\1\5\1\7\2"+
            "\40\32\33\3\40\1\32\1\33\1\40\1\33\1\12\1\33\1\23\1\20\1\16"+
            "\2\33\1\13\6\33\1\15\1\33\1\14\1\11\1\21\1\33\1\17\1\22\3\33"+
            "\uff85\40",
            "",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\52",
            "\1\54",
            "\1\55",
            "\1\60\11\uffff\1\57",
            "\1\62\7\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\1\uffff\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\0\104",
            "\0\104",
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
            "",
            "",
            "",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\132\3\uffff\1\131",
            "\1\133",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "\1\177",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_ASSIGNSYM | RULE_DOT | RULE_COLON | RULE_SEMICOLON | RULE_COMMA | RULE_LBRACE | RULE_RBRACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 68;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 68;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='*') ) {s = 1;}

                        else if ( (LA12_0=='/') ) {s = 2;}

                        else if ( (LA12_0=='+') ) {s = 3;}

                        else if ( (LA12_0=='-') ) {s = 4;}

                        else if ( (LA12_0=='=') ) {s = 5;}

                        else if ( (LA12_0=='<') ) {s = 6;}

                        else if ( (LA12_0=='>') ) {s = 7;}

                        else if ( (LA12_0=='!') ) {s = 8;}

                        else if ( (LA12_0=='s') ) {s = 9;}

                        else if ( (LA12_0=='b') ) {s = 10;}

                        else if ( (LA12_0=='i') ) {s = 11;}

                        else if ( (LA12_0=='r') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='f') ) {s = 14;}

                        else if ( (LA12_0=='v') ) {s = 15;}

                        else if ( (LA12_0=='e') ) {s = 16;}

                        else if ( (LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='w') ) {s = 18;}

                        else if ( (LA12_0=='d') ) {s = 19;}

                        else if ( (LA12_0==':') ) {s = 20;}

                        else if ( (LA12_0=='.') ) {s = 21;}

                        else if ( (LA12_0==';') ) {s = 22;}

                        else if ( (LA12_0==',') ) {s = 23;}

                        else if ( (LA12_0=='(') ) {s = 24;}

                        else if ( (LA12_0==')') ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='c'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||LA12_0=='q'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 27;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 31;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}