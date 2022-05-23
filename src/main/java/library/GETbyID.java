package library;
import static io.restassured.RestAssured.given;
public class GETbyID {
	public static void main(String[] args) {
		given()
		.when()
		.get("http://216.10.245.166/Library/GetBook.php?ID=abcd2")
		.then() 
		.log()
		.all();
	}
}
