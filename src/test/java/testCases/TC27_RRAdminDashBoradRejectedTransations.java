package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.RaAdminRejectedTransations;

public class  TC27_RRAdminDashBoradRejectedTransations extends BaseClass {

	public 	RaAdminRejectedTransations raadminrejectedtransations;
	@Ignore
	@Test
	public void VerifyRejectedTransations() throws InterruptedException {
		
		try {
		
		loginWithRaAdmin();
		Thread.sleep(3000);
		
	    raadminrejectedtransations= new RaAdminRejectedTransations(driver);
	    
	    raadminrejectedtransations.SetReject();
	    
	    raadminrejectedtransations.SetRejectedList();
	    
	    //raadminrejectedtransations.SetSharesDropdown();
	    
	    //raadminrejectedtransations.SetRemove();
	    
	    //raadminrejectedtransations.SetOk();
	    
	    raadminrejectedtransations.SettxtPurpose("LossofMoney");
	    
	    raadminrejectedtransations.SetConfirm();
	    
	    raadminrejectedtransations.SetSubmit();
	    
	    raadminrejectedtransations.SetClose();
	    
	  
	}
		
		catch(Exception e) {
			
			Assert.fail();
		}
}
}