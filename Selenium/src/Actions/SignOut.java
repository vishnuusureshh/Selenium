package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.Obj_HomePage;
import PageObjects.Obj_LoginPage;
import Utility.Constantclass;

public class SignOut {
	
	public static void run_SignOut() throws Exception{
		((JavascriptExecutor)Constantclass.driver).executeScript("scroll(0,1200)");
				Obj_HomePage.signoutFooterClick().click();
				
			
	}	
	public static void run_signoutMousehover() throws Exception{
		
	
		
		Actions builder=new Actions(Constantclass.driver);
		WebElement hoverElement;
	//	builder.moveToElement(hoverElement).perform();
		Obj_HomePage.signoutFooterClick().click();
		
}
	
}
