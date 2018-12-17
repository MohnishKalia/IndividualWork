package arrays;

import java.util.Scanner;
public class StudentTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		final int students = input.nextInt();
		System.out.println("How many tests have they taken?");
		final int tests = input.nextInt();
		double[][] gradeBook = new double[students][tests];
		for (int i = 0; i < students; i++) {
			System.out.println("Student " + (i + 1) + ":\n");
			for (int j = 0; j < tests; j++) {
				System.out.println("Input score for test " + (j + 1) + ":");
				gradeBook[i][j] = input.nextDouble();
			}
		}
		System.out.println("Test Averages per Student:/n");
		for (int i = 0; i < students; i++) {
			int localSum = 0;
			for (int j = 0; j < tests; j++) {
				localSum += gradeBook[i][j];
			}
			System.out.println("Student " + (i + 1) + ": " + localSum / tests);
		}
		System.out.println("Student Averages per Test:/n");
		for (int j = 0; j < students; j++) {
			int localSum = 0;
			for (int i = 0; i < tests; i++) {
				localSum += gradeBook[i][j];
			}
			System.out.println("Test " + (j + 1) + ": " + localSum / students);
		}
		System.out.println("Overall Average:/n");
		int localSum = 0;
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < tests; j++) {
				localSum += gradeBook[i][j];
			}
		}
		System.out.println("Full Tests Average: " + localSum / (tests * students));
		input.close();
	}

}
