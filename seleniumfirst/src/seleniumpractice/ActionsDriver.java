package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionsDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement accountLists = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		Actions act = new Actions(driver);
		act.moveToElement(accountLists).perform();

		WebElement YourOrders = driver.findElement(By.xpath("//*[text()='Your Orders']"));
		act.moveToElement(YourOrders).click().build().perform();

		driver.close();

	}

}
