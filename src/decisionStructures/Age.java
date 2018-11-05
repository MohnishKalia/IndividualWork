package decisionStructures;

import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 16;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("Are you 16 years old?");
		System.out.println(age == 16);
		input.close();
	}

}
