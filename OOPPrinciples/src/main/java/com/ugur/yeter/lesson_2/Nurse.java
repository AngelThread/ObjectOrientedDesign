package com.ugur.yeter.lesson_2;
//Open Closed Principle. Open for extension closed for modification.
public class Nurse extends Employee
{

	public Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse is action...");
	}
	
	private void checkVitalSigns(){
		System.out.println("Checking vital signs....");
	}

	private void drawblood(){
		System.out.println("Drawing blood....");
	}
	
	private void cleanPatientArea(){
		System.out.println("Cleaning patient area...");
	}

	@Override
	public void performYourDuties() {
		checkVitalSigns();	
		drawblood();
		cleanPatientArea();
	}
}
