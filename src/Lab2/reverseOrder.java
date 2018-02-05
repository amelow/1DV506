package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseOrder {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Write positive integers, finish with a negative one: ");
		int integer = 0;
		int number = 1;

		do {
			System.out.println("Number " + number + ": ");
			integer = sc.nextInt();
			System.out.println("");
			if (integer >= 0) {
				number++;
				list.add(integer);
			}
		} while (integer >= 0);// positive
		System.out.println("Positive numbers: " + list.size());

		number = list.size() - 1; // reverse
		System.out.println("Integers in reverse: ");
		while (number >= 0) {
			System.out.print(list.get(number));
			number--;
			System.out.print(", ");

			sc.close();
		}

	}
}