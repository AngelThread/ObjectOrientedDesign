package com.ugur.design.patterns.observer;

public class App {
	
	public static void main(String[] args) {
		
		Employee employeeUgur = new Employee("Ugur",1);
		Employee employeeYunus = new Employee("Yunus",2);
		Employee employeeAhmet= new Employee("Ahmet",3);
		
		EmployeeManagmentSystem management = new EmployeeManagmentSystem();
		HRDepartment hrDep = new HRDepartment();
		PayrollDepartment payRollDep = new PayrollDepartment();
		management.addObserver(hrDep);
		management.addObserver(payRollDep);

		management.addNewEmployee(employeeUgur);
		management.addNewEmployee(employeeYunus);
		management.addNewEmployee(employeeAhmet);

		
	}

}
