package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashboardHeader { // application header of Dashboard page is created
	public Actions actions;
	public WebDriver driver;
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	private WebElement admin;

	@FindBy(xpath = "//a[@'id='menu_pim_viewPimModule']")
	private WebElement pim;

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	private WebElement leave;

	@FindBy(xpath = "//a[@id='menu_time_viewTimeModule']")
	private WebElement time;
//-----------------------------------------------------------------------------------------
	@FindBy(xpath = "//a[@id='menu_recruitment_viewRecruitmentModule']")
	private WebElement recruitment;

	@FindBy(xpath = "//input[@id='btnAdd']")
	private WebElement btnadd;

	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement candidates;

	@FindBy(xpath = "//input[@name='addCandidate[firstName]']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='addCandidate[lastName]']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@name='addCandidate[email]']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='addCandidate[contactNo]']")
	private WebElement contactNo;

	@FindBy(xpath = "//select[@name='addCandidate[vacancy]']")
	private WebElement vacancy;

	@FindBy(xpath = "//input[@name='addCandidate[keyWords]'] 	")
	private WebElement keywords;

	@FindBy(xpath = "//textarea[@name='addCandidate[comment]']")
	private WebElement comment;

	@FindBy(xpath = "//label[text()='Date of Application']")
	private WebElement dateofapplication;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement btnsave;

//-------------------------------------------------------------------------
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	private WebElement myinfo;

	@FindBy(xpath = "//a[@id='menu__Performance']")
	private WebElement Performance;

	@FindBy(xpath = "//a[@id='menu_dashboard_index']")
	private WebElement Dashboard;

	@FindBy(xpath = "//a[@id='menu_directory_viewDirectory']")
	private WebElement directory;

	@FindBy(xpath = "//b[text()='Maintenance']")
	private WebElement maintenance;

	@FindBy(xpath = "//a[@id='menu_buzz_viewBuzz']")
	private WebElement buzz;

	@FindBy(xpath = "//input[@value='Marketplace']")
	private WebElement marketplace;

	@FindBy(xpath = "//a[@id='welcome']")
	private WebElement welcomeIris;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement Logout;

	public DashboardHeader(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickPIM() {
		pim.click();
	}

	public void clickLeave() {
		leave.click();
	}

	public void clickTime() {
		time.click();
	}

//---------------------------------------------------------------
	public void clickRecruitment() {
		actions = new Actions(driver);
		actions.moveToElement(recruitment).perform();
		candidates.click();
		btnadd.click();
	}

	public void addCandidates() {
		firstname.sendKeys("arjun");
		lastname.sendKeys("patil");
		email.sendKeys("patil123@gmail.com");
		contactNo.sendKeys("8793336099");
		Select s = new Select(vacancy);
		s.selectByValue("1");
		keywords.sendKeys("abc,xyz,pqr");
		comment.sendKeys("add candidate test");
		String b = dateofapplication.getText();
		System.out.println("date of application is" + b);
		checkbox.click();
		btnsave.click();

	}

//------------------------------------------------------------------
	public void clickMyINfo() {
		myinfo.click();
	}

	public void clickPerformance() {
		Performance.click();
	}

	public void clickDashboard() {
		Dashboard.click();
	}

	public void clickDirectory() {
		directory.click();
	}

	public void clickMaintenance() {
		maintenance.click();
	}

	public void clickBuzz() {
		buzz.click();
	}

	public void clickwelcomeIris() {
		welcomeIris.click();

	}

	public void clickMarketplace() {
		marketplace.click();
	}

	public void clickLogout() {
		Logout.click();
	}
}