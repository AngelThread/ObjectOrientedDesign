package com.ugur.yeter.lesson_2.homework;

public class HumanUser {

	public static void main(String[] args) {

		RemoteController remoteController = RemoteController.getInstance();
		Telly telly = new Telly();
		remoteController.selectDevice(telly);
		remoteController.turnOnn();
		remoteController.turnOff();
		
		Projector projector = new Projector();
		
		remoteController.selectDevice(projector);
		remoteController.turnOnn();
		remoteController.turnOff();
		
	}

}
