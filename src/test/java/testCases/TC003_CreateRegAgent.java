package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CreateRegAgent;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;


public class TC003_CreateRegAgent extends BaseClass {

	
	@Test(groups="smoke")
	public void Verfiy_CreateRegAgent() throws Exception {

		// Create Regiester Agent Page

		try {

			loginWithAdmin();

			RegisterMBC registerMBC = new RegisterMBC(driver);

			registerMBC.MenuButton();

			CreateRegAgent crAgent = new CreateRegAgent(driver);

			crAgent.SetRegAgent();

			crAgent.SetcreateAgent();

			crAgent.Settitle("TCS");

			crAgent.SetContactFirstName("Tom");

			crAgent.SetregisteredAgentName("Leatham");

			crAgent.SetUrl("WWW.Gogle.com");

			crAgent.SetLastName("Peterson");

			crAgent.SetAemail("Siva88@gmail.com");

			crAgent.SetrBuildingName("VirginIland");

			crAgent.SetfaxNum("7-845-878-7858");

			crAgent.SetPhone("7-545-445-4444");

			crAgent.SetrCity("Hydarabad");

			crAgent.Setaddress("DoorNumber7-48,kukatpally");

			crAgent.SetZcode("874414");

			crAgent.SetrFName("Keani");

			crAgent.SetrLName("Willamson");

			crAgent.SetBuildingName("India Mumbi");

			crAgent.SetStreetAddress("Mumbi door no 78/745");

			crAgent.SetCRCity("Austraila");

			crAgent.SetZipCo("533232");

			crAgent.SetEmailId("Tom@gmail.com");

			crAgent.SetPhoneNumber("7-845-878-7858");

			crAgent.SetFaxF("7-545-445-4444");

			crAgent.SetUserNameD();

			crAgent.SetPasswordD("Welcome_12!");

			crAgent.setPassword("Welcome_12!");

			crAgent.setQuestionPassword("TestPassword");

			crAgent.setAnewerPassword("TestPassword");

			crAgent.setButton();

			String expected = "successful.";

			assertEquals(expected, crAgent.raRegValidationMessage());
		}

		catch (Exception e) {

			Assert.fail();

		}
	}

}
