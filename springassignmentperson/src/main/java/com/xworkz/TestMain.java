package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Persondemo.xml");
		Person dto= (Person) app.getBean("s");
		System.out.println("Id: " + dto.getId());
		System.out.println("Name: " + dto.getName());
		System.out.println("Car: " + dto.getCar());
		
		Car ca=(Car) app.getBean("v");
		System.out.println("Id: " +ca.getId());
		System.out.println("Name: " + ca.getModel());
		System.out.println("Model:" + ca.getName());
		System.out.println("Price: " +ca.getPrice());
		
		
		
		
		
	}
}
