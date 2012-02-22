/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas.impl;

import at.mcreiseii.jpas.jPas.Datatype;
import at.mcreiseii.jpas.jPas.Function;
import at.mcreiseii.jpas.jPas.JPasPackage;
import at.mcreiseii.jpas.jPas.Param;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.FunctionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.FunctionImpl#getReturntype <em>Returntype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends MethodImpl implements Function
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Param> params;

  /**
   * The default value of the '{@link #getReturntype() <em>Returntype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturntype()
   * @generated
   * @ordered
   */
  protected static final Datatype RETURNTYPE_EDEFAULT = Datatype.STRING;

  /**
   * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturntype()
   * @generated
   * @ordered
   */
  protected Datatype returntype = RETURNTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JPasPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Param>(Param.class, this, JPasPackage.FUNCTION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype getReturntype()
  {
    return returntype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturntype(Datatype newReturntype)
  {
    Datatype oldReturntype = returntype;
    returntype = newReturntype == null ? RETURNTYPE_EDEFAULT : newReturntype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.FUNCTION__RETURNTYPE, oldReturntype, returntype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JPasPackage.FUNCTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JPasPackage.FUNCTION__PARAMS:
        return getParams();
      case JPasPackage.FUNCTION__RETURNTYPE:
        return getReturntype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JPasPackage.FUNCTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Param>)newValue);
        return;
      case JPasPackage.FUNCTION__RETURNTYPE:
        setReturntype((Datatype)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JPasPackage.FUNCTION__PARAMS:
        getParams().clear();
        return;
      case JPasPackage.FUNCTION__RETURNTYPE:
        setReturntype(RETURNTYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JPasPackage.FUNCTION__PARAMS:
        return params != null && !params.isEmpty();
      case JPasPackage.FUNCTION__RETURNTYPE:
        return returntype != RETURNTYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (returntype: ");
    result.append(returntype);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
