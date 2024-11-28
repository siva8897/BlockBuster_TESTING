package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.AddNewRole;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC016_AddNewRole extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC regMBC;

	public AddNewRole addnewrole;
   @Ignore
	@Test
	public void VerifyAddNewRole() {

		try {
			loginWithAdmin();

			regMBC = new RegisterMBC(driver);

			regMBC.MenuButton();

			addnewrole = new AddNewRole(driver);

			addnewrole.SetDataMang();

			addnewrole.SetRole();

			addnewrole.SetCode("TESTNG");

			addnewrole.SetDes("Automation");

			addnewrole.SetDetails("Selenium");

			addnewrole.SelectNameDrop();

			addnewrole.SetSaveButton();

			addnewrole.SetAlertMessage();

		}

		catch (Exception e) {

			Assert.fail();
		}
	}
}