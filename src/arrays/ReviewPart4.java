package arrays;

import java.util.Scanner;
public class ReviewPart4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] classroom = new double[3][8];
		double sum = 0;
		for (int row = 0; row < classroom.length; row++) {
			for (int col = 0; col < classroom[0].length; col++) {
				System.out.println("What is the student's test score?");
				classroom[row][col] = input.nextDouble();
				sum += classroom[row][col];
			}
		}
		int count = 0;
		for (int row = 0; row < classroom.length; row++) {
			for (int col = 0; col < classroom[0].length; col++) {
				if (classroom[row][col] > sum / (classroom.length * classroom[0].length))
					count++;
			}
		}
		System.out.println(count + " students earned more than the class average");
		input.close();
	}

}
