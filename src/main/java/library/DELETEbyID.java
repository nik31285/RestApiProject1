package library;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
public class DELETEbyID {
	public static void main(String[] args) {
		given()
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				" \r\n" + 
				"\"ID\" : \"abcd2\"\r\n" + 
				" \r\n" + 
				"} \r\n" + 
				"")
		.when()
		.delete("http://216.10.245.166/Library/DeleteBook.php")
		.then()
		.log()
		.all();
	}
}
