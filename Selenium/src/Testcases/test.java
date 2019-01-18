package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.Obj_LoginPage;
import Utility.Constantclass;

public class test {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", Constantclass.chromeDriverPath); 
		ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        
        //Adding options to to webdriver.
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://myaccountqa.hrblock.net/mytax/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("***");
        driver.findElement(By.id("username"));
        driver.findElement(By.id("password"));
        driver.findElement(By.id("defaultSignInUser"));
        System.out.println("****");

         
	}
	
}
