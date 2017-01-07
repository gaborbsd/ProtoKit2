/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOMember#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMember#isStatic <em>Static</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMember#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOMember()
 * @model
 * @generated
 */
public interface OOMember extends OOVariable {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.aut.oogen.OOVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.aut.oogen.OOVisibility
	 * @see #setVisibility(OOVisibility)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMember_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	OOVisibility getVisibility();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOMember#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.aut.oogen.OOVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(OOVisibility value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMember_Static()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOMember#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOLanguage}.
	 * The literals are from the enumeration {@link hu.bme.aut.oogen.OOLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see hu.bme.aut.oogen.OOLanguage
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMember_Languages()
	 * @model unique="false"
	 * @generated
	 */
	EList<OOLanguage> getLanguages();

} // OOMember
