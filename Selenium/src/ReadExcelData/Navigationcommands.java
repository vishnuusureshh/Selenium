package ReadExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      String appUrl="https://myaccountqa.hrblock.net/mytax/";
      driver.get(appUrl);
      int titleLength=driver.getTitle().length();
      String CurrentUrl=driver.getCurrentUrl();
      String PageSource=driver.getPageSource();
      System.out.println("Page Source:" +PageSource);
      System.out.println("output:"+titleLength);
      System.out.println("Current URL:"+CurrentUrl);
      driver.navigate().to("https://orion.ust-global.com");
      driver.navigate().back();
      driver.navigate().forward();
      
      }

}
