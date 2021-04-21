import java.util.Map;
import java.util.HashMap;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Request {

 
 @Test
 void getalldraftuserDetails()
 {
	 Map<String, String> headers = new HashMap<String, String>()
			 {
		 {
		 put("env","NPR");
		 put("Token","cKmNhUY3BDUqqJS1DyajnPRrR1bUliQAsXIT41BZSW2VEUJXFnEM6U2MegXav5l2Q24KdWad4lojYOtZD3ZwymWPSHaq6NJf%2FgoSVlVkV%202lTLSgEtmJMjeYCqcD5jezoSh1Zk2%20Ns9EhQDwFEAYNzhRyRkctt%20y%2FflePVlYch%2FQFFO3%20W66IureCNCqc0dnWgYEXsif6KZKoBIME2wKpASR3QdDwikyZeuOS0NGLK4VziVKWaDD9pKLt9T2QbCWJr5EpdL1v49CM7QDZumDZ0qZlFG8jq2hF1qPVJxeosSswAyPcONACh1nm3CDAtVL%20VbZ9PTFr%20ysaCTASM1F2Vvgi6H90d053%2F0WCfljeD28ev%20nuRWtcnurV0ijtr%20%20vxLriOclhxN8kZGaPC0ccp7fcd2Mh1qoU2eVCiD08QgQdIdbyU5qXm2Ktogli96dHjtL%20l0RZf6s6hYPqhroV2j92xsMW3gvlCpZ6zcjauZ2EZTLghjgZ4AP6X6RG92TnNcG7IrDHl1S3%2F3xXpNB3ex35XtSv2YfMpAMUcoXUYOD84mXjXv%20N6ObmDzeP%20YQMizsebS6JYpO4iCfK%2FTeYA4EnqQOBTobiaIL5zlRMHlqVEp%20ZgOUgCrEq2ATNcTrl5xTkBa0ebokFbktMmsOAqeV6FNl1mxbn6L1yBiRIPbuzhvAsXMxLrz7gGKBqEznu0NNc5JZO7lhlRVW0dV79%2FTbI2VFUw2r860OM16e3Vspy%2F81Tu3rDmj92r0L62YoVK3aQNn3EmutubipiZJtL5%2FpFdrYJeFgvUZ%2FJoKQKP4sQX77l5%20R9Ar43YGzaeWIGipszsqAnhgsEYRr5VimfQ%3D%3D");
			 }
			 };
			 
			 
			 Response response = given()
			 .headers(headers)
			 .when()
			 .get("https://npr-development-rest.medecision.cloud/admin/draftUsers")
			 .then()
			 .assertThat()
			 .statusCode(HttpStatus.SC_OK);
 }


}

			 //Specify base URI
  /*RestAssured.baseURI="https://npr-development-rest.medecision.cloud/providerGroup/exists/taxId";
  
//Response res = given().header("Token","").when().get("https://npr-development-rest.medecision.cloud/claimId/valid/").then().extract().response();
  
  //Header requestHeader = new Header("Token","cKmNhUY3BDUqqJS1DyajnPRrR1bUliQAsXIT41BZSW2VEUJXFnEM6U2MegXav5l2dCZEFA%2FdAdBuKO3EVqKg6JaFDidfbaE39%20fHWkqcmvzqoUuvmvMhY34dNGTO%20PK%2FSDOpdWOS4hm37LxoKwRmUA90Knx4KJAz1f84LnULGUJJkyvfA%20LL7bundMJf8Tq%20qi3WiG8xnEI09EbF5c07WsU3LHreZB7Ki2uItxaal7o%2FSui8vdFF5nPTkpdlxl2XHAgwvrVkQygHBymqa1At%2FEdUKoWxdkqFTRvlwX%20vQB2g63SB7MiPmog4hjAg4%20tf42K5tsK0lsNI1P7%20QX7CTiCByaK8StuIs9PXZCbyRaVnKW9EaZrSvsz2KrNaYwCPQ5iuWxkWciZ3Xy0AQcwYvZPkY0zLV77b5Pe5cumqPV%2FzKB4w9kDom0Qs6c7JGp0NtPtteoFdX%200Y%20dhckILYbng5zdhrG6BFkdA8eDldGv2C6WjE9gSATml%2F9HF%20P3BR5R42VY5pGW3tsZZhSAcTk99D04Ft%2FNHAAnUu4nKGAGOD2WyykdG34K6ZaAc6UHCp");
  //RestAssured.given().header(requestHeader);
  
  //Request object
  RequestSpecification httpRequest=RestAssured.given();
  
  //Response object
  Response response=httpRequest.request(Method.GET,"/330717039");
  
  RestAssured
     .given()
     .headers("Token","cKmNhUY3BDUqqJS1DyajnPRrR1bUliQAsXIT41BZSW2VEUJXFnEM6U2MegXav5l2dCZEFA%2FdAdBuKO3EVqKg6JaFDidfbaE39%20fHWkqcmvzqoUuvmvMhY34dNGTO%20PK%2FSDOpdWOS4hm37LxoKwRmUA90Knx4KJAz1f84LnULGUJJkyvfA%20LL7bundMJf8Tq%20qi3WiG8xnEI09EbF5c07WsU3LHreZB7Ki2uItxaal7o%2FSui8vdFF5nPTkpdlxl2XHAgwvrVkQygHBymqa1At%2FEdUKoWxdkqFTRvlwX%20vQB2g63SB7MiPmog4hjAg4%20tf42K5tsK0lsNI1P7%20QX7CTiCByaK8StuIs9PXZCbyRaVnKW9EaZrSvsz2KrNaYwCPQ5iuWxkWciZ3Xy0AQcwYvZPkY0zLV77b5Pe5cumqPV%2FzKB4w9kDom0Qs6c7JGp0NtPtteoFdX%200Y%20dhckILYbng5zdhrG6BFkdA8eDldGv2C6WjE9gSATml%2F9HF%20P3BR5R42VY5pGW3tsZZhSAcTk99D04Ft%2FNHAAnUu4nKGAGOD2WyykdG34K6ZaAc6UHCp")
     .log()
     .headers()
     .get("https://npr-development-rest.medecision.cloud/providerGroup/exists/taxId/330717039");
  
  
  //print response in console window
  
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
  

