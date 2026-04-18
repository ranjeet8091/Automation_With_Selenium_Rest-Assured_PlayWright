package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

	private static WebDriver driver;

	public static WebDriver getWebDriver() {
		if (driver == null) {
			driver = new EdgeDriver();
		}
		return driver;
	}
}
