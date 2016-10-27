package com.ugur.design.patterns.factory;

public class VehicleFactory {
	
	public Vehicle getVehicle(VehicleType vehicleType){
		
		return vehicleType.getRelatedVehicle();
	}

}
