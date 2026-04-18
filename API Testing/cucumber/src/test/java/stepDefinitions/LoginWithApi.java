package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

public class LoginWithApi {
	Response res ;
	RequestSpecification request;
	
	@Given("hit api with credential {string} and {string}")
	public void hit_api_with_credential_and(String username, String password) {
	    Login login = new Login();
	    login.setUserEmail(username);
	    login.setUserPassword(password);
	    request = given()
                .baseUri("https://rahulshettyacademy.com/")
                .contentType("application/json")
                .body(login);
	     
	    
	}

	@When("apply post method")
	public void apply_post_method() {
		 res = request
	                .when()
	                .post("api/ecom/auth/login");
	    
	}

	@Then("Response data get")
	public void response_data_get() {
		   System.out.println(res.asPrettyString());
	       Assert.assertEquals(res.getStatusCode(), 200);
	  
	}

}
