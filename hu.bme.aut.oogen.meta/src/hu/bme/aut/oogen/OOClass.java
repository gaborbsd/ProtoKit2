/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getMembers <em>Members</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getPackage <em>Package</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#isKeep <em>Keep</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getLanguages <em>Languages</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#isNestedClass <em>Nested Class</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClass#getOocompare <em>Oocompare</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOClass()
 * @model
 * @generated
 */
public interface OOClass extends EObject {
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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Name()
	 * @model unique="false" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.aut.oogen.OOPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(OOPackage)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Package()
	 * @see hu.bme.aut.oogen.OOPackage#getClasses
	 * @model opposite="classes" transient="false"
	 * @generated
	 */
	OOPackage getPackage();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOClass#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(OOPackage value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Keep</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep</em>' attribute.
	 * @see #setKeep(boolean)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Keep()
	 * @model default="false" unique="false" required="true"
	 * @generated
	 */
	boolean isKeep();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOClass#isKeep <em>Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep</em>' attribute.
	 * @see #isKeep()
	 * @generated
	 */
	void setKeep(boolean value);

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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Languages()
	 * @model unique="false"
	 * @generated
	 */
	EList<OOLanguage> getLanguages();

	/**
	 * Returns the value of the '<em><b>Nested Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Class</em>' attribute.
	 * @see #setNestedClass(boolean)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_NestedClass()
	 * @model default="false" unique="false" required="true"
	 * @generated
	 */
	boolean isNestedClass();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOClass#isNestedClass <em>Nested Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Class</em>' attribute.
	 * @see #isNestedClass()
	 * @generated
	 */
	void setNestedClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Ooclass</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ooclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ooclass</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Ooclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOClass> getOoclass();

	/**
	 * Returns the value of the '<em><b>Oocompare</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.oogen.OOCompare}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oocompare</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oocompare</em>' containment reference list.
	 * @see hu.bme.aut.oogen.OogenPackage#getOOClass_Oocompare()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<OOCompare> getOocompare();

} // OOClass
