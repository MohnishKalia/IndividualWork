package objectProgramming;

import java.util.Scanner;
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car kidCar = new Car();
		Car dadsCar = new Car();
		Car momsCar = new Car();
		Scanner input = new Scanner(System.in);

		dadsCar.drive(9.53);
		momsCar.drive(0.4);
		momsCar.fill();
		kidCar.drive(3.87);
		dadsCar.drive(1.56);
		dadsCar.fill();

		System.out
				.println("Dad's Car: " + dadsCar.getFuel() + " gallons left, " + dadsCar.getOdo() + " miles traveled");
		System.out
				.println("Mom's Car: " + momsCar.getFuel() + " gallons left, " + momsCar.getOdo() + " miles traveled");
		System.out.println("Kids' Car: " + kidCar.getOdo() / kidCar.getMPG() + " gallons left, " + kidCar.getOdo()
				+ " miles traveled");

		input.close();
	}

}
