package decisionStructures;

import java.util.Scanner;
public class PlanetWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight on Earth?");
		double weight = input.nextDouble();
		System.out.println("Choose a planet: \n" + "1. Mercury\r\n" + "2. Venus\r\n" + "3. Mars\r\n" + "4. Jupiter\r\n"
				+ "5. Saturn");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Your weight on Mercury is... " + weight * 0.37);
			break;
		case 2:
			System.out.println("Your weight on Venus is... " + weight * 0.88);
			break;
		case 3:
			System.out.println("Your weight on Mars is... " + weight * 0.38);
			break;
		case 4:
			System.out.println("Your weight on Jupiter is... " + weight * 2.64);
			break;
		case 5:
			System.out.println("Your weight on Saturn is... " + weight * 1.15);
			break;
		default:
			System.out.println("Invalid response, please try a different input! (1,2,3,4,5,)");
			break;
		}
		input.close();
	}

}
