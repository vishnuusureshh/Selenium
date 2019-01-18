package ReadExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EscapeCharacters {
	 
	
		WebDriver driver; 
		@BeforeTest	
		
		public void brftest() throws Exception{
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
			driver.get("https://orion.ust-global.com");
		//	System.out.println(driver.getCurrentUrl());
			
			
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
      @Test
	  public void login() {
			try {
				String actualTitle=driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals("UST Global | Orion HR Enterprise Sign-in", actualTitle);
			//	System.out.println(driver.getTitle());
			/*driver.findElement(By.id("userid")).sendKeys(username);
				driver.findElement(By.id("pwd")).sendKeys(password);
				driver.findElement(By.name("Submit")).click();*/
				
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

