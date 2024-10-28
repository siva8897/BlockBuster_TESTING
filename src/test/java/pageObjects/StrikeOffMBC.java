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

public class StrikeOffMBC extends BasePage {

	public StrikeOffMBC(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(id = "strike_off_dd")

	WebElement linkStrikeoff;

	@FindBy(id = "search_mbc_number")

	WebElement txtSearchMBC;

	@FindBy(id = "search_btn")

	WebElement btnSearch;

	@FindBy(id = "ra_name_dd")

	WebElement drpReason;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-calendar']")

	WebElement calSelect;

	@FindBy(xpath = "//strong[@class='ng-binding']")

	WebElement calMonthYear;

	@FindBy(xpath = "//button[@ng-click='move(1)']")

	WebElement Next;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr/td")

	List<WebElement> DaySelect;

	@FindBy(id = "submit_btn")

	WebElement btnSumbit;

	@FindBy(xpath = "//div[normalize-space(text())=\"Strikeoff done successfully.\"]")

	WebElement alertMessage;

	public void SetStrikeoff() {

		linkStrikeoff.click();
	}

	public void SetSearchMBC(String SearchMBC) {

		txtSearchMBC.sendKeys(SearchMBC);
	}

	public void SetButton() {

		wait.until(ExpectedConditions.elementToBeClickable(btnSearch));

		btnSearch.click();
	}

	public void SetReason() {

		Select drop = new Select(drpReason);

		drop.selectByIndex(2);
	}

	public void SetCalander() {

		calSelect.click();

		String monthandYear = "April 2025";

		String day = "19";

		while (true) {

			String currentMonthYear = calMonthYear.getText();

			if (currentMonthYear.equals(monthandYear)) {

				break;
			}

			Next.click();
		}
		List<WebElement> dateData = new ArrayList<WebElement>(DaySelect);

		for (WebElement e : dateData) {

			if (e.getText().equals(day)) {

				e.click();

				break;
			}
		}

	}

	public void SetSumbitButton() {

		btnSumbit.click();
	}

	public String GetAlertMessage() {

		String alertmess = alertMessage.getText();

		try {
			return alertmess;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}