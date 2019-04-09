package interfaces;

import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		System.out.println("What is the length of the rectangle?");
//		double l = input.nextDouble();
//		System.out.println("What is the height of the rectangle?");
//		double w = input.nextDouble();
//		Rectangle bob = new Rectangle(l, w);
//		Shape sob = bob;
//		System.out.println("What is the radius of the circle?");
//		Shape rob = new Circle(input.nextDouble());
//		System.out.println(bob.area());
//		System.out.println(bob.perimeter());
//		System.out.println(sob.area());
//		System.out.println(sob.perimeter());
//		System.out.println(rob.area());
//		System.out.println(rob.perimeter());
//		input.close();
		ArrayList<Shape> geo = new ArrayList<Shape>();
		for (int i = 0; i < 5; i++) {
			geo.add(new Rectangle(5 * Math.random(), 5 * Math.random()));
			geo.add(new Circle(5 * Math.random()));
		}
		double sum = 0;
		double sp = geo.get(0).perimeter();
		for (Shape temp : geo) {
			sum += temp.area();
			if (temp.perimeter() < sp)
				sp = temp.perimeter();
		}
		System.out.println("Total Area: " + sum);
		System.out.println("Smallest Perimeter: " + sp);
	}

}
