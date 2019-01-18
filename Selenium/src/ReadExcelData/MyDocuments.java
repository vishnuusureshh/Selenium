package ReadExcelData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyDocuments {

	public static void  main(String args[])
	{	
		try{
	System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (new)\\chromedriver.exe");
			
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://myaccountqa.hrblock.net/mytax/");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.id("createID")).click();
	//driver.findElement(By.id("email")).sendKeys("");
	//boolean txtEnabled=driver.findElement(By.id("email")).isDisplayed();
	driver.findElement(By.id("email")).sendKeys("sravya.venati@hrblock.com");
	driver.findElement(By.id("userName")).sendKeys("svqa92018");
	driver.findElement(By.id("password")).sendKeys("Testing@1");
	driver.findElement(By.id("confirmPassword")).sendKeys("Testing@1");
	driver.findElement(By.id("showhide")).click();
	Select oSelect=new Select(driver.findElement(By.id("securityQuestion1")));
	oSelect.selectByIndex(1);
	String last=driver.findElement(By.xpath("//*[@id='securityQuestion1_1']")).getText();
	System.out.println(last);
	String[] parts = last.split(" ");
	String lastWord = parts[parts.length - 1];
    driver.findElement(By.id("securityAnswer1")).sendKeys(lastWord);
//	driver.findElement(By.id("securityAnswer1")).sendKeys("born");
	Select o1Select=new Select(driver.findElement(By.id("securityQuestion2")));
	o1Select.selectByIndex(1);
	driver.findElement(By.id("securityAnswer2")).sendKeys("job");
	Select o2Select=new Select(driver.findElement(By.id("securityQuestion3")));
	o2Select.selectByIndex(1);
	driver.findElement(By.id("securityAnswer3")).sendKeys("child");
	driver.findElement(By.id("termsbox")).click();
	driver.findElement(By.id("submitButton")).click();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
