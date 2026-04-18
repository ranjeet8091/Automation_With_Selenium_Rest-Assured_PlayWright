package e2eTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import dataProvider.TestAnnotationsDataProvider;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

@Listeners(TestListener.class)
public class E2E_Test {
    
	@Test(dataProvider = "data-provider", dataProviderClass = TestAnnotationsDataProvider.class)
    public void ensureLoginSuccessful(String username,String password) throws InterruptedException {

        LoginPage loginpage = new LoginPage();
        loginpage.navigateToLoginPage();
        loginpage.loginToTheApplication(username, password);

        Assert.assertTrue(
            loginpage.ensureLoginSuccessful(),
            "User not login successfully"
        );

        ProductPage productpage = new ProductPage();
        productpage.addProductToCart();
        productpage.ensureCartbuttonByClick();

        CartPage cart_page = new CartPage();
        cart_page.ensureCheckoutBtn();
        loginpage.signOut();
    }
	
}