package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");// java script executorit allows
		// to execute java script from
		// selenium script
		// we can send keys and click on any button with jse

		// js.executeScript("window.scrollBy(0,-1000)");
		// js.executeScript("window.scrollBy(1000,0)");
		// js.executeScript("window.scrollBy(-2000,0)");

		// scroll into view

		WebElement tryButton = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));

		// Used explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Try it Yourself »'])[1]")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", tryButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", tryButton);

		driver.quit();

	}

}
