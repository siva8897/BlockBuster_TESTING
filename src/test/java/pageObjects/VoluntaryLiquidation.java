package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class VoluntaryLiquidation extends BasePage {

	public VoluntaryLiquidation(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//img[@src='assets/images/hamburger.png']")

	WebElement Menu;

	@FindBy(id = "vl_resignation")

	WebElement lnkvlResignation;

	@FindBy(id = "search_mbc_number")

	WebElement txtSearchMBC;

	@FindBy(id = "search_btn")

	WebElement btnSearch;

	@FindBy(id = "date_picker_btn")

	WebElement btnDatePicker;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm uib-title\"]")

	WebElement MonthandYear;

	@FindBy(xpath = "//i[@class=\"glyphicon glyphicon-chevron-right\"]")

	WebElement btnRight;

	@FindBy(xpath = "//table[@role=\"grid\"]//tbody//tr//td")

	List<WebElement> txtDay;

	@FindBy(name = "reasonForResignation")

	WebElement reasonforRes;

	@FindBy(name = "raPract")

	WebElement drpraPract;
	
	@FindBy(name="mbcCriteria")
	
	WebElement chkCriteria;
	
	@FindBy(id="submit_btn")
	
	WebElement btnSubmit;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
	
	WebElement btnPaymet;
	
	@FindBy(xpath="//div[normalize-space(text())=\"mbcId should be +ve numeric value.\"]")
	
	WebElement txtMessage;

	public void SetMenu() {

		try {
			
	        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.elementToBeClickable(Menu));

			Menu.click();
		}

		catch (StaleElementReferenceException e) {
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.elementToBeClickable(Menu));

			Menu = driver.findElement(By.xpath("//img[@src='assets/images/hamburger.png']"));

			Menu.click();
		}

	}

	public void SetVlResignation() {

		lnkvlResignation.click();
	}

	public void SetSearchMBC(String searchNumber) {

		txtSearchMBC.sendKeys(searchNumber);
	}

	public void SetSearch() {

		btnSearch.click();
	}

	public void SetDatePicker() {

		btnDatePicker.click();

		String MonthYear = "December 2025";

		String Day = "16";

		while (true) {

			if (MonthandYear.getText().equals(MonthYear)) {

				break;
			}

			btnRight.click();

		}
		List<WebElement> items = new ArrayList<WebElement>(txtDay);

		for (WebElement its : items) {

			if (its.getText().equals(Day)) {

				its.click();
				
				break;

			}

		}

	}

	public void SetreasonforRes(String reason) {
		
		reasonforRes.sendKeys(reason);

		
	}

	public void SetdrpraPract() {

		Select drop = new Select(drpraPract);

		drop.selectByValue("object:346");
	}
	
	public void SetCheckBox() {
		
		chkCriteria.click();
	}
	
	public void SetSubmit() {
		
		btnSubmit.click();
	}

	public void SetPayment() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(btnPaymet));
		
		btnPaymet.click();
	}
	
	public String SetMessage() {
		
	String message=	txtMessage.getText();
		
		return message;
	}
}
