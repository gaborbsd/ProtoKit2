/**
 */
package hu.bme.aut.oogen;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOIfImpl#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOIfImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOIfImpl extends OOConditionalStatementImpl implements OOIf {
	/**
	 * The cached value of the '{@link #getElseIfs() <em>Else Ifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfs()
	 * @generated
	 * @ordered
	 */
	protected EList<OOIf> elseIfs;

	/**
	 * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<OOStatement> elseStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOIf> getElseIfs() {
		if (elseIfs == null) {
			elseIfs = new EObjectContainmentEList<OOIf>(OOIf.class, this, OogenPackage.OO_IF__ELSE_IFS);
		}
		return elseIfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOStatement> getElseStatements() {
		if (elseStatements == null) {
			elseStatements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_IF__ELSE_STATEMENTS);
		}
		return elseStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_IF__ELSE_IFS:
				return ((InternalEList<?>)getElseIfs()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_IF__ELSE_STATEMENTS:
				return ((InternalEList<?>)getElseStatements()).basicRemove(otherEnd, msgs);
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
			case OogenPackage.OO_IF__ELSE_IFS:
				return getElseIfs();
			case OogenPackage.OO_IF__ELSE_STATEMENTS:
				return getElseStatements();
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
			case OogenPackage.OO_IF__ELSE_IFS:
				getElseIfs().clear();
				getElseIfs().addAll((Collection<? extends OOIf>)newValue);
				return;
			case OogenPackage.OO_IF__ELSE_STATEMENTS:
				getElseStatements().clear();
				getElseStatements().addAll((Collection<? extends OOStatement>)newValue);
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
			case OogenPackage.OO_IF__ELSE_IFS:
				getElseIfs().clear();
				return;
			case OogenPackage.OO_IF__ELSE_STATEMENTS:
				getElseStatements().clear();
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
			case OogenPackage.OO_IF__ELSE_IFS:
				return elseIfs != null && !elseIfs.isEmpty();
			case OogenPackage.OO_IF__ELSE_STATEMENTS:
				return elseStatements != null && !elseStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OOIfImpl
