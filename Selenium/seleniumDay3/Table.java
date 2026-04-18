package seleniumDay3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Table {

	@Test
	public void webTable() {
		WebDriver driver = new ChromeDriver();
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
}
