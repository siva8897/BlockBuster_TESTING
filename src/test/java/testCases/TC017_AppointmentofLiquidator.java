package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.AppointmentofLiquidator;
import pageObjects.LoginPage;
import pageObjects.RegisterMBC;

public class TC017_AppointmentofLiquidator extends BaseClass{
	
	public AppointmentofLiquidator appointmentofliquidator;

	
	@Test
	public void verifyAppointmentofLiquidator() {
		
		try {
		
		loginWithAdmin();
		
		RegisterMBC regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();
		
	    appointmentofliquidator= new  AppointmentofLiquidator(driver);
	    
	    appointmentofliquidator.SetLiquidate();
	    
	    appointmentofliquidator.SetAppointmentofLiq();
	    
	    appointmentofliquidator.SetSearchMBC("MBC973729665IND");
	    
	    appointmentofliquidator.SetSearchBtn();
	    
	    appointmentofliquidator.SetDatePicker();
	    
	    appointmentofliquidator.SetReason("BusinessLoss");
	    
	    appointmentofliquidator.SetEasimation("15");
	    
	    appointmentofliquidator.SetAsserts("20000");
	    
	    appointmentofliquidator.SetLaiblitys("10000");
	    
	    appointmentofliquidator.SetDatePickers();
	    
	    appointmentofliquidator.SetrParct();
	    
	    appointmentofliquidator.SetRemuration("5000");
	    
	    appointmentofliquidator.SetMBC();
	    
	    appointmentofliquidator.SetSubmit();
	    
	    appointmentofliquidator.SetClose();
		
	}
		
		catch(Exception e) {
			
			Assert.fail();
		}
}
}