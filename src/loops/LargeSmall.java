package loops;

import java.util.Scanner;
public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		double sum = 0;
		double score = 0;
		double low = 999;
		double high = 0;
		System.out.println("Input a test score. (9999 to terminate)");
		score = input.nextDouble();
		while (score != 9999) {
			if (score < low) {
				low = score;
			}
			if (score > high) {
				high = score;
			}
			if (score >= 70) {
				sum += score;
				count++;
			}
			System.out.println("Input a test score. (9999 to terminate)");
			score = input.nextDouble();
		}
		System.out.println("Largest Test Score: " + high);
		System.out.println("Smallest Test Score: " + low);
		System.out.println("Sum of Test Scores: " + sum);
		System.out.println("Average of Test Scores: " + sum / count);
		input.close();
	}

}
