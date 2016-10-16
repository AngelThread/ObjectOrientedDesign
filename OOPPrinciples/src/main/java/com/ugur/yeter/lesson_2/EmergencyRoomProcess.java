package com.ugur.yeter.lesson_2;

public class EmergencyRoomProcess {
	public static void main(String[] args) {
		HospitalManagment managment = new HospitalManagment();
		Employee doc = new Doctor(1,"Jack","ERP",true);
		managment.callUpon(doc);
		Nurse nurse = new Nurse(2,"Sam","ERP",true);
		managment.callUpon(nurse);

	}

}
