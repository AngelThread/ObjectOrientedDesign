package com.ugur.design.patterns.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {

	private List<WaitingCustomer> customerList;
	private List<String> completedDrinks;

	public CoffeeAttendent() {

		customerList = new ArrayList<WaitingCustomer>();
		completedDrinks = new ArrayList<String>();

	}

	public void takeOrder(WaitingCustomer waitingCustomer) {
		customerList.add(waitingCustomer);
	}

	public void prepareDrinks() {

		try {
			for (WaitingCustomer customer : customerList) {
				System.out.println(customer.makeOrder() +" is preparing!");
				Thread.sleep((long) (Math.random() * 10) * 1000);
				completedDrinks.add(customer.makeOrder());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void callOutCompleteOrder() {
		
		for (String order : completedDrinks) {
			System.out.println(order + " is ready!");
			for (WaitingCustomer customer : customerList) {
				customer.orderReady(order);
			}
		}

	}
}
