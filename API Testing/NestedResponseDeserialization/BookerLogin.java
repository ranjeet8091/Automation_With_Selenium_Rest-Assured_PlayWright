package classWork;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;

public class BookerLogin {

    public static String getToken() {

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        String response = given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}")
        .when()
                .post("/auth")
        .then()
                .extract()
                .response()
                .asString();

        String token = new JsonPath(response).getString("token");

        return token;
    }
}
