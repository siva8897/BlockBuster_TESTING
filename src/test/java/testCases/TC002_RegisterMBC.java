package testCases;

import static org.testng.Assert.assertEquals;


import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC002_RegisterMBC extends BaseClass{

	

   
	@Test(groups = {"smoke"})
	public void Verify_RegisterMBC() throws Exception {
		
		//RegisterMBC Page
		
		try {
			
			logger.info("****Start in to RegisterMBC Page Execution*****");

		loginWithAdmin();

		RegisterMBC regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();

		regMBC.MBCMangMenu();

		regMBC.SetRegserMBC();

		regMBC.Setcountry();

		regMBC.SetRegAgent();

		regMBC.rdAdminUser();

		regMBC.SetBussinesAs();

		regMBC.SetfirstNameOnly();

		regMBC.SetprofessionalDetails("Test Enginner");

		regMBC.SetFirstName("Tom");

		regMBC.SetNationCode();

		regMBC.SetShares();

		regMBC.SetbusinessPurpose();

		regMBC.SetConfCheck();

		regMBC.SetSubmitButton();

		regMBC.SetformSumbit();
		
		regMBC.getRegSuccessfully();

		String cMesssge = "successfully.";

		assertEquals(cMesssge, regMBC.getRegSuccessfully());

	}
		
		catch(Exception e) {
			
			Assert.fail();
		}
}
}