package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CourtOrderTermination;
import pageObjects.RegisterMBC;
import pageObjects.VoluntaryLiquidation;

public class TC023_VolutaryLiquidator extends BaseClass {

	public CourtOrderTermination ordertermination;

	public VoluntaryLiquidation voluntaryliquidation;

	
	@Test
	public void verifyVolutaryLiquidator() {

		try {
			
			logger.info("****Start in to Volutery Liquidator Execution*****");
		loginWithRaPractitioner();

		loginWithRaPractitioner();

		voluntaryliquidation = new VoluntaryLiquidation(driver);
		

		voluntaryliquidation.SetMenu();

		ordertermination = new CourtOrderTermination(driver);

		ordertermination.SetLiquidate();

		voluntaryliquidation.SetVlResignation();

		voluntaryliquidation.SetSearchMBC("MBC973729665IND");

		voluntaryliquidation.SetSearch();

		voluntaryliquidation.SetDatePicker();

	    voluntaryliquidation.SetreasonforRes("SharesSold");

		voluntaryliquidation.SetdrpraPract();
		
		voluntaryliquidation.SetCheckBox();
		
		voluntaryliquidation.SetSubmit();
		
		voluntaryliquidation.SetPayment();
		
	String attualMessage=	voluntaryliquidation.SetMessage();
	
	String expectedMessage="mbcId should be +ve numeric value.";
	
	Assert.assertEquals(attualMessage, expectedMessage);

	}
		
		catch(Exception e) {
			
			Assert.fail();
		}
}
}