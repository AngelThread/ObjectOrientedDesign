package com.ugur.design.patterns.builder.homework;

public class VehicleFactory {
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle.Builder("car",4).build();
		System.out.println("car: "+ car);
		
		Vehicle raceCar = new Vehicle.Builder("raceCar",4).color("blue").horsePower(100).build();
		System.out.println(raceCar);

	}

}
