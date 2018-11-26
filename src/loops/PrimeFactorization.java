package loops;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the positive integer you want to test?");
		int num = input.nextInt();
		System.out.println("Prime Factorization: ");
		if (num == 1) {
			System.out.print(1 + " ");
		}
		while (num > 1) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
					num = num / i;
					i = 1;
				}
			}
		}
		System.out.println("");
		System.out.println("Factorization End.");
		input.close();
	}
}