package serialization.dashboard;
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
import java.util.List;

public class Courses {
	List<CourseDetails> webautomation;
	List<CourseDetails> api;
//	Courses course;
//	public Courses getCourse() {
//		return course;
//	}
//	public void setCourse(Courses course) {
//		this.course = course;
//	}
	public List<CourseDetails> getWebautomation() {
		return webautomation;
	}
	public void setWebautomation(List<CourseDetails> webautomation) {
		this.webautomation = webautomation;
	}
	public List<CourseDetails> getApi() {
		return api;
	}
	public void setApi(List<CourseDetails> api) {
		this.api = api;
	}
}

