package strings;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Age?");
		int age = input.nextInt();
		System.out.println("Full Name?");
		input.nextLine();
		String name = input.nextLine();
		System.out.println(age);
		System.out.println(name);
		input.close();
	}

}
