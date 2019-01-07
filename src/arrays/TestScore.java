package arrays;

import java.util.Scanner;
public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min = 200;
		int sum = 0;
		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("What is the integer test scores?");
			scores[i] = input.nextInt();
			sum += scores[i];
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("The highest score was: " + max);
		System.out.println("The lowest score was: " + min);
		System.out.println("The average was: " + (sum / scores.length));
		System.out.println("The test scores were: ");
		for (int j = 0; j < scores.length; j++)
			System.out.println(scores[j] + " @ " + (j + 1));
		input.close();
	}

}
