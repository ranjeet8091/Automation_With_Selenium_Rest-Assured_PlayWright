package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import request.Add_Book_Request;
import response.Add_Book_res;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.given;

import org.testng.Assert;

public class Add_Book_step {
	
	RequestSpecification request;
	Response res;
	
	@Given("Details of book {string} and {string} and {string} and {string}")
	public void details_of_book_and_and_and(String name, String isbn, String aisle, String author) {
		Add_Book_Request adq = new Add_Book_Request();
		adq.setName(name);
		adq.setAuthor(author);
		adq.setIsbn(isbn);
	    adq.setAisle(aisle);
		
	    request = given()
	    		.baseUri("http://216.10.245.166")
	    		.body(adq)
	            .header("content-type","application/json");
	    		
	}

	@When("User hits the end-point with post method")
	public void user_hits_the_end_point_with_post_method() {
		     res=   request
				.when()
				   .post("/Library/Addbook.php");
		
	}

	@Then("User receives the output with msg successfully added")
	public void user_receives_the_output_with_msg_successfully_added() {
		  Add_Book_res addbookres = res
		           .then()
		              .statusCode(200)
		              .extract().as(Add_Book_res.class);
		  
		 

	}

}
