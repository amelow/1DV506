package Lab1;

import java.util.Scanner;
/*
 * Type a program Time.java which reads a number of seconds (an integer) and then prints the same time in terms of hours, minutes and seconds.
 */

public class Tid {

	public static void main(String[] args) {
		final int SECONDS_PER_HOUR = 3600;
		final int SECONDS_PER_MINUTE = 60;
		System.out.println("This is a time converter ");
		System.out.println("===============");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Seconds: ");
		int allSeconds = sc.nextInt();

		int hours = allSeconds / (SECONDS_PER_HOUR);
		int rest = allSeconds - (SECONDS_PER_HOUR * hours);
		int minuits = (rest / SECONDS_PER_MINUTE);
		int seconds = (rest % SECONDS_PER_MINUTE);
		
		System.out.println("Here you go:");
		System.out.println("Hours: "+ hours);
		System.out.println("Minuits: "+ minuits);
		System.out.println("Seconds: "+ seconds);
		System.out.println("===============");
	}

}
