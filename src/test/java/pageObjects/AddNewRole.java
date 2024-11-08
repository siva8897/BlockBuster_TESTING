package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class AddNewRole extends BasePage {

	public AddNewRole(WebDriver driver) {
		super(driver);

	}
	
	@FindBy (xpath="//span[text()=\" Data Management \"]")
	
	WebElement lnkDataManagement;
	
	@FindBy (id="role_management")
	
	WebElement lnkRole;
	
	@FindBy (id="role_code_tb")
	
	WebElement txtCode;
	
	@FindBy (id="role_desc_tb")
	
	WebElement txtDesc;
	
	@FindBy (id="role_details_tb")
	
	WebElement txtDetails;
	
	@FindBy (id="entity_type_name_dd")
	
	WebElement drpname;
	
	@FindBy (id="save_btn")
	
	WebElement btnSave;
	
	@FindBy (xpath="//div[@class=\"alert alert-danger Issuance-true-div ng-binding\"]")
	
	WebElement alertMessage;
	
	public void SetDataMang() {
		
		lnkDataManagement.click();
	}
	
	public void SetRole() {
		
		lnkRole.click();
	}
	
	public void SetCode(String code) {
		
		txtCode.sendKeys(code);
	}
	
	public void SetDes(String Desc) {
		
		txtDesc.sendKeys(Desc);
	}
	
	public void SetDetails(String Details) {
		
		txtDetails.sendKeys(Details);
		
		
	}
	
	public void SelectNameDrop() {
		
		Select drop= new Select(drpname);
		
		drop.selectByValue("number:3");
	}
	
	public void SetSaveButton() {
		
		btnSave.click();
	}
	
	public void SetAlertMessage() {
		
	String mes=	alertMessage.getText();
	
	System.out.println(mes);
	}

}
