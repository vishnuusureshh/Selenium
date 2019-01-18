package Testcases;
	


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.corba.se.impl.util.Utility;

	public class TestReport {
		
	/*	 ExtentReports extent;
		 ExtentTest test;
		 WebDriver driver;
		 ChromeOptions options;
		@BeforeSuite
		 public void setUp() {
		//	ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.html");
			 extent=new ExtentReports("C:\\Sravya\\Report2.html", true);
			// extent.attachReporter(htmlReporter);
			 test=extent.startTest("VerifyBlogTitle");
			 extent.loadConfig(new File());
		 }	 
		//	 System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
		@Test	
		 public void test1()
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				logger.log(LogStatus.INFO, "Browser started ");
				
				driver.get("https://myaccountqa.hrblock.net/mytax/");
				
				logger.log(LogStatus.INFO, "Application is up and running");
				
			    String title=driver.getTitle();
			    AssertJUnit.assertTrue(title.contains("account"));
			    
			    logger.log(LogStatus.PASS, "Title verified");
		 }
		 
		 @AfterSuite
         public void tearDown(ITestResult result)
		 {
		 if(result.getStatus()==ITestResult.FAILURE)
		 {
		  
			 String screenshot_path=Utility.
			 String image= logger.addScreenCapture(screenshot_path);
			 logger.log(LogStatus.FAIL, "Title verification", image);
		  
		  
		 }
		  
		report.endTest(logger);
		 report.flush();
		 
		  
		driver.get("C:\\Report\\LearnAutomation.html");
		 }
		 
		 
	}	*/
		

		 ExtentReports extent;
		 ExtentTest logger;
		 
		 
		 @BeforeTest
		 public void startReport(){
		 
		 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/MyExtentReport.html", true);
	
		 extent.addSystemInfo("Host Name", "SoftwareTestingMaterial")
		                .addSystemInfo("Environment", "Automation Testing")
		                .addSystemInfo("User Name", "Rajkumar SM");
	//	 extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		 }
		 
		 @Test
		 public void passTest(){
		
		 logger = extent.startTest("passTest");
		 Assert.assertTrue(true);
		 
		 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		 }
		 
		 @Test
		 public void failTest(){
		 logger = extent.startTest("failTest");
		 Assert.assertTrue(false);
		 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
		 }
		 
			 
		 @BeforeMethod
		 public void getResult(ITestResult result){
		 if(result.getStatus() == ITestResult.FAILURE){
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		 }
		  extent.endTest(logger);
		 }
		 
		 @AfterTest
		 public void endReport(){

		                extent.flush();
		                
		               
		    }
	 
	
	}





