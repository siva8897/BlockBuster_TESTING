package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.RaAdminPendingTranctions;

public class TC26_RAAdminDashBoradPendingTransactions extends BaseClass  {
	
	public RaAdminPendingTranctions raadminpendingtranctions;
	@Ignore
	@Test
	public void VerifyPendingTransactions() throws InterruptedException {
		
		try {
			
		
		loginWithRaAdmin();
		Thread.sleep(3000);
		
	    raadminpendingtranctions= new RaAdminPendingTranctions(driver);
		
		raadminpendingtranctions.SetPending();
		
		raadminpendingtranctions.SetTransactionType("MBC436850294AUT");
		
		raadminpendingtranctions.SetMBCID();
		
		raadminpendingtranctions.SetClose();
	}

		catch (Exception e) {

			Assert.fail();
		}
	}
	
}
