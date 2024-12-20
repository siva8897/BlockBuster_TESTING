package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CreateRegAgent;
import pageObjects.LoginPage;
import pageObjects.ModifyROCAUser;
import pageObjects.RegisterMBC;

public class TC015_ModifyROCAUser extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC registerMBC;

	public CreateRegAgent crAgent;

	public ModifyROCAUser modifyROCAUser;
    
	@Ignore
	@Test
	public void VerifyModifyROCAUser() throws Exception {

		try {
			loginWithAdmin();

			registerMBC = new RegisterMBC(driver);

			registerMBC.MenuButton();

			crAgent = new CreateRegAgent(driver);

			crAgent.SetRegAgent();

			modifyROCAUser = new ModifyROCAUser(driver);

			modifyROCAUser.SetModifyUser();

			modifyROCAUser.SetUserType();

			modifyROCAUser.SetUser();

			modifyROCAUser.SetMoify();

			modifyROCAUser.SetFirstName();

			modifyROCAUser.SetButton();

			modifyROCAUser.GetAlertMessage();

			String txtMessage = "Successfully";
			
			

			assertEquals(txtMessage, modifyROCAUser.GetAlertMessage());

		} catch (Exception e) {

			Assert.fail();
		}
	}
}