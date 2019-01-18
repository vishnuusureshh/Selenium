package ReadExcelData;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.TakesScreenshot;
import javafx.scene.image.Image;

//To select a date comparing all values in calendar using for condition
public class Travel{
    public static WebDriver driver;
 //   public static int value;
    
    public static void openURL(){
        ChromeOptions options=new ChromeOptions();
 		options.addArguments("--disable-notifications");
 		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
 		driver=new ChromeDriver(options); 
 		driver.get("https://www.makemytrip.com/");
 		
        }	
    public static void captureScreenshot(){
    	try{
    	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(srcFile, new File("C:\\Sravya\\SCREENSHOT.png"));
    	} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    }
   public static void enterdetails(){
 		driver.findElement(By.id("hp-widget__sfrom")).clear();	
 		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("New Delhi, India");
 		driver.findElement(By.id("hp-widget__sTo")).clear();	
 		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Chennai, India");
    }
 		  	
    public static void dateClick(){
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
       List<WebElement> val =driver.findElements(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr"));
       int value=val.size();
       System.out.println("count"+value);
     //  driver.findElement(By.id("dataTables");
        for(int i=1;i<=value;i++){
             for(int j=1;j<=7;j++){
            	 String clsnme=driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getAttribute("class");
            	 if(clsnme.contains("disa"))
            	 {
            		 System.out.println("date is not displayed");
            	 }
            	 else{
    	             String cell=driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]/a")).getText();
    	
    	             if(cell.equals("30")){
    		            driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]/a")).click();
    	             }
                   	else {
    		      System.out.println("Date not found"+cell);
    		
    	         }
            	 }
    	
             }
        }
       
    }
	    
    public static void main(String[] args){
    	
    	try {
			
    		openURL();
        	enterdetails();
        	dateClick();
        	captureScreenshot();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    
   
    }
}