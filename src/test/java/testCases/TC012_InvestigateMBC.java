package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.InvestigateMBC;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC012_InvestigateMBC extends BaseClass {

	public InvestigateMBC investigate;

	
	@Test
	public void Verify_TransferShares() {

		try {

			logger.info("****Start in to InvestigateMBC Execution*****");
			loginWithAdmin();

			RegisterMBC regMBC = new RegisterMBC(driver);

			regMBC.MenuButton();

			investigate = new InvestigateMBC(driver);

			investigate.SetCourtOrder();

			investigate.SetInvestigate();

			investigate.SetMBCNumber("MBC606784926IND");

			investigate.SearchButton();

			investigate.SetCalSelect();

			investigate.SetDefraud();

			investigate.SetFirstName("Tom");

			investigate.SetLastName("Latham");

			investigate.SetSumbit();

			investigate.SetInvestigate();

			String msg = investigate.GetAlertMgs();

			assertEquals(msg, "Application to the court for Investigation is Successful");
		} catch (Exception e) {

			Assert.fail();
		}
	}

}