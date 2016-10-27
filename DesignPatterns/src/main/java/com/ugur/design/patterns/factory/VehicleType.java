package com.ugur.design.patterns.factory;

public enum VehicleType {
	CAR {
		@Override
		public Vehicle getRelatedVehicle() {
			return new Car();
		}
	},TRUCK {
		@Override
		public Vehicle getRelatedVehicle() {
			return new Truck();
		}
	}, ELECTRIC_CAR {
		@Override
		public Vehicle getRelatedVehicle() {
			return new ElectricCar();
		}
	};
	
	VehicleType()  {
	}
	
	public abstract Vehicle getRelatedVehicle();

	
}
