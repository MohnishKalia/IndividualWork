package arrays;

import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int min = 1;
		int max = 100;
		boolean flag = true;
		int[] nums = new int[10000];
		for (int i = 0; i < nums.length; i++)
			nums[i] = min + gen.nextInt(max - min + 1);
		while (flag) {
			System.out.println("Name an integer from 1 to 100.");
			int target = input.nextInt();
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target) {
					System.out.println(nums[i] + " @roll " + (i + 1));
				}
			}
			System.out.println("Would you like to continue? true/false");
			flag = input.nextBoolean();
		}
		input.close();
	}

}
