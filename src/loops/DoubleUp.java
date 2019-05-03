package loops;

import java.util.Scanner;
public class DoubleUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your integer?");
		int choice = input.nextInt();
		while (choice != 9999) {
			choice *= 2;
			System.out.println(choice);
			System.out.println("What is your integer?");
			choice = input.nextInt();
		}
		input.close();
	}

}
