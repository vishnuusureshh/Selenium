package ReadExcelData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Trip {
	public static WebDriver driver;

	public static void openURL() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\New Jar\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

	}

	public static void flight(String date,int amnt) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai, India");
		driver.findElement(By.id("hp-widget__sTo")).clear();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore, India");

		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/a")).getText();
			if(cell.equals(date))
			{
	   		  String amount=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/span")).getText();
	   		  int amtval=Integer.parseInt(amount);
	   		  if(amtval>amnt){
	   			  System.out.println("Flight charge for September 30 is greater than 2000 that is "+amount+"\n"+"Let's try for Train...");
	   			  
	   		  }
	   		  else	{
	   			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/a")).click();
	   		  		}
			}
		driver.findElement(By.id("searchBtn")).click();
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
			String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/a")).getText();
			if(cell.equals("30"))
			{
				driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/a")).click();
			}
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
			//	driver.findElement(By.xpath("//*[@id='table_go']/table/tbody[2]/tr["+i+"]/td[7]/div/a[2]")).click();
			    break;
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
		driver.findElement(By.id("header_tab_bus")).click();
		driver.findElement(By.id("hp-widget__sfrom")).click();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai");
		driver.findElement(By.id("hp-widget__sTo")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/a")).getText();
		if(cell.equals("30"))
		{
			driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[5]/td[6]/a")).click();
		}
		driver.findElement(By.id("searchBtn")).click();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openURL();
		flight("30",2000);
	//	train();
	//	bus();
	}

}
