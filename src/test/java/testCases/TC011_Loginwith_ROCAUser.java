package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import pageObjects.LoginPage;
import pageObjects.LoginWithROCAUser;

public class TC011_Loginwith_ROCAUser extends BaseClass {
	
	
	@Test
	public void Verify_Login_ROCAUser() {

		logger.info("****Start in to Login With ROCAUser Execution*****");
		
		loginWithRAUser();

		LoginWithROCAUser rocau = new LoginWithROCAUser(driver);

		rocau.GetPageloading();

		rocau.GetMessage();

	}
}