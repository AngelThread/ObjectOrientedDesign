package com.ugur.yeter.lesson_2;
// Lesson 2
//Open Closed Principle. Open for extension closed for modification.
// Strategy Pattern is used.
public abstract class Employee {
	private long id = -1L;
	private String name = null;
	private String department = null;
	private boolean working = false;
	
	
	

	public Employee(long id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	
	
	public abstract void performYourDuties();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

}
