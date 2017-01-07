/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOForEach#getTraversedVariable <em>Traversed Variable</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOForEach#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOForEach#getBodyStatements <em>Body Statements</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOForEach()
 * @model
 * @generated
 */
public interface OOForEach extends OOStatement {
	/**
	 * Returns the value of the '<em><b>Traversed Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversed Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversed Variable</em>' reference.
	 * @see #setTraversedVariable(OOVariable)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOForEach_TraversedVariable()
	 * @model required="true"
	 * @generated
	 */
	OOVariable getTraversedVariable();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOForEach#getTraversedVariable <em>Traversed Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversed Variable</em>' reference.
	 * @see #getTraversedVariable()
	 * @generated
	 */
	void setTraversedVariable(OOVariable value);

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference.
	 * @see #setLoopVariable(OOVariable)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOForEach_LoopVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OOVariable getLoopVariable();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOForEach#getLoopVariable <em>Loop Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Variable</em>' containment reference.
	 * @see #getLoopVariable()
	 * @generated
	 */
	void setLoopVariable(OOVariable value);

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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOForEach_BodyStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOStatement> getBodyStatements();

} // OOForEach
