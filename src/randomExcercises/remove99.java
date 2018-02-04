package randomExcercises;

import java.util.ArrayList;
import java.util.Scanner;

public class remove99 {
	/*
	 * Input integers, if number 99 remove and put in the front use at least one
	 * method as well
	 */

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Integers, one of them has to be the number 99! Stop with non-numeric input.");
		int number = 0;
		while (sc.hasNextInt()) {
			number = sc.nextInt();
			if (number >= 0) {
				list.add(number);

			}

		}
		System.out.println(list);
		System.out.println(listCheck(list));

	}

	private static ArrayList<Integer> listCheck(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 99) {
				list.remove(i);
				list.add(0, 99);
			}

		}
		return list;
	}

}
