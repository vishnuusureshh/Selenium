package ReadExcelData;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Datehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
			
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(options); 
			
			driver.get("https://www.makemytrip.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.id("hp-widget__sfrom"));//Enter ID for the element. You can use Name, xpath, cssSelector whatever you like
			element.click();
			element.sendKeys(Keys.TAB);
			
			WebElement ele = driver.findElement(By.id("hp-widget__sTo"));
			ele.sendKeys("Mumbai, India");
			ele.sendKeys(Keys.TAB);
			
			WebElement ele1 = driver.findElement(By.id("hp-widget__depart"));
			//element.sendKeys(Keys.ENTER);
			ele1.sendKeys(Keys.TAB);
			
			driver.findElement(By.id("searchBtn")).click();
			driver.findElement(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div[5]/div[2]/div[2]/div[7]/p/a")).click();
       			
			
			
			WebElement name=driver.findElement(By.className("upsell_radio_icon insure_radio_icon"));
					name.click();   
            WebElement radio=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div[1]/div[1]/div[4]/div[2]/div/input"));
	        radio.sendKeys("abc@gmail.com");
	        		       
	        driver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div[1]/div[1]/div[6]/div[1]/a")).click();
	        		    
	      
			
}
	
}