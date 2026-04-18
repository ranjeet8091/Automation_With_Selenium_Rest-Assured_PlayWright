package seleniumDay2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {
	WebDriver driver = new ChromeDriver();

	
	public void verifyHeader() {
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String expectedTitle="AutomationTestingPractice";
		String actualTitle=driver.getTitle().replaceAll(" ", "").toLowerCase();
		Assert.assertEquals(actualTitle, expectedTitle.toLowerCase(),"Test case passed");
		
		//// Testing Heading
		By h1Element =By.xpath("//h1[@class='title']");
		WebElement h1Tag=driver.findElement(h1Element);
		h1Tag.isDisplayed();
		
		// Testing Link of Navbar
		By nav =By.xpath("//div[@id='PageList2']/div[@class='widget-content']/ul/li");
		List<WebElement> navList=driver.findElements(nav);
		Assert.assertEquals(navList.size(),5,"not have 5 li");
		
		String expectedString="Home Udemy Courses Online Trainings Blog PlayWritePractice";
		
		//method 1
//		for(WebElement Li:navList) {
//			switch(Li.getText()){
//				case "Home":
//					Assert.assertEquals("Home", Li.getText(),"Not equal");
//				case "Udemy Courses":
//					Assert.assertEquals("Udemy Courses", Li.getText(),"Not equal");
//				case "Online Trainings":
//					Assert.assertEquals("Online Trainings", Li.getText(),"Not equal");
//				case "Blog":
//					Assert.assertEquals("Blog", Li.getText(),"Not equal");
//				case "PlayWritePractice":
//					Assert.assertEquals("PlayWritePractice", Li.getText(),"Not equal");
//					break;	
//			}
//		}
		
     //	Method 2
		for(var li:navList) {
			Assert.assertTrue(li.isEnabled(), li.getText()+" Not enabled");
			//Assert.assertTrue(expectedString.toLowerCase().contains(li.getText().toLowerCase()),"not contains");
		}
		
		
		
		
		
	}

	public void EditForm() {
		
		Actions act= new Actions(driver);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement nameInput=driver.findElement(By.xpath("//input[@id='name']"));
		nameInput.sendKeys("Ranjeet");
		nameInput.clear();
		nameInput.sendKeys("Ranjeet Tiwari");
		
		WebElement emailInput=driver.findElement(By.xpath("//input[@id='email']"));
		emailInput.sendKeys("ranjeet@8091");
		emailInput.clear();
		emailInput.sendKeys("ranjeet@8091.com");
		
		
		WebElement phoneInput=driver.findElement(By.xpath("//input[@id='phone']"));
		phoneInput.sendKeys("8091737929");
		phoneInput.clear();
		phoneInput.sendKeys("8091737829");
		
		WebElement addressInput=driver.findElement(By.xpath("//textarea[@id='textarea']"));
		addressInput.sendKeys(" khera");
		addressInput.clear();
		addressInput.sendKeys(" Khera nalagarh");
		//
		
		// Radio Button

//		WebElement genderInput=driver.findElement(By.xpath("//input[@id='male']"));
//		act.moveToElement(genderInput).build().perform();
//		genderInput.click();
		
		WebElement daysLabel = driver.findElement(By.xpath("//label[@for='days']"));
		act.moveToElement(daysLabel).build().perform();
		
		List<WebElement> genderRadButtons = driver.findElements(By.xpath("//label[@for='gender']/../div/input"));
		
		for(WebElement option: genderRadButtons) {
			if(option.getAttribute("value").toString().equalsIgnoreCase("Male")) option.click();
//		}
		
//		// Day Select ------------------------------------------------------------------------------------
			
		WebElement country=driver.findElement(By.xpath("//select[@id='country']")); // for scroll
		List<WebElement> dayElement=driver.findElements(By.xpath("//label[@for='days']/../div"));
		act.moveToElement(country).build().perform();
		
		for(WebElement div:dayElement) {
			if(div.findElement(By.tagName("label")).getText().equalsIgnoreCase("Sunday")) {
				if(!div.findElement(By.tagName("input")).isSelected()) {
					div.findElement(By.tagName("input")).click();
				}
			}
		}
//		
        //  country select --------------------------------------------------------------------------------
		act.moveToElement(country).build().perform();
	
		WebElement cdd=driver.findElement(By.id("country"));
		Select countrys=new Select(cdd);
		countrys.selectByValue("india");
		
		/// Color select
		WebElement color=driver.findElement(By.id("colors"));
		act.scrollToElement(color).build().perform();
		Select colorS=new Select(color);
		colorS.selectByValue("red");
		
	}

	}

	
	public void webTable() {
		driver.get("https://vinothqaacademy.com/webtable");

		WebElement webTable = driver.findElement(By.xpath("//table[@id='myTable']/tbody"));
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));

		for (WebElement rw : rows) {

			List<WebElement> col = rw.findElements(By.tagName("td"));

			if (col.get(2).getText().equalsIgnoreCase("Scrum Master")) {
				col.get(0).findElement(By.tagName("input")).click();
				System.out.println(col.get(3).getText());
			}
		}
	}

	@Test
	public void checkCurrency() {
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		Actions act= new Actions(driver);
		WebElement webTable = driver.findElement(By.xpath("//table[@id='countries']/tbody"));
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));

		for (WebElement rw : rows) {

			List<WebElement> col = rw.findElements(By.tagName("td"));

			if (col.get(1).getText().equalsIgnoreCase("Angola")) {
				act.scrollToElement(col.get(1)).build().perform();
				col.get(0).findElement(By.tagName("input")).click();
				System.out.println(col.get(3).getText());
			}
		}
	}

	
	public void checkShowTable() {
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");

		Actions act= new Actions(driver);
		WebElement webTable = driver.findElement(By.xpath("//table[@id='countries']/tbody"));
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
        
		List<String> countries = new ArrayList<String>();
		for (WebElement rw : rows) {

			List<WebElement> col = rw.findElements(By.tagName("td"));

			if (col.get(4).getText().equalsIgnoreCase("English")) {
				col.get(0).findElement(By.tagName("input")).click();
				countries.add(col.get(1).getText());
			}
		}
		
		for(String c:countries) {
			System.out.print(c + " ");
		}
	}

}
