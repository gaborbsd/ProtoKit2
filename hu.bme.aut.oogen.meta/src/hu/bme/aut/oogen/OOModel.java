/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOModel#getOopackage <em>Oopackage</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOModel#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOModel#getGlobalFunctions <em>Global Functions</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOModel()
 * @model
 * @generated
 */
public interface OOModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Oopackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oopackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oopackage</em>' reference.
	 * @see #setOopackage(OOPackage)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOModel_Oopackage()
	 * @model
	 * @generated
	 */
	OOPackage getOopackage();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOModel#getOopackage <em>Oopackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oopackage</em>' reference.
	 * @see #getOopackage()
	 * @generated
	 */
	void setOopackage(OOPackage value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOModel_GlobalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOVariable> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Global Functions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Functions</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOModel_GlobalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOMethod> getGlobalFunctions();

} // OOModel
