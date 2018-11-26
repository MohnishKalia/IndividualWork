package loops;

import java.util.Scanner;
public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your positive integer?");
		int num = input.nextInt();
		int count = 0;
		for (int j = num; j <= num && j > 0; j--) {
			if (num % j == 0) {
				count++;
			}
		}
		System.out.println("There are " + count + " divisors for this integer");
		input.close();
	}

}
