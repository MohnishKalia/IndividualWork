package strings;

import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		System.out.println("What is your first word?");
		String w1 = input.nextLine();
		String num1 = w1.substring(0, 1);

		System.out.println("What is your second word?");
		String w2 = input.nextLine();
		String num2 = w2.substring(w2.length() - 1, w2.length());

		System.out.println("What is your third word?");
		String w3 = input.nextLine();
		int random = gen.nextInt(w3.length());
		String num3 = w3.substring(random, random + 1);

		String pass = num1 + num2 + num3 + gen.nextInt(10) + gen.nextInt(10) + gen.nextInt(10);

		System.out.println("Your password is: " + pass);
		input.close();
	}

}
