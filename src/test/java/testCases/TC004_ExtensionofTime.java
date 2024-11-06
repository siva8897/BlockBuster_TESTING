package testCases;

import static org.testng.Assert.assertEquals;



import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pageObjects.ExtensionofTime;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC004_ExtensionofTime extends BaseClass {

	
	@Ignore
	@Test(groups="regression")

	public void Verify_ExtensionofTime() throws Exception {
		
		try {

		LoginPage loginpage = new LoginPage(driver);

		loginpage.SetUserName("rocasuperuser");

		loginpage.SetPassword("Welcome_1!");

		loginpage.SetSingin();

		RegisterMBC regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();

		regMBC.MBCMangMenu();

		ExtensionofTime extoftime = new ExtensionofTime(driver);

		extoftime.SetExtensionofTime();

		extoftime.SetMBCNumber("MBC606784926IND");

		Thread.sleep(2000);

		extoftime.SetSearch();

		extoftime.SetYear();

		extoftime.SetReason();

		extoftime.SettimeReq("20");

		extoftime.SetAgent();
		Thread.sleep(2000);

		extoftime.SetMBCA();
		Thread.sleep(2000);

		extoftime.SetRegEnt();

		extoftime.SetRegisterAgent();

		String attualText = extoftime.GetH2RegisterAgent();
		
		System.out.println(attualText);

		assertEquals(attualText, "Registered Agents");
	}
		
		catch(Exception e) {
			
			Assert.fail();
		}
	}
	
	
}
