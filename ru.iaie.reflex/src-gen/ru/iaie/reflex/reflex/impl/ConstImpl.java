/**
 * generated by Xtext 2.19.0
 */
package ru.iaie.reflex.reflex.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.iaie.reflex.reflex.Const;
import ru.iaie.reflex.reflex.ReflexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ConstImpl#getConstId <em>Const Id</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ConstImpl#getConstValue <em>Const Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstImpl extends MinimalEObjectImpl.Container implements Const
{
  /**
   * The default value of the '{@link #getConstId() <em>Const Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstId()
   * @generated
   * @ordered
   */
  protected static final String CONST_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstId() <em>Const Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstId()
   * @generated
   * @ordered
   */
  protected String constId = CONST_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getConstValue() <em>Const Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstValue()
   * @generated
   * @ordered
   */
  protected static final String CONST_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstValue() <em>Const Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstValue()
   * @generated
   * @ordered
   */
  protected String constValue = CONST_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstImpl()
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
    return ReflexPackage.Literals.CONST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConstId()
  {
    return constId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstId(String newConstId)
  {
    String oldConstId = constId;
    constId = newConstId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.CONST__CONST_ID, oldConstId, constId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConstValue()
  {
    return constValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstValue(String newConstValue)
  {
    String oldConstValue = constValue;
    constValue = newConstValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.CONST__CONST_VALUE, oldConstValue, constValue));
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
      case ReflexPackage.CONST__CONST_ID:
        return getConstId();
      case ReflexPackage.CONST__CONST_VALUE:
        return getConstValue();
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
      case ReflexPackage.CONST__CONST_ID:
        setConstId((String)newValue);
        return;
      case ReflexPackage.CONST__CONST_VALUE:
        setConstValue((String)newValue);
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
      case ReflexPackage.CONST__CONST_ID:
        setConstId(CONST_ID_EDEFAULT);
        return;
      case ReflexPackage.CONST__CONST_VALUE:
        setConstValue(CONST_VALUE_EDEFAULT);
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
      case ReflexPackage.CONST__CONST_ID:
        return CONST_ID_EDEFAULT == null ? constId != null : !CONST_ID_EDEFAULT.equals(constId);
      case ReflexPackage.CONST__CONST_VALUE:
        return CONST_VALUE_EDEFAULT == null ? constValue != null : !CONST_VALUE_EDEFAULT.equals(constValue);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (constId: ");
    result.append(constId);
    result.append(", constValue: ");
    result.append(constValue);
    result.append(')');
    return result.toString();
  }

} //ConstImpl
