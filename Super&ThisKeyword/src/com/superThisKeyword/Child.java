package com.superThisKeyword;

public class Child extends Parent {

	long mobileNo = 8888999955l;
	
	@Override
	public void m1() {
		System.out.println("Overrided M1 Method");
	}
	
	public void m2() {
		System.out.println("M2 METHOD OF CHILD");
		super.m1();
		System.out.println(super.mobileNo);
	}
	
	public void m3(long mobileNo) {
		this.mobileNo = mobileNo;
		m2();
		System.out.println(mobileNo);
		
		
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.m2();
		c.m3(8855885588l);
	}
}
