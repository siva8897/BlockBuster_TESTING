package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;
import testCases.BaseClass;

public class Amendment extends BasePage {

	public Amendment(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(id = "charter_amendment_dd")

	WebElement miAmendment;

	@FindBy(name = "incorporationsList")

	WebElement txtMBCNumber;

	@FindBy(name = "doingBusinessAs")

	WebElement txtReplce;

	@FindBy(name = "mbcCriteria")

	WebElement chekConfrim;

	@FindBy(xpath = "//button[text()='Close']")

	WebElement butClose;

	public void setAmendment() {

		miAmendment.click();
	}

	public void setMBCNumber(String mNumber) {

		txtMBCNumber.sendKeys(mNumber);
		
	}

	public void setReplce(String BusineesAs) {

		txtReplce.clear();

		BaseClass baseclass = new BaseClass();

		String test1 = baseclass.randomAlphbetics();

		txtReplce.sendKeys(test1);
	}

	public void setConfrimcheck() {

		chekConfrim.click();
	}

	public void setClose() {

		butClose.click();
	}
}
