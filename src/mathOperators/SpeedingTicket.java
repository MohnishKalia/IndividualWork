package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double driver = -93.0;
		double limit = -436.0;
		double ticket = -901;
		System.out.println("What is the speed limit?");
		limit = input.nextInt();
		System.out.println("What is the speed of the driver?");
		driver = input.nextInt();
		ticket = 55.0 + 40.0*(driver%limit);
		System.out.println("Your speed was: " + driver);
		System.out.println("The speed limit was: " + limit);
		System.out.println("The speeding ticket costs $" + ticket);
		input.close();
	}

}
