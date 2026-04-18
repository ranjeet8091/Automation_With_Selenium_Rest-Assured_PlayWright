package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import response.GetBookWithIDRes;

import static  io.restassured.RestAssured.given;

public class Get_AllBook_With_ID {
	RequestSpecification request ;
	Response res;
	GetBookWithIDRes[] books;
	
	@Given("Get all book based on Id {string}")
	public void get_all_book_based_on_id(String ID) {
		request = given()
				.baseUri("http://216.10.245.166/Library")
				.queryParam("ID", ID);
	}

	@When("User hit the endpoint with get Method of Id")
	public void user_hit_the_endpoint_with_get_method_of_id() {
		res = request
				.when()
				  .get("/GetBook.php");
	}

	@Then("User get array Of object")
	public void user_get_array_of_object() {
		 books = res
		           .then()
		              .extract().as(GetBookWithIDRes[].class);

		  res.prettyPrint();


	}
	

}
