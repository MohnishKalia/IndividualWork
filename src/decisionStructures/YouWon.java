package decisionStructures;

import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double epsilon = 1e-14;
		System.out.println("What was the amount of money you recieved on your fifth birthday?");
		double money = input.nextDouble();
		if ((Math.abs(money - Math.sqrt(84.3)) <= epsilon)) {
			System.out.println("You have won a good prize!");
		} else {
			System.out.println("You got a bad prize. Better luck next life.");
		}
		input.close();
	}

}
