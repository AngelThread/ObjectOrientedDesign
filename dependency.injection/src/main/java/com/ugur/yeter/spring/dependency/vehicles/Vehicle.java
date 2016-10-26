package com.ugur.yeter.spring.dependency.vehicles;

import com.ugur.yeter.spring.dependency.parts.Engine;

public class Vehicle {
	
	private Engine myEngine;
	
	public Vehicle(Engine myEngine) {

		this.myEngine = myEngine;
	}

	public Engine getMyEngine() {
		return myEngine;
	}
	
	public void crackIgnition(){
		
		System.out.println("Engine is started with "+myEngine.getHorsePower()+" horse power");
	}

}
