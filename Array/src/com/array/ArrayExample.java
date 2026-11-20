package com.array;

public class ArrayExample {
public static void main(String[] args) {
	
	int[] arrayOfInt = new int[7];
	
	arrayOfInt[0] = 22;
	arrayOfInt[1] = 44;
	arrayOfInt[2] = 55;
	arrayOfInt[3] = 66;
	arrayOfInt[4] = 77;
	arrayOfInt[5] = 88;
	arrayOfInt[6] = 99;
	
	System.out.println(arrayOfInt.length);
	System.out.println("==========================");
	System.out.println(arrayOfInt[0]);
	System.out.println(arrayOfInt[1]);
	System.out.println(arrayOfInt[2]);
	System.out.println(arrayOfInt[3]);
	System.out.println(arrayOfInt[4]);
	System.out.println(arrayOfInt[5]);
	System.out.println(arrayOfInt[6]);
	System.out.println("==========================");
	int i = arrayOfInt[0];
	int j = arrayOfInt[1];
	int k = arrayOfInt[2];
	int l = arrayOfInt[3];
	int m = arrayOfInt[4];
	int n = arrayOfInt[5];
	int o = arrayOfInt[6];
	System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o);
}
}
