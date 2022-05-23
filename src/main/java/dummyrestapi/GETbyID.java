package dummyrestapi;
import static io.restassured.RestAssured.given;
public class GETbyID {

	public static void main(String[] args) {
		given()
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employee/2")
		.then()
		.log()
		.all();
	}

}
