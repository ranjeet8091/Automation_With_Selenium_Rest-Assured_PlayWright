package seleniumDay3 ;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class MultipleTabHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.termsfeed.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Privacy Policy Generator']")).click();
		Thread.sleep(2000);
		
		String firstWH = driver.getWindowHandle();
		String secondWH="";
		Set<String> winHandles = driver.getWindowHandles();
		Iterator<String> it = winHandles.iterator();
		
		//switch to the second (new) window handle
		while(it.hasNext()) {
			secondWH = it.next();
			if(!firstWH.equalsIgnoreCase(secondWH)) {
				driver.switchTo().window(secondWH);
				//driver.switchTo().window(firstWH);
			}
		}
		
		//verify switched to new window
		String headText = driver.findElement(By.xpath("//h3[text()='Privacy Policy Generator']")).getText();
		System.out.println(headText);
		Assert.assertTrue(headText.equalsIgnoreCase("Privacy Policy Generator"),"Page Header not correct");
		
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
		winHandles = driver.getWindowHandles();
		it = winHandles.iterator();
		
		while(it.hasNext()) {
			String thirdWH = it.next();
			if(!thirdWH.equalsIgnoreCase(secondWH)) {
				if(!thirdWH.equalsIgnoreCase(firstWH)) {
					driver.switchTo().window(thirdWH);
				}
			}
		}
		
		String head = driver.getTitle();
		System.out.println(head);
		Assert.assertTrue(head.contains("Our"),"Wrong page title");
		
		driver.quit();
	}
}


