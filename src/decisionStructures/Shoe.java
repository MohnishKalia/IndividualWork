package decisionStructures;

import java.util.Scanner;
public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height in feet?");
		double height = input.nextDouble();
		System.out.println("What is your shoesize (US)");
		double size = input.nextDouble();
		double sum = height + size;
		System.out.println("Is the sum of your height and shoesize greater than or equal to 26?");
		System.out.println(sum >= 26);
		input.close();
	}

}
