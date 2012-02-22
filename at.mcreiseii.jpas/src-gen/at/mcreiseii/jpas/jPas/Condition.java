/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Condition#getIfstatements <em>Ifstatements</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Condition#getElsestatements <em>Elsestatements</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Condition#getWhilestatements <em>Whilestatements</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Condition#getLeft <em>Left</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Condition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends IfStatement, WhileStatement
{
  /**
   * Returns the value of the '<em><b>Ifstatements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifstatements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifstatements</em>' containment reference.
   * @see #setIfstatements(StatementSequence)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition_Ifstatements()
   * @model containment="true"
   * @generated
   */
  StatementSequence getIfstatements();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Condition#getIfstatements <em>Ifstatements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifstatements</em>' containment reference.
   * @see #getIfstatements()
   * @generated
   */
  void setIfstatements(StatementSequence value);

  /**
   * Returns the value of the '<em><b>Elsestatements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsestatements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsestatements</em>' containment reference.
   * @see #setElsestatements(StatementSequence)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition_Elsestatements()
   * @model containment="true"
   * @generated
   */
  StatementSequence getElsestatements();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Condition#getElsestatements <em>Elsestatements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsestatements</em>' containment reference.
   * @see #getElsestatements()
   * @generated
   */
  void setElsestatements(StatementSequence value);

  /**
   * Returns the value of the '<em><b>Whilestatements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whilestatements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whilestatements</em>' containment reference.
   * @see #setWhilestatements(StatementSequence)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition_Whilestatements()
   * @model containment="true"
   * @generated
   */
  StatementSequence getWhilestatements();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Condition#getWhilestatements <em>Whilestatements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whilestatements</em>' containment reference.
   * @see #getWhilestatements()
   * @generated
   */
  void setWhilestatements(StatementSequence value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(String)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition_Left()
   * @model
   * @generated
   */
  String getLeft();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Condition#getLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #getLeft()
   * @generated
   */
  void setLeft(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link at.mcreiseii.jpas.jPas.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see at.mcreiseii.jpas.jPas.Operator
   * @see #setOperator(Operator)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Condition#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see at.mcreiseii.jpas.jPas.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(String)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getCondition_Right()
   * @model
   * @generated
   */
  String getRight();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Condition#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(String value);

} // Condition
