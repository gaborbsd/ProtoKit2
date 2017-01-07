/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Array Indexing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOArrayIndexing#getIndex <em>Index</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOArrayIndexing#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOArrayIndexing()
 * @model
 * @generated
 */
public interface OOArrayIndexing extends OOExpression {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOArrayIndexing_Index()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOArrayIndexing#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference.
	 * @see #setArray(OOVariable)
	 * @see hu.bme.aut.oogen.OogenPackage#getOOArrayIndexing_Array()
	 * @model required="true"
	 * @generated
	 */
	OOVariable getArray();

	/**
	 * Sets the value of the '{@link hu.bme.aut.oogen.OOArrayIndexing#getArray <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(OOVariable value);

} // OOArrayIndexing
