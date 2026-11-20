package com.protected2;
import com.protected1.Practice;
public class Access extends Practice {
	
@Override
protected void m1() {
	System.out.println("M1 METHOD OF CLASS ACCESS");
}
	public static void main(String[] args) {
		//Practice p = new Practice();
		//p.m1();
		
		//Practice p1 = new Access();
		//p1.m1();
		
		Access a = new Access();
		a.m1();
		System.out.println(a.i);
		
	}
}
