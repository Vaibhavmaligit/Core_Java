package solvingExamples;

import java.util.Scanner;

public class BasicLogicPrograms {

	Scanner sc = new Scanner(System.in);
	
	public void evenNo() {
		
		for(int i = 1; i<=50;i++) {
         if(i%2==0)
        	 System.out.println(i);
	}
}
	
	
	public void oddNo() {
		System.out.println("ENTER NO.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("its sum : "+sum);
	}
	
	
	public void TableOf5 () {
		System.out.println("ENTER NO.");
		int num = sc.nextInt();
		for (int i = 1; i<=10;i++) {
				System.out.println(num+" "+"* "+i+" = "+(num*i));
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		BasicLogicPrograms b = new BasicLogicPrograms();
        //b.evenNo();
		b.oddNo();
		//b.TableOf5();
	}
}
