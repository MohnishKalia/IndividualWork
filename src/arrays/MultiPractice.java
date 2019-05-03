package arrays;

import java.util.Scanner;

public class MultiPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are there in the class?");
		String[][] names = new String[input.nextInt()][2];
		input.nextLine();
		int sum = 0;
		for (int row = 0; row < names.length; row++) {
			System.out.println("Student: " + (row + 1));
			System.out.println("What is the student's name?");
			String dec = input.nextLine();
			names[row][0] = dec.substring(0, dec.indexOf(' '));
			names[row][1] = dec.substring(dec.indexOf(' ') + 1);
			sum += names[row][0].length();
		}
		System.out.println("Average length of first names: " + (double) sum / names.length);
		for (int row = 0; row < names.length; row++)
			System.out.println(names[row][1] + ", " + names[row][0]);

		input.close();
	}

}
