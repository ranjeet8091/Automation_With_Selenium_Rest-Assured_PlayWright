package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import webDriverManager.DriverManager;

public class Driver {

	WebDriver driver = DriverManager.getWebDriver();
	
	public  void screenShot(String TestName) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String time = String.valueOf(System.currentTimeMillis());
		File dest = new File("C:\\Users\\rantiwar1\\OneDrive - Publicis Groupe\\Desktop\\ErrorSreenshot/" + TestName + "_"+time + ".png");
		FileUtils.copyFile(srcFile,dest);
	}
}
