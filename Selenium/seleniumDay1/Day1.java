package seleniumDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1 {
//	@Test
//	public void verifyPageTitle() throws InterruptedException {
////	  WebDriver driver = new ChromeDriver();
//
////    WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://practice.qabrains.com"); // This will open new chrome window
//		driver.manage().window().maximize();
//		// Verifying the opened page title
//		String expectedTitle = "Practice";
//		String expectedTitle1 = "qabrainn";
//		String actualTitle = driver.getTitle().toString(); // Title of http
//
////-----------------------------------------------------------------------------------
////	  if(actaulTitle.toLowerCase().contains(expectedTitle.toLowerCase())) {
////		  System.out.println("Title test case pass!");
////	  }
////	  else {
////		  System.err.println("Title test case Fail!!!");
////	  }
////-----------------------------------------------------------------------------------
//
//		// replace if else for better
//
//		Assert.assertTrue(actualTitle.toLowerCase().contains(expectedTitle.toLowerCase()), "Title verification passed");
////		Assert.assertTrue(actualTitle.toLowerCase().contains(expectedTitle1.toLowerCase()), "Title verification fails");
//
////	  driver.sleep(2000);
////	  driver.close();
//
////		Thread.sleep(2000);
//		driver.quit();
//	}
	
//	@Test
//	public void verifyPageLogoText() throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://practice.qabrains.com"); // This will open new chrome window
//		driver.manage().window().maximize();
//
//		// Create locator for the Logo
//		// store the location in a webElement ref variable
//		// use variable to assert that the Logo is displayed
//
//		By logoElementText = By.xpath("//a/small[contains(@class,'text')]");
//		WebElement logoPageText = driver.findElement(logoElementText);
//		String actualText = "(PracticeSite)";
//		String actualText1 = logoPageText.getText().trim().replaceAll(" ", "").toLowerCase();
//
//		Assert.assertEquals(actualText.toLowerCase(), actualText1, "Login page logo text verification failed");
//		Thread.sleep(2000);
//		driver.close();
//	}
	
//	@Test
//	public void verifyPageLogo() throws InterruptedException {
//		
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://practice.qabrains.com"); // This will open new chrome window
//		driver.manage().window().maximize();
//		
//		// logo creator
//		By logoElement = By.xpath("//img[@alt='Logo']");
//		WebElement loginPageLogo = driver.findElement(logoElement);
////      WebElement loginPageLogo= driver.findElement(By.xpath("//img[@alt='Logo']"));
//		Assert.assertTrue(loginPageLogo.isDisplayed(), "Login page logo is not displayed");
//		
//		Thread.sleep(2000);
//		driver.close();
//	}

	@Test 
	public void  loginWithCredentails() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://practice.qabrains.com"); // This will open new chrome window
		driver.manage().window().maximize();
		
		By  emailElement = By.xpath("//input[@id='email']");
		WebElement emailInput=driver.findElement(emailElement);
		emailInput.sendKeys("qa_testers@qabrains.com");
		
		
		By  passwordElement = By.xpath("//input[@id='password']");
		WebElement passwordInput=driver.findElement(passwordElement);
		passwordInput.sendKeys("Password123");
		
		By submitButton=By.xpath("//button[@type='submit']");
		WebElement submit=driver.findElement(submitButton);
		submit.click();
		
		
		By LoginResponseElement=By.xpath("//h2[contains(@class,'text-xl font')]");
		WebElement LoginResponse=driver.findElement(LoginResponseElement);
		String expected="LoginSuccessful";
		String actual=LoginResponse.getText().trim().replaceAll(" ", "").toLowerCase();
		Assert.assertEquals(actual,expected.trim().toLowerCase(),"Not run" );
		
		By LogoutResponseElement=By.xpath("//button[contains(@class,'btn-submit')]");
		WebElement logout=driver.findElement(LogoutResponseElement);
		logout.click();
		
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
//		WebElement logOutButton=wait.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'btn-submit')]")));
				
		
	}
	
	

	
	

}
