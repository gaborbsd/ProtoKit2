/**
 */
package hu.bme.aut.protokit.model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.ProtocolModelImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.ProtocolModelImpl#getFormatters <em>Formatters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolModelImpl extends MinimalEObjectImpl.Container implements ProtocolModel {
	/**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatypes;

	/**
	 * The cached value of the '{@link #getFormatters() <em>Formatters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatters()
	 * @generated
	 * @ordered
	 */
	protected EList<Formatter> formatters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROTOCOL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DataType>(DataType.class, this, ModelPackage.PROTOCOL_MODEL__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formatter> getFormatters() {
		if (formatters == null) {
			formatters = new EObjectContainmentEList<Formatter>(Formatter.class, this, ModelPackage.PROTOCOL_MODEL__FORMATTERS);
		}
		return formatters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PROTOCOL_MODEL__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case ModelPackage.PROTOCOL_MODEL__FORMATTERS:
				return ((InternalEList<?>)getFormatters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROTOCOL_MODEL__DATATYPES:
				return getDatatypes();
			case ModelPackage.PROTOCOL_MODEL__FORMATTERS:
				return getFormatters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PROTOCOL_MODEL__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case ModelPackage.PROTOCOL_MODEL__FORMATTERS:
				getFormatters().clear();
				getFormatters().addAll((Collection<? extends Formatter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PROTOCOL_MODEL__DATATYPES:
				getDatatypes().clear();
				return;
			case ModelPackage.PROTOCOL_MODEL__FORMATTERS:
				getFormatters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PROTOCOL_MODEL__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
			case ModelPackage.PROTOCOL_MODEL__FORMATTERS:
				return formatters != null && !formatters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolModelImpl
