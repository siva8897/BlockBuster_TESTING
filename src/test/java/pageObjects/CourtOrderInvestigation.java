package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;
import testCases.BaseClass;

public class CourtOrderInvestigation extends BasePage {
	
public	BaseClass baseclass;

	public CourtOrderInvestigation(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "investigationOfMbc")

	WebElement lnkInvestigationOfMbc;

	@FindBy(id = "search_mbc_number")

	WebElement txtSearchMBCNumber;

	@FindBy(id = "search_btn")

	WebElement btnSearch;

	@FindBy(id = "search_mbc_number")

	WebElement txtsearchMBC;

	@FindBy(id = "date_picker_btn")

	WebElement clkPicker;

	@FindBy(xpath = "//strong[@class=\"ng-binding\"]")

	WebElement setMonth;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-sm pull-right uib-right\"]")

	WebElement clkNext;

	@FindBy(xpath = "//table[@role=\"grid\"]//tbody//tr//td")

	List<WebElement> clkDay;

	@FindBy(id = "defraud")

	WebElement chkDefraud;

	@FindBy(id = "mbc_inspectorFName_tb")

	WebElement txtFName;
	
	@FindBy(id="mbc_inspectorLName_tb")
	
	WebElement txtLName;
	
	@FindBy(id="submit_btn")
	
	WebElement btnSubmit;

	public void SetInvestigationOfMbc() {

		lnkInvestigationOfMbc.click();
	}

	public void SetSerchMBC(String searchM) {

		txtsearchMBC.sendKeys(searchM);
	}

	public void SetButton() {

		btnSearch.click();
	}

	public void SetDataPicker() {

		clkPicker.click();

		String monthAndYear = "November 2026";

		String Day = "14";

		while (true) {

			if (setMonth.getText().equals(monthAndYear)) {

				break;
			}

			clkNext.click();
		}

		List<WebElement> items = new ArrayList<WebElement>(clkDay);

		for (WebElement e : items) {

			if (e.getText().equals(Day)) {

				e.click();
				break;
			}
		}

	}

	public void SetDefraud() {

		chkDefraud.click();
	}

	public void SetFname() {

	   baseclass = new BaseClass();

		String fName = baseclass.randomAlphbetics();

		txtFName.sendKeys(fName);

	}
	
	public void SetLname() {
		
	String lName=	baseclass.randomAlphbetics();
	
	txtLName.sendKeys(lName);
	}
	

}
