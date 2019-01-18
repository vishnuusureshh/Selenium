package ReadExcelData;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookFlight {
	
	public static WebDriver driver;
	
	public static void openURL() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\New Jar\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		}
			
public static void flight(String date) {
		try{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("hp-widget__sfrom")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai, India");
		driver.findElement(By.id("hp-widget__sTo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore, India");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).click();
	 		    		   		    	
	   	WebElement searchBtn=driver.findElement(By.id("searchBtn"));
	      searchBtn.click();
	      
	 	}
	 	catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	    System.out.println("search is clicked");
	   		    				
	}
	
public static void login()
{
	try{
	driver.findElement(By.id("toggleAcc")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("sony1231@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='password_text']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Testing@1");
	driver.findElement(By.id("login_btn")).click();
	//*[@id="password_text"]
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public static void flight2()
{
driver.findElement(By.xpath("//*[@id='content']/div/div[6]/div[5]/div[2]/div[5]/div/div[2]/div[7]/p/a")).click();	
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,1000)");
driver.findElement(By.id("continueToReview")).click();
driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[4]/div[1]/div/div[1]/div/div/div/div/p[1]/span[2]/input")).sendKeys("Sony");

driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[4]/div[1]/div/div[1]/div/div/div/div/p[1]/span[3]/input")).sendKeys("kate");

driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[4]/div[1]/div/div[1]/div/div/div/div/p[3]/span[2]/a[2]")).click();
//driver.findElement(By.xpath("//*[@id='content']/div[2]/div[5]/div[1]/div[1]/div[6]/div[2]/div/input")).sendKeys(arg0);
driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[4]/div[1]/div/div[3]/p[2]/span[3]/input")).sendKeys("9848781944");
driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[4]/div[1]/div/div[3]/div[10]/p/a")).click();
System.out.println("Flight ticket is booked successfully");
}
	
	
	public static void main(String[] args) {
	
		openURL();
		flight("31");
		login();
		flight2();
		
		

	}

}
//sony1231@gmail.com//Testing@1//
//Tony0001@gmail.com//Testing@1
//binu0007@gmail.com//Testing@1
//lata1000@gmail.com/Testing@1
//titu9999@gmail.com//Testing@1

