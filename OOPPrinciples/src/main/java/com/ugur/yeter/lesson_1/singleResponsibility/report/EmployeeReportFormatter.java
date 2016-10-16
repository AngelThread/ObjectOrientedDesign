package com.ugur.yeter.object.principles.singleResp.report;

import com.ugur.yeter.object.principles.singleResp.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{
	

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	
	public String getFormattedValue() {
		return super.getFormattedValue();
	}

}
