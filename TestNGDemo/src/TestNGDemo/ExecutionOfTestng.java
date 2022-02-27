package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOfTestng {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}

	@BeforeMethod
	public void methodClass() {
		System.out.println("beforemethod");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");

	}
}
