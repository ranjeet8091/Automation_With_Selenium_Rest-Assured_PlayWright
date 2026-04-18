package seleniumDay3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AllWait {
	
	@Test
	public void allWait() {
		
		WebDriver driver =new  ChromeDriver();
		
		// implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		List<WebElement> AllbuttonElement = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(""))); // for ArrayList
		WebElement buttonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))); // for single List ;
		
		// Fluent Wait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(6))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		WebElement visibleAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		Assert.assertTrue(visibleAfter.isDisplayed());

        		
        		
		
	   
	}

}
