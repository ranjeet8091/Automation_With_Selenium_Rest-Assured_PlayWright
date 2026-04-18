package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureSelenium {

    WebDriver driver;
    String email;
    String password;

    @Given("login with credential {string} and {string} and {string}")
    public void login_with_credential_and_and(String userEmail, String userPassword, String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        this.email = userEmail;
        this.password = userPassword;
    }

    @When("i login in rahul shety page")
    public void i_login_in_rahul_shety_page() {
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("userPassword")).sendKeys(password);
        driver.findElement(By.id("login")).click();
    }

    @Then("user navigate to dashboard")
    public void user_navigate_to_dashboard() {
        String currentUrl = driver.getCurrentUrl();
            System.out.println("Login Successful");
        driver.quit();
    }
}