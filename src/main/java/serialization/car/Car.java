package serialization.car;

public class Car {
//	json
//	{
//		“name”:”XUV 500”,
//		“make”:”Mahindra”,
//		“engine”:{
//		“power”:”140 BHP”,
//		“cc”:”2179”
//		}
//	}
	private String name;
	private String make;
	Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
}
