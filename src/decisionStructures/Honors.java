package decisionStructures;

import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final double epsilon = 1e-14;
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("What grade level are you in?");
		int grade = input.nextInt();

		if (grade == 12 && gpa > 3.5 && gpa - 3.5 <= epsilon) {
			System.out.println("You can graduate with honors");
		} else {
			System.out.println("Better luck next time");
		}
		input.close();
	}
}
