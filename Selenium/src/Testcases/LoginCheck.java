package Testcases;

import org.testng.annotations.Test;

import Actions.Dashboard;
import Actions.Login;
import Actions.SignOut;
import Utility.BrowserOperations;
import Utility.Constantclass;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;

public class LoginCheck {
  @Test
  public void mainMethod() throws Exception {
	  Login.run_login();
	  Dashboard.run_Dashboard();
	  SignOut.run_SignOut();
	//  Login.
	    
  }
  @BeforeTest
  public void beforeTest() {
	  BrowserOperations.LaunchApplication("chrome");
  }

  @AfterTest
  public void afterTest() throws Exception {
	 
	
	//  Constantclass.driver.quit();
  }

}
