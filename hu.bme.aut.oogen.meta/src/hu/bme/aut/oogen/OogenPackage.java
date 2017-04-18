/**
 */
package hu.bme.aut.oogen;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.aut.oogen.OogenFactory
 * @model kind="package"
 * @generated
 */
public interface OogenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oogen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://oogen.aut.bme.hu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oogen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OogenPackage eINSTANCE = hu.bme.aut.oogen.OogenPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOPackageImpl <em>OO Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOPackageImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOPackage()
	 * @generated
	 */
	int OO_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PACKAGE__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>OO Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OO Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOClassImpl <em>OO Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOClassImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOClass()
	 * @generated
	 */
	int OO_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__METHODS = 3;

	/**
	 * The feature id for the '<em><b>Keep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__KEEP = 4;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__LANGUAGES = 5;

	/**
	 * The feature id for the '<em><b>Nested Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__NESTED_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Ooclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__OOCLASS = 7;

	/**
	 * The feature id for the '<em><b>Oocompare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS__OOCOMPARE = 8;

	/**
	 * The number of structural features of the '<em>OO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>OO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOVariableImpl <em>OO Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOVariableImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOVariable()
	 * @generated
	 */
	int OO_VARIABLE = 3;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOMemberImpl <em>OO Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOMemberImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOMember()
	 * @generated
	 */
	int OO_MEMBER = 2;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOTypeImpl <em>OO Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOTypeImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOType()
	 * @generated
	 */
	int OO_TYPE = 4;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOMethodImpl <em>OO Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOMethodImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOMethod()
	 * @generated
	 */
	int OO_METHOD = 5;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOModelImpl <em>OO Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOModelImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOModel()
	 * @generated
	 */
	int OO_MODEL = 6;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOStatementImpl <em>OO Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOStatementImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOStatement()
	 * @generated
	 */
	int OO_STATEMENT = 7;

	/**
	 * The number of structural features of the '<em>OO Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>OO Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOExpressionImpl <em>OO Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOExpression()
	 * @generated
	 */
	int OO_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE__NAME = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE__TYPE = OO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initializer Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE__INITIALIZER_EXPRESSION = OO_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE__TRANSIENT = OO_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OO Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>OO Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__NAME = OO_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__TYPE = OO_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Initializer Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__INITIALIZER_EXPRESSION = OO_VARIABLE__INITIALIZER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__TRANSIENT = OO_VARIABLE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__VISIBILITY = OO_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__STATIC = OO_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER__LANGUAGES = OO_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OO Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER_FEATURE_COUNT = OO_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OO Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MEMBER_OPERATION_COUNT = OO_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE__BASE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE__ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE__COLLECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE__CLASS_TYPE = 3;

	/**
	 * The number of structural features of the '<em>OO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>OO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__STATEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__VISIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__NAME = 4;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__STATIC = 5;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD__LANGUAGES = 6;

	/**
	 * The number of structural features of the '<em>OO Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>OO Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_METHOD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Oopackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MODEL__OOPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MODEL__PACKAGES = 1;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MODEL__GLOBAL_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Global Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MODEL__GLOBAL_FUNCTIONS = 3;

	/**
	 * The number of structural features of the '<em>OO Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>OO Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MODEL_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>OO Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_EXPRESSION_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_EXPRESSION_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOReturnImpl <em>OO Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOReturnImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOReturn()
	 * @generated
	 */
	int OO_RETURN = 9;

	/**
	 * The feature id for the '<em><b>Returned Expresssion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_RETURN__RETURNED_EXPRESSSION = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_RETURN_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_RETURN_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOArithmeticExpressionImpl <em>OO Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOArithmeticExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOArithmeticExpression()
	 * @generated
	 */
	int OO_ARITHMETIC_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>OO Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOArrayIndexingImpl <em>OO Array Indexing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOArrayIndexingImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOArrayIndexing()
	 * @generated
	 */
	int OO_ARRAY_INDEXING = 11;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ARRAY_INDEXING__INDEX = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ARRAY_INDEXING__ARRAY = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO Array Indexing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ARRAY_INDEXING_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO Array Indexing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ARRAY_INDEXING_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOAssignmentExpressionImpl <em>OO Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOAssignmentExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOAssignmentExpression()
	 * @generated
	 */
	int OO_ASSIGNMENT_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ASSIGNMENT_EXPRESSION__LEFT_SIDE = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ASSIGNMENT_EXPRESSION__RIGHT_SIDE = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ASSIGNMENT_EXPRESSION_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpressionImpl <em>OO Two Operand Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOTwoOperandArithmeticExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOTwoOperandArithmeticExpression()
	 * @generated
	 */
	int OO_TWO_OPERAND_ARITHMETIC_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO Two Operand Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO Two Operand Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT = OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOAdditionExpressionImpl <em>OO Addition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOAdditionExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOAdditionExpression()
	 * @generated
	 */
	int OO_ADDITION_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ADDITION_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ADDITION_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Addition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ADDITION_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Addition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ADDITION_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOSubtractionExpressionImpl <em>OO Subtraction Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOSubtractionExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOSubtractionExpression()
	 * @generated
	 */
	int OO_SUBTRACTION_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_SUBTRACTION_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_SUBTRACTION_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Subtraction Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_SUBTRACTION_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Subtraction Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_SUBTRACTION_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OODivisionExpressionImpl <em>OO Division Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OODivisionExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOODivisionExpression()
	 * @generated
	 */
	int OO_DIVISION_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DIVISION_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DIVISION_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Division Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DIVISION_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Division Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DIVISION_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOIntegerDivisionExpressionImpl <em>OO Integer Division Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOIntegerDivisionExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOIntegerDivisionExpression()
	 * @generated
	 */
	int OO_INTEGER_DIVISION_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_DIVISION_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_DIVISION_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Integer Division Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_DIVISION_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Integer Division Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_DIVISION_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOMultiplicationExpressionImpl <em>OO Multiplication Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOMultiplicationExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOMultiplicationExpression()
	 * @generated
	 */
	int OO_MULTIPLICATION_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MULTIPLICATION_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MULTIPLICATION_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Multiplication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MULTIPLICATION_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Multiplication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_MULTIPLICATION_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOPowerExpressionImpl <em>OO Power Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOPowerExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOPowerExpression()
	 * @generated
	 */
	int OO_POWER_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_POWER_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_POWER_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Power Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_POWER_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Power Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_POWER_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OORootExpressionImpl <em>OO Root Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OORootExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOORootExpression()
	 * @generated
	 */
	int OO_ROOT_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ROOT_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ROOT_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Root Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ROOT_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Root Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ROOT_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBitwiseOrExpressionImpl <em>OO Bitwise Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBitwiseOrExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitwiseOrExpression()
	 * @generated
	 */
	int OO_BITWISE_OR_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_OR_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_OR_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Bitwise Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_OR_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Bitwise Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_OR_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBitwiseXorExpressionImpl <em>OO Bitwise Xor Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBitwiseXorExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitwiseXorExpression()
	 * @generated
	 */
	int OO_BITWISE_XOR_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_XOR_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_XOR_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Bitwise Xor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_XOR_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Bitwise Xor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_XOR_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBitwiseAndExpressionImpl <em>OO Bitwise And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBitwiseAndExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitwiseAndExpression()
	 * @generated
	 */
	int OO_BITWISE_AND_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_AND_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_AND_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Bitwise And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_AND_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Bitwise And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BITWISE_AND_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOLogicalExpressionImpl <em>OO Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOLogicalExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLogicalExpression()
	 * @generated
	 */
	int OO_LOGICAL_EXPRESSION = 24;

	/**
	 * The number of structural features of the '<em>OO Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LOGICAL_EXPRESSION_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LOGICAL_EXPRESSION_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOLogicalLiteralImpl <em>OO Logical Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOLogicalLiteralImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLogicalLiteral()
	 * @generated
	 */
	int OO_LOGICAL_LITERAL = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LOGICAL_LITERAL__VALUE = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Logical Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LOGICAL_LITERAL_FEATURE_COUNT = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Logical Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LOGICAL_LITERAL_OPERATION_COUNT = OO_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpressionImpl <em>OO Two Operand Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOTwoOperandLogicalExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOTwoOperandLogicalExpression()
	 * @generated
	 */
	int OO_TWO_OPERAND_LOGICAL_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_LOGICAL_EXPRESSION__LEFT_SIDE = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_LOGICAL_EXPRESSION__RIGHT_SIDE = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO Two Operand Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_LOGICAL_EXPRESSION_FEATURE_COUNT = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO Two Operand Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TWO_OPERAND_LOGICAL_EXPRESSION_OPERATION_COUNT = OO_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOAndExpressionImpl <em>OO And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOAndExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOAndExpression()
	 * @generated
	 */
	int OO_AND_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_AND_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_LOGICAL_EXPRESSION__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_AND_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_LOGICAL_EXPRESSION__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>OO And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_AND_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_AND_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOOrExpressionImpl <em>OO Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOOrExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOOrExpression()
	 * @generated
	 */
	int OO_OR_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_OR_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_LOGICAL_EXPRESSION__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_OR_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_LOGICAL_EXPRESSION__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_OR_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_OR_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOXorExpressionImpl <em>OO Xor Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOXorExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOXorExpression()
	 * @generated
	 */
	int OO_XOR_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_XOR_EXPRESSION__LEFT_SIDE = OO_TWO_OPERAND_LOGICAL_EXPRESSION__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_XOR_EXPRESSION__RIGHT_SIDE = OO_TWO_OPERAND_LOGICAL_EXPRESSION__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Xor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_XOR_EXPRESSION_FEATURE_COUNT = OO_TWO_OPERAND_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Xor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_XOR_EXPRESSION_OPERATION_COUNT = OO_TWO_OPERAND_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOOneOperandLogicalExpressionImpl <em>OO One Operand Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOOneOperandLogicalExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOOneOperandLogicalExpression()
	 * @generated
	 */
	int OO_ONE_OPERAND_LOGICAL_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ONE_OPERAND_LOGICAL_EXPRESSION__OPERAND = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO One Operand Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ONE_OPERAND_LOGICAL_EXPRESSION_FEATURE_COUNT = OO_LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO One Operand Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_ONE_OPERAND_LOGICAL_EXPRESSION_OPERATION_COUNT = OO_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OONorExpressionImpl <em>OO Nor Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OONorExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOONorExpression()
	 * @generated
	 */
	int OO_NOR_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NOR_EXPRESSION__OPERAND = OO_ONE_OPERAND_LOGICAL_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>OO Nor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NOR_EXPRESSION_FEATURE_COUNT = OO_ONE_OPERAND_LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Nor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NOR_EXPRESSION_OPERATION_COUNT = OO_ONE_OPERAND_LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OODoubleLiteralImpl <em>OO Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OODoubleLiteralImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOODoubleLiteral()
	 * @generated
	 */
	int OO_DOUBLE_LITERAL = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DOUBLE_LITERAL__VALUE = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DOUBLE_LITERAL_FEATURE_COUNT = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DOUBLE_LITERAL_OPERATION_COUNT = OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOFloatLiteralImpl <em>OO Float Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOFloatLiteralImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOFloatLiteral()
	 * @generated
	 */
	int OO_FLOAT_LITERAL = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FLOAT_LITERAL__VALUE = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FLOAT_LITERAL_FEATURE_COUNT = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FLOAT_LITERAL_OPERATION_COUNT = OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOIntegerLiteralImpl <em>OO Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOIntegerLiteralImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOIntegerLiteral()
	 * @generated
	 */
	int OO_INTEGER_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_LITERAL__VALUE = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_LITERAL_FEATURE_COUNT = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_INTEGER_LITERAL_OPERATION_COUNT = OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOLongLiteralImpl <em>OO Long Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOLongLiteralImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLongLiteral()
	 * @generated
	 */
	int OO_LONG_LITERAL = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LONG_LITERAL__VALUE = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Long Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LONG_LITERAL_FEATURE_COUNT = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Long Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LONG_LITERAL_OPERATION_COUNT = OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOConditionalStatementImpl <em>OO Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOConditionalStatementImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOConditionalStatement()
	 * @generated
	 */
	int OO_CONDITIONAL_STATEMENT = 38;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CONDITIONAL_STATEMENT__CONDITION = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS = OO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CONDITIONAL_STATEMENT_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_CONDITIONAL_STATEMENT_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOIfImpl <em>OO If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOIfImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOIf()
	 * @generated
	 */
	int OO_IF = 36;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_IF__CONDITION = OO_CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_IF__BODY_STATEMENTS = OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Else Ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_IF__ELSE_IFS = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_IF__ELSE_STATEMENTS = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_IF_FEATURE_COUNT = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_IF_OPERATION_COUNT = OO_CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOForImpl <em>OO For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOForImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOFor()
	 * @generated
	 */
	int OO_FOR = 37;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR__CONDITION = OO_CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR__BODY_STATEMENTS = OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR__INIT_EXPRESSION = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Increment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR__INCREMENT_EXPRESSION = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_FEATURE_COUNT = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_OPERATION_COUNT = OO_CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOWhileImpl <em>OO While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOWhileImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOWhile()
	 * @generated
	 */
	int OO_WHILE = 39;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_WHILE__CONDITION = OO_CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_WHILE__BODY_STATEMENTS = OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS;

	/**
	 * The number of structural features of the '<em>OO While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_WHILE_FEATURE_COUNT = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_WHILE_OPERATION_COUNT = OO_CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OODoWhileImpl <em>OO Do While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OODoWhileImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOODoWhile()
	 * @generated
	 */
	int OO_DO_WHILE = 40;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DO_WHILE__CONDITION = OO_CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DO_WHILE__BODY_STATEMENTS = OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS;

	/**
	 * The number of structural features of the '<em>OO Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DO_WHILE_FEATURE_COUNT = OO_CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_DO_WHILE_OPERATION_COUNT = OO_CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOEmptyStatementImpl <em>OO Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOEmptyStatementImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOEmptyStatement()
	 * @generated
	 */
	int OO_EMPTY_STATEMENT = 41;

	/**
	 * The number of structural features of the '<em>OO Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_EMPTY_STATEMENT_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_EMPTY_STATEMENT_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOForEachImpl <em>OO For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOForEachImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOForEach()
	 * @generated
	 */
	int OO_FOR_EACH = 42;

	/**
	 * The feature id for the '<em><b>Traversed Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_EACH__TRAVERSED_VARIABLE = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_EACH__LOOP_VARIABLE = OO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_EACH__BODY_STATEMENTS = OO_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OO For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_EACH_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OO For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_FOR_EACH_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOVariableReferenceExpressionImpl <em>OO Variable Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOVariableReferenceExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOVariableReferenceExpression()
	 * @generated
	 */
	int OO_VARIABLE_REFERENCE_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE_REFERENCE_EXPRESSION__VARIABLE = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Variable Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE_REFERENCE_EXPRESSION_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Variable Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_VARIABLE_REFERENCE_EXPRESSION_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBitWiseLeftShiftImpl <em>OO Bit Wise Left Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBitWiseLeftShiftImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitWiseLeftShift()
	 * @generated
	 */
	int OO_BIT_WISE_LEFT_SHIFT = 44;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_LEFT_SHIFT__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_LEFT_SHIFT__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Bit Wise Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_LEFT_SHIFT_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Bit Wise Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_LEFT_SHIFT_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBitWiseRightShiftImpl <em>OO Bit Wise Right Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBitWiseRightShiftImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitWiseRightShift()
	 * @generated
	 */
	int OO_BIT_WISE_RIGHT_SHIFT = 45;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_RIGHT_SHIFT__RIGHT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_RIGHT_SHIFT__LEFT_SIDE = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE;

	/**
	 * The number of structural features of the '<em>OO Bit Wise Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_RIGHT_SHIFT_FEATURE_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OO Bit Wise Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_RIGHT_SHIFT_OPERATION_COUNT = OO_TWO_OPERAND_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBitWiseComplementImpl <em>OO Bit Wise Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBitWiseComplementImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitWiseComplement()
	 * @generated
	 */
	int OO_BIT_WISE_COMPLEMENT = 46;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_COMPLEMENT__OPERAND = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Bit Wise Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_COMPLEMENT_FEATURE_COUNT = OO_ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Bit Wise Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BIT_WISE_COMPLEMENT_OPERATION_COUNT = OO_ARITHMETIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOLanguageSpecificExpressionImpl <em>OO Language Specific Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOLanguageSpecificExpressionImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLanguageSpecificExpression()
	 * @generated
	 */
	int OO_LANGUAGE_SPECIFIC_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_EXPRESSION__SNIPPETS = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Language Specific Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_EXPRESSION_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Language Specific Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_EXPRESSION_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippetImpl <em>OO Language Specific Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOLanguageSpecificSnippetImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLanguageSpecificSnippet()
	 * @generated
	 */
	int OO_LANGUAGE_SPECIFIC_SNIPPET = 48;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_SNIPPET__CODE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_SNIPPET__LANG = 1;

	/**
	 * The number of structural features of the '<em>OO Language Specific Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_SNIPPET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OO Language Specific Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_LANGUAGE_SPECIFIC_SNIPPET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOTypeCastImpl <em>OO Type Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOTypeCastImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOTypeCast()
	 * @generated
	 */
	int OO_TYPE_CAST = 49;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE_CAST__TYPE = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE_CAST__EXPRESSION = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO Type Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE_CAST_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO Type Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_TYPE_CAST_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBoolLiteralImpl <em>OO Bool Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBoolLiteralImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBoolLiteral()
	 * @generated
	 */
	int OO_BOOL_LITERAL = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BOOL_LITERAL__VALUE = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BOOL_LITERAL_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_BOOL_LITERAL_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OONewImpl <em>OO New</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OONewImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOONew()
	 * @generated
	 */
	int OO_NEW = 51;

	/**
	 * The feature id for the '<em><b>Constructor Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NEW__CONSTRUCTOR_PARAMETERS = OO_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NEW__TYPE = OO_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OO New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NEW_FEATURE_COUNT = OO_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OO New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_NEW_OPERATION_COUNT = OO_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOCompareImpl <em>OO Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOCompareImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOCompare()
	 * @generated
	 */
	int OO_COMPARE = 52;

	/**
	 * The feature id for the '<em><b>Compare Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_COMPARE__COMPARE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_COMPARE__STATEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Compared Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_COMPARE__COMPARED_OBJECT_NAME = 2;

	/**
	 * The number of structural features of the '<em>OO Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_COMPARE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>OO Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_COMPARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOPrintImpl <em>OO Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOPrintImpl
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOPrint()
	 * @generated
	 */
	int OO_PRINT = 53;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PRINT__PARAMETER = OO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OO Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PRINT_FEATURE_COUNT = OO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OO Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OO_PRINT_OPERATION_COUNT = OO_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOBaseType <em>OO Base Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOBaseType
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBaseType()
	 * @generated
	 */
	int OO_BASE_TYPE = 54;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOVisibility <em>OO Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOVisibility
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOVisibility()
	 * @generated
	 */
	int OO_VISIBILITY = 55;

	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOCollectionType <em>OO Collection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOCollectionType
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOCollectionType()
	 * @generated
	 */
	int OO_COLLECTION_TYPE = 56;


	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOLanguage <em>OO Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOLanguage
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLanguage()
	 * @generated
	 */
	int OO_LANGUAGE = 57;


	/**
	 * The meta object id for the '{@link hu.bme.aut.oogen.OOCompareType <em>OO Compare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.oogen.OOCompareType
	 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOCompareType()
	 * @generated
	 */
	int OO_COMPARE_TYPE = 58;


	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOPackage <em>OO Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Package</em>'.
	 * @see hu.bme.aut.oogen.OOPackage
	 * @generated
	 */
	EClass getOOPackage();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.oogen.OOPackage#getName()
	 * @see #getOOPackage()
	 * @generated
	 */
	EAttribute getOOPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see hu.bme.aut.oogen.OOPackage#getClasses()
	 * @see #getOOPackage()
	 * @generated
	 */
	EReference getOOPackage_Classes();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOClass <em>OO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Class</em>'.
	 * @see hu.bme.aut.oogen.OOClass
	 * @generated
	 */
	EClass getOOClass();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getName()
	 * @see #getOOClass()
	 * @generated
	 */
	EAttribute getOOClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getMembers()
	 * @see #getOOClass()
	 * @generated
	 */
	EReference getOOClass_Members();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.aut.oogen.OOClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getPackage()
	 * @see #getOOClass()
	 * @generated
	 */
	EReference getOOClass_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getMethods()
	 * @see #getOOClass()
	 * @generated
	 */
	EReference getOOClass_Methods();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOClass#isKeep <em>Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep</em>'.
	 * @see hu.bme.aut.oogen.OOClass#isKeep()
	 * @see #getOOClass()
	 * @generated
	 */
	EAttribute getOOClass_Keep();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.aut.oogen.OOClass#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getLanguages()
	 * @see #getOOClass()
	 * @generated
	 */
	EAttribute getOOClass_Languages();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOClass#isNestedClass <em>Nested Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nested Class</em>'.
	 * @see hu.bme.aut.oogen.OOClass#isNestedClass()
	 * @see #getOOClass()
	 * @generated
	 */
	EAttribute getOOClass_NestedClass();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOClass#getOoclass <em>Ooclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ooclass</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getOoclass()
	 * @see #getOOClass()
	 * @generated
	 */
	EReference getOOClass_Ooclass();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOClass#getOocompare <em>Oocompare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oocompare</em>'.
	 * @see hu.bme.aut.oogen.OOClass#getOocompare()
	 * @see #getOOClass()
	 * @generated
	 */
	EReference getOOClass_Oocompare();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOMember <em>OO Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Member</em>'.
	 * @see hu.bme.aut.oogen.OOMember
	 * @generated
	 */
	EClass getOOMember();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOMember#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see hu.bme.aut.oogen.OOMember#getVisibility()
	 * @see #getOOMember()
	 * @generated
	 */
	EAttribute getOOMember_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOMember#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see hu.bme.aut.oogen.OOMember#isStatic()
	 * @see #getOOMember()
	 * @generated
	 */
	EAttribute getOOMember_Static();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.aut.oogen.OOMember#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages</em>'.
	 * @see hu.bme.aut.oogen.OOMember#getLanguages()
	 * @see #getOOMember()
	 * @generated
	 */
	EAttribute getOOMember_Languages();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOVariable <em>OO Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Variable</em>'.
	 * @see hu.bme.aut.oogen.OOVariable
	 * @generated
	 */
	EClass getOOVariable();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.oogen.OOVariable#getName()
	 * @see #getOOVariable()
	 * @generated
	 */
	EAttribute getOOVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.bme.aut.oogen.OOVariable#getType()
	 * @see #getOOVariable()
	 * @generated
	 */
	EReference getOOVariable_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOVariable#getInitializerExpression <em>Initializer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initializer Expression</em>'.
	 * @see hu.bme.aut.oogen.OOVariable#getInitializerExpression()
	 * @see #getOOVariable()
	 * @generated
	 */
	EReference getOOVariable_InitializerExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOVariable#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see hu.bme.aut.oogen.OOVariable#isTransient()
	 * @see #getOOVariable()
	 * @generated
	 */
	EAttribute getOOVariable_Transient();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOType <em>OO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Type</em>'.
	 * @see hu.bme.aut.oogen.OOType
	 * @generated
	 */
	EClass getOOType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see hu.bme.aut.oogen.OOType#getBaseType()
	 * @see #getOOType()
	 * @generated
	 */
	EAttribute getOOType_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOType#isArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see hu.bme.aut.oogen.OOType#isArray()
	 * @see #getOOType()
	 * @generated
	 */
	EAttribute getOOType_Array();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOType#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see hu.bme.aut.oogen.OOType#getCollectionType()
	 * @see #getOOType()
	 * @generated
	 */
	EAttribute getOOType_CollectionType();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOType#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Type</em>'.
	 * @see hu.bme.aut.oogen.OOType#getClassType()
	 * @see #getOOType()
	 * @generated
	 */
	EReference getOOType_ClassType();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOMethod <em>OO Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Method</em>'.
	 * @see hu.bme.aut.oogen.OOMethod
	 * @generated
	 */
	EClass getOOMethod();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#getName()
	 * @see #getOOMethod()
	 * @generated
	 */
	EAttribute getOOMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOMethod#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#isStatic()
	 * @see #getOOMethod()
	 * @generated
	 */
	EAttribute getOOMethod_Static();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.aut.oogen.OOMethod#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#getLanguages()
	 * @see #getOOMethod()
	 * @generated
	 */
	EAttribute getOOMethod_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#getParameters()
	 * @see #getOOMethod()
	 * @generated
	 */
	EReference getOOMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.aut.oogen.OOMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#getReturnType()
	 * @see #getOOMethod()
	 * @generated
	 */
	EReference getOOMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOMethod#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#getStatements()
	 * @see #getOOMethod()
	 * @generated
	 */
	EReference getOOMethod_Statements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOMethod#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see hu.bme.aut.oogen.OOMethod#getVisibility()
	 * @see #getOOMethod()
	 * @generated
	 */
	EAttribute getOOMethod_Visibility();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOModel <em>OO Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Model</em>'.
	 * @see hu.bme.aut.oogen.OOModel
	 * @generated
	 */
	EClass getOOModel();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOModel#getOopackage <em>Oopackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oopackage</em>'.
	 * @see hu.bme.aut.oogen.OOModel#getOopackage()
	 * @see #getOOModel()
	 * @generated
	 */
	EReference getOOModel_Oopackage();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see hu.bme.aut.oogen.OOModel#getPackages()
	 * @see #getOOModel()
	 * @generated
	 */
	EReference getOOModel_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOModel#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see hu.bme.aut.oogen.OOModel#getGlobalVariables()
	 * @see #getOOModel()
	 * @generated
	 */
	EReference getOOModel_GlobalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOModel#getGlobalFunctions <em>Global Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Functions</em>'.
	 * @see hu.bme.aut.oogen.OOModel#getGlobalFunctions()
	 * @see #getOOModel()
	 * @generated
	 */
	EReference getOOModel_GlobalFunctions();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOStatement <em>OO Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Statement</em>'.
	 * @see hu.bme.aut.oogen.OOStatement
	 * @generated
	 */
	EClass getOOStatement();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOExpression <em>OO Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Expression</em>'.
	 * @see hu.bme.aut.oogen.OOExpression
	 * @generated
	 */
	EClass getOOExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOReturn <em>OO Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Return</em>'.
	 * @see hu.bme.aut.oogen.OOReturn
	 * @generated
	 */
	EClass getOOReturn();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.aut.oogen.OOReturn#getReturnedExpresssion <em>Returned Expresssion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returned Expresssion</em>'.
	 * @see hu.bme.aut.oogen.OOReturn#getReturnedExpresssion()
	 * @see #getOOReturn()
	 * @generated
	 */
	EReference getOOReturn_ReturnedExpresssion();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOArithmeticExpression <em>OO Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Arithmetic Expression</em>'.
	 * @see hu.bme.aut.oogen.OOArithmeticExpression
	 * @generated
	 */
	EClass getOOArithmeticExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOArrayIndexing <em>OO Array Indexing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Array Indexing</em>'.
	 * @see hu.bme.aut.oogen.OOArrayIndexing
	 * @generated
	 */
	EClass getOOArrayIndexing();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOArrayIndexing#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see hu.bme.aut.oogen.OOArrayIndexing#getIndex()
	 * @see #getOOArrayIndexing()
	 * @generated
	 */
	EAttribute getOOArrayIndexing_Index();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOArrayIndexing#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see hu.bme.aut.oogen.OOArrayIndexing#getArray()
	 * @see #getOOArrayIndexing()
	 * @generated
	 */
	EReference getOOArrayIndexing_Array();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOAssignmentExpression <em>OO Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Assignment Expression</em>'.
	 * @see hu.bme.aut.oogen.OOAssignmentExpression
	 * @generated
	 */
	EClass getOOAssignmentExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOAssignmentExpression#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Side</em>'.
	 * @see hu.bme.aut.oogen.OOAssignmentExpression#getLeftSide()
	 * @see #getOOAssignmentExpression()
	 * @generated
	 */
	EReference getOOAssignmentExpression_LeftSide();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOAssignmentExpression#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Side</em>'.
	 * @see hu.bme.aut.oogen.OOAssignmentExpression#getRightSide()
	 * @see #getOOAssignmentExpression()
	 * @generated
	 */
	EReference getOOAssignmentExpression_RightSide();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpression <em>OO Two Operand Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Two Operand Arithmetic Expression</em>'.
	 * @see hu.bme.aut.oogen.OOTwoOperandArithmeticExpression
	 * @generated
	 */
	EClass getOOTwoOperandArithmeticExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpression#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Side</em>'.
	 * @see hu.bme.aut.oogen.OOTwoOperandArithmeticExpression#getRightSide()
	 * @see #getOOTwoOperandArithmeticExpression()
	 * @generated
	 */
	EReference getOOTwoOperandArithmeticExpression_RightSide();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpression#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Side</em>'.
	 * @see hu.bme.aut.oogen.OOTwoOperandArithmeticExpression#getLeftSide()
	 * @see #getOOTwoOperandArithmeticExpression()
	 * @generated
	 */
	EReference getOOTwoOperandArithmeticExpression_LeftSide();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOAdditionExpression <em>OO Addition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Addition Expression</em>'.
	 * @see hu.bme.aut.oogen.OOAdditionExpression
	 * @generated
	 */
	EClass getOOAdditionExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOSubtractionExpression <em>OO Subtraction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Subtraction Expression</em>'.
	 * @see hu.bme.aut.oogen.OOSubtractionExpression
	 * @generated
	 */
	EClass getOOSubtractionExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OODivisionExpression <em>OO Division Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Division Expression</em>'.
	 * @see hu.bme.aut.oogen.OODivisionExpression
	 * @generated
	 */
	EClass getOODivisionExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOIntegerDivisionExpression <em>OO Integer Division Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Integer Division Expression</em>'.
	 * @see hu.bme.aut.oogen.OOIntegerDivisionExpression
	 * @generated
	 */
	EClass getOOIntegerDivisionExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOMultiplicationExpression <em>OO Multiplication Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Multiplication Expression</em>'.
	 * @see hu.bme.aut.oogen.OOMultiplicationExpression
	 * @generated
	 */
	EClass getOOMultiplicationExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOPowerExpression <em>OO Power Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Power Expression</em>'.
	 * @see hu.bme.aut.oogen.OOPowerExpression
	 * @generated
	 */
	EClass getOOPowerExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OORootExpression <em>OO Root Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Root Expression</em>'.
	 * @see hu.bme.aut.oogen.OORootExpression
	 * @generated
	 */
	EClass getOORootExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBitwiseOrExpression <em>OO Bitwise Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bitwise Or Expression</em>'.
	 * @see hu.bme.aut.oogen.OOBitwiseOrExpression
	 * @generated
	 */
	EClass getOOBitwiseOrExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBitwiseXorExpression <em>OO Bitwise Xor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bitwise Xor Expression</em>'.
	 * @see hu.bme.aut.oogen.OOBitwiseXorExpression
	 * @generated
	 */
	EClass getOOBitwiseXorExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBitwiseAndExpression <em>OO Bitwise And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bitwise And Expression</em>'.
	 * @see hu.bme.aut.oogen.OOBitwiseAndExpression
	 * @generated
	 */
	EClass getOOBitwiseAndExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOLogicalExpression <em>OO Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Logical Expression</em>'.
	 * @see hu.bme.aut.oogen.OOLogicalExpression
	 * @generated
	 */
	EClass getOOLogicalExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOLogicalLiteral <em>OO Logical Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Logical Literal</em>'.
	 * @see hu.bme.aut.oogen.OOLogicalLiteral
	 * @generated
	 */
	EClass getOOLogicalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOLogicalLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.aut.oogen.OOLogicalLiteral#isValue()
	 * @see #getOOLogicalLiteral()
	 * @generated
	 */
	EAttribute getOOLogicalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOAndExpression <em>OO And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO And Expression</em>'.
	 * @see hu.bme.aut.oogen.OOAndExpression
	 * @generated
	 */
	EClass getOOAndExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOOrExpression <em>OO Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Or Expression</em>'.
	 * @see hu.bme.aut.oogen.OOOrExpression
	 * @generated
	 */
	EClass getOOOrExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOXorExpression <em>OO Xor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Xor Expression</em>'.
	 * @see hu.bme.aut.oogen.OOXorExpression
	 * @generated
	 */
	EClass getOOXorExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OONorExpression <em>OO Nor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Nor Expression</em>'.
	 * @see hu.bme.aut.oogen.OONorExpression
	 * @generated
	 */
	EClass getOONorExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression <em>OO Two Operand Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Two Operand Logical Expression</em>'.
	 * @see hu.bme.aut.oogen.OOTwoOperandLogicalExpression
	 * @generated
	 */
	EClass getOOTwoOperandLogicalExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Side</em>'.
	 * @see hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getLeftSide()
	 * @see #getOOTwoOperandLogicalExpression()
	 * @generated
	 */
	EReference getOOTwoOperandLogicalExpression_LeftSide();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Side</em>'.
	 * @see hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getRightSide()
	 * @see #getOOTwoOperandLogicalExpression()
	 * @generated
	 */
	EReference getOOTwoOperandLogicalExpression_RightSide();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOOneOperandLogicalExpression <em>OO One Operand Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO One Operand Logical Expression</em>'.
	 * @see hu.bme.aut.oogen.OOOneOperandLogicalExpression
	 * @generated
	 */
	EClass getOOOneOperandLogicalExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOOneOperandLogicalExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see hu.bme.aut.oogen.OOOneOperandLogicalExpression#getOperand()
	 * @see #getOOOneOperandLogicalExpression()
	 * @generated
	 */
	EReference getOOOneOperandLogicalExpression_Operand();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OODoubleLiteral <em>OO Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Double Literal</em>'.
	 * @see hu.bme.aut.oogen.OODoubleLiteral
	 * @generated
	 */
	EClass getOODoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OODoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.aut.oogen.OODoubleLiteral#getValue()
	 * @see #getOODoubleLiteral()
	 * @generated
	 */
	EAttribute getOODoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOFloatLiteral <em>OO Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Float Literal</em>'.
	 * @see hu.bme.aut.oogen.OOFloatLiteral
	 * @generated
	 */
	EClass getOOFloatLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOFloatLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.aut.oogen.OOFloatLiteral#getValue()
	 * @see #getOOFloatLiteral()
	 * @generated
	 */
	EAttribute getOOFloatLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOIntegerLiteral <em>OO Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Integer Literal</em>'.
	 * @see hu.bme.aut.oogen.OOIntegerLiteral
	 * @generated
	 */
	EClass getOOIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOIntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.aut.oogen.OOIntegerLiteral#getValue()
	 * @see #getOOIntegerLiteral()
	 * @generated
	 */
	EAttribute getOOIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOLongLiteral <em>OO Long Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Long Literal</em>'.
	 * @see hu.bme.aut.oogen.OOLongLiteral
	 * @generated
	 */
	EClass getOOLongLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOLongLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.aut.oogen.OOLongLiteral#getValue()
	 * @see #getOOLongLiteral()
	 * @generated
	 */
	EAttribute getOOLongLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOIf <em>OO If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO If</em>'.
	 * @see hu.bme.aut.oogen.OOIf
	 * @generated
	 */
	EClass getOOIf();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOIf#getElseIfs <em>Else Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see hu.bme.aut.oogen.OOIf#getElseIfs()
	 * @see #getOOIf()
	 * @generated
	 */
	EReference getOOIf_ElseIfs();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOIf#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see hu.bme.aut.oogen.OOIf#getElseStatements()
	 * @see #getOOIf()
	 * @generated
	 */
	EReference getOOIf_ElseStatements();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOFor <em>OO For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO For</em>'.
	 * @see hu.bme.aut.oogen.OOFor
	 * @generated
	 */
	EClass getOOFor();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOFor#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Expression</em>'.
	 * @see hu.bme.aut.oogen.OOFor#getInitExpression()
	 * @see #getOOFor()
	 * @generated
	 */
	EReference getOOFor_InitExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.aut.oogen.OOFor#getIncrementExpression <em>Increment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Increment Expression</em>'.
	 * @see hu.bme.aut.oogen.OOFor#getIncrementExpression()
	 * @see #getOOFor()
	 * @generated
	 */
	EReference getOOFor_IncrementExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOConditionalStatement <em>OO Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Conditional Statement</em>'.
	 * @see hu.bme.aut.oogen.OOConditionalStatement
	 * @generated
	 */
	EClass getOOConditionalStatement();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.aut.oogen.OOConditionalStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.bme.aut.oogen.OOConditionalStatement#getCondition()
	 * @see #getOOConditionalStatement()
	 * @generated
	 */
	EReference getOOConditionalStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOConditionalStatement#getBodyStatements <em>Body Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Statements</em>'.
	 * @see hu.bme.aut.oogen.OOConditionalStatement#getBodyStatements()
	 * @see #getOOConditionalStatement()
	 * @generated
	 */
	EReference getOOConditionalStatement_BodyStatements();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOWhile <em>OO While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO While</em>'.
	 * @see hu.bme.aut.oogen.OOWhile
	 * @generated
	 */
	EClass getOOWhile();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OODoWhile <em>OO Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Do While</em>'.
	 * @see hu.bme.aut.oogen.OODoWhile
	 * @generated
	 */
	EClass getOODoWhile();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOEmptyStatement <em>OO Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Empty Statement</em>'.
	 * @see hu.bme.aut.oogen.OOEmptyStatement
	 * @generated
	 */
	EClass getOOEmptyStatement();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOForEach <em>OO For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO For Each</em>'.
	 * @see hu.bme.aut.oogen.OOForEach
	 * @generated
	 */
	EClass getOOForEach();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOForEach#getTraversedVariable <em>Traversed Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traversed Variable</em>'.
	 * @see hu.bme.aut.oogen.OOForEach#getTraversedVariable()
	 * @see #getOOForEach()
	 * @generated
	 */
	EReference getOOForEach_TraversedVariable();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.aut.oogen.OOForEach#getLoopVariable <em>Loop Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Variable</em>'.
	 * @see hu.bme.aut.oogen.OOForEach#getLoopVariable()
	 * @see #getOOForEach()
	 * @generated
	 */
	EReference getOOForEach_LoopVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOForEach#getBodyStatements <em>Body Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Statements</em>'.
	 * @see hu.bme.aut.oogen.OOForEach#getBodyStatements()
	 * @see #getOOForEach()
	 * @generated
	 */
	EReference getOOForEach_BodyStatements();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOVariableReferenceExpression <em>OO Variable Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Variable Reference Expression</em>'.
	 * @see hu.bme.aut.oogen.OOVariableReferenceExpression
	 * @generated
	 */
	EClass getOOVariableReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOVariableReferenceExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.bme.aut.oogen.OOVariableReferenceExpression#getVariable()
	 * @see #getOOVariableReferenceExpression()
	 * @generated
	 */
	EReference getOOVariableReferenceExpression_Variable();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBitWiseLeftShift <em>OO Bit Wise Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bit Wise Left Shift</em>'.
	 * @see hu.bme.aut.oogen.OOBitWiseLeftShift
	 * @generated
	 */
	EClass getOOBitWiseLeftShift();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBitWiseRightShift <em>OO Bit Wise Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bit Wise Right Shift</em>'.
	 * @see hu.bme.aut.oogen.OOBitWiseRightShift
	 * @generated
	 */
	EClass getOOBitWiseRightShift();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBitWiseComplement <em>OO Bit Wise Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bit Wise Complement</em>'.
	 * @see hu.bme.aut.oogen.OOBitWiseComplement
	 * @generated
	 */
	EClass getOOBitWiseComplement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOBitWiseComplement#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see hu.bme.aut.oogen.OOBitWiseComplement#getOperand()
	 * @see #getOOBitWiseComplement()
	 * @generated
	 */
	EReference getOOBitWiseComplement_Operand();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOLanguageSpecificExpression <em>OO Language Specific Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Language Specific Expression</em>'.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificExpression
	 * @generated
	 */
	EClass getOOLanguageSpecificExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOLanguageSpecificExpression#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Snippets</em>'.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificExpression#getSnippets()
	 * @see #getOOLanguageSpecificExpression()
	 * @generated
	 */
	EReference getOOLanguageSpecificExpression_Snippets();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet <em>OO Language Specific Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Language Specific Snippet</em>'.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificSnippet
	 * @generated
	 */
	EClass getOOLanguageSpecificSnippet();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificSnippet#getCode()
	 * @see #getOOLanguageSpecificSnippet()
	 * @generated
	 */
	EAttribute getOOLanguageSpecificSnippet_Code();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see hu.bme.aut.oogen.OOLanguageSpecificSnippet#getLang()
	 * @see #getOOLanguageSpecificSnippet()
	 * @generated
	 */
	EAttribute getOOLanguageSpecificSnippet_Lang();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOTypeCast <em>OO Type Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Type Cast</em>'.
	 * @see hu.bme.aut.oogen.OOTypeCast
	 * @generated
	 */
	EClass getOOTypeCast();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOTypeCast#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.bme.aut.oogen.OOTypeCast#getType()
	 * @see #getOOTypeCast()
	 * @generated
	 */
	EReference getOOTypeCast_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OOTypeCast#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see hu.bme.aut.oogen.OOTypeCast#getExpression()
	 * @see #getOOTypeCast()
	 * @generated
	 */
	EReference getOOTypeCast_Expression();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOBoolLiteral <em>OO Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Bool Literal</em>'.
	 * @see hu.bme.aut.oogen.OOBoolLiteral
	 * @generated
	 */
	EClass getOOBoolLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOBoolLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.aut.oogen.OOBoolLiteral#isValue()
	 * @see #getOOBoolLiteral()
	 * @generated
	 */
	EAttribute getOOBoolLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OONew <em>OO New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO New</em>'.
	 * @see hu.bme.aut.oogen.OONew
	 * @generated
	 */
	EClass getOONew();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.aut.oogen.OONew#getConstructorParameters <em>Constructor Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructor Parameters</em>'.
	 * @see hu.bme.aut.oogen.OONew#getConstructorParameters()
	 * @see #getOONew()
	 * @generated
	 */
	EReference getOONew_ConstructorParameters();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.oogen.OONew#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.bme.aut.oogen.OONew#getType()
	 * @see #getOONew()
	 * @generated
	 */
	EReference getOONew_Type();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOCompare <em>OO Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Compare</em>'.
	 * @see hu.bme.aut.oogen.OOCompare
	 * @generated
	 */
	EClass getOOCompare();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOCompare#getCompareType <em>Compare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare Type</em>'.
	 * @see hu.bme.aut.oogen.OOCompare#getCompareType()
	 * @see #getOOCompare()
	 * @generated
	 */
	EAttribute getOOCompare_CompareType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOCompare#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see hu.bme.aut.oogen.OOCompare#getStatements()
	 * @see #getOOCompare()
	 * @generated
	 */
	EReference getOOCompare_Statements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.oogen.OOCompare#getComparedObjectName <em>Compared Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compared Object Name</em>'.
	 * @see hu.bme.aut.oogen.OOCompare#getComparedObjectName()
	 * @see #getOOCompare()
	 * @generated
	 */
	EAttribute getOOCompare_ComparedObjectName();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.oogen.OOPrint <em>OO Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OO Print</em>'.
	 * @see hu.bme.aut.oogen.OOPrint
	 * @generated
	 */
	EClass getOOPrint();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.oogen.OOPrint#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see hu.bme.aut.oogen.OOPrint#getParameter()
	 * @see #getOOPrint()
	 * @generated
	 */
	EReference getOOPrint_Parameter();

	/**
	 * Returns the meta object for enum '{@link hu.bme.aut.oogen.OOBaseType <em>OO Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OO Base Type</em>'.
	 * @see hu.bme.aut.oogen.OOBaseType
	 * @generated
	 */
	EEnum getOOBaseType();

	/**
	 * Returns the meta object for enum '{@link hu.bme.aut.oogen.OOVisibility <em>OO Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OO Visibility</em>'.
	 * @see hu.bme.aut.oogen.OOVisibility
	 * @generated
	 */
	EEnum getOOVisibility();

	/**
	 * Returns the meta object for enum '{@link hu.bme.aut.oogen.OOCollectionType <em>OO Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OO Collection Type</em>'.
	 * @see hu.bme.aut.oogen.OOCollectionType
	 * @generated
	 */
	EEnum getOOCollectionType();

	/**
	 * Returns the meta object for enum '{@link hu.bme.aut.oogen.OOLanguage <em>OO Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OO Language</em>'.
	 * @see hu.bme.aut.oogen.OOLanguage
	 * @generated
	 */
	EEnum getOOLanguage();

	/**
	 * Returns the meta object for enum '{@link hu.bme.aut.oogen.OOCompareType <em>OO Compare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OO Compare Type</em>'.
	 * @see hu.bme.aut.oogen.OOCompareType
	 * @generated
	 */
	EEnum getOOCompareType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OogenFactory getOogenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOPackageImpl <em>OO Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOPackageImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOPackage()
		 * @generated
		 */
		EClass OO_PACKAGE = eINSTANCE.getOOPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_PACKAGE__NAME = eINSTANCE.getOOPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_PACKAGE__CLASSES = eINSTANCE.getOOPackage_Classes();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOClassImpl <em>OO Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOClassImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOClass()
		 * @generated
		 */
		EClass OO_CLASS = eINSTANCE.getOOClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_CLASS__NAME = eINSTANCE.getOOClass_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CLASS__MEMBERS = eINSTANCE.getOOClass_Members();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CLASS__PACKAGE = eINSTANCE.getOOClass_Package();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CLASS__METHODS = eINSTANCE.getOOClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Keep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_CLASS__KEEP = eINSTANCE.getOOClass_Keep();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_CLASS__LANGUAGES = eINSTANCE.getOOClass_Languages();

		/**
		 * The meta object literal for the '<em><b>Nested Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_CLASS__NESTED_CLASS = eINSTANCE.getOOClass_NestedClass();

		/**
		 * The meta object literal for the '<em><b>Ooclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CLASS__OOCLASS = eINSTANCE.getOOClass_Ooclass();

		/**
		 * The meta object literal for the '<em><b>Oocompare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CLASS__OOCOMPARE = eINSTANCE.getOOClass_Oocompare();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOMemberImpl <em>OO Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOMemberImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOMember()
		 * @generated
		 */
		EClass OO_MEMBER = eINSTANCE.getOOMember();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_MEMBER__VISIBILITY = eINSTANCE.getOOMember_Visibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_MEMBER__STATIC = eINSTANCE.getOOMember_Static();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_MEMBER__LANGUAGES = eINSTANCE.getOOMember_Languages();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOVariableImpl <em>OO Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOVariableImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOVariable()
		 * @generated
		 */
		EClass OO_VARIABLE = eINSTANCE.getOOVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_VARIABLE__NAME = eINSTANCE.getOOVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_VARIABLE__TYPE = eINSTANCE.getOOVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Initializer Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_VARIABLE__INITIALIZER_EXPRESSION = eINSTANCE.getOOVariable_InitializerExpression();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_VARIABLE__TRANSIENT = eINSTANCE.getOOVariable_Transient();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOTypeImpl <em>OO Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOTypeImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOType()
		 * @generated
		 */
		EClass OO_TYPE = eINSTANCE.getOOType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_TYPE__BASE_TYPE = eINSTANCE.getOOType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_TYPE__ARRAY = eINSTANCE.getOOType_Array();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_TYPE__COLLECTION_TYPE = eINSTANCE.getOOType_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Class Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TYPE__CLASS_TYPE = eINSTANCE.getOOType_ClassType();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOMethodImpl <em>OO Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOMethodImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOMethod()
		 * @generated
		 */
		EClass OO_METHOD = eINSTANCE.getOOMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_METHOD__NAME = eINSTANCE.getOOMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_METHOD__STATIC = eINSTANCE.getOOMethod_Static();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_METHOD__LANGUAGES = eINSTANCE.getOOMethod_Languages();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_METHOD__PARAMETERS = eINSTANCE.getOOMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_METHOD__RETURN_TYPE = eINSTANCE.getOOMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_METHOD__STATEMENTS = eINSTANCE.getOOMethod_Statements();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_METHOD__VISIBILITY = eINSTANCE.getOOMethod_Visibility();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOModelImpl <em>OO Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOModelImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOModel()
		 * @generated
		 */
		EClass OO_MODEL = eINSTANCE.getOOModel();

		/**
		 * The meta object literal for the '<em><b>Oopackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_MODEL__OOPACKAGE = eINSTANCE.getOOModel_Oopackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_MODEL__PACKAGES = eINSTANCE.getOOModel_Packages();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_MODEL__GLOBAL_VARIABLES = eINSTANCE.getOOModel_GlobalVariables();

		/**
		 * The meta object literal for the '<em><b>Global Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_MODEL__GLOBAL_FUNCTIONS = eINSTANCE.getOOModel_GlobalFunctions();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOStatementImpl <em>OO Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOStatementImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOStatement()
		 * @generated
		 */
		EClass OO_STATEMENT = eINSTANCE.getOOStatement();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOExpressionImpl <em>OO Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOExpression()
		 * @generated
		 */
		EClass OO_EXPRESSION = eINSTANCE.getOOExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOReturnImpl <em>OO Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOReturnImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOReturn()
		 * @generated
		 */
		EClass OO_RETURN = eINSTANCE.getOOReturn();

		/**
		 * The meta object literal for the '<em><b>Returned Expresssion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_RETURN__RETURNED_EXPRESSSION = eINSTANCE.getOOReturn_ReturnedExpresssion();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOArithmeticExpressionImpl <em>OO Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOArithmeticExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOArithmeticExpression()
		 * @generated
		 */
		EClass OO_ARITHMETIC_EXPRESSION = eINSTANCE.getOOArithmeticExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOArrayIndexingImpl <em>OO Array Indexing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOArrayIndexingImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOArrayIndexing()
		 * @generated
		 */
		EClass OO_ARRAY_INDEXING = eINSTANCE.getOOArrayIndexing();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_ARRAY_INDEXING__INDEX = eINSTANCE.getOOArrayIndexing_Index();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_ARRAY_INDEXING__ARRAY = eINSTANCE.getOOArrayIndexing_Array();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOAssignmentExpressionImpl <em>OO Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOAssignmentExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOAssignmentExpression()
		 * @generated
		 */
		EClass OO_ASSIGNMENT_EXPRESSION = eINSTANCE.getOOAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_ASSIGNMENT_EXPRESSION__LEFT_SIDE = eINSTANCE.getOOAssignmentExpression_LeftSide();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_ASSIGNMENT_EXPRESSION__RIGHT_SIDE = eINSTANCE.getOOAssignmentExpression_RightSide();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpressionImpl <em>OO Two Operand Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOTwoOperandArithmeticExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOTwoOperandArithmeticExpression()
		 * @generated
		 */
		EClass OO_TWO_OPERAND_ARITHMETIC_EXPRESSION = eINSTANCE.getOOTwoOperandArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE = eINSTANCE.getOOTwoOperandArithmeticExpression_RightSide();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE = eINSTANCE.getOOTwoOperandArithmeticExpression_LeftSide();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOAdditionExpressionImpl <em>OO Addition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOAdditionExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOAdditionExpression()
		 * @generated
		 */
		EClass OO_ADDITION_EXPRESSION = eINSTANCE.getOOAdditionExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOSubtractionExpressionImpl <em>OO Subtraction Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOSubtractionExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOSubtractionExpression()
		 * @generated
		 */
		EClass OO_SUBTRACTION_EXPRESSION = eINSTANCE.getOOSubtractionExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OODivisionExpressionImpl <em>OO Division Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OODivisionExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOODivisionExpression()
		 * @generated
		 */
		EClass OO_DIVISION_EXPRESSION = eINSTANCE.getOODivisionExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOIntegerDivisionExpressionImpl <em>OO Integer Division Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOIntegerDivisionExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOIntegerDivisionExpression()
		 * @generated
		 */
		EClass OO_INTEGER_DIVISION_EXPRESSION = eINSTANCE.getOOIntegerDivisionExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOMultiplicationExpressionImpl <em>OO Multiplication Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOMultiplicationExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOMultiplicationExpression()
		 * @generated
		 */
		EClass OO_MULTIPLICATION_EXPRESSION = eINSTANCE.getOOMultiplicationExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOPowerExpressionImpl <em>OO Power Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOPowerExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOPowerExpression()
		 * @generated
		 */
		EClass OO_POWER_EXPRESSION = eINSTANCE.getOOPowerExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OORootExpressionImpl <em>OO Root Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OORootExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOORootExpression()
		 * @generated
		 */
		EClass OO_ROOT_EXPRESSION = eINSTANCE.getOORootExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBitwiseOrExpressionImpl <em>OO Bitwise Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBitwiseOrExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitwiseOrExpression()
		 * @generated
		 */
		EClass OO_BITWISE_OR_EXPRESSION = eINSTANCE.getOOBitwiseOrExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBitwiseXorExpressionImpl <em>OO Bitwise Xor Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBitwiseXorExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitwiseXorExpression()
		 * @generated
		 */
		EClass OO_BITWISE_XOR_EXPRESSION = eINSTANCE.getOOBitwiseXorExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBitwiseAndExpressionImpl <em>OO Bitwise And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBitwiseAndExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitwiseAndExpression()
		 * @generated
		 */
		EClass OO_BITWISE_AND_EXPRESSION = eINSTANCE.getOOBitwiseAndExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOLogicalExpressionImpl <em>OO Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOLogicalExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLogicalExpression()
		 * @generated
		 */
		EClass OO_LOGICAL_EXPRESSION = eINSTANCE.getOOLogicalExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOLogicalLiteralImpl <em>OO Logical Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOLogicalLiteralImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLogicalLiteral()
		 * @generated
		 */
		EClass OO_LOGICAL_LITERAL = eINSTANCE.getOOLogicalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_LOGICAL_LITERAL__VALUE = eINSTANCE.getOOLogicalLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOAndExpressionImpl <em>OO And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOAndExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOAndExpression()
		 * @generated
		 */
		EClass OO_AND_EXPRESSION = eINSTANCE.getOOAndExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOOrExpressionImpl <em>OO Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOOrExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOOrExpression()
		 * @generated
		 */
		EClass OO_OR_EXPRESSION = eINSTANCE.getOOOrExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOXorExpressionImpl <em>OO Xor Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOXorExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOXorExpression()
		 * @generated
		 */
		EClass OO_XOR_EXPRESSION = eINSTANCE.getOOXorExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OONorExpressionImpl <em>OO Nor Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OONorExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOONorExpression()
		 * @generated
		 */
		EClass OO_NOR_EXPRESSION = eINSTANCE.getOONorExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpressionImpl <em>OO Two Operand Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOTwoOperandLogicalExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOTwoOperandLogicalExpression()
		 * @generated
		 */
		EClass OO_TWO_OPERAND_LOGICAL_EXPRESSION = eINSTANCE.getOOTwoOperandLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TWO_OPERAND_LOGICAL_EXPRESSION__LEFT_SIDE = eINSTANCE.getOOTwoOperandLogicalExpression_LeftSide();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TWO_OPERAND_LOGICAL_EXPRESSION__RIGHT_SIDE = eINSTANCE.getOOTwoOperandLogicalExpression_RightSide();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOOneOperandLogicalExpressionImpl <em>OO One Operand Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOOneOperandLogicalExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOOneOperandLogicalExpression()
		 * @generated
		 */
		EClass OO_ONE_OPERAND_LOGICAL_EXPRESSION = eINSTANCE.getOOOneOperandLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_ONE_OPERAND_LOGICAL_EXPRESSION__OPERAND = eINSTANCE.getOOOneOperandLogicalExpression_Operand();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OODoubleLiteralImpl <em>OO Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OODoubleLiteralImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOODoubleLiteral()
		 * @generated
		 */
		EClass OO_DOUBLE_LITERAL = eINSTANCE.getOODoubleLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_DOUBLE_LITERAL__VALUE = eINSTANCE.getOODoubleLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOFloatLiteralImpl <em>OO Float Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOFloatLiteralImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOFloatLiteral()
		 * @generated
		 */
		EClass OO_FLOAT_LITERAL = eINSTANCE.getOOFloatLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_FLOAT_LITERAL__VALUE = eINSTANCE.getOOFloatLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOIntegerLiteralImpl <em>OO Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOIntegerLiteralImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOIntegerLiteral()
		 * @generated
		 */
		EClass OO_INTEGER_LITERAL = eINSTANCE.getOOIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_INTEGER_LITERAL__VALUE = eINSTANCE.getOOIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOLongLiteralImpl <em>OO Long Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOLongLiteralImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLongLiteral()
		 * @generated
		 */
		EClass OO_LONG_LITERAL = eINSTANCE.getOOLongLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_LONG_LITERAL__VALUE = eINSTANCE.getOOLongLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOIfImpl <em>OO If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOIfImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOIf()
		 * @generated
		 */
		EClass OO_IF = eINSTANCE.getOOIf();

		/**
		 * The meta object literal for the '<em><b>Else Ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_IF__ELSE_IFS = eINSTANCE.getOOIf_ElseIfs();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_IF__ELSE_STATEMENTS = eINSTANCE.getOOIf_ElseStatements();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOForImpl <em>OO For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOForImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOFor()
		 * @generated
		 */
		EClass OO_FOR = eINSTANCE.getOOFor();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_FOR__INIT_EXPRESSION = eINSTANCE.getOOFor_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Increment Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_FOR__INCREMENT_EXPRESSION = eINSTANCE.getOOFor_IncrementExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOConditionalStatementImpl <em>OO Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOConditionalStatementImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOConditionalStatement()
		 * @generated
		 */
		EClass OO_CONDITIONAL_STATEMENT = eINSTANCE.getOOConditionalStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CONDITIONAL_STATEMENT__CONDITION = eINSTANCE.getOOConditionalStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS = eINSTANCE.getOOConditionalStatement_BodyStatements();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOWhileImpl <em>OO While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOWhileImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOWhile()
		 * @generated
		 */
		EClass OO_WHILE = eINSTANCE.getOOWhile();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OODoWhileImpl <em>OO Do While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OODoWhileImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOODoWhile()
		 * @generated
		 */
		EClass OO_DO_WHILE = eINSTANCE.getOODoWhile();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOEmptyStatementImpl <em>OO Empty Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOEmptyStatementImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOEmptyStatement()
		 * @generated
		 */
		EClass OO_EMPTY_STATEMENT = eINSTANCE.getOOEmptyStatement();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOForEachImpl <em>OO For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOForEachImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOForEach()
		 * @generated
		 */
		EClass OO_FOR_EACH = eINSTANCE.getOOForEach();

		/**
		 * The meta object literal for the '<em><b>Traversed Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_FOR_EACH__TRAVERSED_VARIABLE = eINSTANCE.getOOForEach_TraversedVariable();

		/**
		 * The meta object literal for the '<em><b>Loop Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_FOR_EACH__LOOP_VARIABLE = eINSTANCE.getOOForEach_LoopVariable();

		/**
		 * The meta object literal for the '<em><b>Body Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_FOR_EACH__BODY_STATEMENTS = eINSTANCE.getOOForEach_BodyStatements();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOVariableReferenceExpressionImpl <em>OO Variable Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOVariableReferenceExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOVariableReferenceExpression()
		 * @generated
		 */
		EClass OO_VARIABLE_REFERENCE_EXPRESSION = eINSTANCE.getOOVariableReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_VARIABLE_REFERENCE_EXPRESSION__VARIABLE = eINSTANCE.getOOVariableReferenceExpression_Variable();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBitWiseLeftShiftImpl <em>OO Bit Wise Left Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBitWiseLeftShiftImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitWiseLeftShift()
		 * @generated
		 */
		EClass OO_BIT_WISE_LEFT_SHIFT = eINSTANCE.getOOBitWiseLeftShift();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBitWiseRightShiftImpl <em>OO Bit Wise Right Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBitWiseRightShiftImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitWiseRightShift()
		 * @generated
		 */
		EClass OO_BIT_WISE_RIGHT_SHIFT = eINSTANCE.getOOBitWiseRightShift();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBitWiseComplementImpl <em>OO Bit Wise Complement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBitWiseComplementImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBitWiseComplement()
		 * @generated
		 */
		EClass OO_BIT_WISE_COMPLEMENT = eINSTANCE.getOOBitWiseComplement();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_BIT_WISE_COMPLEMENT__OPERAND = eINSTANCE.getOOBitWiseComplement_Operand();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOLanguageSpecificExpressionImpl <em>OO Language Specific Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOLanguageSpecificExpressionImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLanguageSpecificExpression()
		 * @generated
		 */
		EClass OO_LANGUAGE_SPECIFIC_EXPRESSION = eINSTANCE.getOOLanguageSpecificExpression();

		/**
		 * The meta object literal for the '<em><b>Snippets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_LANGUAGE_SPECIFIC_EXPRESSION__SNIPPETS = eINSTANCE.getOOLanguageSpecificExpression_Snippets();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippetImpl <em>OO Language Specific Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOLanguageSpecificSnippetImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLanguageSpecificSnippet()
		 * @generated
		 */
		EClass OO_LANGUAGE_SPECIFIC_SNIPPET = eINSTANCE.getOOLanguageSpecificSnippet();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_LANGUAGE_SPECIFIC_SNIPPET__CODE = eINSTANCE.getOOLanguageSpecificSnippet_Code();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_LANGUAGE_SPECIFIC_SNIPPET__LANG = eINSTANCE.getOOLanguageSpecificSnippet_Lang();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOTypeCastImpl <em>OO Type Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOTypeCastImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOTypeCast()
		 * @generated
		 */
		EClass OO_TYPE_CAST = eINSTANCE.getOOTypeCast();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TYPE_CAST__TYPE = eINSTANCE.getOOTypeCast_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_TYPE_CAST__EXPRESSION = eINSTANCE.getOOTypeCast_Expression();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBoolLiteralImpl <em>OO Bool Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBoolLiteralImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBoolLiteral()
		 * @generated
		 */
		EClass OO_BOOL_LITERAL = eINSTANCE.getOOBoolLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_BOOL_LITERAL__VALUE = eINSTANCE.getOOBoolLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OONewImpl <em>OO New</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OONewImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOONew()
		 * @generated
		 */
		EClass OO_NEW = eINSTANCE.getOONew();

		/**
		 * The meta object literal for the '<em><b>Constructor Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_NEW__CONSTRUCTOR_PARAMETERS = eINSTANCE.getOONew_ConstructorParameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_NEW__TYPE = eINSTANCE.getOONew_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOCompareImpl <em>OO Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOCompareImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOCompare()
		 * @generated
		 */
		EClass OO_COMPARE = eINSTANCE.getOOCompare();

		/**
		 * The meta object literal for the '<em><b>Compare Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_COMPARE__COMPARE_TYPE = eINSTANCE.getOOCompare_CompareType();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_COMPARE__STATEMENTS = eINSTANCE.getOOCompare_Statements();

		/**
		 * The meta object literal for the '<em><b>Compared Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OO_COMPARE__COMPARED_OBJECT_NAME = eINSTANCE.getOOCompare_ComparedObjectName();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOPrintImpl <em>OO Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOPrintImpl
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOPrint()
		 * @generated
		 */
		EClass OO_PRINT = eINSTANCE.getOOPrint();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OO_PRINT__PARAMETER = eINSTANCE.getOOPrint_Parameter();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOBaseType <em>OO Base Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOBaseType
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOBaseType()
		 * @generated
		 */
		EEnum OO_BASE_TYPE = eINSTANCE.getOOBaseType();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOVisibility <em>OO Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOVisibility
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOVisibility()
		 * @generated
		 */
		EEnum OO_VISIBILITY = eINSTANCE.getOOVisibility();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOCollectionType <em>OO Collection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOCollectionType
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOCollectionType()
		 * @generated
		 */
		EEnum OO_COLLECTION_TYPE = eINSTANCE.getOOCollectionType();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOLanguage <em>OO Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOLanguage
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOLanguage()
		 * @generated
		 */
		EEnum OO_LANGUAGE = eINSTANCE.getOOLanguage();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.oogen.OOCompareType <em>OO Compare Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.oogen.OOCompareType
		 * @see hu.bme.aut.oogen.OogenPackageImpl#getOOCompareType()
		 * @generated
		 */
		EEnum OO_COMPARE_TYPE = eINSTANCE.getOOCompareType();

	}

} //OogenPackage
