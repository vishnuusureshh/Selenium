package ReadExcelData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Besttrip {
	public static WebDriver driver;
	public static String date;
	public static int amnt;
	public static void openURL() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

	}

	public static void flight(String date,int amnt) {
		try {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai, India");
		driver.findElement(By.id("hp-widget__sTo")).clear();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore, India");

		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).getText();
			if(cell.equals(date))
			{
	   		  String amount=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/span")).getText();
	   		  int amtval=Integer.parseInt(amount);
	   		  if(amnt>amtval){
	   			  System.out.println("Flight charge for october 30 is greater than 2000 that is "+amount+"\n"+"Let's try for Train...");
	   			  
	   		  }
	   		  else	{
	   			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).click();
	   			driver.findElement(By.id("searchBtn")).click();
	   			String cls=driver.findElement(By.xpath("//*[@id='sortingRow']/div[1]/div[4]/a/span")).getAttribute("class");
	   			System.out.println("classname"+cls);
	   			if(cls.equals("down_arrow")){
	   				driver.findElement(By.xpath("//*[@id='sortingRow']/div[1]/div[4]/a/span")).click();
	   				Thread.sleep(3000);
	   				driver.findElement(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div[5]/div[2]/div[2]/div[7]/p/a")).click();   		
	   				driver.findElement(By.xpath("//*[@id='sortingRow']/div[1]/div[4]/a/span")).click();
	   			    driver.findElement(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div[5]/div[2]/div[2]/div[7]/p/a")).click();  				
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div[1]/div[1]/div[4]/div[2]/div/input")).sendKeys("abc@gmail.com");
	   				JavascriptExecutor jse = (JavascriptExecutor)driver;
	   				jse.executeScript("window.scrollBy(0,250)", "");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div[1]/div[1]/div[6]/div[1]/a")).click();
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/div/div/p[1]/span[2]/input")).sendKeys("Test");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[3]/p[2]/span[3]/input")).sendKeys("9999999999");
	   				jse.executeScript("window.scrollBy(0,400)", "");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[3]/div[7]/p/a")).click();
	   				
	   			}
	   			else{
	   				driver.findElement(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div[5]/div[2]/div[2]/div[7]/p/a")).click();  				
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div[1]/div[1]/div[4]/div[2]/div/input")).sendKeys("abc@gmail.com");
	   				JavascriptExecutor jse = (JavascriptExecutor)driver;
	   				jse.executeScript("window.scrollBy(0,250)", "");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div[1]/div[1]/div[6]/div[1]/a")).click();
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/div/div/p[1]/span[2]/input")).sendKeys("Test");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/div/div/p[1]/span[3]/input")).sendKeys("User");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[3]/p[2]/span[3]/input")).sendKeys("9999999999");
	   				jse.executeScript("window.scrollBy(0,400)", "");
	   				driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div[3]/div[1]/div/div[3]/div[7]/p/a")).click();
	   			}
	   		//*[@id="content"]/div[2]/div[4]/div[1]/div[1]/div[6]/div[1]/a"
	   			   		  		}
			}
			Thread.sleep(1000);
		driver.findElement(By.id("searchBtn")).click();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}

	public static void train() {

		try {

			driver.findElement(By.xpath("//*[@id='chf_header']/div[2]/div/ul/li[9]/a/span[2]")).click();
			driver.findElement(By.id("hp-widget__sfrom")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai, India");
			driver.findElement(By.id("hp-widget__sTo")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore, India");
			Thread.sleep(5000);
			driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).click();
			/*if(cell.equals(date))
			{
				driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).click();
			}*/
			driver.findElement(By.id("searchBtn")).click();
			Thread.sleep(2000);
			for(int i=1;i<=18;i++){
				String tavail=driver.findElement(By.xpath("//*[@id='table_go']/table/tbody[2]/tr["+i+"]")).getAttribute("class");
       	 		if(tavail.contains("no"))
			{
				System.out.println("No Display Date");
			}
			else{
				String text=driver.findElement(By.xpath("//*[@id='table_go']/table/tbody[2]/tr["+i+"]/td[7]/div/div/span")).getText();
				if(text.contains("Avail")){
				System.out.println("Train seats are available");
				/*String text=driver.findElement(By.xpath("//*[@id='table_go']/table/tbody[2]/tr["+i+"]/td[7]/div/div")).getAttribute("class");
				if(text.contains("NL")){
				System.out.println("No Available Train seats");	
		//		driver.findElement(By.xpath("//*[@id='table_go']/table/tbody[2]/tr["+i+"]/td[7]/div/a[2]")).click();
		//	    break;*/
				}
			else{
				System.out.println("No Availability of trains");
			    }
			    }
			}	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static void bus() {
		try{
		driver.findElement(By.xpath("//*[@id='chf_header']/div[2]/div/ul/li[7]/a/span[2]")).click();
	//	driver.findElement(By.id("header_tab_bus")).click();
		driver.findElement(By.id("hp-widget__sfrom")).click();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.id("hp-widget__sTo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		Thread.sleep(1000);
		String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).getText();
		if(cell.equals(date))
		{
			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[6]/td[1]/a")).click();
		}
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div[2]/div[4]/div/div[1]/div[1]/div[1]/div[6]")).click();
		driver.findElement(By.xpath("//*[@class='inlineB seat_available'][1]")).click();
				
		//*[@id="seat_0_1_1"]
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openURL();
		flight("30",2000);
	    train();
	    bus();
	}

}
