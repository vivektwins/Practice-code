package Test.Integer;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.Random;
import java.util.UUID;



public class Random100UsersPostHit {
	
	static String host= "https://reqres.in/";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randomGenerator = new Random();  
		
		System.out.println(randomGenerator.nextInt(999999999)); 
		
		UUID randomUUID = UUID.randomUUID();
		
		
		for(int i=0;i<100;i++)		{
			
			String name= randomUUID.toString().replace("-", "");

			String input = "{\n"
				+ "    \"name\": \""+name+"\",\n"
				+ "    \"job\": \"leader\"\n"
				+ "}";
		
		
		Response response = given().contentType(ContentType.JSON).and().body(input).when().post(host+"api/users").then()
				.extract().response();
		System.out.println(response.headers());
		for(Header h: response.headers())
		{
			System.out.println(h.getName());
			
		}
		}
		
		
		
	}


	

}
