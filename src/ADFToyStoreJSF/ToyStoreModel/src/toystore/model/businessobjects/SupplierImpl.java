/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/SupplierImpl.java,v 1.1.1.1 2006/01/26 21:47:21 steve Exp $
package toystore.model.businessobjects;
// ---------------------------------------------------------------
// ---    File generated by Oracle Business Components for Java.
// ---------------------------------------------------------------
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import toystore.fwk.model.businessobjects.ToyStoreEntityImpl;
public class SupplierImpl extends ToyStoreEntityImpl {
  public static final int SUPPID = 0;
  public static final int NAME = 1;
  public static final int STATUS = 2;
  public static final int ADDR1 = 3;
  public static final int ADDR2 = 4;
  public static final int CITY = 5;
  public static final int STATE = 6;
  public static final int ZIP = 7;
  public static final int PHONE = 8;
  public static final int ITEM = 9;
  private static EntityDefImpl mDefinitionObject;

  /**
   * This is the default constructor (do not remove)
   */
  public SupplierImpl() {
  }

  /**
   *
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    if (mDefinitionObject == null) {
      mDefinitionObject = (EntityDefImpl) EntityDefImpl.findDefObject(
          "toystore.model.businessobjects.Supplier");
    }
    return mDefinitionObject;
  }
  /**
   * Gets the attribute value for Suppid, using the alias name Suppid
   */
  public Number getSuppid() {
    return (Number) getAttributeInternal(SUPPID);
  }
  /**
   * Sets <code>value</code> as the attribute value for Suppid
   */
  public void setSuppid(Number value) {
    setAttributeInternal(SUPPID, value);
  }
  /**
   * Gets the attribute value for Name, using the alias name Name
   */
  public String getName() {
    return (String) getAttributeInternal(NAME);
  }
  /**
   * Sets <code>value</code> as the attribute value for Name
   */
  public void setName(String value) {
    setAttributeInternal(NAME, value);
  }
  /**
   * Gets the attribute value for Status, using the alias name Status
   */
  public String getStatus() {
    return (String) getAttributeInternal(STATUS);
  }
  /**
   * Sets <code>value</code> as the attribute value for Status
   */
  public void setStatus(String value) {
    setAttributeInternal(STATUS, value);
  }
  /**
   * Gets the attribute value for Addr1, using the alias name Addr1
   */
  public String getAddr1() {
    return (String) getAttributeInternal(ADDR1);
  }
  /**
   * Sets <code>value</code> as the attribute value for Addr1
   */
  public void setAddr1(String value) {
    setAttributeInternal(ADDR1, value);
  }
  /**
   * Gets the attribute value for Addr2, using the alias name Addr2
   */
  public String getAddr2() {
    return (String) getAttributeInternal(ADDR2);
  }
  /**
   * Sets <code>value</code> as the attribute value for Addr2
   */
  public void setAddr2(String value) {
    setAttributeInternal(ADDR2, value);
  }
  /**
   * Gets the attribute value for City, using the alias name City
   */
  public String getCity() {
    return (String) getAttributeInternal(CITY);
  }
  /**
   * Sets <code>value</code> as the attribute value for City
   */
  public void setCity(String value) {
    setAttributeInternal(CITY, value);
  }
  /**
   * Gets the attribute value for State, using the alias name State
   */
  public String getState() {
    return (String) getAttributeInternal(STATE);
  }
  /**
   * Sets <code>value</code> as the attribute value for State
   */
  public void setState(String value) {
    setAttributeInternal(STATE, value);
  }
  /**
   * Gets the attribute value for Zip, using the alias name Zip
   */
  public String getZip() {
    return (String) getAttributeInternal(ZIP);
  }
  /**
   * Sets <code>value</code> as the attribute value for Zip
   */
  public void setZip(String value) {
    setAttributeInternal(ZIP, value);
  }
  /**
   * Gets the attribute value for Phone, using the alias name Phone
   */
  public String getPhone() {
    return (String) getAttributeInternal(PHONE);
  }
  /**
   * Sets <code>value</code> as the attribute value for Phone
   */
  public void setPhone(String value) {
    setAttributeInternal(PHONE, value);
  }
  /**
   * Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getItem() {
    return (RowIterator) getAttributeInternal(ITEM);
  }
  //  Generated method. Do not modify.
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef)
    throws Exception {
    switch (index) {
    case SUPPID:
      return getSuppid();
    case NAME:
      return getName();
    case STATUS:
      return getStatus();
    case ADDR1:
      return getAddr1();
    case ADDR2:
      return getAddr2();
    case CITY:
      return getCity();
    case STATE:
      return getState();
    case ZIP:
      return getZip();
    case PHONE:
      return getPhone();
    case ITEM:
      return getItem();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }
  //  Generated method. Do not modify.
  protected void setAttrInvokeAccessor(int index, Object value,
    AttributeDefImpl attrDef) throws Exception {
    switch (index) {
    case SUPPID:
      setSuppid((Number) value);
      return;
    case NAME:
      setName((String) value);
      return;
    case STATUS:
      setStatus((String) value);
      return;
    case ADDR1:
      setAddr1((String) value);
      return;
    case ADDR2:
      setAddr2((String) value);
      return;
    case CITY:
      setCity((String) value);
      return;
    case STATE:
      setState((String) value);
      return;
    case ZIP:
      setZip((String) value);
      return;
    case PHONE:
      setPhone((String) value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }
  /**
   *
   *  Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number suppid) {
    return new Key(new Object[] { suppid });
  }
}
