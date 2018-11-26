package loops;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the positive integer?");
		int num = input.nextInt();
		int factorial = 1;
		for (num = num; num > 0; num--) {
			factorial *= num;
		}
		System.out.println("The factorial is: " + factorial);
		input.close();
	}

}
