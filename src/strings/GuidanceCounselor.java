package strings;

import java.util.Scanner;

public class GuidanceCounselor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String op1 = " - Mr. Williams";
		String op2 = " - Mrs. Smith";
		String op3 = " - Mrs. Johnson";
		String op4 = " - Mr. Bond";
		boolean flag = true;
		while (flag) {
			System.out.println("What is your last name?");
			String name = input.nextLine();
			String nameU = name.toUpperCase();
			/*
			if (nameU.charAt(0) >= 'A' && nameU.charAt(0) <= 'Z') {
				if (nameU.charAt(0) >= 'A' && nameU.charAt(0) <= 'G') {
					System.out.println(name + op1);
				} else {
					if (nameU.charAt(0) > 'H' && nameU.charAt(0) >= 'N') {
						System.out.println(name + op2);
					} else {
						if (nameU.charAt(0) > 'O' && nameU.charAt(0) <= 'S' && nameU.charAt(1) <= 'T') {
							System.out.println(name + op3);
						} else {
							System.out.println(name + op4);
						}
					}
				}
			}
			*/
			System.out.println("Would you like to continue inputting? true/false");
			flag = input.nextBoolean();
			input.nextLine();
		}
		input.close();
	}
}
