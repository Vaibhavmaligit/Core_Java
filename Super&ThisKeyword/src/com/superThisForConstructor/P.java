package com.superThisForConstructor;

public class P {
P() {
	this('M',true);
	System.out.println(4141);
}

P(int i, String s) {
	this();
	System.out.println(5252);
}
P(char c, boolean flag) {
	System.out.println(3131);
}
P(double d, int k) {
	this(1133, 'o', true);
 System.out.println(7171);
}
P(int i9, char c1, boolean f4) {
	this(55678,"lmn");
	System.out.println(8181);
}
}
