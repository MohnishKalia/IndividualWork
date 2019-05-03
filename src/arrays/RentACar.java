package arrays;

import java.util.Scanner;

import objectProgramming.Car;
public class RentACar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean flag;
		System.out.println("How many cars do you have?");
		Car[] rentals = new Car[input.nextInt()];
		for (int i = 0; i < rentals.length; i++) {
			System.out.println("---Car " + (i + 1) + "---");
			System.out.println("What is the mpg of the Car?");
			double xMPG = input.nextDouble();
			System.out.println("What is the fuel capacity of the Car?");
			double xCapacity = input.nextDouble();
			System.out.println("What is the current fuel of the Car?");
			double xFuel = input.nextDouble();
			System.out.println("What is the odometer of the Car?");
			double xOdometer = input.nextDouble();
			rentals[i] = new Car(xMPG, xCapacity, xFuel, xOdometer);
		}
		do {
			System.out.println("What car # would you like to audit?");
			int car = input.nextInt();
			System.out.println("What would you like to do:\n1. Add Gas\n2. Drive Car\n3. Display Mileage");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				rentals[car].fill();
				break;
			case 2:
				System.out.println("How long are you driving in miles?");
				rentals[car].drive(input.nextDouble());
				break;
			case 3:
				System.out.println(rentals[car].getMPG());
				break;
			default:
				break;
			}
			System.out.println("Would you like to continue?");
			flag = input.nextBoolean();
		} while (flag);
		input.close();
	}

}
