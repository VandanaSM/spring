package springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//example for @Autowired with xml configuration
public class Car {

	@Value("bmw")
	private String name;
	@Value("6000000.50")
	private double price; 
	@Autowired
	private Engine e;
	
	public void carInformation() {
		System.out.println("----car info----" + e.toString());
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", e=" + e + "]";
	}
	
}
