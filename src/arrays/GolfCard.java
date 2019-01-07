package arrays;

import java.util.Random;
import java.util.Scanner;
public class GolfCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		final int min = 1;
		final int max = 7;
		int lowest = 7 * 18;
		int lowestP = -999;
		int hioCount = 0;
		int[][] scores = new int[13][18];
		for (int col = 0; col < scores[0].length; col++) {
			for (int row = 0; row < scores.length; row++) {
				scores[row][col] = min + gen.nextInt(max - min + 1);
				if (scores[row][col] == 1)
					hioCount++;
			}
		}
		for (int row = 0; row < scores.length; row++) {
			int sum = 0;
			for (int col = 0; col < scores[0].length; col++)
				sum += scores[row][col];
			if (sum < lowest) {
				lowest = sum;
				lowestP = row;
			}
		}
		System.out.println("There are " + hioCount + " hole in ones on the card");
		System.out.println("The best score was " + lowest + " for player " + (lowestP + 1));
		input.close();
	}

}
