package stepDefinition;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.DeleteRequest;
import response.DeleteRes;

public class Delete_Book_With_ID {
	RequestSpecification request ;
	Response res;
	
	@Given("delte a book based on ID {string}")
	public void delte_a_book_based_on_id(String id) {
		DeleteRequest delete = new DeleteRequest();
		delete.setID(id);
		request = given()
				.baseUri("http://216.10.245.166/Library")
		        .body(delete);

	}

	@When("user hit the enpoind POSt")
	public void user_hit_the_enpoind_po_st() {
		res = request
				.when()
				  .post("/DeleteBook.php");
	}

	@Then("user will see the msg book deleted")
	public void user_will_see_the_msg_book_deleted() {

	    DeleteRes response = res.then().extract().as(DeleteRes.class);
	    Assert.assertEquals(response.getMsg(), "book is successfully deleted");
	}

}
