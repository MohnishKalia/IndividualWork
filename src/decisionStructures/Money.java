package decisionStructures;

import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("What is your current GPA?");
		double GPA = input.nextDouble();
		if (age + GPA > 20) {
			System.out.println("You earned $250");
		} else {
			System.out.println("You earned $30");
		}
		input.close();
	}

}
