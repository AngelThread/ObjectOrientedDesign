package com.ugur.yeter.lesson_2.homework;

public class Projector implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("I am the prjector of this very house and I shall be open soon...");
	}

	@Override
	public void turnOff() {
		System.out.println("I am the prjector of this very house and I shall turn off soon...");
		
	}

}
