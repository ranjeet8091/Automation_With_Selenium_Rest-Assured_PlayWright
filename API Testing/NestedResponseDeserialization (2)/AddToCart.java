package rahulShety;

import io.restassured.RestAssured;

public class AddToCart {
	public static void main(String[] args) {
		LoginPage.getToken();
		
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
	}

}
 