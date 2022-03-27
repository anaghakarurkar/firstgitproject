package com.baseclass;

import org.testng.annotations.Test;
import com.utility.Log;



import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
  @Test
  public void TestCase1() {
	 Log.startTestCase("TestCase1");
	 Log.info("This is TestCase1");
	 Log.endTestCase("TestCase1");
  }
 
  @Test
  public void TestCase2() {
	  Log.startTestCase("TestCase2");
		 Log.warn("This is TestCase2");
		 Log.endTestCase("TestCase2");
  }

  @Test
  public void TestCase3() {
	  Log.startTestCase("TestCase3");
		 Log.error("This is TestCase3");
		 Log.endTestCase("TestCase3");
  }
  @BeforeSuite
  public void beforeSuite() {
	  DOMConfigurator.configure("src/test/resources/log4j.xml");
	  Log.info("This is beforeSuite Method");
  }

  @AfterSuite
  public void afterSuite() {
	  Log.info("This is afterSuite Method");
  }

}
