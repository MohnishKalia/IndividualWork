package loops;

import java.util.Scanner;
public class Integer1To5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		for (int count = 0; count < 5; count++) {
			System.out.println("What is your favorite number?");
			num = input.nextInt();
			if (num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		input.close();
	}

}
