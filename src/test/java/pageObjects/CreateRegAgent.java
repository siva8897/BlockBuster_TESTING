package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;
import testCases.BaseClass;

public class CreateRegAgent extends BasePage {

	public BaseClass baseclass;

	public CreateRegAgent(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//span[text()=\" MBC Administration \"]")

	WebElement createReg;

	@FindBy(id = "create_ra")

	WebElement createRegAgent;

	@FindBy(id = "ra_contact_title_tb")

	WebElement Title;

	@FindBy(id = "contact_fname_tb")

	WebElement firstName;

	@FindBy(id = "ra_name_tb")

	WebElement AgentName;

	@FindBy(name = "url")

	WebElement URL;

	@FindBy(name = "contactlname")

	WebElement contantlName;

	@FindBy(name = "raemail")

	WebElement AgentEmail;

	@FindBy(name = "raBuildingname")

	WebElement BuildingName;

	@FindBy(name = "faxnum")

	WebElement Fax;

	@FindBy(name = "telnum")

	WebElement Phone;

	@FindBy(name = "RaCity")

	WebElement City;

	@FindBy(name = "rastreetaddrs")

	WebElement Address;

	@FindBy(name = "RazipCode")

	WebElement ZipCode;

	@FindBy(name = "rafname")

	WebElement rFirstName;

	@FindBy(name = "lname")

	WebElement rLastName;

	@FindBy(name = "Buildingname")

	WebElement BuildingN;

	@FindBy(name = "streetaddrs")

	WebElement StreetAdd;

	@FindBy(name = "city")

	WebElement SetCity;

	@FindBy(name = "zipcode")

	WebElement ZipC;

	@FindBy(name = "email")

	WebElement Email;

	@FindBy(name = "phonenum")

	WebElement PhoneNum;

	@FindBy(name = "fax2")

	WebElement FaxField;

	@FindBy(name = "uname")

	WebElement userName;

	@FindBy(id = "password_tb")

	WebElement Passwordtb;

	@FindBy(id = "conf_password_tb")

	WebElement txtPassword;

	@FindBy(id = "pass_ques_tb")

	WebElement txtQuesPassword;

	@FindBy(id = "pass_answ_tb")

	WebElement txtAPassword;

	@FindBy(id = "save_button")

	WebElement butSave;

	@FindBy(xpath = "//div[contains(text(),' RA registration is successful.')]")

	WebElement raRegMessage;

	public void SetRegAgent() {

		createReg.click();
	}

	public void SetcreateAgent() {

		createRegAgent.click();
	}

	public void Settitle(String tName) {

		Title.sendKeys(tName);
	}

	public void SetContactFirstName(String firstN) {

		firstName.sendKeys(firstN);

	}

	public void SetregisteredAgentName(String regAN) {

		AgentName.sendKeys(regAN);

	}

	public void SetUrl(String url) {

		URL.sendKeys(url);
	}

	public void SetLastName(String lName) {

		contantlName.sendKeys(lName);
	}

	public void SetAemail(String Aemail) {

		AgentEmail.sendKeys(Aemail);
	}

	public void SetrBuildingName(String buildingName) {

		BuildingName.sendKeys(buildingName);
	}

	public void SetfaxNum(String fNum) {

		Fax.sendKeys(fNum);
	}

	public void SetPhone(String phone) {

		Phone.sendKeys(phone);
	}

	public void SetrCity(String city) {

		City.sendKeys(city);
	}

	public void Setaddress(String addr) {

		Address.sendKeys(addr);
	}

	public void SetZcode(String zip) {

		ZipCode.sendKeys(zip);
	}

	public void SetrFName(String rfName) {

		rFirstName.sendKeys(rfName);
	}

	public void SetrLName(String rlName) {

		rLastName.sendKeys(rlName);
	}

	public void SetBuildingName(String BName) {

		BuildingN.sendKeys(BName);

	}

	public void SetStreetAddress(String SAddress) {

		StreetAdd.sendKeys(SAddress);
	}

	public void SetCRCity(String ccity) {

		SetCity.sendKeys(ccity);

	}

	public void SetZipCo(String Zipco) {

		ZipC.sendKeys(Zipco);
	}

	public void SetEmailId(String emailId) {

		Email.sendKeys(emailId);
	}

	public void SetPhoneNumber(String phoneNum) {

		PhoneNum.sendKeys(phoneNum);
	}

	public void SetFaxF(String fax) {

		FaxField.sendKeys(fax);
	}

	public void SetUserNameD() {

		baseclass = new BaseClass();

		String alphbet = baseclass.randomAlphbetics();

		userName.sendKeys(alphbet);
	}

	public void SetPasswordD(String pw) {

		Passwordtb.sendKeys(pw);
	}

	public void setPassword(String cpw) {

		txtPassword.sendKeys(cpw);
	}

	public void setQuestionPassword(String qpw) {

		txtQuesPassword.sendKeys(qpw);
	}

	public void setAnewerPassword(String apw) {

		txtAPassword.sendKeys(apw);
	}

	public void setButton() {

		butSave.click();
	}

	

	public String raRegValidationMessage() {

		String msg = "";

		String[] test = raRegMessage.getText().split(" ");

		for (String e : test)

			if (e.equals("successful.")) {

				System.out.println(e);

				msg = e;

				return msg;
			} else {

				msg = "not succesfully completed";

			}
		return msg;

	}

}
