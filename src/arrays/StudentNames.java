package arrays;

import java.util.Scanner;
public class StudentNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] names = new String[687][2];
		for (int row = 0; row < names.length; row++) {
			System.out.println("Enter your name:");
			String name = input.nextLine();
			names[row][0] = name.substring(0, name.indexOf(' '));
			names[row][1] = name.substring(name.indexOf(' ') + 1);
		}
		input.close();
	}

}
