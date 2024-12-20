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

public class AnnualFeePayment extends BasePage {

	public AnnualFeePayment(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "collection_of_mbc_annual_payment")

	WebElement lnkAnualFeePayment;

	@FindBy(id = "bulkFiling")

	WebElement RbtnBulk;

	@FindBy(id = "submit_btn")

	WebElement btnSubmit;

	@FindBy(id = "date_picker_btn")

	WebElement btndatePicker;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm uib-title\"]")

	WebElement PrvMonthYear;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm pull-left uib-left\"]")

	WebElement PrvButton;

	@FindBy(xpath = "//table[@role=\"grid\"]//tbody/tr/td")

	List<WebElement> Days;

	@FindBy(id = "date_picker_btn_to_dtae")

	WebElement tobtndatePicker;

	@FindBy(id = "search_btn")

	WebElement btnSearch;

	@FindBy(xpath= "//table[@ng-if=\"displayMbcist\"]//tr[1]/td[1]")

	WebElement chkApply;
	
	@FindBy(id="search_btn")
	
	WebElement btnserchClick;

	public void SetAnualFeePayment() {

		lnkAnualFeePayment.click();
	}

	public void SetRbtnBulk() {

		RbtnBulk.click();
	}

	public void setSubmit() {

		btnSubmit.click();
	}

	public void setFromDatePicker() {

		btndatePicker.click();

		String monthYear = "August 2022";

		String day = "15";

		while (true) {

			if (PrvMonthYear.getText().equals(monthYear)) {

				break;
			}

			PrvButton.click();

		}

		List<WebElement> items = new ArrayList<WebElement>(Days);

		for (WebElement item : items) {

			if (item.getText().equals(day)) {

				item.click();
				break;
			}
		}

	}

	public void setToDatePicker() {

		tobtndatePicker.click();

		String monthYear = "July 2023";

		String day = "12";

		while (true) {

			if (PrvMonthYear.getText().equals(monthYear)) {

				break;
			}

			PrvButton.click();

		}

		List<WebElement> items = new ArrayList<WebElement>(Days);

		for (WebElement item : items) {

			if (item.getText().equals(day)) {

				item.click();
				break;
			}
		}

	}

	public void SetSearch() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(btnSearch));

		btnSearch.click();
	}

	public void SetApply() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(chkApply));
		
		chkApply.click();

	}
	
	public void SetSearchclick() {
		
		
		btnserchClick.click();
	}

}
