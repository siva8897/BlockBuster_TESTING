package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class AppointmentofLiquidator extends BasePage {

	public AppointmentofLiquidator(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()=\"Liquidate MBC\"]")

	WebElement lnkLiquidate;

	@FindBy(xpath = "//a[text()=\"Appointment of Liquidator\"]")

	WebElement lnkAppointmentLiq;

	@FindBy(id = "search_mbc_number")

	WebElement txtSearchMBCNum;

	@FindBy(id = "search_btn")

	WebElement btnSearchBtn;

	@FindBy(id = "date_picker_btn")

	WebElement DatPicker;

	@FindBy(xpath = "//strong[@class=\"ng-binding\"]")

	WebElement MonthYear;

	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-chevron-left\"]")

	WebElement Prv;

	@FindBy(xpath = "//table[@role=\"grid\"]")

	List<WebElement> Dates;

	@FindBy(name = "reasonForLiquidation")

	WebElement txtReason;

	@FindBy(id = "est_liq_days")

	WebElement txtEstimation;

	@FindBy(name = "assets")

	WebElement txtAssets;

	@FindBy(name = "liabilities")

	WebElement txtLiblitys;

	@FindBy(xpath = "//button[@ng-click=\"open()\"]")

	WebElement btnDatePicker;

	@FindBy(xpath = "//span[text()='15']")

	WebElement slsDay;

	@FindBy(id = "ra_pract")

	WebElement drpPract;

	@FindBy(name = "remuneration ")

	WebElement txtRemueration;

	@FindBy(name = "mbcCriteria")

	WebElement chcMBC;

	@FindBy(id = "submit_btn")

	WebElement btnSubmit;

	@FindBy(xpath = "//button[text()=\"Close\"]")

	WebElement btnClose;

	public void SetLiquidate() {

		lnkLiquidate.click();
	}

	public void SetAppointmentofLiq() {

		lnkAppointmentLiq.click();
	}

	public void SetSearchMBC(String searchMBC) {

		txtSearchMBCNum.sendKeys(searchMBC);
	}

	public void SetSearchBtn() {

		btnSearchBtn.click();
	}

	public void SetDatePicker() {

		DatPicker.click();

		String currentMonthYear = "November 2024";

		String date = "14";

		while (true) {

			if (currentMonthYear.equals(MonthYear.getText())) {

				break;

			}
			Prv.click();
		}

		List<WebElement> Day = new ArrayList<WebElement>(Dates);

		for (WebElement d : Day) {

			if (d.getText().equals(date))

				System.out.println(d.getText());

			d.click();

			break;
		}

	}

	public void SetReason(String reason) {

		txtReason.sendKeys(reason);
	}

	public void SetEasimation(String eastimation) {

		txtEstimation.sendKeys(eastimation);
	}

	public void SetAsserts(String asserts) {

		txtAssets.sendKeys(asserts);
	}

	public void SetLaiblitys(String labiltys) {

		txtLiblitys.sendKeys(labiltys);
	}

	public void SetDatePickers() {

		btnDatePicker.click();

		slsDay.click();
	}

	public void SetrParct() {

		Select drop = new Select(drpPract);

		drop.selectByIndex(1);
	}

	public void SetRemuration(String remunartion) {

		txtRemueration.sendKeys(remunartion);
	}

	public void SetMBC() {

		chcMBC.click();
	}

	public void SetSubmit() {

		btnSubmit.click();
	}

	public void SetClose() {

		btnClose.click();
	}

}
