package objectProgramming;

import java.util.Scanner;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle bob = new Circle();
		Scanner input = new Scanner(System.in);

		System.out.println("Filler, set radius");
		double radius = input.nextDouble();

		bob.setRadius(radius);
		System.out.println(bob.returnRadius());
		System.out.println(bob.circumference());
		System.out.println(bob.area());

		System.out.println("Filler, set radius multiple");
		double rate = input.nextDouble();
		input.close();
	}

}
