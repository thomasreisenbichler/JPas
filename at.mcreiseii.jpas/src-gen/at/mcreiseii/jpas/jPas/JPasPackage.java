/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.mcreiseii.jpas.jPas.JPasFactory
 * @model kind="package"
 * @generated
 */
public interface JPasPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jPas";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mcreiseii.at/jpas/JPas";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jPas";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JPasPackage eINSTANCE = at.mcreiseii.jpas.jPas.impl.JPasPackageImpl.init();

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.ModelImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.ProgramImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__METHODS = 1;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VARIABLE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Statementsequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATEMENTSEQUENCE = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.MethodImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 2;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PROCEDURE = 1;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.FunctionImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Returntype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURNTYPE = 2;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VARIABLE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Statementsequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__STATEMENTSEQUENCE = 4;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.ProcedureImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__VARIABLE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Statementsequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__STATEMENTSEQUENCE = 3;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.ProcParamImpl <em>Proc Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.ProcParamImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getProcParam()
   * @generated
   */
  int PROC_PARAM = 5;

  /**
   * The feature id for the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_PARAM__OUT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_PARAM__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_PARAM__TYPE = 2;

  /**
   * The number of structural features of the '<em>Proc Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_PARAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.ParamImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getParam()
   * @generated
   */
  int PARAM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.VariableDeclarationImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.VariableImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.StatementSequenceImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getStatementSequence()
   * @generated
   */
  int STATEMENT_SEQUENCE = 9;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Statement Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.StatementImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 10;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.IfStatementImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 11;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.WhileStatementImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 12;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.AssignStatementImpl <em>Assign Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.AssignStatementImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getAssignStatement()
   * @generated
   */
  int ASSIGN_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assign Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.impl.ConditionImpl
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 14;

  /**
   * The feature id for the '<em><b>Ifstatements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__IFSTATEMENTS = IF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elsestatements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSESTATEMENTS = IF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Whilestatements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__WHILESTATEMENTS = IF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LEFT = IF_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = IF_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__RIGHT = IF_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = IF_STATEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.Operator
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 15;

  /**
   * The meta object id for the '{@link at.mcreiseii.jpas.jPas.Datatype <em>Datatype</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.mcreiseii.jpas.jPas.Datatype
   * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 16;


  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.mcreiseii.jpas.jPas.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Model#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see at.mcreiseii.jpas.jPas.Model#getProgram()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Program();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see at.mcreiseii.jpas.jPas.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.mcreiseii.jpas.jPas.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.mcreiseii.jpas.jPas.Program#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.mcreiseii.jpas.jPas.Program#getMethods()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Methods();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Program#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see at.mcreiseii.jpas.jPas.Program#getVariableDeclaration()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Program#getStatementsequence <em>Statementsequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statementsequence</em>'.
   * @see at.mcreiseii.jpas.jPas.Program#getStatementsequence()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Statementsequence();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see at.mcreiseii.jpas.jPas.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Method#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see at.mcreiseii.jpas.jPas.Method#getFunction()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Function();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Method#getProcedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procedure</em>'.
   * @see at.mcreiseii.jpas.jPas.Method#getProcedure()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Procedure();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see at.mcreiseii.jpas.jPas.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.mcreiseii.jpas.jPas.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.mcreiseii.jpas.jPas.Function#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see at.mcreiseii.jpas.jPas.Function#getParams()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Params();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Function#getReturntype <em>Returntype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Returntype</em>'.
   * @see at.mcreiseii.jpas.jPas.Function#getReturntype()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Returntype();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Function#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see at.mcreiseii.jpas.jPas.Function#getVariableDeclaration()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Function#getStatementsequence <em>Statementsequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statementsequence</em>'.
   * @see at.mcreiseii.jpas.jPas.Function#getStatementsequence()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Statementsequence();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see at.mcreiseii.jpas.jPas.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.mcreiseii.jpas.jPas.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.mcreiseii.jpas.jPas.Procedure#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see at.mcreiseii.jpas.jPas.Procedure#getParams()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Params();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Procedure#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see at.mcreiseii.jpas.jPas.Procedure#getVariableDeclaration()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Procedure#getStatementsequence <em>Statementsequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statementsequence</em>'.
   * @see at.mcreiseii.jpas.jPas.Procedure#getStatementsequence()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Statementsequence();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.ProcParam <em>Proc Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proc Param</em>'.
   * @see at.mcreiseii.jpas.jPas.ProcParam
   * @generated
   */
  EClass getProcParam();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.ProcParam#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out</em>'.
   * @see at.mcreiseii.jpas.jPas.ProcParam#getOut()
   * @see #getProcParam()
   * @generated
   */
  EAttribute getProcParam_Out();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.ProcParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.mcreiseii.jpas.jPas.ProcParam#getName()
   * @see #getProcParam()
   * @generated
   */
  EAttribute getProcParam_Name();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.ProcParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.mcreiseii.jpas.jPas.ProcParam#getType()
   * @see #getProcParam()
   * @generated
   */
  EAttribute getProcParam_Type();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see at.mcreiseii.jpas.jPas.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.mcreiseii.jpas.jPas.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.mcreiseii.jpas.jPas.Param#getType()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Type();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see at.mcreiseii.jpas.jPas.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link at.mcreiseii.jpas.jPas.VariableDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.mcreiseii.jpas.jPas.VariableDeclaration#getVariables()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see at.mcreiseii.jpas.jPas.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.mcreiseii.jpas.jPas.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.mcreiseii.jpas.jPas.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Type();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Sequence</em>'.
   * @see at.mcreiseii.jpas.jPas.StatementSequence
   * @generated
   */
  EClass getStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.mcreiseii.jpas.jPas.StatementSequence#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see at.mcreiseii.jpas.jPas.StatementSequence#getStatements()
   * @see #getStatementSequence()
   * @generated
   */
  EReference getStatementSequence_Statements();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see at.mcreiseii.jpas.jPas.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see at.mcreiseii.jpas.jPas.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see at.mcreiseii.jpas.jPas.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.AssignStatement <em>Assign Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Statement</em>'.
   * @see at.mcreiseii.jpas.jPas.AssignStatement
   * @generated
   */
  EClass getAssignStatement();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.AssignStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see at.mcreiseii.jpas.jPas.AssignStatement#getVariable()
   * @see #getAssignStatement()
   * @generated
   */
  EAttribute getAssignStatement_Variable();

  /**
   * Returns the meta object for class '{@link at.mcreiseii.jpas.jPas.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Condition#getIfstatements <em>Ifstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifstatements</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition#getIfstatements()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Ifstatements();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Condition#getElsestatements <em>Elsestatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elsestatements</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition#getElsestatements()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Elsestatements();

  /**
   * Returns the meta object for the containment reference '{@link at.mcreiseii.jpas.jPas.Condition#getWhilestatements <em>Whilestatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Whilestatements</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition#getWhilestatements()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Whilestatements();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Condition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition#getLeft()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Left();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Operator();

  /**
   * Returns the meta object for the attribute '{@link at.mcreiseii.jpas.jPas.Condition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see at.mcreiseii.jpas.jPas.Condition#getRight()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Right();

  /**
   * Returns the meta object for enum '{@link at.mcreiseii.jpas.jPas.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see at.mcreiseii.jpas.jPas.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the meta object for enum '{@link at.mcreiseii.jpas.jPas.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Datatype</em>'.
   * @see at.mcreiseii.jpas.jPas.Datatype
   * @generated
   */
  EEnum getDatatype();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JPasFactory getJPasFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.ModelImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAM = eINSTANCE.getModel_Program();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.ProgramImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__METHODS = eINSTANCE.getProgram_Methods();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VARIABLE_DECLARATION = eINSTANCE.getProgram_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Statementsequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATEMENTSEQUENCE = eINSTANCE.getProgram_Statementsequence();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.MethodImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__FUNCTION = eINSTANCE.getMethod_Function();

    /**
     * The meta object literal for the '<em><b>Procedure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PROCEDURE = eINSTANCE.getMethod_Procedure();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.FunctionImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

    /**
     * The meta object literal for the '<em><b>Returntype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__RETURNTYPE = eINSTANCE.getFunction_Returntype();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__VARIABLE_DECLARATION = eINSTANCE.getFunction_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Statementsequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__STATEMENTSEQUENCE = eINSTANCE.getFunction_Statementsequence();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.ProcedureImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__PARAMS = eINSTANCE.getProcedure_Params();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__VARIABLE_DECLARATION = eINSTANCE.getProcedure_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Statementsequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__STATEMENTSEQUENCE = eINSTANCE.getProcedure_Statementsequence();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.ProcParamImpl <em>Proc Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.ProcParamImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getProcParam()
     * @generated
     */
    EClass PROC_PARAM = eINSTANCE.getProcParam();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROC_PARAM__OUT = eINSTANCE.getProcParam_Out();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROC_PARAM__NAME = eINSTANCE.getProcParam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROC_PARAM__TYPE = eINSTANCE.getProcParam_Type();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.ParamImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__TYPE = eINSTANCE.getParam_Type();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.VariableDeclarationImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VARIABLES = eINSTANCE.getVariableDeclaration_Variables();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.VariableImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.StatementSequenceImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getStatementSequence()
     * @generated
     */
    EClass STATEMENT_SEQUENCE = eINSTANCE.getStatementSequence();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_SEQUENCE__STATEMENTS = eINSTANCE.getStatementSequence_Statements();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.StatementImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.IfStatementImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.WhileStatementImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.AssignStatementImpl <em>Assign Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.AssignStatementImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getAssignStatement()
     * @generated
     */
    EClass ASSIGN_STATEMENT = eINSTANCE.getAssignStatement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN_STATEMENT__VARIABLE = eINSTANCE.getAssignStatement_Variable();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.impl.ConditionImpl
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Ifstatements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__IFSTATEMENTS = eINSTANCE.getCondition_Ifstatements();

    /**
     * The meta object literal for the '<em><b>Elsestatements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ELSESTATEMENTS = eINSTANCE.getCondition_Elsestatements();

    /**
     * The meta object literal for the '<em><b>Whilestatements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__WHILESTATEMENTS = eINSTANCE.getCondition_Whilestatements();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__LEFT = eINSTANCE.getCondition_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__RIGHT = eINSTANCE.getCondition_Right();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.Operator
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link at.mcreiseii.jpas.jPas.Datatype <em>Datatype</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.mcreiseii.jpas.jPas.Datatype
     * @see at.mcreiseii.jpas.jPas.impl.JPasPackageImpl#getDatatype()
     * @generated
     */
    EEnum DATATYPE = eINSTANCE.getDatatype();

  }

} //JPasPackage
