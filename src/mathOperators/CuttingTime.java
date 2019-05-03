package mathOperators;

import java.util.Scanner;

public class CuttingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double mower;
		double area;
		double cost;
		double speed;
		double hours;
		final double pay = 12.0;
		System.out.println("What is the width of the lawn in feet?");
		width = input.nextDouble();
		System.out.println("What is the length of the lawn in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the mower deck in inches?");
		mower = (input.nextDouble()/12.0);
		System.out.println("What is the speed of the mower in mi/hr?");
		speed = 5280.0*input.nextDouble();
		area = length*width;
		hours = length/speed;
		cost = (area/(mower*length))*hours*pay;
		System.out.println("For " + area + " square feet of lawn, the cost is $" + cost + " for " + hours + " hours of mowing.");
		input.close();
	}

}
