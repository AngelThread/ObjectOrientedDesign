package com.ugur.design.patterns.observer.homework;

public class CoffeeShop {
	
	public static void main(String[] args) {
		Customer customerUgur = new Customer("Ugur", "latte");
		Customer customerZeynep = new Customer("Zeynep", "Mocha");
		
		CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
		coffeeAttendent.takeOrder(customerUgur);
		coffeeAttendent.takeOrder(customerZeynep);

		coffeeAttendent.prepareDrinks();
		
		coffeeAttendent.callOutCompleteOrder();
	}

}
