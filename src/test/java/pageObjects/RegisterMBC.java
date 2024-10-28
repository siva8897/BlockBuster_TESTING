package pageObjects;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;
import testCases.BaseClass;

public class RegisterMBC extends BasePage {
	
	public BaseClass baseclass;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public RegisterMBC(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//img[@src='assets/images/hamburger.png']")

	WebElement Menu;

	@FindBy(xpath = "//span[text()='MBC Management ']")

	WebElement MBCMenu;

	@FindBy(id = "incorporation_dd")

	WebElement RegisterMBC;

	@FindBy(name = "mbcCountryOfOperation")

	WebElement DropCountry;

	@FindBy(id = "ra_name_dd")

	WebElement DropRegAgent;

	@FindBy(id = "ra_user_name_dd")

	WebElement adminUser;

	@FindBy(name = "mbcDoingBusinessAs")

	WebElement busniessAs;

	@FindBy(id = "principal_firstname_confirmation_cb")

	WebElement fNameOnly;

	@FindBy(id = "mbc_principalProfessionalDesignation_tb")

	WebElement Professional;

	@FindBy(id = "mbc_principalFName_tb")

	WebElement pFName;

	@FindBy(name = "nationalityCode")

	WebElement Nationality;

	@FindBy(id = "mbc_shares_dd")

	WebElement SharesCount;

	@FindBy(name = "mbcBusinessPurpose")

	WebElement BusinessPurpose;

	@FindBy(id = "mbc_act_confirmation_cb")

	WebElement Confirmation;

	@FindBy(id = "submit_btn")

	WebElement submit;

	@FindBy(xpath = "//button[text()='Submit Payment']")

	WebElement FSubmit;

	@FindBy(xpath = "//div[contains(text(),'MBC has been registered successfully')]")

	WebElement RegSuccessfully;

	public void MenuButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(Menu));	

		Menu.click();
	}

	public void MBCMangMenu() {

		MBCMenu.click();
	}

	public void SetRegserMBC() {

		RegisterMBC.click();
	}

	public void Setcountry() {

		Select SetDrop = new Select(DropCountry);

		SetDrop.selectByVisibleText("India");
	}

	public void SetRegAgent() {

		Select SetDrop1 = new Select(DropRegAgent);

		SetDrop1.selectByValue("number:31");
	}

	public void rdAdminUser() {

		Select setDrop2 = new Select(adminUser);

		setDrop2.selectByValue("number:377");
	}

	public void SetBussinesAs() {

		baseclass = new BaseClass();

		String test = baseclass.randomAlphbetics();

		busniessAs.sendKeys(test);

	}

	public void SetfirstNameOnly() {

		fNameOnly.click();
	}

	public void SetprofessionalDetails(String Profess) {

		Professional.sendKeys(Profess);
	}

	public void SetFirstName(String fname) {

		pFName.sendKeys(fname);
	}

	public void SetNationCode() {

		Select drop1 = new Select(Nationality);

		drop1.selectByValue("81");
	}

	public void SetShares() {

		Select drop2 = new Select(SharesCount);

		drop2.selectByValue("number:1");
	}

	public void SetbusinessPurpose() {

		Select drop3 = new Select(BusinessPurpose);

		drop3.selectByValue("2476");
	}

	public void SetConfCheck() {

		Confirmation.click();
	}

	public void SetSubmitButton() throws Exception {

		submit.click();

		Thread.sleep(2000);
	}

	public void SetformSumbit() {

		FSubmit.click();

	}

	public String getRegSuccessfully() {
		String msg = "";

		String[] test = RegSuccessfully.getText().split(" ");

		for (String e : test) {

			if (e.equals("successfully.")) {
				System.out.println("in the method" + e);
				msg = e;
				return msg;
			}

			else {
				msg = "not succesfully completed";
			}
		}
		return msg;

	}
}
