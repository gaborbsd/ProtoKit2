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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOConditionalStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOConditionalStatementImpl#getBodyStatements <em>Body Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOConditionalStatementImpl extends OOStatementImpl implements OOConditionalStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected OOLogicalExpression condition;

	/**
	 * The cached value of the '{@link #getBodyStatements() <em>Body Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<OOStatement> bodyStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOConditionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_CONDITIONAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOLogicalExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(OOLogicalExpression newCondition, NotificationChain msgs) {
		OOLogicalExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(OOLogicalExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOStatement> getBodyStatements() {
		if (bodyStatements == null) {
			bodyStatements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS);
		}
		return bodyStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case OogenPackage.OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS:
				return ((InternalEList<?>)getBodyStatements()).basicRemove(otherEnd, msgs);
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
			case OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION:
				return getCondition();
			case OogenPackage.OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS:
				return getBodyStatements();
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
			case OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION:
				setCondition((OOLogicalExpression)newValue);
				return;
			case OogenPackage.OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS:
				getBodyStatements().clear();
				getBodyStatements().addAll((Collection<? extends OOStatement>)newValue);
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
			case OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION:
				setCondition((OOLogicalExpression)null);
				return;
			case OogenPackage.OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS:
				getBodyStatements().clear();
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
			case OogenPackage.OO_CONDITIONAL_STATEMENT__CONDITION:
				return condition != null;
			case OogenPackage.OO_CONDITIONAL_STATEMENT__BODY_STATEMENTS:
				return bodyStatements != null && !bodyStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OOConditionalStatementImpl
