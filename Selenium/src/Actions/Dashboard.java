package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.Obj_HomePage;
import Utility.Constantclass;
import org.openqa.selenium.By;

public class Dashboard {
	
public static void run_Dashboard() throws Exception{
	Thread.sleep(10000);
	Obj_HomePage.dashboardLanding().isDisplayed();
	
		
	    } 

}