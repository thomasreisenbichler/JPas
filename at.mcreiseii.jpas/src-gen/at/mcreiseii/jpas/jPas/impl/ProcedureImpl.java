/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas.impl;

import at.mcreiseii.jpas.jPas.JPasPackage;
import at.mcreiseii.jpas.jPas.ProcParam;
import at.mcreiseii.jpas.jPas.Procedure;
import at.mcreiseii.jpas.jPas.StatementSequence;
import at.mcreiseii.jpas.jPas.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ProcedureImpl#getParams <em>Params</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ProcedureImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ProcedureImpl#getStatementsequence <em>Statementsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends MinimalEObjectImpl.Container implements Procedure
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ProcParam> params;

  /**
   * The cached value of the '{@link #getVariableDeclaration() <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclaration()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variableDeclaration;

  /**
   * The cached value of the '{@link #getStatementsequence() <em>Statementsequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementsequence()
   * @generated
   * @ordered
   */
  protected StatementSequence statementsequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureImpl()
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
    return JPasPackage.Literals.PROCEDURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.PROCEDURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcParam> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ProcParam>(ProcParam.class, this, JPasPackage.PROCEDURE__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getVariableDeclaration()
  {
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDeclaration(VariableDeclaration newVariableDeclaration, NotificationChain msgs)
  {
    VariableDeclaration oldVariableDeclaration = variableDeclaration;
    variableDeclaration = newVariableDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPasPackage.PROCEDURE__VARIABLE_DECLARATION, oldVariableDeclaration, newVariableDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDeclaration(VariableDeclaration newVariableDeclaration)
  {
    if (newVariableDeclaration != variableDeclaration)
    {
      NotificationChain msgs = null;
      if (variableDeclaration != null)
        msgs = ((InternalEObject)variableDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPasPackage.PROCEDURE__VARIABLE_DECLARATION, null, msgs);
      if (newVariableDeclaration != null)
        msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPasPackage.PROCEDURE__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.PROCEDURE__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementSequence getStatementsequence()
  {
    return statementsequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementsequence(StatementSequence newStatementsequence, NotificationChain msgs)
  {
    StatementSequence oldStatementsequence = statementsequence;
    statementsequence = newStatementsequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPasPackage.PROCEDURE__STATEMENTSEQUENCE, oldStatementsequence, newStatementsequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementsequence(StatementSequence newStatementsequence)
  {
    if (newStatementsequence != statementsequence)
    {
      NotificationChain msgs = null;
      if (statementsequence != null)
        msgs = ((InternalEObject)statementsequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPasPackage.PROCEDURE__STATEMENTSEQUENCE, null, msgs);
      if (newStatementsequence != null)
        msgs = ((InternalEObject)newStatementsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPasPackage.PROCEDURE__STATEMENTSEQUENCE, null, msgs);
      msgs = basicSetStatementsequence(newStatementsequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.PROCEDURE__STATEMENTSEQUENCE, newStatementsequence, newStatementsequence));
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
      case JPasPackage.PROCEDURE__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case JPasPackage.PROCEDURE__VARIABLE_DECLARATION:
        return basicSetVariableDeclaration(null, msgs);
      case JPasPackage.PROCEDURE__STATEMENTSEQUENCE:
        return basicSetStatementsequence(null, msgs);
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
      case JPasPackage.PROCEDURE__NAME:
        return getName();
      case JPasPackage.PROCEDURE__PARAMS:
        return getParams();
      case JPasPackage.PROCEDURE__VARIABLE_DECLARATION:
        return getVariableDeclaration();
      case JPasPackage.PROCEDURE__STATEMENTSEQUENCE:
        return getStatementsequence();
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
      case JPasPackage.PROCEDURE__NAME:
        setName((String)newValue);
        return;
      case JPasPackage.PROCEDURE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ProcParam>)newValue);
        return;
      case JPasPackage.PROCEDURE__VARIABLE_DECLARATION:
        setVariableDeclaration((VariableDeclaration)newValue);
        return;
      case JPasPackage.PROCEDURE__STATEMENTSEQUENCE:
        setStatementsequence((StatementSequence)newValue);
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
      case JPasPackage.PROCEDURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JPasPackage.PROCEDURE__PARAMS:
        getParams().clear();
        return;
      case JPasPackage.PROCEDURE__VARIABLE_DECLARATION:
        setVariableDeclaration((VariableDeclaration)null);
        return;
      case JPasPackage.PROCEDURE__STATEMENTSEQUENCE:
        setStatementsequence((StatementSequence)null);
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
      case JPasPackage.PROCEDURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JPasPackage.PROCEDURE__PARAMS:
        return params != null && !params.isEmpty();
      case JPasPackage.PROCEDURE__VARIABLE_DECLARATION:
        return variableDeclaration != null;
      case JPasPackage.PROCEDURE__STATEMENTSEQUENCE:
        return statementsequence != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProcedureImpl
