package Lab1;

import java.util.Scanner;

public class Citat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv ett citat: ");

		String citat = sc.nextLine();
		System.out.println("Citatet: " + citat);
		sc.close();

	}

}
