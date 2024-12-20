package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.Amendment;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;
import pageObjects.TransferShares;

public class TC007_TransferShares extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC registermbc;

	public TransferShares transfershares;

	public Amendment amendment;

   @Ignore
	@Test(groups="smoke")
	public void verify_TransferShares() throws Exception {

		try {

			loginWithAdmin();

			registermbc = new RegisterMBC(driver);

			registermbc.MenuButton();

			transfershares = new TransferShares(driver);

			transfershares.SetDisposition();

			transfershares.SetTransferShares();

			transfershares.SetMBCNumber("MBC606784926IND");

			transfershares.SetUpdateBut();

			transfershares.SetDispositionOfSahres();

			transfershares.SetReason();

			transfershares.SetDatePicker();

			transfershares.SetDissolve();

			transfershares.SetConfiram();

			transfershares.SetButton();

			transfershares.SetSubmit();

		}

		catch (Exception e) {

			Assert.fail();
		}
	}
}