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

public class LoginPage {
	
	//driver
	WebDriver driver ;
	
	// Locators
	@FindBy(id = "userEmail") WebElement userNameBox;
	@FindBy(id = "userPassword") WebElement passwordBox;
	@FindBy(id = "login") WebElement loginbtn;
	@FindBy(xpath = "//i[contains(@class,'sign-out')]/parent::button") WebElement productPageSignOutButton;
	
	
	public LoginPage() {
		this.driver = DriverManager.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	public void navigateToLoginPage() {
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().window().maximize();
	}
	
    public void loginToTheApplication(String username , String password) {
    	userNameBox.sendKeys(username);
    	passwordBox.sendKeys(password);
    	loginbtn .click();
   
    }
    public boolean ensureLoginSuccessful() {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
    	wait.until(ExpectedConditions.visibilityOf(productPageSignOutButton));
    	if(productPageSignOutButton.isDisplayed()) {
    		return true;
    	}
    	return false;
    }
    public void signOut() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
    	wait.until(ExpectedConditions.visibilityOf(productPageSignOutButton));
    	Thread.sleep(2000);
    	productPageSignOutButton.click();
    }
}
