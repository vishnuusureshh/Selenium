package Testcases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Javatest {
	SoftAssert softassert=new SoftAssert();
	
	@Test(enabled=false)
	 
	public void testCase1() {

		System.out.println("This is the Test Case 1");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("This will execute beforeMethod");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("This will execute afterMethod");

	}
	@Test(priority=0)
	 
	public void testCase2Assert() {

		softassert.assertFalse(5<10);
		System.out.println("pass This is the Test Case 2");
		

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("This will execute before Class");

	}

	@AfterClass

	public void afterClass() {

		System.out.println("This will execute after Class");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("This will execute beforeTest");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("This will execute afterTest");

	}

	@BeforeSuite

	public void beforeSuite() {

		System.out.println("This will execute beforeSuite");

	}

	@AfterSuite

	public void afterSuite() {

		System.out.println("This will execute afterSuite");

	}
}



/*@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@Aftersuite*/