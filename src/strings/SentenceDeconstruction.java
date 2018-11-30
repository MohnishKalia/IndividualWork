package strings;

import java.util.Scanner;
public class SentenceDeconstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sentence1 = input.nextLine();
		System.out.println("What is your second sentence?");
		String sentence2 = input.nextLine();
		System.out.println(sentence1.charAt(0));
		System.out.println(sentence1.charAt(2));
		System.out.println(sentence1);
		System.out.println(sentence1.contains("co"));
		System.out.println(sentence1.compareToIgnoreCase(sentence2));
		input.close();
	}

}
