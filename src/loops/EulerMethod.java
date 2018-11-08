package loops;

import java.util.Scanner;
public class EulerMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double c1 = 0;
		double c2 = 0;
		double uBound = 0;
		double partX = 0;
		double partY = 0;
		double step = 0;

		System.out.println("Choose an equation: dy/dx=?");
		System.out.println("1. c1*x + c2*y");
		System.out.println("2. c1*e^x + c2*e^y");
		System.out.println("3. c1*xy + c2");
		System.out.println("4. c1*xy + c2*x");
		System.out.println("5. c1*xy + c2*y");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("What is c1?");
			c1 = input.nextDouble();
			System.out.println("What is c2?");
			c2 = input.nextDouble();
			System.out.println("Selected Equation: dy/dx = " + c1 + "x + " + c2 + "y");
			System.out.println("What is the target x-value?");
			uBound = input.nextDouble();
			System.out.println("Initial Conditions:");
			System.out.println("y(x) = c; x =");
			partX = input.nextDouble();
			System.out.println("y(x) = c; c =");
			partY = input.nextDouble();
			System.out.println("What is your step size?");
			step = input.nextDouble();
			System.out.println("x   " + "y");
			while (x <= uBound) {
				System.out.println(Math.round(x) + " " + Math.round(y));
				y = partY;
				x = partX;
				y = partY + step * (c1 * x + c2 * y);
				x += step;
				partY = y;
				partX = x;
			}
			break;

		case 2:
			break;

		case 3:
			System.out.println("What is c1?");
			c1 = input.nextDouble();
			System.out.println("What is c2?");
			c2 = input.nextDouble();
			System.out.println("Selected Equation: dy/dx = " + c1 + "xy + " + c2);
			System.out.println("What is the target x-value?");
			uBound = input.nextDouble();
			System.out.println("Initial Conditions:");
			System.out.println("y(x) = c; x =");
			partX = input.nextDouble();
			System.out.println("y(x) = c; c =");
			partY = input.nextDouble();
			System.out.println("What is your step size?");
			step = input.nextDouble();
			System.out.println("x   " + "y");
			while (x <= uBound) {
				System.out.println(Math.round(x) + " " + Math.round(y));
				y = partY;
				x = partX;
				y = partY + step * (c1 * x * y + c2);
				x += step;
				partY = y;
				partX = x;
			}
			break;
		case 4:
			System.out.println("What is c1?");
			c1 = input.nextDouble();
			System.out.println("What is c2?");
			c2 = input.nextDouble();
			System.out.println("Selected Equation: dy/dx = " + c1 + "xy + " + c2 + "x");
			System.out.println("What is the target x-value?");
			uBound = input.nextDouble();
			System.out.println("Initial Conditions:");
			System.out.println("y(x) = c; x =");
			partX = input.nextDouble();
			System.out.println("y(x) = c; c =");
			partY = input.nextDouble();
			System.out.println("What is your step size?");
			step = input.nextDouble();
			System.out.println("x   " + "y");
			while (x <= uBound) {
				System.out.println(Math.round(x) + " " + Math.round(y));
				y = partY;
				x = partX;
				y = partY + step * (c1 * x * y + c2 * x);
				x += step;
				partY = y;
				partX = x;
			}
			break;
		case 5:
			System.out.println("What is c1?");
			c1 = input.nextDouble();
			System.out.println("What is c2?");
			c2 = input.nextDouble();
			System.out.println("Selected Equation: dy/dx = " + c1 + "xy + " + c2 + "y");
			System.out.println("What is the target x-value?");
			uBound = input.nextDouble();
			System.out.println("Initial Conditions:");
			System.out.println("y(x) = c; x =");
			partX = input.nextDouble();
			System.out.println("y(x) = c; c =");
			partY = input.nextDouble();
			System.out.println("What is your step size?");
			step = input.nextDouble();
			System.out.println("x   " + "y");
			while (x <= uBound) {
				System.out.println(Math.round(x) + " " + Math.round(y));
				y = partY;
				x = partX;
				y = partY + step * (c1 * x * y + c2 * y);
				x += step;
				partY = y;
				partX = x;
			}
			break;

		default:
			System.out.println("Try another option!");
			break;
		}
		input.close();
	}
}
