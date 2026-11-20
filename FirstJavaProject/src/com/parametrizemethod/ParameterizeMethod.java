package com.parametrizemethod;
public class ParameterizeMethod {
	public void m1(byte b) {
		System.out.println(b);
	}
	public void m2(byte b,short s) {
		System.out.println(b+" "+s);
	}
	public void m3(byte b,short s,int i) {
		System.out.println(b+" "+s+" "+i);
	}
	public void m4(byte b,short s,int i,long l) {
		System.out.println(b+" "+s+" "+i+" "+l);
	}
	public void m5(byte b,short s,int i,long l,float f) {
		System.out.println(b+" "+s+" "+i+" "+l+" "+f);
	}
	public void m6(byte b,short s,int i,long l,float f,double d) {
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d);
	}
	public void m7(byte b,short s,int i,long l,float f,double d,boolean z) {
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+z);
	}
	public void m8(byte b,short s,int i,long l,float f,double d,boolean z,char c) {
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+z+" "+c);
	}
	public static void main(String[] args) {
		ParameterizeMethod pm = new ParameterizeMethod();
		byte b=22;
		pm.m1(b);
		short s = 123;
		pm.m2(b,s);
		pm.m3(b,s,1278);
		pm.m4(b,s,1278,15673l);
		pm.m5(b, s, 1278, 156731l, 10.56f);
		pm.m6(b, s, 1278, 156731l, 10.56f,234.89346);
		pm.m7(b, s,1278, 156731l, 10.56f,234.89346,true);
		pm.m8(b, s,1278, 156731l, 10.56f,234.89346,true,'A');
	}
}
