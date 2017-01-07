/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see hu.bme.aut.protokit.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.com/gaborbsd/NetworkProtocolDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = hu.bme.aut.protokit.model.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.DataTypeImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.FieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BYTE_LEN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__UNBOUNDED = 2;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IDENTITY_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TRANSIENT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FORMATTER = 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.IntegerFieldImpl <em>Integer Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.IntegerFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getIntegerField()
	 * @generated
	 */
	int INTEGER_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The number of structural features of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.BinaryFieldImpl <em>Binary Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.BinaryFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getBinaryField()
	 * @generated
	 */
	int BINARY_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The number of structural features of the '<em>Binary Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binary Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.StringFieldImpl <em>String Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.StringFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getStringField()
	 * @generated
	 */
	int STRING_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The number of structural features of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.BitFieldComponentImpl <em>Bit Field Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.BitFieldComponentImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getBitFieldComponent()
	 * @generated
	 */
	int BIT_FIELD_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bit Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_COMPONENT__BIT_LEN = 1;

	/**
	 * The number of structural features of the '<em>Bit Field Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bit Field Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.BitFieldImpl <em>Bit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.BitFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getBitField()
	 * @generated
	 */
	int BIT_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__COMPONENTS = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.ListFieldImpl <em>List Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.ListFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getListField()
	 * @generated
	 */
	int LIST_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__ELEMENT_TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.CountFieldImpl <em>Count Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.CountFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getCountField()
	 * @generated
	 */
	int COUNT_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__REF = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Count Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.LengthFieldImpl <em>Length Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.LengthFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getLengthField()
	 * @generated
	 */
	int LENGTH_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD__REF = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.ProtocolModelImpl <em>Protocol Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.ProtocolModelImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getProtocolModel()
	 * @generated
	 */
	int PROTOCOL_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MODEL__DATATYPES = 0;

	/**
	 * The feature id for the '<em><b>Formatters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MODEL__FORMATTERS = 1;

	/**
	 * The number of structural features of the '<em>Protocol Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protocol Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.FormatterImpl <em>Formatter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.FormatterImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getFormatter()
	 * @generated
	 */
	int FORMATTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTER__PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Formatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Formatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.aut.protokit.model.DataTypeFieldImpl <em>Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.aut.protokit.model.DataTypeFieldImpl
	 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getDataTypeField()
	 * @generated
	 */
	int DATA_TYPE_FIELD = 12;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATATYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see hu.bme.aut.protokit.model.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.protokit.model.DataType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see hu.bme.aut.protokit.model.DataType#getFields()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Fields();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.protokit.model.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see hu.bme.aut.protokit.model.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Field#getByteLen <em>Byte Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Len</em>'.
	 * @see hu.bme.aut.protokit.model.Field#getByteLen()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_ByteLen();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.protokit.model.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Field#isUnbounded <em>Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbounded</em>'.
	 * @see hu.bme.aut.protokit.model.Field#isUnbounded()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Unbounded();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Field#isIdentityField <em>Identity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity Field</em>'.
	 * @see hu.bme.aut.protokit.model.Field#isIdentityField()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IdentityField();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Field#isTransientField <em>Transient Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Field</em>'.
	 * @see hu.bme.aut.protokit.model.Field#isTransientField()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TransientField();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.aut.protokit.model.Field#getFormatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formatter</em>'.
	 * @see hu.bme.aut.protokit.model.Field#getFormatter()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Formatter();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.IntegerField <em>Integer Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Field</em>'.
	 * @see hu.bme.aut.protokit.model.IntegerField
	 * @generated
	 */
	EClass getIntegerField();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.BinaryField <em>Binary Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Field</em>'.
	 * @see hu.bme.aut.protokit.model.BinaryField
	 * @generated
	 */
	EClass getBinaryField();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.StringField <em>String Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Field</em>'.
	 * @see hu.bme.aut.protokit.model.StringField
	 * @generated
	 */
	EClass getStringField();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.BitFieldComponent <em>Bit Field Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Component</em>'.
	 * @see hu.bme.aut.protokit.model.BitFieldComponent
	 * @generated
	 */
	EClass getBitFieldComponent();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.BitFieldComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.protokit.model.BitFieldComponent#getName()
	 * @see #getBitFieldComponent()
	 * @generated
	 */
	EAttribute getBitFieldComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.BitFieldComponent#getBitLen <em>Bit Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Len</em>'.
	 * @see hu.bme.aut.protokit.model.BitFieldComponent#getBitLen()
	 * @see #getBitFieldComponent()
	 * @generated
	 */
	EAttribute getBitFieldComponent_BitLen();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.BitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field</em>'.
	 * @see hu.bme.aut.protokit.model.BitField
	 * @generated
	 */
	EClass getBitField();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.protokit.model.BitField#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see hu.bme.aut.protokit.model.BitField#getComponents()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_Components();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.ListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Field</em>'.
	 * @see hu.bme.aut.protokit.model.ListField
	 * @generated
	 */
	EClass getListField();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.protokit.model.ListField#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see hu.bme.aut.protokit.model.ListField#getElementType()
	 * @see #getListField()
	 * @generated
	 */
	EReference getListField_ElementType();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.CountField <em>Count Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Field</em>'.
	 * @see hu.bme.aut.protokit.model.CountField
	 * @generated
	 */
	EClass getCountField();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.protokit.model.CountField#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see hu.bme.aut.protokit.model.CountField#getRef()
	 * @see #getCountField()
	 * @generated
	 */
	EReference getCountField_Ref();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.LengthField <em>Length Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Field</em>'.
	 * @see hu.bme.aut.protokit.model.LengthField
	 * @generated
	 */
	EClass getLengthField();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.protokit.model.LengthField#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see hu.bme.aut.protokit.model.LengthField#getRef()
	 * @see #getLengthField()
	 * @generated
	 */
	EReference getLengthField_Ref();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.ProtocolModel <em>Protocol Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Model</em>'.
	 * @see hu.bme.aut.protokit.model.ProtocolModel
	 * @generated
	 */
	EClass getProtocolModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.protokit.model.ProtocolModel#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see hu.bme.aut.protokit.model.ProtocolModel#getDatatypes()
	 * @see #getProtocolModel()
	 * @generated
	 */
	EReference getProtocolModel_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.aut.protokit.model.ProtocolModel#getFormatters <em>Formatters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formatters</em>'.
	 * @see hu.bme.aut.protokit.model.ProtocolModel#getFormatters()
	 * @see #getProtocolModel()
	 * @generated
	 */
	EReference getProtocolModel_Formatters();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.Formatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatter</em>'.
	 * @see hu.bme.aut.protokit.model.Formatter
	 * @generated
	 */
	EClass getFormatter();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Formatter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.aut.protokit.model.Formatter#getName()
	 * @see #getFormatter()
	 * @generated
	 */
	EAttribute getFormatter_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.aut.protokit.model.Formatter#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see hu.bme.aut.protokit.model.Formatter#getPackage()
	 * @see #getFormatter()
	 * @generated
	 */
	EAttribute getFormatter_Package();

	/**
	 * Returns the meta object for class '{@link hu.bme.aut.protokit.model.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Field</em>'.
	 * @see hu.bme.aut.protokit.model.DataTypeField
	 * @generated
	 */
	EClass getDataTypeField();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.aut.protokit.model.DataTypeField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see hu.bme.aut.protokit.model.DataTypeField#getDatatype()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_Datatype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.DataTypeImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__FIELDS = eINSTANCE.getDataType_Fields();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.FieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Byte Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__BYTE_LEN = eINSTANCE.getField_ByteLen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__UNBOUNDED = eINSTANCE.getField_Unbounded();

		/**
		 * The meta object literal for the '<em><b>Identity Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IDENTITY_FIELD = eINSTANCE.getField_IdentityField();

		/**
		 * The meta object literal for the '<em><b>Transient Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TRANSIENT_FIELD = eINSTANCE.getField_TransientField();

		/**
		 * The meta object literal for the '<em><b>Formatter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FORMATTER = eINSTANCE.getField_Formatter();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.IntegerFieldImpl <em>Integer Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.IntegerFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getIntegerField()
		 * @generated
		 */
		EClass INTEGER_FIELD = eINSTANCE.getIntegerField();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.BinaryFieldImpl <em>Binary Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.BinaryFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getBinaryField()
		 * @generated
		 */
		EClass BINARY_FIELD = eINSTANCE.getBinaryField();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.StringFieldImpl <em>String Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.StringFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getStringField()
		 * @generated
		 */
		EClass STRING_FIELD = eINSTANCE.getStringField();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.BitFieldComponentImpl <em>Bit Field Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.BitFieldComponentImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getBitFieldComponent()
		 * @generated
		 */
		EClass BIT_FIELD_COMPONENT = eINSTANCE.getBitFieldComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_FIELD_COMPONENT__NAME = eINSTANCE.getBitFieldComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Bit Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_FIELD_COMPONENT__BIT_LEN = eINSTANCE.getBitFieldComponent_BitLen();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.BitFieldImpl <em>Bit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.BitFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getBitField()
		 * @generated
		 */
		EClass BIT_FIELD = eINSTANCE.getBitField();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_FIELD__COMPONENTS = eINSTANCE.getBitField_Components();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.ListFieldImpl <em>List Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.ListFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getListField()
		 * @generated
		 */
		EClass LIST_FIELD = eINSTANCE.getListField();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FIELD__ELEMENT_TYPE = eINSTANCE.getListField_ElementType();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.CountFieldImpl <em>Count Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.CountFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getCountField()
		 * @generated
		 */
		EClass COUNT_FIELD = eINSTANCE.getCountField();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNT_FIELD__REF = eINSTANCE.getCountField_Ref();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.LengthFieldImpl <em>Length Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.LengthFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getLengthField()
		 * @generated
		 */
		EClass LENGTH_FIELD = eINSTANCE.getLengthField();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LENGTH_FIELD__REF = eINSTANCE.getLengthField_Ref();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.ProtocolModelImpl <em>Protocol Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.ProtocolModelImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getProtocolModel()
		 * @generated
		 */
		EClass PROTOCOL_MODEL = eINSTANCE.getProtocolModel();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_MODEL__DATATYPES = eINSTANCE.getProtocolModel_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Formatters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_MODEL__FORMATTERS = eINSTANCE.getProtocolModel_Formatters();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.FormatterImpl <em>Formatter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.FormatterImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getFormatter()
		 * @generated
		 */
		EClass FORMATTER = eINSTANCE.getFormatter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTER__NAME = eINSTANCE.getFormatter_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTER__PACKAGE = eINSTANCE.getFormatter_Package();

		/**
		 * The meta object literal for the '{@link hu.bme.aut.protokit.model.DataTypeFieldImpl <em>Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.aut.protokit.model.DataTypeFieldImpl
		 * @see hu.bme.aut.protokit.model.ModelPackageImpl#getDataTypeField()
		 * @generated
		 */
		EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DATATYPE = eINSTANCE.getDataTypeField_Datatype();

	}

} //ModelPackage
