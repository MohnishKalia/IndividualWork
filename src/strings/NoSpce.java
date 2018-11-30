package strings;

import java.util.Scanner;
public class NoSpce {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		for (int i = 0; i < sen.length(); i++) {
			if (!(sen.charAt(i) == 'a' || sen.charAt(i) == ' ')) {
				System.out.print(sen.charAt(i));
			}
		}

		input.close();
	}
}
