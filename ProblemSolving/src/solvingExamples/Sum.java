package solvingExamples;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER:");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {

            int num = n % 10;
            sum = sum + num;
            n = n / 10;
        }

        System.out.println("SUM OF DIGIT : " + sum);

    }
}
