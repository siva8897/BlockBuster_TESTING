package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.RAAdminDashBorad;

public class TC025_RAAdminDashBorad extends BaseClass {

	public RAAdminDashBorad raadmindashborad;

	
	@Test
	public void verifyRaAdmin() throws InterruptedException {

		try {

			loginWithRaAdmin();

			Thread.sleep(3000);

			raadmindashborad = new RAAdminDashBorad(driver);

			raadmindashborad.SetMoreButton();

			raadmindashborad.GetApporved();

			raadmindashborad.SetApporedList();

		}

		catch (Exception e) {

			Assert.fail();
		}

	}

}
