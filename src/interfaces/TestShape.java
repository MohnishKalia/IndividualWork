package interfaces;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		double l = input.nextDouble();
		System.out.println("What is the height of the rectangle?");
		double w = input.nextDouble();
		Shape bob = new Rectangle(l, w);
		System.out.println("What is the radius of the circle?");
		Shape rob = new Circle(input.nextDouble());
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
		System.out.println(rob.area());
		System.out.println(rob.perimeter());
		input.close();
	}

}
