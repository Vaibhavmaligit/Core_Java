package com.tryCatchBlock;

public class Solution3 {
public static void main(String[] args) {
	System.out.println("THIS STATEMENT WILL BE EXECUTED");
	try {
		System.out.println("==TRY BLOCK==");
		int i = 20/0;
		System.out.println("VALUE OF I : "+i);
	} catch (Exception e) {
		System.out.println("==CATCH BLOCK==");
		e.printStackTrace();
	}
	System.out.println("NOW THIS STATEMENT WILL ALSO BE EXECUTED");
}
}
