package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.bcel.internal.classfile.ConstantClass;

import Utility.Constantclass;

public class Obj_LoginPage{
	
	private static WebElement object=null;
	
	
	public static WebElement usernameField()throws Exception{
		object =  Constantclass.driver.findElement(By.id("username"));
		System.out.println("Username Page Object");
		return object;
	    } 
	
	public static WebElement passwordField()throws Exception{
		object =  Constantclass.driver.findElement(By.id("password"));
		System.out.println("Password Page Object");
		return object;
	    }
	
	public static WebElement signinButton()throws Exception{
		object =  Constantclass.driver.findElement(By.id("defaultSignInUser"));
		System.out.println("SignIn button Page Object");
		return object;
	    } 
	public static WebElement welcomeBack()throws Exception{
		object =  Constantclass.driver.findElement(By.id("resendsignInCode"));
		System.out.println("Welcome Back link Page Object");
		return object;
	    } 
	public static WebElement getSecurityquestion()throws Exception{
		object=Constantclass.driver.findElement(By.xpath("//*[@id='maindatacontent']/div[1]/fieldset/div[2]/dl/dd[1]/label"));
		System.out.println("get security question Page Object");
		return object;
	    } 
	
	public static WebElement securityAnswer()throws Exception{
		object=Constantclass.driver.findElement(By.id("securityAnswer"));
		System.out.println("Security Answer Page Object");
		return object;
	    } 
	
	public static WebElement remberMeChkBox()throws Exception{
		object =  Constantclass.driver.findElement(By.xpath("//*[@id='box']"));
		System.out.println("Remember me Page Object");
		return object;
	    } 
	public static WebElement nextButton()throws Exception{
		object =  Constantclass.driver.findElement(By.id("defaultsecurityqn-next"));
		System.out.println("Next button Page Object");
		return object;
	    } 
	//*[@id="box"]
	

}