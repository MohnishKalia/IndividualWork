package loops;

import java.util.Scanner;
public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double cost = 0;
		System.out.println("How many items did you buy?");
		int items = input.nextInt();
		for (int j = items; j > 0; j--) {
			System.out.println("How much did the item cost?");
			cost += input.nextDouble();
		}
		System.out.println("The total cost was: " + cost);
		System.out.println("The cost of tax was: " + cost * 0.05);
		System.out.println("The total cost w/tax was: " + cost * 1.05);
		input.close();
	}

}
