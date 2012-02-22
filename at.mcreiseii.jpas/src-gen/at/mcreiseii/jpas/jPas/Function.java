/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getParams <em>Params</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.Function#getReturntype <em>Returntype</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Method
{
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

} // Function
