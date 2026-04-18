package testNgDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    protected WebDriver driver;
    @Test
    @Parameters({"baseUrl"})
    public void setUp(String baseUrl) {

        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
    
    @Test
    public void verifyTitle() {
        System.out.println("Page title: " + driver.getTitle());
    }
}
