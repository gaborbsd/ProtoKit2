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
 * An implementation of the model object '<em><b>OO Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOReturnImpl#getReturnedExpresssion <em>Returned Expresssion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOReturnImpl extends OOStatementImpl implements OOReturn {
	/**
	 * The cached value of the '{@link #getReturnedExpresssion() <em>Returned Expresssion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedExpresssion()
	 * @generated
	 * @ordered
	 */
	protected OOExpression returnedExpresssion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression getReturnedExpresssion() {
		return returnedExpresssion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnedExpresssion(OOExpression newReturnedExpresssion, NotificationChain msgs) {
		OOExpression oldReturnedExpresssion = returnedExpresssion;
		returnedExpresssion = newReturnedExpresssion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OogenPackage.OO_RETURN__RETURNED_EXPRESSSION, oldReturnedExpresssion, newReturnedExpresssion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnedExpresssion(OOExpression newReturnedExpresssion) {
		if (newReturnedExpresssion != returnedExpresssion) {
			NotificationChain msgs = null;
			if (returnedExpresssion != null)
				msgs = ((InternalEObject)returnedExpresssion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_RETURN__RETURNED_EXPRESSSION, null, msgs);
			if (newReturnedExpresssion != null)
				msgs = ((InternalEObject)newReturnedExpresssion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_RETURN__RETURNED_EXPRESSSION, null, msgs);
			msgs = basicSetReturnedExpresssion(newReturnedExpresssion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_RETURN__RETURNED_EXPRESSSION, newReturnedExpresssion, newReturnedExpresssion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_RETURN__RETURNED_EXPRESSSION:
				return basicSetReturnedExpresssion(null, msgs);
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
			case OogenPackage.OO_RETURN__RETURNED_EXPRESSSION:
				return getReturnedExpresssion();
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
			case OogenPackage.OO_RETURN__RETURNED_EXPRESSSION:
				setReturnedExpresssion((OOExpression)newValue);
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
			case OogenPackage.OO_RETURN__RETURNED_EXPRESSSION:
				setReturnedExpresssion((OOExpression)null);
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
			case OogenPackage.OO_RETURN__RETURNED_EXPRESSSION:
				return returnedExpresssion != null;
		}
		return super.eIsSet(featureID);
	}

} //OOReturnImpl
