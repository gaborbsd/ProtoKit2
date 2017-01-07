/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTypeImpl#isArray <em>Array</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTypeImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTypeImpl#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOTypeImpl extends MinimalEObjectImpl.Container implements OOType {
	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final OOBaseType BASE_TYPE_EDEFAULT = OOBaseType.INT;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected OOBaseType baseType = BASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected boolean array = ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final OOCollectionType COLLECTION_TYPE_EDEFAULT = OOCollectionType.NONE;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected OOCollectionType collectionType = COLLECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected OOClass classType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOBaseType getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(OOBaseType newBaseType) {
		OOBaseType oldBaseType = baseType;
		baseType = newBaseType == null ? BASE_TYPE_EDEFAULT : newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TYPE__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(boolean newArray) {
		boolean oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TYPE__ARRAY, oldArray, array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOCollectionType getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(OOCollectionType newCollectionType) {
		OOCollectionType oldCollectionType = collectionType;
		collectionType = newCollectionType == null ? COLLECTION_TYPE_EDEFAULT : newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TYPE__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOClass getClassType() {
		if (classType != null && classType.eIsProxy()) {
			InternalEObject oldClassType = (InternalEObject)classType;
			classType = (OOClass)eResolveProxy(oldClassType);
			if (classType != oldClassType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_TYPE__CLASS_TYPE, oldClassType, classType));
			}
		}
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOClass basicGetClassType() {
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassType(OOClass newClassType) {
		OOClass oldClassType = classType;
		classType = newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TYPE__CLASS_TYPE, oldClassType, classType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OogenPackage.OO_TYPE__BASE_TYPE:
				return getBaseType();
			case OogenPackage.OO_TYPE__ARRAY:
				return isArray();
			case OogenPackage.OO_TYPE__COLLECTION_TYPE:
				return getCollectionType();
			case OogenPackage.OO_TYPE__CLASS_TYPE:
				if (resolve) return getClassType();
				return basicGetClassType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OogenPackage.OO_TYPE__BASE_TYPE:
				setBaseType((OOBaseType)newValue);
				return;
			case OogenPackage.OO_TYPE__ARRAY:
				setArray((Boolean)newValue);
				return;
			case OogenPackage.OO_TYPE__COLLECTION_TYPE:
				setCollectionType((OOCollectionType)newValue);
				return;
			case OogenPackage.OO_TYPE__CLASS_TYPE:
				setClassType((OOClass)newValue);
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
			case OogenPackage.OO_TYPE__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
				return;
			case OogenPackage.OO_TYPE__ARRAY:
				setArray(ARRAY_EDEFAULT);
				return;
			case OogenPackage.OO_TYPE__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case OogenPackage.OO_TYPE__CLASS_TYPE:
				setClassType((OOClass)null);
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
			case OogenPackage.OO_TYPE__BASE_TYPE:
				return baseType != BASE_TYPE_EDEFAULT;
			case OogenPackage.OO_TYPE__ARRAY:
				return array != ARRAY_EDEFAULT;
			case OogenPackage.OO_TYPE__COLLECTION_TYPE:
				return collectionType != COLLECTION_TYPE_EDEFAULT;
			case OogenPackage.OO_TYPE__CLASS_TYPE:
				return classType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseType: ");
		result.append(baseType);
		result.append(", array: ");
		result.append(array);
		result.append(", collectionType: ");
		result.append(collectionType);
		result.append(')');
		return result.toString();
	}

} //OOTypeImpl
