/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Two Operand Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpressionImpl#getRightSide <em>Right Side</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTwoOperandArithmeticExpressionImpl#getLeftSide <em>Left Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOTwoOperandArithmeticExpressionImpl extends OOArithmeticExpressionImpl implements OOTwoOperandArithmeticExpression {
	/**
	 * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected OOExpression rightSide;

	/**
	 * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected OOExpression leftSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOTwoOperandArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression getRightSide() {
		if (rightSide != null && rightSide.eIsProxy()) {
			InternalEObject oldRightSide = (InternalEObject)rightSide;
			rightSide = (OOExpression)eResolveProxy(oldRightSide);
			if (rightSide != oldRightSide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE, oldRightSide, rightSide));
			}
		}
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression basicGetRightSide() {
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSide(OOExpression newRightSide) {
		OOExpression oldRightSide = rightSide;
		rightSide = newRightSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE, oldRightSide, rightSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression getLeftSide() {
		if (leftSide != null && leftSide.eIsProxy()) {
			InternalEObject oldLeftSide = (InternalEObject)leftSide;
			leftSide = (OOExpression)eResolveProxy(oldLeftSide);
			if (leftSide != oldLeftSide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE, oldLeftSide, leftSide));
			}
		}
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOExpression basicGetLeftSide() {
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSide(OOExpression newLeftSide) {
		OOExpression oldLeftSide = leftSide;
		leftSide = newLeftSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE, oldLeftSide, leftSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE:
				if (resolve) return getRightSide();
				return basicGetRightSide();
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE:
				if (resolve) return getLeftSide();
				return basicGetLeftSide();
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
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE:
				setRightSide((OOExpression)newValue);
				return;
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE:
				setLeftSide((OOExpression)newValue);
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
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE:
				setRightSide((OOExpression)null);
				return;
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE:
				setLeftSide((OOExpression)null);
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
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__RIGHT_SIDE:
				return rightSide != null;
			case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION__LEFT_SIDE:
				return leftSide != null;
		}
		return super.eIsSet(featureID);
	}

} //OOTwoOperandArithmeticExpressionImpl
