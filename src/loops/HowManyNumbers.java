package loops;

import java.util.Scanner;
public class HowManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int year = 2018;
		int count = 0;
		double num = 0;
		double sum = 0;
		do {
			System.out.println("What is your number?");
			num = input.nextDouble();
			sum += num;
			count++;
		} while (!(sum > year));
		System.out.println("You took " + count + " numbers to get past " + year);
		input.close();
	}

}
