package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		// //For firefox browser we need gecko driver.

		// We can also use webdriver manager class instead of system.setyproperty.
		// Webdriver manager will automatically downloads the compatible driver version
		// and executes your selenium script.
		// Syntax is WebDriverManager.chrome.setup(); we need to either import the
		// webdriver manager jar file or if it is maven project then we can add
		// dependency i n pom.xml
		// to launch chrome driver
		WebDriver driver = new ChromeDriver(); // webdriver is interface and chrome driver is its implementing class. We
												// created reference of the webdriver interface with the help of its
												// implementing class chromedriver.

		driver.get("https://www.google.com");// to go to any url we use get method
	}

}
