package mathOperators;
import java.util.Scanner;
public class CostPerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double distance = -93.0;
		double fuelEco = -436.0;
		double gasMoney = -901.4;
		double gallons = -803.2;
		double avgMoney = -803.2;
		System.out.println("What is the distance traveled in miles?");
		distance = input.nextInt();
		System.out.println("What is fuel economy in miles/gallons?");
		fuelEco = input.nextInt();
		System.out.println("How much was spent on gas in USD?");
		gasMoney = input.nextInt();
		gallons = distance/fuelEco;
		avgMoney = gasMoney/gallons;
		System.out.println("Your total distance was: " + distance);
		System.out.println("The amount of gallons used was: " + gallons);
		System.out.println("The total amount of money spent on gas was: $" + gasMoney);
		System.out.println("The average cost per gallon of gas was: $" + avgMoney);
		input.close();
	}

}
