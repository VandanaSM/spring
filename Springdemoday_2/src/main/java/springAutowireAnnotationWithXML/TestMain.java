package springAutowireAnnotationWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("autowiredAnnotationWithXml.xml");
		Car car= (Car) ap.getBean("c",Car.class);
		car.carInformation();
	}
}
