package Lab1;

import java.util.Scanner;

/*Number of seconds:
Write a program called Sekunder.java which reads three integers (hours, minutes, seconds)
and then calculates the corresponding time in seconds.
*/
public class Sekunder {

	public static void main(String[] args) {
		final int SECONDS_PER_HOUR = 3600;
		final int SECONDS_PER_MINUTE = 60;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Hours? ");
		int hours = sc.nextInt();
		
		System.out.println("How many Minuits? ");
		int minuits = sc.nextInt();
	
		System.out.println("How many Seconds? ");
		int seconds = sc.nextInt();
		sc.close();
		
		int total = (hours*SECONDS_PER_HOUR)+(minuits*SECONDS_PER_MINUTE)+seconds;
		System.out.println("Here are your total in seconds: "+ total);
	}	

}
