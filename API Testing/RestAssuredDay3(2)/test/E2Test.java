package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import request.Data;
import request.RequestApi;
import response.ResponseApi;
import response.Welcome;

import static io.restassured.RestAssured.given;

public class E2Test {

	@Test
	public void TestApi() {
		
		RequestApi request = new RequestApi();
		request.setName("Apple MacBook Pro 16");
		
		Data data = new Data();
		data.setYear(2019);
		data.setPrice(1849.99);
		data.setCPU_model("Intel Core i9");
		data.setHard_disk_size("1 TB");
		
		request.setData(data);
		
		request.setName("Apple MacBook Pro 16");
		
		ResponseApi response = given()
				.baseUri("https://api.restful-api.dev")
		        .contentType("application/json")
		        .body(request)  
		.when()
		        .post("/objects")
		.then()
		        .extract()
		        .as(ResponseApi.class);

		if(!(response.getId()==null)) {
		System.out.println(response.getId());
		System.out.println(response.getName());
		System.out.println(response.getCreatedAt());
		}
		else{
			System.out.println(response.getError());
		}
		

	}
}
