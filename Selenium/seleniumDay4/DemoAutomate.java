package seleniumDay4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoAutomate {

	@Test
	public void verifyLogin() throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement inputElement = driver.findElement(By.xpath("//input[@id='user-name']"));
		inputElement.sendKeys("standard_user");
		
		WebElement passElement = driver.findElement(By.xpath("//input[@id='password']"));
		passElement.sendKeys("secret_sauce");
		
		WebElement btnElement = driver.findElement(By.xpath("//input[@id='login-button']"));
		btnElement.click();
		
		Thread.sleep(3000);

		WebElement pElement = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		pElement.click();
		
		
	}
}
