package com.abstraction;

public abstract class  Payment {

	public void validateUser() {
		System.out.println("Validate User Method");
	}
	
	abstract public void processPayment();
	
	public void generateBill() {
		System.out.println("Bill Generated & Sent Successfully ");
	}
}

