package serialization.dashboard;

public class Dashboard {
//	"dashboard": {
//    "purchaseAmount": 40000,
//    "website": "www.testingshastra.com",
//    "studentId" : "911"
//  }
	int purchaseAmount;
	String website;
	String studentId;
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
