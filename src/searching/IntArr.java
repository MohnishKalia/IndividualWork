package searching;

import java.util.Random;
import java.util.Scanner;
public class IntArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int[] nums = new int[100];
		int min = 0;
		int max = 10000;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = min + gen.nextInt(max - min + 1);
		}
		System.out.println("Number Totals:");
		for (int i = 0; i < max; i++) {
			int count = 0;
			for (int temp : nums) {
				if (temp == i) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Number of times " + i + " has appeared: " + count);
			}
		}
		boolean flag = true;
		while (flag) {
			System.out.println("What is the integer you wish to search for?");
			int search = input.nextInt();
			boolean found = false;
			for (int temp : nums) {
				if (temp == search) {
					found = true;
				}
			}
			if (found)
				System.out.println("The integer was found!");
			else
				System.out.println("Not inside the array :(");
			System.out.println("Would you like to continue? T/F");
			flag = input.nextBoolean();

		}
		input.close();
	}

}
