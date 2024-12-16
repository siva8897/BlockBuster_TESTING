package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class RaAdminPendingTranctions extends BasePage {

	public RaAdminPendingTranctions(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy (xpath="//a[@ng-click=\"approvedList('pending')\"]")
	
	WebElement btnPending;
	
	@FindBy (xpath="//input[@ng-model=\"mbcNum\"]")
	
	WebElement txtTransactionType;
	
	@FindBy (xpath="//a[text()=\"MBC436850294AUT\"]")
	
	WebElement lnkMBCID;
	
	@FindBy (xpath="//span[@aria-hidden=\"true\"]")
	
	WebElement lnkClose;
	
	public void SetPending() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(btnPending));
		
		btnPending.click();
		
	}
	
	public void SetTransactionType(String id) {

	txtTransactionType.sendKeys(id);
}
	
	public void SetMBCID() {
		
		lnkMBCID.click();
		
	}
	
	public void SetClose() {
		
		lnkClose.click();
	}
}