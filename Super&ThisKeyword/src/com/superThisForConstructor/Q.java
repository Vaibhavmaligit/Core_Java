package com.superThisForConstructor;

public class Q extends P {
Q(String s1 ) {
	super(88.00, 9746);
	System.out.println(5555);
}
Q() {
	this("pqr");
	System.out.println(1111);
}
Q(char c3,boolean b3) {
	this(223895,"abc");
	System.out.println(9999);
}
Q(int i6,double d7) {
	this('A',false);
	System.out.println(6666);
}
Q(long b4, String s8) {
	this();
	System.out.println(8888);
}
public static void main(String[] args) {
	System.out.println("CONSTRUCTOR CHAINING");
	System.out.println("");
	Q q = new Q(4566,55.99);
	System.out.println("");
	Q q1 = new Q();
	System.out.println("");
	Q q3 = new Q("xyz");
	
	
}
}
 