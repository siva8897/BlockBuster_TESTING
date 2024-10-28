package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}

		@FindBy (id="username_tb")
		
		WebElement txtuserName;
		
		@FindBy (id="password_tb")
		
		WebElement txtpassWord;
		
		@FindBy (id="signin_btn")
		
		WebElement butsignin;
		
		@FindBy (xpath="//a[normalize-space(text())='Welcome ROCA Super User']")
		
		WebElement msgConfirmation;
		
		
		public void SetUserName(String username) {
			
			txtuserName.sendKeys(username);
		}
		
		public void SetPassword(String password) {
			
			txtpassWord.sendKeys(password);
		}
		
		public void SetSingin() {
			
			butsignin.click();
		}
		
		public String getConfirmationMsg() {
			
			try {
				
				return(msgConfirmation.getText());
			}catch(Exception e) {
				
				return (e.getMessage());
			}
		}
	
}
