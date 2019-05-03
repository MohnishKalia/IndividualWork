package decisionStructures;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double testAvg = input.nextDouble();
		System.out.println("What is your homework average?");
		double homeAvg = input.nextDouble();
		System.out.println("Is your teacher nice? true/false");
		boolean nice = input.nextBoolean();
		if (nice == true) {
			if (testAvg > homeAvg) {
				System.out.println("Your grade is " + testAvg);
			} else {
				System.out.println("Your grade is " + homeAvg);
			}
		} else {
			if (testAvg > homeAvg) {
				System.out.println("Your grade is " + homeAvg);
			} else {
				System.out.println("Your grade is " + testAvg);
			}
		}
		input.close();
	}
}
