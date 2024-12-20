package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pageObjects.AccountDeposit;
import pageObjects.AnnualFeePayment;
import pageObjects.RegisterMBC;

public class TC29_AnnualFeePayment extends BaseClass{
	
	public AccountDeposit accountdeposit;
	
	public AnnualFeePayment annualfeepayment;

	@Ignore
	@Test
	public void verifyAnnualFeePayment() throws Exception {
		
		loginWithRaAdmin();
		Thread.sleep(3000);

		RegisterMBC regMBC = new RegisterMBC(driver);

		regMBC.MenuButton();
		
		accountdeposit = new AccountDeposit(driver);

		accountdeposit.setAccountDeposit();
		
	    annualfeepayment= new AnnualFeePayment(driver);
	    
	    annualfeepayment.SetAnualFeePayment();
	    
	    annualfeepayment.SetRbtnBulk();
	    
	    annualfeepayment.setSubmit();
	    
	    annualfeepayment.setFromDatePicker();
	    
	    annualfeepayment.setToDatePicker();
	    
	    annualfeepayment.SetSearch();
	    
	    annualfeepayment.SetApply();
	    
	    annualfeepayment.SetSearchclick();  
	}
}
