package com.ugur.design.patterns.observer;

public class PayrollDepartment implements IObserver {

	public void notifyMe(Employee employee, String message) {
		System.out.println("PayrollDepartment is "+message+ employee.getName());
	}

}
