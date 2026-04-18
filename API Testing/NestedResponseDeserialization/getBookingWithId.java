package classWork;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class getBookingWithId {
	
	public static void main(String[] args) {
		String token = new BookerLogin().getToken();
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response = given().log().all()
				.header("Auhorization","Bearer "+token)
				.when()
				.get("/booking/1")
				.then().log().all().extract().asString();
				
	}

}
