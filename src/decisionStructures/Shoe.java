package decisionStructures;

import java.util.Scanner;
public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		System.out.println("What is your shoesize (US)");
		double size = input.nextDouble();
		double sum = height + size;
		System.out.println("Is the sum of your height and shoesize greater than or equal to 26?");
		System.out.println(sum >= 26);
		System.out.println(height < 62 && size > 9);
		input.close();
	}

}
