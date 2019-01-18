package ReadExcelData;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendar{
	//int td=7;
   // int tr=5;
    boolean enabled;
    public static WebDriver driver;
    public static int value;
    
    
    
    public static void openURL(){
    	 ChromeOptions options=new ChromeOptions();
 		options.addArguments("--disable-notifications");
 		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
 		driver=new ChromeDriver(options); 
 		driver.get("https://www.makemytrip.com/");
 		
    }
    
    
    public static void enterdetails(){
        driver.findElement(By.id("hp-widget__sfrom")).clear();	
 		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("New Delhi, India");
 		driver.findElement(By.id("hp-widget__sTo")).clear();	
 		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Chennai, India");
 /*		 driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
 	    List<WebElement> val =driver.findElements(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr"));
 		int value=val.size();
 	    System.out.println("count"+value);
  //	   driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).click();
  	   String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).getText();
  	if(cell.equals("21")){
   		driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).click();
   	}else
   	{
   		System.out.println("Date does not match");
   		}*/
   	}
 		
    
    	
   public static void dateClick(){
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
       List<WebElement> val =driver.findElements(By.xpath("//*[@class='dateFilter hasDatepicker']/div[1]/div[1]/table/tbody/tr"));
    
       int value=val.size();
       System.out.println("count"+value);
       
       String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).getText();
  	
       if(cell.equals("20"))
       {
   		  driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).click();
   	   }
       else
   	   {
   		System.out.println("Date does not match");
   	   }
   /* for(int i=0;i<value;i++){
       for(int j=0;j<=7;j++){
    	String cell=driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).getText();
    	if(cell.equals("20")){
    		driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[3]/a")).click();
    	}
    	/*  driver.fin	dElement(By.xpath("//*[@class='ui-datepicker-calendar']/div/div[1]/table/tbody/tr[4]/td[3]/a")).click();*/
      // }    	
   //}
  

    }	
	    
    public static void main(String[] args){
    	try {
			
    		
        	openURL();
        	enterdetails();
        	dateClick();
        	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    
 //  dateClick();
    
    }
}
//*[@id="dp1505125022303"]/div/div[1]/table/tbody/tr[1]/td[5]