package tests;
	
	
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

import commons.constant;
	public class ReportHelper {
	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports("C:\\Users\\Sravya\\Desktop\\ExtentReportResults.html", false);
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
				String path=constant.getScreenshot(driver, "screenshotName");
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


