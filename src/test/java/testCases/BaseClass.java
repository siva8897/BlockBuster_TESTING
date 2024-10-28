package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass

	@Parameters({ "os", "browser" })
	public void setup(String os, String br) {

		switch (br.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid browser name..");
			return;

		}
		// driver = new ChromeDriver();

		driver.get("http://bvifsc-bb.radiant.digital:8080/BB-2.0.2/#/admin");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

	
	}

	@AfterClass
	public void tearDown() {

		//driver.quit();

	}

	public String randomAlphbetics() {

		String alphbetic = RandomStringUtils.randomAlphabetic(8);

		return alphbetic;

	}

	public String randomNumbers() {

		String numbers = RandomStringUtils.randomNumeric(5);

		return numbers;
	}

	public String randomAlphNumrics() {

		String alphNum = RandomStringUtils.randomAlphanumeric(5, 3);
		
		

		return alphNum;
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
	
	

}
