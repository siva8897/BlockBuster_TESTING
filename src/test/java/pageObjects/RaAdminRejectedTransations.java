package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class RaAdminRejectedTransations extends BasePage {

	public RaAdminRejectedTransations(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@ng-click=\"approvedList('reject')\"]")

	WebElement lnkReject;

	@FindBy(xpath = "//table[\"table table-bordered table-striped table-condensedtable-hover\"]//tbody//tr//td")

	List<WebElement> RejectedList;

	@FindBy(xpath = "//span[@aria-hidden=\"true\"]")

	WebElement lnkClose;

	@FindBy(xpath = "//a[@href=\"#/create-mbc/2709\"]")

	WebElement reject;
	
	@FindBy(id="mbc_shares_dd")
	
	WebElement drpMbcShares;
	
	@FindBy(xpath="//a[text()=\"Remove\"][1]")
	
	WebElement lnkButton;
	
	@FindBy(xpath="//button[text()=\"OK\"]")
	
	WebElement btnOk;
	
	@FindBy(id="other_business_purpose_tb")
	
	WebElement  txtpurpose;
	
	@FindBy(id="mbc_act_confirmation_cb")
	
	WebElement chkConfirmation;
	
	@FindBy(id="submit_btn")
	
	WebElement btnSumbit;
	
	@FindBy(xpath="//button[@class=\"btn btn-default\"]")
	
	WebElement btnClose;

	public void SetReject() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(lnkReject));

		lnkReject.click();

		Thread.sleep(5000);

	}

	public void SetRejectedList() {

		String MBCID = "2709";

		Set<WebElement> items = new HashSet<WebElement>(RejectedList);

		for (WebElement it : items) {
			try {

				if (MBCID.equals(it.getText())) {

					System.out.println(it.getText());

					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

					wait.until(ExpectedConditions.elementToBeClickable(it));

					it.click();

					lnkClose.click();

					wait.until(ExpectedConditions.elementToBeClickable(reject));

					reject.click();

				}
			} catch (StaleElementReferenceException e) {

			}
		}
	}
	
	public void SetSharesDropdown() {
		
		Select drop= new Select(drpMbcShares);
		
		drop.selectByVisibleText("6");
	}
	
	public void SetRemove() {
		
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(lnkButton));
		
		
		
		lnkButton.click();
	}
	
	public void SetOk() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(btnOk));
		
		btnOk.click();
		
	
	}
	
	public void SettxtPurpose(String Purpose) {
		
		 txtpurpose.clear();
		 
		 txtpurpose.sendKeys(Purpose);
		 
	}
	
	public void SetConfirm() {
		
		chkConfirmation.click();
	}
	
	public void SetSubmit() {
		
		btnSumbit.click();
	}
	
	public void SetClose() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(btnClose));
		
		btnClose.click();
	}

}
