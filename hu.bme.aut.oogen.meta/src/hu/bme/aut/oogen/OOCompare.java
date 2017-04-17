/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOCompare#getCompareType <em>Compare Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOCompare#getStatements <em>Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOCompare#getComparedObjectName <em>Compared Object Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOCompare()
 * @model
 * @generated
 */
public interface OOCompare extends EObject {
	/**
	 * Returns the value of the '<em><b>Compare Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.aut.oogen.OOCompareType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare Type</em>' attribute.
	 * @see hu.bme.aut.oogen.OOCompareType
	 * @see #setCompareType(OOCompareType)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOCompare_CompareType()
	 * @model required="true"
	 * @generated
	 */
	OOCompareType getCompareType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOCompare#getCompareType <em>Compare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare Type</em>' attribute.
	 * @see hu.bme.aut.oogen.OOCompareType
	 * @see #getCompareType()
	 * @generated
	 */
	void setCompareType(OOCompareType value);

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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOCompare_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOStatement> getStatements();

	/**
	 * Returns the value of the '<em><b>Compared Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compared Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared Object Name</em>' attribute.
	 * @see #setComparedObjectName(String)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOCompare_ComparedObjectName()
	 * @model required="true"
	 * @generated
	 */
	String getComparedObjectName();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOCompare#getComparedObjectName <em>Compared Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compared Object Name</em>' attribute.
	 * @see #getComparedObjectName()
	 * @generated
	 */
	void setComparedObjectName(String value);

} // OOCompare
