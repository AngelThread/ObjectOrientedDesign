package com.ugur.yeter.object.relations;

//Composition Association
public class Vehicle {
	
	Engine engine; 
	/*** Engine is only lives in a vehicle object.
	 * Composition Association
	**/
	public void startEngine(){
		System.out.println("Engine is started");
	}
	
	public void stopEngine(){
		System.out.println("Engine is stopped");

	}

	public void accelerate(){
		System.out.println("Engine is accelerating");
	}
}
