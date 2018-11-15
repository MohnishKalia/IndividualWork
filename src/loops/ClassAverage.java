package loops;

import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students took the test?");
		int number = input.nextInt();
		double grade = 0;
		int count = number;
		double sum = 0;
		for (count = number; count > 0; count--) {
			System.out.println("What is the grade?");
			grade = input.nextDouble();
			sum += grade;
		}
		System.out.println("Class Average is: " + (sum / number));
		input.close();
	}

}
