package ReadExcelData;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class objectdescription {
	
	public static WebDriver driver;
	public static WebElement txt_search = driver.findElement(By.id("hp-widget__sfrom")); 
	//public static URL navurl = driver.get("https://www.makemytrip.com/");
}
