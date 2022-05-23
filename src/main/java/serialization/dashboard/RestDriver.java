package serialization.dashboard;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;

import io.restassured.http.ContentType;
//"courses": {
//	 "webautomation": [
//	 {
//	 "coursename": "selenium",
//	 "fee": "5000"
//	 },
//	 {
//	 "coursename": "protractor",
//	 "fee": "3000"
//	 }
//	 ],
//	 "api": [
//	 {
//	 "coursename": "RestAPI",
//	 "fee": "7000"
//	 },
//	 {
//	 "coursename": "postman",
//	 "fee": "2000"
//	 }
//	 ]
//	 }
public class RestDriver {

	public static void main(String[] args) {
		Courses courses =new Courses();
	//	courses.setCourse(courses);
		CourseDetails c1= new CourseDetails();
		CourseDetails c2= new CourseDetails();
		CourseDetails c3= new CourseDetails();
		CourseDetails c4= new CourseDetails();
		c1.setCoursename("selenium");
		c1.setFee("5000");
		c2.setCoursename("protractor");
		c2.setFee("3000");
		c3.setCoursename("RestAPI");
		c3.setFee("7000");
		c4.setCoursename("postman");
		c4.setFee("2000");
		ArrayList<CourseDetails> webautomation=new ArrayList<CourseDetails>();
		webautomation.add(c1);
		webautomation.add(c2);
		ArrayList<CourseDetails> api=new ArrayList<CourseDetails>();
		api.add(c3);
		api.add(c4);
		courses.setWebautomation(webautomation);
		courses.setApi(api);
		given()
		.contentType(ContentType.JSON)
		.body(courses)
		.log()
		.all()
		.when()
		.post()
		.then()
		.log()
		.all();
	}
}
