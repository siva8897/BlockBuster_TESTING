package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;
import testCases.BaseClass;

public class RegisteredAgent extends BasePage {

	public BaseClass baseclass;

	public RegisteredAgent(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[@class=\"caret\"]")

	WebElement lnkLogin;

	@FindBy(id = "edit_profile_btn")

	WebElement lnkEdit;

	@FindBy(id = "phone_num_tb")

	WebElement txtPhone;
	
	@FindBy(id="update_btn")
	
	WebElement btnUpdate;
	
	@FindBy(xpath="//div[normalize-space()=\"rareceiver Profile Updated Successfully\" and @class=\"alert alert-success Issuance-true-div ng-binding ng-scope\"]")

	WebElement mesAlertMessage;
	
	@FindBy(id="logout_btn")
	
	WebElement btnLogout;
	
	public void SetLogin() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(lnkLogin));

		lnkLogin.click();
	}

	public void SetEdit() {
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(lnkEdit));

		lnkEdit.click();
	}

	public void SetPhone() {

		baseclass = new BaseClass();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(txtPhone));

		String phone = baseclass.randomPhoneNumbers();
		
		txtPhone.sendKeys(phone);
	}
	
	public void SetUpdate() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(btnUpdate));
		
		btnUpdate.click();
	}
	
	public String SetAlertMessage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(mesAlertMessage));
		
		
	String mes=	mesAlertMessage.getText();
	
	return mes;

	}
	
	public void Setlogout() {
		
		btnLogout.click();
	}

}
