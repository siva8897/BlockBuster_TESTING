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

public class CreateRAUser extends BasePage {

	public BaseClass baseclass;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CreateRAUser(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "create_ra_agent")

	WebElement lnkCreateRaAgent;

	@FindBy(name = "Entity")

	WebElement drpRegAgent;

	@FindBy(xpath = "//input[@placeholder=\"First Name\"]")

	WebElement txtfirstName;

	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")

	WebElement txtlastName;

	@FindBy(id = "email_tb")

	WebElement txtEmail;

	@FindBy(id = "phn_number_tb")

	WebElement txtPhoneNumber;

	@FindBy(name = "fax")

	WebElement txtFax;

	@FindBy(id = "role_type")

	WebElement drpRole;

	@FindBy(id = "username_tb")

	WebElement txtUserName;
	
	@FindBy (name="pass")
	
	WebElement txtPassword;
	
	@FindBy(id="conf_password_tb")
	
	WebElement txtConfPass;
	
	@FindBy(id="pass_ques_tb")
	
	WebElement txtpassQues;
	
	@FindBy(id="pass_answ_tb")
	
	WebElement txtAnsw;
	
	@FindBy(id="save_button")
	
	WebElement btnSave;
	
	

	public void SetCreateRaAgent() {
		
		wait.until(ExpectedConditions.elementToBeClickable(lnkCreateRaAgent));

		lnkCreateRaAgent.click();
		
	
		
	}

	public void SelectRegestAgent() {
		
		

		Select drop = new Select(drpRegAgent);

		drop.selectByIndex(1);
	}

	public void SetFirstName(String fName) {

		txtfirstName.sendKeys(fName);
	}

	public void SetLastName(String lName) {

		txtlastName.sendKeys(lName);
	}

	public void SetEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void SetPhoneNum(String phone) {

		txtPhoneNumber.sendKeys(phone);
	}

	public void SetFax(String fax) {

		txtFax.sendKeys(fax);
	}

	public void SetdrpRole() {

		Select drop1 = new Select(drpRole);

		drop1.selectByIndex(1);
	}

	public void SetUserName() {

		baseclass = new BaseClass();

		String testd = baseclass.randomAlphbetics();

		txtUserName.sendKeys(testd);

	}
	
	public void SetPassword(String pass) {
		
		txtPassword.sendKeys(pass);
	}
	
	public void SetConfPassword(String Cpass) {
		
		txtConfPass.sendKeys(Cpass);
	}
	
	public void SetPassQue(String que) {
		
		txtpassQues.sendKeys(que);
	}
	
	public void SetAwsPaa(String apass) {
		
		txtAnsw.sendKeys(apass);
	}
	
	public void SetButton() {
		
		btnSave.click();
	}
	
	

}
