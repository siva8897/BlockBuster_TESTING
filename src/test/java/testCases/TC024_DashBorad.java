package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.DashBorad;

public class TC024_DashBorad extends BaseClass{
	public DashBorad dashborad;
	
	
	@Test
	public void VerifyDashBorad() {
		
		try {
			
			logger.info("****Start in to DashBorad page Execution*****");
		loginWithAdmin();
		
		dashborad =new DashBorad(driver);
		
		dashborad.SetROCADashboard();
		
		dashborad.SetbtnMore1();
		
		dashborad.setRegistration();
		
		dashborad. dataTable();
		
		dashborad.SetReject();
		
	String AttualValue=	dashborad.SetRejectMBC();
	
	String expetedValue="MBC is Rejected";
	
	Assert.assertEquals(AttualValue, expetedValue);
	
	}
		catch(Exception e) {
			
			Assert.fail();
		}
	}
	
	
}
