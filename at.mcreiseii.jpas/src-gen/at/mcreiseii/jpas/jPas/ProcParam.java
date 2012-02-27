/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.ProcParam#getOut <em>Out</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.ProcParam#getName <em>Name</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.ProcParam#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcParam()
 * @model
 * @generated
 */
public interface ProcParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' attribute.
   * @see #setOut(String)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcParam_Out()
   * @model
   * @generated
   */
  String getOut();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.ProcParam#getOut <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' attribute.
   * @see #getOut()
   * @generated
   */
  void setOut(String value);

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
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcParam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.ProcParam#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link at.mcreiseii.jpas.jPas.Datatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see at.mcreiseii.jpas.jPas.Datatype
   * @see #setType(Datatype)
   * @see at.mcreiseii.jpas.jPas.JPasPackage#getProcParam_Type()
   * @model
   * @generated
   */
  Datatype getType();

  /**
   * Sets the value of the '{@link at.mcreiseii.jpas.jPas.ProcParam#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see at.mcreiseii.jpas.jPas.Datatype
   * @see #getType()
   * @generated
   */
  void setType(Datatype value);

} // ProcParam
