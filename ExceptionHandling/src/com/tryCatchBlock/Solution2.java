package com.tryCatchBlock;

public class Solution2 {
public static void main(String[] args) {
	System.out.println("THIS STATEMENT WILL BE EXECUTED");
	try {
		System.out.println("==TRY BLOCK==");
		String str = args[1];
		System.out.println(str);
	} catch (Exception e) {
		System.out.println("==CATCH BLOCK==");
		e.printStackTrace();
	}
	System.out.println("NOW THIS STATEMENT WILL ALSO BE  EXECUTED");
}
}
