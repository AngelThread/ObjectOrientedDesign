package com.ugur.yeter.objectrelations;

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
