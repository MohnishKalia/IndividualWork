package loops;

import java.util.Scanner;
public class ChosenSumsOfMultiplesOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		System.out.println("What is your upper bound?");
		int uBound = input.nextInt();
		if (uBound < 0) {
			uBound = 115;
			System.out.println("Invalid Answer: Default upper bound = 115");
		}
		while (count <= uBound) {
			sum += count;
			count += 2;
		}
		System.out.println("Sum from 0 to " + uBound + " = " + sum);
		input.close();
	}

}
