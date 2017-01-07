/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOFor#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOFor#getIncrementExpression <em>Increment Expression</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOFor()
 * @model
 * @generated
 */
public interface OOFor extends OOConditionalStatement {
	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' reference.
	 * @see #setInitExpression(OOExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOFor_InitExpression()
	 * @model required="true"
	 * @generated
	 */
	OOExpression getInitExpression();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOFor#getInitExpression <em>Init Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OOExpression value);

	/**
	 * Returns the value of the '<em><b>Increment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Expression</em>' containment reference.
	 * @see #setIncrementExpression(OOExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOFor_IncrementExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OOExpression getIncrementExpression();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOFor#getIncrementExpression <em>Increment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Expression</em>' containment reference.
	 * @see #getIncrementExpression()
	 * @generated
	 */
	void setIncrementExpression(OOExpression value);

} // OOFor
