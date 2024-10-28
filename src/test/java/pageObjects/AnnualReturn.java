package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class AnnualReturn extends BasePage {

	public AnnualReturn(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "info_on_annual_return_dd")

	WebElement linkAnnualReturn;

	@FindBy(id = "search_mbc_number")

	WebElement searchMBC;

	@FindBy(id = "update_btn")

	WebElement butsearch;

	@FindBy(name = "filingYear")

	WebElement dropfilingYear;

	@FindBy(id = "Yes")

	WebElement radioYes;

	@FindBy(name = "mbcCriteria")

	WebElement chkConfirm;

	@FindBy(id = "submit_btn")

	WebElement butReview;

	@FindBy(xpath = "//button[text()='Submit']")

	WebElement butSubmit;

	@FindBy(xpath = "//div[@class=\"alert alert-success Issuance-true-div ng-binding\"]")

	WebElement AlertMessage;

	public void setAnnualReturn() {

		linkAnnualReturn.click();
	}

	public void setSearchMBC(String search) {

		searchMBC.sendKeys(search);
	}

	public void SetSearch() {

		butsearch.click();
	}

	public void setfilingYear() {

		Select filing = new Select(dropfilingYear);

		filing.selectByIndex(2);
	}

	public void setYes() {

		radioYes.click();
	}

	public void setConfirme() {

		chkConfirm.click();
	}

	public void setReview() {

		butReview.click();
	}

	public void setSubmit() {

		butSubmit.click();
	}

	public String setAlert() {

		try {

			return (AlertMessage.getText());
		}

		catch (Exception e) {

			return e.getMessage();
		}

	}

}
