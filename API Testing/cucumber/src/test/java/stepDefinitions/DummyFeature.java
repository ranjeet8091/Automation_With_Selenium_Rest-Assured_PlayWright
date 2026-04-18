package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DummyFeature {
	@Given("I am a customer")
	public void i_am_a_customer() {
	    System.out.print("Executed: i am a customer");
	}

	@When("I login to ecom app")
	public void i_login_to_ecom_app() {
		System.out.print("Executed: I login to ecom app");
	}

	@Then("My wishlist should be displayed")
	public void my_wishlist_should_be_displayed() {
		System.out.print("Verified: Dashboard page  displayed");
	}
	
	@Given("User logs in with the credential {string}  {string}")
	public void user_logs_in_with_the_credential(String user, String key) {
	   System.out.println("User logged in as :");
	   System.out.println(user + " " + key);
	}

  
}
