/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOReturn#getReturnedExpresssion <em>Returned Expresssion</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOReturn()
 * @model
 * @generated
 */
public interface OOReturn extends OOStatement {
	/**
	 * Returns the value of the '<em><b>Returned Expresssion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned Expresssion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned Expresssion</em>' containment reference.
	 * @see #setReturnedExpresssion(OOExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOReturn_ReturnedExpresssion()
	 * @model containment="true"
	 * @generated
	 */
	OOExpression getReturnedExpresssion();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOReturn#getReturnedExpresssion <em>Returned Expresssion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Expresssion</em>' containment reference.
	 * @see #getReturnedExpresssion()
	 * @generated
	 */
	void setReturnedExpresssion(OOExpression value);

} // OOReturn
