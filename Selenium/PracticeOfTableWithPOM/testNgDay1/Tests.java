package testNgDay1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("SetUp before Test");
	}
	
	@AfterMethod
	public void cleanUp() {
		System.out.println("Cleaning up after the test");
	}

	@Test
	public void Test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("This is test 2");
	}
	
	@Test
	public void Test3() {
		System.out.println("This is test 3");
	}
	@Test
	public void Test4() {
		System.out.println("This is test 4");
	}
}
