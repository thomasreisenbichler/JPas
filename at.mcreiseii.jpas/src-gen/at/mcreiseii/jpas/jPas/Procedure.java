/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Procedure#getParams <em>Params</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Procedure#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Procedure#getStatementsequence <em>Statementsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link at.mcreiseii.jpas.jPas.ProcParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcedure_Params()
   * @model containment="true"
   * @generated
   */
  EList<ProcParam> getParams();

  /**
   * Returns the value of the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration</em>' containment reference.
   * @see #setVariableDeclaration(VariableDeclaration)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcedure_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Procedure#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Declaration</em>' containment reference.
   * @see #getVariableDeclaration()
   * @generated
   */
  void setVariableDeclaration(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Statementsequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statementsequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statementsequence</em>' containment reference.
   * @see #setStatementsequence(StatementSequence)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcedure_Statementsequence()
   * @model containment="true"
   * @generated
   */
  StatementSequence getStatementsequence();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Procedure#getStatementsequence <em>Statementsequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statementsequence</em>' containment reference.
   * @see #getStatementsequence()
   * @generated
   */
  void setStatementsequence(StatementSequence value);

} // Procedure
