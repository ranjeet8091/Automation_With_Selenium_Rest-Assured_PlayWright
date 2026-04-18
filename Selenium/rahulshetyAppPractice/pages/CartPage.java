package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverManager.DriverManager;

public class CartPage {

	WebDriver driver ;
	//Locator
	
	@FindBy(xpath = "//li[@class='totalRow']/button")
	WebElement checkout_btn;
	
	public CartPage(){
		this.driver = DriverManager.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	
	// Method
    public void ensureCheckoutBtn() throws InterruptedException {
    	Thread.sleep(2000);
    	checkout_btn.click();
    }

}
