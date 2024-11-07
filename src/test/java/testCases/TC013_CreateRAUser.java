package testCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.CreateRAUser;
import pageObjects.CreateRegAgent;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC013_CreateRAUser extends BaseClass{

	@Test
	public void verify_CreateRAUser() {
	
	try {
		
	
	LoginPage loginpage = new LoginPage(driver);

	loginpage.SetUserName("rocasuperuser");
	loginpage.SetPassword("Welcome_1!");
	loginpage.SetSingin();
	
	RegisterMBC registerMBC = new RegisterMBC(driver);

	registerMBC.MenuButton();

	CreateRegAgent crAgent = new CreateRegAgent(driver);

	crAgent.SetRegAgent();
	
	CreateRAUser createrauser= new CreateRAUser(driver);
	
	createrauser.SetCreateRaAgent();
	
	createrauser.SelectRegestAgent();
	
	createrauser.SetFirstName("Tom");
	
	createrauser.SetLastName("Latham");
	
	createrauser.SetEmail("Testing@gmail.com");
	
	createrauser.SetPhoneNum("7845129645");
	
	createrauser.SetFax("TFX7455");
	
	createrauser.SetdrpRole();
	
	createrauser.SetUserName();
	
	createrauser.SetPassword("Test@123");
	
	createrauser.SetConfPassword("Test@123");
	
	createrauser.SetPassQue("Quen1234");
	
	createrauser.SetAwsPaa("Awser1234");
	
	} catch (Exception e) {

		Assert.fail();
	}	

}
}