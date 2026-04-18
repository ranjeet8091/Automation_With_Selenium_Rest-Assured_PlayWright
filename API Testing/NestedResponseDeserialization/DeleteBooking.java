package classWork;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class DeleteBooking {
	public static void main(String[] args) {
		String token = new BookerLogin().getToken();
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response  = given().log().all()
				.header("content-Type","application/json")
				.header("Authorization","Bearer "+token)
				.when().delete("/booking/2")
				.then().log().all().extract().response().asString();		
		
	}

}
