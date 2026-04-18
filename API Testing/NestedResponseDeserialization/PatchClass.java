package classWork;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class PatchClass {
	
	  public static void main (String[] args) {
		   String token = new BookerLogin().getToken();
			
			RestAssured.baseURI = "https://restful-booker.herokuapp.com";
			
			String response = given().log().all()
					      .header("content-Type","application/json")
					      .header("Authorization","Bearer " + token)
					      .body("{\r\n"
							   		+ "    \"firstname\" : \"Sunakshi\",\r\n"
							   		
							   		+ "}")
					   .when()
					   .patch("/booking/1121")
					   .then().log().all().extract().response().asString();
	   }

}
