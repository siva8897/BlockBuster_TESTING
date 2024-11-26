package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.BVISFC;
import pageObjects.FAQs;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC020_FAQs extends BaseClass {

	public LoginPage loginpage;

	public RegisterMBC regMBC;

	public BVISFC bvisfc;
	
	public FAQs faqs;
@Ignore	
@Test
	public void verifyFAQs() {

	try {
		
	
		loginpage = new LoginPage(driver);

		loginpage.SetUserName("rocasuperuser");

		loginpage.SetPassword("Welcome_1!");

		loginpage.SetSingin();

		regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();

		bvisfc = new BVISFC(driver);

		bvisfc.SetBVIFSC();
		
		faqs = new FAQs(driver);
		
		faqs.SetFAQ();
		
		faqs.SetSerarch("Testing");
		
		faqs.GetOptions();
	}
	
	catch(Exception e) {
		
		Assert.fail();
	}
}
}
