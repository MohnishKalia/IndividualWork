package arrays;

import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Input a test score.");
			scores[i] = input.nextDouble();
		}
		for (int j = 4; j >= 0; j--) {
			System.out.print(scores[j] + " ");
		}
		input.close();
	}

}
