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
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getName <em>Name</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getParams <em>Params</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getStatementsequence <em>Statementsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link at.mcreiseii.jpas.jPas.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>Returntype</b></em>' attribute.
   * The literals are from the enumeration {@link at.mcreiseii.jpas.jPas.Datatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returntype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returntype</em>' attribute.
   * @see at.mcreiseii.jpas.jPas.Datatype
   * @see #setReturntype(Datatype)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction_Returntype()
   * @model
   * @generated
   */
  Datatype getReturntype();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Function#getReturntype <em>Returntype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returntype</em>' attribute.
   * @see at.mcreiseii.jpas.jPas.Datatype
   * @see #getReturntype()
   * @generated
   */
  void setReturntype(Datatype value);

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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Function#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction_Statementsequence()
   * @model containment="true"
   * @generated
   */
  StatementSequence getStatementsequence();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Function#getStatementsequence <em>Statementsequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statementsequence</em>' containment reference.
   * @see #getStatementsequence()
   * @generated
   */
  void setStatementsequence(StatementSequence value);

} // Function
