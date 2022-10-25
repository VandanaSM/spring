package DP;

import java.util.List;

public class Me {

	//di using setter injection
	private String name;
	private Job B ;
	private List<Integer> listOfIds;
	
	public Me() {
		System.out.println("--------Me object created----------");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getB() {
		return B;
	}
	public void setB(Job b) {
		B = b;
	}
	public List<Integer> getListOfIds() {
		return listOfIds;
	}
	public void setListOfIds(List<Integer> listOfIds) {
		this.listOfIds = listOfIds;
	}
	
}
