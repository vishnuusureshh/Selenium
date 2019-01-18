package ReadExcelData;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestNG {
	
	
	
	@DataProvider(name = "Authentication")
	public static Object[][] login(){
		//Object[][] arrayObject = getExcelData("D:\\Sravya KT Documents\\Book1.xlsx", "Sheet1");
		return new Object[][]{{"u44728", "b@b@199332" }, {"u44729", "b@b@" }, {"u44102", "new"}};
	
	}
	
	@Test(dataProvider="Authentication")
  public void loginCredentials(String username, String password) {
		try {
			WebDriver driver; 
			System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\New Jar\\chromedriver.exe");
			driver=new ChromeDriver();
	    	driver.get("https://orion.ust-global.com");
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(username);
			driver.findElement(By.id("pwd")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			//driver.quit();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception"
			System.out.println(e);
		}
  }
	
	
	
}
