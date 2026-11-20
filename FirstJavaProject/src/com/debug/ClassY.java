package com.debug;

public class ClassY {
int i;
int j =20;
int k = 30;

public ClassY m2() {
ClassY y1 = new ClassY();
System.out.println(y1.i+"  "+y1.j+"  "+y1.k);
ClassY y2 = new ClassY();
y2.i = 100;
y2.j = 200;
System.out.println(y2.i+"  "+y2.j);
int i = 4000;
int k = 5050;
int j = 8090;
ClassY y3 = new ClassY();
y3.i = 300;
y3.j = k;
y3.k = i;
System.out.println(y3.i+" "+y3.j+"  "+y3.k);
return y2;
}
	public static void main(String[] args) {
		ClassY y = new ClassY();
		System.out.println(y.i+"  "+y.j+"  "+y.k);
		ClassY c5 = y.m2();
		System.out.println(c5.i+"  "+c5.j+"  "+c5.k);
	}
	
	
}
