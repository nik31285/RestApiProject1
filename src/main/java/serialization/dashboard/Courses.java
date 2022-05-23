package serialization.dashboard;
//"courses": {
//    "webautomation":[
//      {
//        "title": "Selenium",
//        "price": 4000
//      },
//      {
//        "title": "Cypress",
//        "price": 6000
//      },
//      {
//        "title": "Protractor",
//        "price": 7000
//      }
//    ],
//    "api":[
//      {
//        "title": "Rest API",
//        "price": 5000
//      },
//      {
//        "title": "Soap UI",
//        "price": 6000
//      }
//    ],

import java.util.List;

public class Courses {
	List<WebAutomationCourses> webautomation;
	List<ApiCourses> api;
	public List<WebAutomationCourses> getWebautomation() {
		return webautomation;
	}
	public void setWebautomation(List<WebAutomationCourses> webautomation) {
		this.webautomation = webautomation;
	}
	public List<ApiCourses> getApi() {
		return api;
	}
	public void setApi(List<ApiCourses> api) {
		this.api = api;
	}
}
