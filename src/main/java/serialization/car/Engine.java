package serialization.car;
//json
//{
//	“name”:”XUV 500”,
//	“make”:”Mahindra”,
//	“engine”:{
//	“power”:”140 BHP”,
//	“cc”:”2179”
//	}
//}
public class Engine {
	private String power;
	private String cc;
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	
}
