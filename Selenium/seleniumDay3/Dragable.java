package seleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragable {

	@Test
	public void verifyDrag() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		
		// p
		WebElement demoFrameIframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(demoFrameIframe);
		By drag = By.xpath("//div[@id='draggable']/p");
		
		WebElement dragElement = driver.findElement(drag);
		dragElement.isDisplayed();
		System.out.print(dragElement.getText().toString());
		
		// drag
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//body"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).build().perform();
		
	}
}
