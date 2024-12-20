package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.AccountDeposit;
import pageObjects.RegisterMBC;

public class TC28_AccountDeposit extends BaseClass {
	public AccountDeposit accountdeposit;

	@Ignore
	@Test
	public void verifyAccountDeposti() throws Exception {

		loginWithRaAdmin();
		Thread.sleep(3000);

		RegisterMBC regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();

		accountdeposit = new AccountDeposit(driver);

		accountdeposit.setAccountDeposit();

		accountdeposit.setAaddFunds();

		accountdeposit.SetAmount("8000");
		
		accountdeposit.SetPurchage();
		
		accountdeposit.windowsTest("54879974857452");
		
		accountdeposit.setMonth("06");
		
		accountdeposit.setYear("25");
		
		accountdeposit.setFirst("Tom");
		
		accountdeposit.setLastName("Latham");
		
		accountdeposit.setPolicy();

		
		

	}

}
