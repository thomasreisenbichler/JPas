package at.mcreiseii.jpas.serializer;

import at.mcreiseii.jpas.jPas.AssignStatement;
import at.mcreiseii.jpas.jPas.Condition;
import at.mcreiseii.jpas.jPas.Function;
import at.mcreiseii.jpas.jPas.JPasPackage;
import at.mcreiseii.jpas.jPas.Model;
import at.mcreiseii.jpas.jPas.Param;
import at.mcreiseii.jpas.jPas.ProcParam;
import at.mcreiseii.jpas.jPas.Procedure;
import at.mcreiseii.jpas.jPas.Program;
import at.mcreiseii.jpas.jPas.StatementSequence;
import at.mcreiseii.jpas.jPas.Variable;
import at.mcreiseii.jpas.jPas.VariableDeclaration;
import at.mcreiseii.jpas.services.JPasGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractJPasSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected JPasGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JPasPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JPasPackage.ASSIGN_STATEMENT:
				if(context == grammarAccess.getAssignStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AssignStatement(context, (AssignStatement) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStatement(context, (Condition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.PROC_PARAM:
				if(context == grammarAccess.getProcParamRule()) {
					sequence_ProcParam(context, (ProcParam) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.PROCEDURE:
				if(context == grammarAccess.getMethodRule() ||
				   context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.STATEMENT_SEQUENCE:
				if(context == grammarAccess.getStatementSequenceRule()) {
					sequence_StatementSequence(context, (StatementSequence) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case JPasPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     variable=ID
	 */
	protected void sequence_AssignStatement(EObject context, AssignStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.ASSIGN_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.ASSIGN_STATEMENT__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignStatementAccess().getVariableIDTerminalRuleCall_0_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression operator=Operator right=Expression)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=Param* returntype=Datatype variableDeclaration=VariableDeclaration? statementsequence=StatementSequence)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression operator=Operator right=Expression ifstatements=StatementSequence elsestatements=StatementSequence?)
	 */
	protected void sequence_IfStatement(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     program=Program
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.MODEL__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.MODEL__PROGRAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_0(), semanticObject.getProgram());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Datatype)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.PARAM__NAME));
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.PARAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.PARAM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParamAccess().getTypeDatatypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Datatype)
	 */
	protected void sequence_ProcParam(EObject context, ProcParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.PROC_PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.PROC_PARAM__NAME));
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.PROC_PARAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.PROC_PARAM__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProcParamAccess().getTypeDatatypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (params+=ProcParam* variableDeclaration=VariableDeclaration? statementsequence=StatementSequence)
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methods+=Method* variableDeclaration=VariableDeclaration? statementsequence=StatementSequence)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_StatementSequence(EObject context, StatementSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variables+=Variable+
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Datatype name=ID)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, JPasPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPasPackage.Literals.VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getTypeDatatypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression operator=Operator right=Expression whilestatements=StatementSequence?)
	 */
	protected void sequence_WhileStatement(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
