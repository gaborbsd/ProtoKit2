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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOMethodImpl#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOMethodImpl extends MinimalEObjectImpl.Container implements OOMethod {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<OOVariable> parameters;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected OOType returnType;

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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final OOVisibility VISIBILITY_EDEFAULT = OOVisibility.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected OOVisibility visibility = VISIBILITY_EDEFAULT;

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
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<OOLanguage> languages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_METHOD__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOLanguage> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeEList<OOLanguage>(OOLanguage.class, this, OogenPackage.OO_METHOD__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOVariable> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<OOVariable>(OOVariable.class, this, OogenPackage.OO_METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(OOType newReturnType, NotificationChain msgs) {
		OOType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OogenPackage.OO_METHOD__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(OOType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_METHOD__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_METHOD__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_METHOD__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_METHOD__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(OOVisibility newVisibility) {
		OOVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_METHOD__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_METHOD__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case OogenPackage.OO_METHOD__STATEMENTS:
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
			case OogenPackage.OO_METHOD__PARAMETERS:
				return getParameters();
			case OogenPackage.OO_METHOD__RETURN_TYPE:
				return getReturnType();
			case OogenPackage.OO_METHOD__STATEMENTS:
				return getStatements();
			case OogenPackage.OO_METHOD__VISIBILITY:
				return getVisibility();
			case OogenPackage.OO_METHOD__NAME:
				return getName();
			case OogenPackage.OO_METHOD__STATIC:
				return isStatic();
			case OogenPackage.OO_METHOD__LANGUAGES:
				return getLanguages();
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
			case OogenPackage.OO_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends OOVariable>)newValue);
				return;
			case OogenPackage.OO_METHOD__RETURN_TYPE:
				setReturnType((OOType)newValue);
				return;
			case OogenPackage.OO_METHOD__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends OOStatement>)newValue);
				return;
			case OogenPackage.OO_METHOD__VISIBILITY:
				setVisibility((OOVisibility)newValue);
				return;
			case OogenPackage.OO_METHOD__NAME:
				setName((String)newValue);
				return;
			case OogenPackage.OO_METHOD__STATIC:
				setStatic((Boolean)newValue);
				return;
			case OogenPackage.OO_METHOD__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends OOLanguage>)newValue);
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
			case OogenPackage.OO_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case OogenPackage.OO_METHOD__RETURN_TYPE:
				setReturnType((OOType)null);
				return;
			case OogenPackage.OO_METHOD__STATEMENTS:
				getStatements().clear();
				return;
			case OogenPackage.OO_METHOD__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case OogenPackage.OO_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OogenPackage.OO_METHOD__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case OogenPackage.OO_METHOD__LANGUAGES:
				getLanguages().clear();
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
			case OogenPackage.OO_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case OogenPackage.OO_METHOD__RETURN_TYPE:
				return returnType != null;
			case OogenPackage.OO_METHOD__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case OogenPackage.OO_METHOD__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case OogenPackage.OO_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OogenPackage.OO_METHOD__STATIC:
				return static_ != STATIC_EDEFAULT;
			case OogenPackage.OO_METHOD__LANGUAGES:
				return languages != null && !languages.isEmpty();
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", name: ");
		result.append(name);
		result.append(", static: ");
		result.append(static_);
		result.append(", languages: ");
		result.append(languages);
		result.append(')');
		return result.toString();
	}

} //OOMethodImpl
