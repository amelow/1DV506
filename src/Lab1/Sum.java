package Lab1;

import java.util.Scanner;

public class Sum {
	/*
	 * 
	 * Write a program where the user is asked to enter a three-digit number.
	 * The program should then generate the sum of the numbers the integer
	 * consists of and print the sum.
	 */

	public static void main(String[] args) {
		System.out.println("Integer Calculator");
		System.out.println("=============");
		Scanner sc = new Scanner(System.in);
		System.out.println("Write an Integer with three digits:");
		int total = sc.nextInt();
		int first = (total / 100);
		int second = (total / 10 % 10);
		int third = (total % 10);
		int results = (first + second + third);
		System.out.println("Your integer is: " + total + (" and the sum of the three integer is: ") + results);

	}
}
