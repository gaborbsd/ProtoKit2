/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.protokit.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = hu.bme.aut.protokit.model.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Integer Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Field</em>'.
	 * @generated
	 */
	IntegerField createIntegerField();

	/**
	 * Returns a new object of class '<em>Binary Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Field</em>'.
	 * @generated
	 */
	BinaryField createBinaryField();

	/**
	 * Returns a new object of class '<em>String Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Field</em>'.
	 * @generated
	 */
	StringField createStringField();

	/**
	 * Returns a new object of class '<em>Bit Field Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Field Component</em>'.
	 * @generated
	 */
	BitFieldComponent createBitFieldComponent();

	/**
	 * Returns a new object of class '<em>Bit Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Field</em>'.
	 * @generated
	 */
	BitField createBitField();

	/**
	 * Returns a new object of class '<em>List Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Field</em>'.
	 * @generated
	 */
	ListField createListField();

	/**
	 * Returns a new object of class '<em>Count Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Field</em>'.
	 * @generated
	 */
	CountField createCountField();

	/**
	 * Returns a new object of class '<em>Length Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Field</em>'.
	 * @generated
	 */
	LengthField createLengthField();

	/**
	 * Returns a new object of class '<em>Protocol Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Model</em>'.
	 * @generated
	 */
	ProtocolModel createProtocolModel();

	/**
	 * Returns a new object of class '<em>Formatter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formatter</em>'.
	 * @generated
	 */
	Formatter createFormatter();

	/**
	 * Returns a new object of class '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Field</em>'.
	 * @generated
	 */
	DataTypeField createDataTypeField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
