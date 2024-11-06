package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.LoginWithROCAUser;

public class TC011_Loginwith_ROCAUser extends BaseClass {
	
	@Ignore
	@Test
	public void Verify_Login_ROCAUser() {

		LoginPage loginpage = new LoginPage(driver);

		loginpage.SetUserName("rocauser");
		loginpage.SetPassword("Welcome_1!");
		loginpage.SetSingin();

		LoginWithROCAUser rocau = new LoginWithROCAUser(driver);

		rocau.GetPageloading();

		rocau.GetMessage();

	}
}