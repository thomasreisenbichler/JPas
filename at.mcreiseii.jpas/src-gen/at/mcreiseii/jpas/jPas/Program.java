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
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Program#getName <em>Name</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Program#getMethods <em>Methods</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Program#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Program#getStatementsequence <em>Statementsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link at.mcreiseii.jpas.jPas.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProgram_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProgram_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Program#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProgram_Statementsequence()
   * @model containment="true"
   * @generated
   */
  StatementSequence getStatementsequence();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Program#getStatementsequence <em>Statementsequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statementsequence</em>' containment reference.
   * @see #getStatementsequence()
   * @generated
   */
  void setStatementsequence(StatementSequence value);

} // Program
