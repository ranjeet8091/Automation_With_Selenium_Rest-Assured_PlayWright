package seleniumDay4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WaitPractice {
	
	@Test
	public void afterWait() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement btn = driver.findElement(By.xpath("//div[@id='start']/button"));
		btn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement finishElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		finishElement.isDisplayed();
	}

}
