package strings;

import java.util.Scanner;
public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your sentence?");
		String sen = input.nextLine();
		String senL = sen.toLowerCase();
		System.out.println(senL);
		System.out.println(sen);
		input.close();
	}

}
