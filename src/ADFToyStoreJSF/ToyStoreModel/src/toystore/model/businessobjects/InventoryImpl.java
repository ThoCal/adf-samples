/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/InventoryImpl.java,v 1.1.1.1 2006/01/26 21:47:20 steve Exp $
package toystore.model.businessobjects;
// ---------------------------------------------------------------
// ---    File generated by Oracle Business Components for Java.
// ---------------------------------------------------------------
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import toystore.fwk.model.businessobjects.ToyStoreEntityImpl;
public class InventoryImpl extends ToyStoreEntityImpl {
  public static final int ITEMID = 0;
  public static final int QTY = 1;
  public static final int ITEM = 2;


  private static EntityDefImpl mDefinitionObject;

  /**
   * This is the default constructor (do not remove)
   */
  public InventoryImpl() {
  }

  /**
   * 
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("toystore.model.businessobjects.Inventory");
    }
    return mDefinitionObject;
  }


  /**
   * Gets the attribute value for Itemid, using the alias name Itemid
   */
  public String getItemid() {
    return (String) getAttributeInternal(ITEMID);
  }
  /**
   * Sets <code>value</code> as the attribute value for Itemid
   */
  public void setItemid(String value) {
    setAttributeInternal(ITEMID, value);
  }
  /**
   * Gets the attribute value for Qty, using the alias name Qty
   */
  public Number getQty() {
    return (Number) getAttributeInternal(QTY);
  }
  /**
   * Sets <code>value</code> as the attribute value for Qty
   */
  public void setQty(Number value) {
    setAttributeInternal(QTY, value);
  }
  /**
   * Gets the associated entity ItemImpl
   */
  public ItemImpl getItem() {
    return (ItemImpl) getAttributeInternal(ITEM);
  }
  /**
   * Sets <code>value</code> as the associated entity ItemImpl
   */
  public void setItem(ItemImpl value) {
    setAttributeInternal(ITEM, value);
  }
  //  Generated method. Do not modify.
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef)
    throws Exception {
    switch (index)
      {
      case ITEMID:
        return getItemid();
      case QTY:
        return getQty();
      case ITEM:
        return getItem();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.
  protected void setAttrInvokeAccessor(int index, Object value,
    AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ITEMID:
        setItemid((String)value);
        return;
      case QTY:
        setQty((Number)value);
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
  public static Key createPrimaryKey(String itemid)
  {
    return new Key(new Object[] {itemid});
  }


}