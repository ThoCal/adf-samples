/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model;
import demo.model.common.TestModule;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TestModuleImpl extends ApplicationModuleImpl implements TestModule {
  /**This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("demo.model", /* package name */
      "TestModuleLocal" /* Configuration Name */);
  }
  
  public void doSomething() {
    System.out.println("#### DO SOMETHING CALLED ####");
  }

  /**Container's getter for DeptView
   */
  public ViewObjectImpl getDeptView() {
    return (ViewObjectImpl)findViewObject("DeptView");
  }
}