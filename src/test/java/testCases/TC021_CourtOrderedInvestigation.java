package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CourtOrderInvestigation;
import pageObjects.InvestigateMBC;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC021_CourtOrderedInvestigation extends BaseClass{
	
	public LoginPage loginpage;
	
	public RegisterMBC registermbc;
	
	public InvestigateMBC investigate;
	
	public CourtOrderInvestigation investigation;
	
	
	@Test
	public void verifyCourtOrderInvestigation() {
		
		logger.info("****Start in to CourtOrder Investigation Execution*****");
		
		loginWithAdmin();
		
	    registermbc =new RegisterMBC(driver);
	    
	    registermbc.MenuButton();
	    
		investigate = new InvestigateMBC(driver);

		investigate.SetCourtOrder();
		
	    investigation= new CourtOrderInvestigation(driver);
	    
	    investigation.SetInvestigationOfMbc();
	    
	    investigation.SetSerchMBC("MBC623270264IND");
	    
	    investigation.SetButton();
	    
	    investigation.SetDataPicker();
	    
	    investigation.SetDefraud();
	    
	    investigation.SetFname();
	    
	    investigation.SetLname();
	   
	 
		
		
		
		
	}

}
