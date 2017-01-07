/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO One Operand Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOOneOperandLogicalExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOOneOperandLogicalExpression()
 * @model
 * @generated
 */
public interface OOOneOperandLogicalExpression extends OOLogicalExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(OOLogicalExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOOneOperandLogicalExpression_Operand()
	 * @model required="true"
	 * @generated
	 */
	OOLogicalExpression getOperand();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOOneOperandLogicalExpression#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(OOLogicalExpression value);

} // OOOneOperandLogicalExpression
