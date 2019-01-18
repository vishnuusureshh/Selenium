package Actions;

import PageObjects.Obj_CreateAccount;

public class CreateAccountbutton {

	public static void clickCreatebutton() throws Exception{
	Obj_CreateAccount.createAccount().click();
}
}