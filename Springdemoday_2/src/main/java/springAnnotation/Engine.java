package springAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Engine {

	@Value("2022")   //give values or else create object in getEngine()
	private String model;
	@Value("60000")
	private String horsePower;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", horsePower=" + horsePower + "]";
	}
	
	
    
}
