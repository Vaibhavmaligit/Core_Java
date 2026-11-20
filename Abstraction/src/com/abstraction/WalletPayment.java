package com.abstraction;

public class WalletPayment extends Payment {

	@Override
	public void processPayment() {
		System.out.println("Payment Completed with Wallet");
		
	}

}
