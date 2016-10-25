package com.ugur.design.patterns.observer;

public class Employee {

	private String name;
	private int id;
	
	public Employee(String name,  int id) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


}
