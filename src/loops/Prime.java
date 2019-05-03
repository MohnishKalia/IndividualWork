package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the positive integer you want to test?");
		int num = input.nextInt();
		int count;
		boolean prime = true;
		for (count = 2; count < num && prime == true; count++) {
			if (num % count == 0) {
				prime = false;
			} else {
				prime = true;
			}
		}
		System.out.println("This number is prime: " + prime);
		input.close();
	}

}
