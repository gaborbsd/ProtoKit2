/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOConditionalStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOConditionalStatement#getBodyStatements <em>Body Statements</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOConditionalStatement()
 * @model
 * @generated
 */
public interface OOConditionalStatement extends OOStatement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OOLogicalExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOConditionalStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OOLogicalExpression getCondition();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOConditionalStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OOLogicalExpression value);

	/**
	 * Returns the value of the '<em><b>Body Statements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Statements</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOConditionalStatement_BodyStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOStatement> getBodyStatements();

} // OOConditionalStatement
