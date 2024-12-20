package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import BlockBusterLoginCombinations.BlockBusterloginDetials;
import pageObjects.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger; // Log4j

	@BeforeClass
	@Parameters({ "os", "browser", "userType" }) // Added userType parameter
	public void setup(String os, String br, String userType) {

		logger = LogManager.getLogger(this.getClass());

		// Browser setup based on the provided parameter
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

		// Set URL based on userType
		if ("admin".equalsIgnoreCase(userType) || "rocaUser".equalsIgnoreCase(userType)) {
			// URL for admin and rocaUser
			driver.get("http://bvifsc-bb.radiant.digital:8080/BB-2.0.2/#/admin");

		} else if ("raAdmin".equalsIgnoreCase(userType) || "raUser".equalsIgnoreCase(userType)
				|| "raPractitioner".equalsIgnoreCase(userType) || "raReceiver".equalsIgnoreCase(userType)) {
			// URL for RA users
			driver.get("http://bvifsc-bb.radiant.digital:8080/BB-2.0.2/#/service-portals");

		} else {
			System.out.println("Invalid user type: " + userType);
			return;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void tearDown() {
		 //driver.quit();
	}

	public String randomAlphbetics() {
		return RandomStringUtils.randomAlphabetic(8);
	}

	public String randomNumbers() {
		return RandomStringUtils.randomNumeric(5);
	}

	public String randomAlphNumrics() {
		return RandomStringUtils.randomAlphanumeric(5, 3);
	}
	
	public String randomPhoneNumbers() {
		
	return	RandomStringUtils.randomNumeric(11);
	}

	public String captureScreen(String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		sourceFile.renameTo(targetFile);

		return targetFilePath;
	}

	public void loginWithAdmin() {
		LoginPage loginpage = new LoginPage(driver);
		BlockBusterloginDetials blockbusterlogindetail = new BlockBusterloginDetials();

		String loginInfo = blockbusterlogindetail.LoginCombinations().get("admin");
		String[] userDetalis = loginInfo.split("/");
		loginpage.SetUserName(userDetalis[0]);
		loginpage.SetPassword(userDetalis[1]);
		loginpage.SetSingin();
	}

	public void loginWithRAUser() {
		LoginPage loginpage = new LoginPage(driver);
		BlockBusterloginDetials blockbusterlogindetail = new BlockBusterloginDetials();

		String loginInfo = blockbusterlogindetail.LoginCombinations().get("rocaUser");
		String[] userDetalis = loginInfo.split("/");

		loginpage.SetUserName(userDetalis[0]);
		loginpage.SetPassword(userDetalis[1]);
		loginpage.SetSingin();
	}

	public void loginWithRaPractitioner() {
		LoginPage loginpage = new LoginPage(driver);
		BlockBusterloginDetials blockbusterlogindetail = new BlockBusterloginDetials();

		String loginInfo = blockbusterlogindetail.LoginCombinations().get("raPractitioner");
		String[] userDetalis = loginInfo.split("/");

		loginpage.SetUserName(userDetalis[0]);
		loginpage.SetPassword(userDetalis[1]);
		loginpage.SetSingin();

	}

	public void loginWithRaAdmin() {

		LoginPage loginpage = new LoginPage(driver);
		BlockBusterloginDetials blockbusterlogindetail = new BlockBusterloginDetials();

		String loginInfo = blockbusterlogindetail.LoginCombinations().get("raAdmin");
		String[] userDetalis = loginInfo.split("/");

		loginpage.SetUserName(userDetalis[0]);
		loginpage.SetPassword(userDetalis[1]);
		loginpage.SetSingin();

	}
	
	public void loginWithRaReceiver() {
		
		LoginPage loginpage = new LoginPage(driver);
		BlockBusterloginDetials blockbusterlogindetail = new BlockBusterloginDetials();

		String loginInfo = blockbusterlogindetail.LoginCombinations().get("raReceiver");
		String[] userDetalis = loginInfo.split("/");

		loginpage.SetUserName(userDetalis[0]);
		loginpage.SetPassword(userDetalis[1]);
		loginpage.SetSingin();

		
	}
}