package serialization.lib;
//{
//"name":"My java book",
//"isbn":"xyz",
//"aisle":"123568",
//"author":"NBP"
//}
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
public class PostBook {

	public static void main(String[] args) {
		RestLib book=new RestLib();
		book.setName("My java book");
		book.setIsbn("xyz");
		book.setAisle("1235");
		book.setAuthor("NBP");
		given()
		.contentType(ContentType.JSON)
		.body(book)
		.log()
		.all()
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
	}

}
