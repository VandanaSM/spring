package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterMain {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("constructorinjectionbean.xml");
		System.out.println("--------------------");
		Person person=(Person) ap.getBean("devraj");
		person.displayPerson();
		Car i20=ap.getBean("i20",Car.class);
		i20.displayCar();
		Car bmw=ap.getBean("bmw",Car.class);
		bmw.displayCar();
		
		
	}
}
