/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.BitFieldComponent#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.BitFieldComponent#getBitLen <em>Bit Len</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getBitFieldComponent()
 * @model
 * @generated
 */
public interface BitFieldComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getBitFieldComponent_Name()
	 * @model default=""
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='BitField' unique='false' upper='*'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.BitFieldComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bit Len</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Len</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Len</em>' attribute.
	 * @see #setBitLen(int)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getBitFieldComponent_BitLen()
	 * @model default="0"
	 * @generated
	 */
	int getBitLen();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.BitFieldComponent#getBitLen <em>Bit Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Len</em>' attribute.
	 * @see #getBitLen()
	 * @generated
	 */
	void setBitLen(int value);

} // BitFieldComponent
