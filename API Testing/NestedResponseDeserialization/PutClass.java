package classWork;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class PutClass {
   public static void main (String[] args) {
	   String token = new BookerLogin().getToken();
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		
		String response = given().log().all()
				      .header("content-Type","application/json")
				      .header("Authorization","Bearer " + token)
				      .body("{\r\n"
						   		+ "    \"firstname\" : \"Ranjeet\",\r\n"
						   		+ "    \"lastname\" : \"Tiwari\",\r\n"
						   		+ "    \"totalprice\" : 111,\r\n"
						   		+ "    \"depositpaid\" : true,\r\n"
						   		+ "    \"bookingdates\" : {\r\n"
						   		+ "        \"checkin\" : \"2018-01-01\",\r\n"
						   		+ "        \"checkout\" : \"2019-01-01\"\r\n"
						   		+ "    },\r\n"
						   		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						   		+ "}")
				   .when()
				   .put("/booking/1121")
				   .then().log().all().extract().response().asString();
   }
	

}
