package com.tech;

public class Employee {
	
	private String name;
	
	private int id;
	
	
	
	public Employee() {
		System.out.println("No Parameter Constructor...");
	}
	
	
	
	public Employee(int id) {
		System.out.println("id Parameter Constructor...");
		this.id = id;
	}



	public Employee(String name) {
		System.out.println("inside name Constructor ...........");
		this.name = name;
	}

	public void setName(String name) {
		System.out.println("inside name setter...........");

		this.name = name;
	}
	
	public String getName() {
		return name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		System.out.println("inside setter id");
		this.id = id;
	}
	
	

}
