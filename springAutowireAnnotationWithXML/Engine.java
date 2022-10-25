package springAutowireAnnotationWithXML;

public class Engine {

	private String model;
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
