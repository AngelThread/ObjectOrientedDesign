package com.ugur.yeter.lesson_4;

public class ReportGenerator {
	
	private Reporting transactionObject;
	
	public void generateReport(){
		System.out.println(transactionObject.getName()+ "" + transactionObject.getProductBreakDown()+ " "+ transactionObject.getDate());
	}

}
