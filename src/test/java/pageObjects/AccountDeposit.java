package pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class AccountDeposit extends BasePage {

	public AccountDeposit(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()=\" Account Management \"]")

	WebElement lnkAccountMangement;

	@FindBy(id = "add_funds_tab")

	WebElement lnkAccountDeposit;

	@FindBy(xpath = "//input[@name='AMOUNT']")

	WebElement txtAmount;

	@FindBy(xpath = "//button[text()=\"Purchase\"]")

	WebElement btnPurchage;

	@FindBy(id = "cc_number")

	WebElement txtNumber;
	
	@FindBy(id="expdate_month")
	
	WebElement txtMonth;
	
	@FindBy(id="expdate_year")
	
	WebElement txtYear;
	
	@FindBy(id="first_name")
	
	WebElement txtFirstName;
	
	@FindBy(id="last_name")
	
	WebElement txtLastName;
	
	@FindBy(xpath="//a[text()=\"PayPal Privacy Statement\"]")
	
	WebElement lnkPrivacy;

	public void setAccountDeposit() {

		lnkAccountMangement.click();
	}

	public void setAaddFunds() {

		lnkAccountDeposit.click();
	}

	public void SetAmount(String Amount) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(txtAmount));

		txtAmount.sendKeys(Amount);
	}

	public void SetPurchage() {

		if (btnPurchage.isEnabled()) {

			btnPurchage.click();
		}

		else {

			System.out.println("Button is now Disable pleas Enabled button");
		}

	}

	public void windowsTest(String number) {

		String parentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			String childWindow = it.next();

			if (!parentWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(txtNumber));

				txtNumber.sendKeys(number);
			}
		}
	}
	
	public void setMonth(String month) {
		
		txtMonth.sendKeys(month);
	}
	
	public void setYear(String year) {
		
		txtYear.sendKeys(year);
	}
	
	public void setFirst(String firstName) {
		
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		
		txtLastName.sendKeys(lastName);
	}
	
	public void setPolicy() {
		
		lnkPrivacy.click();
	}

}
