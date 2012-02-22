/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.AssignStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getAssignStatement()
 * @model
 * @generated
 */
public interface AssignStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getAssignStatement_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.AssignStatement#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

} // AssignStatement
