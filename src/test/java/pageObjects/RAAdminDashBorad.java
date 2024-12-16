package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class RAAdminDashBorad extends BasePage {

	public RAAdminDashBorad(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@ng-click=\"approvedList('approve')\"]")

	WebElement btnMore;

	@FindBy(xpath = "//h3[@class=\"text-center ng-binding\"]")

	WebElement txtApporved;

	@FindBy(xpath = "//table[\"tabletable-borderedtable-stripedtable-condensedtable-hover\"]//tbody/tr/td")

	List<WebElement> ApprovedList;
	
	@FindBy (xpath="//button[@class=\"close\"]")
	
	WebElement btnClose;

	public void SetMoreButton() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(btnMore));

		Actions actions = new Actions(driver);
		actions.moveToElement(btnMore).click().build().perform();
	}

	public void GetApporved() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class=\"text-center ng-binding\"]")));

		String test = txtApporved.getText();

		System.out.println(test);
	}

	public void SetApporedList() {

		String tranSationNumber = "BL09108259";

		String mbcID = "MicroBusinessCompany27019649HMD";
		
		boolean flage=false;

		List<WebElement> items = new ArrayList<WebElement>(ApprovedList);

		for (WebElement it : items) {

			if (tranSationNumber.equals(it.getText()) || (it.getText().equals(mbcID))) {

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

				wait.until(ExpectedConditions.elementToBeClickable(it));
				it.click();
				
				flage=true;

			}

		}
		
		if(flage==false) {
			
			System.out.println("Element not found");
		}
	}
	
	public void Setclose() {
		
		 btnClose.click();
	}

}
