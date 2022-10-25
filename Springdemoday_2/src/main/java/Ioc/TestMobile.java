package Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {

	public static void main(String[] args) {
		
//		Sim air=new Jio();
//		air.calling();
//		air.data();
		ApplicationContext ap=new ClassPathXmlApplicationContext("simbean.xml");
		//ApplicationContext creates simbean object 
		Sim air=ap.getBean("sim",Airtel.class);
		air.calling();
		air.data();
	}
}
