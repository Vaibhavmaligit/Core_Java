package com.abstraction;

public class CreditCardPayment extends Payment {

	@Override
	public void processPayment() {
		System.out.println("Payment Completed with Credit Cards");
		
	}

}
