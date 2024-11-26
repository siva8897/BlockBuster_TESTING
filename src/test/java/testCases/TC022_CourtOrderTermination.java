package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC022_CourtOrderTermination extends BaseClass {
	
	public LoginPage loginpage;
	@Test
	public void verifyCourtOrderTermination() {
		
	 loginpage= new LoginPage(driver);
	 
	 loginpage.SetUserName("rapractitioner");
	 
	 loginpage.SetPassword("Welcome_1!");
	 
	 loginpage.SetSingin();
	}
	

}
