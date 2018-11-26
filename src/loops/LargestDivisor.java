package loops;

import java.util.Scanner;

public class LargestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your positive integer?");
		int num = input.nextInt();
		int largest = 1;
		for (int j = num - 1; largest == 1 && j > 0; j--) {
			if (num % j == 0) {
				largest = j;
			}
		}
		System.out.println("The largest divisior for this integer is " + largest);
		input.close();
	}

}
