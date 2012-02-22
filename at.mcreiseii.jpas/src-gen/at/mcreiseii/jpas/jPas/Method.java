/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Method#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Method#getStatementsequence <em>Statementsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getMethod_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Method#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getMethod_Statementsequence()
   * @model containment="true"
   * @generated
   */
  StatementSequence getStatementsequence();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Method#getStatementsequence <em>Statementsequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statementsequence</em>' containment reference.
   * @see #getStatementsequence()
   * @generated
   */
  void setStatementsequence(StatementSequence value);

} // Method
