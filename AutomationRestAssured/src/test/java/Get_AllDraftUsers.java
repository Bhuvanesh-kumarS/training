import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_AllDraftUsers {
	
	@Test
	void getalldraftusers() throws InterruptedException
	{
	RestAssured.baseURI = "https://npr-development-rest.medecision.cloud/admin";
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("env","NPR","Token","cKmNhUY3BDUqqJS1DyajnPRrR1bUliQAsXIT41BZSW2VEUJXFnEM6U2MegXav5l2Q24KdWad4lojYOtZD3ZwymWPSHaq6NJf%2FgoSVlVkV%202lTLSgEtmJMjeYCqcD5jezoSh1Zk2%20Ns9EhQDwFEAYNzhRyRkctt%20y%2FflePVlYch%2FQFFO3%20W66IureCNCqc0dnWgYEXsif6KZKoBIME2wKpASR3QdDwikyZeuOS0NGLK4VziVKWaDD9pKLt9T2QbCWJr5EpdL1v49CM7QDZumDZ0qZlFG8jq2hF1qPVJxeosSswAyPcONACh1nm3CDAtVL%20VbZ9PTFr%20ysaCTASM1F2Vvgi6H90d053%2F0WCfljeD28ev%20nuRWtcnurV0ijtr%20%20vxLriOclhxN8kZGaPC0ccp7fcd2Mh1qoU2eVCiD08QgQdIdbyU5qXm2Ktogli96dHjtL%20l0RZf6s6hYPqhroV2j92xsMW3gvlCpZ6zcjauZ2EZTLghjgZ4AP6X6RG92TnNcG7IrDHl1S3%2F3xXpNB3ex35XtSv2YfMpAMUcoXUYOD84mXjXv%20N6ObmDzeP%20YQMizsebS6JYpO4iCfK%2FTeYA4EnqQOBTobiaIL5zlRMHlqVEp%20ZgOUgCrEq2ATNcTrl5xTkBa0ebokFbktMmsOAqeV6FNl1mxbn6L1yBiRIPbuzhvAsXMxLrz7gGKBqEznu0NNc5JZO7lhlRVW0dV79%2FTbI2VFUw2r860OM16e3Vspy%2F81Tu3rDmj92r0L62YoVK3aQNn3EmutubipiZJtL5%2FpFdrYJeFgvUZ%2FJoKQKP4sQX77l5%20R9Ar43YGzaeWIGipszsqAnhgsEYRr5VimfQ%3D%3D");
	Response response = httpRequest.request(Method.GET, "/draftUsers");
	String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  Assert.assertEquals(statusCode, 200);

}
}	
/*@Test
void checkResponseBody()
{
	String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  //Assert.assertEquals(statusCode, 200);
	  
	  //status line verification
	  String statusLine=response.getStatusLine();
	  System.out.println("Status line is:"+statusLine);
	  //Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
}
}*/