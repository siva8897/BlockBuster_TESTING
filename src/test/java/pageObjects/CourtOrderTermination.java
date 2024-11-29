package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class CourtOrderTermination extends BasePage {

	public CourtOrderTermination(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//span[text()=\"Liquidate MBC\"]")

	WebElement lnkLiquidate;

	@FindBy(id = "vl_termination")

	WebElement lnkTermination;

	@FindBy(id = "search_mbc_number")

	WebElement txtSearchmbc;

	@FindBy(id = "search_btn")

	WebElement btnSearch;

	@FindBy(id = "termination_date_picker_btn")

	WebElement btnDataPicker;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm uib-title\"]")

	WebElement txtMonthYear;

	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-chevron-left\"]")

	WebElement Prev;

	@FindBy(xpath = "//table[@role=\"grid\"]//tbody/tr/td")

	List<WebElement> table;

	@FindBy(name = "courtOrderTerminationDoc")

	WebElement txtFile;

	@FindBy(id = "court_order_date_picker_btn")

	WebElement btnPicker;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm uib-title\"]")

	WebElement txtMY;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm pull-right uib-right\"]")

	WebElement Next;

	@FindBy(xpath = "//table[@role=\"grid\"]//tbody//tr//td")

	List<WebElement> totalDays;

	@FindBy(xpath = "//input[@name=\"reasonForTermination\"]")

	WebElement txtReason;

	@FindBy(id = "submit_btn")

	WebElement btnSubmit;

	@FindBy(xpath = "//button[text()=\"Submit Payment\"]")

	WebElement sumbit;

	@FindBy(xpath = "//div[@class=\"alert alert-success Issuance-true-div ng-binding\"]")

	WebElement txtMessage;

	public void SetLiquidate() {

		lnkLiquidate.click();
	}

	public void SetTermination() {

		lnkTermination.click();
	}

	public void SetSearchmbc(String mbcNumber) {

		txtSearchmbc.sendKeys(mbcNumber);
	}

	public void SetSearch() {

		btnSearch.click();
	}

	public void SetCalcuter() {

		btnDataPicker.click();

		String monthYear = "November 2016";

		String Day = "14";

		while (true) {

			String mandY = txtMonthYear.getText();

			if (monthYear.equals(mandY)) {

				break;
			}

			Prev.click();

		}

		List<WebElement> item = new ArrayList<WebElement>(table);

		for (WebElement it : item) {

			if (it.getText().equals(Day)) {

				it.click();

				break;
			}
		}
	}

	public void fileTest() {

		String filePath = "E:/myfiles/TeamRanking.xlsx";

		txtFile.sendKeys(filePath);

	}

	public void SetCalcuter1() {

		btnPicker.click();

		String monthAndYear = "November 2026";

		String Day = "15";

		while (true) {

			if (txtMY.getText().equals(monthAndYear)) {

				break;
			}

			Next.click();
		}

		List<WebElement> items = new ArrayList<WebElement>(totalDays);

		for (WebElement it : items) {

			if (it.getText().equals(Day)) {

				it.click();

				break;
			}
		}

	}

	public void Setreson(String reason) {

		txtReason.sendKeys(reason);
	}

	public void SetSubmit() {

		btnSubmit.click();
	}

	public void Submited() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(sumbit));

		sumbit.click();
	}

	public String getMessageDes() {

		String messagetxt = txtMessage.getText();

		return messagetxt;
	}
}