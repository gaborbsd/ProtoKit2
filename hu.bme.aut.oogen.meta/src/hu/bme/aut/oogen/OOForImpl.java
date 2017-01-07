/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOForImpl#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOForImpl#getIncrementExpression <em>Increment Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOForImpl extends OOConditionalStatementImpl implements OOFor {
	/**
	 * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpression()
	 * @generated
	 * @ordered
	 */
	protected OOExpression initExpression;

	/**
	 * The cached value of the '{@link #getIncrementExpression() <em>Increment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementExpression()
	 * @generated
	 * @ordered
	 */
	protected OOExpression incrementExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression getInitExpression() {
		if (initExpression != null && initExpression.eIsProxy()) {
			InternalEObject oldInitExpression = (InternalEObject)initExpression;
			initExpression = (OOExpression)eResolveProxy(oldInitExpression);
			if (initExpression != oldInitExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_FOR__INIT_EXPRESSION, oldInitExpression, initExpression));
			}
		}
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression basicGetInitExpression() {
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitExpression(OOExpression newInitExpression) {
		OOExpression oldInitExpression = initExpression;
		initExpression = newInitExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FOR__INIT_EXPRESSION, oldInitExpression, initExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression getIncrementExpression() {
		return incrementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementExpression(OOExpression newIncrementExpression, NotificationChain msgs) {
		OOExpression oldIncrementExpression = incrementExpression;
		incrementExpression = newIncrementExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FOR__INCREMENT_EXPRESSION, oldIncrementExpression, newIncrementExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementExpression(OOExpression newIncrementExpression) {
		if (newIncrementExpression != incrementExpression) {
			NotificationChain msgs = null;
			if (incrementExpression != null)
				msgs = ((InternalEObject)incrementExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_FOR__INCREMENT_EXPRESSION, null, msgs);
			if (newIncrementExpression != null)
				msgs = ((InternalEObject)newIncrementExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_FOR__INCREMENT_EXPRESSION, null, msgs);
			msgs = basicSetIncrementExpression(newIncrementExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FOR__INCREMENT_EXPRESSION, newIncrementExpression, newIncrementExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_FOR__INCREMENT_EXPRESSION:
				return basicSetIncrementExpression(null, msgs);
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
			case OogenPackage.OO_FOR__INIT_EXPRESSION:
				if (resolve) return getInitExpression();
				return basicGetInitExpression();
			case OogenPackage.OO_FOR__INCREMENT_EXPRESSION:
				return getIncrementExpression();
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
			case OogenPackage.OO_FOR__INIT_EXPRESSION:
				setInitExpression((OOExpression)newValue);
				return;
			case OogenPackage.OO_FOR__INCREMENT_EXPRESSION:
				setIncrementExpression((OOExpression)newValue);
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
			case OogenPackage.OO_FOR__INIT_EXPRESSION:
				setInitExpression((OOExpression)null);
				return;
			case OogenPackage.OO_FOR__INCREMENT_EXPRESSION:
				setIncrementExpression((OOExpression)null);
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
			case OogenPackage.OO_FOR__INIT_EXPRESSION:
				return initExpression != null;
			case OogenPackage.OO_FOR__INCREMENT_EXPRESSION:
				return incrementExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //OOForImpl
