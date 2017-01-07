/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Double Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OODoubleLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOODoubleLiteral()
 * @model
 * @generated
 */
public interface OODoubleLiteral extends OOArithmeticExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see hu.bme.aut.oogen.OogenPackage#getOODoubleLiteral_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OODoubleLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // OODoubleLiteral
