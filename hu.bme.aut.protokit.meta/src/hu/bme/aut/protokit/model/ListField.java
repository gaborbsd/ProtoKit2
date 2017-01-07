/**
 */
package hu.bme.aut.protokit.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.ListField#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getListField()
 * @model
 * @generated
 */
public interface ListField extends Field {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(DataType)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getListField_ElementType()
	 * @model required="true"
	 * @generated
	 */
	DataType getElementType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.ListField#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(DataType value);

} // ListField
