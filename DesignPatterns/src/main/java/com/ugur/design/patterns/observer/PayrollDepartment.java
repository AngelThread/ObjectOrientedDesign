package com.ugur.design.patterns.observer;

public class PayrollDepartment implements IObserver {

	public void notifyMe(Employee employee) {
		System.out.println("PayrollDepartment is notified about amployee: "+ employee.getName());
	}

}
