package com.ugur.yeter.lesson_4;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
	
	private List<Product> productList;
	private Customer customer;
	
	public CustomerTransaction( List<Product> productList , Customer customer) {
	
		this.customer = customer;
		this.productList = productList;
	}
	
	@Override
	public String getName(){
		
		return customer.getName();
	}

	/* (non-Javadoc)
	 * @see com.ugur.yeter.lesson_4.Reporting#getDate()
	 */
	@Override
	public Date getDate(){
		
		return new Date();
	}
	
	
	/* (non-Javadoc)
	 * @see com.ugur.yeter.lesson_4.Reporting#getProductBreakDown()
	 */
	@Override
	public String getProductBreakDown(){
		String reportListing = null;
		
		for (Product product : productList) {
			reportListing +=product.getName(); 
		}
		return reportListing;
	}
	
	/* (non-Javadoc)
	 * @see com.ugur.yeter.lesson_4.Accounting#chargeCustomer()
	 */
	@Override
	public void chargeCustomer(){
		System.out.println("Customer is charged");
	}

	/* (non-Javadoc)
	 * @see com.ugur.yeter.lesson_4.Accounting#prepareInvoice()
	 */
	@Override
	public void prepareInvoice(){
		System.out.println("Invoice is prepared");
	}

}

