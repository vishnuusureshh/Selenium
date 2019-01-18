package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utility.Constantclass;

public class Obj_HomePage {
	private static WebElement object=null;
	public static WebElement dashboardLanding()throws Exception{
				object =  Constantclass.driver.findElement(By.xpath("//a[@id='taxlifeTopLi']"));
		System.out.println("In Home page");
		return object;
	    } 
	public static WebElement signoutFooterClick()throws Exception{
		
		object =  Constantclass.driver.findElement(By.xpath("//*[@id='sb-site']/div[3]/div/div/div[4]/ul/li[4]/a"));
		System.out.println("Sign Out page object");
		return object;
	    } 
	

}
//*[@id="taxlifeTopLi"]/span[1]