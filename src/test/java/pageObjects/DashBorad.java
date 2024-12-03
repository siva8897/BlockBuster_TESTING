package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class DashBorad extends BasePage {

	public DashBorad(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()=\"ROCA Dashboard\"]")

	WebElement lnkRDashboard;

	@FindBy(xpath = "//div[@id='mbcRegistration']//i[@class='fa fa-align-justify']")

	WebElement btnMore1;

	@FindBy(xpath = "//h2[text()=\"Mbc Registration\"]")

	WebElement txtRegistration;

	@FindBy(xpath = "//table[@ng-if=\"data.tableTitle == 'mbcRegistration'\"]//tbody//tr/td")

	List<WebElement> dataTable;

	@FindBy(id = "reject_btn")

	WebElement btnReject;
	
	@FindBy (xpath="//div[@ng-if=\"mbcRejected\"]")
	
	WebElement mbcRejected;

	public void SetROCADashboard() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(lnkRDashboard));

		lnkRDashboard.click();
	}

	public void SetbtnMore1() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(btnMore1));

		btnMore1.click();

	}

	public void setRegistration() {

		boolean flage = false;

		String test = txtRegistration.getText();

		if (test.equals("MBC REGISTRATION")) {

			flage = true;

			System.out.println(test);
		}

		if (flage == false) {

			System.out.println("Data Not found");
		}

	}

	public void dataTable() {

		try {

			List<WebElement> items = new ArrayList<WebElement>(dataTable);

			for (WebElement it : items) {

				if (it.getText().contains("Accept/Reject")) {

					it.click();

				}

			}

		}

		catch (StaleElementReferenceException e) {

			// e.printStackTrace();
		}

	}

	public void SetReject() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(btnReject));

		btnReject.click();

		boolean flage = btnReject.isEnabled();

		System.out.println(flage);
	}
	
	public String SetRejectMBC() {
		
	String values=	mbcRejected.getText();
	
	return values;
	}
}