package serialization.car2;

import java.util.ArrayList;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
public class RestDriver1 {

	public static void main(String[] args) {
		Engine engine1=new Engine();
		engine1.setCc(2399);
		engine1.setPower("150BHP");
		
		ArrayList<ElectronicIteams> l1=new ArrayList<ElectronicIteams>();
		
		ElectronicIteams e1=new ElectronicIteams();
		e1.setPrice(10000);
		e1.setType("music player");
		
		ElectronicIteams e2= new ElectronicIteams();
		e2.setPrice(20000);
		e2.setType("mirrors");
		
		l1.add(e1);
		l1.add(e2);
		
		Car2 car =new Car2();
		car.setModel("XUV500");
		car.setMake("Mahindra");
		car.setEngine(engine1);
		car.setElectronics(l1);

		given()
		.contentType(ContentType.JSON)
		.body(car)
		.log()
		.all()
		.when()
		.post("192.168.0.228:8090")
		.then()
		.log()
		.all();
		
	}

}
