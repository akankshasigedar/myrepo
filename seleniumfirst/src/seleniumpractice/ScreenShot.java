package seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// maximize, username, password, login button close

		driver.manage().window().maximize();

		TakesScreenshot screen = (TakesScreenshot) driver;// upcasting driver into takes screenshot interface ,
															// screen is reference of interface

		File src = screen.getScreenshotAs(OutputType.FILE); // we saved screenshot in src file reference
		/*
		 * for (int i = 0; i < 5; i++) { File dest = new File(
		 * "F:\\velocity-software testing\\GROUP DOCUMENTS-REGULAR CLASS\\seleniumclass prog and notes\\home exersize\\google"
		 * + i + ".png"); // we saved file in destination folder FileHandler.copy(src,
		 * dest);
		 * 
		 * 
		 * }  
		 * FileHandler.copy(src, dest); // copied file
		 */
		
		// Take multiple screenshots with Math.random()
		/*
		 * for (int i = 0; i <= 4; i++) { File dest = new File(
		 * "F:\\velocity-software testing\\GROUP DOCUMENTS-REGULAR CLASS\\seleniumclass prog and notes\\home exersize\\google"
		 * + Math.random() + ".png"); FileHandler.copy(src, dest); }
		 */

		// Screenshot with date and time
		String filetimestamp = new SimpleDateFormat("dd-MM-yyyy  hh-mm-ss").format(new Date());
		
		File dest = new File(
				"F:\\velocity-software testing\\GROUP DOCUMENTS-REGULAR CLASS\\seleniumclass prog and notes\\home exersize\\google"
						+ filetimestamp + ".png");
		
		FileHandler.copy(src, dest);
		
		driver.close(); // closed driver.
	}

}
