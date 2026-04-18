package test;


import resquest.requestApi;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import response.Welcome;

public class E2ETest {
	
	@Test
	public void Test1() {

	    requestApi request = new requestApi();
	    request.setDrilldowns("State");
	    request.setMeasures("Housing Median Value");
	    request.setYear("2022");

	    Welcome response = given()
	        .baseUri("https://api.datausa.io")
	        .queryParam("drilldowns", request.getDrilldowns())
	        .queryParam("measures", request.getMeasures())
	        .queryParam("year", request.getYear())
	    .when()
	        .get("/tesseract/cubes/acs_yg_housing_median_value_1")
	    .then()
	        .extract()
	        .as(Welcome.class);
	    
	    System.out.println(response.getName());

	}

}
