package ReadExcelData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get("https://myaccountqa.hrblock.net/mytax/");
			Thread.sleep(5000);
			driver.findElement(By.id("username")).sendKeys("sviosqa62518");
			driver.findElement(By.id("password")).sendKeys("Testing@1");
			driver.findElement(By.id("defaultSignInUser")).click();
		//	driver.findElement(By.id("resendsignInCode")).click();
				
	String testString = driver.findElement(By.xpath("//*[@id='maindatacontent']/div[1]/fieldset/div[2]/dl/dd[1]/label")).getText();
	String[] parts = testString.split(" ");
	String lastWord = parts[parts.length - 1];
	String pts=lastWord.replace("?","");
	System.out.println("Lastword:"+pts); // "sentence"
	driver.findElement(By.id("securityAnswer")).sendKeys(pts);
	
	driver.findElement(By.id("defaultsecurityqn-next")).click();

	WebElement elem=driver.findElement(By.id("taxlifeTopLi"));
	Actions builder = new Actions(driver);
	builder.moveToElement(elem).perform();
	driver.findElement(By.id("documentTopLi")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement ele=driver.findElement(By.id("taxYears"));
	Select oSelect=new Select(ele);
	oSelect.selectByVisibleText("MY 2014 DOCS");
	/*	WebElement ele=driver.findElement(By.id("taxYears"));
		Select oSelect=new Select(ele);
	oSelect.selectByVisibleText("MY 2016 DOCS");*/

		
		}
		catch(Exception e){
			System.out.println(e);
		}

}
}