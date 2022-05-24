package serialization.car2;

import java.util.List;

public class Car2 {
	String make;
	String Model;
	Engine engine;
	List<ElectronicIteams>electronics;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<ElectronicIteams> getElectronics() {
		return electronics;
	}
	public void setElectronics(List<ElectronicIteams> electronics) {
		this.electronics = electronics;
	}
	
	
}
