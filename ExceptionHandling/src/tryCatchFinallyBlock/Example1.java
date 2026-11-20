package tryCatchFinallyBlock;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("MAIN STARTS");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("--TRY BLOCK--");
			int i = 10/0;
			System.out.println(i);
			sc.close();
		} catch (Exception e) {
			System.out.println("--CATCH BLOCK--");
			e.printStackTrace();
			sc.close();
		}
		finally {
			System.out.println("--FINALLY BLOCK--");
			sc.close();
		}
	}
}
