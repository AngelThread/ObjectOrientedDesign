package com.ugur.yeter.lesson_3;

public class SchoolSimulator {
	
	public static void main(String[] args) {

		EnglishTeacher englishTeacher = new EnglishTeacher ();
		englishTeacher.teach();
		englishTeacher.performOtherDuties();
		System.out.println("------------Teaching Line--------------------");
		SubstituteTeacher subTeacher = new SubstituteTeacher ();
		subTeacher.performOtherDuties();
		
	}
}
