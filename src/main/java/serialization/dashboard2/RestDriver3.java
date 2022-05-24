package serialization.dashboard2;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import groovy.util.logging.Log;
import io.restassured.http.ContentType;
public class RestDriver3 {
	
	public static void main(String[] args) {
		Dashboard d= new Dashboard();
		d.setPurchaseAmount(40000);
		d.setStudentId("911");
		d.setWebsite("www.testingshastra.com");
		
		Courses c=new Courses();
		ArrayList<CourseDetails>w=new ArrayList<CourseDetails>();
		
		CourseDetails c1=new CourseDetails();
		c1.setTitle("Selenium");
		c1.setPrice(4000);
		
		CourseDetails c2=new CourseDetails();
		c2.setTitle("Cypress");
		c2.setPrice(6000);
		
		CourseDetails c3=new CourseDetails();
		c3.setTitle("Protractor");
		c3.setPrice(7000);
		
		w.add(c1);
		w.add(c2);
		w.add(c3);
		
		c.setWebautomation(w);
		
		ArrayList<CourseDetails>a=new ArrayList<CourseDetails>();
		
		CourseDetails api1=new CourseDetails();
		api1.setTitle("Rest API");
		api1.setPrice(5000);
		
		CourseDetails api2=new CourseDetails();
		api2.setTitle("Soap UI");
		api2.setPrice(6000);
		
		a.add(api1);
		a.add(api2);
		
		c.setApi(a);
		
		ArrayList<CourseDetails>MoAuto=new ArrayList<CourseDetails>();
		CourseDetails m1= new CourseDetails();
		m1.setTitle("C-Test");
		m1.setPrice(5000);
		
		CourseDetails m2=new CourseDetails();
		m2.setTitle("Appium");
		m2.setPrice(6000);
		
		MoAuto.add(m1);
		MoAuto.add(m2);
		
		c.setMobileautomation(MoAuto);
		
		CourseStructure Object=new CourseStructure();
		Object.setDashboard(d);
		Object.setCourses(c);
		
		given()
		.contentType(ContentType.JSON)
		.body(Object)
		.log()
		.all()
		.when()
		.post()
		.then()
		.log()
		.all();
	}
}
