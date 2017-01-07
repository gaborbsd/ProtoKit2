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
 * An implementation of the model object '<em><b>OO For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOForEachImpl#getTraversedVariable <em>Traversed Variable</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOForEachImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOForEachImpl#getBodyStatements <em>Body Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOForEachImpl extends OOStatementImpl implements OOForEach {
	/**
	 * The cached value of the '{@link #getTraversedVariable() <em>Traversed Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversedVariable()
	 * @generated
	 * @ordered
	 */
	protected OOVariable traversedVariable;

	/**
	 * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected OOVariable loopVariable;

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
	protected OOForEachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_FOR_EACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVariable getTraversedVariable() {
		if (traversedVariable != null && traversedVariable.eIsProxy()) {
			InternalEObject oldTraversedVariable = (InternalEObject)traversedVariable;
			traversedVariable = (OOVariable)eResolveProxy(oldTraversedVariable);
			if (traversedVariable != oldTraversedVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_FOR_EACH__TRAVERSED_VARIABLE, oldTraversedVariable, traversedVariable));
			}
		}
		return traversedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVariable basicGetTraversedVariable() {
		return traversedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraversedVariable(OOVariable newTraversedVariable) {
		OOVariable oldTraversedVariable = traversedVariable;
		traversedVariable = newTraversedVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FOR_EACH__TRAVERSED_VARIABLE, oldTraversedVariable, traversedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVariable getLoopVariable() {
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopVariable(OOVariable newLoopVariable, NotificationChain msgs) {
		OOVariable oldLoopVariable = loopVariable;
		loopVariable = newLoopVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FOR_EACH__LOOP_VARIABLE, oldLoopVariable, newLoopVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopVariable(OOVariable newLoopVariable) {
		if (newLoopVariable != loopVariable) {
			NotificationChain msgs = null;
			if (loopVariable != null)
				msgs = ((InternalEObject)loopVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_FOR_EACH__LOOP_VARIABLE, null, msgs);
			if (newLoopVariable != null)
				msgs = ((InternalEObject)newLoopVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_FOR_EACH__LOOP_VARIABLE, null, msgs);
			msgs = basicSetLoopVariable(newLoopVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FOR_EACH__LOOP_VARIABLE, newLoopVariable, newLoopVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOStatement> getBodyStatements() {
		if (bodyStatements == null) {
			bodyStatements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_FOR_EACH__BODY_STATEMENTS);
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
			case OogenPackage.OO_FOR_EACH__LOOP_VARIABLE:
				return basicSetLoopVariable(null, msgs);
			case OogenPackage.OO_FOR_EACH__BODY_STATEMENTS:
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
			case OogenPackage.OO_FOR_EACH__TRAVERSED_VARIABLE:
				if (resolve) return getTraversedVariable();
				return basicGetTraversedVariable();
			case OogenPackage.OO_FOR_EACH__LOOP_VARIABLE:
				return getLoopVariable();
			case OogenPackage.OO_FOR_EACH__BODY_STATEMENTS:
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
			case OogenPackage.OO_FOR_EACH__TRAVERSED_VARIABLE:
				setTraversedVariable((OOVariable)newValue);
				return;
			case OogenPackage.OO_FOR_EACH__LOOP_VARIABLE:
				setLoopVariable((OOVariable)newValue);
				return;
			case OogenPackage.OO_FOR_EACH__BODY_STATEMENTS:
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
			case OogenPackage.OO_FOR_EACH__TRAVERSED_VARIABLE:
				setTraversedVariable((OOVariable)null);
				return;
			case OogenPackage.OO_FOR_EACH__LOOP_VARIABLE:
				setLoopVariable((OOVariable)null);
				return;
			case OogenPackage.OO_FOR_EACH__BODY_STATEMENTS:
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
			case OogenPackage.OO_FOR_EACH__TRAVERSED_VARIABLE:
				return traversedVariable != null;
			case OogenPackage.OO_FOR_EACH__LOOP_VARIABLE:
				return loopVariable != null;
			case OogenPackage.OO_FOR_EACH__BODY_STATEMENTS:
				return bodyStatements != null && !bodyStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OOForEachImpl
