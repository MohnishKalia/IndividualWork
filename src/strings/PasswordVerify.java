package strings;

import java.util.Scanner;
public class PasswordVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your password?");
		String pass = input.nextLine();
		boolean flag = false;
		do {
			System.out.println("Verify your password.");
			String ver = input.nextLine();
			if (pass.compareTo(ver) == 0) {
				flag = true;
			}
		} while (!(flag));
		System.out.println("Password Verified.");
		input.close();
	}

}
