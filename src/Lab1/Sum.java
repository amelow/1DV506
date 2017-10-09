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

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int total = sc.nextInt();
		int first = (total/100);
		int second= (total/(10%10));
		int third = (total%10);
		
		
	}

}
