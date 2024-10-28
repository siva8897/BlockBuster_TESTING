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

public class SearchMicroBusinessCompany extends BasePage {

	public SearchMicroBusinessCompany(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath = "//span[text()=' MBC Portfolio Management ']")

	WebElement MitemMPManagement;

	@FindBy(xpath = " //a[text()='Search Micro Business Company']")

	WebElement MicroBusiness;

	@FindBy(xpath = "//input[@ng-model='mbcDetails.mbcNumber']") 

	WebElement txtmbcNumber;

	@FindBy(xpath = "//input[@ng-model='mbcDetails.principalName']")  

	WebElement txtPNationlity;

	@FindBy(xpath = "//input[@ng-model='mbcDetails.doingBusinessAs']")

	WebElement txtBusinessAs;

	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")

	WebElement dropStatus;

	@FindBy(xpath = "//div[@class='row form-group']//div[1]//div[1]//div[4]//select[1]")

	WebElement dropOpertion;

	@FindBy(xpath = "//div[@class='row']//div[2]//div[1]//div[4]//select[1]")

	WebElement dropNationality;

	@FindBy(xpath = "//select[@id='mbc_business_purpose_dd']")

	WebElement dropBusinessPurpose;

	@FindBy(xpath = "//button[@id='date_picker_btn']//i[@class='glyphicon glyphicon-calendar']")

	WebElement calStartDate;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm uib-title']")

	WebElement MonthandYear;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")

	WebElement NextButton;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr/td")

	List<WebElement> DayN;

	@FindBy(xpath = "//button[@id='date_picker_btn_to_dtae']//i[@class='glyphicon glyphicon-calendar']")

	WebElement calEndDate;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm uib-title\"]")

	WebElement EMonthandYear;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")

	WebElement leftButton;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr/td")

	List<WebElement> DayNum;
	
	@FindBy(id="search_btn")
	
	WebElement btnSerach;

	public void setMpManagement() {

		MitemMPManagement.click();
	}

	public void setMicroBusiness() {

		MicroBusiness.click();
	}

	public void setMbcNumber(String mbcNum) {

		txtmbcNumber.sendKeys(mbcNum);
	}

	public void setNationality(String nationality) {

		// wait.until(ExpectedConditions.textToBePresentInElement(txtPNationlity,
		// nationality));
		txtPNationlity.sendKeys(nationality);

	}

	public void setBusinessAs(String BAs) {

		txtBusinessAs.sendKeys(BAs);
	}

	public void SetCompanyStatus() {

		Select drop = new Select(dropStatus);

		drop.selectByIndex(2);
	}

	public void setBusinessOpeation() {

		Select drop1 = new Select(dropOpertion);

		drop1.selectByIndex(10);
	}

	public void setdropNationality() {

		Select drop2 = new Select(dropNationality);

		drop2.selectByIndex(12);
	}

	public void setBuiness() {

		Select drop3 = new Select(dropBusinessPurpose);

		drop3.selectByIndex(8);
	}

	public void setStartDate() {

		String monthandYear = "September 2017";

		String day = "16";

		calStartDate.click();

		while (true) {

			String currentMY = MonthandYear.getText();

			if (currentMY.equals(monthandYear)) {

				break;
			}

			NextButton.click();

		}

		List<WebElement> DayNum = new ArrayList<WebElement>(DayN);

		for (WebElement e : DayNum) {

			if (e.getText().equals(day)) {

				e.click();

				break;
			}
		}

	}

	public void SetEndDate() {

		String EmonthandYear = "February 2023";

		String Eday = "18";

		calEndDate.click();

		while (true) {

			if (EMonthandYear.getText().equals(EmonthandYear)) {

				break;
			}

			leftButton.click();

		}
		
		List<WebElement> EDayNum= new ArrayList<WebElement>(DayNum);
		
		for(WebElement e: EDayNum) {
			
			if(e.getText().equals(Eday)) {
				
				e.click();
				
				break;
			}
		}

	}
	
	public void setButton() {
		
		btnSerach.click();
	}

}
