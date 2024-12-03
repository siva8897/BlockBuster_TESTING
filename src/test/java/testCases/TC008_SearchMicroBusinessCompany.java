package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.RegisterMBC;
import pageObjects.SearchMicroBusinessCompany;

public class TC008_SearchMicroBusinessCompany extends BaseClass {

	public RegisterMBC registermbc;
	
	public LoginPage loginpage;
	
	public SearchMicroBusinessCompany SMBC;
	
   
	@Test(groups ="regression")
	public void verify_SearchMicroBusinessCompany() {
		
	
	try {
		
	loginWithAdmin();
	
	registermbc = new RegisterMBC(driver);

	registermbc.MenuButton();
	
    SMBC= new SearchMicroBusinessCompany(driver);
    
    SMBC.setMpManagement();
    
    SMBC.setMicroBusiness();
  
    SMBC.setMbcNumber("MBC606784926IND");
    
    SMBC.setNationality("A.J.K. Corporate Services (BVI) Limited");
    
    SMBC.setBusinessAs("Alumaniam");

	SMBC.SetCompanyStatus();
	
	SMBC.setBusinessOpeation();
	
	SMBC.setdropNationality();
	
	SMBC.setBuiness();
	
	SMBC.setStartDate();
	
	SMBC.SetEndDate();
	
	SMBC.setButton();

}

	
	catch(Exception e) {
		
		Assert.fail();
	}
}
}