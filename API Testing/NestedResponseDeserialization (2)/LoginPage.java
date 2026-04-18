package rahulShety;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class LoginPage {
 
	public static String userId = "";
	public static String token = "";
	

    public static void getToken() {

        RestAssured.baseURI = "https://rahulshettyacademy.com/";

        String response = given()
                .contentType("application/json")
                .body("{\n" +
                        "\"userEmail\": \"ranjeet@gmail.com\",\n" +
                        "\"userPassword\": \"Ranjeet@123\"\n" +
                        "}")
        .when()
                .post("api/ecom/auth/login")
        .then()
                .extract()
                .response()
                .asString();

        JsonPath js = new JsonPath(response);

         token = js.getString("token");
         userId =js.getString("userId");
        
    }
}

