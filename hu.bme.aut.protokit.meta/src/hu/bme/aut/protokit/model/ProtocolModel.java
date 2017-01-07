/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.ProtocolModel#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.ProtocolModel#getFormatters <em>Formatters</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getProtocolModel()
 * @model
 * @generated
 */
public interface ProtocolModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.protokit.model.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see hu.bme.aut.protokit.model.ModelPackage#getProtocolModel_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Formatters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.protokit.model.Formatter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatters</em>' containment reference list.
	 * @see hu.bme.aut.protokit.model.ModelPackage#getProtocolModel_Formatters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Formatter> getFormatters();

} // ProtocolModel
