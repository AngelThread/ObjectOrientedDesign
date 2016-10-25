package com.ugur.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagmentSystem implements ISubject {

	List<IObserver> observerList = null;
	private Employee instaEmployee = null;
	private String message = null;

	public EmployeeManagmentSystem() {
		observerList = new ArrayList<IObserver>();
	}

	public void removeObserver(IObserver observer) {
		observerList.remove(observer);
	}

	public void registerObserver(IObserver observer) {
		observerList.add(observer);
	}

	public void addNewEmployee(Employee employee) {
		instaEmployee = employee;
		message = "  about amployee: ";
		noifyObserver();
	}

	public void noifyObserver() {
		if(instaEmployee != null && message != null){
		for (IObserver iObserver : observerList) {
			iObserver.notifyMe(instaEmployee, message);
			}
		}else{
			System.out.println("Message or Employee is null");
		}
	}

}
