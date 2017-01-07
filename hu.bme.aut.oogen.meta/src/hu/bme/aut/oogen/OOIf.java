/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOIf#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOIf#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOIf()
 * @model
 * @generated
 */
public interface OOIf extends OOConditionalStatement {
	/**
	 * Returns the value of the '<em><b>Else Ifs</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOIf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Ifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Ifs</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOIf_ElseIfs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOIf> getElseIfs();

	/**
	 * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statements</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOIf_ElseStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOStatement> getElseStatements();

} // OOIf
