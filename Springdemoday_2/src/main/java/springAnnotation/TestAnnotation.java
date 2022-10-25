package springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(TestConfig.class);  //xml not used so annotationconfig... used 
		Car car=ap.getBean(Car.class);
		//car.carInformation();
		System.out.println(car);
	}
}
