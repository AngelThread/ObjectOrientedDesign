package com.ugur.design.patterns.observer;

public class HRDepartment  implements IObserver {

	public void notifyMe(Employee employee, String message) {
		System.out.println("HRDepartment is notified "+message+ employee.getName());
	}

}
