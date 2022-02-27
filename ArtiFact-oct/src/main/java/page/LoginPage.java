package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;
	public WebDriverWait wait;

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement pass;

	@FindBy(name = "Submit")
	private WebElement button;

	public LoginPage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void sendUserName() {
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("Admin");
	}

	public void sendPassword() {
		pass.sendKeys("admin123");
	}

	public void clickLogin() {
		button.click();
	}

}