package testNgDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel {
	
	// go to testng.xml and in suit add attributes ( parallel="methods" thread-count="6" )

	@Test
	public void Test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
    
	@Test
	public void Test2() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void Test3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void Test4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	@Test
	public void Test5() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void Test6() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	@Test
	public void Test7() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	@Test
	public void Test8() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void Test9() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	@Test
	public void Test10() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}
	@Test
	public void Test11() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    driver.manage().window().maximize();
	}

}
