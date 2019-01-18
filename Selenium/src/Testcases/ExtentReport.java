package Testcases;

	
	import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

import Utility.Constantclass;


	public class ExtentReport {
	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports("C:\\Users\\u44728\\ExtentReportResults.html", true);
	test = report.startTest("ExtentDemo");
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravya\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Gogle"))
	{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else{
			try {
				String path=Constantclass.getScreenshot(driver, "screenshotName");
				test.log(LogStatus.FAIL, "Test Failed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	}
	//test.log(LogStatus.FAIL, "Test Failed");
		
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	}