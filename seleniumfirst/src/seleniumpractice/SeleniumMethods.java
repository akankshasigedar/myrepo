package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");

		driver.manage().window().maximize(); // to maximize the window

		// getting title
		String title = driver.getTitle();
		System.out.println("the title of the page is" + title);

		String url = driver.getCurrentUrl(); // getting current url
		System.out.println("the current url is" + url);

		WebElement username = driver.findElement(By.xpath("//input[@id=\'username\']")); // to find username
		username.sendKeys("admin"); // to enter value of username in text box

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//input[@name=\'pwd\']")); // to find password
		password.sendKeys("manager"); // to enter password value

		Thread.sleep(3000);

		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']")); // to find login button
		login.click(); // to click on login button

		String title1 = driver.getTitle(); // to get title of next page
		System.out.println("the title 1 is" + title1);

		driver.close(); // close the website

	}

}
