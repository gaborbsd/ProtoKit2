/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Variable Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOVariableReferenceExpression#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOVariableReferenceExpression()
 * @model
 * @generated
 */
public interface OOVariableReferenceExpression extends OOExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(OOVariable)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOVariableReferenceExpression_Variable()
	 * @model required="true"
	 * @generated
	 */
	OOVariable getVariable();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOVariableReferenceExpression#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(OOVariable value);

} // OOVariableReferenceExpression
