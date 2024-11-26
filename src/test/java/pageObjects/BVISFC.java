package pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;
import testBase.BasePage;

public class BVISFC extends BasePage {

	public BVISFC(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()=\" BVI FSC Quick Links \"]")

	WebElement lnkBVIFSC;

	@FindBy(xpath = "//a[text()=\"www.Bvifsc.vg\"]")

	WebElement lnkFSC;

	@FindBy(id = "edit-search")

	WebElement txtSearch;

	@FindBy(xpath = "//a[normalize-space(text())=\"AML/CFT\" and @class=\"dropdown-toggle\"]")

	WebElement lnkBFSC;

	public void SetBVIFSC() {

		lnkBVIFSC.click();
	}

	public void SetFSC() {

		lnkFSC.click();
	}

	public void SetSearch(String search) {

		String parentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			String childWindow = it.next();

			if (!parentWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);

				txtSearch.clear();

				txtSearch.sendKeys(search);

				lnkBFSC.click();

				/*
				 * Actions action=new Actions(driver);
				 * 
				 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				 * 
				 * wait.until(ExpectedConditions.elementToBeClickable(lnkFSCPolyices));
				 * 
				 * action.moveToElement(lnkFSCPolyices).click().perform();
				 */

			}
		}

	}

}
