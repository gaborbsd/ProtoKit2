/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Language Specific Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet#getCode <em>Code</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOLanguageSpecificSnippet()
 * @model
 * @generated
 */
public interface OOLanguageSpecificSnippet extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOLanguageSpecificSnippet_Code()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * The default value is <code>"JAVA"</code>.
	 * The literals are from the enumeration {@link hu.bme.aut.oogen.OOLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see hu.bme.aut.oogen.OOLanguage
	 * @see #setLang(OOLanguage)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOLanguageSpecificSnippet_Lang()
	 * @model default="JAVA" unique="false" required="true"
	 * @generated
	 */
	OOLanguage getLang();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOLanguageSpecificSnippet#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see hu.bme.aut.oogen.OOLanguage
	 * @see #getLang()
	 * @generated
	 */
	void setLang(OOLanguage value);

} // OOLanguageSpecificSnippet
