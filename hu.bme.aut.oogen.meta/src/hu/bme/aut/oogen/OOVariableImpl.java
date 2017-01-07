/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOVariableImpl#getInitializerExpression <em>Initializer Expression</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOVariableImpl#isTransient <em>Transient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOVariableImpl extends OOStatementImpl implements OOVariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OOType type;

	/**
	 * The cached value of the '{@link #getInitializerExpression() <em>Initializer Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializerExpression()
	 * @generated
	 * @ordered
	 */
	protected OOExpression initializerExpression;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (OOType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OOType newType) {
		OOType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression getInitializerExpression() {
		if (initializerExpression != null && initializerExpression.eIsProxy()) {
			InternalEObject oldInitializerExpression = (InternalEObject)initializerExpression;
			initializerExpression = (OOExpression)eResolveProxy(oldInitializerExpression);
			if (initializerExpression != oldInitializerExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_VARIABLE__INITIALIZER_EXPRESSION, oldInitializerExpression, initializerExpression));
			}
		}
		return initializerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression basicGetInitializerExpression() {
		return initializerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializerExpression(OOExpression newInitializerExpression) {
		OOExpression oldInitializerExpression = initializerExpression;
		initializerExpression = newInitializerExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_VARIABLE__INITIALIZER_EXPRESSION, oldInitializerExpression, initializerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_VARIABLE__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OogenPackage.OO_VARIABLE__NAME:
				return getName();
			case OogenPackage.OO_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case OogenPackage.OO_VARIABLE__INITIALIZER_EXPRESSION:
				if (resolve) return getInitializerExpression();
				return basicGetInitializerExpression();
			case OogenPackage.OO_VARIABLE__TRANSIENT:
				return isTransient();
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
			case OogenPackage.OO_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case OogenPackage.OO_VARIABLE__TYPE:
				setType((OOType)newValue);
				return;
			case OogenPackage.OO_VARIABLE__INITIALIZER_EXPRESSION:
				setInitializerExpression((OOExpression)newValue);
				return;
			case OogenPackage.OO_VARIABLE__TRANSIENT:
				setTransient((Boolean)newValue);
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
			case OogenPackage.OO_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OogenPackage.OO_VARIABLE__TYPE:
				setType((OOType)null);
				return;
			case OogenPackage.OO_VARIABLE__INITIALIZER_EXPRESSION:
				setInitializerExpression((OOExpression)null);
				return;
			case OogenPackage.OO_VARIABLE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
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
			case OogenPackage.OO_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OogenPackage.OO_VARIABLE__TYPE:
				return type != null;
			case OogenPackage.OO_VARIABLE__INITIALIZER_EXPRESSION:
				return initializerExpression != null;
			case OogenPackage.OO_VARIABLE__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", transient: ");
		result.append(transient_);
		result.append(')');
		return result.toString();
	}

} //OOVariableImpl
