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

@Test
	public void verifyFAQs() {

	try {
		
		logger.info("****Start in to FAQS Page Execution*****");
	
		loginWithAdmin();

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
