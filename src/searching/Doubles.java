package searching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Doubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		ArrayList<Double> scores = new ArrayList<Double>();
		for (int i = 0; i < 1000; i++) {
			scores.add(499 * gen.nextDouble());
		}
		System.out.println("What double would you like to search for?");
		double search = input.nextDouble();
		int count = 0;
		for (double temp : scores) {
			if (Math.abs(temp - search) <= 1e-14)
				count++;
		}
		System.out.println(search + " is in the ArrayList " + count + " times.");
		input.close();
	}

}
