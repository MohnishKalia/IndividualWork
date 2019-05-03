package decisionStructures;

import java.util.Scanner;
public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double epsilon = 1e-14;
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("How many years of experience do you have?");
		double exp = input.nextDouble();
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		if (age >= 50 && Math.abs(exp - 10.5) <= epsilon && height < 70) {
			System.out.println("You have been promoted!");
		} else {
			if (age >= 50 && Math.abs(exp - 10.5) <= epsilon && height > 80) {
				System.out.println("You have been promoted!");
			} else {
				if (age < 50 && height <= 80 && height >= 70) {
					System.out.println("You have been promoted!");
				} else {
					System.out.println("Boohoo! Try next time bub.");
				}
			}
		}
		input.close();
	}
}
