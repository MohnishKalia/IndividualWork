package loops;

import java.util.Scanner;
public class SumTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		do {
			System.out.println("What is your first number? (999 for termination)");
			num1 = input.nextDouble();
			if (!(Math.abs(num1 - 999) <= 1e-14)) {
				System.out.println("What is your second number? (999 for termination)");
				num2 = input.nextDouble();
				System.out.println("Sum: " + (num1 + num2));
			}
		} while (!(Math.abs(num1 - 999) <= 1e-14));
		input.close();
	}

}
