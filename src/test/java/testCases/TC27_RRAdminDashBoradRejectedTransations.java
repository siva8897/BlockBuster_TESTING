package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.RaAdminRejectedTransations;

public class  TC27_RRAdminDashBoradRejectedTransations extends BaseClass {

	public 	RaAdminRejectedTransations raadminrejectedtransations;
	
	@Test
	public void VerifyRejectedTransations() throws InterruptedException {
		
		
		
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
}
