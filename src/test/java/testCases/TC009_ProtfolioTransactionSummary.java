package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PortfolioTransactionSummary;
import pageObjects.RegisterMBC;
import pageObjects.SearchMicroBusinessCompany;

public class TC009_ProtfolioTransactionSummary extends BaseClass {

	public RegisterMBC registermbc;

	public LoginPage loginpage;

	public SearchMicroBusinessCompany SMBC;

	public PortfolioTransactionSummary ptSummary;
	
	@Test
	public void verifyProfolioTransactionSummary() {

		try {
		loginpage = new LoginPage(driver);

		loginpage.SetUserName("rocasuperuser");
		loginpage.SetPassword("Welcome_1!");
		loginpage.SetSingin();

		registermbc = new RegisterMBC(driver);

		registermbc.MenuButton();

		SMBC = new SearchMicroBusinessCompany(driver);

		SMBC.setMpManagement();

		ptSummary = new PortfolioTransactionSummary(driver);

		ptSummary.SetPtransactonSummar();

		ptSummary.SetmbcNumber("MBC606784926IND");

		ptSummary.SetTransacionNumber("TSN74851212");

		ptSummary.SetPaymentStatus();

		ptSummary.SetTransactionName();

		ptSummary.SetUserName("SupperUser");

		ptSummary.SetStartDate();

		ptSummary.SetEndDate();

		ptSummary.SetSearch();

		String confMes = ptSummary.GetMessageAlert();

		Assert.assertEquals(confMes, "No results found.");

	}
		catch(Exception e) {
			
			Assert.fail();
		}

}
}