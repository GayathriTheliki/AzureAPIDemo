package sampleProjPack;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class addBook {
	
	
	@Test
	public void book() {
		RestAssured.baseURI= "https://rahulshettyacademy.com";	
		String res = given().header("Content-Type","application/json").body("{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcdhh9h\",\r\n"
				+ "\"aisle\":\"227\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "").relaxedHTTPSValidation().when().post("/Library/Addbook.php")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js = reusableMethods.rawToJson(res);
		String id = js.get("ID");
		
	
		Assert.assertEquals("bcdhh9h227",id);
	}
	@Test
	void checkResponsetime() {
		
	}
}
