package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import testBase.BasePage;

public class BusinessPurpose extends BasePage {

	public BusinessPurpose(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "business_management")

	WebElement lnkBusinessPurpose;

	@FindBy(name = "businessPurp")

	WebElement txtBusinessPurp;

	@FindBy(id = "save_btn")

	WebElement btnSave;

	@FindBy(id = "enable_btn")

	WebElement butEnable;

	@FindBy(xpath = "//a[text()=\"Edit Business Purpose\"]")

	WebElement lnkEditBus;

	@FindBy(id = "business_purpose_dd")

	WebElement drpBusiness;

	@FindBy(id = "update_btn")

	WebElement butUpdate;

	@FindBy(xpath = "//div[normalize-space(text())=\"Business Purpose Updated Successfully\"][1]")

	WebElement txtMessage;

	@FindBy(xpath = "//a[text()=\"Disable a Business Purpose\"]")

	WebElement btnDisable;

	@FindBy(id = "dis_business_purpose_dd")

	WebElement drpBusinessPur;

	@FindBy(id = "disable_btn")

	WebElement btnDis;

	@FindBy(xpath = "//a[text()=\"Enable a Business Purpose\"]")

	WebElement btnEnble;

	@FindBy(id = "en_business_purpose_dd")

	WebElement drpPurpose;

	public void SetBusinessPurpose() {

		lnkBusinessPurpose.click();
	}

	public void SetBuinessPurp(String purp) {

		txtBusinessPurp.sendKeys(purp);
	}

	public void SetSaveButton() {

		btnSave.click();
	}

	public void SetEnable() {

		btnEnble.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(btnEnble));
	}

	public void SetCEnable() {

		butEnable.click();
	}

	public void SetPurpose() {

		Select drop1 = new Select(drpPurpose);

		drop1.selectByVisibleText("apple");
	}

	public void SetEditBus() {

		lnkEditBus.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(lnkEditBus));
	}

	public void SetBusinees() {

		Select drop = new Select(drpBusiness);

		drop.selectByVisibleText("apple");

	}

	public void SetButton() {

		butUpdate.click();
	}

	public String GetMessage() {

		try {

			return (txtMessage.getText());

		} catch (Exception e) {

			return (e.getMessage());
		}

	}

	public void SetDisable() {

		btnDisable.click();

	}

	public void SetdropDown() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeSelected(drpBusinessPur));

		Select drop3 = new Select(drpBusinessPur);

		drop3.selectByVisibleText("apple");
	}

	public void SetButtonDis() {

		btnDis.click();
	}

}
