package ReadExcelData;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPrograms {

	public static void main(String[] args) throws IOException {
		
	try{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
		
			JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)","");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/section[3]/div/div[6]/a")).click();
		
	/*	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Sravya\\screenshot"));
		System.out.println("Screenshot taken");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fd_Filters_wrap']/div/div/div[1]")).click();
	//	driver.findElement(By.xpath("//*[@id='destFilters']/li[2]")).click();
	//	String text=driver.findElement(By.xpath("//*[@id='cardLi']/div/div[5]/div[1]/div[2]/span")).getText();
		//System.out.println(text);*/
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
				
	}

}




			
			