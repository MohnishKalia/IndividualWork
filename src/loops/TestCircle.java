package loops;

import java.util.Scanner;

import objectProgramming.Circle;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Circle bob = new Circle();
		Circle todd = new Circle();
		Circle jen = new Circle();
		boolean quit = false;
		do {
			int max = 0;
			System.out.println("What is your first radius?");
			bob.setRadius(input.nextDouble());
			if (bob.circumference() > max) {
				max = 1;
			}
			System.out.println("What is your second radius?");
			todd.setRadius(input.nextDouble());
			if (todd.circumference() > max) {
				max = 2;
			}
			System.out.println("What is your third radius?");
			jen.setRadius(input.nextDouble());
			if (jen.circumference() > max) {
				max = 3;
			}
			switch (max) {

			case 1:
				System.out.println(
						"The circle with radius " + bob.returnRadius() + " had the greatest area of " + bob.area());
				break;
			case 2:
				System.out.println(
						"The circle with radius " + todd.returnRadius() + " had the greatest area of " + todd.area());
				break;
			case 3:
				System.out.println(
						"The circle with radius " + jen.returnRadius() + " had the greatest area of " + jen.area());
				break;
			}
			System.out.println("Would you like to keep going? true/false");
			quit = input.nextBoolean();
		} while (quit);
		input.close();
	}

}
