/**
 */
package hu.bme.aut.protokit.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.LengthField#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getLengthField()
 * @model
 * @generated
 */
public interface LengthField extends Field {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(BinaryField)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getLengthField_Ref()
	 * @model required="true"
	 * @generated
	 */
	BinaryField getRef();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.LengthField#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(BinaryField value);

} // LengthField
