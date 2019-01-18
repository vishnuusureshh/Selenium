package Testcases;

import org.testng.annotations.Test;

import Actions.CreateAccountbutton;
import Utility.BrowserOperations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CreateCheck {
  @Test
  public void mainmethod() throws Exception{
	  
	  CreateAccountbutton.clickCreatebutton();
  
  }
  @BeforeTest
  public void beforeTest() {
	  BrowserOperations.LaunchApplication("chrome");
  }

  @AfterTest
  public void afterTest() {
  }

}
