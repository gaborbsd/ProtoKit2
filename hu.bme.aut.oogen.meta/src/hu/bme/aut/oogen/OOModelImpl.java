/**
 */
package hu.bme.aut.oogen;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOModelImpl#getOopackage <em>Oopackage</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOModelImpl#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOModelImpl#getGlobalFunctions <em>Global Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOModelImpl extends MinimalEObjectImpl.Container implements OOModel {
	/**
	 * The cached value of the '{@link #getOopackage() <em>Oopackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOopackage()
	 * @generated
	 * @ordered
	 */
	protected OOPackage oopackage;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<OOPackage> packages;

	/**
	 * The cached value of the '{@link #getGlobalVariables() <em>Global Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<OOVariable> globalVariables;

	/**
	 * The cached value of the '{@link #getGlobalFunctions() <em>Global Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<OOMethod> globalFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPackage getOopackage() {
		if (oopackage != null && oopackage.eIsProxy()) {
			InternalEObject oldOopackage = (InternalEObject)oopackage;
			oopackage = (OOPackage)eResolveProxy(oldOopackage);
			if (oopackage != oldOopackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_MODEL__OOPACKAGE, oldOopackage, oopackage));
			}
		}
		return oopackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPackage basicGetOopackage() {
		return oopackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOopackage(OOPackage newOopackage) {
		OOPackage oldOopackage = oopackage;
		oopackage = newOopackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_MODEL__OOPACKAGE, oldOopackage, oopackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<OOPackage>(OOPackage.class, this, OogenPackage.OO_MODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOVariable> getGlobalVariables() {
		if (globalVariables == null) {
			globalVariables = new EObjectContainmentEList<OOVariable>(OOVariable.class, this, OogenPackage.OO_MODEL__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOMethod> getGlobalFunctions() {
		if (globalFunctions == null) {
			globalFunctions = new EObjectContainmentEList<OOMethod>(OOMethod.class, this, OogenPackage.OO_MODEL__GLOBAL_FUNCTIONS);
		}
		return globalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_MODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_MODEL__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_MODEL__GLOBAL_FUNCTIONS:
				return ((InternalEList<?>)getGlobalFunctions()).basicRemove(otherEnd, msgs);
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
			case OogenPackage.OO_MODEL__OOPACKAGE:
				if (resolve) return getOopackage();
				return basicGetOopackage();
			case OogenPackage.OO_MODEL__PACKAGES:
				return getPackages();
			case OogenPackage.OO_MODEL__GLOBAL_VARIABLES:
				return getGlobalVariables();
			case OogenPackage.OO_MODEL__GLOBAL_FUNCTIONS:
				return getGlobalFunctions();
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
			case OogenPackage.OO_MODEL__OOPACKAGE:
				setOopackage((OOPackage)newValue);
				return;
			case OogenPackage.OO_MODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends OOPackage>)newValue);
				return;
			case OogenPackage.OO_MODEL__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				getGlobalVariables().addAll((Collection<? extends OOVariable>)newValue);
				return;
			case OogenPackage.OO_MODEL__GLOBAL_FUNCTIONS:
				getGlobalFunctions().clear();
				getGlobalFunctions().addAll((Collection<? extends OOMethod>)newValue);
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
			case OogenPackage.OO_MODEL__OOPACKAGE:
				setOopackage((OOPackage)null);
				return;
			case OogenPackage.OO_MODEL__PACKAGES:
				getPackages().clear();
				return;
			case OogenPackage.OO_MODEL__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				return;
			case OogenPackage.OO_MODEL__GLOBAL_FUNCTIONS:
				getGlobalFunctions().clear();
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
			case OogenPackage.OO_MODEL__OOPACKAGE:
				return oopackage != null;
			case OogenPackage.OO_MODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case OogenPackage.OO_MODEL__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
			case OogenPackage.OO_MODEL__GLOBAL_FUNCTIONS:
				return globalFunctions != null && !globalFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OOModelImpl
