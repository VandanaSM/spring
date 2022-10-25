package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Studentdemo.xml");
		StudentDTO dto=(StudentDTO) app.getBean("s");
		System.out.println("Id: " + dto.getId());
		System.out.println("Name: " + dto.getName());
		System.out.println("RollNo: " + dto.getRollNo());
	}
}
