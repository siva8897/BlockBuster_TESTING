package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class PortfolioTransactionSummary extends BasePage {

	public PortfolioTransactionSummary(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()='Portfolio Transaction Summary ']")

	WebElement mtPtransactionSummar;

	@FindBy(xpath = "//input[@ng-model='searchInput.mbcNumber']")

	WebElement mbcNumber;

	@FindBy(xpath = "//input[@ng-model='searchInput1.trasactionNumber']")

	WebElement transactionNumber;

	@FindBy(xpath = "//select[@ng-model='mbcDetails.paymentStatusCode']")

	WebElement dropPaymentStatus;

	@FindBy(id = "ra_dd")

	WebElement dropTranName;

	@FindBy(xpath = "//input[@ng-model= 'mbcDetails.raUserName']")

	WebElement txtUserName;

	@FindBy(id = "date_picker_btn")

	WebElement btnStratDate;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm uib-title']")

	WebElement MandY;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-chevron-left']")

	WebElement btnLeft;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr/td")

	List<WebElement> claList;
	
	@FindBy (xpath="//button[@ng-click='open2()']")
	
	WebElement btnEndDate;
	
	@FindBy (xpath="//button[@class='btn btn-default btn-sm uib-title']")
	
	WebElement monthYear;
	
	@FindBy (xpath="//i[@class='glyphicon glyphicon-chevron-left']")
	
	WebElement butleft;
	
	@FindBy (xpath="//table[@role='grid']/tbody/tr/td")
	
	List<WebElement> clkDay;
	
	@FindBy (id="search_btn")
	
	WebElement btnSearch;
	
	@FindBy (xpath="//center[text()='No results found.']")
	
	WebElement MessageAlert;
	

	public void SetPtransactonSummar() {

		mtPtransactionSummar.click();
	}

	public void SetmbcNumber(String Number) {

		mbcNumber.sendKeys(Number);
	}

	public void SetTransacionNumber(String trNumber) {

		transactionNumber.sendKeys(trNumber);
	}

	public void SetPaymentStatus() {

		Select drop = new Select(dropPaymentStatus);

		drop.selectByIndex(3);
	}

	public void SetTransactionName() {

		Select drop1 = new Select(dropTranName);

		drop1.selectByIndex(5);
	}

	public void SetUserName(String uName) {

		txtUserName.sendKeys(uName);
	}

	public void SetStartDate() {

		String monthAndYear = "October 2020";

		String day = "22";

		btnStratDate.click();

		while (true) {

			String currentMonth = MandY.getText();

			if (monthAndYear.equals(currentMonth)) {

				break;
			}

			btnLeft.click();
		}

		List<WebElement> test = new ArrayList<>(claList);

		for (WebElement e : test) {

			if (e.getText().equals(day)) {

				e.click();

				break;
			}
		}

	}
	
	public void SetEndDate() {
		
		String monthAndYear="March 2023";
		
		String day1="18";
		
		btnEndDate.click();
		
		while(true) {
			
		String	currentMonthYear=monthYear.getText();
			
			if(currentMonthYear.equals(monthAndYear)) {
				
				break;
			}
			
			butleft.click();
		}
		
		List<WebElement> test = new ArrayList<>(clkDay);

		for (WebElement e : test) {

			if (e.getText().equals(day1)) {

				e.click();

				break;
			}
		}
	}
	
	public void SetSearch() {
		
		btnSearch.click();
	}
	
	public String GetMessageAlert() {
		
		try {
			
			return(MessageAlert.getText());
		}
		
		catch(Exception e) {
			
			return(e.getMessage());
		}
	}

}
