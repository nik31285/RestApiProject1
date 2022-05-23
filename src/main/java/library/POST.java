package library;
import static io.restassured.RestAssured.given;
public class POST {

	public static void main(String[] args) {
		given()
		.body("{\r\n" + 
				"\r\n" + 
				"\"name\":\"Basics of Java\",\r\n" + 
				"\"isbn\":\"abcd\",\r\n" + 
				"\"aisle\":\"2\",\r\n" + 
				"\"author\":\"Niks\"\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
	}

}
