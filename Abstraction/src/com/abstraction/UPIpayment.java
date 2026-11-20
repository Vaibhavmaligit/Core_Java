package com.abstraction;

public class UPIpayment extends Payment {

	@Override
	public void processPayment() {
		System.out.println("Payment Completed with UPI");
	}

}
