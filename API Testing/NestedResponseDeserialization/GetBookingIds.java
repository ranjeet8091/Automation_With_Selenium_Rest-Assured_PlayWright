package classWork;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetBookingIds  {

	public static void main(String[] args) {
		String token = new BookerLogin().getToken();
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response  = given().log().all()
				.header("content-Type","application/json")
				.header("Authorization","Bearer "+token)
				.when().get("/booking")
				.then().log().all().extract().response().asString();		
		
	}
}
