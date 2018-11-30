package strings;

import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your SSN? (no dashes)");
		String ssn = input.nextLine();
		System.out.println(ssn.substring(5));
		System.out.println(ssn.substring(3, 5));
		System.out.println(ssn.substring(0, 3));
		input.close();
	}

}
