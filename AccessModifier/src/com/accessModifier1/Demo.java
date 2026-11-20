package com.accessModifier1;

public class Demo {
public int did = 100;
public String Name = "Rohan";

 public Demo() {
	System.out.println("Default Constuctor");
}
	public void m1() {
		System.out.println("Method m1");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		Demo d = new Demo();
		System.out.println(d.did+" "+d.Name );
		d.m1();
		
		
	}
}
