package arrays;

import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[25000];
		for (int i = 0; i < 25000; i++) {
			System.out.println("Input a test score.");
			scores[i] = input.nextDouble();
		}
		for (int j = 25000 - 1; j >= 0; j--) {
			System.out.print(scores[j] + " ");
		}
		input.close();
	}

}
