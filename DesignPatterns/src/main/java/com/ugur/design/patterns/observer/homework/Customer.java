package com.ugur.design.patterns.observer.homework;

public class Customer implements WaitingCustomer{
	
	private String name;
	private String orderName;
	
	public Customer(String name, String orderName) {
		this. name =  name;
		this.orderName = orderName;
	}
	
	
	public String getName() {
		return name;
	}
	public String getOrderName() {
		return orderName;
	}


	public void orderReady(String preparedDrink) {
		if(preparedDrink.equalsIgnoreCase(orderName))
		System.out.println("I am "+name +" and I get what I ordered which is "+orderName);
		else{
			System.out.println("I am "+name + " and This is not what I want");

		}
	}


	public String makeOrder() {
		return orderName;
	}

	
	
}
