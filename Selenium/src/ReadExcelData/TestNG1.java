package ReadExcelData;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNG1 {
/*	WebDriver driver;
  @Test
  public void f() {
	  try{
	    driver.findElement(By.id("userid")).sendKeys("u44728");
		driver.findElement(By.id("pwd")).sendKeys("b@b@1993121");
		driver.findElement(By.name("Submit")).click();
  }
	  
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
  @BeforeMethod
  public void beforeMethod() throws Exception  {
	  try {
	  System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
		
	driver=new ChromeDriver();
	driver.get("https://orion.ust-global.com");
	Thread.sleep(1000);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.id("pthdr2logout")).click();
  }
*/
	
	@Test
	public void one()
	{
	  System.out.println("one value is printed");	
	}
	
	@Test
	public void two()
	{
	  System.out.println("two value is printed");	
	}
	@Test
	public void three()
	{
	  System.out.println("third value is printed");	
	}
	@Test
	public void nine()
	{
	  
	  String s="sel";
	  Assert.assertEquals("sel",s);
	  System.out.println(s);	
	}
	
	@Test(priority=0,enabled=false)
	public void five()
	{
	  System.out.println("five value is printed");	
	}
	
}
