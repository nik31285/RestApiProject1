package dummyrestapi;
import static io.restassured.RestAssured.given;
public class PUT {
	public static void main(String[] args) {
		given()
		.body("{\r\n" + 
				"    \"name\":\"David\",\r\n" + 
				"    \"salary\":\"112556\",\r\n" + 
				"    \"age\":\"33\"\r\n" + 
				"    }")
		.when()
		.put("https://dummy.restapiexample.com/api/v1/update/22")
		.then()
		.log()
		.all();		
	}
}
