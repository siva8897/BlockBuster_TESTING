package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.AddNewRole;
import pageObjects.BusinessPurpose;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC018_BusinessPurpose extends BaseClass {

	public LoginPage loginpage;
	public RegisterMBC registermbc;
	public AddNewRole addnewrole;
	public BusinessPurpose businesspurpose;

	
	@Test
	public void verifyBusinessPurpose() {
		try {
			
			logger.info("****Start in to Business Purpose Execution*****");
			loginWithAdmin();

			registermbc = new RegisterMBC(driver);

			registermbc.MenuButton();

			addnewrole = new AddNewRole(driver);

			addnewrole.SetDataMang();

			businesspurpose = new BusinessPurpose(driver);

			businesspurpose.SetBusinessPurpose();

			businesspurpose.SetBuinessPurp("apple");

			businesspurpose.SetSaveButton();

			// businesspurpose.SetDisable();

			// businesspurpose.SetdropDown();

			// businesspurpose.SetButtonDis();

			// businesspurpose.SetEnable();

			// businesspurpose.SetPurpose();

			// businesspurpose.SetCEnable();

			businesspurpose.SetEditBus();

			businesspurpose.SetBusinees();

			businesspurpose.SetButton();

			String messge = businesspurpose.GetMessage();

			if (messge.equals("Business Purpose Updated Successfully")) {

				Assert.assertTrue(true);

			}

			else {

				Assert.assertFalse(false);
			}
		} catch (Exception e) {

			Assert.fail();
		}

	}
}
