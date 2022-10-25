package springAutowireAnnotationWithXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//example for @Autowired with xml configuration
public class Car {

	@Autowired
	@Qualifier("bmw")
	private Engine e;
	
	public void carInformation() {
		System.out.println("----car info----" + e.toString());
	}
}
