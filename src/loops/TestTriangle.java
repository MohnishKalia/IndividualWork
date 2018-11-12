package loops;

import java.util.Scanner;

import objectProgramming.RightTriangle;
public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		RightTriangle bob = new RightTriangle();
		RightTriangle todd = new RightTriangle();
		boolean quit = false;
		do {
			int max = 0;
			System.out.println("What is the base of the triangle?");
			bob.setBase(input.nextDouble());
			System.out.println("What is the height of the triangle?");
			bob.setHeight(input.nextDouble());
			if (bob.area() > max) {
				max = 1;
			}
			System.out.println("What is the base of the triangle?");
			todd.setBase(input.nextDouble());
			System.out.println("What is the height of the triangle?");
			todd.setHeight(input.nextDouble());
			if (todd.area() > max) {
				max = 2;
			}
			switch (max) {

			case 1:
				System.out.println("The triangle with base " + bob.getBase() + " and height " + bob.getHeight()
						+ " had the greatest area of " + bob.area());
				break;
			case 2:
				System.out.println("The triangle with base " + todd.getBase() + " and height " + todd.getHeight()
						+ " had the greatest area of " + todd.area());
				break;
			}
			System.out.println("Would you like to keep going? true/false");
			quit = input.nextBoolean();
		} while (quit);
		input.close();
	}

}
