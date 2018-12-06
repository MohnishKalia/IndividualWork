package strings;

import java.util.Scanner;
public class FourthLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		for (int i = 0; i < sen.length(); i += 4) {
			System.out.println(sen.charAt(i));
		}
		input.close();
	}

}
