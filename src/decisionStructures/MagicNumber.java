package decisionStructures;

import java.util.Scanner;
public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int magicNumber = 666;
		System.out.println("What do you think the magic number is?");
		final int guess = input.nextInt();
		if (guess == magicNumber) {
			System.out.println("You just won the powerball!!!");
		}
		System.out.println("Good luck next time.");
		input.close();
	}

}
