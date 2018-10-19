package objectProgramming;

import java.util.Scanner;
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle();
		Circle bobby = new Circle();
		RightTriangle fred = new RightTriangle();
		IsoTrapezoid freddy = new IsoTrapezoid();
		Scanner input = new Scanner(System.in);

		System.out.println("What is the 1) length, and 2) width of your rectangle?");
		bob.setLength(input.nextDouble());
		bob.setWidth(input.nextDouble());
		System.out.println("Area: " + bob.area() + " Perimeter: " + bob.perimeter());

		System.out.println("What is the radius of your circle?");
		bobby.setRadius(input.nextDouble());
		System.out.println("Area: " + bobby.area() + " Circumference: " + bobby.circumference());

		System.out.println("What is the 1) base and 2) height of the right triangle?");
		fred.setBase(input.nextDouble());
		fred.setHeight(input.nextDouble());
		System.out.println("Area: " + fred.area() + " Perimeter: " + fred.perimeter());

		System.out.println("What is the 1) base 2) other base 3) height and 4) leg of an isoceles trapezoid?");
		freddy.setBase1(input.nextDouble());
		freddy.setBase2(input.nextDouble());
		freddy.setHeight(input.nextDouble());
		freddy.setLeg(input.nextDouble());
		System.out.println("Area: " + freddy.area() + " Perimeter: " + freddy.perimeter());

		input.close();
	}

}
