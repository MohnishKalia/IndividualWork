package loops;

import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("What is your positive integer?");
		int uBound = input.nextInt();
		if (uBound % 2 == 0) { // even
			for (int j = uBound - 1; j > 0; j -= 2) {
				sum += j;
			}
		} else { // odd
			for (int j = uBound - 2; j > 0; j -= 2) {
				sum += j;
			}
		}
		System.out.println(sum);
		input.close();
	}

}
