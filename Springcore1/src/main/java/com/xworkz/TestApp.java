package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		/*ApplicationContext is a subInterface of BeanFactory 
		 * It creates the object by reading Spring Bean xml(demo.xml) file
		 * ApplicationContext loads the xml file and will perform pre instantiation 
		 * Spring always creates singleton object
		 *  */
		ApplicationContext ap=new ClassPathXmlApplicationContext("demo.xml");
		System.out.println("--------Application Context--------");
		//getBean method will take argument as bean id and return object created by ApplicationContext
		//always getBean will return Object class
		//we need to downcast as per pojo class
		Demo d=(Demo)ap.getBean("d"); //pass id from xml
		System.out.println("-----------Demo------" +d.getMsg());
	}
}
