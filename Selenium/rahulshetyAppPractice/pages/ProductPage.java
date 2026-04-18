package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverManager.DriverManager;

public class ProductPage {

	// driver
	WebDriver driver;

	// Locators
	@FindBy(xpath = "//img[@src='https://rahulshettyacademy.com/api/ecom/uploads/productImage_1767959265156.jpg']/../div/button[@class='btn w-10 rounded']")
	WebElement add_to_cart_btn;
	
	@FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
	WebElement cart_btn;
	

	public ProductPage() {
		this.driver = DriverManager.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	// Methods
	public void navigateToLoginPage() {
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().window().maximize();
	}
	
	public void addProductToCart() {
		add_to_cart_btn.click();	
	}
	
	public void ensureCartbuttonByClick() throws InterruptedException {
		Thread.sleep(2000);
		cart_btn.click();
	}
	

}
