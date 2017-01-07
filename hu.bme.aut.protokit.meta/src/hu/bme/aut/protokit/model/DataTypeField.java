/**
 */
package hu.bme.aut.protokit.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.DataTypeField#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getDataTypeField()
 * @model
 * @generated
 */
public interface DataTypeField extends Field {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getDataTypeField_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.DataTypeField#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // DataTypeField
