package seleniumDay2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alert {
	@Test
	public void verifyAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

		// launch alert
		By alertL = By.xpath("//button[@id='my-alert']");
		WebElement alertLElement = driver.findElement(alertL);
		alertLElement.click();

		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		simpleAlert.accept();

		// Launch Confirm
		By alertLC = By.xpath("//button[@id='my-confirm']");
		WebElement alertLConfirmElement = driver.findElement(alertLC);
		alertLConfirmElement.click();

		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		boolean okDismis = true;
		if (okDismis) {
			confirmAlert.accept();
			By p = By.xpath("//p[@id='confirm-text']");
			WebElement pElement = driver.findElement(p);
			Assert.assertEquals(pElement.getText(), "You chose: true", "Not euals");
		} else {
			confirmAlert.dismiss();
			By p = By.xpath("//p[@id='confirm-text']");
			WebElement pElement = driver.findElement(p);
			Assert.assertEquals(pElement.getText(), "You chose: false", "Not euals");
		}

		// Launch Prompt
		By alertLP = By.xpath("//button[@id='my-prompt']");
		WebElement alertLPromptElement = driver.findElement(alertLP);
		alertLPromptElement.click();

		Alert launchAlert = driver.switchTo().alert();
		String key = "Ranjeet";
		launchAlert.sendKeys(key);

		boolean choose = true;
		if (choose) {
			Thread.sleep(2000);
			launchAlert.accept();
			By p = By.xpath("//p[@id='prompt-text']");
			WebElement pElement = driver.findElement(p);
			Assert.assertEquals(pElement.getText(), "You typed: " + key, "Not euals");
		} else {
			Thread.sleep(2000);
			confirmAlert.dismiss();
			By p = By.xpath("//p[@id='prompt-text']");
			WebElement pElement = driver.findElement(p);
			Assert.assertEquals(pElement.getText(), "You typed: null", "Not euals");
		}

		// Model
		By alertLM = By.xpath("//button[@id='my-modal']");
		WebElement alertLModalElement = driver.findElement(alertLM);
		alertLModalElement.click();

		// close button
		By closeButton = By.xpath("//button[@class='btn btn-secondary model-button']");
		WebElement closeElement = driver.findElement(closeButton);
		Thread.sleep(5000);
		closeElement.click();

		// close Test
		By ptag = By.xpath("//p[@id='modal-text']");
		WebElement pElement = driver.findElement(ptag);
		Assert.assertEquals(pElement.getText(), "You chose: Close", "not same");

		// save button
		By saveButton = By.xpath("//button[@class='btn btn-primary model-button']");
		WebElement saveElement = driver.findElement(saveButton);

		// save Test
		Thread.sleep(2000);
		alertLModalElement.click();
		Thread.sleep(2000);
		saveElement.click();
		Assert.assertEquals(pElement.getText(), "You chose: Save changes", "not same");

	}

}
