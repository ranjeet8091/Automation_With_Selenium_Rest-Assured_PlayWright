package rahulShety;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.File;

public class AddProduct {

	public static void main(String[] args) {
		LoginPage.getToken();
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		Response response =  given()
		        .header("Authorization", LoginPage.token)
		        .multiPart("productImage",
		                new File("C:\\Users\\rantiwar1\\Downloads\\productImage_1767959158182.jpg"))
		        .formParam("productName", "Laptop")
		        .formParam("productAddedBy",LoginPage.userId)
		        .formParam("productCategory", "Electronics")
		        .formParam("productSubCategory", "accessories")
		        .formParam("productPrice", "55000")
		        .formParam("productDescription", "I7")
		        .formParam("productFor", "all")
		.when()
		        .post("/api/ecom/product/add-product")
		.then()
		        .extract()
		        .response();

		System.out.println(response.asPrettyString());

	}
}
