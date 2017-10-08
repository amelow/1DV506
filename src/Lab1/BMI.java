package Lab1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		/*
		 * Write a BMI.java program that calculates the body mass index (BMI)
		 * for a person. The program should load data (length and weight) from
		 * the keyboard and then present the response. BMI is calculated as
		 * weight / (length) ^ 2 where the length is given in meters and the
		 * weight is given in kilograms.
		 */
		System.out.println("Hey, do you want to find out your BMI? ");
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);

		System.out.println("Then please enter weight in kg: ");
		double weight = sc.nextDouble();
		System.out.println("Also please enter hight in meters: ");
		double length = sc.nextDouble();
		double BMI = (weight/(length*length));
		System.out.println("Here you go: "  + BMI);
		sc.close();

	}

}
