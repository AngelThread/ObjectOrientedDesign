package com.ugur.design.patterns.builder;

public class UserApp {
	
	public static void main(String[] args) {
		User firstUser = new User.Builder("ugur","123456").buid();
		
		System.out.println(firstUser);
		
		User secondUser = new User.Builder("bora","XXccXX").eMail("email@gmail.com").firstName("Ali").buid();
		
		System.out.println(secondUser);
				
				

	}

}
