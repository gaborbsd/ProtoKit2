/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.Field#getByteLen <em>Byte Len</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.Field#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.Field#isUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.Field#isIdentityField <em>Identity Field</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.Field#isTransientField <em>Transient Field</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.Field#getFormatter <em>Formatter</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getField()
 * @model abstract="true"
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Byte Len</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Len</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len</em>' attribute.
	 * @see #setByteLen(int)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getField_ByteLen()
	 * @model default="0"
	 * @generated
	 */
	int getByteLen();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.Field#getByteLen <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Len</em>' attribute.
	 * @see #getByteLen()
	 * @generated
	 */
	void setByteLen(int value);

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
	 * @see hu.bme.aut.protokit.model.ModelPackage#getField_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbounded</em>' attribute.
	 * @see #setUnbounded(boolean)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getField_Unbounded()
	 * @model default="false"
	 * @generated
	 */
	boolean isUnbounded();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.Field#isUnbounded <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbounded</em>' attribute.
	 * @see #isUnbounded()
	 * @generated
	 */
	void setUnbounded(boolean value);

	/**
	 * Returns the value of the '<em><b>Identity Field</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Field</em>' attribute.
	 * @see #setIdentityField(boolean)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getField_IdentityField()
	 * @model default="false"
	 * @generated
	 */
	boolean isIdentityField();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.Field#isIdentityField <em>Identity Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Field</em>' attribute.
	 * @see #isIdentityField()
	 * @generated
	 */
	void setIdentityField(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient Field</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Field</em>' attribute.
	 * @see #setTransientField(boolean)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getField_TransientField()
	 * @model default="false"
	 * @generated
	 */
	boolean isTransientField();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.Field#isTransientField <em>Transient Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Field</em>' attribute.
	 * @see #isTransientField()
	 * @generated
	 */
	void setTransientField(boolean value);

	/**
	 * Returns the value of the '<em><b>Formatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatter</em>' containment reference.
	 * @see #setFormatter(Formatter)
	 * @see hu.bme.aut.protokit.model.ModelPackage#getField_Formatter()
	 * @model containment="true"
	 * @generated
	 */
	Formatter getFormatter();

	/**
	 * Sets the value of the '{@link hu.bme.aut.protokit.model.Field#getFormatter <em>Formatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formatter</em>' containment reference.
	 * @see #getFormatter()
	 * @generated
	 */
	void setFormatter(Formatter value);

} // Field
