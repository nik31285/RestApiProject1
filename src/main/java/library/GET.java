package library;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
public class GET {
	public static void main(String[] args) {
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://216.10.245.166/Library/GetBook.php?AuthorName=Niks")
		.then()
		.log()
		.all();
	}
}
