package classWork;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class CreateBooking {

	public static void main(String[] args) {
		String token = new BookerLogin().getToken();
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		
		String response = given().log().all()
				      .header("content-Type","application/json")
				      .header("Authorization","Bearer " + token)
				      .body("{\r\n"
						   		+ "    \"firstname\" : \"Jim\",\r\n"
						   		+ "    \"lastname\" : \"Brown\",\r\n"
						   		+ "    \"totalprice\" : 111,\r\n"
						   		+ "    \"depositpaid\" : true,\r\n"
						   		+ "    \"bookingdates\" : {\r\n"
						   		+ "        \"checkin\" : \"2018-01-01\",\r\n"
						   		+ "        \"checkout\" : \"2019-01-01\"\r\n"
						   		+ "    },\r\n"
						   		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						   		+ "}")
				   .when()
				   .post("/booking")
				   .then().log().all().extract().response().asString();
	}
}
