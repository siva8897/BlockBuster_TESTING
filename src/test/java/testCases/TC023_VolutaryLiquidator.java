package testCases;

import org.testng.annotations.Test;

import pageObjects.CourtOrderTermination;
import pageObjects.RegisterMBC;

public class TC023_VolutaryLiquidator extends BaseClass {
	
	public CourtOrderTermination ordertermination;
	
	@Test
	public void verifyVolutaryLiquidator() {
	
	loginWithRaPractitioner();
	
	loginWithRaPractitioner();

	RegisterMBC regMBC = new RegisterMBC(driver);

	regMBC.MenuButton();

	ordertermination = new CourtOrderTermination(driver);

	ordertermination.SetLiquidate();

}
}