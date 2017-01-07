/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Language Specific Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOLanguageSpecificExpression#getSnippets <em>Snippets</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOLanguageSpecificExpression()
 * @model
 * @generated
 */
public interface OOLanguageSpecificExpression extends OOExpression, OOLogicalExpression {
	/**
	 * Returns the value of the '<em><b>Snippets</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOLanguageSpecificSnippet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippets</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOLanguageSpecificExpression_Snippets()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOLanguageSpecificSnippet> getSnippets();

} // OOLanguageSpecificExpression
