package com.ugur.yeter.lesson_1.singleResponsibility.report;

import com.ugur.yeter.lesson_1.singleResponsibility.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{
	

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	
	public String getFormattedValue() {
		return super.getFormattedValue();
	}

}
