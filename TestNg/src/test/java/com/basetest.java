package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class basetest {

 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bm");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("am");
  }

  @BeforeClass(groups= {"unit"})
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("read property file");
  }

  @BeforeTest(groups= {"smoke"})
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
