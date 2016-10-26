package com.ugur.yeter.spring.dependency.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ugur.yeter.spring.dependency.vehicles.Vehicle;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle myVehicle = (Vehicle)context.getBean("mrBeansCar");
		myVehicle.crackIgnition();
	}
}
