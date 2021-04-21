
	import java.util.HashMap;
    import java.util.Map;

    import org.testng.Assert;
	import org.testng.annotations.Test;
	//import io.restassured.http.Headers;

	import io.restassured.RestAssured;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class GetAllDraftUsers {

	 
	 @Test
	 void getAllDraftUsers()
	 {
	  //Specify base URI
	  RestAssured.baseURI="https://npr-development-rest.medecision.cloud/admin";
	  
	  Map<String, String> headers = new HashMap<String, String>()
		 {
	 {
	 put("env","NPR");
	 put("Token","cKmNhUY3BDUqqJS1DyajnPRrR1bUliQAsXIT41BZSW2VEUJXFnEM6U2MegXav5l2CvkAekbA0%2F8hvJ%20ngfOLBqBKhuMFva2f%20ITT1ra3CH%2F7E3FaCfaXMI3au2S%2FUs9kAEz5N%2FFz6dF8SKnYupmDTnfHNsJcj4TKN%2FFN64wt866QsJuXqWzfAUs3v9b9YeouEpyTPHheG0rdEFJyxV4YCdN5ggUV6V4cavbHxZTt8wtxXo%2FVGBNO%2FAytET3Um4wIR%20V11jXUMqzs7QC3nGZe2mUvVsywN53wmh00P%20IU4JHAhxt6UlSNnGAz%20lQ9KRc1RnP1Lu2xEm%2F52%20P7MA3i8jZ%2F7PnPK8ySIro7cOPfmZnYQ9ADTmHUTNInzkB%2FClWeWDOZ7FTkLiIxUSRD5zjWRuTMyUu2YGbLWdjfQbWqf62HVgkPvQc8R8NR1nT5pgSYrCyc3JXVZ1xLdrE1v08S6CqIBf1CwriOvIklvWhGCmXIZHn6mUflR0CsKHj0%2FvJqCMPvRX4kaYp2JPomcAhYgFhNh8YlBGEK0oxKNIGqQtchBJWYl73d05zMZOLLkt%20yqWf96sQwMVUQEhIni7C4TOveKCYwnrGt9xkAYOtne26T6e8qOzymz6MovZNWZ7VP1iAVRo8QxGY1O95Fe8j9JQcqfBZernLd08%20JeVCReGbg%20C%20PljUu97wxiSqEa4ie%2FOwzG9%2Fy2FLl%2FKok9BXRN7aWgsritwW9tIFJnt33h1kV60fXpwwuifY5vcBMo60mm%20CkbPizu0fcLFXLMtNabyKMEpMtpLVcZV2szZJNujFp70mTZ13Y6GksmKq51rKz8knevEnwxu4TOKn294bSQg%3D%3D");
		 }
		 };
	  
	  //Request object
	  RequestSpecification httpRequest=RestAssured.given().headers(headers);
	  
	  //Response object
	  Response response=httpRequest.request(Method.GET,"/draftUsers");
	  
	  
	  //print response in console window
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  Assert.assertEquals(statusCode, 200);
	  
	  //status line verification
	  String statusLine=response.getStatusLine();
	  System.out.println("Status line is:"+statusLine);
	  Assert.assertEquals(statusLine, "HTTP/1.1 200 ");
	  
	 }
	  
	}



