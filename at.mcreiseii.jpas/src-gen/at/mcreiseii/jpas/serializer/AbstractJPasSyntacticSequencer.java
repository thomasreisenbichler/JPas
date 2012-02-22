package at.mcreiseii.jpas.serializer;

import at.mcreiseii.jpas.services.JPasGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractJPasSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JPasGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IfStatement_WhileStatement___IfKeyword_0_LbraceTerminalRuleCall_1___or___WhileKeyword_0_LbraceTerminalRuleCall_1__;
	protected AbstractElementAlias match_Param_SemicolonTerminalRuleCall_3_q;
	protected AbstractElementAlias match_ProcParam_CommaTerminalRuleCall_4_q;
	protected AbstractElementAlias match_ProcParam_VarKeyword_0_q;
	protected AbstractElementAlias match_Variable_SemicolonTerminalRuleCall_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JPasGrammarAccess) access;
		match_IfStatement_WhileStatement___IfKeyword_0_LbraceTerminalRuleCall_1___or___WhileKeyword_0_LbraceTerminalRuleCall_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getIfKeyword_0()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getLbraceTerminalRuleCall_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWhileStatementAccess().getWhileKeyword_0()), new TokenAlias(false, false, grammarAccess.getWhileStatementAccess().getLbraceTerminalRuleCall_1())));
		match_Param_SemicolonTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getParamAccess().getSemicolonTerminalRuleCall_3());
		match_ProcParam_CommaTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getProcParamAccess().getCommaTerminalRuleCall_4());
		match_ProcParam_VarKeyword_0_q = new TokenAlias(false, true, grammarAccess.getProcParamAccess().getVarKeyword_0());
		match_Variable_SemicolonTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getVariableAccess().getSemicolonTerminalRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getExpressionRule())
			return getExpressionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAssignSymRule())
			return getassignSymToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getColonRule())
			return getcolonToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCommaRule())
			return getcommaToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDotRule())
			return getdotToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLbraceRule())
			return getlbraceToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRbraceRule())
			return getrbraceToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSemicolonRule())
			return getsemicolonToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getExpressionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getassignSymToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	protected String getcolonToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	protected String getcommaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getdotToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	protected String getlbraceToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	protected String getrbraceToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	protected String getsemicolonToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_IfStatement_WhileStatement___IfKeyword_0_LbraceTerminalRuleCall_1___or___WhileKeyword_0_LbraceTerminalRuleCall_1__.equals(syntax))
				emit_IfStatement_WhileStatement___IfKeyword_0_LbraceTerminalRuleCall_1___or___WhileKeyword_0_LbraceTerminalRuleCall_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Param_SemicolonTerminalRuleCall_3_q.equals(syntax))
				emit_Param_SemicolonTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProcParam_CommaTerminalRuleCall_4_q.equals(syntax))
				emit_ProcParam_CommaTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProcParam_VarKeyword_0_q.equals(syntax))
				emit_ProcParam_VarKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Variable_SemicolonTerminalRuleCall_3_q.equals(syntax))
				emit_Variable_SemicolonTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('if' lbrace) | ('while' lbrace)
	 */
	protected void emit_IfStatement_WhileStatement___IfKeyword_0_LbraceTerminalRuleCall_1___or___WhileKeyword_0_LbraceTerminalRuleCall_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     semicolon?
	 */
	protected void emit_Param_SemicolonTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     comma?
	 */
	protected void emit_ProcParam_CommaTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'var'?
	 */
	protected void emit_ProcParam_VarKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     semicolon?
	 */
	protected void emit_Variable_SemicolonTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
