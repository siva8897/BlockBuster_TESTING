package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegisteredAgent;

public class TC30_RegisteredAgent extends BaseClass {
	public RegisteredAgent registeredagent;

	@Test
	public void verifyRegisterdAgent() {

		try {

			loginWithRaReceiver();

			registeredagent = new RegisteredAgent(driver);

			registeredagent.SetLogin();

			registeredagent.SetEdit();

			registeredagent.SetPhone();

			registeredagent.SetUpdate();

			String attualMessge = registeredagent.SetAlertMessage();

			String expetedMessage = "rareceiver Profile Updated Successfully";

			assertEquals(attualMessge, expetedMessage);

			System.out.println(expetedMessage);
			
			registeredagent.SetLogin();
			
			registeredagent.SetLogin();
		}

		catch (Exception e) {

			Assert.fail();
		}

	}
}