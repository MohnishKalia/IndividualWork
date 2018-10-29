package decisionStructures;

import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("What is your height in inches?");
			double lucky = 5 * input.nextDouble();
			System.out.println("Your lucky number is" + lucky);
		} else {
			System.out.println("What is your weight in pounds?");
			double lucky = input.nextDouble() / 2.0;
			System.out.println("Your lucky number is" + lucky);
		}
		input.close();
	}

}
