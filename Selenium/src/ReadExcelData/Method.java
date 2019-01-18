package ReadExcelData;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method{


	public static void URL(){
		try{
		 ChromeOptions options=new ChromeOptions();
	 		options.addArguments("--disable-notifications");
	 		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
	 		objectdescription.driver=new ChromeDriver(options); 
	 		
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void from(){
		objectdescription.txt_search.sendKeys("New Delhi, India");
	}
}
