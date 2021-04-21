import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class Get1_Request {
	

	@Test
	 void getuserDetails()
	 {
RestAssured.baseURI = "https://npr-development-rest.medecision.cloud";
RestAssured.basePath = "/providerGroup/exists/taxId";
Response response = given().headers("Token","cKmNhUY3BDUqqJS1DyajnPRrR1bUliQAsXIT41BZSW2VEUJXFnEM6U2MegXav5l2ADikdJKOE6rmf7Kk3knPh2fX9rShwWbojfoXBMqRnZUx31WELDmnchPc3yv%2F2%20UKADqzGBz8ELHkGJWIPHHt18h9tg%20%20AzBTZXSkI%20og5XQse%2FA5%2FggpfDhIcV2QDc%2Fs92noSoZAsJgqrpCUnJjGqyQ3I3lIhNy1Mip%20Gyi%20gSHADbqXyx%2FdEXdxWSacv80Z8NLA5SD4O5Eska4l3Rggqhkg%20cYM1JCPt%20BQQ7MwwH9WARpk0Nsr9g0KtiHp%20%20Bv3dAzwDrkIv%2Fl0hSN%208sDXkgfJVAurYU7xbyyLDupQA%2FnoOzaxFhfey7GvGevi7FbMWNCWZ6sitGLtTF4fo9EaxSlTZ2HD%20ENU%20mp%20vNUSM%2FZ1ih8LvAcNkXm9sOxtuJwDRtQ6%2FRSS6kJXjdzHwHzp50LcWmWS4xYUG4FzInfTwcQpx9PQJZm1BFMXBneMylme7NCLfcb7SSEXHe2FlU2kYl%2FdurtBdM9QV9%2FzvEmH%20sDEPvJe1ikLZ0EGBRTD4uh").when().get("/330717039").then().extract().response();

	String body = response.getBody().asString();
	int status = response.getStatusCode();
	System.out.println(response.getBody().asString());
	Assert.assertEquals(status, 201);
}
	
	}
