package strings;

import java.util.Scanner;
public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Essay bob = new Essay();
		System.out.println("What is your name?");
		bob.setName(input.nextLine());
		System.out.println("Type in your essay.");
		bob.setText(input.nextLine());
		System.out.println("Your last name is: " + bob.capitalLastName());
		System.out.println("The number of characters in your first name is: " + bob.charInFirstName());
		System.out.println("The author contains the letter X: " + bob.containsX());
		System.out.println("There are this many words in the essay: " + bob.wordCount());
		input.close();
	}

}
