package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOperations {
		
	 	    public static void LaunchApplication(String selBrowser) { 
	        String sBrowser = selBrowser; 
	        if (sBrowser.equalsIgnoreCase("chrome")) { 
	            ChromeOptions options = new ChromeOptions(); 
	            options.addArguments("--disable-notifications"); 
	            options.setHeadless(true);
	            System.setProperty("webdriver.chrome.driver", Constantclass.chromeDriverPath); 
	            Constantclass.driver = new ChromeDriver(options); 
	            Constantclass.driver.manage().window().maximize(); 
	            Constantclass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            Constantclass.driver.get(Constantclass.sAppURL);
	            

	}
	 	    }
	 	    
	 	    
	}
	
