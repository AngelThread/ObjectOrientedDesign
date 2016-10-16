package com.ugur.yeter.lesson_2.homework;

public class RemoteController {
	private  Controllable device;
	
	private static final RemoteController INSTANCE = new RemoteController();

	private RemoteController(){
	}
	
	public static RemoteController getInstance(){
		return INSTANCE;
	}
	
	public  void selectDevice(Controllable device){
		this.device = device;
	}
	
	public void turnOnn(){

		device.turnOn();
	}
	
	public void turnOff(){

		device.turnOff();
	}
	

}
