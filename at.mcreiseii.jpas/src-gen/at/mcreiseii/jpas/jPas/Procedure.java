/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Procedure#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends Method
{
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

} // Procedure
