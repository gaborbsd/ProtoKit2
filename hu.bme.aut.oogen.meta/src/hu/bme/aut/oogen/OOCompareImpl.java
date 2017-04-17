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
 * An implementation of the model object '<em><b>OO Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOCompareImpl#getCompareType <em>Compare Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOCompareImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOCompareImpl#getComparedObjectName <em>Compared Object Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOCompareImpl extends MinimalEObjectImpl.Container implements OOCompare {
	/**
	 * The default value of the '{@link #getCompareType() <em>Compare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareType()
	 * @generated
	 * @ordered
	 */
	protected static final OOCompareType COMPARE_TYPE_EDEFAULT = OOCompareType.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getCompareType() <em>Compare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareType()
	 * @generated
	 * @ordered
	 */
	protected OOCompareType compareType = COMPARE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<OOStatement> statements;

	/**
	 * The default value of the '{@link #getComparedObjectName() <em>Compared Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARED_OBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparedObjectName() <em>Compared Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedObjectName()
	 * @generated
	 * @ordered
	 */
	protected String comparedObjectName = COMPARED_OBJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOCompareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_COMPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOCompareType getCompareType() {
		return compareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareType(OOCompareType newCompareType) {
		OOCompareType oldCompareType = compareType;
		compareType = newCompareType == null ? COMPARE_TYPE_EDEFAULT : newCompareType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_COMPARE__COMPARE_TYPE, oldCompareType, compareType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_COMPARE__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparedObjectName() {
		return comparedObjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparedObjectName(String newComparedObjectName) {
		String oldComparedObjectName = comparedObjectName;
		comparedObjectName = newComparedObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_COMPARE__COMPARED_OBJECT_NAME, oldComparedObjectName, comparedObjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_COMPARE__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case OogenPackage.OO_COMPARE__COMPARE_TYPE:
				return getCompareType();
			case OogenPackage.OO_COMPARE__STATEMENTS:
				return getStatements();
			case OogenPackage.OO_COMPARE__COMPARED_OBJECT_NAME:
				return getComparedObjectName();
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
			case OogenPackage.OO_COMPARE__COMPARE_TYPE:
				setCompareType((OOCompareType)newValue);
				return;
			case OogenPackage.OO_COMPARE__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends OOStatement>)newValue);
				return;
			case OogenPackage.OO_COMPARE__COMPARED_OBJECT_NAME:
				setComparedObjectName((String)newValue);
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
			case OogenPackage.OO_COMPARE__COMPARE_TYPE:
				setCompareType(COMPARE_TYPE_EDEFAULT);
				return;
			case OogenPackage.OO_COMPARE__STATEMENTS:
				getStatements().clear();
				return;
			case OogenPackage.OO_COMPARE__COMPARED_OBJECT_NAME:
				setComparedObjectName(COMPARED_OBJECT_NAME_EDEFAULT);
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
			case OogenPackage.OO_COMPARE__COMPARE_TYPE:
				return compareType != COMPARE_TYPE_EDEFAULT;
			case OogenPackage.OO_COMPARE__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case OogenPackage.OO_COMPARE__COMPARED_OBJECT_NAME:
				return COMPARED_OBJECT_NAME_EDEFAULT == null ? comparedObjectName != null : !COMPARED_OBJECT_NAME_EDEFAULT.equals(comparedObjectName);
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
		result.append(" (compareType: ");
		result.append(compareType);
		result.append(", ComparedObjectName: ");
		result.append(comparedObjectName);
		result.append(')');
		return result.toString();
	}

} //OOCompareImpl
