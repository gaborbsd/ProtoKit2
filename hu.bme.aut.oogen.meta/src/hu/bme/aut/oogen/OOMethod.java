/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#getStatements <em>Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#isStatic <em>Static</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethod#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod()
 * @model
 * @generated
 */
public interface OOMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_Name()
	 * @model unique="false" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_Static()
	 * @model default="false" unique="false" required="true"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOMethod#isStatic <em>Static</em>}' attribute.
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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_Languages()
	 * @model unique="false"
	 * @generated
	 */
	EList<OOLanguage> getLanguages();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOVariable> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(OOType)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	OOType getReturnType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOMethod#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(OOType value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOStatement> getStatements();

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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOMethod_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	OOVisibility getVisibility();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOMethod#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see hu.bme.aut.oogen.OOVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(OOVisibility value);

} // OOMethod
