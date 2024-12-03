package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.RAAdminDashBorad;
@Ignore
public class TC025_RAAdminDashBorad extends BaseClass{
	
	public RAAdminDashBorad raadmindashborad;
	
	@Test
	public void verifyRaAdmin() {
		
		loginWithRaAdmin();
		
	   raadmindashborad=new RAAdminDashBorad(driver);
	   
	   raadmindashborad.SetMoreButton();
	   
	  // raadmindashborad.GetApporved();
		
		
	}
	
	

}
