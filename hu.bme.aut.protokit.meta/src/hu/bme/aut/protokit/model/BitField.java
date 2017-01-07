/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.BitField#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.protokit.model.ModelPackage#getBitField()
 * @model
 * @generated
 */
public interface BitField extends Field {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.aut.protokit.model.BitFieldComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see hu.bme.aut.protokit.model.ModelPackage#getBitField_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<BitFieldComponent> getComponents();

} // BitField
