package objectProgramming;

import java.util.Scanner;
public class HomeImprovement {
	public HomeImprovement() {

	}

	public void fill1() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the Sandbox (ft)?");
		double length = input.nextDouble();
		System.out.println("What is the width of the Sandbox (ft)?");
		double width = input.nextDouble();
		System.out.println("What is the height of the Sandbox (ft)?");
		double height = input.nextDouble();
		System.out.println("What is the rate at which sand can be transported at cubic feet/hour");
		double rate = input.nextDouble();
		double volume = width * length * height;
		double time = volume / rate;
		System.out.println("It will take " + time + " hours to fill the sandbox of volume " + volume + " cubic feet");
	}

	public void fill2(double volume, double rate) {
		double time = volume / rate;
		System.out.println("It will take " + time + " hours to fill the sandbox of volume " + volume + " cubic feet");
	}

	public double fill3(double volume, double rate) {
		double time = volume / rate;
		return time;
	}
}
