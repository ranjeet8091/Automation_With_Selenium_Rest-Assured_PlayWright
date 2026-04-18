package tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DEMOQAedit {
	WebDriver driver ;
	
	// Locators
	@FindBy(xpath = "//div[@class='rt-tr-group']")
	List<WebElement> tbodyRows;
	
	@FindBy(xpath = "//form[@id = 'userForm']")
	WebElement forms;
	
	// constructor
	public DEMOQAedit() {
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void table() {
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		System.out.println(tbodyRows.size());
		
		for(var row : tbodyRows) {
			List<WebElement> col = row.findElements(By.xpath("./div/div"));
			System.out.println(col.size());
			if(col.get(2).getText().equalsIgnoreCase("39")) {
				List<WebElement> spanActions = col.get(6).findElements((By.xpath("//div/span")));
				
				// Edit 
				spanActions.get(0).click();
//				
//			
			}
		}
		
		
	}

}


//List<WebElement> allAttributes = forms.findElements(By.tagName("div"));
//for(var rw : allAttributes) {
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//	WebElement label = rw.findElement(By.xpath("//div/label[contains(@id,'firstName')]"));
//	if(label.getText().contains("First")) {
//		rw.findElement(By.xpath("//div/input")).sendKeys("Ranjeet");
//	}
//	
//}
