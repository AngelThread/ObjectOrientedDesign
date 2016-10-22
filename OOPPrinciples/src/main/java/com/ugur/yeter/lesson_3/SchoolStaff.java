package com.ugur.yeter.lesson_3;
// Liskov Substitution Principle
public class SchoolStaff {
	private String name;
	
	private void makeAnnouncement(){
		System.out.println("makeAnnouncement method is here");
	}
	
	private void takeAttendance(){
		System.out.println("takeAttendance method is here");
	}
	
	private void collectPaperWork(){
		System.out.println("collectPaperWork method is here");
	}

	private void conductHallwayDuties(){
		System.out.println("conductHallwayDuties method is here");

	}
	
	public void performOtherDuties(){
		makeAnnouncement();
		takeAttendance();
		collectPaperWork();
		conductHallwayDuties();
	}
}

