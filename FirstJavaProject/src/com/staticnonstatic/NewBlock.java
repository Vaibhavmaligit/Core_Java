package com.staticnonstatic;

public class NewBlock {
static {

System.out.println("Print Static Block");
} 
	NewBlock() {
		System.out.println("Print Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Print Main Method");
		NewBlock n = new NewBlock();
		
	}
	
	{
		System.out.println("Print Non Static Block");
		
	}
	
}
