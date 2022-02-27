package seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");

		/*
		 * Point p = new Point(100, 200); // set position of browser window for setting
		 * the position we use point class driver.manage().window().setPosition(p);// we
		 * give arguments= x and y coordinates.
		 * 
		 * Dimension d = new Dimension(500, 700); // set size of browser window for
		 * setting the dimention we use dimenion // class
		 * driver.manage().window().setSize(d);
		 */

		driver.manage().window().maximize();

		WebElement creacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		creacc.click();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select da = new Select(day);

		da.selectByIndex(5);
		Thread.sleep(3000);

		da.selectByValue("4");
		Thread.sleep(2000);

		da.selectByVisibleText("8");

		/*
		 * // WebElement first = da.getFirstSelectedOption(); //
		 * System.out.println(first); // it select the first selected option from the //
		 * dropdown
		 * 
		 * List<WebElement> list1 = da.getOptions(); System.out.println(list1); it
		 * stores all the options from the dropdown in list
		 */

		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		if (fname.isEnabled() == true) {
			System.out.println("element is enabled");

		} else {
			System.out.println("element is disabled");
		}

		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		if (gender.isDisplayed() == true) {
			System.out.println("element is displayed");

		} else {
			System.out.println("element is not displayed");
		}

		Thread.sleep(2000);
		gender.click();
		Thread.sleep(2000);
		if (gender.isSelected() == true) {
			System.out.println("element is selected");

		} else {
			System.out.println("element is not selected");

		}
		driver.close();
	}
}
