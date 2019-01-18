package ReadExcelData;

	

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
    import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

   

	public class Practice {
		public static void main(String[] args){
		/*	try{
				System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.beyondtrust.com/");
			Select oselect=new Select(driver.findElement(By.id("lang-change")));
			oselect.selectByIndex(1);
			System.out.println("espanol");
			oselect.deselectByVisibleText("English");
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}*/
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Sravya\\New Jar\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://myaccountqa.hrblock.net/mytax/");
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            WebElement submitbtn=driver.findElement(By.id("defaultSignInUser"));
           
            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');", submitbtn);
            
            
}
}