package ReadExcelData;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
 
	
	WebDriver driver; 
	@BeforeTest	
	
	public void brftest() throws Exception{
		try {
			System.setProperty("webdriver.chrome.driver",  "C:\\Sravya\\New Jar\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		driver.get("https://orion.ust-global.com");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	//@Test(dataProvider="Authentication",dataProviderClass=DataProvidertest.class)
  public void login(String username, String password) {
		try {
			driver.findElement(By.id("userid")).sendKeys(username);
			driver.findElement(By.id("pwd")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			
		} catch (Exception e) {
			// TODO: handle exception"
			System.out.println(e);
		}
  }
	
	
	@AfterTest
	public void aftrtest() throws Exception{
		try {
			//driver.quit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
