package arrays;

import java.util.Scanner;

public class TestMallSanta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating the array
		Scanner input = new Scanner(System.in);
		MallSanta[] employ = new MallSanta[100000];
		// input for each mall santa
		for (int i = 0; i < employ.length; i++) {
			System.out.println("What is the name of the Mall Santa?");
			String name = input.nextLine();
			System.out.println("What is the age?");
			int age = input.nextInt();
			System.out.println("Does the Santa have a criminal record? true/false");
			boolean rec = input.nextBoolean();
			employ[i] = new MallSanta(name, age, rec);
			input.nextLine();
		}
		System.out.println("These are the employable Mall Santas:");
		// if the predicate method returns true, then sysout the name
		for (int j = 0; j < employ.length; j++) {
			if (employ[j].employable()) {
				System.out.println(employ[j].getName());
			}
		}
		input.close();
	}

}
