/**
 * generated by Xtext 2.19.0
 */
package ru.iaie.reflex.reflex.impl;

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

import ru.iaie.reflex.reflex.Const;
import ru.iaie.reflex.reflex.Function;
import ru.iaie.reflex.reflex.Program;
import ru.iaie.reflex.reflex.ReflexPackage;
import ru.iaie.reflex.reflex.Register;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#isTicks <em>Ticks</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#getConsts <em>Consts</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#getRegisters <em>Registers</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ProgramImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
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
   * The default value of the '{@link #isTicks() <em>Ticks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTicks()
   * @generated
   * @ordered
   */
  protected static final boolean TICKS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTicks() <em>Ticks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTicks()
   * @generated
   * @ordered
   */
  protected boolean ticks = TICKS_EDEFAULT;

  /**
   * The cached value of the '{@link #getConsts() <em>Consts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsts()
   * @generated
   * @ordered
   */
  protected EList<Const> consts;

  /**
   * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnums()
   * @generated
   * @ordered
   */
  protected EList<ru.iaie.reflex.reflex.Enum> enums;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * The cached value of the '{@link #getRegisters() <em>Registers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegisters()
   * @generated
   * @ordered
   */
  protected EList<Register> registers;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<ru.iaie.reflex.reflex.Process> processes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return ReflexPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isTicks()
  {
    return ticks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTicks(boolean newTicks)
  {
    boolean oldTicks = ticks;
    ticks = newTicks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.PROGRAM__TICKS, oldTicks, ticks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Const> getConsts()
  {
    if (consts == null)
    {
      consts = new EObjectContainmentEList<Const>(Const.class, this, ReflexPackage.PROGRAM__CONSTS);
    }
    return consts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ru.iaie.reflex.reflex.Enum> getEnums()
  {
    if (enums == null)
    {
      enums = new EObjectContainmentEList<ru.iaie.reflex.reflex.Enum>(ru.iaie.reflex.reflex.Enum.class, this, ReflexPackage.PROGRAM__ENUMS);
    }
    return enums;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, ReflexPackage.PROGRAM__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Register> getRegisters()
  {
    if (registers == null)
    {
      registers = new EObjectContainmentEList<Register>(Register.class, this, ReflexPackage.PROGRAM__REGISTERS);
    }
    return registers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ru.iaie.reflex.reflex.Process> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectContainmentEList<ru.iaie.reflex.reflex.Process>(ru.iaie.reflex.reflex.Process.class, this, ReflexPackage.PROGRAM__PROCESSES);
    }
    return processes;
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
      case ReflexPackage.PROGRAM__CONSTS:
        return ((InternalEList<?>)getConsts()).basicRemove(otherEnd, msgs);
      case ReflexPackage.PROGRAM__ENUMS:
        return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
      case ReflexPackage.PROGRAM__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case ReflexPackage.PROGRAM__REGISTERS:
        return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
      case ReflexPackage.PROGRAM__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
      case ReflexPackage.PROGRAM__NAME:
        return getName();
      case ReflexPackage.PROGRAM__TICKS:
        return isTicks();
      case ReflexPackage.PROGRAM__CONSTS:
        return getConsts();
      case ReflexPackage.PROGRAM__ENUMS:
        return getEnums();
      case ReflexPackage.PROGRAM__FUNCTIONS:
        return getFunctions();
      case ReflexPackage.PROGRAM__REGISTERS:
        return getRegisters();
      case ReflexPackage.PROGRAM__PROCESSES:
        return getProcesses();
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
      case ReflexPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case ReflexPackage.PROGRAM__TICKS:
        setTicks((Boolean)newValue);
        return;
      case ReflexPackage.PROGRAM__CONSTS:
        getConsts().clear();
        getConsts().addAll((Collection<? extends Const>)newValue);
        return;
      case ReflexPackage.PROGRAM__ENUMS:
        getEnums().clear();
        getEnums().addAll((Collection<? extends ru.iaie.reflex.reflex.Enum>)newValue);
        return;
      case ReflexPackage.PROGRAM__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
        return;
      case ReflexPackage.PROGRAM__REGISTERS:
        getRegisters().clear();
        getRegisters().addAll((Collection<? extends Register>)newValue);
        return;
      case ReflexPackage.PROGRAM__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends ru.iaie.reflex.reflex.Process>)newValue);
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
      case ReflexPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ReflexPackage.PROGRAM__TICKS:
        setTicks(TICKS_EDEFAULT);
        return;
      case ReflexPackage.PROGRAM__CONSTS:
        getConsts().clear();
        return;
      case ReflexPackage.PROGRAM__ENUMS:
        getEnums().clear();
        return;
      case ReflexPackage.PROGRAM__FUNCTIONS:
        getFunctions().clear();
        return;
      case ReflexPackage.PROGRAM__REGISTERS:
        getRegisters().clear();
        return;
      case ReflexPackage.PROGRAM__PROCESSES:
        getProcesses().clear();
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
      case ReflexPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ReflexPackage.PROGRAM__TICKS:
        return ticks != TICKS_EDEFAULT;
      case ReflexPackage.PROGRAM__CONSTS:
        return consts != null && !consts.isEmpty();
      case ReflexPackage.PROGRAM__ENUMS:
        return enums != null && !enums.isEmpty();
      case ReflexPackage.PROGRAM__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case ReflexPackage.PROGRAM__REGISTERS:
        return registers != null && !registers.isEmpty();
      case ReflexPackage.PROGRAM__PROCESSES:
        return processes != null && !processes.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", ticks: ");
    result.append(ticks);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
