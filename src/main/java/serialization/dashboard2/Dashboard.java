package serialization.dashboard2;
//"purchaseAmount": 40000,
//"website": "www.testingshastra.com",
//"studentId" : "911"
public class Dashboard {
	private int purchaseAmount;
	private String  website;
	private String studentId;
	
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
