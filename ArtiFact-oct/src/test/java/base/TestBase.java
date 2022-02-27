package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {//amazon site

	public static WebDriver launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe.");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver launchEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "E:\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}

}
