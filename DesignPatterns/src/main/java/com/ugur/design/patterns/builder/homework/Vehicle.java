package com.ugur.design.patterns.builder.homework;

public class Vehicle {

	private String type; // Required.
	private int doorCount; // Required

	private String color; // optional
	private int horsePower; // optional

	private Vehicle(Builder builder) {
		this.type = builder.type;
		this.doorCount = builder.doorCount;
		this.color = builder.color;
		this.horsePower = builder.horsePower;
	}
	
	@Override
	public String toString() {
		return "type= "+type+", doorCount= "+ doorCount+ ", color= "+ color +", horsePower= "+  horsePower;
	}

	public static class Builder {
		private String type; // Required.
		private int doorCount; // Required

		private String color; // optional
		private int horsePower; // optional

		public Builder(String type, int doorCount) {
			this.type = type;
			this.doorCount = doorCount;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder horsePower(int horsePower) {
			this.horsePower = horsePower;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}

}
