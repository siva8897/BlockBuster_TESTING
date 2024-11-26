package testCases;



import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.BVISFC;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;


public class TC019_BVISFC extends BaseClass {


public LoginPage loginpage;

public RegisterMBC regMBC;

public BVISFC bvisfc;
@Ignore
@Test
	public void verifyBVISFC() {
	
	try {
		
	
	 loginpage=new LoginPage(driver);
	 
	 loginpage.SetUserName("rocasuperuser");
	 
	 loginpage.SetPassword("Welcome_1!");
	 
	 loginpage.SetSingin();
	 
	 regMBC = new RegisterMBC(driver);

	 regMBC.MenuButton();
	 
	 bvisfc= new BVISFC(driver);
	 
	 bvisfc.SetBVIFSC();
	 
	 bvisfc. SetFSC();
	 
	 bvisfc.SetSearch("Testing");
	 
	}
	
	catch(Exception e) {
		
		Assert.fail();
	}
}
}