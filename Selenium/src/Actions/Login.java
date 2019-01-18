package Actions;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.Obj_LoginPage;
import Utility.Constantclass;

public class Login {
	
	public static void run_login() throws Exception{
		System.out.println(Obj_LoginPage.usernameField().isEnabled());
		Obj_LoginPage.usernameField().sendKeys(Constantclass.sUserName);
		Obj_LoginPage.passwordField().sendKeys(Constantclass.sPassword);
		
		
		Assert.assertTrue(Obj_LoginPage.usernameField().isEnabled(), "Login Page is Displayed.");
		Obj_LoginPage.signinButton().click();
		
	//	System.out.println("checkbox value: "+ Obj_LoginPage.remberMeChkBox().getAttribute("value"));
		
		Obj_LoginPage.welcomeBack().click();
		//*[@id="box"]/comment()//*[@id="box"]
		
		// Sec Answer Page
		String question=Obj_LoginPage.getSecurityquestion().getText();
		String[] parts = question.split(" ");
		String lastWord = parts[parts.length - 1];
		String pts=lastWord.replace("?","");
		System.out.println("Lastword:"+pts); // "sentence"
		Obj_LoginPage.securityAnswer().sendKeys(pts);
		Obj_LoginPage.remberMeChkBox().click();
		Obj_LoginPage.nextButton().click();
		
		
		
	//	System.out.println(Obj_LoginPage.emailIdField().getText());
		
	}

}
