package firstprojectapi;
import static io.restassured.RestAssured.given;
public class dummyRestAPIDemo {
	public static void main(String[] args) {
		given()
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")
		.then()
		.log()
		.all();
	}
}
