package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.Constantclass;

public class Obj_CreatePageOne {

	
	private static WebElement Object=null;
	
	public static WebElement enterEmail()
	{
		Object = Constantclass.driver.findElement(By.id("email"));
		return Object;
		
		}
	public static WebElement enterUsername()
	{
		Object = Constantclass.driver.findElement(By.id("userName"));
		return Object;
		
		}
	public static WebElement enterPassword()
	{
		Object = Constantclass.driver.findElement(By.id("password"));
		return Object;
		
		}
	public static WebElement enterConfirmPwd()
	{
		Object = Constantclass.driver.findElement(By.id("confirmpassword"));
		return Object;
		
		}
	public static WebElement clickNext()
	{
		Object = Constantclass.driver.findElement(By.id("showhide"));
		return Object;
		
		}
	
	}
