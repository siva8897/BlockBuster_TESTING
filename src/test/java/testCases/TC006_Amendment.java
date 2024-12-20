package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.Amendment;
import pageObjects.AnnualReturn;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC006_Amendment extends BaseClass{
	
	public LoginPage loginpage;
	
	public RegisterMBC registermbc;
	
	public Amendment amendment;
	
	public AnnualReturn annualreturn;
	
	
    @Test(groups="regression")
	public void verify_Amendment() throws Exception {
		
	    try {
	    	
	    	logger.info("****Start in to Amendment page Execution*****");
	    
	    loginWithAdmin();
		
		registermbc = new RegisterMBC(driver);
		
		registermbc.MenuButton();
		
		registermbc.MBCMangMenu();
		
		amendment = new Amendment(driver);
		
		amendment.setAmendment();
		
		amendment.setMBCNumber("MBC606784926IND");
		Thread.sleep(2000);
		
	    annualreturn= new AnnualReturn(driver);
		
		annualreturn.SetSearch();
		
		amendment = new Amendment(driver);
		
		amendment.setReplce("consignment");
		
		amendment.setConfrimcheck();
		
		annualreturn= new AnnualReturn(driver);
		
		annualreturn.setReview();
		Thread.sleep(2000);
		
		amendment = new Amendment(driver);
		
		amendment.setClose();
		
	}
	    catch (Exception e) {

			Assert.fail();
	    
}

}
}
