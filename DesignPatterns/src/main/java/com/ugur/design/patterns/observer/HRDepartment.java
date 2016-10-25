package com.ugur.design.patterns.observer;

public class HRDepartment  implements IObserver {

	public void notifyMe(Employee employee) {
		System.out.println("HRDepartment is notified about amployee: "+ employee.getName());
	}

}
