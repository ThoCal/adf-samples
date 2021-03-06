/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import test.model.common.DeptView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 01 14:16:17 CEST 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeptViewClient extends ViewUsageImpl implements DeptView {
    /**
     * This is the default constructor (do not remove).
     */
    public DeptViewClient() {
    }

    public long getLastRequery() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"getLastRequery",null,null);
        return ((Long)_ret).longValue();
    }
}
