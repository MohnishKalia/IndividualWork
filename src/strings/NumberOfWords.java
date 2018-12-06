package strings;

import java.util.Scanner;
public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
			int word = 0;
			boolean cont = true;
			for (int i = 0; cont;) {
				String full = sen.substring(i);
				int endline = 0;
				if (full.contains(" ")) {
					endline = full.indexOf(32);
				} else {
					endline = full.length();
					cont = false;
				}
				String sub = full.substring(0, endline);
				System.out.println(sub);
				word++;
				i += full.indexOf(32) + 1;
			}
			System.out.println("There are " + word + " words in the sentence");
			System.out.println("Would you like to continue? true/false");
			flag = input.nextBoolean();
			input.nextLine();
		}
		input.close();
	}

}
