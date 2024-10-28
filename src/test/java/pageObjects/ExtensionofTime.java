package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class ExtensionofTime extends BasePage {

	public ExtensionofTime(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//a[text()='Extension Of Time']")

	WebElement MenuItemExtOfTime;

	@FindBy(id = "search_mbc_number")

	WebElement txtMBCNumber;

	@FindBy(id = "update_btn")

	WebElement butSearch;

	@FindBy(name = "filingYear")

	WebElement dropYear;

	@FindBy(id = "reason")

	WebElement dropReason;

	@FindBy(id = "est_days")

	WebElement txteTimeReq;

	@FindBy(id = "limit_shares_cb")

	WebElement cbAgent;

	@FindBy(xpath = "//a[contains(text(),'MBCA')]")

	WebElement linkMBCA;

	@FindBy(xpath = "//a[text()='Regulated Entities']")

	WebElement linkRegEnti;
	
	@FindBy(xpath="//a[contains(text(),'Agents')][1]")
	
	WebElement RegisterAgent;
	
	@FindBy (xpath="//h2[text()='Registered Agents']")
	
	WebElement h2RegisteredAgents;

	public void SetExtensionofTime() {

		MenuItemExtOfTime.click();
	}

	public void SetMBCNumber(String MBCNum) {

		txtMBCNumber.sendKeys(MBCNum);
	}

	public void SetSearch() {

		butSearch.click();
	}

	public void SetYear() {

		Select dropY = new Select(dropYear);

		dropY.selectByIndex(2);
	}

	public void SetReason() {

		Select dropR = new Select(dropReason);

		dropR.selectByIndex(2);
	}

	public void SettimeReq(String timeReq) {

		txteTimeReq.sendKeys(timeReq);
	}

	public void SetAgent() {

		cbAgent.click();
	}

	public void SetMBCA() {

		linkMBCA.click();

	}

	public void SetRegEnt() {

		String parantWindowHandle = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			String childWindow = it.next();
			
			if(!parantWindowHandle.equals(childWindow)) {
				
				driver.switchTo().window(childWindow);
				
				linkRegEnti.click();
			}
		}

	}
	
	public void SetRegisterAgent() {
		
		RegisterAgent.click();
	}
	
	public String GetH2RegisterAgent() {
		
		try {
			
			return h2RegisteredAgents.getText();
		}
		
		catch(Exception e) {
			
			return (e.getMessage());
		}
	}

}
