package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class TransferShares extends BasePage {

	public TransferShares(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath = "//span[text()='MBC Disposition']")

	WebElement MenuitemMDisposition;

	@FindBy(xpath = "//a[text()='Transfer Shares']")

	WebElement linkTransferShares;

	@FindBy(id = "search_mbc_number")

	WebElement txtMBCNumber;

	@FindBy(id = "update_btn")

	WebElement btnUpdate;

	@FindBy(id = "applyForDispositionOfSahres")

	WebElement ckPName;

	@FindBy(id = "ra_name_dd")

	WebElement dropReason;

	@FindBy(id = "date_picker_btn")

	WebElement DatePickerbtn;

	@FindBy(xpath = "//strong[@class='ng-binding']")

	WebElement calMonthandYear;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-chevron-left']")

	WebElement nextButton;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr/td")

	List<WebElement> calDate;

	@FindBy(xpath = "//input[@value='Dissolve']")

	WebElement rbtnDisslove;
	
	@FindBy(name="mbcCriteria")
	
	WebElement chkConfiram;
	
	@FindBy(id="submit_btn")
	
	WebElement btnReview;
	
	@FindBy (xpath="//button[@ng-click='dispostionSubmission()']")
	
	WebElement btnSubmit;
	
	

	public void SetDisposition() {

		MenuitemMDisposition.click();
	}

	public void SetTransferShares() {

		linkTransferShares.click();
	}

	public void SetMBCNumber(String number) {

		txtMBCNumber.sendKeys(number);

	}

	public void SetUpdateBut() {

		wait.until(ExpectedConditions.elementToBeClickable(btnUpdate));

		btnUpdate.click();

	}

	public void SetDispositionOfSahres() {

		ckPName.click();
	}

	public void SetReason() {

		Select drop = new Select(dropReason);

		drop.selectByIndex(2);
	}

	public void SetDatePicker() throws InterruptedException {

		String day = "14";

		String monthandYear = "November 2017";

		DatePickerbtn.click();

		while (true) {

			String currentMonthandYear = calMonthandYear.getText();

			if (currentMonthandYear.equals(monthandYear)) {

				break;
			}

			nextButton.click(); // MonthandYear

		}

		List<WebElement> dateData = new ArrayList<WebElement>(calDate);

		for (WebElement e : dateData) {

			String currentdateName = e.getText();

			if (currentdateName.equals(day)) {

				e.click(); // Date

				break;
			}

		}

	}

	public void SetDissolve() {

		rbtnDisslove.click();
	}
	
	public void SetConfiram() {
		
		chkConfiram.click();
	}
	
	public void SetButton() {
		
		btnReview.click();
	}
	
	public void SetSubmit() {
		
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		
		btnSubmit.click();
	}

}
