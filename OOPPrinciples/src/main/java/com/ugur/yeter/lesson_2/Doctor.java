package com.ugur.yeter.lesson_2;
// Open Closed Principle. Open for extension closed for modification.
public class Doctor extends Employee
{

	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action....");
	}

	private void prescribeMedicine(){
		System.out.println("Prescribing medicine...");
	}
	
	private void diagnosePatient(){
		System.out.println("Diagnosing patient...");
	}

	@Override
	public void performYourDuties() {
		diagnosePatient();
		prescribeMedicine();		
	}
}
