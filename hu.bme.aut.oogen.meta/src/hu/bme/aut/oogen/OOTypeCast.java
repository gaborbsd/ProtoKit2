/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Type Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTypeCast#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTypeCast#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOTypeCast()
 * @model
 * @generated
 */
public interface OOTypeCast extends OOExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OOType)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOTypeCast_Type()
	 * @model required="true"
	 * @generated
	 */
	OOType getType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOTypeCast#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OOType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(OOExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOTypeCast_Expression()
	 * @model required="true"
	 * @generated
	 */
	OOExpression getExpression();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOTypeCast#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(OOExpression value);

} // OOTypeCast
