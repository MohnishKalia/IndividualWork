package arrays;

import java.util.Scanner;
public class FullNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] names = new String[4][3];
		for (int row = 0; row < names.length; row++) {
			for (int col = 0; col < names[0].length; col++) {
				System.out.println("What is your name?");
				names[row][col] = input.nextLine();
			}
		}
		for (int col = 0; col < names[0].length; col++) {
			for (int row = 0; row < names.length; row++) {
				System.out.print(names[row][col].substring(names[row][col].indexOf(' ') + 1) + " ");
			}
			System.out.println("");
		}
		input.close();
	}

}
