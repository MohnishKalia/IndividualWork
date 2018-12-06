package strings;

import java.util.Scanner;
public class CharLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		int length = sen.length();
		for (int i = 0; i < length; i++) {
			System.out.println(sen.charAt(i));
		}
		input.close();
	}

}
