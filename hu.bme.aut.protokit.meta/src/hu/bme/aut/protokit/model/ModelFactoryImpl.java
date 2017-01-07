/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.DATA_TYPE: return createDataType();
			case ModelPackage.INTEGER_FIELD: return createIntegerField();
			case ModelPackage.BINARY_FIELD: return createBinaryField();
			case ModelPackage.STRING_FIELD: return createStringField();
			case ModelPackage.BIT_FIELD_COMPONENT: return createBitFieldComponent();
			case ModelPackage.BIT_FIELD: return createBitField();
			case ModelPackage.LIST_FIELD: return createListField();
			case ModelPackage.COUNT_FIELD: return createCountField();
			case ModelPackage.LENGTH_FIELD: return createLengthField();
			case ModelPackage.PROTOCOL_MODEL: return createProtocolModel();
			case ModelPackage.FORMATTER: return createFormatter();
			case ModelPackage.DATA_TYPE_FIELD: return createDataTypeField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerField createIntegerField() {
		IntegerFieldImpl integerField = new IntegerFieldImpl();
		return integerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryField createBinaryField() {
		BinaryFieldImpl binaryField = new BinaryFieldImpl();
		return binaryField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringField createStringField() {
		StringFieldImpl stringField = new StringFieldImpl();
		return stringField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitFieldComponent createBitFieldComponent() {
		BitFieldComponentImpl bitFieldComponent = new BitFieldComponentImpl();
		return bitFieldComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitField createBitField() {
		BitFieldImpl bitField = new BitFieldImpl();
		return bitField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListField createListField() {
		ListFieldImpl listField = new ListFieldImpl();
		return listField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountField createCountField() {
		CountFieldImpl countField = new CountFieldImpl();
		return countField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthField createLengthField() {
		LengthFieldImpl lengthField = new LengthFieldImpl();
		return lengthField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolModel createProtocolModel() {
		ProtocolModelImpl protocolModel = new ProtocolModelImpl();
		return protocolModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formatter createFormatter() {
		FormatterImpl formatter = new FormatterImpl();
		return formatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeField createDataTypeField() {
		DataTypeFieldImpl dataTypeField = new DataTypeFieldImpl();
		return dataTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
