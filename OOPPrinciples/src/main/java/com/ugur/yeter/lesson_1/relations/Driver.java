package com.ugur.yeter.lesson_1.relations;

//Dependency Association
public class Driver {
	// Driver object needs Vehicle objects to be able to drive.
	
	/**
	 *  Driver object depends on Vehicle object as seen.
	 *  This dependency that is referred "Dependency Association"
	 * */
	public void drive(Vehicle raceCar){ 
		raceCar.accelerate();
	}

}
