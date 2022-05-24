package serialization.dashboard2;

import java.util.List;
//"webautomation":[
//"api":[
//"MobileAutomation":[
public class Courses {
	private List<CourseDetails> webautomation;
	private List<CourseDetails> api;
	private List<CourseDetails> Mobileautomation;
	
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
	public List<CourseDetails> getMobileautomation() {
		return Mobileautomation;
	}
	public void setMobileautomation(List<CourseDetails> mobileautomation) {
		Mobileautomation = mobileautomation;
	}
	
}
