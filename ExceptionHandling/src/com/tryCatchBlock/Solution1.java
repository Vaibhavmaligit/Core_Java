package com.tryCatchBlock;

public class Solution1 {
public static void main(String[] args) {
	System.out.println("THIS STATEMENT WILL BE EXECUTED");
	try {
		System.out.println("==TRY BLOCK==");
		Integer i = new Integer("abc");
		System.out.println("VALUE OF I : "+i);
	} catch (Exception e) {
		System.out.println("==CATCH BLOCK==");
		e.printStackTrace();
	}
	System.out.println("NOW, THIS STATEMENT WILL ALSO BE EXECUTED");
}
}
