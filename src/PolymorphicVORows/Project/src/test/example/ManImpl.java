/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.example;

import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.Key;

import test.fwkext.CustomEntityDefImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class ManImpl extends PersonImpl {
    public static final int MAXATTRCONST = EntityDefImpl.getMaxAttrConst("test.example.Person");
    public static final int MANATTR = MAXATTRCONST;


    private static CustomEntityDefImpl mDefinitionObject;

    /**
     * 
     *  This is the default constructor (do not remove)
     */
  public ManImpl() {
  }


    //  Generated method. Do not modify.

    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = 
                    (CustomEntityDefImpl)EntityDefImpl.findDefObject("test.example.Man");
        }
        return mDefinitionObject;
    }

    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if (index == SEX) {
            return getSex();
        }
        if (index == MANATTR) {
            return getManAttr();
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if (index == SEX) {
            setSex((String)value);
            return;
        }
        if (index == MANATTR) {
            setManAttr((String)value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
    }



  /**
   * 
   *  Gets the attribute value for Sex, using the alias name Sex
   */
  public String getSex() {
    return super.getSex();
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Sex
   */
  public void setSex(String value) {
    super.setSex(value);
  }



  /**
   * 
   *  Gets the attribute value for ManAttr, using the alias name ManAttr
   */
  public String getManAttr() {
    return (String)getAttributeInternal(MANATTR);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for ManAttr
   */
  public void setManAttr(String value) {
    setAttributeInternal(MANATTR, value);
  }


    public void doPersonThing() {
    System.out.println("ManImpl: doPersonThing");
  }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }
}