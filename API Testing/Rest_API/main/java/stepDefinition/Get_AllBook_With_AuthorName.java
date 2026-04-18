package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import response.GetBookResponse;

import static  io.restassured.RestAssured.given;

public class Get_AllBook_With_AuthorName {
	RequestSpecification request ;
	Response res;
	
	@Given("Get all the book of a author {string}")
	public void get_all_the_book_of_a_author(String authorname) {
		request = given()
			.baseUri("http://216.10.245.166/Library")
			.queryParam("AuthorName", authorname);
			
	}

	@When("User hits the end-point with get method")
	public void user_hits_the_end_point_with_get_method() {
		res = request
				.when()
				  .post("/GetBook.php");
		

	}

	@Then("User get array of Object of book")
	public void user_get_array_of_object_of_book() {
		GetBookResponse[] books = res
				           .then()
				              .extract().as(GetBookResponse[].class);
		
		
	}
	

}
