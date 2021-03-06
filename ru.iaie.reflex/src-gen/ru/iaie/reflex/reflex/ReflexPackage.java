/**
 * generated by Xtext 2.19.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.iaie.reflex.reflex.ReflexFactory
 * @model kind="package"
 * @generated
 */
public interface ReflexPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "reflex";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.iaie.ru/reflex/Reflex";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reflex";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReflexPackage eINSTANCE = ru.iaie.reflex.reflex.impl.ReflexPackageImpl.init();

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.ProgramImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Ticks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__TICKS = 1;

  /**
   * The feature id for the '<em><b>Consts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CONSTS = 2;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ENUMS = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FUNCTIONS = 4;

  /**
   * The feature id for the '<em><b>Registers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__REGISTERS = 5;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROCESSES = 6;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.ProcessImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__STATES = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.StateImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.FunctionImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 1;

  /**
   * The feature id for the '<em><b>Arg Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARG_TYPES = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.RegisterImpl <em>Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.RegisterImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getRegister()
   * @generated
   */
  int REGISTER = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__NAME = 1;

  /**
   * The feature id for the '<em><b>Addr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__ADDR1 = 2;

  /**
   * The feature id for the '<em><b>Addr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__ADDR2 = 3;

  /**
   * The feature id for the '<em><b>Reg Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__REG_SIZE = 4;

  /**
   * The number of structural features of the '<em>Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.ConstImpl <em>Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.ConstImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getConst()
   * @generated
   */
  int CONST = 5;

  /**
   * The feature id for the '<em><b>Const Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__CONST_ID = 0;

  /**
   * The feature id for the '<em><b>Const Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__CONST_VALUE = 1;

  /**
   * The number of structural features of the '<em>Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.EnumImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 6;

  /**
   * The feature id for the '<em><b>Enum Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ENUM_MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.EnumMemberImpl <em>Enum Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.EnumMemberImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getEnumMember()
   * @generated
   */
  int ENUM_MEMBER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.impl.CTypeImpl <em>CType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.impl.CTypeImpl
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getCType()
   * @generated
   */
  int CTYPE = 8;

  /**
   * The feature id for the '<em><b>Sign Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTYPE__SIGN_SPEC = 0;

  /**
   * The number of structural features of the '<em>CType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.RegisterType <em>Register Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.RegisterType
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getRegisterType()
   * @generated
   */
  int REGISTER_TYPE = 9;

  /**
   * The meta object id for the '{@link ru.iaie.reflex.reflex.CTypeSignSpec <em>CType Sign Spec</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ru.iaie.reflex.reflex.CTypeSignSpec
   * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getCTypeSignSpec()
   * @generated
   */
  int CTYPE_SIGN_SPEC = 10;


  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see ru.iaie.reflex.reflex.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.iaie.reflex.reflex.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Program#isTicks <em>Ticks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ticks</em>'.
   * @see ru.iaie.reflex.reflex.Program#isTicks()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Ticks();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Program#getConsts <em>Consts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Consts</em>'.
   * @see ru.iaie.reflex.reflex.Program#getConsts()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Consts();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Program#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see ru.iaie.reflex.reflex.Program#getEnums()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Enums();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Program#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see ru.iaie.reflex.reflex.Program#getFunctions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Program#getRegisters <em>Registers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Registers</em>'.
   * @see ru.iaie.reflex.reflex.Program#getRegisters()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Registers();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Program#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see ru.iaie.reflex.reflex.Program#getProcesses()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Processes();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see ru.iaie.reflex.reflex.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.iaie.reflex.reflex.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Process#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see ru.iaie.reflex.reflex.Process#getStates()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_States();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see ru.iaie.reflex.reflex.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.iaie.reflex.reflex.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see ru.iaie.reflex.reflex.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link ru.iaie.reflex.reflex.Function#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see ru.iaie.reflex.reflex.Function#getReturnType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.iaie.reflex.reflex.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Function#getArgTypes <em>Arg Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg Types</em>'.
   * @see ru.iaie.reflex.reflex.Function#getArgTypes()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ArgTypes();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.Register <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Register</em>'.
   * @see ru.iaie.reflex.reflex.Register
   * @generated
   */
  EClass getRegister();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Register#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see ru.iaie.reflex.reflex.Register#getType()
   * @see #getRegister()
   * @generated
   */
  EAttribute getRegister_Type();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Register#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.iaie.reflex.reflex.Register#getName()
   * @see #getRegister()
   * @generated
   */
  EAttribute getRegister_Name();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Register#getAddr1 <em>Addr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr1</em>'.
   * @see ru.iaie.reflex.reflex.Register#getAddr1()
   * @see #getRegister()
   * @generated
   */
  EAttribute getRegister_Addr1();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Register#getAddr2 <em>Addr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr2</em>'.
   * @see ru.iaie.reflex.reflex.Register#getAddr2()
   * @see #getRegister()
   * @generated
   */
  EAttribute getRegister_Addr2();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Register#getRegSize <em>Reg Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reg Size</em>'.
   * @see ru.iaie.reflex.reflex.Register#getRegSize()
   * @see #getRegister()
   * @generated
   */
  EAttribute getRegister_RegSize();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const</em>'.
   * @see ru.iaie.reflex.reflex.Const
   * @generated
   */
  EClass getConst();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Const#getConstId <em>Const Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const Id</em>'.
   * @see ru.iaie.reflex.reflex.Const#getConstId()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_ConstId();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.Const#getConstValue <em>Const Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const Value</em>'.
   * @see ru.iaie.reflex.reflex.Const#getConstValue()
   * @see #getConst()
   * @generated
   */
  EAttribute getConst_ConstValue();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see ru.iaie.reflex.reflex.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the containment reference list '{@link ru.iaie.reflex.reflex.Enum#getEnumMembers <em>Enum Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Members</em>'.
   * @see ru.iaie.reflex.reflex.Enum#getEnumMembers()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_EnumMembers();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member</em>'.
   * @see ru.iaie.reflex.reflex.EnumMember
   * @generated
   */
  EClass getEnumMember();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.EnumMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ru.iaie.reflex.reflex.EnumMember#getName()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Name();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.EnumMember#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ru.iaie.reflex.reflex.EnumMember#getValue()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Value();

  /**
   * Returns the meta object for class '{@link ru.iaie.reflex.reflex.CType <em>CType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CType</em>'.
   * @see ru.iaie.reflex.reflex.CType
   * @generated
   */
  EClass getCType();

  /**
   * Returns the meta object for the attribute '{@link ru.iaie.reflex.reflex.CType#isSignSpec <em>Sign Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign Spec</em>'.
   * @see ru.iaie.reflex.reflex.CType#isSignSpec()
   * @see #getCType()
   * @generated
   */
  EAttribute getCType_SignSpec();

  /**
   * Returns the meta object for enum '{@link ru.iaie.reflex.reflex.RegisterType <em>Register Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Register Type</em>'.
   * @see ru.iaie.reflex.reflex.RegisterType
   * @generated
   */
  EEnum getRegisterType();

  /**
   * Returns the meta object for enum '{@link ru.iaie.reflex.reflex.CTypeSignSpec <em>CType Sign Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>CType Sign Spec</em>'.
   * @see ru.iaie.reflex.reflex.CTypeSignSpec
   * @generated
   */
  EEnum getCTypeSignSpec();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReflexFactory getReflexFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.ProgramImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Ticks</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__TICKS = eINSTANCE.getProgram_Ticks();

    /**
     * The meta object literal for the '<em><b>Consts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CONSTS = eINSTANCE.getProgram_Consts();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ENUMS = eINSTANCE.getProgram_Enums();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

    /**
     * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__REGISTERS = eINSTANCE.getProgram_Registers();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROCESSES = eINSTANCE.getProgram_Processes();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.ProcessImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__STATES = eINSTANCE.getProcess_States();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.StateImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.FunctionImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Arg Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ARG_TYPES = eINSTANCE.getFunction_ArgTypes();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.RegisterImpl <em>Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.RegisterImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getRegister()
     * @generated
     */
    EClass REGISTER = eINSTANCE.getRegister();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__TYPE = eINSTANCE.getRegister_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__NAME = eINSTANCE.getRegister_Name();

    /**
     * The meta object literal for the '<em><b>Addr1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__ADDR1 = eINSTANCE.getRegister_Addr1();

    /**
     * The meta object literal for the '<em><b>Addr2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__ADDR2 = eINSTANCE.getRegister_Addr2();

    /**
     * The meta object literal for the '<em><b>Reg Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__REG_SIZE = eINSTANCE.getRegister_RegSize();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.ConstImpl <em>Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.ConstImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getConst()
     * @generated
     */
    EClass CONST = eINSTANCE.getConst();

    /**
     * The meta object literal for the '<em><b>Const Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__CONST_ID = eINSTANCE.getConst_ConstId();

    /**
     * The meta object literal for the '<em><b>Const Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST__CONST_VALUE = eINSTANCE.getConst_ConstValue();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.EnumImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Enum Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__ENUM_MEMBERS = eINSTANCE.getEnum_EnumMembers();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.EnumMemberImpl <em>Enum Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.EnumMemberImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getEnumMember()
     * @generated
     */
    EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__NAME = eINSTANCE.getEnumMember_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__VALUE = eINSTANCE.getEnumMember_Value();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.impl.CTypeImpl <em>CType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.impl.CTypeImpl
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getCType()
     * @generated
     */
    EClass CTYPE = eINSTANCE.getCType();

    /**
     * The meta object literal for the '<em><b>Sign Spec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CTYPE__SIGN_SPEC = eINSTANCE.getCType_SignSpec();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.RegisterType <em>Register Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.RegisterType
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getRegisterType()
     * @generated
     */
    EEnum REGISTER_TYPE = eINSTANCE.getRegisterType();

    /**
     * The meta object literal for the '{@link ru.iaie.reflex.reflex.CTypeSignSpec <em>CType Sign Spec</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ru.iaie.reflex.reflex.CTypeSignSpec
     * @see ru.iaie.reflex.reflex.impl.ReflexPackageImpl#getCTypeSignSpec()
     * @generated
     */
    EEnum CTYPE_SIGN_SPEC = eINSTANCE.getCTypeSignSpec();

  }

} //ReflexPackage
