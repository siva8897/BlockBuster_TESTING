package testCases;

import org.testng.annotations.Test;

import pageObjects.InvestigateMBC;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC012_InvestigateMBC extends BaseClass{
	
	public InvestigateMBC investigate;

	@Test
	public void Verify_TransferShares() {
		

		
	LoginPage loginpage = new LoginPage(driver);

	loginpage.SetUserName("rocasuperuser");
	loginpage.SetPassword("Welcome_1!");
	loginpage.SetSingin();
	
	RegisterMBC regMBC = new RegisterMBC(driver);

	regMBC.MenuButton();
	
     investigate=new InvestigateMBC(driver);
     
     investigate.SetCourtOrder();
     
     investigate.SetInvestigate();
     
     investigate.SetMBCNumber("MBC606784926IND");
     
     investigate.SearchButton();
     
     investigate.SetCalSelect();
     
     investigate.SetDefraud();

	

}
}