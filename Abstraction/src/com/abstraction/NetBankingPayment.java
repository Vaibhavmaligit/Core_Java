package com.abstraction;

public class NetBankingPayment extends Payment {

	@Override
	public void processPayment() {
		System.out.println("Payment Completed with Net Banking");
		
	}
	
	public static void main(String[] args) {
		Payment p = new NetBankingPayment();
		p.validateUser();
		p.processPayment();
		p.generateBill();
		System.out.println("===============================");
		
		Payment p1 = new CreditCardPayment();
		p1.validateUser();
		p1.processPayment();
		p1.generateBill();
		System.out.println("===============================");
		
		Payment p2 = new WalletPayment();
		p2.validateUser();
		p2.processPayment();
		p2.generateBill();
		System.out.println("===============================");
		
		Payment p3 = new UPIpayment();
		p3.validateUser();
		p3.processPayment();
		p3.generateBill();
	}

}
