package com.ugur.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagmentSystem {

	List<IObserver> observerList;

	public EmployeeManagmentSystem() {
		observerList = new ArrayList<IObserver>();

	}

	public void addObserver(IObserver observer) {
		observerList.add(observer);
	}

	public void addNewEmployee(Employee employee) {
		notifyAllDepertmants(employee);
	}

	public void notifyAllDepertmants(Employee employee) {
		for (IObserver iObserver : observerList) {
			iObserver.notifyMe(employee);
			
		}
	}

}
