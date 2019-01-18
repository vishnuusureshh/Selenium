package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.bcel.internal.classfile.ConstantClass;

import Utility.Constantclass;

public class Obj_CreateAccount {
	private static WebElement object=null;
	
	public static  WebElement createAccount()

	{
	WebElement Object=Constantclass.driver.findElement(By.id("createID"));
	return Object;
	}
}
