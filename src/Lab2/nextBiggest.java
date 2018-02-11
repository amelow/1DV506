package Lab2;

import java.util.Scanner;

public class nextBiggest {
	/*
	 * Write 10 integers, printout the next biggest one
	 */

	public static void main(String[] args) {
		System.out.println("Enter 10 integers:");
		int biggest, nextBiggest, numbers;
		biggest = Integer.MIN_VALUE;
		nextBiggest = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		numbers = sc.nextInt();
		
		
		for (int i = 1; i <= numbers; i++) {
			int number = sc.nextInt();
			if (number > biggest) {
				nextBiggest = biggest;
				biggest = number;
				
			} else if (nextBiggest > number) {
				nextBiggest = number;

			}
		}
		System.out.println("Second biggest integer is: " + nextBiggest);
		sc.close();
	}

}
