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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#isKeep <em>Keep</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#isNestedClass <em>Nested Class</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getOoclass <em>Ooclass</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOClassImpl#getOocompare <em>Oocompare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOClassImpl extends MinimalEObjectImpl.Container implements OOClass {
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<OOMember> members;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<OOMethod> methods;

	/**
	 * The default value of the '{@link #isKeep() <em>Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeep()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEEP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeep() <em>Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeep()
	 * @generated
	 * @ordered
	 */
	protected boolean keep = KEEP_EDEFAULT;

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
	 * The default value of the '{@link #isNestedClass() <em>Nested Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNestedClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NESTED_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNestedClass() <em>Nested Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNestedClass()
	 * @generated
	 * @ordered
	 */
	protected boolean nestedClass = NESTED_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOoclass() <em>Ooclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOoclass()
	 * @generated
	 * @ordered
	 */
	protected EList<OOClass> ooclass;

	/**
	 * The cached value of the '{@link #getOocompare() <em>Oocompare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOocompare()
	 * @generated
	 * @ordered
	 */
	protected EList<OOCompare> oocompare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OogenPackage.Literals.OO_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<OOMember>(OOMember.class, this, OogenPackage.OO_CLASS__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPackage getPackage() {
		if (eContainerFeatureID() != OogenPackage.OO_CLASS__PACKAGE) return null;
		return (OOPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(OOPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, OogenPackage.OO_CLASS__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(OOPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != OogenPackage.OO_CLASS__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, OogenPackage.OO_PACKAGE__CLASSES, OOPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CLASS__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<OOMethod>(OOMethod.class, this, OogenPackage.OO_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeep() {
		return keep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeep(boolean newKeep) {
		boolean oldKeep = keep;
		keep = newKeep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CLASS__KEEP, oldKeep, keep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOLanguage> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeEList<OOLanguage>(OOLanguage.class, this, OogenPackage.OO_CLASS__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNestedClass() {
		return nestedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedClass(boolean newNestedClass) {
		boolean oldNestedClass = nestedClass;
		nestedClass = newNestedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CLASS__NESTED_CLASS, oldNestedClass, nestedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOClass> getOoclass() {
		if (ooclass == null) {
			ooclass = new EObjectContainmentEList<OOClass>(OOClass.class, this, OogenPackage.OO_CLASS__OOCLASS);
		}
		return ooclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOCompare> getOocompare() {
		if (oocompare == null) {
			oocompare = new EObjectContainmentEList<OOCompare>(OOCompare.class, this, OogenPackage.OO_CLASS__OOCOMPARE);
		}
		return oocompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_CLASS__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((OOPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OogenPackage.OO_CLASS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_CLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case OogenPackage.OO_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_CLASS__OOCLASS:
				return ((InternalEList<?>)getOoclass()).basicRemove(otherEnd, msgs);
			case OogenPackage.OO_CLASS__OOCOMPARE:
				return ((InternalEList<?>)getOocompare()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OogenPackage.OO_CLASS__PACKAGE:
				return eInternalContainer().eInverseRemove(this, OogenPackage.OO_PACKAGE__CLASSES, OOPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OogenPackage.OO_CLASS__NAME:
				return getName();
			case OogenPackage.OO_CLASS__MEMBERS:
				return getMembers();
			case OogenPackage.OO_CLASS__PACKAGE:
				return getPackage();
			case OogenPackage.OO_CLASS__METHODS:
				return getMethods();
			case OogenPackage.OO_CLASS__KEEP:
				return isKeep();
			case OogenPackage.OO_CLASS__LANGUAGES:
				return getLanguages();
			case OogenPackage.OO_CLASS__NESTED_CLASS:
				return isNestedClass();
			case OogenPackage.OO_CLASS__OOCLASS:
				return getOoclass();
			case OogenPackage.OO_CLASS__OOCOMPARE:
				return getOocompare();
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
			case OogenPackage.OO_CLASS__NAME:
				setName((String)newValue);
				return;
			case OogenPackage.OO_CLASS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends OOMember>)newValue);
				return;
			case OogenPackage.OO_CLASS__PACKAGE:
				setPackage((OOPackage)newValue);
				return;
			case OogenPackage.OO_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends OOMethod>)newValue);
				return;
			case OogenPackage.OO_CLASS__KEEP:
				setKeep((Boolean)newValue);
				return;
			case OogenPackage.OO_CLASS__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends OOLanguage>)newValue);
				return;
			case OogenPackage.OO_CLASS__NESTED_CLASS:
				setNestedClass((Boolean)newValue);
				return;
			case OogenPackage.OO_CLASS__OOCLASS:
				getOoclass().clear();
				getOoclass().addAll((Collection<? extends OOClass>)newValue);
				return;
			case OogenPackage.OO_CLASS__OOCOMPARE:
				getOocompare().clear();
				getOocompare().addAll((Collection<? extends OOCompare>)newValue);
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
			case OogenPackage.OO_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OogenPackage.OO_CLASS__MEMBERS:
				getMembers().clear();
				return;
			case OogenPackage.OO_CLASS__PACKAGE:
				setPackage((OOPackage)null);
				return;
			case OogenPackage.OO_CLASS__METHODS:
				getMethods().clear();
				return;
			case OogenPackage.OO_CLASS__KEEP:
				setKeep(KEEP_EDEFAULT);
				return;
			case OogenPackage.OO_CLASS__LANGUAGES:
				getLanguages().clear();
				return;
			case OogenPackage.OO_CLASS__NESTED_CLASS:
				setNestedClass(NESTED_CLASS_EDEFAULT);
				return;
			case OogenPackage.OO_CLASS__OOCLASS:
				getOoclass().clear();
				return;
			case OogenPackage.OO_CLASS__OOCOMPARE:
				getOocompare().clear();
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
			case OogenPackage.OO_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OogenPackage.OO_CLASS__MEMBERS:
				return members != null && !members.isEmpty();
			case OogenPackage.OO_CLASS__PACKAGE:
				return getPackage() != null;
			case OogenPackage.OO_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case OogenPackage.OO_CLASS__KEEP:
				return keep != KEEP_EDEFAULT;
			case OogenPackage.OO_CLASS__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case OogenPackage.OO_CLASS__NESTED_CLASS:
				return nestedClass != NESTED_CLASS_EDEFAULT;
			case OogenPackage.OO_CLASS__OOCLASS:
				return ooclass != null && !ooclass.isEmpty();
			case OogenPackage.OO_CLASS__OOCOMPARE:
				return oocompare != null && !oocompare.isEmpty();
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
		result.append(", keep: ");
		result.append(keep);
		result.append(", languages: ");
		result.append(languages);
		result.append(", nestedClass: ");
		result.append(nestedClass);
		result.append(')');
		return result.toString();
	}

} //OOClassImpl
