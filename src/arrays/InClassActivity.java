package arrays;

import java.util.Random;
import java.util.Scanner;
public class InClassActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		int min = 1;
		int max = 100;
		int sum = 0;
		int[][] nums = new int[7][3];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = min + gen.nextInt(max - min + 1);
				sum += nums[i][j];
			}
		}
		System.out.println("Total Array Sum: " + sum);
		input.close();
	}

}
