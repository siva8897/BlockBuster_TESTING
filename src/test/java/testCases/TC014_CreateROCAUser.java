package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CreateROCAUser;
import pageObjects.CreateRegAgent;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC014_CreateROCAUser extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC registerMBC;

	public CreateRegAgent crAgent;

	public CreateROCAUser createrocauser;

	
	@Test
	public void verifyCreateROCAUser() {

		try {

			loginWithAdmin();

			registerMBC = new RegisterMBC(driver);

			registerMBC.MenuButton();

			CreateRegAgent crAgent = new CreateRegAgent(driver);

			crAgent.SetRegAgent();

			createrocauser = new CreateROCAUser(driver);

			createrocauser.SetCreateROCA();

			createrocauser.SetFName("Kine");

			createrocauser.SetLName("Willamson");

			createrocauser.SetEmail("KWillamson@gmail.com");

			createrocauser.SetPhone("8-917-123-7456");

			createrocauser.SetFax("8-448-121-8123");

			createrocauser.SetRole();

			createrocauser.SetUName();

			createrocauser.SetSButton();

			createrocauser.SetButton();

			createrocauser.GetAlertMessage();

			String txtMessage = "Successfully";

			assertEquals(txtMessage, createrocauser.GetAlertMessage());

		}

		catch (Exception e) {

			Assert.fail();
		}

	}
}