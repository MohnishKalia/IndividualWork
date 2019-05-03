package arrays;

import java.util.Random;
import java.util.Scanner;
public class CrazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int min = 1;
		int max = 100;
		double[] prices = new double[25];
		for (int i = 0; i < prices.length; i++) {
			System.out.println("What is the price of an item in a store?");
			prices[i] = (min + gen.nextInt(max - min + 1)) * (input.nextDouble()) * (1 / 100);
		}
		System.out.println("New Prices:");
		for (int j = 0; j < prices.length; j++)
			System.out.println(prices[j]);
		input.close();
	}

}
