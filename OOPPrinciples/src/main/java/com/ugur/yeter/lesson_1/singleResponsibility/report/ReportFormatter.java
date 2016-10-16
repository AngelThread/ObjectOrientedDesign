package com.ugur.yeter.object.principles.singleResp.report;

import com.ugur.yeter.object.principles.singleResp.domain.Employee;

public  class ReportFormatter {
	
	private String formattedValue ; 
	
/*  +          Public
	-          Private
	#          Protected
	~          Package (default visibility)
 	in UML*/
	
	public ReportFormatter(Employee employee, FormatType formatType) {

		switch(formatType){
		case XML:
			formattedValue = convertObjectToXml(employee);
			break;
		case CVS:
			formattedValue = convertObjectToCSV(employee);
			break;
		}
	}
	private  String convertObjectToXml(Object object){
		return " private convertObjectToXml method's return";
		
	}

	private  String convertObjectToCSV(Object object){
		return " private convertObjectToCSV method's return";
		
	}
	
	public String getFormattedValue() {
		return formattedValue;

	}
}
