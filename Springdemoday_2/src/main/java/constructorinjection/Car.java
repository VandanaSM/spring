package constructorinjection;

public class Car {

	//data comes from UI
	private int id;
	private String name;
	private String model;
	private double price;
	
	public Car(int id, String name, String model, double price) {  //default constructor is also present
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public void displayCar() {
		System.out.println("Id:" + this.id);
		System.out.println("Name: " + this.name );
		System.out.println("model: " +this.model );
		System.out.println("Price: " + this.price);
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
