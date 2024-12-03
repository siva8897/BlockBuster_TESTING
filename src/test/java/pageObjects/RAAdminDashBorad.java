package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class RAAdminDashBorad extends BasePage {

	public RAAdminDashBorad(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = "//a[@data-target=\"#approved\"]")
	
	WebElement btnMore;
	
	@FindBy (xpath="//h3[text()=\"Approved Search Results\"]")
	
	WebElement txtApporved;
	
	public void SetMoreButton() {
		
		btnMore.click();
	}
	
	public void GetApporved() {
		
	String test=	txtApporved.getText();
	
	System.out.println(test);
	}

	
}
