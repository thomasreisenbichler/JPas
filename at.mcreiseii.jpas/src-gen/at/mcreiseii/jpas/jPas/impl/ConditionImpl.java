/**
 * <copyright>
 * </copyright>
 *
 */
package at.mcreiseii.jpas.jPas.impl;

import at.mcreiseii.jpas.jPas.Condition;
import at.mcreiseii.jpas.jPas.JPasPackage;
import at.mcreiseii.jpas.jPas.Operator;
import at.mcreiseii.jpas.jPas.StatementSequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl#getIfstatements <em>Ifstatements</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl#getElsestatements <em>Elsestatements</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl#getWhilestatements <em>Whilestatements</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.mcreiseii.jpas.jPas.impl.ConditionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends IfStatementImpl implements Condition
{
  /**
   * The cached value of the '{@link #getIfstatements() <em>Ifstatements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfstatements()
   * @generated
   * @ordered
   */
  protected StatementSequence ifstatements;

  /**
   * The cached value of the '{@link #getElsestatements() <em>Elsestatements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsestatements()
   * @generated
   * @ordered
   */
  protected StatementSequence elsestatements;

  /**
   * The cached value of the '{@link #getWhilestatements() <em>Whilestatements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhilestatements()
   * @generated
   * @ordered
   */
  protected StatementSequence whilestatements;

  /**
   * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected static final String LEFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected String left = LEFT_EDEFAULT;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final Operator OPERATOR_EDEFAULT = Operator.EQUAL;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected String right = RIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return JPasPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementSequence getIfstatements()
  {
    return ifstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfstatements(StatementSequence newIfstatements, NotificationChain msgs)
  {
    StatementSequence oldIfstatements = ifstatements;
    ifstatements = newIfstatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__IFSTATEMENTS, oldIfstatements, newIfstatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfstatements(StatementSequence newIfstatements)
  {
    if (newIfstatements != ifstatements)
    {
      NotificationChain msgs = null;
      if (ifstatements != null)
        msgs = ((InternalEObject)ifstatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPasPackage.CONDITION__IFSTATEMENTS, null, msgs);
      if (newIfstatements != null)
        msgs = ((InternalEObject)newIfstatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPasPackage.CONDITION__IFSTATEMENTS, null, msgs);
      msgs = basicSetIfstatements(newIfstatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__IFSTATEMENTS, newIfstatements, newIfstatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementSequence getElsestatements()
  {
    return elsestatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsestatements(StatementSequence newElsestatements, NotificationChain msgs)
  {
    StatementSequence oldElsestatements = elsestatements;
    elsestatements = newElsestatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__ELSESTATEMENTS, oldElsestatements, newElsestatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsestatements(StatementSequence newElsestatements)
  {
    if (newElsestatements != elsestatements)
    {
      NotificationChain msgs = null;
      if (elsestatements != null)
        msgs = ((InternalEObject)elsestatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPasPackage.CONDITION__ELSESTATEMENTS, null, msgs);
      if (newElsestatements != null)
        msgs = ((InternalEObject)newElsestatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPasPackage.CONDITION__ELSESTATEMENTS, null, msgs);
      msgs = basicSetElsestatements(newElsestatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__ELSESTATEMENTS, newElsestatements, newElsestatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementSequence getWhilestatements()
  {
    return whilestatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhilestatements(StatementSequence newWhilestatements, NotificationChain msgs)
  {
    StatementSequence oldWhilestatements = whilestatements;
    whilestatements = newWhilestatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__WHILESTATEMENTS, oldWhilestatements, newWhilestatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhilestatements(StatementSequence newWhilestatements)
  {
    if (newWhilestatements != whilestatements)
    {
      NotificationChain msgs = null;
      if (whilestatements != null)
        msgs = ((InternalEObject)whilestatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPasPackage.CONDITION__WHILESTATEMENTS, null, msgs);
      if (newWhilestatements != null)
        msgs = ((InternalEObject)newWhilestatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPasPackage.CONDITION__WHILESTATEMENTS, null, msgs);
      msgs = basicSetWhilestatements(newWhilestatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__WHILESTATEMENTS, newWhilestatements, newWhilestatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(String newLeft)
  {
    String oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator)
  {
    Operator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(String newRight)
  {
    String oldRight = right;
    right = newRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPasPackage.CONDITION__RIGHT, oldRight, right));
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
      case JPasPackage.CONDITION__IFSTATEMENTS:
        return basicSetIfstatements(null, msgs);
      case JPasPackage.CONDITION__ELSESTATEMENTS:
        return basicSetElsestatements(null, msgs);
      case JPasPackage.CONDITION__WHILESTATEMENTS:
        return basicSetWhilestatements(null, msgs);
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
      case JPasPackage.CONDITION__IFSTATEMENTS:
        return getIfstatements();
      case JPasPackage.CONDITION__ELSESTATEMENTS:
        return getElsestatements();
      case JPasPackage.CONDITION__WHILESTATEMENTS:
        return getWhilestatements();
      case JPasPackage.CONDITION__LEFT:
        return getLeft();
      case JPasPackage.CONDITION__OPERATOR:
        return getOperator();
      case JPasPackage.CONDITION__RIGHT:
        return getRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JPasPackage.CONDITION__IFSTATEMENTS:
        setIfstatements((StatementSequence)newValue);
        return;
      case JPasPackage.CONDITION__ELSESTATEMENTS:
        setElsestatements((StatementSequence)newValue);
        return;
      case JPasPackage.CONDITION__WHILESTATEMENTS:
        setWhilestatements((StatementSequence)newValue);
        return;
      case JPasPackage.CONDITION__LEFT:
        setLeft((String)newValue);
        return;
      case JPasPackage.CONDITION__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case JPasPackage.CONDITION__RIGHT:
        setRight((String)newValue);
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
      case JPasPackage.CONDITION__IFSTATEMENTS:
        setIfstatements((StatementSequence)null);
        return;
      case JPasPackage.CONDITION__ELSESTATEMENTS:
        setElsestatements((StatementSequence)null);
        return;
      case JPasPackage.CONDITION__WHILESTATEMENTS:
        setWhilestatements((StatementSequence)null);
        return;
      case JPasPackage.CONDITION__LEFT:
        setLeft(LEFT_EDEFAULT);
        return;
      case JPasPackage.CONDITION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case JPasPackage.CONDITION__RIGHT:
        setRight(RIGHT_EDEFAULT);
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
      case JPasPackage.CONDITION__IFSTATEMENTS:
        return ifstatements != null;
      case JPasPackage.CONDITION__ELSESTATEMENTS:
        return elsestatements != null;
      case JPasPackage.CONDITION__WHILESTATEMENTS:
        return whilestatements != null;
      case JPasPackage.CONDITION__LEFT:
        return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
      case JPasPackage.CONDITION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case JPasPackage.CONDITION__RIGHT:
        return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
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
    result.append(" (left: ");
    result.append(left);
    result.append(", operator: ");
    result.append(operator);
    result.append(", right: ");
    result.append(right);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
