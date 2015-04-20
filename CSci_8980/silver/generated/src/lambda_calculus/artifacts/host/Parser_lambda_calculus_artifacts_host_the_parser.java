/*
 * Built at Wed Nov 13 06:41:30 CST 2013
 * by Copper version 0.7.0,
 *      revision d962de84bb06ff887540a76bc186e617f11d225f,
 *      build 20130821-1807
 */
package lambda_calculus.artifacts.host;


public class Parser_lambda_calculus_artifacts_host_the_parser extends edu.umn.cs.melt.copper.runtime.engines.single.SingleDFAEngine<lambda_calculus.host.concretesyntax.NRoot,edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
{
    protected String formatError(String error)
    {
    	   String location = "";
        location += "line " + virtualLocation.getLine() + ", column " + virtualLocation.getColumn();
        if(currentState.pos.getFileName().length() > 40) location += "\n         ";
        location += " in file " + virtualLocation.getFileName();
        location += "\n         (parser state: " + currentState.statenum + "; real character index: " + currentState.pos.getPos() + ")";
        return "Error at " + location + ":\n  " + error;
    }
    protected void reportError(String message)
    throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        throw new edu.umn.cs.melt.copper.runtime.logging.CopperParserException(message);
    }
    protected void reportSyntaxError()
    throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
    java.util.ArrayList<String> expectedTerminalsReal = bitVecToRealStringList(getShiftableSets()[currentState.statenum]);
    java.util.ArrayList<String> expectedTerminalsDisplay = bitVecToDisplayStringList(getShiftableSets()[currentState.statenum]);
    java.util.ArrayList<String> matchedTerminalsReal = bitVecToRealStringList(disjointMatch.terms);
    java.util.ArrayList<String> matchedTerminalsDisplay = bitVecToDisplayStringList(disjointMatch.terms);
    throw new edu.umn.cs.melt.copper.runtime.logging.CopperSyntaxError(virtualLocation,currentState.pos,currentState.statenum,expectedTerminalsReal,expectedTerminalsDisplay,matchedTerminalsReal,matchedTerminalsDisplay);
    }
    public static enum Terminals implements edu.umn.cs.melt.copper.runtime.engines.CopperTerminalEnum
    {
        lambda_calculus_host_concretesyntax_And_t(1),
        lambda_calculus_host_concretesyntax_Arrow_t(2),
        lambda_calculus_host_concretesyntax_Colon_t(3),
        lambda_calculus_host_concretesyntax_Dot_t(4),
        lambda_calculus_host_concretesyntax_End_t(5),
        lambda_calculus_host_concretesyntax_Equal_t(6),
        lambda_calculus_host_concretesyntax_GreaterE_t(7),
        lambda_calculus_host_concretesyntax_Greater_t(8),
        lambda_calculus_host_concretesyntax_IntConst_t(9),
        lambda_calculus_host_concretesyntax_Int_t(10),
        lambda_calculus_host_concretesyntax_Integer_t(11),
        lambda_calculus_host_concretesyntax_Lambda_t(12),
        lambda_calculus_host_concretesyntax_LeftParen_t(13),
        lambda_calculus_host_concretesyntax_LessE_t(14),
        lambda_calculus_host_concretesyntax_Less_t(15),
        lambda_calculus_host_concretesyntax_Let_t(16),
        lambda_calculus_host_concretesyntax_LineComment_t(17),
        lambda_calculus_host_concretesyntax_Minus_t(18),
        lambda_calculus_host_concretesyntax_Name_t(19),
        lambda_calculus_host_concretesyntax_Or_t(20),
        lambda_calculus_host_concretesyntax_Plus_t(21),
        lambda_calculus_host_concretesyntax_RightParen_t(22),
        lambda_calculus_host_concretesyntax_Slash_t(23),
        lambda_calculus_host_concretesyntax_Star_t(24),
        lambda_calculus_host_concretesyntax_WS_t(25);

        private final int num;
        Terminals(int num) { this.num = num; }
        public int num() { return num; }
    }

    public void pushToken(Terminals t,String lexeme)
    {
        java.util.BitSet ts = new java.util.BitSet();
        ts.set(t.num());
        tokenBuffer.offer(new edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData(ts,currentState.pos,currentState.pos,lexeme,new java.util.LinkedList<edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData>()));
    }
    public void setupEngine()
    {
    }
    public int transition(int state,char ch)
    {
         return delta[state][cmap[ch]];
    }
    public class Semantics extends edu.umn.cs.melt.copper.runtime.engines.single.semantics.SingleDFASemanticActionContainer<edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
    {
        public common.DecoratedNode context;

        public Semantics()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            runInit();
        }

        public void error(edu.umn.cs.melt.copper.runtime.io.InputPosition pos,java.lang.String message)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            reportError("Error at " + pos.toString() + ":\n  " + message);
        }

        public void runDefaultTermAction()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
        }
        public void runDefaultProdAction()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
        }
        public void runInit()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            context = common.TopNode.singleton;
        }
        public java.lang.Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,java.lang.Object[] _children,int _prod)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            this._pos = _pos;
            this._children = _children;
            this._prod = _prod;
            this._specialAttributes = new edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes(virtualLocation);
            java.lang.Object RESULT = null;
            switch(_prod)
            {
            case 34:
                RESULT = runSemanticAction_34();
                break;
            case 35:
                RESULT = runSemanticAction_35();
                break;
            case 36:
                RESULT = runSemanticAction_36();
                break;
            case 37:
                RESULT = runSemanticAction_37();
                break;
            case 38:
                RESULT = runSemanticAction_38();
                break;
            case 39:
                RESULT = runSemanticAction_39();
                break;
            case 40:
                RESULT = runSemanticAction_40();
                break;
            case 41:
                RESULT = runSemanticAction_41();
                break;
            case 42:
                RESULT = runSemanticAction_42();
                break;
            case 43:
                RESULT = runSemanticAction_43();
                break;
            case 44:
                RESULT = runSemanticAction_44();
                break;
            case 45:
                RESULT = runSemanticAction_45();
                break;
            case 46:
                RESULT = runSemanticAction_46();
                break;
            case 47:
                RESULT = runSemanticAction_47();
                break;
            case 48:
                RESULT = runSemanticAction_48();
                break;
            case 49:
                RESULT = runSemanticAction_49();
                break;
            case 50:
                RESULT = runSemanticAction_50();
                break;
            case 51:
                RESULT = runSemanticAction_51();
                break;
            case 52:
                RESULT = runSemanticAction_52();
                break;
            case 53:
                RESULT = runSemanticAction_53();
                break;
            case 54:
                RESULT = runSemanticAction_54();
                break;
            case 55:
                RESULT = runSemanticAction_55();
                break;
            default:
        runDefaultProdAction();
                 break;
            }
            return RESULT;
        }
        public java.lang.Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData _terminal)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            this._pos = _pos;
            this._terminal = _terminal;
            this._specialAttributes = new edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes(virtualLocation);
            String lexeme = _terminal.lexeme;
            java.lang.Object RESULT = null;
            switch(_terminal.firstTerm)
            {
            case 1:
                RESULT = runSemanticAction_1(lexeme);
                break;
            case 2:
                RESULT = runSemanticAction_2(lexeme);
                break;
            case 3:
                RESULT = runSemanticAction_3(lexeme);
                break;
            case 4:
                RESULT = runSemanticAction_4(lexeme);
                break;
            case 5:
                RESULT = runSemanticAction_5(lexeme);
                break;
            case 6:
                RESULT = runSemanticAction_6(lexeme);
                break;
            case 7:
                RESULT = runSemanticAction_7(lexeme);
                break;
            case 8:
                RESULT = runSemanticAction_8(lexeme);
                break;
            case 9:
                RESULT = runSemanticAction_9(lexeme);
                break;
            case 10:
                RESULT = runSemanticAction_10(lexeme);
                break;
            case 11:
                RESULT = runSemanticAction_11(lexeme);
                break;
            case 12:
                RESULT = runSemanticAction_12(lexeme);
                break;
            case 13:
                RESULT = runSemanticAction_13(lexeme);
                break;
            case 14:
                RESULT = runSemanticAction_14(lexeme);
                break;
            case 15:
                RESULT = runSemanticAction_15(lexeme);
                break;
            case 16:
                RESULT = runSemanticAction_16(lexeme);
                break;
            case 17:
                RESULT = runSemanticAction_17(lexeme);
                break;
            case 18:
                RESULT = runSemanticAction_18(lexeme);
                break;
            case 19:
                RESULT = runSemanticAction_19(lexeme);
                break;
            case 20:
                RESULT = runSemanticAction_20(lexeme);
                break;
            case 21:
                RESULT = runSemanticAction_21(lexeme);
                break;
            case 22:
                RESULT = runSemanticAction_22(lexeme);
                break;
            case 23:
                RESULT = runSemanticAction_23(lexeme);
                break;
            case 24:
                RESULT = runSemanticAction_24(lexeme);
                break;
            case 25:
                RESULT = runSemanticAction_25(lexeme);
                break;
            default:
        runDefaultTermAction();
                 break;
            }
            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NATerm runSemanticAction_34()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NATerm RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_169_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NATerm runSemanticAction_35()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NATerm RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_174_0(_children[0]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NATerm runSemanticAction_36()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NATerm RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_179_0(_children[0]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NAppTerm runSemanticAction_37()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NAppTerm RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0(_children[0], _children[1]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NAppTerm runSemanticAction_38()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NAppTerm RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_161_0(_children[0]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_39()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_104_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_40()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_109_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_41()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_114_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_42()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_120_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_43()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_44()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_132_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_45()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_147_0(_children[0]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_46()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_79_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_47()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_84_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_48()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_89_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_49()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_94_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NExpr runSemanticAction_50()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_99_0(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NLamExpr runSemanticAction_51()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NLamExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0(_children[0], _children[1], _children[2], _children[3], _children[4], _children[5]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NLamExpr runSemanticAction_52()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NLamExpr RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0(_children[0]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NRoot runSemanticAction_53()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NRoot RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.Proot(_children[0]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NType runSemanticAction_54()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NType RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PfunctionType(_children[0], _children[1], _children[2]);

            return RESULT;
        }
        public lambda_calculus.host.concretesyntax.NType runSemanticAction_55()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            lambda_calculus.host.concretesyntax.NType RESULT = null;
            
RESULT = new lambda_calculus.host.concretesyntax.PintegerType(_children[0]);

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_1(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_2(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_3(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_4(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_5(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_6(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_7(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_8(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_9(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_10(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_11(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_12(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_13(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_14(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_15(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_16(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_17(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_18(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_19(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_20(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_21(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_22(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_23(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_24(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_25(final String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,(int)getStartRealLocation().getPos(),(int)getEndRealLocation().getPos());

            return RESULT;
        }
        public int runDisambiguationAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData match)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            return -1;
        }
    }
    public Semantics semantics;
    public java.lang.Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,java.lang.Object[] _children,int _prod)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runSemanticAction(_pos,_children,_prod);
    }
    public java.lang.Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData _terminal)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runSemanticAction(_pos,_terminal);
    }
    public int runDisambiguationAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData matches)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runDisambiguationAction(_pos,matches);
    }
    public edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes getSpecialAttributes()
    {
        return semantics.getSpecialAttributes();
    }
    public void startEngine(edu.umn.cs.melt.copper.runtime.io.InputPosition initialPos)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
         super.startEngine(initialPos);
         semantics = new Semantics();
    }

public static final byte[] symbolNamesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\265\226\115\116\302\100" +
"\030\206\047\032\274\200\153\367\376\142\213\120\040\256\010\126" +
"\142\122\205\320\106\114\134\064\143\031\112\315\164\246\316\114" +
"\021\342\225\364\062\136\302\270\360\016\322\316\005\076\026\337" +
"\376\231\267\117\337\371\375\374\043\215\122\221\303\347\340\225" +
"\256\150\223\123\221\066\103\243\062\221\136\177\175\077\376\374" +
"\036\175\214\366\010\131\027\204\220\236\041\373\376\370\326\220" +
"\023\116\363\227\071\215\023\312\223\222\227\072\136\112\155\342" +
"\104\212\104\061\303\364\106\030\272\216\007\142\036\033\103\316" +
"\100\254\122\362\035\114\017\045\227\242\242\101\036\067\322\200" +
"\131\177\007\147\377\255\244\274\242\233\020\172\244\030\065\114" +
"\371\325\200\213\035\006\200\077\160\047\314\120\012\015\377\327" +
"\355\000\260\314\226\145\251\225\071\207\360\201\145\266\370\045" +
"\010\147\013\063\241\212\011\160\371\001\323\272\356\362\024\112" +
"\203\173\011\130\335\213\013\142\063\301\206\062\317\231\355\022" +
"\244\176\237\211\122\203\325\037\150\316\052\370\030\002\217\025" +
"\070\167\302\255\204\003\201\247\131\272\334\161\202\102\116\365" +
"\022\154\023\032\252\300\177\071\013\053\264\021\106\203\151\004" +
"\075\213\042\246\162\350\131\124\024\226\006\311\370\353\102\101" +
"\327\054\315\055\015\012\236\112\011\055\044\332\024\314\220\203" +
"\272\220\211\041\117\240\371\217\001\124\150\131\275\212\135\257" +
"\037\073\110\321\335\066\136\064\236\165\307\103\213\366\134\264" +
"\150\007\257\153\007\257\153\027\317\272\345\340\105\343\255\220" +
"\253\026\132\164\273\133\105\317\020\242\355\146\304\110\356\265" +
"\321\222\321\234\373\150\316\175\064\147\257\203\266\066\352\155" +
"\010\272\355\124\175\061\202\336\055\213\122\044\046\223\302\136" +
"\220\240\247\150\146\137\272\325\210\177\376\134\344\332\032\015" +
"\000\000"
});

public static final byte[] symbolDisplayNamesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\265\226\313\116\302\100" +
"\024\206\007\023\237\300\265\073\027\136\261\105\050\027\127\006" +
"\033\142\202\112\050\021\023\023\232\261\014\245\246\235\251\063" +
"\123\204\370\112\372\062\276\204\161\341\073\110\073\053\033\026" +
"\207\305\331\177\347\357\327\277\063\235\371\370\045\273\231\044" +
"\173\117\375\027\272\240\325\230\362\260\352\151\031\361\360\362" +
"\363\353\341\373\147\377\275\267\103\310\062\045\204\264\064\251" +
"\034\150\162\024\323\344\171\112\375\200\306\101\026\147\252\063" +
"\027\112\167\002\301\003\311\064\123\053\256\351\262\163\305\247" +
"\276\326\344\004\304\112\051\336\300\164\127\304\202\347\064\310" +
"\343\132\150\060\353\156\341\354\276\146\064\316\351\052\204\356" +
"\111\106\065\223\156\076\160\266\305\000\370\001\067\134\167\005" +
"\127\360\167\135\017\200\145\326\054\013\215\314\051\204\357\033" +
"\146\215\237\203\160\066\323\003\052\031\007\227\337\147\112\025" +
"\135\036\103\151\160\057\175\126\364\142\203\330\210\263\256\110" +
"\022\146\272\004\251\337\106\074\123\140\365\073\232\260\034\076" +
"\204\300\367\022\234\073\210\215\204\005\201\207\121\070\337\362" +
"\003\171\061\125\163\260\215\247\251\004\277\345\330\313\321\312" +
"\004\372\037\032\061\231\100\377\103\151\152\150\220\210\273\114" +
"\045\164\275\322\304\320\240\340\241\020\320\062\106\253\224\151" +
"\262\063\131\267\361\130\342\375\234\367\377\363\376\300\007\120" +
"\236\141\325\302\267\235\266\157\041\105\067\353\170\321\170\326" +
"\015\007\055\332\261\321\242\055\274\256\055\274\256\155\074\353" +
"\232\205\027\215\267\102\056\152\150\321\365\146\036\075\106\210" +
"\066\233\021\043\271\125\107\113\106\163\156\243\071\267\321\234" +
"\235\006\332\332\050\266\141\371\244\333\230\054\213\103\261\174" +
"\137\331\210\316\062\036\350\110\160\163\070\226\257\240\033\107" +
"\042\163\303\315\047\376\000\261\177\033\122\020\015\000\000"
});

public static final byte[] symbolNumbersHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\054\030\350\004\024\360\140\007\006\006\046" +
"\040\146\006\142\106\050\146\202\322\314\070\060\056\071\066\044" +
"\063\300\352\000\314\321\177\105\373\000\000\000"
});

public static final byte[] productionLHSsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\304\025\030\030\244\200\130\032\011\313\100" +
"\261\054\211\130\016\212\345\201\130\001\204\001\316\170\014\113" +
"\167\000\000\000"
});

public static final byte[] parseTableHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\315\230\317\122\023\101" +
"\020\306\273\200\000\002\012\050\202\050\352\200\232\115\126\376" +
"\106\324\013\207\275\162\240\174\200\134\170\004\265\052\024\047" +
"\357\236\174\012\157\236\074\372\074\236\254\362\354\325\156\230" +
"\205\236\246\073\331\235\112\310\164\325\127\233\351\257\173\346" +
"\127\331\154\146\222\037\177\241\321\373\014\223\335\356\361\332" +
"\277\337\037\326\277\175\075\232\000\070\377\010\000\333\230\237" +
"\350\036\237\374\072\155\236\375\371\371\275\114\157\102\002\321" +
"\373\004\137\000\211\252\321\070\270\250\055\137\117\242\246\214" +
"\272\306\200\171\246\121\063\250\131\324\035\324\134\110\123\000" +
"\274\040\311\316\062\257\371\132\136\326\133\275\132\324\173\157" +
"\252\206\003\230\217\351\113\342\116\055\334\244\051\000\136\222" +
"\144\147\231\327\174\055\057\353\255\136\055\002\232\046\111\241" +
"\151\162\131\236\125\157\365\016\244\331\041\051\064\073\245\034" +
"\273\123\024\070\236\222\175\276\256\301\373\144\015\372\167\007" +
"\322\034\142\325\075\131\201\271\105\324\022\152\131\233\001\363" +
"\367\121\017\330\170\305\137\037\242\126\375\274\153\250\107\132" +
"\277\111\363\166\120\365\250\343\232\346\164\334\050\140\075\341" +
"\016\140\075\035\232\141\206\003\170\134\237\246\000\170\105\222" +
"\025\145\136\363\265\274\254\267\172\373\323\124\141\167\312\023" +
"\156\324\125\375\056\176\222\024\315\106\122\064\117\223\242\171" +
"\226\024\315\363\244\150\134\122\064\301\272\143\247\331\112\212" +
"\046\070\053\217\235\046\070\017\216\235\046\330\055\342\166\115" +
"\127\341\124\131\067\160\316\054\330\065\267\012\361\251\242\050" +
"\363\232\257\345\145\275\325\253\105\100\363\232\244\060\107\235" +
"\104\151\056\167\171\022\245\153\375\223\150\213\044\053\050\027" +
"\111\323\362\064\255\050\232\234\244\320\344\226\307\175\205\046" +
"\367\064\171\024\115\207\244\254\326\261\074\356\053\064\035\117" +
"\323\211\242\151\223\224\325\332\226\307\175\205\246\355\151\332" +
"\121\064\031\111\131\055\263\074\356\053\064\231\247\311\242\150" +
"\016\110\312\152\007\226\307\175\076\226\175\121\064\333\156\210" +
"\277\065\375\174\253\376\132\237\146\227\044\053\312\274\346\161" +
"\237\217\145\137\024\315\036\111\131\155\317\362\270\317\307\262" +
"\257\137\277\111\263\117\122\126\333\267\074\356\363\261\354\353" +
"\327\257\323\260\331\336\363\353\155\306\115\032\347\167\007\147" +
"\174\277\334\056\115\225\160\243\071\121\344\111\374\013\171\165" +
"\156\260\357\124\001\360\256\012\341\060\043\170\246\336\214\142" +
"\205\072\363\376\007\307\061\251\264\221\030\000\000"
});

public static final byte[] shiftableSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\116\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\012\223\140\342\062\302\056\301\374\357\361\141\034\072\250" +
"\146\024\031\022\337\016\342\160\025\023\003\043\311\022\034\330" +
"\045\234\160\170\020\117\220\050\341\012\222\021\053\301\304\101" +
"\152\142\300\025\265\043\127\002\230\104\105\110\225\300\021\354" +
"\070\063\047\156\243\234\200\031\007\000\121\321\056\167\254\004" +
"\000\000"
});

public static final byte[] layoutSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\116\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\012\223\140\142\032\225\030\225\030\225\030\225\300\052\001" +
"\000\352\046\320\272\254\004\000\000"
});

public static final byte[] prefixSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\116\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\052\061\052\101\100\002\000\100\106\334" +
"\140\254\004\000\000"
});

public static final byte[] prefixMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\044\072\332\047\053\261\054\121\257\264\044\063\107\317" +
"\051\263\044\070\265\304\132\362\322\273\215\346\317\356\030\061" +
"\061\060\124\024\060\060\060\350\000\025\012\143\121\227\053\251" +
"\301\162\276\317\245\000\246\116\252\000\047\050\055\144\250\143" +
"\140\032\125\063\252\146\124\315\250\232\121\065\043\131\015\000" +
"\004\053\371\052\173\006\000\000"
});

public static final byte[] terminalUsesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\244\030\350\004\000\325\133\125\016\203\000" +
"\000\000"
});

public static final byte[] shiftableUnionHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\270" +
"\210\101\040\053\261\054\121\257\264\044\063\107\317\051\263\044" +
"\070\265\044\357\157\107\235\245\311\152\105\146\006\306\150\006" +
"\226\244\314\222\342\022\006\246\150\257\212\202\322\042\060\255" +
"\300\262\125\150\143\351\144\046\006\206\212\002\006\006\006\106" +
"\040\146\140\376\367\373\176\005\000\022\246\030\030\121\000\000" +
"\000"
});

public static final byte[] acceptSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\156\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\250\050\056\144\250\143\140\052\005\221\254\330" +
"\004\030\031\300\240\001\207\004\007\056\035\070\045\200\122\130" +
"\045\230\160\133\316\040\100\252\035\012\204\075\106\254\327\025" +
"\160\111\260\220\352\165\106\234\166\070\340\364\010\043\311\301" +
"\313\204\103\242\001\247\016\001\134\022\016\324\212\164\334\161" +
"\213\047\231\070\340\222\140\302\056\041\200\333\050\026\034\022" +
"\054\070\164\060\341\066\252\201\132\361\301\110\162\220\340\161" +
"\225\002\265\162\047\156\177\160\060\124\000\000\156\273\241\064" +
"\235\004\000\000"
});

public static final byte[] rejectSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\156\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\250\050\056\144\250\143\140\052\005\221\254\243" +
"\002\243\002\250\002\214\040\101\006\216\101\147\070\065\335\205" +
"\060\013\000\275\311\137\240\175\003\000\000"
});

public static final byte[] possibleSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\156\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\250\050\056\144\250\143\140\052\005\221\254\100" +
"\076\043\110\220\371\377\377\177\130\045\030\030\016\140\327\301" +
"\300\201\303\050\006\116\134\022\100\075\130\045\230\160\271\012" +
"\010\004\160\130\316\201\113\207\002\116\243\034\160\111\060\141" +
"\227\020\300\345\052\005\134\022\054\014\054\070\234\313\202\135" +
"\007\043\023\056\243\034\160\006\011\143\003\256\370\120\300\241" +
"\203\011\207\121\015\070\355\020\300\045\341\100\255\304\200\073" +
"\316\161\107\055\365\142\220\201\324\210\142\300\031\121\300\140" +
"\244\126\174\340\314\070\070\203\004\247\253\160\132\216\323\050" +
"\362\044\000\206\317\226\033\275\004\000\000"
});

public static final byte[] cMapHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\321\075\112\103\101" +
"\024\006\320\361\305\247\306\044\032\065\152\376\154\335\213\205" +
"\053\260\311\022\104\110\310\206\354\254\054\135\222\340\036\274" +
"\017\246\170\204\204\114\012\033\071\003\207\073\314\334\313\307" +
"\060\037\077\251\136\276\245\352\345\351\371\153\361\270\372\376" +
"\174\257\122\132\277\246\243\324\254\207\002\165\230\025\366\036" +
"\252\336\161\076\310\265\033\156\303\044\014\363\331\125\070\011" +
"\067\141\134\350\070\317\066\257\356\207\273\126\126\265\307\151" +
"\101\117\211\046\153\332\312\235\157\311\277\010\367\171\077\312" +
"\365\272\165\337\311\365\174\143\356\054\327\336\236\374\313\077" +
"\372\107\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\376" +
"\221\137\004\136\275\344\033\000\004\000"
});

public static final byte[] deltaHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\071\072\332\123\374\373\023\177\311\376\116\033\046\006" +
"\206\212\002\006\006\006\135\240\070\123\264\247\357\256\004\265" +
"\262\127\233\226\302\204\345\030\006\010\224\026\062\324\061\060" +
"\041\271\000\304\146\006\142\026\040\146\005\142\066\040\146\007" +
"\142\016\250\070\047\224\006\141\056\040\346\206\262\171\200\230" +
"\027\210\371\200\230\037\210\005\240\342\202\100\054\004\304\302" +
"\100\054\002\304\242\100\054\006\065\027\273\013\110\001\342\144" +
"\350\301\000\130\135\040\001\305\014\070\304\320\345\261\251\105" +
"\027\307\145\046\375\134\040\111\222\013\350\012\010\272\100\212" +
"\106\026\303\315\035\244\141\100\050\035\110\063\320\072\045\322" +
"\025\120\344\002\231\001\167\001\010\310\016\270\013\140\200\154" +
"\375\103\074\035\020\013\344\111\166\001\241\334\250\300\060\024" +
"\162\243\042\261\012\207\170\072\120\242\231\013\010\245\003\145" +
"\206\241\220\016\260\001\025\154\202\103\074\035\014\147\027\014" +
"\215\226\252\052\115\135\200\014\006\246\235\110\114\030\250\241" +
"\311\241\253\105\027\037\034\345\001\126\060\352\202\101\353\202" +
"\201\055\017\324\351\204\341\166\015\223\130\320\300\242\226\201" +
"\141\060\226\007\304\267\017\206\106\315\104\252\013\064\211\166" +
"\301\340\310\013\303\047\026\264\006\334\005\310\342\332\124\161" +
"\201\016\005\056\030\370\060\300\351\002\000\153\140\341\260\003" +
"\027\000\000"
});

public static void initArrays()
throws java.io.IOException,java.lang.ClassNotFoundException
{
    symbolNames = (String[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(symbolNamesHash);
    symbolDisplayNames = (String[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(symbolDisplayNamesHash);
    symbolNumbers = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(symbolNumbersHash);
    productionLHSs = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(productionLHSsHash);
    parseTable = (int[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(parseTableHash);
    shiftableSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(shiftableSetsHash);
    layoutSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(layoutSetsHash);
    prefixSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(prefixSetsHash);
    prefixMaps = (java.util.BitSet[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(prefixMapsHash);
    terminalUses = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(terminalUsesHash);
    shiftableUnion = (java.util.BitSet) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(shiftableUnionHash);
    acceptSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(acceptSetsHash);
    rejectSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(rejectSetsHash);
    possibleSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(possibleSetsHash);
    cmap = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(cMapHash);
    delta = (int[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(deltaHash);
    }
public Parser_lambda_calculus_artifacts_host_the_parser() {}

		private static int TERMINAL_COUNT;
		private static int GRAMMAR_SYMBOL_COUNT;
		private static int SYMBOL_COUNT;
		private static int PARSER_STATE_COUNT;
		private static int SCANNER_STATE_COUNT;
		private static int DISAMBIG_GROUP_COUNT;
		
		private static int SCANNER_START_STATENUM;
		private static int PARSER_START_STATENUM;
		private static int EOF_SYMNUM;
		private static int EPS_SYMNUM;
		
		private static String[] symbolNames;
		private static String[] symbolDisplayNames;
		private static int[] symbolNumbers;
		private static int[] productionLHSs;
		
		private static int[][] parseTable;
		private static java.util.BitSet[] shiftableSets;
		private static java.util.BitSet[] layoutSets;
		private static java.util.BitSet[] prefixSets;
		private static java.util.BitSet[][] prefixMaps;
		private static int[] terminalUses;
		
		private static java.util.BitSet[] disambiguationGroups;
		
		private static java.util.BitSet shiftableUnion;
		
		private static java.util.BitSet[] acceptSets,rejectSets,possibleSets;
		
		private static int[][] delta;
		private static int[] cmap;
		
		public int getTERMINAL_COUNT() {
			return TERMINAL_COUNT;
		}
		public int getGRAMMAR_SYMBOL_COUNT() {
			return GRAMMAR_SYMBOL_COUNT;
		}
		public int getSYMBOL_COUNT() {
			return SYMBOL_COUNT;
		}
		public int getPARSER_STATE_COUNT() {
			return PARSER_STATE_COUNT;
		}
		public int getSCANNER_STATE_COUNT() {
			return SCANNER_STATE_COUNT;
		}
		public int getDISAMBIG_GROUP_COUNT() {
			return DISAMBIG_GROUP_COUNT;
		}
		public int getSCANNER_START_STATENUM() {
			return SCANNER_START_STATENUM;
		}
		public int getPARSER_START_STATENUM() {
			return PARSER_START_STATENUM;
		}
		public int getEOF_SYMNUM() {
			return EOF_SYMNUM;
		}
		public int getEPS_SYMNUM() {
			return EPS_SYMNUM;
		}
		public String[] getSymbolNames() {
			return symbolNames;
		}
		public String[] getSymbolDisplayNames() {
			return symbolDisplayNames;
		}
		public int[] getSymbolNumbers() {
			return symbolNumbers;
		}
		public int[] getProductionLHSs() {
			return productionLHSs;
		}
		public int[][] getParseTable() {
			return parseTable;
		}
		public java.util.BitSet[] getShiftableSets() {
			return shiftableSets;
		}
		public java.util.BitSet[] getLayoutSets() {
			return layoutSets;
		}
		public java.util.BitSet[] getPrefixSets() {
			return prefixSets;
		}
		public java.util.BitSet[][] getLayoutMaps() {
			return null;
		}
		public java.util.BitSet[][] getPrefixMaps() {
			return prefixMaps;
		}
		public int[] getTerminalUses() {
			return terminalUses;
		}
		public java.util.BitSet[] getDisambiguationGroups() {
			return disambiguationGroups;
		}
		public java.util.BitSet getShiftableUnion() {
			return shiftableUnion;
		}
		public java.util.BitSet[] getAcceptSets() {
			return acceptSets;
		}
		public java.util.BitSet[] getRejectSets() {
			return rejectSets;
		}
		public java.util.BitSet[] getPossibleSets() {
			return possibleSets;
		}
		public int[][] getDelta() {
			return delta;
		}
		public int[] getCmap() {
			return cmap;
		}	
    public lambda_calculus.host.concretesyntax.NRoot parse(java.io.Reader input,String inputName)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
    this.charBuffer = edu.umn.cs.melt.copper.runtime.io.ScannerBuffer.instantiate(input);
    setupEngine();
    startEngine(edu.umn.cs.melt.copper.runtime.io.InputPosition.initialPos(inputName));
    lambda_calculus.host.concretesyntax.NRoot parseTree = (lambda_calculus.host.concretesyntax.NRoot) runEngine();
    return parseTree;
    }



    static
    {
        TERMINAL_COUNT = 26;
        GRAMMAR_SYMBOL_COUNT = 33;
        SYMBOL_COUNT = 56;
        PARSER_STATE_COUNT = 44;
        SCANNER_STATE_COUNT = 45;
        DISAMBIG_GROUP_COUNT = 1;
        SCANNER_START_STATENUM = 1;
        PARSER_START_STATENUM = 1;
        EOF_SYMNUM = 0;
        EPS_SYMNUM = -1;
        try { initArrays(); }
        catch(java.io.IOException ex) { ex.printStackTrace(); System.exit(1); }
        catch(java.lang.ClassNotFoundException ex) { ex.printStackTrace(); System.exit(1); }
        disambiguationGroups = new java.util.BitSet[1];
    }

}
