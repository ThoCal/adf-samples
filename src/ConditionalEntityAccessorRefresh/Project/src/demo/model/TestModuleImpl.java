/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewLinkImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /**
   * 
   *  Container's getter for DeptView1
   */
  public ViewObjectImpl getDeptView1() {
    return (ViewObjectImpl)findViewObject("DeptView1");
  }

  /**
   * 
   *  Container's getter for EmpView1
   */
  public ViewObjectImpl getEmpView1() {
    return (ViewObjectImpl)findViewObject("EmpView1");
  }

  /**
   * 
   *  Container's getter for EmpView2
   */
  public ViewObjectImpl getEmpView2() {
    return (ViewObjectImpl)findViewObject("EmpView2");
  }

  /**
   * 
   *  Container's getter for WorksInDeptLink1
   */
  public ViewLinkImpl getWorksInDeptLink1() {
    return (ViewLinkImpl)findViewLink("WorksInDeptLink1");
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("demo.model", "TestModuleLocal");
  }
}
