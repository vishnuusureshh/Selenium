package Testcases;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import PageObjects.Obj_CreateAccount;

public class Utility {
	
		JavascriptExecutor driver;
	/*	public String captureScreenshot(WebElement objWebElement){
			File objTempFile=null;
			try{
				String getAttributeStyle = ""; 			
				if(objWebElement!=null){
					getAttributeStyle= objWebElement.getAttribute("style");
					
					JavascriptExecutor js = (JavascriptExecutor) driver;			
			        js.executeScript("arguments[0].style.border=arguments[1];", objWebElement, "2px solid red");
				}
				objTempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				if(objWebElement!=null){
					JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", objWebElement, getAttributeStyle);	 
				}
				return objTempFile.getAbsolutePath();
			}
			catch (Exception e){
				return "(No fun with) ScreenShot Capture Error";
			}
		}*/
	}


