package com.array;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		String[] arrayOfString = new String[7];
		
		arrayOfString[0] = "Vaibhav";
		arrayOfString[1] = "Nashik";
		arrayOfString[2] = "vaibhav@";
		arrayOfString[3] = "Male";
		arrayOfString[4] = "BE";
		
		
		System.out.println(arrayOfString.length);
		System.out.println("==========================");
		System.out.println(arrayOfString[0]);
		System.out.println(arrayOfString[1]);
		System.out.println(arrayOfString[2]);
		System.out.println(arrayOfString[3]);
		System.out.println(arrayOfString[4]);
		
		System.out.println("==========================");
		String name = arrayOfString[0];
		String address = arrayOfString[1];
		String email = arrayOfString[2];
		String gender = arrayOfString[3];
		String qualification = arrayOfString[4];
		
		System.out.println(name+" "+address+" "+email+" "+gender+" "+qualification);
	}
}
