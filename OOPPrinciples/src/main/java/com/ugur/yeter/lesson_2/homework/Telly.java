package com.ugur.yeter.lesson_2.homework;

public class Telly implements Controllable{

	@Override
	public void turnOn() {
		System.out.println("I am the telly of this very house and I shall turn on soon...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("I am the telly of this very house and I shall turn off soon...");
	}

}
