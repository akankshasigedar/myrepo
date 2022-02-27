package seleniumpractice;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/js_popup.asp");

		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));

		alert.click();
		confirm.click();
		prompt.click();
		line.click();

		@SuppressWarnings("unused")
		String homepage = driver.getWindowHandle();
		System.out.println("homepage");

		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		WebElement alert1 = driver.findElement(By.xpath("//button[text()='Try it']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Try it']")));
		alert1.click();

		Alert alt = driver.switchTo().alert();
		//Thread.sleep(3000);
		//alt.sendKeys("Test Alert");
 		Thread.sleep(2000);
		alt.accept();

		driver.quit();

		/*
		 * driver.switchTo().window(addr.get(3));
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * 
		 * 
		 * driver.switchTo().window(addr.get(4));
		 * System.out.println(driver.getCurrentUrl());
		 */
	}
}
