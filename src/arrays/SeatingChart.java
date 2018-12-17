package arrays;

import java.util.Scanner;

public class SeatingChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in your class? (must be a multiple of 4)");
		final int students = input.nextInt();
		input.nextLine();

		String[][] seating = new String[students / 4][4];
		for (int i = 0; i < students / 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("What is the student's name? First Last");
				seating[i][j] = input.nextLine();
			}
		}

		System.out.println("First Initials:");
		for (int i = 0; i < students / 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(seating[i][j].charAt(0));
			}
		}

		// for longest string
		int maxLength = -2;
		String longest = "";
		// for longest string

		System.out.println("Name Lengths:");
		for (int i = 0; i < students / 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(seating[i][j].length());
				if (seating[i][j].length() > maxLength) {
					maxLength = seating[i][j].length();
					longest = seating[i][j];
				}
			}
		}

		System.out.println("Last Names:");
		for (int i = 0; i < students / 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(seating[i][j].substring(seating[i][j].indexOf(' ') + 1));
			}
		}

		System.out.println("First Names:");
		for (int i = 0; i < students / 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(seating[i][j].substring(0, seating[i][j].indexOf(' ')));
			}
		}

		System.out.println("Longest Name: " + longest);
		input.close();
	}

}
