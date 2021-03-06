/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SettingsViewRowImpl extends ViewRowImpl {
    public static final int CODE = 0;
    public static final int STATUS = 1;
    public static final int STATUSASBOOLEAN = 2;
    public static final int ANOTHERBOOLEAN = 3;

    /**This is the default constructor (do not remove)
     */
  public SettingsViewRowImpl() {
  }

  /**Gets Settings entity object.
   */
  public EntityImpl getSettings() {
    return (EntityImpl)getEntity(0);
  }

  /**Gets the attribute value for CODE using the alias name Code
   */
  public String getCode() {
    return (String) getAttributeInternal(CODE);
  }

  /**Sets <code>value</code> as attribute value for CODE using the alias name Code
   */
  public void setCode(String value) {
    setAttributeInternal(CODE, value);
  }

  /**Gets the attribute value for STATUS using the alias name Status
   */
  public Number getStatus() {
    return (Number) getAttributeInternal(STATUS);
  }

  /**Sets <code>value</code> as attribute value for STATUS using the alias name Status
   */
  public void setStatus(Number value) {
    setAttributeInternal(STATUS, value);
  }


  private static Number ONE = new Number(1);
  private static Number ZERO = new Number(0);
  /**Gets the attribute value for the calculated attribute StatusAsBoolean
   */
  public Boolean getStatusAsBoolean() {
    return ONE.equals(getStatus());
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute StatusAsBoolean
   */
  public void setStatusAsBoolean(Boolean value) {
    setStatus(ONE.equals(value) ? ONE : ZERO);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case CODE:
            return getCode();
        case STATUS:
            return getStatus();
        case STATUSASBOOLEAN:
            return getStatusAsBoolean();
        case ANOTHERBOOLEAN:
            return getAnotherBoolean();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, 
                                       AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case CODE:
            setCode((String)value);
            return;
        case STATUS:
            setStatus((Number)value);
            return;
        case STATUSASBOOLEAN:
            setStatusAsBoolean((Boolean)value);
            return;
        case ANOTHERBOOLEAN:
            setAnotherBoolean((Boolean)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

    /**Gets the attribute value for the calculated attribute AnotherBoolean
     */
    public Boolean getAnotherBoolean() {
        return (Boolean) getAttributeInternal(ANOTHERBOOLEAN);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute AnotherBoolean
     */
    public void setAnotherBoolean(Boolean value) {
        setAttributeInternal(ANOTHERBOOLEAN, value);
    }
}
