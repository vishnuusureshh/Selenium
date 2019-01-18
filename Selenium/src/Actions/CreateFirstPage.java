package Actions;

import PageObjects.Obj_CreatePageOne;
import Utility.Constantclass;

public class CreateFirstPage {

	
	public static void enterCredentials()
	{
		
		Obj_CreatePageOne.enterEmail().sendKeys(Constantclass.email);
		Obj_CreatePageOne.enterUsername().sendKeys(Constantclass.cUserName);
		Obj_CreatePageOne.enterPassword().sendKeys(Constantclass.cPassword);
		Obj_CreatePageOne.enterConfirmPwd().sendKeys(Constantclass.CCPassword);
		Obj_CreatePageOne.clickNext().click();
	}
}
