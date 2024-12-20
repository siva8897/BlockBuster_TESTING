package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.AnnualReturn;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC005_AnnualReturn extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC regMBC;

	
	@Test(groups ="smoke")
	public void verify_AnnualReturn() throws Exception {

		try {
			
			logger.info("****Start in to Annual Return Page Execution*****");
			
			loginWithAdmin();

			regMBC = new RegisterMBC(driver);

			regMBC.MenuButton();

			regMBC.MBCMangMenu();

			AnnualReturn anureturn = new AnnualReturn(driver);

			anureturn.setAnnualReturn();

			anureturn.setSearchMBC("MBC606784926IND");

			anureturn.SetSearch();

			anureturn.setfilingYear();

			anureturn.setYes();

			anureturn.setConfirme();

			anureturn.setReview();

			anureturn.setSubmit();

			String atualValue = anureturn.setAlert();

			Assert.assertEquals(atualValue, "Annual Report Filing Year Shouldn't be Previous years.");

		} catch (Exception e) {
			Assert.fail();
		}
	}

}
