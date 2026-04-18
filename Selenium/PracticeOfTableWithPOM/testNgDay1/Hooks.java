package testNgDay1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks {

	@BeforeTest
	public void setUp() {
		System.out.println("SetUp before Test");
	}
	
	@AfterTest
	public void cleanUp() {
		System.out.println("Cleaning up after the test");
	}
}
