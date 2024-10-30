package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class InvestigateMBC extends BasePage {

	public InvestigateMBC(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()=' Court Order Investigation ']")

	WebElement MenuCourtOrder;

	@FindBy(xpath = "//a[text()='Investigate MBC']")

	WebElement Investigate;

	@FindBy(id = "search_mbc_number")

	WebElement txtSearchmbcNumber;

	@FindBy(id = "search_btn")

	WebElement btnSearch;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-calendar']")

	WebElement CalSelect;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm uib-title']")

	WebElement MonthandYear;

	@FindBy(xpath = "//button[@ng-click=\"move(1)\"]")

	WebElement RightMove;

	@FindBy(xpath = "//table[@role=\"grid\"]//tbody/tr/td")

	List<WebElement> CalDay;

	@FindBy(id = "defraud")

	WebElement chkDefraud;

	@FindBy(id = "mbc_inspectorFName_tb")

	WebElement txtInspectorFName;

	@FindBy(id = "mbc_inspectorLName_tb")

	WebElement txtLName;

	@FindBy(id = "submit_btn")

	WebElement btnSubmit;

	@FindBy(xpath = "//div[normalize-space(text())='Application to the court for Investigation is Successful']")

	WebElement alertMessage;

	public void SetCourtOrder() {

		MenuCourtOrder.click();
	}

	public void SetInvestigate() {

		Investigate.click();
	}

	public void SetMBCNumber(String number) {

		txtSearchmbcNumber.sendKeys(number);
	}

	public void SearchButton() {

		btnSearch.click();
	}

	public void SetCalSelect() {

		CalSelect.click();

		String Year = "October 2026";

		String Day = "14";

		while (true) {

			String currentYear = MonthandYear.getText();

			if (currentYear.equals(Year)) {

				break;
			}

			RightMove.click();
		}

		List<WebElement> test = new ArrayList<WebElement>(CalDay);

		for (WebElement e : test) {

			if (e.getText().equals(Day)) {

				e.click();

				break;
			}
		}

	}

	public void SetDefraud() {

		chkDefraud.click();
	}

	public void SetFirstName(String fName) {

		txtInspectorFName.sendKeys(fName);
	}

	public void SetLastName(String lName) {

		txtLName.sendKeys(lName);
	}

	public void SetSumbit() {

		btnSubmit.click();
	}

	public String GetAlertMgs() {

		try {
			return alertMessage.getText();
		}

		catch (Exception e) {

			return e.getMessage();
		}

	}
}
