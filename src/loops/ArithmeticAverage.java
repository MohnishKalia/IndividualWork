package loops;

import java.util.Scanner;
public class ArithmeticAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double sum = 0;
		int count = 0;
		System.out.println("Input your value (0 for termination)");
		num = input.nextDouble();
		while (num != 0) {
			sum += num;
			count++;
			System.out.println("Input your value (0 for termination)");
			num = input.nextDouble();
		}
		double avg = sum / count;
		System.out.println("Your average is " + avg);
		input.close();
	}

}
