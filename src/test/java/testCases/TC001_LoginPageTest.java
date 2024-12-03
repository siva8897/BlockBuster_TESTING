package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC001_LoginPageTest extends BaseClass {

	@Test(groups = { "regression" })
	public void verify_loginpage() {

		// Login Page

		try {

			logger.info("****Start in to LoginPage Execution*****");
			LoginPage loginpage = new LoginPage(driver);

			loginWithAdmin();

			logger.info("User Successfully login Application");

			String confmsg = loginpage.getConfirmationMsg();

			logger.info("Validating expeacted Message");

			if (confmsg.equals("Welcome ROCA Super User")) {

				Assert.assertTrue(true);
			}

			else {

				logger.error("Test failed");

				logger.debug("Debug logs..");

				Assert.assertTrue(false);
			}

		} catch (Exception e) {

			Assert.fail();

		}

		logger.info("**** Finished TC01_LoginPageTest ***");
	}
}