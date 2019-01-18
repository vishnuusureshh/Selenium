package commons;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class constant {

	
	public static WebDriver driver=null;
	public static final String ChromeDriverPath="C:\\Users\\Sravya\\Downloads\\chromedriver.exe";
	public static final String sUrl="https://orion.ust-global.com";
	public static final String sUsername="u44728";
	public static final String sPassword="b@b@199314";
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
        //below line is just to append the date format with the screenshot name to avoid duplicate names		
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
String destination =  "C:\\Users\\Sravya\\Desktop\\failedtest.png";
File finalDestination = new File(destination);
FileUtils.copyFile(source, finalDestination);
        //Returns the captured file path
return destination;
	
	}	

}