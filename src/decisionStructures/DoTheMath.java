package decisionStructures;

import java.util.Scanner;
public class DoTheMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number?");
		double num1 = input.nextDouble();
		System.out.println("What is your second number?");
		double num2 = input.nextDouble();
		System.out.println("Choose one of the following options:");
		System.out.println("1. Sum");
		System.out.println("2. Difference");
		System.out.println("3. Product");
		System.out.println("4. Quotient");
		System.out.println("5. Squaring (first number only)");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4:
			System.out.println(num1 / num2);
			break;
		case 5:
			System.out.println(Math.pow(num1, 2));
			break;
		default:
			System.out.println("Invalid response, please try a different input! (1,2,3,4,5,)");
			break;
		}
		input.close();
	}

}
