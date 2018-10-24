package objectProgramming;

import java.util.Scanner;
public class TestHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeImprovement bob = new HomeImprovement();
		Scanner input = new Scanner(System.in);
		bob.fill1();
		System.out.println("What is the length of the Sandbox (ft)?");
		double length = input.nextDouble();
		System.out.println("What is the width of the Sandbox (ft)?");
		double width = input.nextDouble();
		System.out.println("What is the height of the Sandbox (ft)?");
		double height = input.nextDouble();
		System.out.println("What is the rate at which sand can be transported at cubic feet/hour");
		double rate = input.nextDouble();
		double volume = length * width * height;
		bob.fill2(volume, rate);
		double time = bob.fill3(volume, rate);
		System.out.println("It will take " + time + " hours");
	}

}
