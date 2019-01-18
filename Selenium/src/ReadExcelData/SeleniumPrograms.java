package ReadExcelData;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import org.testng.asserts.SoftAssert;

public class SeleniumPrograms {
	public static void main(String[] args) {
		//dynamicTable();
		//printTableData1();
	    //mercuryTours();	
		//scrollMethod();
		try {
			windowHandles();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void assertfunctions(){
//		SoftAssert softassert= new SoftAssert();
	
//		System.out.println("pass");
/*	try{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
		String ele=driver.getWindowHandle();
		System.out.println(ele);
		WebElement newEl=driver.findElement(By.xpath("//a[@class='text-primary']"));
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> ite=s1.iterator();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		boolean ts=wait.until(ExpectedConditions.elementToBeClickable(newEl)).isDisplayed();
		System.out.println(ts);*/
/*		driver.switchTo().window("https://orion.ust-global.com");
        driver.switchTo().window("https://www.google.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)","");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/section[3]/div/div[6]/a")).click();
		
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Sravya\\screenshot"));
		System.out.println("Screenshot taken");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fd_Filters_wrap']/div/div/div[1]")).click();
	//	driver.findElement(By.xpath("//*[@id='destFilters']/li[2]")).click();
	//	String text=driver.findElement(By.xpath("//*[@id='cardLi']/div/div[5]/div[1]/div[2]/span")).getText();
		//System.out.println(text);*/
/*
	catch(Exception e)
	{
		System.out.println(e);
	}*/
				
	}

	public static void printTableData()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		WebElement mytable=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		
		List<WebElement> rows = mytable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			
			System.out.println(columns.size());
			for(int j=0;j<columns.size();j++)
			{
				String text=columns.get(j).getText();
			    System.out.println(text);
					break;
				
			}
				
				
			}
		
		}
		
	public static void printTableData1()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		WebElement mytable=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		
		List<WebElement> rows = mytable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
			
		}
		
		
	
	public static void dynamicTable()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		
		String beforeXpath="//*[@id='leftcontainer']/table/tbody/tr[";
		String afterXpath="]/td[4]";
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("No of rows:"+rows.size());
		for(int i=1;i<rows.size();i++){
			String actualpath = beforeXpath +i+ afterXpath;
			WebElement ele=driver.findElement(By.xpath(actualpath));
			System.out.println(ele.getText());
		/*if(ele.getText().equals("EID Parry"))
					{
				System.out.println("found :"+i);
				WebElement ele1=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[10]/td[4]"));
				System.out.println(ele1.getText());
                 break;						
					}*/
					/*	List<WebElement> cols=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/"
				+ ""
				+ "th"));
		System.out.println("No of columns:"+cols.size());
		
		WebElement table=driver.findElement(By.tagName("table"));*/
		}
	
}
	public static void mercuryTours()
	{
		try{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("vinti");
		driver.findElement(By.name("password")).sendKeys("vinti123");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("User is logged in successfully");
		driver.findElement(By.xpath("//input[@name='tripType'][@value='oneway']")).click();
		driver.manage().deleteAllCookies();
		Select oselect=new Select(driver.findElement(By.xpath("//*[@name='fromPort']")));
		oselect.selectByIndex(2);
		Select oselect1=new Select(driver.findElement(By.xpath("//*[@name='toPort']")));
		oselect1.selectByVisibleText("Paris");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void scrollMethod()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,1000)");
		WebElement ele=driver.findElement(By.xpath("//*[@id='deals_live_deals']"));
		//jse.executeScript("arguments[0].scrollIntoView();", ele);
	     jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	 public static void windowHandles() throws InterruptedException
	 {
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(options);	
		 driver.manage().window().maximize();
     	 driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	     WebElement clickElement = driver.findElement(By.id("button1")); 
	 
	 for(int i = 0; i < 3; i++)
	 {
	 clickElement.click();
	 Thread.sleep(3000);
	 }
	 Set<String> windowhandles= driver.getWindowHandles();
	 for(String handle:windowhandles)
	 {
		 System.out.println("window handles:"+handle);
	 }
	 }
}
//*[@id="leftcontainer"]/table/tbody/tr[10]/td[4]

//*[@id="leftcontainer"]/table/thead/tr/th[1]

//*[@id="leftcontainer"]/table/tbody/tr[16]/td[1]/a


//*[@id="leftcontainer"]/table/tbody/tr[1]/td[4]









			
			