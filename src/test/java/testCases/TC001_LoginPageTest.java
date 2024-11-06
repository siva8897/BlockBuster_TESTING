package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC001_LoginPageTest extends BaseClass {


	@Ignore
	@Test(groups = {"regression"})
	public void verify_loginpage() {

		// Login Page

		try {
			LoginPage loginpage = new LoginPage(driver);

			loginpage.SetUserName("rocasuperuser");
			loginpage.SetPassword("Welcome_1!");
			loginpage.SetSingin();
			String confmsg = loginpage.getConfirmationMsg();

			Assert.assertEquals(confmsg, "Welcome ROCA Super User");
		} catch (Exception e) {

			Assert.fail();
		}
	}
}