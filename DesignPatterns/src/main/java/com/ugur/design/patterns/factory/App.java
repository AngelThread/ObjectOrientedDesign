package com.ugur.design.patterns.factory;

public class App {

	public static void main(String[] args) {

		VehicleFactory vehicleFactory = new VehicleFactory ();
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.ELECTRIC_CAR);
		vehicle.startEngine();
	}

}
