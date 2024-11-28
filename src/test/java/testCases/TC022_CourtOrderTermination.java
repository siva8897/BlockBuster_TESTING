package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CourtOrderTermination;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC022_CourtOrderTermination extends BaseClass {

	public CourtOrderTermination ordertermination;

	@Ignore
	@Test
	public void verifyCourtOrderTermination() {

		try {
		loginWithRaPractitioner();

		RegisterMBC regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();

		ordertermination = new CourtOrderTermination(driver);

		ordertermination.SetLiquidate();

		ordertermination.SetTermination();

		ordertermination.SetSearchmbc("MBC973729665IND");

		ordertermination.SetSearch();

		ordertermination.SetCalcuter();

		ordertermination.fileTest();

		ordertermination.SetCalcuter1();

		ordertermination.Setreson("Loss of company");

		ordertermination.SetSubmit();

		ordertermination.Submited();

		String attualTest = ordertermination.getMessageDes();

		String expectedTest = "Notice of Court Order Terminating Liquidation filed successfully and waiting for ROCA approval";

		
		assertEquals(attualTest, expectedTest);
		
		}
		
		catch(Exception e) {
			
			Assert.fail();
		}
	}

}
