package com.ugur.yeter.lesson_1.singleResponsibility.clients;

import com.ugur.yeter.lesson_1.singleResponsibility.database.EmployeeDAO;
import com.ugur.yeter.lesson_1.singleResponsibility.domain.Employee;
import com.ugur.yeter.lesson_1.singleResponsibility.report.EmployeeReportFormatter;
import com.ugur.yeter.lesson_1.singleResponsibility.report.FormatType;

public class ClientModule {

	public static void hireNewEmployee(Employee employee) {

		EmployeeDAO empDao = new EmployeeDAO();
		empDao.saveEmployee(employee);
	}

	public static void deleteEmployee(Employee employee) {

		EmployeeDAO empDao = new EmployeeDAO();
		empDao.deleteEmployee(employee);
	}

	public static void printEmployee(Employee employee, FormatType formatType) {
		EmployeeReportFormatter empFormatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(empFormatter.getFormattedValue());
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "Ugur", "IT", true);
		hireNewEmployee(employee);
		printEmployee(employee, FormatType.XML);
	}
}
