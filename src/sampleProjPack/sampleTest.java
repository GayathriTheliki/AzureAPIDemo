package sampleProjPack;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void testo(){
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		
		//Get book
		
		String getResponse=	given().log().all().queryParam("AuthorName", "rahulshetty")
		
		.relaxedHTTPSValidation().when().get("/Library/GetBook.php")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
	
		//JsonPath js1=ReUsableMethods.rawToJson(getResponse);

		//System.out.println(js1);
		
		//Get
		}
		
		@Test
		void checkCode() {
			
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		String getResponse1=	given().log().all().queryParam("ID", "3389")
				
				.relaxedHTTPSValidation().when().get("/Library/GetBook.php")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
	
		Assert.assertEquals("200","200");
		}
		

	

}
