package decisionStructures;

import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double backArea = 0;
		System.out.println("What is the width of the front lawn?");
		double width = input.nextDouble();
		System.out.println("What is the length of the front lawn?");
		double length = input.nextDouble();
		System.out.println("Do you wish to cut the back lawn? true/false");
		boolean choice = input.nextBoolean();
		double frontArea = width * length;
		if (choice == true) {
			System.out.println("What is the radius of your back lawn?");
			double radius = input.nextDouble();
			backArea = Math.PI * radius * radius;
		}
		double money = (frontArea / 100) + 1.5 * (backArea / 75);
		System.out.println("You must pay $" + money + " for this lawn service");
		input.close();
	}

}
