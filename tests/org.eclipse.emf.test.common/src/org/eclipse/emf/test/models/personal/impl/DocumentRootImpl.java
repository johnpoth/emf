/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.  This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.3 2007/02/20 17:42:40 emerks Exp $
 */
package org.eclipse.emf.test.models.personal.impl;

import commonj.sdo.Sequence;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.sdo.impl.EDataObjectImpl;

import org.eclipse.emf.ecore.sdo.util.BasicESequence;
import org.eclipse.emf.ecore.sdo.util.ESequence;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.test.models.personal.DocumentRoot;
import org.eclipse.emf.test.models.personal.LinkType;
import org.eclipse.emf.test.models.personal.NameType;
import org.eclipse.emf.test.models.personal.PersonType;
import org.eclipse.emf.test.models.personal.PersonnelType;
import org.eclipse.emf.test.models.personal.UrlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getPersonnel <em>Personnel</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.personal.impl.DocumentRootImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EDataObjectImpl implements DocumentRoot
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected ESequence mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_EDEFAULT = null;

  /**
   * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected static final String FAMILY_EDEFAULT = null;

  /**
   * The default value of the '{@link #getGiven() <em>Given</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGiven()
   * @generated
   * @ordered
   */
  protected static final String GIVEN_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PersonalPackageImpl.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence getMixed()
  {
    if (mixed == null)
    {
      mixed = new BasicESequence(new BasicFeatureMap(this, PersonalPackageImpl.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PersonalPackageImpl.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap.map();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PersonalPackageImpl.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation.map();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmail()
  {
    return (String)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__EMAIL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmail(String newEmail)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__EMAIL, newEmail);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFamily()
  {
    return (String)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__FAMILY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFamily(String newFamily)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__FAMILY, newFamily);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGiven()
  {
    return (String)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__GIVEN, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGiven(String newGiven)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__GIVEN, newGiven);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkType getLink()
  {
    return (LinkType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__LINK, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(PersonalPackageImpl.Literals.DOCUMENT_ROOT__LINK, newLink, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(LinkType newLink)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__LINK, newLink);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameType getName()
  {
    return (NameType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(NameType newName, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(PersonalPackageImpl.Literals.DOCUMENT_ROOT__NAME, newName, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(NameType newName)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonType getPerson()
  {
    return (PersonType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__PERSON, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPerson(PersonType newPerson, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(PersonalPackageImpl.Literals.DOCUMENT_ROOT__PERSON, newPerson, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerson(PersonType newPerson)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__PERSON, newPerson);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonnelType getPersonnel()
  {
    return (PersonnelType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__PERSONNEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersonnel(PersonnelType newPersonnel, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(PersonalPackageImpl.Literals.DOCUMENT_ROOT__PERSONNEL, newPersonnel, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonnel(PersonnelType newPersonnel)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__PERSONNEL, newPersonnel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlType getUrl()
  {
    return (UrlType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(PersonalPackageImpl.Literals.DOCUMENT_ROOT__URL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUrl(UrlType newUrl, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(PersonalPackageImpl.Literals.DOCUMENT_ROOT__URL, newUrl, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(UrlType newUrl)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(PersonalPackageImpl.Literals.DOCUMENT_ROOT__URL, newUrl);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PersonalPackageImpl.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).basicRemove(otherEnd, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).basicRemove(otherEnd, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__LINK:
        return basicSetLink(null, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__NAME:
        return basicSetName(null, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSON:
        return basicSetPerson(null, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSONNEL:
        return basicSetPersonnel(null, msgs);
      case PersonalPackageImpl.DOCUMENT_ROOT__URL:
        return basicSetUrl(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PersonalPackageImpl.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case PersonalPackageImpl.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return ((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap();
        else return getXMLNSPrefixMap();
      case PersonalPackageImpl.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return ((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap();
        else return getXSISchemaLocation();
      case PersonalPackageImpl.DOCUMENT_ROOT__EMAIL:
        return getEmail();
      case PersonalPackageImpl.DOCUMENT_ROOT__FAMILY:
        return getFamily();
      case PersonalPackageImpl.DOCUMENT_ROOT__GIVEN:
        return getGiven();
      case PersonalPackageImpl.DOCUMENT_ROOT__LINK:
        return getLink();
      case PersonalPackageImpl.DOCUMENT_ROOT__NAME:
        return getName();
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSON:
        return getPerson();
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSONNEL:
        return getPersonnel();
      case PersonalPackageImpl.DOCUMENT_ROOT__URL:
        return getUrl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersonalPackageImpl.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).set(newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).set(newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__EMAIL:
        setEmail((String)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__FAMILY:
        setFamily((String)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__GIVEN:
        setGiven((String)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__LINK:
        setLink((LinkType)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__NAME:
        setName((NameType)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSON:
        setPerson((PersonType)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSONNEL:
        setPersonnel((PersonnelType)newValue);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__URL:
        setUrl((UrlType)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PersonalPackageImpl.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__EMAIL:
        setEmail(EMAIL_EDEFAULT);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__FAMILY:
        setFamily(FAMILY_EDEFAULT);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__GIVEN:
        setGiven(GIVEN_EDEFAULT);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__LINK:
        setLink((LinkType)null);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__NAME:
        setName((NameType)null);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSON:
        setPerson((PersonType)null);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSONNEL:
        setPersonnel((PersonnelType)null);
        return;
      case PersonalPackageImpl.DOCUMENT_ROOT__URL:
        setUrl((UrlType)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PersonalPackageImpl.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case PersonalPackageImpl.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case PersonalPackageImpl.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case PersonalPackageImpl.DOCUMENT_ROOT__EMAIL:
        return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
      case PersonalPackageImpl.DOCUMENT_ROOT__FAMILY:
        return FAMILY_EDEFAULT == null ? getFamily() != null : !FAMILY_EDEFAULT.equals(getFamily());
      case PersonalPackageImpl.DOCUMENT_ROOT__GIVEN:
        return GIVEN_EDEFAULT == null ? getGiven() != null : !GIVEN_EDEFAULT.equals(getGiven());
      case PersonalPackageImpl.DOCUMENT_ROOT__LINK:
        return getLink() != null;
      case PersonalPackageImpl.DOCUMENT_ROOT__NAME:
        return getName() != null;
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSON:
        return getPerson() != null;
      case PersonalPackageImpl.DOCUMENT_ROOT__PERSONNEL:
        return getPersonnel() != null;
      case PersonalPackageImpl.DOCUMENT_ROOT__URL:
        return getUrl() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl