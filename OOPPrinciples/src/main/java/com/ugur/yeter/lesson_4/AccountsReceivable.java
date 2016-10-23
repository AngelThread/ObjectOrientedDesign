package com.ugur.yeter.lesson_4;

public class AccountsReceivable {
	
	private Accounting customerTransaction;
	
	public AccountsReceivable(Accounting customerTransaction) {

	this.customerTransaction = customerTransaction;
	
	}
	
	public void postPayment(){
		customerTransaction.chargeCustomer();
	}
	
	public void sendInvoice(){
		
		customerTransaction.prepareInvoice();
	}

}
