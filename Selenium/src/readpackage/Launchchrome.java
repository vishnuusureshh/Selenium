package readpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launchchrome {
	public static void  main(String args[])
	{	
	System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32(new)\\chromedriver.exe");
			
	// Initialize browser
	WebDriver driver=new ChromeDriver();
			 
	driver.get("https://myaccountqa.hrblock.net/mytax/");
	String url = "https://myaccountqa.hrblock.net/mytax/";
	driver.get(url);
	String actualUrl = driver.getCurrentUrl();
	
	if (actualUrl.equals(url)){
		System.out.println("Verification Successfull - The correct Url is opened.");
	}else{
		System.out.println("Verification Failed - An incorrect Url is opened.");
		System.out.println("Actual URL is : " + actualUrl);
		System.out.println("Expected URL is : " + url);
	}
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Click here")));
	WebElement element = driver.findElement(By.linkText("Click here"));
	element.click();
	WebElement obj = driver.findElement(By.name("button"));
	obj.click();
	WebElement obj1 = driver.findElement(By.id("createID"));
	obj1.click();
	driver.findElement(By.id("email")).sendKeys("nithya.muniraju@ust-global.com");
	driver.findElement(By.id("userName")).sendKeys("nmqa272017");
	driver.findElement(By.id("password")).sendKeys("Testing@1");
	driver.findElement(By.id("confirmpassword")).sendKeys("Testing@1");
	WebElement obj2 = driver.findElement(By.id("showhide"));
	obj2.click();
	Select oSelect = new Select(driver.findElement(By.id("securityQuestion1")));
	oSelect.selectByIndex(5);
	driver.findElement(By.id("securityAnswer1")).sendKeys("apple");
	Select o1Select = new Select(driver.findElement(By.id("securityQuestion2")));
	o1Select.selectByIndex(1);
	driver.findElement(By.id("securityAnswer2")).sendKeys("bat");
	Select o2Select = new Select(driver.findElement(By.id("securityQuestion3")));
	o2Select.selectByIndex(2);
	driver.findElement(By.id("securityAnswer3")).sendKeys("car");
	WebElement radioBtn = driver.findElement(By.id("termsbox"));
    radioBtn.click();
    WebElement obj6 = driver.findElement(By.id("submitButton"));
	obj6.click();
	 //element1.wait();
     //driver.findElement(By.linkText("Click here")).click();

/*	WebElement element = driver.findElement(By.id("username"));
	boolean status = element.isDisplayed();
	if (status == true)
	{
		System.out.println("The element exists");
	
	}
	else
	{
		System.out.println("The element does not exists");
	}
	WebElement obj = driver.findElement(By.id("createID"));
	obj.click(); */
	
		 
	}

}
