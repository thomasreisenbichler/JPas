/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.Model#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference.
   * @see #setProgram(Program)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getModel_Program()
   * @model containment="true"
   * @generated
   */
  Program getProgram();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.Model#getProgram <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' containment reference.
   * @see #getProgram()
   * @generated
   */
  void setProgram(Program value);

} // Model
