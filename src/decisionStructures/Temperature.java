package decisionStructures;

import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature outside?");
		double temp = input.nextDouble();
		input.close();
		if (temp > 83) {
			System.out.println("Go swimming!");
		} else {
			if (temp > 74 && temp <= 83) {
				System.out.println("Go out and play tennis!");
			} else {
				if (temp > 35 && temp <= 74) {
					System.out.println("Go golfing!");
				} else {
					if (temp > -10 && temp <= 35) {
						System.out.println("Go snow shoeing!");
					} else {
						System.out.println("Yeah you arent doing anything today");
					}
				}
			}
		}
	}
}
