package serialization.car;
import static io.restassured.RestAssured.given;

import javax.annotation.meta.When;

import io.restassured.http.ContentType;
//json
//{
//	“name”:”XUV 500”,
//	“make”:”Mahindra”,
//	“engine”:{
//	“power”:”140 BHP”,
//	“cc”:”2179”
//	}
//}
public class RestCar {

	public static void main(String[] args) {
		
		Engine engine=new Engine();
		engine.setCc("2179");
		engine.setPower("140BHP");
		
		Car car=new Car();
		car.setMake("Mahindra");
		car.setName("XUV 500");
		car.setEngine(engine);
		
		given()
		.contentType(ContentType.JSON)
		.body(car)
		.log()
		.all()
		.when()
		.post("")
		.then()
		.log()
		.all();
//		
	
		
	}

}
