package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;
import testCases.BaseClass;

public class ModifyROCAUser extends BasePage {

	public ModifyROCAUser(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "modify_roca_users_super")

	WebElement lnkModifyUser;

	@FindBy(xpath = "//select[@id='roca_user_type']")

	WebElement sltUserType;

	@FindBy(id = "select_user")

	WebElement sltUser;

	@FindBy(id = "modify_btn")

	WebElement btnModify;

	@FindBy(id = "fname_tb")

	WebElement fName;

	@FindBy(id = "update_btn")

	WebElement btnUpdate;

	@FindBy(xpath = "//div[@ng-if=\"!isProfile\"][1]")

	WebElement alertMessgaes;

	public void SetModifyUser() {

		lnkModifyUser.click();
	}

	public void SetUserType() {

		// WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		// wait.until(ExpectedConditions.elementToBeSelected(sltUserType));

		Select drop = new Select(sltUserType);

		drop.selectByValue("number:2");
	}

	public void SetUser() {

		Select drop1 = new Select(sltUser);

		drop1.selectByValue("object:345");
		;
	}

	public void SetMoify() throws Exception {

		btnModify.click();

		Thread.sleep(2000);

	}

	public void SetFirstName() throws Exception {

		fName.clear();
		Thread.sleep(2000);

		BaseClass baseclass = new BaseClass();

		String userN = baseclass.randomAlphbetics();

		fName.sendKeys(userN);
	}

	public void SetButton() {

		btnUpdate.click();
	}

	public String GetAlertMessage() {

		String mes = "";

		String text[] = alertMessgaes.getText().split(" ");

		for (String e : text) {

			if (e.equals("Successfully")) {

				mes = e;
				
				System.out.println(mes);

				return mes;
			}

			else {

				mes = "Not Successfully Modify User Created";
			}

		}

		return mes;

	}

}
