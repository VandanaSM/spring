package constructorinjection;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private List<Car> listOfCars;
	
	public Person(int id, String name, List<Car> listOfCars) {
		super();
		this.id = id;
		this.name = name;
		this.listOfCars = listOfCars;
	}
	
	public void displayPerson() {
		System.out.println("Id: " + this.id);  //as no getter and setters use this
		System.out.println("Name: " +this.name);
		System.out.println("list od cars: " +this.listOfCars);
	}
}
