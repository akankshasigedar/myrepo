package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		//Element which needs to drag.    		
    	WebElement src=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
     //Element on which need to drop.		
     WebElement dest=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     		
       Actions act=new Actions(driver);
       Thread.sleep(2000);
       act.dragAndDrop(src, dest).perform();
       driver.quit();
      }

}
