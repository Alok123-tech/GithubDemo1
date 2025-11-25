package api.testcases;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.testautomation.apitesting.utils.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class NewTest {
  @Test
  public void f() {
	  
	  String payload = "extends BaseTes";
	  RestAssured.given().baseUri("").contentType(ContentType.JSON).body(payload).when().post().then()
	  .assertThat().statusCode(200).body("token",Matchers.notNullValue()).body(JsonSchemaValidator.matchesJsonSchema("C:\\"))
	  cvbdsjvvbh}
