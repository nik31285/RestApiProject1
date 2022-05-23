package serialization.dashboard;

public class CourseDetails {
//	 {
//		 "coursename": "RestAPI",
//		 "fee": "7000"
//		 },
	String coursename;
	String fee;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
}
