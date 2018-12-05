package strings;

import java.util.Scanner;
public class StringAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Password bob = new Password();
		boolean flag1 = false;
		boolean flag2 = false;
		int validTry = 0;
		int verifTry = 0;
		while (!(flag1)) {
			System.out.println("Please enter a new password in the format Last Name:Password");
			String pace = input.nextLine();
			flag1 = bob.setPass(pace.substring(pace.indexOf(":") + 1));
			if (flag1 == false) {
				System.out.println("Invalid password.");
			}
			validTry++;
		}
		while (!(flag2)) {
			System.out.println("Please confirm the password.");
			String attem = input.nextLine();
			flag2 = bob.match(attem);
			if (flag2 == false) {
				System.out.println("Incorrect.");
			}
			verifTry++;
		}
		System.out.println("It took " + validTry + " times to enter a valid password.");
		System.out.println("It took " + verifTry + " times to confirm the password.");
		input.close();
	}

}
