/**
 */
package hu.bme.aut.oogen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOVariable#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOVariable#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOVariable#getInitializerExpression <em>Initializer Expression</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOVariable#isTransient <em>Transient</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOVariable()
 * @model
 * @generated
 */
public interface OOVariable extends OOStatement {
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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOVariable_Name()
	 * @model unique="false" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see hu.bme.aut.oogen.OogenPackage#getOOVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	OOType getType();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OOType value);

	/**
	 * Returns the value of the '<em><b>Initializer Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer Expression</em>' reference.
	 * @see #setInitializerExpression(OOExpression)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOVariable_InitializerExpression()
	 * @model
	 * @generated
	 */
	OOExpression getInitializerExpression();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOVariable#getInitializerExpression <em>Initializer Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer Expression</em>' reference.
	 * @see #getInitializerExpression()
	 * @generated
	 */
	void setInitializerExpression(OOExpression value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOVariable_Transient()
	 * @model default="false" unique="false" required="true"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOVariable#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

} // OOVariable
