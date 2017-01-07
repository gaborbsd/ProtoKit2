/**
 */
package hu.bme.aut.protokit.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.CountField#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getCountField()
 * @model
 * @generated
 */
public interface CountField extends Field {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ListField)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getCountField_Ref()
	 * @model required="true"
	 * @generated
	 */
	ListField getRef();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.CountField#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ListField value);

} // CountField
