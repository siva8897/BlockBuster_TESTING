package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class LoginWithROCAUser extends BasePage{
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public LoginWithROCAUser(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (id="wrap")
	
	WebElement PageData;
	
	@FindBy (xpath="//a[normalize-space(text())='Welcome ROCA User']")
	
	WebElement Welcome;
	
	@FindBy (xpath="//div[@class=\"col-sm-8\"]")
	
	WebElement btnMenu;
	
	
	public void GetPageloading() {
		
		wait.until(ExpectedConditions.visibilityOfAllElements(PageData));
	}
	
	public void GetMessage() {
		
	String data=	Welcome.getText();
	
	System.out.println(data);
	
	}
	


	
	

}
