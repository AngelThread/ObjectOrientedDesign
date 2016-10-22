package com.ugur.yeter.lesson_3;

public class MathTeacher extends SchoolStaff implements CourseInstructor{

	@Override
	public void teach() {
		System.out.println("I am teaching math because whole universe can be explained by math in a way");
	}

}
