/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOType#isArray <em>Array</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOType#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOType#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOType()
 * @model
 * @generated
 */
public interface OOType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.aut.oogen.OOBaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see hu.bme.aut.oogen.OOBaseType
	 * @see #setBaseType(OOBaseType)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOType_BaseType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	OOBaseType getBaseType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOType#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see hu.bme.aut.oogen.OOBaseType
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(OOBaseType value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOType_Array()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOType#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.aut.oogen.OOCollectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see hu.bme.aut.oogen.OOCollectionType
	 * @see #setCollectionType(OOCollectionType)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOType_CollectionType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	OOCollectionType getCollectionType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOType#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see hu.bme.aut.oogen.OOCollectionType
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(OOCollectionType value);

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type</em>' reference.
	 * @see #setClassType(OOClass)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOType_ClassType()
	 * @model
	 * @generated
	 */
	OOClass getClassType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOType#getClassType <em>Class Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' reference.
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(OOClass value);

} // OOType
