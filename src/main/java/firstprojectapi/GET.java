package firstprojectapi;
import static io.restassured.RestAssured.given;
public class GET {
	public static void main(String[] args) {
		given()
	//	.header("Content-Type","application/json")
	//	.header("Authorization","Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
		.when()
		.get("https://gorest.co.in/public/v2/users/")
		.then()
		.log()
		.all();
	}

}
