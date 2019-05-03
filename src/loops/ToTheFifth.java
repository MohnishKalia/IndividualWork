package loops;

import java.util.Scanner;
public class ToTheFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your number? (9999 to terminate)");
		double num = input.nextDouble();
		do {
			System.out.println("The fifth power is: " + Math.pow(num, 5));
			System.out.println("What is your number? (9999 to terminate)");
			num = input.nextDouble();
		} while (!(Math.abs(num - 9999) < 1e-14));
		input.close();
	}

}
