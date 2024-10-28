package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.RegisterMBC;
import pageObjects.StrikeOffMBC;
import pageObjects.TransferShares;

public class TC010_Strike_OffMBC extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC regMBC;

	public TransferShares transfershares;

	public StrikeOffMBC soffMBC;
    @Ignore
	@Test
	public void verify_StrikOffMBC() {

		try {
		loginpage = new LoginPage(driver);

		loginpage.SetUserName("rocasuperuser");

		loginpage.SetPassword("Welcome_1!");

		loginpage.SetSingin();

		regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();

		transfershares = new TransferShares(driver);

		transfershares.SetDisposition();

		soffMBC = new StrikeOffMBC(driver);

		soffMBC.SetStrikeoff();

		soffMBC.SetSearchMBC("MBC606784926IND");

		soffMBC.SetButton();

		soffMBC.SetReason();

		soffMBC.SetCalander();

		soffMBC.SetSumbitButton();

		String exptected = soffMBC.GetAlertMessage();

		Assert.assertEquals(exptected, "Strikeoff done successfully.");

	}
		catch (Exception e) {
			
			Assert.fail();
		}
}
}