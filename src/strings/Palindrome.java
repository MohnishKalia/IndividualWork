package strings;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			boolean comp = true;
			System.out.println("What is your word?");
			String sen = input.nextLine();
			for (int i = 0; i < sen.length(); i++) {
				if (!(sen.charAt(i) == sen.charAt(sen.length() - i - 1))) {
					comp = false;
				}
			}
			if (comp == true) {
				System.out.println("This word is a palindrome");
			} else {
				System.out.println("This word is not a palindrome");
			}
			System.out.println("Would you like to continue? true/false");
			flag = input.nextBoolean();
			input.nextLine();
		}
		input.close();
	}

}
