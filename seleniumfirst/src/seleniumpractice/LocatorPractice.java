package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// maximize, username, password, login button close

		driver.manage().window().maximize();
		String f = driver.getTitle();
		System.out.println("first page title is" + f);

		WebElement usrname = driver.findElement(By.xpath("//input[@id=\'txtUsername\']"));
		Thread.sleep(3000);
		usrname.sendKeys("Admin");

		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));

		pass.sendKeys("admin123");

		WebElement button = driver.findElement(By.name("Submit"));

		button.click();

		String g = driver.getCurrentUrl();
		System.out.println("second page url is" + g);

		if (g.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		driver.close();

		// driver.get("https://www.google.com");// when we close the driver instance and
		// after that if we try to perform
		// any operations on that driver instance then "NO SUCH EXCEPTION" will come.

	}
}