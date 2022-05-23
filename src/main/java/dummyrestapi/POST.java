package dummyrestapi;
import static io.restassured.RestAssured.given;
public class POST {
	public static void main(String[] args) {
		given()
		.body("{\r\n" + 
				"    \"name\":\"Nikks J\",\r\n" + 
				"    \"salary\":\"156860\",\r\n" + 
				"    \"age\":\"30\"\r\n" + 
				"    }")
		.when()
		.post("https://dummy.restapiexample.com/api/v1/create")
		.then()
		.log()
		.all();
	}

}
