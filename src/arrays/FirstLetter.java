package arrays;

import java.util.Scanner;
public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		String[] words = sen.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));
		}
		System.out.println("What is your key word for the search?");
		String key = input.nextLine();
		for (int j = 0; j < words.length; j++) {
			if (key.compareToIgnoreCase(words[j]) == 0)
				count++;
		}
		System.out.println("The keyword showed up " + count + " times.");
		input.close();
	}

}
