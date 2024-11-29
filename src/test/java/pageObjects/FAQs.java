package pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class FAQs extends BasePage {

	public FAQs(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()=\"FAQ's\"]")

	WebElement lnkFAQ;

	@FindBy(id = "edit-search")

	WebElement txtSearch;

	@FindBy(xpath = "//div[@class=\"bef-checkboxes\"]")

	List<WebElement> Options;

	public void SetFAQ() {

		lnkFAQ.click();
	}

	public void SetSerarch(String text) {

		String paranetWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			String childWindow = it.next();

			if (!paranetWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);

				txtSearch.clear();

				txtSearch.sendKeys(text);
			}

		}

	}

	public void GetOptions() {

		boolean flage = false;

		List<WebElement> opt = new ArrayList<WebElement>(Options);

		for (WebElement e : opt) {

			String option1 = "Banking";

			if (e.getText().equalsIgnoreCase(option1)) {

				flage = true;

				System.out.println(e.getText());

			}

		}

		if (flage == false) {

			System.out.println("Do not found element");
		}

	}
}
