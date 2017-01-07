/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OONew#getConstructorParameters <em>Constructor Parameters</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OONew#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOONew()
 * @model
 * @generated
 */
public interface OONew extends OOExpression {
	/**
	 * Returns the value of the '<em><b>Constructor Parameters</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Parameters</em>' reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOONew_ConstructorParameters()
	 * @model
	 * @generated
	 */
	EList<OOVariable> getConstructorParameters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OOType)
	 * @see hu.bme.aut.oogen.OogenPackage#getOONew_Type()
	 * @model required="true"
	 * @generated
	 */
	OOType getType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OONew#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OOType value);

} // OONew
