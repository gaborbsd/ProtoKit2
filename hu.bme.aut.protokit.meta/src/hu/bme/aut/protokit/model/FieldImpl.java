/**
 */
package hu.bme.aut.protokit.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.protokit.model.FieldImpl#getByteLen <em>Byte Len</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.FieldImpl#isUnbounded <em>Unbounded</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.FieldImpl#isIdentityField <em>Identity Field</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.FieldImpl#isTransientField <em>Transient Field</em>}</li>
 *   <li>{@link hu.bme.aut.protokit.model.FieldImpl#getFormatter <em>Formatter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FieldImpl extends MinimalEObjectImpl.Container implements Field {
	/**
	 * The default value of the '{@link #getByteLen() <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLen()
	 * @generated
	 * @ordered
	 */
	protected static final int BYTE_LEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getByteLen() <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLen()
	 * @generated
	 * @ordered
	 */
	protected int byteLen = BYTE_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #isUnbounded() <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNBOUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnbounded() <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbounded()
	 * @generated
	 * @ordered
	 */
	protected boolean unbounded = UNBOUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdentityField() <em>Identity Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentityField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTITY_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdentityField() <em>Identity Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentityField()
	 * @generated
	 * @ordered
	 */
	protected boolean identityField = IDENTITY_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransientField() <em>Transient Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransientField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransientField() <em>Transient Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransientField()
	 * @generated
	 * @ordered
	 */
	protected boolean transientField = TRANSIENT_FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormatter() <em>Formatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatter()
	 * @generated
	 * @ordered
	 */
	protected Formatter formatter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getByteLen() {
		return byteLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteLen(int newByteLen) {
		int oldByteLen = byteLen;
		byteLen = newByteLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__BYTE_LEN, oldByteLen, byteLen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnbounded() {
		return unbounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnbounded(boolean newUnbounded) {
		boolean oldUnbounded = unbounded;
		unbounded = newUnbounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__UNBOUNDED, oldUnbounded, unbounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdentityField() {
		return identityField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityField(boolean newIdentityField) {
		boolean oldIdentityField = identityField;
		identityField = newIdentityField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__IDENTITY_FIELD, oldIdentityField, identityField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransientField() {
		return transientField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientField(boolean newTransientField) {
		boolean oldTransientField = transientField;
		transientField = newTransientField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__TRANSIENT_FIELD, oldTransientField, transientField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formatter getFormatter() {
		return formatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormatter(Formatter newFormatter, NotificationChain msgs) {
		Formatter oldFormatter = formatter;
		formatter = newFormatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__FORMATTER, oldFormatter, newFormatter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatter(Formatter newFormatter) {
		if (newFormatter != formatter) {
			NotificationChain msgs = null;
			if (formatter != null)
				msgs = ((InternalEObject)formatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FIELD__FORMATTER, null, msgs);
			if (newFormatter != null)
				msgs = ((InternalEObject)newFormatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FIELD__FORMATTER, null, msgs);
			msgs = basicSetFormatter(newFormatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__FORMATTER, newFormatter, newFormatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FIELD__FORMATTER:
				return basicSetFormatter(null, msgs);
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
			case ModelPackage.FIELD__BYTE_LEN:
				return getByteLen();
			case ModelPackage.FIELD__NAME:
				return getName();
			case ModelPackage.FIELD__UNBOUNDED:
				return isUnbounded();
			case ModelPackage.FIELD__IDENTITY_FIELD:
				return isIdentityField();
			case ModelPackage.FIELD__TRANSIENT_FIELD:
				return isTransientField();
			case ModelPackage.FIELD__FORMATTER:
				return getFormatter();
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
			case ModelPackage.FIELD__BYTE_LEN:
				setByteLen((Integer)newValue);
				return;
			case ModelPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.FIELD__UNBOUNDED:
				setUnbounded((Boolean)newValue);
				return;
			case ModelPackage.FIELD__IDENTITY_FIELD:
				setIdentityField((Boolean)newValue);
				return;
			case ModelPackage.FIELD__TRANSIENT_FIELD:
				setTransientField((Boolean)newValue);
				return;
			case ModelPackage.FIELD__FORMATTER:
				setFormatter((Formatter)newValue);
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
			case ModelPackage.FIELD__BYTE_LEN:
				setByteLen(BYTE_LEN_EDEFAULT);
				return;
			case ModelPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.FIELD__UNBOUNDED:
				setUnbounded(UNBOUNDED_EDEFAULT);
				return;
			case ModelPackage.FIELD__IDENTITY_FIELD:
				setIdentityField(IDENTITY_FIELD_EDEFAULT);
				return;
			case ModelPackage.FIELD__TRANSIENT_FIELD:
				setTransientField(TRANSIENT_FIELD_EDEFAULT);
				return;
			case ModelPackage.FIELD__FORMATTER:
				setFormatter((Formatter)null);
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
			case ModelPackage.FIELD__BYTE_LEN:
				return byteLen != BYTE_LEN_EDEFAULT;
			case ModelPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.FIELD__UNBOUNDED:
				return unbounded != UNBOUNDED_EDEFAULT;
			case ModelPackage.FIELD__IDENTITY_FIELD:
				return identityField != IDENTITY_FIELD_EDEFAULT;
			case ModelPackage.FIELD__TRANSIENT_FIELD:
				return transientField != TRANSIENT_FIELD_EDEFAULT;
			case ModelPackage.FIELD__FORMATTER:
				return formatter != null;
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
		result.append(" (byteLen: ");
		result.append(byteLen);
		result.append(", name: ");
		result.append(name);
		result.append(", unbounded: ");
		result.append(unbounded);
		result.append(", identityField: ");
		result.append(identityField);
		result.append(", transientField: ");
		result.append(transientField);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
