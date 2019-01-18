package Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Constantclass {
	
	public static WebDriver driver=null;
	public static final String chromeDriverPath="C:\\Sravya\\New Jar\\chromedriver.exe";
	public static final String sAppURL="https://myaccountqa.hrblock.net/mytax/";
	public static final String sUserName="svandqa2618";
	public static final String sPassword="Testing@1";
	public static final String cUserName="svandqa21518";
	public static final String cPassword="Testing@1";
	public static final String CCPassword="Testing@1";
	public static final String email="sravya.venati@hrblock.com";
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
        //below line is just to append the date format with the screenshot name to avoid duplicate names		
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
String destination =  "C:\\Users\\u44728\\failedtest.png";
File finalDestination = new File(destination);
FileUtils.copyFile(source, finalDestination);
        //Returns the captured file path
return destination;
	
	}	
}
