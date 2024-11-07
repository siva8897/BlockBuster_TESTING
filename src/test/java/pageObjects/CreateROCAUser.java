package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;
import testCases.BaseClass;

public class CreateROCAUser extends BasePage {

	public CreateROCAUser(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "create_roca")

	WebElement lnkCreateRoca;

	@FindBy(id = "fname_tb")

	WebElement txtfName;

	@FindBy(id = "lname_tb")

	WebElement txtlName;

	@FindBy(id = "email_tb")

	WebElement txtEmail;

	@FindBy(id = "phn_number_tb")

	WebElement txtPhone;

	@FindBy(id = "fax_tb")

	WebElement txtFax;

	@FindBy(id = "role_type")

	WebElement drpRole;

	@FindBy(id = "username_tb")

	WebElement txtUserName;

	@FindBy(id = "save_button")

	WebElement sButton;

	@FindBy(xpath = "//button[text()=\"Submit\"]")

	WebElement butSubmit;

	@FindBy(xpath = "//div[contains(text(),\"Created Successfully\")]")

	WebElement alertMessage;

	public void SetCreateROCA() {

		lnkCreateRoca.click();
	}

	public void SetFName(String fName) {

		txtfName.sendKeys(fName);
	}

	public void SetLName(String lName) {

		txtlName.sendKeys(lName);
	}

	public void SetEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void SetPhone(String phone) {

		txtPhone.sendKeys(phone);
	}

	public void SetFax(String fax) {

		txtFax.sendKeys(fax);
	}

	public void SetRole() {

		Select drop = new Select(drpRole);

		drop.selectByIndex(1);
	}

	public void SetUName() {

		BaseClass bs = new BaseClass();

		String uName = bs.randomAlphbetics();

		txtUserName.sendKeys(uName);

	}

	public void SetSButton() {

		sButton.click();
	}

	public void SetButton() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(butSubmit));

		butSubmit.click();
	}

	public String GetAlertMessage() {

		String mes = "";

		String text[] = alertMessage.getText().split(" ");

		for (String e : text) {

			if (e.equals("Successfully")) {

				mes = e;

				return mes;
			}

			else {

				mes = "Not Successfully ROCA User Created";
			}

		}

		return mes;

	}

}
