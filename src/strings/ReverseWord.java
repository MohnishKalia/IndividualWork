package strings;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		// write for every character in the sentence
		for (int i = 0; cont;) {
			String full = sen.substring(i);
			// creates a string from a beginning index
			// (used to "truncate words" that are already reversed)
			int endline = 0;
			if (full.contains(" ")) {
				endline = full.indexOf(32);
				// endline tells where to stop the word by using the space character (32)
			} else {
				endline = full.length() - 1;
				cont = false;
				// if you reached the end of the sentence with no more spaces, there are no more
				// words in the sentence, so stop the loop
			}
			String sub = full.substring(0, endline);
			// creates a separate string that encapsulates a single word without punctuation
			// or space
			for (int j = 0; j < sub.length(); j++) {
				System.out.print(sub.charAt(sub.length() - j - 1));
			}
			// prints out a single word backwards
			if (full.contains(" ")) {
				System.out.print(" ");
			} else {
				System.out.print(full.charAt(full.length() - 1));
			}
			// if the word had a space, put a space at the end, else put whatever
			// punctuation it had
			i += full.indexOf(32) + 1;
			// set the beginning index in order to "truncate" the now reversed word in the
			// next loop
		}
		input.close();
	}

}
