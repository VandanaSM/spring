package DP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("mebean.xml");
	    Me me=ap.getBean("Vandana",Me.class);
	    System.out.println("name:" +me.getName());
	    System.out.println("Job:" + me.getB().getDesign());
	    System.out.println("List of govt ids:" +me.getListOfIds());
	    
		
	}
}
