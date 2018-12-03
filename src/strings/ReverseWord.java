package strings;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		for (int i = 0; cont;) {
			String full = sen.substring(i);
			int endline = 0;
			if (full.contains(" ")) {
				endline = full.indexOf(32);
			} else {
				endline = full.length() - 1;
				cont = false;
			}
			String sub = full.substring(0, endline);
			for (int j = 0; j < sub.length(); j++) {
				System.out.print(sub.charAt(sub.length() - j - 1));
			}
			if (full.contains(" ")) {
				System.out.print(" ");
			} else {
				System.out.print(full.charAt(full.length() - 1));
			}
			i += full.indexOf(32) + 1;
		}
		input.close();
	}

}
