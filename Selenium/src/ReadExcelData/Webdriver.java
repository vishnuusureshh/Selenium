package ReadExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	public static void main(String[] args) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		     WebDriver driver=new FirefoxDriver();
		     driver.get("https://www.google.com");
		     WebElement element=driver.findElement(By.name("btnI"));
		     boolean status=element.isEnabled();
		     System.out.println("Boolean status:"+status);
		     if(status){
		    	 element.click();
		     }
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// TODO Auto-generated method stub
	
	}

}
