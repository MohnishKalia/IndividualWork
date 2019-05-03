package arrays;

import java.util.Random;
import java.util.Scanner;
public class PracticeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int min = 7;
		int max = 852;
		int count = 0;
		int sum = 0;
		boolean flag;
		int[] randomInts = new int[100];
		for (int i = 0; i < randomInts.length; i++)
			randomInts[i] = min + gen.nextInt(max - min + 1);
		do {
			System.out.println("Select an integer roll.");
			int roll = input.nextInt();
			count++;
			sum += randomInts[roll];
			System.out.println("Roll: " + randomInts[roll]);
			System.out.println("Would you like to continue? true/false");
			flag = input.nextBoolean();
		} while (flag);
		System.out.println("The average of your selected values: " + (sum / count));
		input.close();
	}

}
