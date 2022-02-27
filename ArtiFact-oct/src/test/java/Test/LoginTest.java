package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Utility;
import base.TestBase;
import junit.framework.Assert;
import page.DashboardHeader;
import page.LoginPage;

@SuppressWarnings("deprecation")
public class LoginTest extends TestBase{

	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardHeader dashBoardHeader;
	public Utility util;

	@BeforeClass
	@Parameters("browser")
	public void initializeDriver(String browser) {
		loginPage = new LoginPage(driver);
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Drivers\\chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 */		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=launchChromeBrowser();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=launchEdgeBrowser();
		}
		else {
			System.out.println("Broeser is not specified");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void loginToApplication() throws IOException {
		System.out.println("login to page");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPassword();
		loginPage.clickLogin();
	}

	@Test
	public void verifyLoginSuccessful()// validation
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("successfully loggedin" + actualTitle);

		} else {
			System.out.println("login not done");
		}
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Test

	public void verifyAddCandidate() {
		dashBoardHeader = new DashboardHeader(driver);
		dashBoardHeader.clickRecruitment();
		dashBoardHeader.addCandidates();

	}

	@AfterMethod
	public void testLogout() {
		dashBoardHeader = new DashboardHeader(driver);
		dashBoardHeader.clickwelcomeIris();
		dashBoardHeader.clickLogout();
		System.out.println("logout");
		String url = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/";
		if(url.contains(expectedUrl))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}
}