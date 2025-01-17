import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Request {
 
 @Test
 void CreateSuccessful()
 {
  
  //Specify base URI
  RestAssured.baseURI="https://npr-development-rest.medecision.cloud/actuator/loggers/changelevel/com.medecision.npr";
  
  //Request object
  RequestSpecification httpRequest=RestAssured.given();
  
   
  //Request paylaod sending along with post request
  JSONObject requestParams=new JSONObject();
  
  //requestParams.put("name","morpheus");
  //requestParams.put("job","leader");
  /*requestParams.put("UserName","JohnXYZ");
  requestParams.put("Password","JohnXYZxyx");
  requestParams.put("Email","JohnXYZ@gmail.com");*/
  
  httpRequest.header("Content-Type","application/json");
  
  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
  
  //Response object
  Response response=httpRequest.request(Method.POST,"/ERROR");
		  
  
  //print response in console window
  
  String responseBody=response.getBody().asString();
  System.out.println("Response Body is:" +responseBody);
  
  //status code validation
  int statusCode=response.getStatusCode();
  System.out.println("Status code is: "+statusCode);
  Assert.assertEquals(statusCode, 200);
  
  //success code validation
  /*String successCode=response.jsonPath().get("SuccessCode");
  Assert.assertEquals(successCode, "OPERATION_SUCCESS");*/
  
 }
 

}